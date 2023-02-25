package com.driver.controllers;

import com.driver.model.Admin;

import com.driver.model.Customer;
import com.driver.model.Driver;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

	private Admin updatedAdmin;
	private List<Customer> listOfCustomers;
	private List<Driver> listOfDrivers;

	@PostMapping("/register")
	public ResponseEntity<Void> registerAdmin(@RequestBody Admin admin){
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Admin> updateAdminPassword(@RequestParam Integer adminId, @RequestParam String password){
		return new ResponseEntity<>(updatedAdmin, HttpStatus.OK);
	}

	@DeleteMapping("/delete")
	public void deleteAdmin(@RequestParam Integer adminId){
	}

	@GetMapping("/listOfCustomers")
	public List<Customer> listOfCustomers() {
		return listOfCustomers;
	}

	@GetMapping("/listOfDrivers")
	public List<Driver> listOfDrivers() {
		return listOfDrivers;
	}
}
