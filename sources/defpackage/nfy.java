package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfy extends ngd {
    public final String a;
    public final String b;
    public final String c;

    public nfy(String str, String str2, String str3) {
        super("COMM");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nfy nfyVar = (nfy) obj;
            String str = this.b;
            String str2 = nfyVar.b;
            int i = lvf.a;
            if (Objects.equals(str, str2) && Objects.equals(this.a, nfyVar.a) && Objects.equals(this.c, nfyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() + 527) * 31) + this.b.hashCode();
        String str = this.c;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.ngd
    public final String toString() {
        return this.f + ": language=" + this.a + ", description=" + this.b + ", text=" + this.c;
    }
}
