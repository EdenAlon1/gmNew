package defpackage;

import android.view.View;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebaf implements View.OnAttachStateChangeListener {
    final /* synthetic */ ebai a;

    public ebaf(ebai ebaiVar) {
        this.a = ebaiVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ebai ebaiVar = this.a;
        ((ebbg) ebaiVar.a).b.c(ebaiVar.c);
        ebai ebaiVar2 = this.a;
        ebaiVar2.b.c.f(ebaiVar2.d);
        ebai ebaiVar3 = this.a;
        emxc emxcVar = ((ebbg) ebaiVar3.a).h;
        ebaiVar3.c();
        final ebai ebaiVar4 = this.a;
        emxc emxcVar2 = ((ebbg) ebaiVar4.a).h;
        final boolean z = false;
        ebpa.a(new Runnable(z) { // from class: ebae
            public final /* synthetic */ boolean b = false;

            @Override // java.lang.Runnable
            public final void run() {
                ebai ebaiVar5 = ebai.this;
                SelectedAccountDisc selectedAccountDisc = ebaiVar5.b;
                selectedAccountDisc.c.setVisibility(0);
                selectedAccountDisc.b.setVisibility(8);
                final AccountParticleDisc accountParticleDisc = selectedAccountDisc.c;
                accountParticleDisc.getClass();
                selectedAccountDisc.post(new Runnable() { // from class: eazx
                    @Override // java.lang.Runnable
                    public final void run() {
                        AccountParticleDisc.this.requestLayout();
                    }
                });
                ebaiVar5.b();
            }
        });
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ebai ebaiVar = this.a;
        ebbg ebbgVar = (ebbg) ebaiVar.a;
        emxc emxcVar = ebbgVar.h;
        ebbgVar.b.d(ebaiVar.c);
        ebai ebaiVar2 = this.a;
        ebaiVar2.b.c.k(ebaiVar2.d);
    }
}
