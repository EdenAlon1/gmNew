package defpackage;

import android.content.Context;
import android.view.ViewTreeObserver;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.accountmenu.features.education.db.EducationDatabase;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adkk implements adkg {
    public static final enru a = enru.c("com/google/android/apps/messaging/gaia/autosignin/AutoSignInTooltipPresenterImpl");
    public final ea b;
    public final adke c;
    public final ffbr d;
    public final ffbr e;
    private final ffbr f;
    private final ffbr g;

    public adkk(ea eaVar, adke adkeVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffbrVar.getClass();
        this.b = eaVar;
        this.c = adkeVar;
        this.f = ffbrVar;
        this.d = ffbrVar2;
        this.g = ffbrVar3;
        this.e = ffbrVar4;
    }

    @Override // defpackage.adkg
    public final ViewTreeObserver.OnGlobalLayoutListener a() {
        return new adkj(this);
    }

    @Override // defpackage.adkg
    public final void b() {
        ejxn ejxnVar = (ejxn) this.f.b();
        final ffji ffjiVar = new ffji() { // from class: adkh
            /* JADX WARN: Type inference failed for: r8v10, types: [ebkk] */
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ebkk ebkkVar;
                adjj adjjVar;
                ebwa ebwaVar;
                int i;
                emyl emylVar;
                emyl emylVar2;
                enip enipVar;
                Runnable runnable;
                elfl c;
                adjz adjzVar = (adjz) obj;
                ensk e = adkk.a.e();
                e.Y(ente.a, "BugleGaia");
                ((enrr) e.h("com/google/android/apps/messaging/gaia/autosignin/AutoSignInTooltipPresenterImpl", "registerMixinCallbacks$lambda$1", 64, "AutoSignInTooltipPresenterImpl.kt")).t("[Auto sign-in] Auto sign-in state updated. New value: %s", adjzVar.name());
                if (adjzVar == adjz.b) {
                    adkk adkkVar = adkk.this;
                    ea h = adkkVar.b.I().h("OgParticleDiscFragment");
                    boolean z = h instanceof adiy;
                    eg G = adkkVar.b.G();
                    if (z && G != null && G.P().a().a(lkj.RESUMED)) {
                        final adjk adjkVar = (adjk) adkkVar.d.b();
                        adjl adjlVar = new adjl(G.getString(R.string.auto_sign_in_education_detail), G.getDrawable(R.drawable.product_logo_googleg_color_24));
                        adiy adiyVar = (adiy) h;
                        adiyVar.getClass();
                        if (!adjkVar.d) {
                            eg fe = adiyVar.fe();
                            SelectedAccountDisc selectedAccountDisc = (SelectedAccountDisc) fe.findViewById(R.id.selected_account_disc);
                            if (selectedAccountDisc != null) {
                                adjk.a.p("show OneGoogle Education tooltip");
                                ebbb ebbbVar = adiyVar.a().f;
                                ebbbVar.getClass();
                                ebka ebkaVar = new ebka();
                                ebkaVar.e = 1;
                                byte b = ebkaVar.o;
                                ebkaVar.f = 1;
                                ebkaVar.o = (byte) (b | 3);
                                ebkaVar.h = new emyl() { // from class: ebki
                                    @Override // defpackage.emyl
                                    public final Object get() {
                                        return true;
                                    }
                                };
                                ebkaVar.g = new emyl() { // from class: ebkj
                                    @Override // defpackage.emyl
                                    public final Object get() {
                                        return true;
                                    }
                                };
                                enpd enpdVar = enpd.a;
                                if (enpdVar == null) {
                                    throw new NullPointerException("Null highlightIds");
                                }
                                ebkaVar.j = enpdVar;
                                ebkaVar.k = true;
                                ebkaVar.o = (byte) (ebkaVar.o | 8);
                                ebkaVar.r = new Object() { // from class: ebkk
                                };
                                ebkaVar.a(false);
                                ebkaVar.b();
                                ebkaVar.n = new Runnable() { // from class: ebkl
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                    }
                                };
                                ebkaVar.t = 15;
                                ebbg ebbgVar = (ebbg) ebbbVar;
                                ebkaVar.a = ebbgVar.c;
                                ebkaVar.b = ebbgVar.b;
                                ebkaVar.l = adjkVar.b;
                                ebkaVar.p = 1;
                                ebkaVar.b();
                                ebkaVar.a(true);
                                ebkaVar.g = new emyl() { // from class: adjh
                                    @Override // defpackage.emyl
                                    public final Object get() {
                                        return false;
                                    }
                                };
                                ebkaVar.s = new adjj(adjlVar);
                                eave eaveVar = ebkaVar.a;
                                if (eaveVar == null) {
                                    throw new IllegalStateException("Property \"accountConverter\" has not been set");
                                }
                                eayo eayoVar = ebkaVar.b;
                                if (eayoVar == null) {
                                    throw new IllegalStateException("Property \"accountsModel\" has not been set");
                                }
                                dwch dwchVar = ebkaVar.l;
                                if (dwchVar == null) {
                                    throw new IllegalStateException("Property \"vePrimitives\" has not been set");
                                }
                                emxc emxcVar = ebkaVar.m;
                                ebkaVar.d = new ebvg(dwchVar, eaveVar, eayoVar, emxcVar);
                                if (ebkaVar.o != 15 || (ebkkVar = ebkaVar.r) == null || (adjjVar = ebkaVar.s) == null || (ebwaVar = ebkaVar.d) == null || (i = ebkaVar.t) == 0 || (emylVar = ebkaVar.g) == null || (emylVar2 = ebkaVar.h) == null || (enipVar = ebkaVar.j) == null || ebkaVar.p == 0 || (runnable = ebkaVar.n) == null || ebkaVar.q == 0) {
                                    StringBuilder sb = new StringBuilder();
                                    if (ebkaVar.a == null) {
                                        sb.append(" accountConverter");
                                    }
                                    if (ebkaVar.b == null) {
                                        sb.append(" accountsModel");
                                    }
                                    if (ebkaVar.r == null) {
                                        sb.append(" shouldShowEducationAndHighlightChecker");
                                    }
                                    if (ebkaVar.s == null) {
                                        sb.append(" callbacks");
                                    }
                                    if (ebkaVar.d == null) {
                                        sb.append(" simpleVeLogger");
                                    }
                                    if (ebkaVar.t == 0) {
                                        sb.append(" id");
                                    }
                                    if ((ebkaVar.o & 1) == 0) {
                                        sb.append(" impressionCap");
                                    }
                                    if ((ebkaVar.o & 2) == 0) {
                                        sb.append(" highlightImpressionCap");
                                    }
                                    if (ebkaVar.g == null) {
                                        sb.append(" shouldConsumeEducation");
                                    }
                                    if (ebkaVar.h == null) {
                                        sb.append(" shouldConsumeHighlight");
                                    }
                                    if ((ebkaVar.o & 4) == 0) {
                                        sb.append(" withScrim");
                                    }
                                    if (ebkaVar.j == null) {
                                        sb.append(" highlightIds");
                                    }
                                    if ((ebkaVar.o & 8) == 0) {
                                        sb.append(" shouldClickAnchorOnInteraction");
                                    }
                                    if (ebkaVar.p == 0) {
                                        sb.append(" a11yLevel");
                                    }
                                    if (ebkaVar.l == null) {
                                        sb.append(" vePrimitives");
                                    }
                                    if (ebkaVar.n == null) {
                                        sb.append(" onEducationShown");
                                    }
                                    if (ebkaVar.q == 0) {
                                        sb.append(" placement");
                                    }
                                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                                }
                                ebkh ebkhVar = new ebkh(new ebkb(eaveVar, eayoVar, ebkaVar.c, ebkkVar, adjjVar, ebwaVar, i, ebkaVar.e, ebkaVar.f, emylVar, emylVar2, ebkaVar.i, enipVar, ebkaVar.k, dwchVar, emxcVar, runnable));
                                ebit ebitVar = (ebit) ((emyl) adjkVar.c.b()).get();
                                ebitVar.c.h(ebkhVar);
                                ebitVar.e = new ebis() { // from class: adji
                                    @Override // defpackage.ebis
                                    public final void a() {
                                        adjk.this.d = false;
                                    }
                                };
                                EducationDatabase educationDatabase = ebitVar.d;
                                if (educationDatabase == null) {
                                    Context context = ebitVar.a;
                                    Executor executor = ebitVar.b;
                                    if (ebjh.a == null) {
                                        synchronized (EducationDatabase.class) {
                                            if (ebjh.a == null) {
                                                ebjh.a = EducationDatabase.x(context, executor);
                                            }
                                        }
                                    }
                                    educationDatabase = ebjh.a;
                                }
                                final ebjg ebjgVar = new ebjg(ebitVar.a, educationDatabase, ebitVar.b, ebitVar.e, ebitVar.c.g());
                                final int d = ebkhVar.d();
                                ebjgVar.f.execute(new Runnable() { // from class: ebiv
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final String a2 = ezoz.a(d);
                                        ((Integer) ovw.b(((ebjy) ebjg.this.e).a, false, true, new ffji() { // from class: ebjr
                                            @Override // defpackage.ffji
                                            public final Object invoke(Object obj2) {
                                                ouz ouzVar = (ouz) obj2;
                                                ovi a3 = ouzVar.a("UPDATE educationstate  SET enabled = ? WHERE name = ?");
                                                String str = a2;
                                                try {
                                                    a3.e(1, 1L);
                                                    a3.g(2, str);
                                                    a3.j();
                                                    return Integer.valueOf(owb.a(ouzVar));
                                                } finally {
                                                    a3.close();
                                                }
                                            }
                                        })).intValue();
                                    }
                                });
                                fr J = adiyVar.J();
                                AccountParticleDisc accountParticleDisc = selectedAccountDisc.c;
                                emux emuxVar = emux.a;
                                if (ecaz.a(selectedAccountDisc)) {
                                    ebjgVar.b(fe, J, selectedAccountDisc);
                                } else {
                                    accountParticleDisc.getViewTreeObserver().addOnGlobalLayoutListener(new ebjd(ebjgVar, selectedAccountDisc, accountParticleDisc, fe, J, emuxVar));
                                }
                                adjkVar.d = true;
                                adke adkeVar = adkkVar.c;
                                c = axol.c(adkeVar.c, ffhe.a, ffsm.a, new adkc(adkeVar, null));
                                axnw.h(c);
                                ((akzt) ((adkf) adkkVar.e.b()).a.b()).c("Bugle.UI.GAIA.AutoSignIn.NewUserTooltipShown");
                            } else {
                                adjk.a.r("trying to open Education when APD is null");
                            }
                        }
                    }
                    adkkVar.c.f = false;
                    ensk e2 = adkk.a.e();
                    e2.Y(ente.a, "BugleGaia");
                    ((enrr) e2.h("com/google/android/apps/messaging/gaia/autosignin/AutoSignInTooltipPresenterImpl", "registerMixinCallbacks$lambda$1", 98, "AutoSignInTooltipPresenterImpl.kt")).q("[Auto sign-in] Tooltip not successfully shown. Notifying state change");
                    adkkVar.c();
                }
                return ffcu.a;
            }
        };
        ejxnVar.g(R.id.auto_sign_in_local_subscription, this.c.g, new ejxk() { // from class: adki
            @Override // defpackage.ejxk
            public final /* synthetic */ void a(Throwable th) {
                ejxj.a(th);
            }

            @Override // defpackage.ejxk
            public final void b(Object obj) {
                ffji.this.invoke(obj);
            }
        });
    }

    public final void c() {
        ((ejvp) this.g.b()).a(elfo.e(null), adke.b);
    }
}
