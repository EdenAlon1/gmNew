package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xmr {
    public final zkk a;
    public final dsho b;

    public xmr(zkk zkkVar, dsho dshoVar) {
        this.a = zkkVar;
        this.b = dshoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmr)) {
            return false;
        }
        xmr xmrVar = (xmr) obj;
        return ffkj.e(this.a, xmrVar.a) && ffkj.e(this.b, xmrVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DirectSendComposeRowHolderUiData(fullScreenComposeRowUiData=" + this.a + ", hugoUiData=" + this.b + ")";
    }
}
