package defpackage;

import android.content.Context;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cejt;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cejt extends ceut {
    static final cfup a = cfvl.f(cfvl.b, "retry_delay_millis_cms_restore_participants_work_handler", 10000);
    public final axdf b;
    public final Context c;
    public final ccts d;
    private final babm e;
    private final errl f;
    private final ccrz g;

    /* compiled from: PG */
    public interface a {
        cctl bH();

        celu cJ();
    }

    public cejt(babm babmVar, errl errlVar, axdf axdfVar, Context context, ccrz ccrzVar, ccts cctsVar) {
        this.e = babmVar;
        this.f = errlVar;
        this.b = axdfVar;
        this.c = context;
        this.g = ccrzVar;
        this.d = cctsVar;
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
        return eleg.f("CmsRestoreParticipantsWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cejm.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(final ceuw ceuwVar, eyhs eyhsVar) {
        final cejm cejmVar = (cejm) eyhsVar;
        return this.e.b(cejmVar.c).i(new eroh() { // from class: cejq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                eisx eisxVar = (eisx) obj;
                cejt.a aVar = (cejt.a) ekhv.a(cejt.this.c, cejt.a.class, eisxVar);
                ceuwVar.a();
                cctl bH = aVar.bH();
                pon ponVar = new pon();
                ponVar.g("account_id", eisxVar.a());
                return bH.d(ponVar.a(), aVar.cJ(), true, cejp.a(cejmVar));
            }
        }, this.f).h(new emwl() { // from class: cejr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cejt cejtVar = cejt.this;
                ccts cctsVar = cejtVar.d;
                ceyt ceytVar = (ceyt) obj;
                epfi epfiVar = epfi.RESTORE_PARTICIPANTS_WORK;
                cejm cejmVar2 = cejmVar;
                cctsVar.b(ceytVar, epfiVar, cejmVar2);
                if (!ceytVar.e() || ceytVar.c() != null) {
                    return ceytVar;
                }
                ceys h = ceyt.h();
                h.b(true);
                h.c(false);
                ((cetn) h).a = engw.r(cefu.a(cejtVar.d.a(cejmVar2)));
                return h.a();
            }
        }, erpp.a).e(baan.class, new emwl() { // from class: cejs
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cejt cejtVar = cejt.this;
                cejtVar.b.e(epfx.RESTORE_PARTICIPANT);
                cejtVar.d.c(epfi.RESTORE_PARTICIPANTS_WORK, cejmVar, 3);
                return ceyt.k();
            }
        }, erpp.a);
    }
}
