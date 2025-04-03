package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebtr implements erqj {
    final /* synthetic */ quc a;

    public ebtr(quc qucVar) {
        this.a = qucVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.c((Bitmap) obj);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        this.a.f(th instanceof Exception ? (Exception) th : new Exception(th));
    }
}
