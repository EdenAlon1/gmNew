package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drza implements TextWatcher {
    final /* synthetic */ drzi a;

    public drza(drzi drziVar) {
        this.a = drziVar;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
        dtan d = this.a.d();
        if (d != null) {
            this.a.r(d, charSequence);
        }
        drzi.t(this.a, charSequence, false, 2);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
