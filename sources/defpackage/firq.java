package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class firq extends fisy {
    private static final long serialVersionUID = -4481126543819298617L;
    public firr a;
    public fird b;

    public firq(firr firrVar, fird firdVar) {
        this.a = firrVar;
        this.b = firdVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.a = (firr) objectInputStream.readObject();
        this.b = ((firf) objectInputStream.readObject()).a(this.a.b);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.a);
        objectOutputStream.writeObject(this.b.p());
    }

    @Override // defpackage.fisy
    protected final long a() {
        return this.a.a;
    }

    @Override // defpackage.fisy
    protected final firb b() {
        return this.a.b;
    }

    @Override // defpackage.fisy
    public final fird c() {
        return this.b;
    }
}
