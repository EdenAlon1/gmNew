package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmnz implements ejny {
    public static final Duration a;
    public static final cskc b;
    public final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final errm f;
    private final errl g;
    private final ffbr h;
    private final errl i;

    static {
        Duration ofDays = Duration.ofDays(7L);
        a = ofDays;
        cfvl.f(cfvl.b, "revoke_consent_worker_initial_delay_minutes", ofDays.toMinutes());
        b = cskc.g("BugleRcsProvisioning", "RevokeGoogleToSConsentWorker");
    }

    public cmnz(ffbr ffbrVar, ffbr ffbrVar2, errm errmVar, errl errlVar, ffbr ffbrVar3, ffbr ffbrVar4, errl errlVar2) {
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = errmVar;
        this.g = errlVar;
        this.c = ffbrVar3;
        this.h = ffbrVar4;
        this.i = errlVar2;
    }

    @Override // defpackage.ejok
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return ejoj.a();
    }

    @Override // defpackage.ejny, defpackage.ejok
    public final ListenableFuture b(WorkerParameters workerParameters) {
        elfl e;
        boolean h = workerParameters.b.h("is_disabled_by_user");
        final boolean z = false;
        if (djai.M()) {
            if (h) {
                e = elfo.g(new Callable() { // from class: cmnx
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z2 = false;
                        if (djai.M() && ((cmgr) cmnz.this.c.b()).a().equals(cmip.TOGGLE_STATE_USER_DISABLED)) {
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    }
                }, this.i);
                z = true;
            } else {
                e = elfo.e(Boolean.valueOf(((djuo) this.e.b()).a() == clxt.GOOGLE_TOS_DECLINED));
            }
            return e.i(new eroh() { // from class: cmny
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return cmnz.this.c(z, ((Boolean) obj).booleanValue());
                }
            }, this.i);
        }
        if (h) {
            if (!djai.M() || ((ckby) this.h.b()).d()) {
                r2 = false;
                z = true;
            } else {
                z = true;
            }
        } else if (((djuo) this.e.b()).a() != clxt.GOOGLE_TOS_DECLINED) {
            r2 = false;
        }
        return c(z, r2);
    }

    public final elfl c(boolean z, boolean z2) {
        if (z2) {
            return elfl.g(((djun) this.d.b()).c(ezes.REVOKE_CONSENT_FROM_SETTINGS, z)).h(new emwl() { // from class: cmnv
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    cmnz.b.m("revokeConsent successfully");
                    return new ppp();
                }
            }, this.g).e(Exception.class, new emwl() { // from class: cmnw
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    cmnz.b.s("revokeConsent failed", (Exception) obj);
                    return new ppo();
                }
            }, this.f);
        }
        b.m(a.q(z, "Skip RevokeGoogleConsentWorker, isDisabledByUser ="));
        return elfo.e(new ppp());
    }
}
