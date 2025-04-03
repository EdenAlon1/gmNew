package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebpx extends kc implements eboc {
    public ebrs ai;
    public ebry aj;
    public ExpressSignInLayout ak;
    public Runnable am;
    public final ebod ag = new ebod(this);
    public final abo ah = new ebpv(this);
    public boolean al = true;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.express_sign_in_dialog, viewGroup);
        ExpressSignInLayout expressSignInLayout = (ExpressSignInLayout) inflate.findViewById(R.id.express_sign_in_modal);
        this.ak = expressSignInLayout;
        final Runnable runnable = new Runnable() { // from class: ebpt
            @Override // java.lang.Runnable
            public final void run() {
                ebpx.this.hw();
            }
        };
        expressSignInLayout.d(new ebqh() { // from class: ebqg
            @Override // defpackage.ebqh
            public final void a(ebrp ebrpVar) {
                ebrpVar.u = runnable;
            }
        });
        if (this.al) {
            inflate.findViewById(R.id.touch_outside).setOnClickListener(new View.OnClickListener() { // from class: ebpu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ebpx.this.aT();
                }
            });
        }
        kvo.p(this.ak, new ebpw(this));
        return inflate;
    }

    public final void aT() {
        ExpressSignInLayout expressSignInLayout = this.ak;
        if (expressSignInLayout != null) {
            expressSignInLayout.d(new ebqh() { // from class: ebpz
                @Override // defpackage.ebqh
                public final void a(ebrp ebrpVar) {
                    ebrpVar.i();
                }
            });
        }
        hw();
        Runnable runnable = this.am;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.ea
    public final void ap(final View view, Bundle bundle) {
        this.ag.c(new Runnable() { // from class: ebpr
            @Override // java.lang.Runnable
            public final void run() {
                ebpx ebpxVar = ebpx.this;
                boolean z = false;
                if (ebpxVar.ai != null && ebpxVar.aj != null) {
                    z = true;
                }
                View view2 = view;
                emxf.b(z, "Post initialization code ran without being initialized");
                ExpressSignInLayout expressSignInLayout = (ExpressSignInLayout) view2.findViewById(R.id.express_sign_in_modal);
                expressSignInLayout.c(ebpxVar.ai, ebpxVar.aj, true, emxc.j((acd) ebpxVar.hn()));
                ebpxVar.ah.h(true);
                expressSignInLayout.findViewById(R.id.content_container).setOnTouchListener(new View.OnTouchListener() { // from class: ebps
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view3, MotionEvent motionEvent) {
                        return true;
                    }
                });
            }
        });
    }

    @Override // defpackage.eboc
    public final boolean b() {
        return (this.ai == null || this.aj == null) ? false : true;
    }

    @Override // defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        q(2, R.style.OneGoogle_ExpressSignInDialog);
    }

    @Override // defpackage.kc, defpackage.dn
    public final Dialog hf(Bundle bundle) {
        Dialog hf = super.hf(bundle);
        ((abg) hf).b.b(this, this.ah);
        return hf;
    }

    @Override // defpackage.dn
    public final void hw() {
        if (aF()) {
            if (aJ()) {
                super.dismissAllowingStateLoss();
            } else {
                super.hw();
            }
        }
    }

    @Override // defpackage.dn, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Runnable runnable = this.am;
        if (runnable != null) {
            runnable.run();
        }
    }
}
