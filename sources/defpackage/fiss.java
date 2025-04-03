package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fiss implements Serializable {
    private static final long serialVersionUID = -6212696554273812441L;
    private transient firk a;

    public fiss(firk firkVar) {
        this.a = firkVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.a = (firk) objectInputStream.readObject();
    }

    private Object readResolve() {
        return fist.O(this.a);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.a);
    }
}
