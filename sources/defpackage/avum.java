package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avum extends avuo {
    private final avvg a;

    public avum(avvg avvgVar) {
        this.a = avvgVar;
    }

    @Override // defpackage.avvi
    public final int b() {
        return 3;
    }

    @Override // defpackage.avuo, defpackage.avvi
    public final avvg d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof avvi) {
            avvi avviVar = (avvi) obj;
            if (avviVar.b() == 3 && this.a.equals(avviVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EventContext{finishWithHttpResponse=" + this.a.toString() + "}";
    }
}
