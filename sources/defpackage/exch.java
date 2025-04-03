package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exch implements PopupWindow.OnDismissListener {
    private final TextView a;
    private final ViewTreeObserver b;
    private final exci c;
    private final exce d;
    private final exce e;

    public exch(TextView textView, exci exciVar, exce exceVar, exce exceVar2) {
        this.a = textView;
        ViewTreeObserver viewTreeObserver = textView.getViewTreeObserver();
        this.b = viewTreeObserver;
        this.c = exciVar;
        viewTreeObserver.addOnPreDrawListener(exciVar);
        viewTreeObserver.addOnWindowFocusChangeListener(exciVar);
        viewTreeObserver.addOnGlobalFocusChangeListener(exciVar);
        viewTreeObserver.addOnWindowAttachListener(exciVar);
        this.d = exceVar;
        this.e = exceVar2;
        textView.setCustomSelectionActionModeCallback(exceVar);
        textView.setCustomInsertionActionModeCallback(exceVar2);
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        excj.d(this.a);
        this.b.removeOnPreDrawListener(this.c);
        this.b.removeOnWindowFocusChangeListener(this.c);
        this.b.removeOnGlobalFocusChangeListener(this.c);
        this.b.removeOnWindowAttachListener(this.c);
        TextView textView = this.a;
        exce exceVar = this.d;
        if (exceVar == textView.getCustomSelectionActionModeCallback()) {
            this.a.setCustomSelectionActionModeCallback(exceVar.a);
        }
        if (this.e == this.a.getCustomInsertionActionModeCallback()) {
            this.a.setCustomInsertionActionModeCallback(this.e.a);
        }
    }
}
