package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpf {
    public final Object a;
    public final Object b;

    public hpf(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final hpf a(Object obj) {
        return new hpf(this.a, obj);
    }

    public final boolean b() {
        return this.b != hpj.a;
    }

    public final boolean c() {
        return this.a != hpj.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public hpf() {
        /*
            r1 = this;
            hpj r0 = defpackage.hpj.a
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hpf.<init>():void");
    }
}
