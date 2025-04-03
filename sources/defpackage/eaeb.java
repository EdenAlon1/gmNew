package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eaeb extends pbt {
    final /* synthetic */ eaec b;

    public eaeb(eaec eaecVar) {
        this.b = eaecVar;
    }

    @Override // defpackage.pbt
    public final void b(Drawable drawable) {
        this.b.b.post(new Runnable() { // from class: eaea
            @Override // java.lang.Runnable
            public final void run() {
                eaeb.this.b.c.start();
            }
        });
    }
}
