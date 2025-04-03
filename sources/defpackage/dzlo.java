package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzlo extends dzlv {
    private final int a;

    public dzlo(int i) {
        this.a = i;
    }

    @Override // defpackage.dzrr
    public final dzrt b() {
        return dzrt.SIZE;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzrr) {
            dzrr dzrrVar = (dzrr) obj;
            if (dzrt.SIZE == dzrrVar.b() && this.a == dzrrVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dzlv, defpackage.dzrr
    public final int h() {
        return this.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "TextStyle{size=" + this.a + "}";
    }
}
