package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpvl {
    public final ffji a;
    public final ffix b;

    public dpvl(ffji ffjiVar, ffix ffixVar) {
        this.a = ffjiVar;
        this.b = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpvl)) {
            return false;
        }
        dpvl dpvlVar = (dpvl) obj;
        return ffkj.e(this.a, dpvlVar.a) && ffkj.e(this.b, dpvlVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ShutterLongPressHandler(onShutterLongPress=" + this.a + ", onShutterLongPressReleased=" + this.b + ")";
    }

    public dpvl() {
        this(new ffji() { // from class: dpvj
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((lkr) obj).getClass();
                return ffcu.a;
            }
        }, new ffix() { // from class: dpvk
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        });
    }
}
