package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class awrj {
    public static awri c() {
        awnt awntVar = new awnt();
        awntVar.b(0);
        return awntVar;
    }

    protected abstract int a();

    public abstract awxk b();

    public final awri d() {
        awri c = c();
        c.b(a());
        c.c(b());
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final awul e() {
        awxk b = b();
        return (awul) b.o.get(a());
    }
}
