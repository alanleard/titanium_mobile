/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */
package ti.modules.titanium.ui;

import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiC;
import org.appcelerator.titanium.TiContext;
import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.view.TiUIView;

import ti.modules.titanium.ui.widget.TiUIText;
import android.app.Activity;

@Kroll.proxy(creatableInModule=UIModule.class)
public class TextAreaProxy extends TiViewProxy
{
	public TextAreaProxy(TiContext tiContext)
	{
		super(tiContext);

		setProperty(TiC.PROPERTY_VALUE, "");
	}

	@Override
	public TiUIView createView(Activity activity)
	{
		return new TiUIText(this, false);
	}
}
