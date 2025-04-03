package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebjd implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ecba a;
    final /* synthetic */ View b;
    final /* synthetic */ lkr c;
    final /* synthetic */ fr d;
    final /* synthetic */ emxc e;
    final /* synthetic */ ebjg f;

    public ebjd(ebjg ebjgVar, ecba ecbaVar, View view, lkr lkrVar, fr frVar, emxc emxcVar) {
        this.a = ecbaVar;
        this.b = view;
        this.c = lkrVar;
        this.d = frVar;
        this.e = emxcVar;
        this.f = ebjgVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (ecaz.a(this.a)) {
            ebot.a(this.b, this);
            this.f.b(this.c, this.d, this.a);
        }
    }
}
