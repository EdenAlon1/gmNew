package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngf extends ngd {
    public final String a;
    public final String b;
    public final String c;

    public ngf(String str, String str2, String str3) {
        super("----");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ngf ngfVar = (ngf) obj;
            String str = this.b;
            String str2 = ngfVar.b;
            int i = lvf.a;
            if (Objects.equals(str, str2) && Objects.equals(this.a, ngfVar.a) && Objects.equals(this.c, ngfVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    @Override // defpackage.ngd
    public final String toString() {
        return this.f + ": domain=" + this.a + ", description=" + this.b;
    }
}
