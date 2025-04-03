package defpackage;

import android.content.Context;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cegm;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cegm extends ceut {
    static final cfup a = cfvl.f(cfvl.b, "retry_delay_millis_cms_restore_messages_work_handler", 10000);
    public final Context b;
    public final errl c;
    public final axdf d;
    public final ccts e;
    private final babm f;
    private final ccrz g;

    /* compiled from: PG */
    public interface a {
        cctl bG();

        celo cH();
    }

    public cegm(babm babmVar, Context context, errl errlVar, axdf axdfVar, ccrz ccrzVar, ccts cctsVar) {
        this.b = context;
        this.f = babmVar;
        this.c = errlVar;
        this.d = axdfVar;
        this.g = ccrzVar;
        this.e = cctsVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c(Alert.DURATION_SHOW_INDEFINITELY);
        l.f(poa.EXPONENTIAL);
        l.g(((Long) a.e()).longValue());
        l.b(cevc.FOREGROUND_SERVICE);
        ceti cetiVar = (ceti) l;
        cetiVar.b = this.g.a();
        poh pohVar = new poh();
        pohVar.c(4);
        if (csgj.a() && ((Boolean) ((cfup) csgj.l.get()).e()).booleanValue()) {
            pohVar.c = true;
        }
        cetiVar.a = pohVar.a();
        l.e(true);
        return l.a();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("CmsRestoreMessagesWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cejm.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(final ceuw ceuwVar, eyhs eyhsVar) {
        final cejm cejmVar = (cejm) eyhsVar;
        return this.f.b(cejmVar.c).i(new eroh() { // from class: cegi
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cegm.a aVar = (cegm.a) ekhv.a(cegm.this.b, cegm.a.class, (eisx) obj);
                ceuwVar.a();
                cctl bG = aVar.bG();
                pon ponVar = new pon();
                cejm cejmVar2 = cejmVar;
                ponVar.g("account_id", cejmVar2.c);
                ponVar.g("cms_feature_id", cejmVar2.e);
                eyja eyjaVar = cejmVar2.f;
                if (eyjaVar == null) {
                    eyjaVar = eyja.a;
                }
                ponVar.h("restore_start_time_millis", eykm.b(eyjaVar));
                return bG.d(ponVar.a(), aVar.cH(), true, cegh.a(cejmVar2));
            }
        }, this.c).i(new eroh() { // from class: cegj
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final ceyt ceytVar = (ceyt) obj;
                epfi epfiVar = epfi.RESTORE_MESSAGES_WORK;
                final cejm cejmVar2 = cejmVar;
                cegm cegmVar = cegm.this;
                cegmVar.e.b(ceytVar, epfiVar, cejmVar2);
                return (ceytVar.e() && ceytVar.c() == null) ? elfo.g(new Callable() { // from class: cegl
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ceys b = ceyt.this.b();
                        ((cetn) b).a = engw.r(ceol.a(cejmVar2));
                        return b.a();
                    }
                }, cegmVar.c) : elfo.e(ceytVar);
            }
        }, this.c).e(baan.class, new emwl() { // from class: cegk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cegm cegmVar = cegm.this;
                cegmVar.d.e(epfx.RESTORE_MESSAGE);
                cegmVar.e.c(epfi.RESTORE_MESSAGES_WORK, cejmVar, 3);
                return ceyt.k();
            }
        }, erpp.a);
    }
}
