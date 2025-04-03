package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efyi implements TextWatcher {
    final /* synthetic */ efyj a;

    public efyi(efyj efyjVar) {
        this.a = efyjVar;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence.toString().isEmpty()) {
            efzi efziVar = this.a.an;
            efziVar.e = 1;
            if (efziVar.b.g() && ((egfn) efziVar.b.c()).a().g()) {
                efziVar.b();
            } else {
                efziVar.a();
            }
        }
        if (i3 > 0) {
            this.a.an.c(charSequence.toString());
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
