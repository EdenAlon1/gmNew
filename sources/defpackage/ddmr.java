package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import com.google.android.apps.messaging.ui.generic.spannedautocomplete.SpannedMultiAutoCompleteTextView;
import com.google.android.apps.messaging.ui.search.ZeroStateSearchBox;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddmr extends cxpt {
    final /* synthetic */ ZeroStateSearchBox a;

    public ddmr(ZeroStateSearchBox zeroStateSearchBox) {
        this.a = zeroStateSearchBox;
    }

    @Override // defpackage.cxpt, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView;
        ViewPropertyAnimator viewPropertyAnimator;
        final ZeroStateSearchBox zeroStateSearchBox = this.a;
        if (zeroStateSearchBox.a != null && (spannedMultiAutoCompleteTextView = zeroStateSearchBox.d) != null) {
            if (TextUtils.isEmpty(spannedMultiAutoCompleteTextView.getText()) || zeroStateSearchBox.a.getVisibility() == 8) {
                if (TextUtils.isEmpty(zeroStateSearchBox.d.getText())) {
                    zeroStateSearchBox.c = true;
                    zeroStateSearchBox.b = zeroStateSearchBox.a.animate();
                    zeroStateSearchBox.b.alpha(0.0f).withEndAction(new Runnable() { // from class: ddmh
                        @Override // java.lang.Runnable
                        public final void run() {
                            ZeroStateSearchBox zeroStateSearchBox2 = ZeroStateSearchBox.this;
                            zeroStateSearchBox2.c = false;
                            zeroStateSearchBox2.a.setVisibility(8);
                        }
                    });
                } else {
                    zeroStateSearchBox.a.setVisibility(0);
                    zeroStateSearchBox.a.setAlpha(0.0f);
                    zeroStateSearchBox.b = zeroStateSearchBox.a.animate();
                    zeroStateSearchBox.b.alpha(1.0f);
                }
            } else if (zeroStateSearchBox.c && (viewPropertyAnimator = zeroStateSearchBox.b) != null) {
                viewPropertyAnimator.cancel();
                zeroStateSearchBox.a.setAlpha(1.0f);
            }
        }
        ZeroStateSearchBox zeroStateSearchBox2 = this.a;
        if (zeroStateSearchBox2.e == null) {
            return;
        }
        Editable editableText = zeroStateSearchBox2.d.getEditableText();
        int length = editableText.length();
        String charSequence2 = editableText.subSequence(zeroStateSearchBox2.d.d.findTokenStart(editableText, length), length).toString();
        zeroStateSearchBox2.e.t(charSequence2);
        zeroStateSearchBox2.n = !zeroStateSearchBox2.n && i3 < i2 && TextUtils.isEmpty(charSequence2);
    }
}
