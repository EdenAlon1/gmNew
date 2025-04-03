package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzjy extends dzkb {
    private final String a;

    public dzjy(String str) {
        this.a = str;
    }

    @Override // defpackage.dzje
    public final dzjf a() {
        return dzjf.TOMBSTONE_ACTION;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzje) {
            dzje dzjeVar = (dzje) obj;
            if (dzjf.TOMBSTONE_ACTION == dzjeVar.a() && this.a.equals(dzjeVar.j())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.dzkb, defpackage.dzje
    public final String j() {
        return this.a;
    }

    public final String toString() {
        return "ActionPayload{tombstoneAction=" + this.a + "}";
    }
}
