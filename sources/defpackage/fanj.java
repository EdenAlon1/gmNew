package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class fanj implements Comparable {
    static int c(byte b) {
        return (b >> 5) & 7;
    }

    private final fanj g(Class cls) {
        if (cls.isInstance(this)) {
            return (fanj) cls.cast(this);
        }
        throw new fani("Expected a " + cls.getName() + " value, but got " + getClass().getName());
    }

    protected abstract int a();

    protected int b() {
        return 0;
    }

    public final fanc d() {
        return (fanc) g(fanc.class);
    }

    public final fane e() {
        return (fane) g(fane.class);
    }

    public final fang f() {
        return (fang) g(fang.class);
    }
}
