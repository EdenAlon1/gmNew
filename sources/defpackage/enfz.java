package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enfz extends enga {
    private static final long serialVersionUID = 0;
    transient int c;

    public enfz() {
        this(12, 2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = 2;
        int readInt = objectInputStream.readInt();
        r(new ened(12));
        enpi.b(this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        enpi.c(this, objectOutputStream);
    }

    @Override // defpackage.encs, defpackage.encd
    public final /* bridge */ /* synthetic */ Collection a() {
        return new enef(this.c);
    }

    public enfz(int i, int i2) {
        super(new ened(i));
        this.c = 2;
        emxf.a(true);
        this.c = i2;
    }
}
