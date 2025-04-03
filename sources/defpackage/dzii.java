package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzii extends dzja {
    public final long a;
    public final dzjd b;
    public final eyee c;
    public final dziz d;

    public dzii(long j, dzjd dzjdVar, eyee eyeeVar, dziz dzizVar) {
        this.a = j;
        if (dzjdVar == null) {
            throw new NullPointerException("Null accountUsers");
        }
        this.b = dzjdVar;
        if (eyeeVar == null) {
            throw new NullPointerException("Null serverRegistrationId");
        }
        this.c = eyeeVar;
        if (dzizVar == null) {
            throw new NullPointerException("Null serverRegistrationStatus");
        }
        this.d = dzizVar;
    }

    @Override // defpackage.dzja
    public final long a() {
        return this.a;
    }

    @Override // defpackage.dzja
    public final dziz b() {
        return this.d;
    }

    @Override // defpackage.dzja
    public final dzjd c() {
        return this.b;
    }

    @Override // defpackage.dzja
    public final eyee d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzja) {
            dzja dzjaVar = (dzja) obj;
            if (this.a == dzjaVar.a() && this.b.equals(dzjaVar.c()) && this.c.equals(dzjaVar.d()) && this.d.equals(dzjaVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        dziz dzizVar = this.d;
        eyee eyeeVar = this.c;
        return "AccountContext{registrationId=" + this.a + ", accountUsers=" + this.b.toString() + ", serverRegistrationId=" + eyeeVar.toString() + ", serverRegistrationStatus=" + dzizVar.toString() + "}";
    }
}
