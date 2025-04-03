package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avwd extends avwe {
    private final enhz a;

    public avwd(enhz enhzVar) {
        this.a = enhzVar;
    }

    @Override // defpackage.avwp
    public final int b() {
        return 1;
    }

    @Override // defpackage.avwe, defpackage.avwp
    public final enhz c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof avwp) {
            avwp avwpVar = (avwp) obj;
            if (avwpVar.b() == 1 && this.a.equals(avwpVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HttpHeadersOrError{httpHeaders=" + this.a.toString() + "}";
    }
}
