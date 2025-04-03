package defpackage;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oms extends onm {
    private EditText ag;
    private CharSequence ah;
    private final Runnable ai = new omr(this);
    private long aj = -1;

    private final EditTextPreference aZ() {
        return (EditTextPreference) aY();
    }

    private final void ba(boolean z) {
        this.aj = z ? SystemClock.currentThreadTimeMillis() : -1L;
    }

    @Override // defpackage.onm
    protected final void aT(View view) {
        super.aT(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.ag = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.ag.setText(this.ah);
        EditText editText2 = this.ag;
        editText2.setSelection(editText2.getText().length());
        aZ();
    }

    @Override // defpackage.onm
    public final void aU(boolean z) {
        if (z) {
            String obj = this.ag.getText().toString();
            EditTextPreference aZ = aZ();
            if (aZ.Q(obj)) {
                aZ.i(obj);
            }
        }
    }

    @Override // defpackage.onm
    protected final void aV() {
        ba(true);
        aW();
    }

    final void aW() {
        long j = this.aj;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.ag;
        if (editText == null || !editText.isFocused()) {
            ba(false);
        } else if (((InputMethodManager) this.ag.getContext().getSystemService("input_method")).showSoftInput(this.ag, 0)) {
            ba(false);
        } else {
            this.ag.removeCallbacks(this.ai);
            this.ag.postDelayed(this.ai, 50L);
        }
    }

    @Override // defpackage.onm
    protected final boolean aX() {
        return true;
    }

    @Override // defpackage.onm, defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        if (bundle == null) {
            this.ah = aZ().g;
        } else {
            this.ah = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // defpackage.onm, defpackage.dn, defpackage.ea
    public final void k(Bundle bundle) {
        super.k(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.ah);
    }
}
