package defpackage;

import com.google.android.play.core.install.InstallState;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehvn extends InstallState {
    public final int a;
    public final int b;
    private final long c;
    private final long d;
    private final String e;

    public ehvn(int i, long j, long j2, int i2, String str) {
        this.a = i;
        this.c = j;
        this.d = j2;
        this.b = i2;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.e = str;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int a() {
        return this.b;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int b() {
        return this.a;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long c() {
        return this.c;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long d() {
        return this.d;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            if (this.a == installState.b() && this.c == installState.c() && this.d == installState.d() && this.b == installState.a() && this.e.equals(installState.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.d;
        int i = this.a;
        String str = this.e;
        long j2 = this.c;
        return ((((((int) (j ^ (j >>> 32))) ^ ((((i ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003)) * 1000003) ^ this.b) * 1000003) ^ str.hashCode();
    }

    public final String toString() {
        return "InstallState{installStatus=" + this.a + ", bytesDownloaded=" + this.c + ", totalBytesToDownload=" + this.d + ", installErrorCode=" + this.b + ", packageName=" + this.e + "}";
    }
}
