package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzlk extends dzlv {
    private final int a;

    public dzlk(int i) {
        this.a = i;
    }

    @Override // defpackage.dzrr
    public final dzrt b() {
        return dzrt.COLOR;
    }

    @Override // defpackage.dzlv, defpackage.dzrr
    public final int d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzrr) {
            dzrr dzrrVar = (dzrr) obj;
            if (dzrt.COLOR == dzrrVar.b() && this.a == dzrrVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "TextStyle{color=" + this.a + "}";
    }
}
