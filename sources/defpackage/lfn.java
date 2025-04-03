package defpackage;

import android.os.Handler;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lfn extends les implements Runnable {
    private final Reference a;

    public lfn(TextView textView) {
        this.a = new WeakReference(textView);
    }

    @Override // defpackage.les
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
        TextView textView = (TextView) this.a.get();
        if (textView != null && textView.isAttachedToWindow()) {
            CharSequence c = lew.b().c(textView.getText());
            int selectionStart = Selection.getSelectionStart(c);
            int selectionEnd = Selection.getSelectionEnd(c);
            textView.setText(c);
            if (c instanceof Spannable) {
                lfo.a((Spannable) c, selectionStart, selectionEnd);
            }
        }
    }
}
