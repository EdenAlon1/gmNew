package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqmp implements TextWatcher {
    final /* synthetic */ dqmq a;

    public dqmp(dqmq dqmqVar) {
        this.a = dqmqVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Iterator it = this.a.d.iterator();
        while (it.hasNext()) {
            ((dqnl) it.next()).a(String.valueOf(editable));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
