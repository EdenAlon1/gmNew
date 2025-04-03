package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avwc extends avwe {
    private final avvd a;

    public avwc(avvd avvdVar) {
        this.a = avvdVar;
    }

    @Override // defpackage.avwe, defpackage.avwp
    public final avvd a() {
        return this.a;
    }

    @Override // defpackage.avwp
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof avwp) {
            avwp avwpVar = (avwp) obj;
            if (avwpVar.b() == 2 && this.a.equals(avwpVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HttpHeadersOrError{error=" + this.a.toString() + "}";
    }
}
