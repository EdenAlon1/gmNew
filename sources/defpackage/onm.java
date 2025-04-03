package defpackage;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.widget.TextView;
import androidx.preference.DialogPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class onm extends dn implements DialogInterface.OnClickListener {
    private DialogPreference ag;
    private CharSequence ah;
    private CharSequence ai;
    private CharSequence aj;
    public int ak;
    private CharSequence al;
    private int am;
    private BitmapDrawable an;

    protected void aT(View view) {
        int i;
        View findViewById = view.findViewById(R.id.message);
        if (findViewById != null) {
            CharSequence charSequence = this.al;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    public abstract void aU(boolean z);

    protected boolean aX() {
        return false;
    }

    public final DialogPreference aY() {
        if (this.ag == null) {
            this.ag = (DialogPreference) ((omm) E()).a(C().getString("key"));
        }
        return this.ag;
    }

    @Override // defpackage.dn, defpackage.ea
    public void h(Bundle bundle) {
        super.h(bundle);
        lkr E = E();
        if (!(E instanceof omm)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        omm ommVar = (omm) E;
        String string = C().getString("key");
        if (bundle != null) {
            this.ah = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.ai = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.aj = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.al = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.am = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.an = new BitmapDrawable(B(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) ommVar.a(string);
        this.ag = dialogPreference;
        this.ah = dialogPreference.a;
        this.ai = dialogPreference.d;
        this.aj = dialogPreference.e;
        this.al = dialogPreference.b;
        this.am = dialogPreference.f;
        Drawable drawable = dialogPreference.c;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.an = (BitmapDrawable) drawable;
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.an = new BitmapDrawable(B(), createBitmap);
    }

    @Override // defpackage.dn
    public final Dialog hf(Bundle bundle) {
        WindowInsetsController windowInsetsController;
        int ime;
        this.ak = -2;
        iu iuVar = new iu(A());
        iuVar.setTitle(this.ah);
        iuVar.b(this.an);
        iuVar.i(this.ai, this);
        iuVar.h(this.aj, this);
        A();
        int i = this.am;
        View inflate = i != 0 ? K().inflate(i, (ViewGroup) null) : null;
        if (inflate != null) {
            aT(inflate);
            iuVar.setView(inflate);
        } else {
            iuVar.c(this.al);
        }
        eT(iuVar);
        iv create = iuVar.create();
        if (aX()) {
            Window window = create.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                windowInsetsController = window.getDecorView().getWindowInsetsController();
                ime = WindowInsets.Type.ime();
                windowInsetsController.show(ime);
                return create;
            }
            aV();
        }
        return create;
    }

    @Override // defpackage.dn, defpackage.ea
    public void k(Bundle bundle) {
        super.k(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.ah);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.ai);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.aj);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.al);
        bundle.putInt("PreferenceDialogFragment.layout", this.am);
        BitmapDrawable bitmapDrawable = this.an;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.ak = i;
    }

    @Override // defpackage.dn, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        aU(this.ak == -1);
    }

    protected void aV() {
    }

    protected void eT(iu iuVar) {
    }
}
