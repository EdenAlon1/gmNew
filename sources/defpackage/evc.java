package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evc {
    public final dwn a;
    public final hjz b = new hhy(0);

    public evc(dwn dwnVar) {
        this.a = dwnVar;
    }

    public final boolean a() {
        return (this.b.c() & 1) != 0;
    }

    public final boolean b() {
        return (this.b.c() & 2) != 0;
    }

    public final boolean c() {
        return (this.b.c() & 4) != 0;
    }
}
