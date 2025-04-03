package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xmq {
    public final ffix a;
    public final ffxx b;
    public final fgdj c;

    public xmq(ffix ffixVar, ffxx ffxxVar, fgdj fgdjVar) {
        this.a = ffixVar;
        this.b = ffxxVar;
        this.c = fgdjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmq)) {
            return false;
        }
        xmq xmqVar = (xmq) obj;
        return ffkj.e(this.a, xmqVar.a) && ffkj.e(this.b, xmqVar.b) && ffkj.e(this.c, xmqVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ShowCameraUiData(onCameraButtonClick=" + this.a + ", cameraUiData=" + this.b + ", forceShowCamera=" + this.c + ")";
    }
}
