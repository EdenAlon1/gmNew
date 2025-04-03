package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzah extends dzbi {
    public final String a;
    public final dzpt b;
    public final dzpg c;
    public final int d;
    public final long e;
    public final long f;

    public dzah(String str, dzpt dzptVar, dzpg dzpgVar, int i, long j, long j2) {
        this.a = str;
        this.b = dzptVar;
        this.c = dzpgVar;
        this.d = i;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.dzbi
    public final int a() {
        return this.d;
    }

    @Override // defpackage.dzbi
    public final long b() {
        return this.e;
    }

    @Override // defpackage.dzbi
    public final long c() {
        return this.f;
    }

    @Override // defpackage.dzbi
    public final dzpg d() {
        return this.c;
    }

    @Override // defpackage.dzbi
    public final dzpt e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzbi) {
            dzbi dzbiVar = (dzbi) obj;
            if (this.a.equals(dzbiVar.f()) && this.b.equals(dzbiVar.e()) && this.c.equals(dzbiVar.d()) && this.d == dzbiVar.a() && this.e == dzbiVar.b() && this.f == dzbiVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dzbi
    public final String f() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.f;
        long j2 = j ^ (j >>> 32);
        long j3 = this.e;
        return (((((hashCode * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) j2);
    }

    public final String toString() {
        dzpg dzpgVar = this.c;
        return "TypingIndicator{typingIndicatorId=" + this.a + ", conversationId=" + this.b.toString() + ", sender=" + dzpgVar.toString() + ", typingIndicatorStatus=" + this.d + ", refreshIntervalUSec=" + this.e + ", serverTimestampUSec=" + this.f + "}";
    }
}
