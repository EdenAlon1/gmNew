package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avxb extends avxe {
    private final avvd a;

    public avxb(avvd avvdVar) {
        this.a = avvdVar;
    }

    @Override // defpackage.avxe, defpackage.avxs
    public final avvd a() {
        return this.a;
    }

    @Override // defpackage.avxs
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof avxs) {
            avxs avxsVar = (avxs) obj;
            if (avxsVar.b() == 2 && this.a.equals(avxsVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DownloadResultOrError{downloadFailure=" + this.a.toString() + "}";
    }
}
