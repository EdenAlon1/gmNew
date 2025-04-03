package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zfj {
    public final ffxx a;
    public final ffxx b;
    public final ffxx c;
    public final ffxx d;
    public final ffxx e;
    public final fgdj f;

    public zfj(ffxx ffxxVar, ffxx ffxxVar2, ffxx ffxxVar3, ffxx ffxxVar4, ffxx ffxxVar5, fgdj fgdjVar) {
        fgdjVar.getClass();
        this.a = ffxxVar;
        this.b = ffxxVar2;
        this.c = ffxxVar3;
        this.d = ffxxVar4;
        this.e = ffxxVar5;
        this.f = fgdjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfj)) {
            return false;
        }
        zfj zfjVar = (zfj) obj;
        return ffkj.e(this.a, zfjVar.a) && ffkj.e(this.b, zfjVar.b) && ffkj.e(this.c, zfjVar.c) && ffkj.e(this.d, zfjVar.d) && ffkj.e(this.e, zfjVar.e) && ffkj.e(this.f, zfjVar.f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "MediaViewerUiData(toolbarUiDataFlow=" + this.a + ", replyOverlayUiDataFlow=" + this.b + ", badgeUiDataFlow=" + this.c + ", reactionBarUiDataFlow=" + this.d + ", replyButtonUiDataFlow=" + this.e + ", disabledComposeRowUiDataFlow=" + this.f + ")";
    }
}
