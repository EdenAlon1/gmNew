package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpdd extends dpdf {
    public final Throwable a;

    public dpdd() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dpdd) && ffkj.e(this.a, ((dpdd) obj).a);
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return "ClosePacket(reason=" + this.a + ")";
    }

    public dpdd(Throwable th) {
        this.a = th;
    }

    public /* synthetic */ dpdd(byte[] bArr) {
        this((Throwable) null);
    }
}
