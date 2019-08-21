import { Component, OnInit } from '@angular/core';
import {UsersService} from '../shared/users/users.service';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {

 users: Array<any>;

  constructor(private userService: UsersService) { }

  ngOnInit() {
    this.userService.getAll().subscribe((data) => {
      this.users = data;
    });
  }

}
