package defpackage;

import android.text.Editable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehsy extends ehiy {
    final /* synthetic */ ehtc a;

    public ehsy(ehtc ehtcVar) {
        this.a = ehtcVar;
    }

    @Override // defpackage.ehiy, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.c().l();
    }

    @Override // defpackage.ehiy, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.c().y();
    }
}
