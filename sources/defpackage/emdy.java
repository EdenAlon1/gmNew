package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emdy {
    public final fgdj a;
    public final fgdj b;
    public final fgdj c;
    public final fgdj d;

    public emdy(fgdj fgdjVar, fgdj fgdjVar2, fgdj fgdjVar3, fgdj fgdjVar4) {
        this.a = fgdjVar;
        this.b = fgdjVar2;
        this.c = fgdjVar3;
        this.d = fgdjVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emdy)) {
            return false;
        }
        emdy emdyVar = (emdy) obj;
        return ffkj.e(this.a, emdyVar.a) && ffkj.e(this.b, emdyVar.b) && ffkj.e(this.c, emdyVar.c) && ffkj.e(this.d, emdyVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "PenpalOnDeviceDownloadStatus(isStorageInsufficientFlow=" + this.a + ", bytesToDownloadFlow=" + this.b + ", totalBytesDownloadedFlow=" + this.c + ", downloadCompleteFlow=" + this.d + ")";
    }
}
