package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class ffyy {
    public static final ffji a = new ffji() { // from class: ffyw
        @Override // defpackage.ffji
        public final Object invoke(Object obj) {
            return obj;
        }
    };
    private static final ffjm b = new ffjm() { // from class: ffyx
        @Override // defpackage.ffjm
        public final Object a(Object obj, Object obj2) {
            return Boolean.valueOf(ffkj.e(obj, obj2));
        }
    };

    public static final ffxx a(ffxx ffxxVar) {
        return ffxxVar instanceof fgdj ? ffxxVar : c(ffxxVar, a, b);
    }

    public static final ffxx b(ffxx ffxxVar, ffji ffjiVar) {
        return c(ffxxVar, ffjiVar, b);
    }

    public static final ffxx c(ffxx ffxxVar, ffji ffjiVar, ffjm ffjmVar) {
        if (ffxxVar instanceof ffxv) {
            ffxv ffxvVar = (ffxv) ffxxVar;
            if (ffxvVar.a == ffjiVar && ffxvVar.b == ffjmVar) {
                return ffxxVar;
            }
        }
        return new ffxv(ffxxVar, ffjiVar, ffjmVar);
    }
}
