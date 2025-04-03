package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbf extends bdn {
    public final String a;
    private final Class b;
    private final Object c;

    public bbf(String str, Class cls, Object obj) {
        this.a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.b = cls;
        this.c = obj;
    }

    @Override // defpackage.bdn
    public final Class a() {
        return this.b;
    }

    @Override // defpackage.bdn
    public final Object b() {
        return this.c;
    }

    @Override // defpackage.bdn
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdn) {
            bdn bdnVar = (bdn) obj;
            if (this.a.equals(bdnVar.c()) && this.b.equals(bdnVar.a()) && ((obj2 = this.c) != null ? obj2.equals(bdnVar.b()) : bdnVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        Object obj = this.c;
        return (hashCode * 1000003) ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "Option{id=" + this.a + ", valueClass=" + this.b + ", token=" + this.c + "}";
    }
}
