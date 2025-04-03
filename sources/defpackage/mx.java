package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mx extends my {
    final my a;
    public final mm b;

    public mx(my myVar) {
        this.a = myVar;
        this.b = new mm(myVar);
    }

    @Override // defpackage.my, defpackage.mw
    public final void a(int i, int i2, Object obj) {
        this.b.a(i, i2, obj);
    }

    @Override // defpackage.mw
    public final void b(int i, int i2) {
        this.b.b(i, i2);
    }

    @Override // defpackage.mw
    public final void c(int i, int i2) {
        this.b.c(i, i2);
    }

    @Override // defpackage.my, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Override // defpackage.mw
    public final void d(int i, int i2) {
        this.b.d(i, i2);
    }

    @Override // defpackage.my
    public final boolean e(Object obj, Object obj2) {
        return this.a.e(obj, obj2);
    }

    @Override // defpackage.my
    public final boolean f(Object obj, Object obj2) {
        return this.a.f(obj, obj2);
    }

    @Override // defpackage.my
    public final void g(Object obj, Object obj2) {
        this.a.g(obj, obj2);
    }
}
