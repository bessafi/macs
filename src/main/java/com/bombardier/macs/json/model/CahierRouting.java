package com.bombardier.macs.json.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

public class CahierRouting   {
 
  private List<Drawing> drawings = null;

  
  private List<Tool> tools = null;

  public CahierRouting drawings(List<Drawing> drawings) {
    this.drawings = drawings;
    return this;
  }

  public CahierRouting addDrawingsItem(Drawing drawingsItem) {
    if (this.drawings == null) {
      this.drawings = new ArrayList<Drawing>();
    }
    this.drawings.add(drawingsItem);
    return this;
  }

  

  public List<Drawing> getDrawings() {
    return drawings;
  }

  public void setDrawings(List<Drawing> drawings) {
    this.drawings = drawings;
  }

  public CahierRouting tools(List<Tool> tools) {
    this.tools = tools;
    return this;
  }

  public CahierRouting addToolsItem(Tool toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<Tool>();
    }
    this.tools.add(toolsItem);
    return this;
  }

  
  public List<Tool> getTools() {
    return tools;
  }

  public void setTools(List<Tool> tools) {
    this.tools = tools;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CahierRouting cahierRouting = (CahierRouting) o;
    return Objects.equals(this.drawings, cahierRouting.drawings) &&
        Objects.equals(this.tools, cahierRouting.tools);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drawings, tools);
  }



}

