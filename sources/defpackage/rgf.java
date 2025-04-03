package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rgf {
    final Class a;
    final Class b;
    final rge c;

    public rgf(Class cls, Class cls2, rge rgeVar) {
        this.a = cls;
        this.b = cls2;
        this.c = rgeVar;
    }

    public final boolean a(Class cls, Class cls2) {
        return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.b);
    }
}
