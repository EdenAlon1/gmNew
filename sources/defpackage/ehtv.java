package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ehtv extends ktb {
    private final TextInputLayout a;

    public ehtv(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // defpackage.ktb
    public void c(View view, kxu kxuVar) {
        TextView textView;
        super.c(view, kxuVar);
        EditText editText = this.a.c;
        CharSequence charSequence = null;
        CharSequence text = editText != null ? editText.getText() : null;
        TextInputLayout textInputLayout = this.a;
        CharSequence d = textInputLayout.d();
        CharSequence c = textInputLayout.c();
        CharSequence charSequence2 = textInputLayout.j ? textInputLayout.i : null;
        int i = textInputLayout.f;
        if (textInputLayout.e && textInputLayout.g && (textView = textInputLayout.h) != null) {
            charSequence = textView.getContentDescription();
        }
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(d);
        boolean z = this.a.p;
        boolean isEmpty3 = TextUtils.isEmpty(c);
        boolean z2 = !isEmpty3;
        boolean z3 = (isEmpty3 && TextUtils.isEmpty(charSequence)) ? false : true;
        String charSequence3 = !isEmpty2 ? d.toString() : "";
        ehtp ehtpVar = this.a.a;
        if (ehtpVar.a.getVisibility() == 0) {
            kxuVar.D(ehtpVar.a);
            kxuVar.T(ehtpVar.a);
        } else {
            kxuVar.T(ehtpVar.c);
        }
        if (!isEmpty) {
            kxuVar.R(text);
        } else if (!TextUtils.isEmpty(charSequence3)) {
            kxuVar.R(charSequence3);
            if (!z && charSequence2 != null) {
                kxuVar.R(charSequence3 + ", " + charSequence2.toString());
            }
        } else if (charSequence2 != null) {
            kxuVar.R(charSequence2);
        }
        if (!TextUtils.isEmpty(charSequence3)) {
            kxuVar.C(charSequence3);
            kxuVar.O(isEmpty);
        }
        if (text == null || text.length() != i) {
            i = -1;
        }
        kxuVar.F(i);
        if (z3) {
            if (true != z2) {
                c = charSequence;
            }
            kxuVar.y(c);
        }
        View view2 = this.a.d.o;
        if (view2 != null) {
            kxuVar.D(view2);
        }
        this.a.b.c().v(kxuVar);
    }

    @Override // defpackage.ktb
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        super.d(view, accessibilityEvent);
        int i = TextInputLayout.s;
        this.a.b.c().w(accessibilityEvent);
    }
}
