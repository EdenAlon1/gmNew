package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbmf extends cbnf {
    private final long a;
    private final String b;
    private final String c;

    public cbmf(long j, String str, String str2) {
        this.a = j;
        if (str == null) {
            throw new NullPointerException("Null displayName");
        }
        this.b = str;
        if (str2 == null) {
            throw new NullPointerException("Null lookupKey");
        }
        this.c = str2;
    }

    @Override // defpackage.cbnf
    public final long a() {
        return this.a;
    }

    @Override // defpackage.cbnf
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cbnf
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cbnf) {
            cbnf cbnfVar = (cbnf) obj;
            if (this.a == cbnfVar.a() && this.b.equals(cbnfVar.b()) && this.c.equals(cbnfVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "IcingParticipantSearchResult{participantId=" + this.a + ", displayName=" + this.b + ", lookupKey=" + this.c + "}";
    }
}
