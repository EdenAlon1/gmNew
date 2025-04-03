package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmvn implements dmvt {
    public final dmzz a;
    public final String b;
    public final String c;
    public final List d;
    public final ffix e;

    public dmvn(dmzz dmzzVar, String str, String str2, List list, ffix ffixVar) {
        dmzzVar.getClass();
        this.a = dmzzVar;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = ffixVar;
    }

    @Override // defpackage.dmvt
    public final /* synthetic */ dmvt a(boolean z, ffix ffixVar) {
        return dmvb.a(this, z, ffixVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmvn)) {
            return false;
        }
        dmvn dmvnVar = (dmvn) obj;
        return this.a == dmvnVar.a && ffkj.e(this.b, dmvnVar.b) && ffkj.e(this.c, dmvnVar.c) && ffkj.e(this.d, dmvnVar.d) && ffkj.e(this.e, dmvnVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "Secure(icon=" + this.a + ", title=" + this.b + ", body=" + this.c + ", bodyAnnotations=" + this.d + ", onDismissRequest=" + this.e + ")";
    }
}
