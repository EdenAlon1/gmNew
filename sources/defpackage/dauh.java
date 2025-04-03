package defpackage;

import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dauh implements dauu {
    final /* synthetic */ TextView a;

    public dauh(TextView textView) {
        this.a = textView;
    }

    @Override // defpackage.dauu
    public final void a() {
        final TextView textView = this.a;
        efbd.e(new Runnable() { // from class: dauf
            @Override // java.lang.Runnable
            public final void run() {
                textView.setText("Result: unverified");
            }
        });
    }

    @Override // defpackage.dauu
    public final void b() {
        final TextView textView = this.a;
        efbd.e(new Runnable() { // from class: daug
            @Override // java.lang.Runnable
            public final void run() {
                textView.setText("Result: verified");
            }
        });
    }
}
