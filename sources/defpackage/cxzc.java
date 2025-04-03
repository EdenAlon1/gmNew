package defpackage;

import android.view.ViewTreeObserver;
import defpackage.cxze;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxzc implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ cxze b;

    public cxzc(cxze cxzeVar, Map.Entry entry) {
        this.a = entry;
        this.b = cxzeVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        cxze cxzeVar = this.b;
        cxzeVar.n = true;
        ellj.g(new cxze.d(), cxzeVar.k);
        cxze cxzeVar2 = this.b;
        cxyq cxyqVar = cxzeVar2.o;
        cxyqVar.getClass();
        cxyqVar.d(new cxzb(this, this.a), cxzeVar2.b().a());
        this.b.k.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
