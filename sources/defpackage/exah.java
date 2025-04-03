package defpackage;

import android.util.Log;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class exah implements Runnable {
    final /* synthetic */ ewyx a;
    final /* synthetic */ exai b;

    public exah(exai exaiVar, ewyx ewyxVar) {
        this.a = ewyxVar;
        this.b = exaiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView = (TextView) this.b.a.get();
        if (textView == null) {
            return;
        }
        exai exaiVar = this.b;
        if (textView.getText() != exaiVar.c) {
            Log.d("TextLinks", "Text has changed from the classified text. Ignoring.");
        } else {
            exaiVar.b.b(textView, this.a);
        }
    }
}
