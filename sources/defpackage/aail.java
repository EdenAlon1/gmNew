package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aail {
    public final ffji a;
    public final String b;

    public aail() {
        this(new ffji() { // from class: aaik
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((dnse) obj).getClass();
                return ffcu.a;
            }
        }, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aail)) {
            return false;
        }
        aail aailVar = (aail) obj;
        return ffkj.e(this.a, aailVar.a) && ffkj.e(this.b, aailVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DoubleTapUiData(onDoubleTap=" + this.a + ", label=" + this.b + ")";
    }

    public aail(ffji ffjiVar, String str) {
        ffjiVar.getClass();
        str.getClass();
        this.a = ffjiVar;
        this.b = str;
    }
}
