package defpackage;

import android.content.Context;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cegg;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cegg extends ceut {
    static final cfup a = cfvl.f(cfvl.b, "retry_delay_millis_cms_restore_encryption_key_work_handler", 10000);
    public final errl b;
    public final axdf c;
    public final Context d;
    public final ccts e;
    private final babm f;

    /* compiled from: PG */
    public interface a {
        cctl bE();

        cekw cG();
    }

    public cegg(babm babmVar, errl errlVar, axdf axdfVar, Context context, ccts cctsVar) {
        this.f = babmVar;
        this.b = errlVar;
        this.c = axdfVar;
        this.d = context;
        this.e = cctsVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c(Alert.DURATION_SHOW_INDEFINITELY);
        l.f(poa.EXPONENTIAL);
        l.g(((Long) a.e()).longValue());
        poh pohVar = new poh();
        pohVar.c(4);
        if (csgj.a() && ((Boolean) ((cfup) csgj.l.get()).e()).booleanValue()) {
            pohVar.c = true;
        }
        ((ceti) l).a = pohVar.a();
        l.e(true);
        return l.a();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("CmsRestoreEncryptionKeyWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cejm.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(final ceuw ceuwVar, eyhs eyhsVar) {
        final cejm cejmVar = (cejm) eyhsVar;
        return this.f.b(cejmVar.c).i(new eroh() { // from class: cegd
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                eisx eisxVar = (eisx) obj;
                cegg.a aVar = (cegg.a) ekhv.a(cegg.this.d, cegg.a.class, eisxVar);
                ceuwVar.a();
                cctl bE = aVar.bE();
                pon ponVar = new pon();
                ponVar.g("account_id", eisxVar.a());
                return bE.d(ponVar.a(), aVar.cG(), false, cegb.a(cejmVar));
            }
        }, this.b).i(new eroh() { // from class: cege
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ceyt ceytVar = (ceyt) obj;
                epfi epfiVar = epfi.RESTORE_ENCRYPTION_KEY_WORK;
                final cejm cejmVar2 = cejmVar;
                cegg ceggVar = cegg.this;
                ceggVar.e.b(ceytVar, epfiVar, cejmVar2);
                if (!ceytVar.e() || ceytVar.c() != null) {
                    return elfo.e(ceytVar);
                }
                cejm a2 = ceggVar.e.a(cejmVar2);
                int i = engw.d;
                final engr engrVar = new engr();
                final ceys h = ceyt.h();
                h.b(true);
                h.c(false);
                engrVar.h(cejp.a(a2));
                return elfo.g(new Callable() { // from class: cegc
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        cejm cejmVar3 = cejmVar2;
                        ceyr g = ceyr.g("cms_key_sync", cdiu.a(cejmVar3.c, csfz.a(cejmVar3.e)));
                        engr engrVar2 = engr.this;
                        engrVar2.h(g);
                        engw g2 = engrVar2.g();
                        ceys ceysVar = h;
                        ((cetn) ceysVar).a = g2;
                        return ceysVar.a();
                    }
                }, ceggVar.b);
            }
        }, this.b).e(baan.class, new emwl() { // from class: cegf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cegg ceggVar = cegg.this;
                ceggVar.c.e(epfx.RESTORE_ENCRYPTION_KEY);
                ceggVar.e.c(epfi.RESTORE_ENCRYPTION_KEY_WORK, cejmVar, 3);
                return ceyt.k();
            }
        }, erpp.a);
    }
}
