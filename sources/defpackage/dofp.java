package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dofp implements dofr {
    public final String a;
    public final String b;
    public final dofy c;

    public dofp(String str, String str2, dofy dofyVar) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = dofyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dofp)) {
            return false;
        }
        dofp dofpVar = (dofp) obj;
        return ffkj.e(this.a, dofpVar.a) && ffkj.e(this.b, dofpVar.b) && ffkj.e(this.c, dofpVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        dofy dofyVar = this.c;
        return (hashCode * 31) + (dofyVar == null ? 0 : dofyVar.hashCode());
    }

    public final String toString() {
        return "Full(title=" + this.a + ", description=" + this.b + ", thumbnail=" + this.c + ")";
    }

    public /* synthetic */ dofp(String str, String str2) {
        this(str, str2, null);
    }
}
