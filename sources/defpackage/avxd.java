package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avxd extends avxe {
    private final cqqj a;

    public avxd(cqqj cqqjVar) {
        this.a = cqqjVar;
    }

    @Override // defpackage.avxs
    public final int b() {
        return 3;
    }

    @Override // defpackage.avxe, defpackage.avxs
    public final cqqj d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof avxs) {
            avxs avxsVar = (avxs) obj;
            if (avxsVar.b() == 3 && this.a.equals(avxsVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DownloadResultOrError{unsupportedNetwork=" + this.a.toString() + "}";
    }
}
