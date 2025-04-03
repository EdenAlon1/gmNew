package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dofn {
    public final dofr a;
    public final ffix b;

    public dofn(dofr dofrVar, ffix ffixVar) {
        dofrVar.getClass();
        this.a = dofrVar;
        this.b = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dofn)) {
            return false;
        }
        dofn dofnVar = (dofn) obj;
        return ffkj.e(this.a, dofnVar.a) && ffkj.e(this.b, dofnVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ffix ffixVar = this.b;
        return hashCode + (ffixVar == null ? 0 : ffixVar.hashCode());
    }

    public final String toString() {
        return "MessageReplySnippetUiData(replyContent=" + this.a + ", onClick=" + this.b + ")";
    }
}
