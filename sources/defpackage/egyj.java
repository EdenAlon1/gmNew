package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egyj implements TextWatcher {
    private CharSequence a;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        CharSequence charSequence = this.a;
        if (charSequence != editable) {
            egyl.a(charSequence);
        }
        this.a = null;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a = charSequence;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
