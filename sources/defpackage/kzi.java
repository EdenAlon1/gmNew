package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kzi {
    public final kzh a;
    public final kzg b;
    public final boolean c;

    public kzi(kzh kzhVar, kzg kzgVar) {
        this.a = kzhVar;
        this.b = kzgVar;
        this.c = kzhVar != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kzi) {
            kzi kziVar = (kzi) obj;
            if (this.c == kziVar.c && ffkj.e(this.a, kziVar.a) && ffkj.e(this.b, kziVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.c), this.a, this.b);
    }

    public kzi() {
        this(null, null);
    }
}
