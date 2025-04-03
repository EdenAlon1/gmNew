package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfs implements lra {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public nfs(int i, String str, String str2, String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        lti.a(z2);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = i2;
    }

    @Override // defpackage.lra
    public final /* synthetic */ lqc a() {
        return null;
    }

    @Override // defpackage.lra
    public final void b(lqy lqyVar) {
        String str = this.c;
        if (str != null) {
            lqyVar.x = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            lqyVar.w = str2;
        }
    }

    @Override // defpackage.lra
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nfs nfsVar = (nfs) obj;
            if (this.a == nfsVar.a) {
                String str = this.b;
                String str2 = nfsVar.b;
                int i = lvf.a;
                if (Objects.equals(str, str2) && Objects.equals(this.c, nfsVar.c) && Objects.equals(this.d, nfsVar.d) && this.e == nfsVar.e && this.f == nfsVar.f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = str != null ? str.hashCode() : 0;
        int i = this.a;
        String str2 = this.c;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = ((i + 527) * 31) + hashCode;
        String str3 = this.d;
        return (((((((i2 * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.c + "\", genre=\"" + this.b + "\", bitrate=" + this.a + ", metadataInterval=" + this.f;
    }
}
