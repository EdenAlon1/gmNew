package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avuk extends avuo {
    private final avvz a;

    public avuk(avvz avvzVar) {
        this.a = avvzVar;
    }

    @Override // defpackage.avuo, defpackage.avvi
    public final avvz a() {
        return this.a;
    }

    @Override // defpackage.avvi
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof avvi) {
            avvi avviVar = (avvi) obj;
            if (avviVar.b() == 2 && this.a.equals(avviVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EventContext{executeHttpRequest=" + this.a.toString() + "}";
    }
}
