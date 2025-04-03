package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ko extends kwf {
    final /* synthetic */ ks a;

    public ko(ks ksVar) {
        this.a = ksVar;
    }

    @Override // defpackage.kwf, defpackage.kwe
    public final void a() {
        View view;
        ks ksVar = this.a;
        if (ksVar.k && (view = ksVar.f) != null) {
            view.setTranslationY(0.0f);
            this.a.c.setTranslationY(0.0f);
        }
        this.a.c.setVisibility(8);
        this.a.c.a(false);
        ks ksVar2 = this.a;
        ksVar2.n = null;
        nb nbVar = ksVar2.i;
        if (nbVar != null) {
            nbVar.a(ksVar2.h);
            ksVar2.h = null;
            ksVar2.i = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.a.b;
        if (actionBarOverlayLayout != null) {
            int[] iArr = kvo.a;
            kvb.c(actionBarOverlayLayout);
        }
    }
}
