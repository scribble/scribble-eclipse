/*
 * generated by Xtext
 */
package org.scribble.editor.dsl.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.scribble.editor.tools.logger.EclipseIssueLogger;

/**
 * Use this class to register components to be used within the IDE.
 */
public class ScribbleDslUiModule extends org.scribble.editor.dsl.ui.AbstractScribbleDslUiModule {
	public ScribbleDslUiModule(AbstractUIPlugin plugin) {
		super(plugin);
		
		// Trigger the tools plugin
		EclipseIssueLogger logger=new EclipseIssueLogger(null);
	}
}