package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehsz {
    final /* synthetic */ ehtc a;

    public ehsz(ehtc ehtcVar) {
        this.a = ehtcVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        ehtc ehtcVar = this.a;
        EditText editText = ehtcVar.j;
        if (editText == textInputLayout.c) {
            return;
        }
        if (editText != null) {
            editText.removeTextChangedListener(ehtcVar.k);
            if (this.a.j.getOnFocusChangeListener() == this.a.c().d()) {
                this.a.j.setOnFocusChangeListener(null);
            }
        }
        ehtc ehtcVar2 = this.a;
        ehtcVar2.j = textInputLayout.c;
        EditText editText2 = ehtcVar2.j;
        if (editText2 != null) {
            editText2.addTextChangedListener(ehtcVar2.k);
        }
        ehtc ehtcVar3 = this.a;
        ehtcVar3.c().g(ehtcVar3.j);
        ehtc ehtcVar4 = this.a;
        ehtcVar4.n(ehtcVar4.c());
    }
}
