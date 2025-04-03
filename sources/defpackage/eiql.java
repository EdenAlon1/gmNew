package defpackage;

import android.os.Build;
import android.view.ViewTreeObserver;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiql implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ TextView a;
    final /* synthetic */ eiqm b;

    public eiql(eiqm eiqmVar, TextView textView) {
        this.a = textView;
        this.b = eiqmVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        int lineCount = this.a.getLineCount();
        eiqm eiqmVar = this.b;
        if (lineCount <= eiqmVar.e) {
            return true;
        }
        this.a.setTextSize(0, eiqmVar.c);
        if (Build.VERSION.SDK_INT >= 28) {
            TextView textView = this.a;
            eiqm eiqmVar2 = this.b;
            textView.setLineHeight(Math.round(eiqmVar2.d + eiqmVar2.c));
        }
        this.a.invalidate();
        return false;
    }
}
