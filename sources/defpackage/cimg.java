package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.net.tachyonrefresh.TachyonRefreshWorker;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cimg implements cnjv {
    public static final cskc a = cskc.g("BugleNetwork", "TachyonRefreshManagerImpl");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/net/tachyonrefresh/TachyonRefreshManagerImpl");
    public final Context c;
    public final errl d;
    public final ffbr e;
    public final ffbr f;
    private final ffbr g;
    private final ffbr h;

    public cimg(Context context, errl errlVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.c = context;
        this.d = errlVar;
        this.g = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.h = ffbrVar4;
    }

    @Override // defpackage.cnjv
    public final elfl fM(boolean z) {
        if (z) {
            return elfo.e(null);
        }
        a.p("No longer default SMS app. Update Tachyon registrations");
        comu c = comv.c();
        c.d(comb.TACHYON_PHONE);
        c.f(chod.a);
        c.b(true);
        if (((atsg) this.h.b()).a()) {
            c.c(new Supplier() { // from class: cima
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new cilw();
                }
            });
        }
        return ((comy) this.g.b()).a(c.a()).g().h(new emwl() { // from class: cimb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((enhk) obj).keySet();
            }
        }, erpp.a).i(new eroh() { // from class: cimc
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                enip enipVar = (enip) obj;
                ensk h = cimg.b.h();
                h.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/tachyonrefresh/TachyonRefreshManagerImpl", "refreshForAllPhoneNumbers", 109, "TachyonRefreshManagerImpl.java")).r("Found %s registrations in settings", enipVar.size());
                Stream stream = Collection.EL.stream(enipVar);
                final cimg cimgVar = cimg.this;
                Stream map = stream.map(new Function() { // from class: cime
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        final String str = (String) obj2;
                        csjb c2 = cimg.a.c();
                        c2.I("Updating registration");
                        c2.x("number", str, 2);
                        c2.B("allowReregister", false);
                        c2.r();
                        final cimg cimgVar2 = cimg.this;
                        return ((chbx) cimgVar2.e.b()).c(str).i(new eroh() { // from class: cilx
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj3) {
                                return ((chbu) obj3).l(cgwm.REFRESH_WITHOUT_REREGISTER);
                            }
                        }, cimgVar2.d).h(new emwl() { // from class: cily
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                return null;
                            }
                        }, erpp.a).e(Throwable.class, new emwl() { // from class: cilz
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                Throwable th = (Throwable) obj3;
                                boolean d = chfh.d(th);
                                String str2 = str;
                                if (d) {
                                    cimg cimgVar3 = cimg.this;
                                    fcej fcejVar = (fcej) fcek.a.createBuilder();
                                    fcejVar.copyOnWrite();
                                    fcek fcekVar = (fcek) fcejVar.instance;
                                    str2.getClass();
                                    fcekVar.c = str2;
                                    fgtg fgtgVar = fgtg.PHONE_NUMBER;
                                    fcejVar.copyOnWrite();
                                    ((fcek) fcejVar.instance).b = fgtgVar.a();
                                    fcejVar.copyOnWrite();
                                    ((fcek) fcejVar.instance).d = "RCS";
                                    fcek fcekVar2 = (fcek) fcejVar.build();
                                    csjb a2 = TachyonRefreshWorker.e.a();
                                    a2.I("Scheduling refresh retry");
                                    a2.A("app", fcekVar2.d);
                                    a2.r();
                                    ppv ppvVar = new ppv(TachyonRefreshWorker.class);
                                    ppvVar.d("tachyon_refresh_worker");
                                    poh pohVar = new poh();
                                    pohVar.c = true;
                                    pohVar.c(2);
                                    ppvVar.g(pohVar.a());
                                    pon ponVar = new pon();
                                    ponVar.e("tachyon_refresh_app", fcekVar2.d);
                                    ponVar.e("tachyon_refresh_id", fcekVar2.c);
                                    ppvVar.j(ponVar.a());
                                    ppvVar.h(((Long) TachyonRefreshWorker.f.e()).longValue(), TimeUnit.SECONDS);
                                    ppw ppwVar = (ppw) ppvVar.b();
                                    pqr.a(cimgVar3.c).g("tachyon_refresh_" + fcekVar2.d + fcekVar2.c, ppa.REPLACE, ppwVar);
                                }
                                csjb e = cimg.a.e();
                                e.I("Failed to update registration");
                                e.x("number", str2, 2);
                                e.s(th);
                                return null;
                            }
                        }, erpp.a);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = engw.d;
                return elfo.j((engw) map.collect(endq.a)).a(new Callable() { // from class: cimf
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return null;
                    }
                }, erpp.a);
            }
        }, this.d).h(new emwl() { // from class: cimd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((akzt) cimg.this.f.b()).e("Bugle.DefaultSmsChanged.Tachyon.State.Counts", 1);
                return null;
            }
        }, this.d);
    }
}
