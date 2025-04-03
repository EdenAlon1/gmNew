package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class enkv implements enlb {
    final Object a;
    final int b;

    public enkv(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    @Override // defpackage.enlb
    public final int a() {
        return this.b;
    }

    @Override // defpackage.enlb
    public enlb b() {
        return null;
    }

    @Override // defpackage.enlb
    public final Object c() {
        return this.a;
    }
}
