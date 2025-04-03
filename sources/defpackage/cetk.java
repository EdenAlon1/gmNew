package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cetk extends ceva {
    public final String a;
    public final String b;
    public final int c;
    public final engw d;
    public final long e;
    public final long f;
    private final String g;
    private final String h;
    private final String i;

    public cetk(String str, String str2, String str3, String str4, String str5, int i, engw engwVar, long j, long j2) {
        this.g = str;
        if (str2 == null) {
            throw new NullPointerException("Null type");
        }
        this.a = str2;
        this.h = str3;
        if (str4 == null) {
            throw new NullPointerException("Null queue");
        }
        this.b = str4;
        this.i = str5;
        this.c = i;
        if (engwVar == null) {
            throw new NullPointerException("Null attemptCounts");
        }
        this.d = engwVar;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.ceva
    public final int a() {
        return this.c;
    }

    @Override // defpackage.ceva
    public final long b() {
        return this.e;
    }

    @Override // defpackage.ceva
    public final long c() {
        return this.f;
    }

    @Override // defpackage.ceva
    public final engw d() {
        return this.d;
    }

    @Override // defpackage.ceva
    public final String e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ceva) {
            ceva cevaVar = (ceva) obj;
            if (this.g.equals(cevaVar.g()) && this.a.equals(cevaVar.i()) && ((str = this.h) != null ? str.equals(cevaVar.h()) : cevaVar.h() == null) && this.b.equals(cevaVar.f()) && ((str2 = this.i) != null ? str2.equals(cevaVar.e()) : cevaVar.e() == null) && this.c == cevaVar.a() && enkr.h(this.d, cevaVar.d()) && this.e == cevaVar.b() && this.f == cevaVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ceva
    public final String f() {
        return this.b;
    }

    @Override // defpackage.ceva
    public final String g() {
        return this.g;
    }

    @Override // defpackage.ceva
    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = ((this.g.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
        String str = this.h;
        int hashCode2 = ((((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str2 = this.i;
        int hashCode3 = (((((hashCode2 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003;
        long j = this.e;
        long j2 = this.f;
        return ((hashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // defpackage.ceva
    public final String i() {
        return this.a;
    }

    public final String toString() {
        return "WorkHandlerProcessingMetaData{src=" + this.g + ", type=" + this.a + ", subQueue=" + this.h + ", queue=" + this.b + ", cancellationTag=" + this.i + ", attemptCount=" + this.c + ", attemptCounts=" + this.d.toString() + ", idForLogging=" + this.e + ", potentiallyMisleadingEarliestScheduledExecutionTimeMs=" + this.f + "}";
    }
}
