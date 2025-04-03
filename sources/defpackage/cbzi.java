package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbzi extends ccju {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;

    public cbzi(boolean z, int i, int i2, int i3, long j, long j2, long j3) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = j2;
        this.g = j3;
    }

    @Override // defpackage.ccju
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ccju
    public final int b() {
        return this.d;
    }

    @Override // defpackage.ccju
    public final int c() {
        return this.c;
    }

    @Override // defpackage.ccju
    public final long d() {
        return this.f;
    }

    @Override // defpackage.ccju
    public final long e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ccju) {
            ccju ccjuVar = (ccju) obj;
            if (this.a == ccjuVar.g() && this.b == ccjuVar.a() && this.c == ccjuVar.c() && this.d == ccjuVar.b() && this.e == ccjuVar.f() && this.f == ccjuVar.d() && this.g == ccjuVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ccju
    public final long f() {
        return this.e;
    }

    @Override // defpackage.ccju
    public final boolean g() {
        return this.a;
    }

    public final int hashCode() {
        int i = ((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        int i2 = this.d;
        long j = this.e;
        long j2 = this.f;
        long j3 = this.g;
        return ((((((i ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SchedulingResult{isNewWorkScheduled=" + this.a + ", nextMaxBackupKeyIndex=" + this.b + ", nextMaxKeyType=" + this.c + ", nextMaxKeyIndex=" + this.d + ", nextMaxParticipantId=" + this.e + ", nextMaxConversationId=" + this.f + ", nextMaxMessageTimestampMillis=" + this.g + "}";
    }
}
