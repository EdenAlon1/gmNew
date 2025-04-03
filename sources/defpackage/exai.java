package defpackage;

import android.text.Spanned;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class exai implements Runnable {
    public final WeakReference a;
    public final exaj b;
    public final Spanned c;
    private final ewyw d;

    public exai(TextView textView, exaj exajVar, ewyw ewywVar, Spanned spanned) {
        this.a = new WeakReference(textView);
        this.b = exajVar;
        this.d = ewywVar;
        this.c = spanned;
    }

    @Override // java.lang.Runnable
    public final void run() {
        exap.b.execute(new exah(this, this.b.a.b.a(this.d)));
    }
}
