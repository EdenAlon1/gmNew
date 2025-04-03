package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzll extends dzlv {
    private final int a;

    public dzll(int i) {
        this.a = i;
    }

    @Override // defpackage.dzrr
    public final dzrt b() {
        return dzrt.HORIZONTAL_ALIGNMENT;
    }

    @Override // defpackage.dzlv, defpackage.dzrr
    public final int e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzrr) {
            dzrr dzrrVar = (dzrr) obj;
            if (dzrt.HORIZONTAL_ALIGNMENT == dzrrVar.b() && this.a == dzrrVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "TextStyle{horizontalAlignment=" + this.a + "}";
    }
}
