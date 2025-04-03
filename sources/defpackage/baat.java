package defpackage;

import android.app.Notification;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baat implements eiyb {
    public static final cskc a = cskc.g("BugleCms", "LinkedAccountCleanupInterceptor");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final errl e;
    public final errl f;
    private final ffbr g;
    private final ffbr h;

    public baat(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, errl errlVar, errl errlVar2) {
        this.b = ffbrVar;
        this.g = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.h = ffbrVar5;
        this.e = errlVar;
        this.f = errlVar2;
    }

    public final elfl a(eiyc eiycVar) {
        a.p("Disable CMS feature as the account is removed the device.");
        return (csgj.a() ? ((crue) this.g.b()).c(((eizj) eiycVar).a, 3) : ((crue) this.g.b()).d(((eizj) eiycVar).a, 5, 3)).h(new emwl() { // from class: baap
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((cins) baat.this.d.b()).n();
                return null;
            }
        }, this.f);
    }

    @Override // defpackage.eiyb
    public final ListenableFuture b(final eiyc eiycVar) {
        csjb c = a.c();
        c.I("Clean up account");
        eizj eizjVar = (eizj) eiycVar;
        c.A("accountId", eizjVar.a);
        c.M("displayId", eizjVar.b.g);
        c.r();
        elfl i = ((axkm) this.c.b()).k().i(new eroh() { // from class: baao
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final baat baatVar = baat.this;
                axez axezVar = (axez) obj;
                if (csgj.a()) {
                    axkl axklVar = ((axkm) baatVar.c.b()).n;
                    if (!axkl.g(axezVar)) {
                        baat.a.p("The CMS feature is off, ignore the account removed event.");
                        return elfo.e(null);
                    }
                }
                if (csgj.a() || axezVar.e) {
                    final eiyc eiycVar2 = eiycVar;
                    return ((babf) baatVar.b.b()).a().i(new eroh() { // from class: baaq
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            eiyc eiycVar3 = eiycVar2;
                            if (!((eisx) obj2).equals(((eizj) eiycVar3).a)) {
                                baat.a.p("The account removed is not the CMS linked account. Ignore the account removed event.");
                                return elfo.e(null);
                            }
                            baat baatVar2 = baat.this;
                            baat.a.p("The account removed is the CMS linked account.");
                            return baatVar2.a(eiycVar3);
                        }
                    }, baatVar.e).f(eizq.class, new eroh() { // from class: baar
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            baat.a.p("Linked account is invalid.");
                            return baat.this.a(eiycVar2);
                        }
                    }, baatVar.e).e(babn.class, new emwl() { // from class: baas
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            baat.a.r("No linked account.");
                            return null;
                        }
                    }, baatVar.f);
                }
                baat.a.p("enable_cms_bnr_settings flag off. The MultiDevice feature is off, ignore the account removed event.");
                return elfo.e(null);
            }
        }, this.e);
        Notification b = ((cins) this.d.b()).b();
        if (b == null) {
            return i;
        }
        ((ejjz) this.h.b()).h(i, b);
        return elfo.e(null);
    }
}
