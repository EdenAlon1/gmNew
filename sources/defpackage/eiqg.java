package defpackage;

import android.content.ContextWrapper;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eiqg extends ClickableSpan {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        eiqe eiqeVar;
        if (view instanceof eiqf) {
            ((eiqf) view).i();
        }
        Object context = view.getContext();
        while (true) {
            if (!(context instanceof eiqe)) {
                if (!(context instanceof ContextWrapper)) {
                    eiqeVar = null;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                eiqeVar = (eiqe) context;
                break;
            }
        }
        if (eiqeVar != null) {
            eiqeVar.a();
            view.cancelPendingInputEvents();
        } else {
            Log.w("LinkSpan", "Dropping click event. No listener attached.");
        }
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            if (text instanceof Spannable) {
                Selection.setSelection((Spannable) text, 0);
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
