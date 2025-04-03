package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csub extends csuf {
    public final long a;
    public final Optional b;

    public csub(long j, Optional optional) {
        this.a = j;
        this.b = optional;
    }

    @Override // defpackage.csuf
    public final long a() {
        return this.a;
    }

    @Override // defpackage.csuf
    public final Optional b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof csuf) {
            csuf csufVar = (csuf) obj;
            if (this.a == csufVar.a() && this.b.equals(csufVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "AutoDownloadCheckResult{maxAutoDownloadFileSizeBytes=" + this.a + ", failureReason=" + this.b.toString() + "}";
    }
}
