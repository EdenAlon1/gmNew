package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecbi extends ea implements eboc {
    private boolean ag;
    public ecbm b;
    public ecbh d;
    public boolean e;
    public boolean a = false;
    public final ebod c = new ebod(this);

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.M(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(R.layout.gm_tooltip_fragment, viewGroup);
    }

    public final void a() {
        ecbm ecbmVar = this.b;
        if (ecbmVar != null) {
            ecbmVar.a();
            this.b = null;
        }
        e();
    }

    @Override // defpackage.ea
    public final void ai() {
        ecbh ecbhVar;
        ecbm ecbmVar = this.b;
        if (ecbmVar != null) {
            ecbmVar.a();
        }
        if (!this.e && (ecbhVar = this.d) != null) {
            ((ecbc) ((ecbb) ecbhVar).a).d.onDismiss();
        }
        super.ai();
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) {
        if (this.ag && !this.a) {
            e();
        }
        this.c.c(new Runnable() { // from class: ecbd
            @Override // java.lang.Runnable
            public final void run() {
                final ecbi ecbiVar = ecbi.this;
                ecbh ecbhVar = ecbiVar.d;
                ecbhVar.getClass();
                ecbb ecbbVar = (ecbb) ecbhVar;
                ecbiVar.b = new ecbm(ecbbVar.b, ecbbVar.a, new PopupWindow.OnDismissListener() { // from class: ecbe
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        ecbi.this.e();
                    }
                });
                View rootView = ((SelectedAccountDisc) ((ecbb) ecbiVar.d).b).c.getRootView();
                rootView.getViewTreeObserver().addOnGlobalLayoutListener(new ecbg(ecbiVar, rootView));
                rootView.requestLayout();
            }
        });
    }

    @Override // defpackage.eboc
    public final boolean b() {
        return this.d != null;
    }

    public final void e() {
        if (G() == null || G().isFinishing() || !aF() || this.s) {
            return;
        }
        cg cgVar = new cg(J());
        cgVar.n(this);
        cgVar.k();
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        this.a = bundle != null && bundle.getBoolean("SHOW_STATE_KEY");
        this.ag = bundle != null;
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        bundle.putBoolean("SHOW_STATE_KEY", this.a);
        this.e = true;
    }
}
