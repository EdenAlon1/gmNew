package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dqtv implements ffxy, ffke {
    final /* synthetic */ dqtz a;

    public dqtv(dqtz dqtzVar) {
        this.a = dqtzVar;
    }

    @Override // defpackage.ffke
    public final ffbv b() {
        return new ffju(2, this.a, dqtz.class, "onRecyclerViewWidthChanged", "onRecyclerViewWidthChanged(I)V", 4);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ffxy) && (obj instanceof ffke)) {
            return ffkj.e(b(), ((ffke) obj).b());
        }
        return false;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        int intValue = ((Number) obj).intValue();
        dqtz dqtzVar = this.a;
        Context A = dqtzVar.A();
        dqtzVar.p().M(A, intValue);
        dqtzVar.q().M(A, intValue);
        GridLayoutManager gridLayoutManager = dqtzVar.an;
        if (gridLayoutManager != null) {
            gridLayoutManager.r(dqtzVar.p().h);
        }
        dqth dqthVar = dqtzVar.aq;
        if (dqthVar == null) {
            ffkj.c("views");
            dqthVar = null;
        }
        dqthVar.a.ao(dqtzVar.p().h * 12);
        return ffcu.a;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
