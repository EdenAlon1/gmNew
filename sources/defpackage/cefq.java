package defpackage;

import android.content.Context;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cefq;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cefq extends ceut {
    static final cfup a = cfvl.f(cfvl.b, "retry_delay_millis_cms_restore_backup_key_work_handler", 10000);
    public final axdf b;
    public final Context c;
    public final ccts d;
    private final babm e;
    private final errl f;

    /* compiled from: PG */
    public interface a {
        cekj cE();
    }

    public cefq(axdf axdfVar, babm babmVar, errl errlVar, Context context, ccts cctsVar) {
        this.f = errlVar;
        this.b = axdfVar;
        this.e = babmVar;
        this.c = context;
        this.d = cctsVar;
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
        return eleg.f("CmsRestoreBackupKeyWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cejm.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(final ceuw ceuwVar, eyhs eyhsVar) {
        final cejm cejmVar = (cejm) eyhsVar;
        return this.e.b(cejmVar.c).i(new eroh() { // from class: cefn
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cefq.a aVar = (cefq.a) ekhv.a(cefq.this.c, cefq.a.class, (eisx) obj);
                final int i = ((cetk) ceuwVar.a()).c;
                final cekj cE = aVar.cE();
                return cE.i.b("CmsRestoreBackupKeyWorkerAdapter#restore", new Runnable() { // from class: cekd
                    @Override // java.lang.Runnable
                    public final void run() {
                        cekj cekjVar = cekj.this;
                        cekjVar.e.ab(axew.BACKUP_KEY);
                        cekjVar.e.G();
                    }
                }).i(new eroh() { // from class: ceke
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return cekj.this.b.y();
                    }
                }, cE.f).i(new eroh() { // from class: cekf
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        engw engwVar = ((csdq) obj2).a;
                        if (engwVar.isEmpty()) {
                            cekj.a.r("Backup key missing in CMS. No other action needed for restore.");
                            return elfo.e(new ppp());
                        }
                        if (engwVar.size() > 1) {
                            cekj.a.r("More than 1 BACKUP_KEY got backed up");
                        }
                        final int i2 = i;
                        final cekj cekjVar = cekj.this;
                        eszz eszzVar = (eszz) engwVar.get(0);
                        csjb c = cekj.a.c();
                        c.C("CMS backup key labels", eszzVar.h.toArray());
                        c.I("Got Backup key from CMS");
                        c.r();
                        return cekjVar.c.d(eszzVar).h(new emwl() { // from class: cejz
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                return new ppp();
                            }
                        }, cekjVar.f).f(Throwable.class, new eroh() { // from class: ceka
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj3) {
                                Throwable th = (Throwable) obj3;
                                cekj.a.s("Restore of backup key from CMS failed.", th);
                                cekj.this.h.n(epfx.RESTORE_BACKUP_KEY, i2, th);
                                return th instanceof csgt ? ((csgt) th).b.equals(csgx.RETRY) ? elfo.e(new ppo()) : elfo.e(new ppn()) : elfo.d(th);
                            }
                        }, cekjVar.g);
                    }
                }, cE.f).i(new eroh() { // from class: cekg
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        final ppq ppqVar = (ppq) obj2;
                        return cekj.this.e.w("RESTORE_DONE_PAGE_TOKEN").h(new emwl() { // from class: cekb
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                return ppq.this;
                            }
                        }, erpp.a);
                    }
                }, cE.f).f(csgw.class, new eroh() { // from class: cekh
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        final csgw csgwVar = (csgw) obj2;
                        int i2 = csgwVar.a;
                        final cekj cekjVar = cekj.this;
                        elfl a2 = cekjVar.d.a(i2);
                        final int i3 = i;
                        return a2.h(new emwl() { // from class: cekc
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                if (((Boolean) obj3).booleanValue()) {
                                    return new ppp();
                                }
                                csgw csgwVar2 = csgwVar;
                                cekj.this.h.n(epfx.RESTORE_BACKUP_KEY, i3, csgwVar2);
                                return new ppo();
                            }
                        }, cekjVar.g);
                    }
                }, cE.f).e(Throwable.class, new emwl() { // from class: ceki
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        epfx epfxVar = epfx.RESTORE_BACKUP_KEY;
                        int i2 = i;
                        cekj.this.h.n(epfxVar, i2, (Throwable) obj2);
                        return new ppo();
                    }
                }, cE.g);
            }
        }, this.f).h(new emwl() { // from class: cefo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ppq ppqVar = (ppq) obj;
                boolean equals = new ppp().equals(ppqVar);
                cejm cejmVar2 = cejmVar;
                cefq cefqVar = cefq.this;
                if (equals) {
                    cefqVar.d.c(epfi.RESTORE_BACKUP_KEY_WORK, cejmVar2, 2);
                    ceys h = ceyt.h();
                    h.b(true);
                    h.c(false);
                    ((cetn) h).a = engw.r(cegb.a(cefqVar.d.a(cejmVar2)));
                    return h.a();
                }
                if (new ppo().equals(ppqVar)) {
                    return ceyt.m();
                }
                if (!new ppn().equals(ppqVar)) {
                    throw new IllegalArgumentException(String.format("Unknown Result type was found in CmsRestoreBackupKeyWorkHandler! Result is: [%s]", ppqVar));
                }
                cefqVar.d.c(epfi.RESTORE_BACKUP_KEY_WORK, cejmVar2, 3);
                return ceyt.k();
            }
        }, erpp.a).e(baan.class, new emwl() { // from class: cefp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cefq cefqVar = cefq.this;
                cefqVar.b.e(epfx.RESTORE_BACKUP_KEY);
                cefqVar.d.c(epfi.RESTORE_BACKUP_KEY_WORK, cejmVar, 3);
                return ceyt.k();
            }
        }, erpp.a);
    }
}
