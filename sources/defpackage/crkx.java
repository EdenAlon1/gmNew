package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crkx extends rhm {
    final /* synthetic */ crkw a;
    final /* synthetic */ crku b;
    final /* synthetic */ crkz c;

    public crkx(crkw crkwVar, crku crkuVar, crkz crkzVar) {
        this.a = crkwVar;
        this.b = crkuVar;
        this.c = crkzVar;
    }

    @Override // defpackage.rhm
    public final void d(Context context, qpt qptVar, qqk qqkVar) {
        context.getClass();
        qqkVar.g(emhv.class, InputStream.class, this.a);
        qqkVar.g(dnaw.class, InputStream.class, this.b);
        qqkVar.g(Uri.class, InputStream.class, this.c);
    }
}
