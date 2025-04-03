package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajqc {
    public final bdhg a;
    public final fayv b;

    public ajqc(bdhg bdhgVar, fayv fayvVar) {
        this.a = bdhgVar;
        this.b = fayvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajqc)) {
            return false;
        }
        ajqc ajqcVar = (ajqc) obj;
        return ffkj.e(this.a, ajqcVar.a) && ffkj.e(this.b, ajqcVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        fayv fayvVar = this.b;
        return hashCode + (fayvVar == null ? 0 : fayvVar.hashCode());
    }

    public final String toString() {
        return "ReplyQueuedInfo(rcsMessageId=" + this.a + ", customCpimHeaders=" + this.b + ")";
    }
}
