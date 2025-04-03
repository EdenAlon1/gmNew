package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rht {
    final Class a;
    final qtw b;
    private final Class c;

    public rht(Class cls, Class cls2, qtw qtwVar) {
        this.c = cls;
        this.a = cls2;
        this.b = qtwVar;
    }

    public final boolean a(Class cls, Class cls2) {
        return this.c.isAssignableFrom(cls) && cls2.isAssignableFrom(this.a);
    }
}
