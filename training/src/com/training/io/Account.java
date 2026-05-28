package com.training.io;

import java.io.Serializable;

public class Account implements Serializable 
{
  Integer id;
  String name;
public Account(Integer id, String name) {
	super();
	this.id = id;
	this.name = name;
}
  
}
