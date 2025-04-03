package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehtn extends ehtd {
    public EditText a;
    private int b;
    private final View.OnClickListener c;

    public ehtn(ehtc ehtcVar, int i) {
        super(ehtcVar);
        this.b = R.drawable.design_password_eye;
        this.c = new View.OnClickListener() { // from class: ehtm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ehtn ehtnVar = ehtn.this;
                EditText editText = ehtnVar.a;
                if (editText == null) {
                    return;
                }
                int selectionEnd = editText.getSelectionEnd();
                if (ehtnVar.k()) {
                    ehtnVar.a.setTransformationMethod(null);
                } else {
                    ehtnVar.a.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    ehtnVar.a.setSelection(selectionEnd);
                }
                ehtnVar.x();
            }
        };
        if (i != 0) {
            this.b = i;
        }
    }

    @Override // defpackage.ehtd
    public final int a() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.ehtd
    public final int b() {
        return this.b;
    }

    @Override // defpackage.ehtd
    public final View.OnClickListener c() {
        return this.c;
    }

    @Override // defpackage.ehtd
    public final void g(EditText editText) {
        this.a = editText;
        x();
    }

    @Override // defpackage.ehtd
    public final void i() {
        EditText editText = this.a;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.a.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.ehtd
    public final void j() {
        EditText editText = this.a;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean k() {
        EditText editText = this.a;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // defpackage.ehtd
    public final boolean s() {
        return true;
    }

    @Override // defpackage.ehtd
    public final boolean t() {
        return !k();
    }

    @Override // defpackage.ehtd
    public final void y() {
        x();
    }
}
