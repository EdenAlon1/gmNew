package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class elbm implements TextView.OnEditorActionListener {
    public final /* synthetic */ elbx a;
    public final /* synthetic */ TextView.OnEditorActionListener b;
    public final /* synthetic */ String c;

    public /* synthetic */ elbm(elbx elbxVar, TextView.OnEditorActionListener onEditorActionListener, String str) {
        this.a = elbxVar;
        this.b = onEditorActionListener;
        this.c = str;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        TextView.OnEditorActionListener onEditorActionListener = this.b;
        if (ekyf.v()) {
            return onEditorActionListener.onEditorAction(textView, i, keyEvent);
        }
        ekzm b = this.a.b(this.c);
        try {
            boolean onEditorAction = onEditorActionListener.onEditorAction(textView, i, keyEvent);
            b.close();
            return onEditorAction;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
