package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avpd implements ejuh {
    public final azei a;
    public final ejvp b;
    public final ffsk c;
    public final cqoh d;
    public final azaw e;
    public final avoy f;
    public final String g;
    public final emyl h;
    public boolean i;
    public final tyb j;

    public avpd(azei azeiVar, ejvp ejvpVar, ffsk ffskVar, cqoh cqohVar, azaw azawVar, avoy avoyVar, tyb tybVar, emyl emylVar, lkk lkkVar) {
        azeiVar.getClass();
        ejvpVar.getClass();
        ffskVar.getClass();
        cqohVar.getClass();
        this.a = azeiVar;
        this.b = ejvpVar;
        this.c = ffskVar;
        this.d = cqohVar;
        this.e = azawVar;
        this.f = avoyVar;
        this.j = tybVar;
        this.g = "rcs_capabilities";
        this.h = emylVar;
        this.i = true;
        lkkVar.c(new avpc(this, new avox(this)));
    }

    @Override // defpackage.ejuh
    public final erph a() {
        return axol.j(this.c, new avpb(this, null));
    }

    @Override // defpackage.ejuh
    public final /* bridge */ /* synthetic */ ListenableFuture b() {
        return elfo.e(null);
    }

    @Override // defpackage.ejuh
    public final /* synthetic */ Object c() {
        return this.g;
    }
}
