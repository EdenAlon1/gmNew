package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axbr extends axbq {
    public final String a;
    public final awui c;

    public axbr(String str, awui awuiVar) {
        this.a = str;
        this.c = awuiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axbr)) {
            return false;
        }
        axbr axbrVar = (axbr) obj;
        return ffkj.e(this.a, axbrVar.a) && ffkj.e(this.c, axbrVar.c);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "RecreateGroupData(conversationId=" + this.a + ", selfChatEndpoint=" + this.c + ")";
    }
}
