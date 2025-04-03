package defpackage;

import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lhm {
    public final EditText a;
    public final lhx b;

    public lhm(EditText editText) {
        this.a = editText;
        lhx lhxVar = new lhx(editText);
        this.b = lhxVar;
        editText.addTextChangedListener(lhxVar);
        editText.setEditableFactory(lhn.a());
    }
}
