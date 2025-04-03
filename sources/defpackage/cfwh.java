package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfwh implements cfvy {
    public static final cskc a = cskc.g("BugleNetwork", "DittoTachyonTickleHandler");
    public final fazb b;
    public final Optional c;
    private final akzt d;
    private final ffbr e;
    private final Optional f;
    private final ffbr g;
    private final fazb h;
    private final errl i;

    public cfwh(akzt akztVar, ffbr ffbrVar, ffbr ffbrVar2, fazb fazbVar, Optional optional, fazb fazbVar2, Optional optional2, errl errlVar) {
        this.d = akztVar;
        this.g = ffbrVar;
        this.e = ffbrVar2;
        this.b = fazbVar;
        this.f = optional;
        this.h = fazbVar2;
        this.c = optional2;
        this.i = errlVar;
    }

    @Override // defpackage.cfvy
    public final elfl a() {
        if (((Boolean) cful.i.e()).booleanValue()) {
            return ((cgwk) this.h.b()).w();
        }
        a.m("Skipping tachyon registration refresh because ditto is not enabled.");
        return elfo.e(null);
    }

    @Override // defpackage.cfvy
    public final void b(long j) {
        this.d.e("Bugle.Fcm.Tickle.Downgrade.Counts", cfvw.a(2));
        ((bzef) this.b.b()).h(j);
    }

    @Override // defpackage.cfvy
    public final void c(fcek fcekVar, final String str, int i, int i2) {
        if (this.c.isEmpty()) {
            a.p("Ignore received Firebase message because TachyonReceiverManager is not present.");
            return;
        }
        chhj chhjVar = (chhj) this.g.b();
        ((bzea) this.e.b()).e(str, i2, i);
        final boolean c = cfyo.c(i, i2);
        if (this.f.isEmpty()) {
            a.r("Ditto tickle does not support in this device");
            return;
        }
        ((chhm) this.f.get()).g(chhjVar);
        csjb c2 = a.c();
        c2.I("Handling firebase tickle for Ditto, ID:");
        c2.I(str);
        c2.r();
        this.d.c("Bugle.Ditto.FcmPush");
        elfl i3 = elfo.h(new erog() { // from class: cfwd
            @Override // defpackage.erog
            public final ListenableFuture a() {
                ((bzef) cfwh.this.b.b()).s();
                return elfo.e(null);
            }
        }, this.i).i(new eroh() { // from class: cfwe
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((cilk) cfwh.this.c.get()).i(str);
            }
        }, erpp.a);
        elfr.l(i3, new csvw(new Consumer() { // from class: cfwf
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                csjb c3 = cfwh.a.c();
                c3.I("Successfully handled tickle with ID:");
                c3.I(str);
                c3.r();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: cfwg
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                csjb e = cfwh.a.e();
                e.I("Failed to handle tickle with ID:");
                e.I(str);
                e.s((Throwable) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), erpp.a);
        elfr.l(i3, chhjVar, erpp.a);
    }
}
