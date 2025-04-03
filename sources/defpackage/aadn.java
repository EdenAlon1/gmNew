package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aadn implements dnal {
    final /* synthetic */ aaee a;

    public aadn(aaee aaeeVar) {
        this.a = aaeeVar;
    }

    @Override // defpackage.dnal
    public final void a(Uri uri, int i, int i2) {
        this.a.k.a(uri, i, i2);
    }

    @Override // defpackage.dnal
    public final void b(qwp qwpVar, Object obj) {
        fgcm fgcmVar;
        this.a.k.b(qwpVar, obj);
        if ((obj instanceof Uri) && (fgcmVar = (fgcm) this.a.s.get(obj)) != null) {
            fgcmVar.f(true);
        }
        this.a.l.a(qwpVar, obj, 1);
        this.a.m.b(qwpVar, obj);
    }

    @Override // defpackage.dnal
    public final void c(Uri uri) {
        this.a.m.c(uri);
    }

    @Override // defpackage.dnal
    public final void d(Drawable drawable, Object obj) {
        this.a.k.d(drawable, obj);
        this.a.m.d(drawable, obj);
    }
}
