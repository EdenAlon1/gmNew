package defpackage;

import j$.util.Optional;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avvx implements avwa {
    private final avvw a;
    private final String b;
    private final UrlRequest.Callback c;
    private final enhv d = new enhv();
    private final Optional e = Optional.empty();
    private final Optional f = Optional.empty();

    public avvx(avvw avvwVar, String str, UrlRequest.Callback callback) {
        this.a = avvwVar;
        this.b = str;
        this.c = callback;
    }

    @Override // defpackage.avwa
    public final avvz a() {
        this.e.isPresent();
        avve avveVar = (avve) this.f.orElse(avve.GET);
        avvw avvwVar = this.a;
        ffbr ffbrVar = avvwVar.a;
        enhz f = this.d.f();
        errm errmVar = (errm) ffbrVar.b();
        errmVar.getClass();
        avveVar.getClass();
        return new avvv(errmVar, avvwVar.b, this.b, this.c, f, this.e, avveVar);
    }

    @Override // defpackage.avwa
    public final /* bridge */ /* synthetic */ void b(String str) {
        this.d.h("Range", str);
    }

    @Override // defpackage.avwa
    public final /* bridge */ /* synthetic */ void c(enhz enhzVar) {
        this.d.j(enhzVar);
    }
}
