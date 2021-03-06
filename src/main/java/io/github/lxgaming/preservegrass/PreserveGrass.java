/*
 * Copyright 2017 Alex Thomson
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.lxgaming.preservegrass;

import org.bukkit.plugin.java.JavaPlugin;

import io.github.lxgaming.preservegrass.listeners.PreserveGrassListener;

public class PreserveGrass extends JavaPlugin {
	
	private static PreserveGrass instance;
	
	@Override
	public void onEnable() {
		instance = this;
		this.getServer().getPluginManager().registerEvents(new PreserveGrassListener(), this);
		getLogger().info("PreserveGrass has started!");
	}
	
	@Override
	public void onDisable() {
		instance = null;
		getLogger().info("PreserveGrass has stopped!");
	}
	
	public static PreserveGrass getInstance() {
		return instance;
	}
}
