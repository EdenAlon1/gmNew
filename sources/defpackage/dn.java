package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dn extends ea implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler ag;
    private boolean am;
    private boolean ao;
    private boolean ap;
    private boolean aq;
    public Dialog d;
    private final Runnable ah = new di(this);
    private final DialogInterface.OnCancelListener ai = new dj(this);
    public final DialogInterface.OnDismissListener a = new dk(this);
    private int aj = 0;
    public int b = 0;
    private boolean ak = true;
    public boolean c = true;
    private int al = -1;
    private final llh an = new dl(this);
    public boolean e = false;

    private final void aT(boolean z, boolean z2, boolean z3) {
        if (this.ap) {
            return;
        }
        this.ap = true;
        this.aq = false;
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.d.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.ag.getLooper()) {
                    onDismiss(this.d);
                } else {
                    this.ag.post(this.ah);
                }
            }
        }
        this.ao = true;
        if (this.al < 0) {
            cg cgVar = new cg(J());
            cgVar.B();
            cgVar.n(this);
            if (z3) {
                cgVar.c();
                return;
            } else if (z) {
                cgVar.k();
                return;
            } else {
                cgVar.j();
                return;
            }
        }
        if (z3) {
            fr J = J();
            int i = this.al;
            if (i < 0) {
                throw new IllegalArgumentException(a.h(i, "Bad id: "));
            }
            J.ak(null, i, 1);
        } else {
            fr J2 = J();
            int i2 = this.al;
            if (i2 < 0) {
                throw new IllegalArgumentException(a.h(i2, "Bad id: "));
            }
            J2.N(new fn(J2, null, i2), z);
        }
        this.al = -1;
    }

    public final void dismissAllowingStateLoss() {
        aT(true, false, false);
    }

    public final void f() {
        aT(false, false, true);
    }

    @Override // defpackage.ea
    public void g(Context context) {
        super.g(context);
        this.ab.g(this.an);
        if (this.aq) {
            return;
        }
        this.ap = false;
    }

    @Override // defpackage.ea
    public LayoutInflater gI(Bundle bundle) {
        LayoutInflater aO = aO();
        if (this.c && !this.am) {
            if (!this.e) {
                try {
                    this.am = true;
                    Dialog hf = hf(bundle);
                    this.d = hf;
                    if (this.c) {
                        r(hf, this.aj);
                        Context z = z();
                        if (z instanceof Activity) {
                            this.d.setOwnerActivity((Activity) z);
                        }
                        this.d.setCancelable(this.ak);
                        this.d.setOnCancelListener(this.ai);
                        this.d.setOnDismissListener(this.a);
                        this.e = true;
                    } else {
                        this.d = null;
                    }
                } finally {
                    this.am = false;
                }
            }
            if (fr.af(2)) {
                Log.d("FragmentManager", a.i(this, "get layout inflater for DialogFragment ", " from dialog context"));
            }
            Dialog dialog = this.d;
            if (dialog != null) {
                return aO.cloneInContext(dialog.getContext());
            }
        } else if (fr.af(2)) {
            toString();
            String concat = "getting layout inflater for DialogFragment ".concat(toString());
            if (!this.c) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(concat));
                return aO;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(concat));
        }
        return aO;
    }

    public final Dialog getDialog() {
        return this.d;
    }

    public final boolean getShowsDialog() {
        return this.c;
    }

    @Override // defpackage.ea
    public final ek gn() {
        return new dm(this, new dr(this));
    }

    @Override // defpackage.ea
    public void h(Bundle bundle) {
        super.h(bundle);
        this.ag = new Handler();
        this.c = this.G == 0;
        if (bundle != null) {
            this.aj = bundle.getInt("android:style", 0);
            this.b = bundle.getInt("android:theme", 0);
            this.ak = bundle.getBoolean("android:cancelable", true);
            this.c = bundle.getBoolean("android:showsDialog", this.c);
            this.al = bundle.getInt("android:backStackId", -1);
        }
    }

    public Dialog hf(Bundle bundle) {
        if (fr.af(3)) {
            toString();
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment ".concat(toString()));
        }
        return new abg(A(), this.b);
    }

    public final Dialog hn() {
        Dialog dialog = this.d;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException(a.i(this, "DialogFragment ", " does not have a Dialog."));
    }

    public void hw() {
        aT(false, false, false);
    }

    @Override // defpackage.ea
    public void i() {
        super.i();
        Dialog dialog = this.d;
        if (dialog != null) {
            this.ao = true;
            dialog.setOnDismissListener(null);
            this.d.dismiss();
            if (!this.ap) {
                onDismiss(this.d);
            }
            this.d = null;
            this.e = false;
        }
    }

    @Override // defpackage.ea
    public void j() {
        super.j();
        if (!this.aq && !this.ap) {
            this.ap = true;
        }
        this.ab.k(this.an);
    }

    @Override // defpackage.ea
    public void k(Bundle bundle) {
        Dialog dialog = this.d;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.aj;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        if (!this.ak) {
            bundle.putBoolean("android:cancelable", false);
        }
        if (!this.c) {
            bundle.putBoolean("android:showsDialog", false);
        }
        int i3 = this.al;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // defpackage.ea
    public void l() {
        super.l();
        Dialog dialog = this.d;
        if (dialog != null) {
            this.ao = false;
            dialog.show();
            View decorView = this.d.getWindow().getDecorView();
            lmz.b(decorView, this);
            lna.b(decorView, this);
            oxa.b(decorView, this);
        }
    }

    @Override // defpackage.ea
    public void m() {
        super.m();
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // defpackage.ea
    public final void n(Bundle bundle) {
        Bundle bundle2;
        super.n(bundle);
        if (this.d == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.d.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.ea
    public final void o(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.o(layoutInflater, viewGroup, bundle);
        if (this.Q != null || this.d == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.d.onRestoreInstanceState(bundle2);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.ao) {
            return;
        }
        if (fr.af(3)) {
            toString();
            Log.d("FragmentManager", "onDismiss called for DialogFragment ".concat(toString()));
        }
        aT(true, true, false);
    }

    public final void p(boolean z) {
        this.ak = z;
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public final void q(int i, int i2) {
        if (fr.af(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i + ", " + i2);
        }
        this.aj = i;
        this.b = i2;
    }

    public void r(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public final void s(fr frVar, String str) {
        this.ap = false;
        this.aq = true;
        cg cgVar = new cg(frVar);
        cgVar.B();
        cgVar.u(this, str);
        cgVar.j();
    }

    public final void t(fr frVar, String str) {
        this.ap = false;
        this.aq = true;
        cg cgVar = new cg(frVar);
        cgVar.B();
        cgVar.u(this, str);
        cgVar.c();
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
