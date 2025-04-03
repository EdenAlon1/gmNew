package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzli extends dzlv {
    private final int a;

    public dzli(int i) {
        this.a = i;
    }

    @Override // defpackage.dzlv, defpackage.dzrr
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dzrr
    public final dzrt b() {
        return dzrt.BACKGROUND_COLOR;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzrr) {
            dzrr dzrrVar = (dzrr) obj;
            if (dzrt.BACKGROUND_COLOR == dzrrVar.b() && this.a == dzrrVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "TextStyle{backgroundColor=" + this.a + "}";
    }
}
