package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axdx {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final long o;
    public final long p;
    public final long q;
    public final long r;
    public final long s;

    public axdx(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, long j, long j2, long j3, long j4, long j5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
        this.k = i11;
        this.l = i12;
        this.m = i13;
        this.n = i14;
        this.o = j;
        this.p = j2;
        this.q = j3;
        this.r = j4;
        this.s = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axdx)) {
            return false;
        }
        axdx axdxVar = (axdx) obj;
        return this.a == axdxVar.a && this.b == axdxVar.b && this.c == axdxVar.c && this.d == axdxVar.d && this.e == axdxVar.e && this.f == axdxVar.f && this.g == axdxVar.g && this.h == axdxVar.h && this.i == axdxVar.i && this.j == axdxVar.j && this.k == axdxVar.k && this.l == axdxVar.l && this.m == axdxVar.m && this.n == axdxVar.n && this.o == axdxVar.o && this.p == axdxVar.p && this.q == axdxVar.q && this.r == axdxVar.r && this.s == axdxVar.s;
    }

    public final int hashCode() {
        int i = this.a;
        long j = this.s;
        long j2 = this.r;
        long j3 = this.q;
        long j4 = this.p;
        return (((((((((((((((((((((((((((((((((((i * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31) + this.m) * 31) + this.n) * 31) + axdg.a(this.o)) * 31) + axdg.a(j4)) * 31) + axdg.a(j3)) * 31) + axdg.a(j2)) * 31) + axdg.a(j);
    }

    public final String toString() {
        return "CmsInitialSyncDatabaseProfileMetadata(numOfMsgSucceed=" + this.a + ", numOfMsgInDlq=" + this.b + ", numOfConvSucceed=" + this.c + ", numOfConvInDlq=" + this.d + ", numOfParticipantsSucceed=" + this.e + ", numOfParticipantsInDlq=" + this.f + ", numOfParticipantsTotalToRestoreForUi=" + this.g + ", numOfParticipantsRestoredForUi=" + this.h + ", numOfParticipantsTotalToBackupForUi=" + this.i + ", numOfParticipantsBackedUpForUi=" + this.j + ", numOfConvTotalToRestoreForUi=" + this.k + ", numOfConvRestoredForUi=" + this.l + ", numOfConvTotalToBackupForUi=" + this.m + ", numOfConvBackedUpForUi=" + this.n + ", numOfMsgTotalToRestoreForUi=" + this.o + ", numOfMsgRestoredForUi=" + this.p + ", numOfMsgMerged=" + this.q + ", numOfMsgTotalToBackupForUi=" + this.r + ", numOfMsgBackedUpForUi=" + this.s + ")";
    }
}
