package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wqb implements ffjm {
    final /* synthetic */ wqj a;
    final /* synthetic */ boolean b;

    public wqb(wqj wqjVar, boolean z) {
        this.a = wqjVar;
        this.b = z;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        fgdj a;
        dsqt dsqtVar;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            abdj abdjVar = this.a.a().b;
            abdjVar.c.a();
            abmk abmkVar = abdjVar.y;
            abok abokVar = abmkVar.d;
            ablf ablfVar = abokVar.a;
            fgcm a2 = fgdm.a(null);
            ablfVar.e();
            abmm abmmVar = new abmm(a2, ((abox) abmkVar.a).b, abokVar.b, ((abng) abmkVar.b).b, ((abmg) abmkVar.c).h, new abmj(abmkVar), new abml(null));
            zky zkyVar = abdjVar.a;
            ekzz f = eleg.f("PagedMessageListUiAdapterImpl#createUiData");
            try {
                ffxx ffxxVar = ((zmw) zkyVar).M;
                ffxx a3 = ((zmw) zkyVar).e.a();
                ffsk ffskVar = ((zmw) zkyVar).l;
                int i = fgcz.a;
                fgdj b = fgbn.b(a3, ffskVar, fgcy.a(0L, 3), null);
                fgcq d = ((zmw) zkyVar).h.d();
                zpi zpiVar = ((zmw) zkyVar).c;
                int i2 = (((Boolean) ((zqj) zpiVar).k.c()).booleanValue() && ((Boolean) ((cfup) ctjd.au.get()).e()).booleanValue()) ? 2 : 1;
                ensk e = zqj.a.e();
                e.Y(ente.a, "FooterUiAdapterImpl");
                ((enrr) e.h("com/google/android/apps/messaging/conversation2/messagelist/footer/MessageListFooterUiAdapterImpl", "createUiData", 297, "MessageListFooterUiAdapterImpl.kt")).J("#createUiData: isPenpalConversation=%s, flag=%s, rowCount=%s", ((zqj) zpiVar).k.c(), ((cfup) ctjd.au.get()).e(), Integer.valueOf(i2));
                zql zqlVar = new zql(((zqj) zpiVar).g, ((zqj) zpiVar).i, ((zqj) zpiVar).j, i2, new zqk(((zqj) zpiVar).f.a()));
                if (((zmw) zkyVar).u.a()) {
                    zqu zquVar = ((zmw) zkyVar).U;
                    a = fgbn.b(new fgch(zquVar.c, zquVar.d, new zqt(zquVar, null)), zquVar.a, fgcy.a, null);
                } else {
                    a = fgdm.a(null);
                }
                fgdj fgdjVar = a;
                fgdj a4 = ((zmw) zkyVar).d.a();
                fgdj fgdjVar2 = ((zmw) zkyVar).O;
                zqv zqvVar = ((zmw) zkyVar).Q;
                zpd zpdVar = ((zmw) zkyVar).R;
                Object b2 = ((zmw) zkyVar).z.b();
                b2.getClass();
                akzt akztVar = (akzt) b2;
                fgdj fgdjVar3 = ((zmw) zkyVar).D.b;
                ffxx ffxxVar2 = ((zmw) zkyVar).P;
                zkt zktVar = ((zmw) zkyVar).r;
                zli zliVar = new zli(zktVar);
                zlj zljVar = new zlj(zktVar);
                fgdj fgdjVar4 = ((zmw) zkyVar).T.a;
                zlk zlkVar = new zlk(zkyVar);
                zll zllVar = new zll(zkyVar);
                zlm zlmVar = new zlm(zkyVar);
                zln zlnVar = new zln(zkyVar);
                zlo zloVar = new zlo(zkyVar);
                zmy zmyVar = new zmy(((zmw) zkyVar).u.a(), ((zmw) zkyVar).A.a(), ((zmw) zkyVar).G.a(), ((ersq) ((arrr) ((zmw) zkyVar).H).a.b()).a("bugle.enable_swipe_to_show_timestamps_hold_fix"));
                final zmw zmwVar = (zmw) zkyVar;
                zmz zmzVar = new zmz(ffxxVar, b, d, zqlVar, fgdjVar, a4, fgdjVar2, zqvVar, zpdVar, akztVar, fgdjVar3, ffxxVar2, zliVar, zljVar, fgdjVar4, zlkVar, zllVar, zlmVar, zlnVar, zloVar, zmyVar, new ffix() { // from class: zlc
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        zmw.this.g.b();
                        return ffcu.a;
                    }
                });
                ffig.a(f, null);
                xem xemVar = abdjVar.r;
                yyk yykVar = (yyk) xemVar.b;
                xen xenVar = new xen(xemVar.a.a(), xemVar.c, yykVar.b, yykVar.c);
                ajjd ajjdVar = abdjVar.b;
                ablq ablqVar = abdjVar.s;
                zqv zqvVar2 = abdjVar.t;
                Optional optional = abdjVar.d;
                fgdj f2 = ajjdVar.f();
                zef zefVar = (zef) fflm.b(optional);
                zeb zebVar = zefVar != null ? new zeb(zefVar.a) : null;
                zqv zqvVar3 = abdjVar.t;
                zej zejVar = abdjVar.u;
                ffxx a5 = ffyy.a(zqvVar3.e);
                abcz abczVar = new abcz(abdjVar);
                abda abdaVar = new abda(abdjVar);
                abdb abdbVar = new abdb(abdjVar);
                abah abahVar = abdjVar.x;
                final ffji ffjiVar = new ffji() { // from class: abaf
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        return ((cywp) obj3).a(new cyvt(3));
                    }
                };
                Object orElse = abahVar.a.map(new Function() { // from class: abag
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        return ffji.this.invoke(obj3);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(fgdm.a(null));
                orElse.getClass();
                fgdj fgdjVar5 = (fgdj) orElse;
                boolean a6 = ((ersq) ((aure) abdjVar.m).a.b()).a("bugle.read_samsung_bit_in_conversation_screen_ui_adapter") ? abdjVar.n.a() : abdjVar.g.containsKey(cwmn.b);
                abeo abeoVar = (abeo) fflm.b(abdjVar.h);
                ffbr ffbrVar = abdjVar.i;
                if (!abdjVar.o.a() && !abdjVar.p.a()) {
                    ffbrVar = null;
                }
                abem.i(new abdn(abmmVar, zmzVar, xenVar, f2, ablqVar.a, zqvVar2.d, zebVar, a5, zejVar.a, abczVar, abdaVar, abdbVar, a6, fgdjVar5, abeoVar, (ffbrVar == null || (dsqtVar = (dsqt) ffbrVar.b()) == null) ? null : dsqtVar.a(), new abdm(((ersq) ((atcs) abdjVar.j).a.b()).a("bugle.use_conversation_snackbar_host_state_in_projector"), abdjVar.k.a(), ((ersq) ((atgw) abdjVar.l).a.b()).a("bugle.move_snackbar_above_compose_row"))), this.b, hfdVar, 0);
            } finally {
            }
        }
        return ffcu.a;
    }
}
