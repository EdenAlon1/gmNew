package defpackage;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lhp extends lgg implements Runnable {
    private final Reference a;
    private final Reference b;

    public lhp(TextView textView, lhq lhqVar) {
        this.a = new WeakReference(textView);
        this.b = new WeakReference(lhqVar);
    }

    @Override // defpackage.lgg
    public final void b() {
        Handler handler;
        TextView textView = (TextView) this.a.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputFilter[] filters;
        CharSequence text;
        CharSequence d;
        TextView textView = (TextView) this.a.get();
        InputFilter inputFilter = (InputFilter) this.b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (!textView.isAttachedToWindow() || text == (d = lgl.c().d((text = textView.getText())))) {
                    return;
                }
                int selectionStart = Selection.getSelectionStart(d);
                int selectionEnd = Selection.getSelectionEnd(d);
                textView.setText(d);
                if (d instanceof Spannable) {
                    lhq.a((Spannable) d, selectionStart, selectionEnd);
                    return;
                }
                return;
            }
        }
    }
}
