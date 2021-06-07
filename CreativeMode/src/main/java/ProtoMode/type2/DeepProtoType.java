package ProtoMode.type2;

import ProtoMode.type3.DeepCloneableTarget;

import java.io.*;

public class DeepProtoType implements Serializable, Cloneable {

    public String name; //String 属 性
    public ProtoMode.type3.DeepCloneableTarget deepCloneableTarget;// 引用类型

    public DeepProtoType() {
        super();
    }

    @Override
    protected Object clone()  {
        DeepProtoType type = null;
        try {
            type = (DeepProtoType)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return type;
    }
}



