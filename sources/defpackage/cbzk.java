package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbzk extends ccpe {
    public final engw a;
    public final engw b;

    public cbzk(engw engwVar, engw engwVar2) {
        this.a = engwVar;
        this.b = engwVar2;
    }

    @Override // defpackage.ccpe
    public final engw a() {
        return this.b;
    }

    @Override // defpackage.ccpe
    public final engw b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ccpe) {
            ccpe ccpeVar = (ccpe) obj;
            if (enkr.h(this.a, ccpeVar.b()) && enkr.h(this.b, ccpeVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        engw engwVar = this.b;
        return "DataReadyToBulkInsert{partAndAssociatedMessageList=" + this.a.toString() + ", linkPreviewList=" + engwVar.toString() + "}";
    }
}
