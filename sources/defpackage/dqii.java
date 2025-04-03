package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqii {
    public final String a;
    public final ffji b;
    public final ffjm c;

    public dqii(String str, ffji ffjiVar, ffjm ffjmVar) {
        this.a = str;
        this.b = ffjiVar;
        this.c = ffjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqii)) {
            return false;
        }
        dqii dqiiVar = (dqii) obj;
        return ffkj.e(this.a, dqiiVar.a) && ffkj.e(this.b, dqiiVar.b) && ffkj.e(this.c, dqiiVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "EntityDescriptor(name=" + this.a + ", serializer=" + this.b + ", deserializer=" + this.c + ")";
    }
}
