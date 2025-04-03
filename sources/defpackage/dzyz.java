package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.libraries.messaging.lighter.ui.composebox.ComposeBoxView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzyz implements TextWatcher {
    final /* synthetic */ ComposeBoxView a;
    final /* synthetic */ dzyw b;

    public dzyz(ComposeBoxView composeBoxView, dzyw dzywVar) {
        this.b = dzywVar;
        this.a = composeBoxView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.a.g.getText().toString().trim().isEmpty()) {
            this.b.a(true);
        } else {
            this.b.a(false);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
