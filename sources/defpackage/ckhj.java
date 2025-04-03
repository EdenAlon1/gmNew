package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckhj implements ckge {
    private final Map a = new HashMap();
    private final Map b = new HashMap();

    private final eqwf z(djrm djrmVar) {
        if (this.a.containsKey(djrmVar) && !((ArrayDeque) this.a.get(djrmVar)).isEmpty()) {
            ArrayDeque arrayDeque = (ArrayDeque) this.a.get(djrmVar);
            if (arrayDeque.size() != 1) {
                return (eqwf) arrayDeque.remove();
            }
            eqwf eqwfVar = (eqwf) arrayDeque.peek();
            if (eqwfVar != null) {
                return eqwfVar;
            }
        }
        return eqwf.BUGLE_LOADING_AVAILABILITY_IN_PROGRESS;
    }

    @Override // defpackage.ckge
    public final elfl a(ckgb ckgbVar) {
        return elfo.e(null);
    }

    @Override // defpackage.ckge
    public final elfl b(djrm djrmVar, ckgb ckgbVar) {
        return elfo.e(null);
    }

    @Override // defpackage.ckge
    public final eosr c() {
        return eosr.UNKNOWN_UNINITIALIZED_REASON;
    }

    @Override // defpackage.ckge
    public final eqwf d() {
        return z(null);
    }

    @Override // defpackage.ckge
    public final eqwf e(String str) {
        return z(new djro(str));
    }

    @Override // defpackage.ckge
    public final eqwf f(int i) {
        djrm djrmVar = (djrm) this.b.get(Integer.valueOf(i));
        return djrmVar != null ? z(djrmVar) : eqwf.BUGLE_LOADING_AVAILABILITY_IN_PROGRESS;
    }

    @Override // defpackage.ckge
    public final String g(eqwf eqwfVar, eosr eosrVar) {
        return "";
    }

    @Override // defpackage.ckge
    public final boolean q() {
        return d() == eqwf.AVAILABLE;
    }

    @Override // defpackage.ckge
    public final boolean r() {
        return d() == eqwf.DISABLED_FROM_PREFERENCES;
    }

    @Override // defpackage.ckge
    public final boolean s() {
        int ordinal = d().ordinal();
        if (ordinal != 1 && ordinal != 6 && ordinal != 10 && ordinal != 13 && ordinal != 21) {
            switch (ordinal) {
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    @Override // defpackage.ckge
    public final boolean t() {
        return d() == eqwf.DISABLED_VIA_GSERVICES;
    }

    @Override // defpackage.ckge
    public final int u() {
        return 3;
    }

    @Override // defpackage.ckge
    public final eqwf v(djrm djrmVar) {
        return z(djrmVar);
    }

    @Override // defpackage.ckge
    public final eqwf w(djrm djrmVar) {
        return z(djrmVar);
    }

    @Override // defpackage.ckge
    public final eqwf x() {
        return z(null);
    }

    @Override // defpackage.ckge
    @Deprecated
    public final void h(ckgc ckgcVar) {
    }

    @Override // defpackage.ckge
    public final void j() {
    }

    @Override // defpackage.ckge
    public final void k() {
    }

    @Override // defpackage.ckge
    @Deprecated
    public final void l(ckgc ckgcVar) {
    }

    @Override // defpackage.ckge
    public final void m() {
    }

    @Override // defpackage.ckge
    public final void n(ckgb ckgbVar) {
    }

    @Override // defpackage.ckge
    public final void o(ckgb ckgbVar) {
    }

    @Override // defpackage.ckge
    public final void y() {
    }

    @Override // defpackage.ckge
    public final void i(ckgc ckgcVar, Executor executor) {
    }

    @Override // defpackage.ckge
    public final void p(djrm djrmVar, ckgb ckgbVar) {
    }
}
