package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfr extends kgp {
    public final Object a;
    public final kfu b;
    public final kft c;
    public final kfu d;
    public final kft e;

    public kfr(Object obj) {
        this.a = obj;
        this.b = new kfu(obj, -2, this);
        this.c = new kft(obj, 0, this);
        this.d = new kfu(obj, -1, this);
        this.e = new kft(obj, 1, this);
    }

    @Override // defpackage.kgp
    public final Object a() {
        return this.a;
    }
}
