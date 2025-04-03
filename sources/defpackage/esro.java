package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esro {
    public final String a;
    public final fcek b;
    public final fcek c;
    public final engw d;
    public final fcek e;
    public final esqd f;
    public final int g;
    public final int h;

    public esro(String str, fcek fcekVar, fcek fcekVar2, int i, int i2, engw engwVar, fcek fcekVar3, esqd esqdVar) {
        str.getClass();
        fcekVar.getClass();
        fcekVar2.getClass();
        if (i == 0 || i2 == 0) {
            throw null;
        }
        engwVar.getClass();
        this.a = str;
        this.b = fcekVar;
        this.c = fcekVar2;
        this.g = i;
        this.h = i2;
        this.d = engwVar;
        this.e = fcekVar3;
        this.f = esqdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esro)) {
            return false;
        }
        esro esroVar = (esro) obj;
        return ffkj.e(this.a, esroVar.a) && ffkj.e(this.b, esroVar.b) && ffkj.e(this.c, esroVar.c) && this.g == esroVar.g && this.h == esroVar.h && ffkj.e(this.d, esroVar.d) && ffkj.e(this.e, esroVar.e) && ffkj.e(this.f, esroVar.f);
    }

    public final int hashCode() {
        int hashCode = (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.g) * 31) + this.h) * 31) + this.d.hashCode();
        fcek fcekVar = this.e;
        int hashCode2 = ((hashCode * 31) + (fcekVar == null ? 0 : fcekVar.hashCode())) * 31;
        esqd esqdVar = this.f;
        return hashCode2 + (esqdVar != null ? esqdVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageMetadata(messageId=");
        sb.append(this.a);
        sb.append(", senderId=");
        sb.append(this.b);
        sb.append(", recipientId=");
        sb.append(this.c);
        sb.append(", messageType=");
        sb.append((Object) esrn.a(this.g));
        sb.append(", messagePriority=");
        int i = this.h;
        sb.append((Object) (i != 1 ? i != 2 ? "NORMAL" : "HIGH" : "UNKNOWN"));
        sb.append(", headers=");
        sb.append(this.d);
        sb.append(", groupContext=");
        sb.append(this.e);
        sb.append(", traceId=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
