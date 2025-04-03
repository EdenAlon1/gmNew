package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class raw {
    final Class a;
    final rap b;
    private final Class c;

    public raw(Class cls, Class cls2, rap rapVar) {
        this.c = cls;
        this.a = cls2;
        this.b = rapVar;
    }

    public final boolean a(Class cls) {
        return this.c.isAssignableFrom(cls);
    }
}
