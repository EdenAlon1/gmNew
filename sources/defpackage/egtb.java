package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egtb implements egte {
    public final String a;
    public final Object b;
    public final String c;
    public final ewke d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public egtb(String str, Object obj, String str2, ewke ewkeVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        ewkeVar.getClass();
        this.a = str;
        this.b = obj;
        this.c = str2;
        this.d = ewkeVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
    }

    public static /* synthetic */ egtb a(egtb egtbVar, ewke ewkeVar, boolean z, boolean z2, boolean z3, int i) {
        String str = (i & 1) != 0 ? egtbVar.a : null;
        Object obj = (i & 2) != 0 ? egtbVar.b : null;
        String str2 = (i & 4) != 0 ? egtbVar.c : null;
        if ((i & 8) != 0) {
            ewkeVar = egtbVar.d;
        }
        ewke ewkeVar2 = ewkeVar;
        boolean z4 = (i & 16) != 0 ? egtbVar.e : z;
        boolean z5 = (i & 32) != 0 ? egtbVar.f : z2;
        boolean z6 = (i & 64) != 0 ? egtbVar.g : false;
        boolean z7 = (i & 128) != 0 ? egtbVar.h : z3;
        str.getClass();
        obj.getClass();
        str2.getClass();
        ewkeVar2.getClass();
        return new egtb(str, obj, str2, ewkeVar2, z4, z5, z6, z7, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egtb)) {
            return false;
        }
        egtb egtbVar = (egtb) obj;
        return ffkj.e(this.a, egtbVar.a) && ffkj.e(this.b, egtbVar.b) && ffkj.e(this.c, egtbVar.c) && this.d == egtbVar.d && this.e == egtbVar.e && this.f == egtbVar.f && this.g == egtbVar.g && this.h == egtbVar.h && this.i == egtbVar.i;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        boolean z = this.i;
        boolean z2 = this.h;
        boolean z3 = this.g;
        return (((((((((hashCode * 31) + egta.a(this.e)) * 31) + egta.a(this.f)) * 31) + egta.a(z3)) * 31) + egta.a(z2)) * 31) + egta.a(z);
    }

    public final String toString() {
        return "Ready(name=" + this.a + ", avatarGlideModel=" + this.b + ", accountName=" + this.c + ", infoMessage=" + this.d + ", hasAnyGooglePhotos=" + this.e + ", locked=" + this.f + ", isDefaultPhoto=" + this.g + ", isOffline=" + this.h + ", remoteStateLoadDone=" + this.i + ")";
    }
}
