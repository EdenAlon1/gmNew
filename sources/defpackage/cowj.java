package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cowj {
    public final bdhg a;
    public final String b;
    public final boolean c;
    public final awui d;
    public final fayv e;

    public cowj(bdhg bdhgVar, String str, boolean z, awui awuiVar, fayv fayvVar) {
        this.a = bdhgVar;
        this.b = str;
        this.c = z;
        this.d = awuiVar;
        this.e = fayvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cowj)) {
            return false;
        }
        cowj cowjVar = (cowj) obj;
        return ffkj.e(this.a, cowjVar.a) && ffkj.e(this.b, cowjVar.b) && this.c == cowjVar.c && ffkj.e(this.d, cowjVar.d) && ffkj.e(this.e, cowjVar.e);
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.hashCode();
        fayv fayvVar = this.e;
        return (hashCode * 31) + (fayvVar == null ? 0 : fayvVar.hashCode());
    }

    public final String toString() {
        return "RcsConverterTextMessage(rcsMessageId=" + this.a + ", messageText=" + this.b + ", isEncrypted=" + this.c + ", selfIdentity=" + this.d + ", customHeaders=" + this.e + ")";
    }
}
