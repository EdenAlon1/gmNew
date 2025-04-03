package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebvi extends eays {
    final /* synthetic */ View a;
    final /* synthetic */ int b;
    final /* synthetic */ ebvj c;

    public ebvi(ebvj ebvjVar, View view, int i) {
        this.a = view;
        this.b = i;
        this.c = ebvjVar;
    }

    @Override // defpackage.eays
    public final void b(final Object obj) {
        final View view = this.a;
        final int i = this.b;
        view.post(new Runnable() { // from class: ebvh
            @Override // java.lang.Runnable
            public final void run() {
                ebvi.this.c.a.b(view, i, obj);
            }
        });
    }
}
