package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xrb {
    public final dmzz a;
    public final ffix b;

    public xrb(dmzz dmzzVar, ffix ffixVar) {
        dmzzVar.getClass();
        this.a = dmzzVar;
        this.b = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrb)) {
            return false;
        }
        xrb xrbVar = (xrb) obj;
        return this.a == xrbVar.a && ffkj.e(this.b, xrbVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DirectSendImageCompressionUiData(selectedIconData=" + this.a + ", onTuneButtonClick=" + this.b + ")";
    }
}
