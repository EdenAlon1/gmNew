package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class effc implements efgn {
    public static final TimeUnit a = TimeUnit.MILLISECONDS;
    public final Context b;
    public final eroh c;
    public final String d;
    public final Handler e;
    public final emyl f;
    public final TimeUnit g;
    public final emyl h;
    public final enkg i = new ennf(enoe.a).b().a();
    public final Object j = new Object();

    public effc(efez efezVar) {
        this.b = efezVar.a;
        this.c = efezVar.b;
        this.d = efezVar.c;
        this.e = efezVar.d;
        this.f = efezVar.e;
        this.g = efezVar.f;
        this.h = efezVar.g;
    }

    public static Uri a(Uri uri) {
        int i = eodh.a;
        return uri.buildUpon().path(eodt.a.c(uri.getPath(), StandardCharsets.UTF_8).toString()).build();
    }

    public final void b(Uri uri) {
        int i = engw.d;
        engr engrVar = new engr();
        synchronized (this.j) {
            engrVar.j(this.i.c(uri));
        }
        engw g = engrVar.g();
        int i2 = ((enou) g).c;
        for (int i3 = 0; i3 < i2; i3++) {
            ((Runnable) g.get(i3)).run();
        }
    }
}
