package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evhd {
    public final febj a;
    public final fdyk b;
    public final fdyk c;
    public final fdyk d;

    public evhd(febj febjVar, fdyk fdykVar, fdyk fdykVar2, fdyk fdykVar3) {
        this.a = febjVar;
        this.b = fdykVar;
        this.c = fdykVar2;
        this.d = fdykVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evhd)) {
            return false;
        }
        evhd evhdVar = (evhd) obj;
        return ffkj.e(this.a, evhdVar.a) && ffkj.e(this.b, evhdVar.b) && ffkj.e(this.c, evhdVar.c) && ffkj.e(this.d, evhdVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ParcelableOverMetadataKeys(metadataKey=" + this.a + ", requestKey=" + this.b + ", responseHeaderKey=" + this.c + ", responseTrailerKey=" + this.d + ")";
    }
}
