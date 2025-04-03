package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kbg implements ipn {
    final /* synthetic */ kbs a;
    final /* synthetic */ iui b;

    public kbg(kbs kbsVar, iui iuiVar) {
        this.a = kbsVar;
        this.b = iuiVar;
    }

    private final int f(int i) {
        kbs kbsVar = this.a;
        kbsVar.measure(kbs.n(0, i, kbsVar.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return this.a.getMeasuredHeight();
    }

    private final int g(int i) {
        this.a.measure(View.MeasureSpec.makeMeasureSpec(0, 0), kbs.n(0, i, this.a.getLayoutParams().height));
        return this.a.getMeasuredWidth();
    }

    @Override // defpackage.ipn
    public final int a(iny inyVar, List list, int i) {
        return f(i);
    }

    @Override // defpackage.ipn
    public final int b(iny inyVar, List list, int i) {
        return g(i);
    }

    @Override // defpackage.ipn
    public final int c(iny inyVar, List list, int i) {
        return f(i);
    }

    @Override // defpackage.ipn
    public final int d(iny inyVar, List list, int i) {
        return g(i);
    }

    @Override // defpackage.ipn
    public final ipo e(ipq ipqVar, List list, long j) {
        ipo ei;
        ipo ei2;
        if (this.a.getChildCount() == 0) {
            ei2 = ipqVar.ei(jzk.d(j), jzk.c(j), ffem.a, kbe.a);
            return ei2;
        }
        if (jzk.d(j) != 0) {
            this.a.getChildAt(0).setMinimumWidth(jzk.d(j));
        }
        if (jzk.c(j) != 0) {
            this.a.getChildAt(0).setMinimumHeight(jzk.c(j));
        }
        kbs kbsVar = this.a;
        kbsVar.measure(kbs.n(jzk.d(j), jzk.b(j), kbsVar.getLayoutParams().width), kbs.n(jzk.c(j), jzk.a(j), this.a.getLayoutParams().height));
        kbs kbsVar2 = this.a;
        ei = ipqVar.ei(kbsVar2.getMeasuredWidth(), kbsVar2.getMeasuredHeight(), ffem.a, new kbf(kbsVar2, this.b));
        return ei;
    }
}
