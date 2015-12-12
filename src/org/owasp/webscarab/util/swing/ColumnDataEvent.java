/***********************************************************************
 *
 * $CVSHeader$
 *
 * This file is part of WebScarab, an Open Web Application Security
 * Project utility. For details, please see http://www.owasp.org/
 *
 * Copyright (c) 2002 - 2004 Rogan Dawes
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * Getting Source
 * ==============
 *
 * Source for this application is maintained at Sourceforge.net, a
 * repository for free software projects.
 * 
 * For details, please see http://www.sourceforge.net/projects/owasp
 *
 */

/*
 * ColumnDataEvent.java
 *
 * Created on 06 December 2004, 05:23
 */

package org.owasp.webscarab.util.swing;

import java.util.EventObject;

/**
 *
 * @author  rogan
 */
public class ColumnDataEvent<T> extends EventObject {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 6956119410115383747L;
	private T _key;
    
    /** Creates a new instance of ColumnDataEvent */
    public ColumnDataEvent(Object source, T key) {
        super(source);
        _key = key;
    }
    
    public T getKey() {
        return _key;
    }
    
}
