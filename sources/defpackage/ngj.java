package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngj extends ngd {
    public final String a;
    public final String b;

    public ngj(String str, String str2, String str3) {
        super(str);
        this.a = str2;
        this.b = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ngj ngjVar = (ngj) obj;
            if (this.f.equals(ngjVar.f)) {
                String str = this.a;
                String str2 = ngjVar.a;
                int i = lvf.a;
                if (Objects.equals(str, str2) && Objects.equals(this.b, ngjVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f.hashCode() + 527;
        String str = this.a;
        return (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.b.hashCode();
    }

    @Override // defpackage.ngd
    public final String toString() {
        return this.f + ": url=" + this.b;
    }
}
