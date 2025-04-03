package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzjs extends dzkb {
    private final dzjk a;

    public dzjs(dzjk dzjkVar) {
        this.a = dzjkVar;
    }

    @Override // defpackage.dzje
    public final dzjf a() {
        return dzjf.COMPOSED_OVERLAY_ACTION;
    }

    @Override // defpackage.dzkb, defpackage.dzje
    public final dzjk b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzje) {
            dzje dzjeVar = (dzje) obj;
            if (dzjf.COMPOSED_OVERLAY_ACTION == dzjeVar.a() && this.a.equals(dzjeVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActionPayload{composedOverlayAction=" + this.a.toString() + "}";
    }
}
