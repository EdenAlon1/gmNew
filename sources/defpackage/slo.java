package defpackage;

import android.net.Uri;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class slo {
    public final ffhd a;
    public final ffbr b;
    public final ffbr c;
    public final cqoh d;
    public final atwp e;
    private final ffbr f;

    public slo(ffhd ffhdVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, cqoh cqohVar, atwp atwpVar) {
        ffhdVar.getClass();
        ffbrVar2.getClass();
        cqohVar.getClass();
        atwpVar.getClass();
        this.a = ffhdVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.f = ffbrVar3;
        this.d = cqohVar;
        this.e = atwpVar;
    }

    public final void a(Uri uri, sli sliVar) {
        skp skpVar = (skp) this.f.b();
        Duration duration = sliVar.a;
        String a = sliVar.a();
        long millis = duration.toMillis();
        skpVar.a.f(new sko(uri, a, millis <= 0 ? 0.0f : sliVar.d.toMillis() / millis));
    }
}
