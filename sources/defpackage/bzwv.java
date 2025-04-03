package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.rcs.client.profile.RcsProfileService;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.NativeBaseCrypto;
import com.google.communication.synapse.security.scytale.Scope;
import com.google.media.webrtc.common.StatusOr;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzwv extends cpdo implements ehxi {
    public final fazb b;
    public final ffbr c;
    public final bzqc d;
    public final ffbr e;
    public final errl f;
    public final fazb g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    private final ffbr m;
    private final ffbr n;
    private final errl o;
    private final ffbr p;
    private final ffbr q;
    private final AtomicBoolean r = new AtomicBoolean(false);
    private static final String l = RcsProfileService.class.getName();
    public static final cskc a = cskc.g("BugleEtouffee", "E2eeStartupTask");

    public bzwv(fazb fazbVar, fazb fazbVar2, ffbr ffbrVar, ffbr ffbrVar2, bzqc bzqcVar, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, errl errlVar, errl errlVar2, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9) {
        this.b = fazbVar;
        this.g = fazbVar2;
        this.m = ffbrVar;
        this.c = ffbrVar2;
        this.d = bzqcVar;
        this.n = ffbrVar3;
        this.h = ffbrVar4;
        this.i = ffbrVar5;
        this.e = ffbrVar6;
        this.f = errlVar;
        this.o = errlVar2;
        this.p = ffbrVar7;
        this.q = ffbrVar8;
        this.j = ffbrVar9;
    }

    @Override // defpackage.cqor
    public final ekzz a() {
        return eleg.f("E2eeStartupTask");
    }

    @Override // defpackage.cpdo
    public final elfl b() {
        elfl c;
        if (ersy.a("bugle.enable_trusted_time_initialization", "bugle")) {
            this.q.b();
        }
        if (ersy.a("bugle.enable_trusted_time_initialization_and_measure_time", "bugle")) {
            final ecri d = ((ecrj) this.j.b()).d();
            cqol cqolVar = (cqol) this.q.b();
            c = axol.c(cqolVar.b, ffhe.a, ffsm.a, new cqok(cqolVar, null));
            c.h(new emwl() { // from class: bzwp
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ((ecrj) bzwv.this.j.b()).f(d, new ecda("TrustedTime.Initialized"), null, ecrh.SUCCESS);
                    return null;
                }
            }, erpp.a).e(Throwable.class, new emwl() { // from class: bzwq
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ((ecrj) bzwv.this.j.b()).f(d, new ecda("TrustedTime.Initialized"), null, ecrh.ERROR);
                    return null;
                }
            }, erpp.a);
        }
        return elfo.f(new Runnable() { // from class: bzwt
            @Override // java.lang.Runnable
            public final void run() {
                bzwv bzwvVar = bzwv.this;
                if (bzwvVar.d.g()) {
                    bzwvVar.b.b();
                    ((colj) bzwvVar.c.b()).o(bzwvVar);
                    bzwvVar.g();
                }
            }
        }, this.f);
    }

    @Override // defpackage.cpeh
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ehxi
    public final void e(String str) {
        ekzz f = eleg.f("E2eeStartupTask#handleServiceConnected");
        try {
            if (l.equals(str)) {
                this.b.b();
                elfo.f(new Runnable() { // from class: bzwo
                    @Override // java.lang.Runnable
                    public final void run() {
                        bzwv.this.g();
                    }
                }, this.f).k(axnw.b(), this.f);
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final synchronized void g() {
        if (!this.r.getAndSet(true)) {
            Set<awui> e = ((crgh) this.p.b()).e();
            if (e.isEmpty()) {
                a.r("No identities to perform prekey checking for.");
                ((akzt) this.n.b()).e("Bugle.Etouffee.StartupTask.Failure.Reason", 5);
            }
            for (final awui awuiVar : e) {
                final String str = awuiVar.d;
                final elfl i = this.d.c(str).i(new eroh() { // from class: bzwu
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return bzwv.this.d.e(str);
                    }
                }, this.f).i(new eroh() { // from class: bzwl
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        if (!((Boolean) obj).booleanValue()) {
                            return elfo.e(false);
                        }
                        final bzwv bzwvVar = bzwv.this;
                        if (bzwf.e() || bzwf.f()) {
                            awui awuiVar2 = awuiVar;
                            caib caibVar = (caib) bzwvVar.e.b();
                            cahq cahqVar = (cahq) cahr.a.createBuilder();
                            cahqVar.copyOnWrite();
                            cahr cahrVar = (cahr) cahqVar.instance;
                            awuiVar2.getClass();
                            cahrVar.c = awuiVar2;
                            cahrVar.b |= 1;
                            ((cevh) caibVar.a.b()).g(ceyr.g("ftd_data_clean_up_work", (cahr) cahqVar.build()));
                        }
                        String str2 = str;
                        cadw cadwVar = (cadw) bzwvVar.h.b();
                        cadw.a.m("Checking if any prekeys are present");
                        cadwVar.e.b();
                        final Scope create = Scope.create(cadwVar.b.b());
                        return cadwVar.c.a(str2).h(new emwl() { // from class: cads
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                return ((NativeBaseCrypto) obj2).hasAnyGeneratedPrekeys(Scope.this);
                            }
                        }, cadwVar.d).h(new emwl() { // from class: cadt
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                return (Boolean) cafo.a((StatusOr) obj2);
                            }
                        }, erpp.a).h(new emwl() { // from class: bzwr
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                if (!((Boolean) obj2).booleanValue()) {
                                    akxl akxlVar = (akxl) bzwv.this.i.b();
                                    eolu eoluVar = (eolu) eolv.a.createBuilder();
                                    eolt eoltVar = eolt.BUGLE_E2EE_EMPTY_GENERATED_PREKEYS_BUT_PROVISIONED;
                                    eoluVar.copyOnWrite();
                                    eolv eolvVar = (eolv) eoluVar.instance;
                                    eolvVar.j = eoltVar.dk;
                                    eolvVar.b |= 1;
                                    akxlVar.j(eoluVar);
                                }
                                return Boolean.valueOf(!r5.booleanValue());
                            }
                        }, erpp.a).e(fedn.class, new emwl() { // from class: bzws
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                bzwv.a.s("Skipping missing prekey check due to unexpected error", (fedn) obj2);
                                return false;
                            }
                        }, bzwvVar.f);
                    }
                }, this.f);
                final elfl i2 = ((chbx) this.m.b()).d(awuiVar.d, 6).h(new emwl() { // from class: bzwm
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return ((chbu) obj).m();
                    }
                }, this.o).i(new eroh() { // from class: bzwn
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return ((chpy) obj).b.h().h(new emwl() { // from class: chov
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                chob b = chob.b(((chod) obj2).j);
                                return b == null ? chob.UNRECOGNIZED : b;
                            }
                        }, erpp.a);
                    }
                }, this.o);
                csvs.c(elfo.k(i2, i).a(new Callable() { // from class: bzwk
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z;
                        String str2 = awuiVar.d;
                        if (erqt.q(i2) == chob.LOW_PREKEYS) {
                            csjb c = bzwv.a.c();
                            c.I("Needs prekeys");
                            c.x(ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER, str2, 2);
                            c.r();
                            z = true;
                        } else {
                            z = false;
                        }
                        if (((Boolean) erqt.q(i)).booleanValue()) {
                            bzwv.a.p("Prekeys are missing, will re-upload");
                        } else if (!z) {
                            csjb a2 = bzwv.a.a();
                            a2.I("Skip. Not low keys nor missing prekeys.");
                            a2.x(ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER, str2, 2);
                            a2.r();
                            return null;
                        }
                        ((cadx) bzwv.this.g.b()).a(str2);
                        return null;
                    }
                }, erpp.a), "BugleEtouffee", "Failed to schedule prekey upload.");
            }
        }
    }

    @Override // defpackage.ehxi
    public final void f(String str) {
    }

    @Override // defpackage.ehxi
    public final void d(String str, ehxh ehxhVar) {
    }
}
