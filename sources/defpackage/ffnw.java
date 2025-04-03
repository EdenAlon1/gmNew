package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
class ffnw extends ffnr {
    public static final ffnl b(Iterator it) {
        return ffno.c(new ffns(it));
    }

    public static final ffnl c(ffnl ffnlVar) {
        return ffnlVar instanceof ffmy ? ffnlVar : new ffmy(ffnlVar);
    }

    public static final ffnl d(ffix ffixVar) {
        return ffno.c(new ffnk(ffixVar, new ffnu(ffixVar)));
    }

    public static final ffnl e(Object obj, ffji ffjiVar) {
        return obj == null ? ffne.a : new ffnk(new ffnv(obj), ffjiVar);
    }
}
