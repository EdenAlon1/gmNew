package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zcj {
    public final ffji a;
    public final ffix b;

    public zcj(ffji ffjiVar, ffix ffixVar) {
        this.a = ffjiVar;
        this.b = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zcj)) {
            return false;
        }
        zcj zcjVar = (zcj) obj;
        return ffkj.e(this.a, zcjVar.a) && ffkj.e(this.b, zcjVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MenuButtonUiData(onClickConfirm=" + this.a + ", onClickCancel=" + this.b + ")";
    }
}
