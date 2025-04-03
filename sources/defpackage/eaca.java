package defpackage;

import android.text.Selection;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class eaca extends fgsy {
    private boolean a = false;

    @Override // defpackage.fgsy
    protected final void a(TextView textView, ClickableSpan clickableSpan, Spannable spannable) {
        if (this.a) {
            return;
        }
        this.a = true;
        Selection.setSelection(spannable, spannable.getSpanStart(clickableSpan), spannable.getSpanEnd(clickableSpan));
    }

    @Override // defpackage.fgsy
    protected final void b(TextView textView) {
        if (this.a) {
            this.a = false;
            Selection.removeSelection((Spannable) textView.getText());
        }
    }
}
