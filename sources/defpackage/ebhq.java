package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebhq extends ebhp {
    public final String a;
    public final ebff b;
    public final ebff c;
    public final String d;

    public ebhq(String str, ebff ebffVar, ebff ebffVar2, String str2) {
        this.a = str;
        this.b = ebffVar;
        this.c = ebffVar2;
        this.d = str2;
    }

    @Override // defpackage.ebhp
    public final ebff a() {
        return this.c;
    }

    @Override // defpackage.ebhp
    public final ebff b() {
        return this.b;
    }

    @Override // defpackage.ebhp
    public final String c() {
        return this.d;
    }

    @Override // defpackage.ebhp
    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebhp) {
            ebhp ebhpVar = (ebhp) obj;
            if (this.a.equals(ebhpVar.d()) && this.b.equals(ebhpVar.b()) && this.c.equals(ebhpVar.a()) && this.d.equals(ebhpVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        ebff ebffVar = this.c;
        return "AccountMessagesResources{recommendedActions=" + this.a + ", yellowAlertIcon=" + this.b.toString() + ", shieldIcon=" + ebffVar.toString() + ", appPackageName=" + this.d + "}";
    }
}
