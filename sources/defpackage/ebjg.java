package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.accountmenu.features.education.db.EducationDatabase;
import j$.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebjg extends ebgr {
    public final enhk b;
    public final enip c;
    public final EducationDatabase d;
    public final ebjl e;
    public final Executor f;
    public final ebis g;
    private final Resources h;

    /* JADX WARN: Multi-variable type inference failed */
    public ebjg(Context context, final EducationDatabase educationDatabase, Executor executor, ebis ebisVar, engw engwVar) {
        int i;
        this.d = educationDatabase;
        this.e = educationDatabase.y();
        this.f = executor;
        this.g = ebisVar;
        final engr engrVar = new engr();
        final engr engrVar2 = new engr();
        enhd enhdVar = new enhd();
        enin eninVar = new enin();
        this.h = context.getResources();
        int i2 = ((enou) engwVar).c;
        int i3 = 0;
        while (i3 < i2) {
            ebiq ebiqVar = (ebiq) engwVar.get(i3);
            String a = ezoz.a(ebiqVar.d());
            enhdVar.k(a, ebiqVar);
            eninVar.j(ebiqVar.a());
            engrVar.h(new ebjj(a));
            enqu listIterator = ebiqVar.a().listIterator();
            while (true) {
                i = i3 + 1;
                if (listIterator.hasNext()) {
                    engrVar2.h(new ebjk(a, this.h.getResourceName(((Integer) listIterator.next()).intValue())));
                }
            }
            i3 = i;
        }
        this.b = enhdVar.c();
        this.c = eninVar.g();
        executor.execute(new Runnable() { // from class: ebiw
            @Override // java.lang.Runnable
            public final void run() {
                final ebjg ebjgVar = ebjg.this;
                final engr engrVar3 = engrVar;
                final engr engrVar4 = engrVar2;
                educationDatabase.p(new Runnable() { // from class: ebjc
                    @Override // java.lang.Runnable
                    public final void run() {
                        ebjg ebjgVar2 = ebjg.this;
                        ebjl ebjlVar = ebjgVar2.e;
                        final engw g = engrVar3.g();
                        final ebjy ebjyVar = (ebjy) ebjlVar;
                        ovw.b(ebjyVar.a, false, true, new ffji() { // from class: ebjm
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj) {
                                ebjy.this.c.c((ouz) obj, g);
                                return null;
                            }
                        });
                        ebjl ebjlVar2 = ebjgVar2.e;
                        final engw g2 = engrVar4.g();
                        final ebjy ebjyVar2 = (ebjy) ebjlVar2;
                        ovw.b(ebjyVar2.a, false, true, new ffji() { // from class: ebjs
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj) {
                                ebjy.this.b.c((ouz) obj, g2);
                                return null;
                            }
                        });
                    }
                });
            }
        });
    }

    public final void a(ebjj ebjjVar) {
        if (ebjjVar.e == 0) {
            ebjjVar.e = Instant.now().toEpochMilli();
        }
        this.d.y().a(ebjjVar);
    }

    public final void b(final lkr lkrVar, final fr frVar, final ecba ecbaVar) {
        final ebjf ebjfVar = new ebjf(this.f, this.d);
        emxf.m(ecaz.a(ecbaVar), "Anchor is not visible on screen.");
        ebjfVar.f(lkrVar, new llh() { // from class: ebiy
            @Override // defpackage.llh
            public final void a(Object obj) {
                final List list = (List) obj;
                ebjfVar.l(lkrVar);
                if (list == null || list.isEmpty()) {
                    return;
                }
                ecba ecbaVar2 = ecbaVar;
                SelectedAccountDisc selectedAccountDisc = (SelectedAccountDisc) ecbaVar2;
                if (engw.s(eawu.RED_ALERT, eawu.YELLOW_ALERT).contains(selectedAccountDisc.c.c())) {
                    return;
                }
                final ebjg ebjgVar = ebjg.this;
                final ebjj ebjjVar = ((ebjz) list.get(0)).a;
                final ebiq ebiqVar = (ebiq) ebjgVar.b.get(ebjjVar.a);
                if (ebiqVar == null) {
                    ebjgVar.f.execute(new Runnable() { // from class: ebiz
                        @Override // java.lang.Runnable
                        public final void run() {
                            final ebjy ebjyVar = (ebjy) ebjg.this.d.y();
                            otb otbVar = ebjyVar.a;
                            final ebjj ebjjVar2 = ebjjVar;
                            ovw.b(otbVar, false, true, new ffji() { // from class: ebjq
                                @Override // defpackage.ffji
                                public final Object invoke(Object obj2) {
                                    ebjy.this.d.d((ouz) obj2, ebjjVar2);
                                    return null;
                                }
                            });
                        }
                    });
                    return;
                }
                if (ebjjVar.c == 0 && ebiqVar.c(frVar, ecbaVar2, new Runnable() { // from class: ebja
                    @Override // java.lang.Runnable
                    public final void run() {
                        final ebjg ebjgVar2 = ebjg.this;
                        final ebiq ebiqVar2 = ebiqVar;
                        final ebjj ebjjVar2 = ebjjVar;
                        ebjgVar2.f.execute(new Runnable() { // from class: ebix
                            @Override // java.lang.Runnable
                            public final void run() {
                                ebjg ebjgVar3 = ebjg.this;
                                ebjj ebjjVar3 = ebjjVar2;
                                ebjgVar3.a(ebjjVar3);
                                ebjjVar3.f = Instant.now().toEpochMilli();
                                if (ebiqVar2.b()) {
                                    ebjjVar3.c = 1;
                                    if (ebjgVar3.c.isEmpty()) {
                                        ebjjVar3.h = true;
                                    }
                                }
                                ebjgVar3.d.y().a(ebjjVar3);
                            }
                        });
                        ebjgVar2.g.a();
                    }
                })) {
                    ebjgVar.f.execute(new Runnable() { // from class: ebjb
                        @Override // java.lang.Runnable
                        public final void run() {
                            ebjg ebjgVar2 = ebjg.this;
                            ebjgVar2.a(ebjjVar);
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                final ebjk ebjkVar = ((ebjz) it.next()).b;
                                if (ebjkVar != null && ebjkVar.e) {
                                    ebjkVar.e = false;
                                    final ebjy ebjyVar = (ebjy) ebjgVar2.e;
                                    ovw.b(ebjyVar.a, false, true, new ffji() { // from class: ebjp
                                        @Override // defpackage.ffji
                                        public final Object invoke(Object obj2) {
                                            ebjy.this.e.d((ouz) obj2, ebjkVar);
                                            return null;
                                        }
                                    });
                                }
                            }
                        }
                    });
                    AccountParticleDisc accountParticleDisc = selectedAccountDisc.c;
                    int d = ebiqVar.d();
                    eyfw eyfwVar = ebvr.b;
                    ebvs ebvsVar = (ebvs) ebvt.a.createBuilder();
                    epnh epnhVar = (epnh) epni.a.createBuilder();
                    epnf epnfVar = (epnf) epng.a.createBuilder();
                    epnfVar.copyOnWrite();
                    epng epngVar = (epng) epnfVar.instance;
                    epngVar.c = d - 1;
                    epngVar.b |= 2;
                    epnhVar.copyOnWrite();
                    epni epniVar = (epni) epnhVar.instance;
                    epng epngVar2 = (epng) epnfVar.build();
                    epngVar2.getClass();
                    epniVar.d = epngVar2;
                    epniVar.c |= 1;
                    ebvsVar.copyOnWrite();
                    ebvt ebvtVar = (ebvt) ebvsVar.instance;
                    epni epniVar2 = (epni) epnhVar.build();
                    epniVar2.getClass();
                    ebvtVar.c = epniVar2;
                    ebvtVar.b |= 1;
                    ebwb.b(accountParticleDisc, new dvxg(eyfwVar, (ebvt) ebvsVar.build()));
                }
            }
        });
    }
}
