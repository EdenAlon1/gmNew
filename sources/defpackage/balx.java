package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class balx {
    public final byte[] a;
    public final long b;

    public balx(byte[] bArr, long j) {
        this.a = bArr;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof balx)) {
            return false;
        }
        balx balxVar = (balx) obj;
        return ffkj.e(this.a, balxVar.a) && this.b == balxVar.b;
    }

    public final int hashCode() {
        byte[] bArr = this.a;
        return ((bArr == null ? 0 : Arrays.hashCode(bArr)) * 31) + ((int) this.b);
    }

    public final String toString() {
        return "DownloadedDataInfo(downloadedData=" + Arrays.toString(this.a) + ", messageSizeBytes=" + this.b + ")";
    }
}
