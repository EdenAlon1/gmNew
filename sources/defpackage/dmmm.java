package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmmm implements dmmq {
    public final dofr a;
    public final ffix b;
    public final ffix c;

    public dmmm(dofr dofrVar, ffix ffixVar, ffix ffixVar2) {
        dofrVar.getClass();
        this.a = dofrVar;
        this.b = ffixVar;
        this.c = ffixVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmmm)) {
            return false;
        }
        dmmm dmmmVar = (dmmm) obj;
        return ffkj.e(this.a, dmmmVar.a) && ffkj.e(this.b, dmmmVar.b) && ffkj.e(this.c, dmmmVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ComposeRowDraftReplyUiData(replyContent=" + this.a + ", onDismiss=" + this.b + ", onDisplayed=" + this.c + ")";
    }
}
