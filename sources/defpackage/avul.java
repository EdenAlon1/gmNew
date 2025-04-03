package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avul extends avuo {
    private final avvd a;

    public avul(avvd avvdVar) {
        this.a = avvdVar;
    }

    @Override // defpackage.avvi
    public final int b() {
        return 4;
    }

    @Override // defpackage.avuo, defpackage.avvi
    public final avvd c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof avvi) {
            avvi avviVar = (avvi) obj;
            if (avviVar.b() == 4 && this.a.equals(avviVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EventContext{finishWithFailure=" + this.a.toString() + "}";
    }
}
