package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rke {
    private Class a;
    private Class b;
    private Class c;

    public rke() {
    }

    public final void a(Class cls, Class cls2, Class cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rke rkeVar = (rke) obj;
        return this.a.equals(rkeVar.a) && this.b.equals(rkeVar.b) && rkh.l(this.c, rkeVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Class cls = this.c;
        return (hashCode * 31) + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + String.valueOf(this.a) + ", second=" + String.valueOf(this.b) + "}";
    }

    public rke(Class cls, Class cls2, Class cls3) {
        a(cls, cls2, cls3);
    }
}
