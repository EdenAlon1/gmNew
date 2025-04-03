package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dobi {
    public final String a;
    public final dobm b;
    public final ffix c;

    public dobi(String str, dobm dobmVar, ffix ffixVar) {
        this.a = str;
        this.b = dobmVar;
        this.c = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dobi)) {
            return false;
        }
        dobi dobiVar = (dobi) obj;
        return ffkj.e(this.a, dobiVar.a) && ffkj.e(this.b, dobiVar.b) && ffkj.e(this.c, dobiVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dobm dobmVar = this.b;
        return ((hashCode + (dobmVar == null ? 0 : dobmVar.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "RichCardAction(text=" + this.a + ", icon=" + this.b + ", onClick=" + this.c + ")";
    }
}
