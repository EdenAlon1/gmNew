package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efry implements TextWatcher {
    final /* synthetic */ List a;
    final /* synthetic */ int b;
    final /* synthetic */ efsb c;

    public efry(efsb efsbVar, List list, int i) {
        this.a = list;
        this.b = i;
        this.c = efsbVar;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String trim = charSequence.toString().trim();
        if (TextUtils.isEmpty(trim)) {
            return;
        }
        this.c.a.a(new efsa(4, trim, ((fagx) this.a.get(this.b)).d));
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
