package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.CheckBox;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efpn implements TextWatcher {
    final /* synthetic */ int a;
    final /* synthetic */ CheckBox b;
    final /* synthetic */ efpr c;

    public efpn(efpr efprVar, int i, CheckBox checkBox) {
        this.a = i;
        this.b = checkBox;
        this.c = efprVar;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String trim = charSequence.toString().trim();
        if (TextUtils.isEmpty(trim)) {
            return;
        }
        efpr efprVar = this.c;
        efprVar.a[this.a] = true;
        this.b.setChecked(true);
        efpr efprVar2 = this.c;
        efprVar2.b = trim;
        efprVar2.c.a(new efpp(efprVar2.b, efprVar2.a));
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
