package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ceky extends celn {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final long g;
    private final long h;
    private final epem i;

    public ceky(int i, int i2, int i3, int i4, int i5, int i6, long j, long j2, epem epemVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = j;
        this.h = j2;
        this.i = epemVar;
    }

    @Override // defpackage.celn
    public final int a() {
        return this.f;
    }

    @Override // defpackage.celn
    public final int b() {
        return this.e;
    }

    @Override // defpackage.celn
    public final int c() {
        return this.d;
    }

    @Override // defpackage.celn
    public final int d() {
        return this.c;
    }

    @Override // defpackage.celn
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof celn) {
            celn celnVar = (celn) obj;
            if (this.a == celnVar.f() && this.b == celnVar.e() && this.c == celnVar.d() && this.d == celnVar.c() && this.e == celnVar.b() && this.f == celnVar.a() && this.g == celnVar.h() && this.h == celnVar.g() && this.i.equals(celnVar.i())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.celn
    public final int f() {
        return this.a;
    }

    @Override // defpackage.celn
    public final long g() {
        return this.h;
    }

    @Override // defpackage.celn
    public final long h() {
        return this.g;
    }

    public final int hashCode() {
        long j = this.h;
        int i = this.a;
        epem epemVar = this.i;
        long j2 = this.g;
        return ((((int) (j ^ (j >>> 32))) ^ ((((((((((((((i ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003)) * 1000003) ^ epemVar.hashCode();
    }

    @Override // defpackage.celn
    public final epem i() {
        return this.i;
    }

    public final String toString() {
        return "ClearcutLoggingInfo{unknownSenderCount=" + this.a + ", restoreSkippedItemCount=" + this.b + ", numOfParticipantsTotalToRestore=" + this.c + ", numOfParticipantsRestored=" + this.d + ", numOfConvTotalToRestore=" + this.e + ", numOfConvRestored=" + this.f + ", numOfMsgTotalToRestore=" + this.g + ", numOfMsgRestored=" + this.h + ", initialRestoreTimingStats=" + this.i.toString() + "}";
    }
}
