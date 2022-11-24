package com.atguigu.pojo;

/**
 * @ClassName : Tool
 * @Description : 玩具实体类
 * @Author : 20609
 * @Date: 2022/11/22  16:29
 */
public class Tool {
    private String toolName;
    private Double toolPrice;

    public Tool() {
    }

    public Tool(String toolName, Double toolPrice) {
        this.toolName = toolName;
        this.toolPrice = toolPrice;
    }

    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public Double getToolPrice() {
        return toolPrice;
    }

    public void setToolPrice(Double toolPrice) {
        this.toolPrice = toolPrice;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "toolName='" + toolName + '\'' +
                ", toolPrice=" + toolPrice +
                '}';
    }
}
