package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akfu implements fbbf {
    public final akis a;
    public final akhy b;
    private final akfy c;
    private final akfv d;
    private final int e;

    public akfu(akis akisVar, akhy akhyVar, akfy akfyVar, akfv akfvVar, int i) {
        this.a = akisVar;
        this.b = akhyVar;
        this.c = akfyVar;
        this.d = akfvVar;
        this.e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v8, types: [ekki] */
    @Override // defpackage.ffbr, defpackage.ffbq
    public final Object b() {
        String str = "Expected activity to be a FragmentActivity: ";
        switch (this.e) {
            case 0:
                return new ellq((elbx) this.b.ap.b());
            case 1:
                csjk csjkVar = (csjk) this.a.a.el.b();
                akis akisVar = this.a;
                akkp akkpVar = akisVar.a;
                fbbf fbbfVar = akisVar.b.hs;
                ckds ckdsVar = (ckds) akkpVar.dp.b();
                akkp akkpVar2 = this.a.a;
                fbbf fbbfVar2 = akkpVar2.br;
                azbq azbqVar = (azbq) akkpVar2.AO.b();
                akkp akkpVar3 = this.a.a;
                return new aqgi(csjkVar, fbbfVar, ckdsVar, fbbfVar2, azbqVar, akkpVar3.An, akkpVar3.iA);
            case 2:
                return new akfs(this);
            case 3:
                return new akft(this);
            case 4:
                Activity activity = this.d.a;
                if (activity != null) {
                    return activity;
                }
                throw new IllegalStateException("Attempted use of the activity when it is null");
            case 5:
                dsml an = ((dsmq) ((fbas) ((ekki) this.d.j.b()).a).aX()).an();
                an.getClass();
                return an;
            case 6:
                Activity activity2 = this.d.a;
                try {
                    emxc j = activity2 == null ? emux.a : emxc.j((eg) activity2);
                    str = this.d.am;
                    return ekle.a(j, str);
                } catch (ClassCastException e) {
                    throw new IllegalStateException(str.concat(String.valueOf(String.valueOf(activity2))), e);
                }
            case 7:
                dqlp al = ((dqlr) ((fbas) ((ekki) this.d.j.b()).a).aX()).al();
                al.getClass();
                return al;
            case 8:
                Activity activity3 = (Activity) this.d.i.b();
                try {
                    return (eg) activity3;
                } catch (ClassCastException e2) {
                    throw new IllegalStateException("Expected activity to be a FragmentActivity: ".concat(activity3.toString()), e2);
                }
            case 9:
                return new ugd((Activity) this.d.i.b(), (dsma) this.d.k.b());
            case 10:
                return ugw.a((ekki) this.d.j.b());
            case 11:
                return ugu.a((ekki) this.d.j.b());
            case 12:
                ekmz aQ = ((crkk) ((fbas) ((ekki) this.d.j.b()).a).aX()).aQ();
                aQ.getClass();
                return aQ;
            case 13:
                ctuo Z = ((ctup) ((fbas) ((ekki) this.d.j.b()).a).aX()).Z();
                Z.getClass();
                return Z;
            case 14:
                return tao.a((ekki) this.d.j.b());
            case 15:
                return vyv.a((ekki) this.d.j.b());
            case 16:
                cvom aa = ((cvnj) ((fbas) ((ekki) this.d.j.b()).a).aX()).aa();
                aa.getClass();
                return aa;
            case 17:
                return new ekyo((elbx) this.b.ap.b());
            case 18:
                fbaz.a(this.d.w);
                return Optional.empty();
            case 19:
                return new byzz((ejvb) this.a.dy.b(), (ejvp) this.a.aR.b());
            case 20:
                Context context = (Context) this.a.q.b();
                akfv akfvVar = this.d;
                return new upe(context, new upa((Context) akfvVar.i.b(), (elbx) akfvVar.c.ap.b(), (vzx) akfvVar.c.oP.b()));
            case 21:
                return new upd((Context) this.a.q.b(), (ckds) this.a.a.dp.b());
            case 22:
                return upj.a((ekki) this.d.j.b());
            case 23:
                return new uxv();
            case 24:
                aigx aigxVar = (aigx) this.c.l.b();
                ffsk ffskVar = (ffsk) this.d.D.b();
                lkk lkkVar = (lkk) this.d.E.b();
                akfv akfvVar2 = this.d;
                enhd h = enhk.h(53);
                h.k(aiir.class, new aiiv(akfvVar2.r()));
                h.k(aiiw.class, akfvVar2.s());
                h.k(aiiy.class, new aiiz((Context) akfvVar2.i.b(), akfvVar2.c.ob));
                h.k(aijc.class, new aije((Context) akfvVar2.i.b()));
                h.k(aijf.class, new aijh((Context) akfvVar2.i.b(), akfvVar2.r, akfvVar2.b.a.Px));
                h.k(aiji.class, new aijk((Context) akfvVar2.i.b()));
                h.k(aijl.class, new aijm((Context) akfvVar2.i.b(), (axul) akfvVar2.b.b.id.b()));
                h.k(aijq.class, new aijs(new atfv(akfvVar2.b.b.a.a.s), (Activity) akfvVar2.i.b(), akfvVar2.c.oP, (akzt) akfvVar2.b.a.C.b(), (askh) akfvVar2.b.a.mS.b()));
                h.k(aijv.class, new aijx((Activity) akfvVar2.i.b(), akfvVar2.c.an, akfvVar2.F));
                h.k(aijn.class, new aijy((Context) akfvVar2.i.b(), akfvVar2.c.an, akfvVar2.b.a.nV));
                Activity activity4 = (Activity) akfvVar2.i.b();
                lkk P = ((eg) akfvVar2.m.b()).P();
                P.getClass();
                h.k(aijz.class, new aikc(activity4, P, (ffsk) akfvVar2.b.a.p.b()));
                h.k(aikd.class, new aike((Activity) akfvVar2.i.b()));
                h.k(aikf.class, new aikg((Context) akfvVar2.i.b(), (eisx) akfvVar2.c.b.b(), (ddou) akfvVar2.b.b.iY.b()));
                h.k(aikl.class, new aiko((Context) akfvVar2.i.b(), akfvVar2.D(), akfvVar2.r()));
                h.k(aikq.class, new aikr((Context) akfvVar2.i.b()));
                Activity activity5 = (Activity) akfvVar2.i.b();
                akkp akkpVar4 = akfvVar2.b.a;
                h.k(aiks.class, new aikt(activity5, akkpVar4.Px, (Optional) akkpVar4.nl.b(), (ddxv) akfvVar2.H.b()));
                Context context2 = (Context) akfvVar2.i.b();
                eisx eisxVar = (eisx) akfvVar2.c.b.b();
                akis akisVar2 = akfvVar2.b;
                ahtv T = akisVar2.b.T();
                cbgh cbghVar = (cbgh) akisVar2.dY.b();
                final fbbf fbbfVar3 = akfvVar2.b.b.a.a.s;
                h.k(aikw.class, new aikv(context2, eisxVar, T, cbghVar, new athf() { // from class: atfz
                    @Override // defpackage.athf
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_forward_message_logging");
                    }
                }));
                h.k(aion.class, new aioo((Context) akfvVar2.i.b()));
                h.k(aikx.class, new aiky((Context) akfvVar2.i.b(), (eisx) akfvVar2.c.b.b(), akfvVar2.c.ob));
                h.k(aikz.class, new ailb((Context) akfvVar2.i.b(), (ayfg) akfvVar2.c.an.b()));
                h.k(ailc.class, new aild((Context) akfvVar2.i.b(), (vzx) akfvVar2.c.oP.b()));
                Context context3 = (Context) akfvVar2.i.b();
                akis akisVar3 = akfvVar2.b;
                h.k(aile.class, new ailf(context3, akisVar3.cy(), (ddzb) akisVar3.a.nk.b()));
                h.k(ailg.class, new ailh((ahnp) akfvVar2.I.b()));
                h.k(ailj.class, new ailn((Context) akfvVar2.i.b(), akfvVar2.D(), akfvVar2.r(), Optional.of(new dcxf()), (cbgh) akfvVar2.b.dY.b()));
                h.k(ailq.class, new ailr((eg) akfvVar2.m.b()));
                Context context4 = (Context) akfvVar2.i.b();
                ffhd ffhdVar = (ffhd) akfvVar2.b.cn.b();
                ffsk ffskVar2 = (ffsk) akfvVar2.D.b();
                akhy akhyVar = akfvVar2.c;
                h.k(ails.class, new ailv(context4, ffhdVar, ffskVar2, akhyVar.gO, akfvVar2.b.a.an, akhyVar.N));
                h.k(ailx.class, new ailw((Context) akfvVar2.i.b(), akfvVar2.b.a.eU));
                h.k(aily.class, new aima((cgie) akfvVar2.c.gL.b(), akfvVar2.r()));
                h.k(aimc.class, new aimd((Context) akfvVar2.i.b()));
                h.k(aime.class, new aimh((Optional) akfvVar2.K.b(), (Activity) akfvVar2.i.b(), (eito) akfvVar2.L.b()));
                h.k(aimi.class, new aimj((Context) akfvVar2.i.b()));
                Context context5 = (Context) akfvVar2.i.b();
                aiiu r = akfvVar2.r();
                eisx eisxVar2 = (eisx) akfvVar2.c.b.b();
                ejar ejarVar = (ejar) akfvVar2.b.a.au.b();
                fapp fappVar = fapp.ANDROID_MESSAGES;
                fappVar.getClass();
                h.k(aimk.class, new aimm(context5, r, eisxVar2, ejarVar, new efuv(fappVar), (ffhd) akfvVar2.b.cP.b()));
                akfvVar2.r();
                h.k(aimn.class, new aimp());
                h.k(aimq.class, new aimr((eg) akfvVar2.m.b()));
                h.k(aims.class, new aimu((Context) akfvVar2.i.b(), (ffsk) akfvVar2.b.a.q.b(), akfvVar2.c.ob));
                h.k(aimv.class, new aimw((Context) akfvVar2.i.b()));
                h.k(aimz.class, new ainb(akfvVar2.r));
                h.k(ainc.class, new aind(akfvVar2.r()));
                h.k(aine.class, new ainf((Context) akfvVar2.i.b()));
                h.k(aing.class, new ainh((Context) akfvVar2.i.b(), (eisx) akfvVar2.c.b.b(), (ddou) akfvVar2.b.b.iY.b()));
                h.k(aini.class, new ainj((Context) akfvVar2.i.b(), (eisx) akfvVar2.c.b.b(), (ddou) akfvVar2.b.b.iY.b()));
                h.k(aink.class, new ainl((Activity) akfvVar2.i.b(), akfvVar2.b.nX, akfvVar2.c.ob));
                h.k(ainm.class, new ainn((Context) akfvVar2.i.b()));
                h.k(aino.class, new ainq((Context) akfvVar2.i.b(), (axul) akfvVar2.b.b.id.b()));
                h.k(ainr.class, new aint((Context) akfvVar2.i.b()));
                Context context6 = (Context) akfvVar2.i.b();
                akhy akhyVar2 = akfvVar2.c;
                h.k(ainu.class, new ainv(context6, akhyVar2.an, (eisx) akhyVar2.b.b()));
                h.k(aioq.class, new aiow((Optional) akfvVar2.c.iY.b(), (ffsk) akfvVar2.b.a.q.b(), (dgym) akfvVar2.b.iB.b(), (dqli) akfvVar2.l.b(), (ctud) akfvVar2.b.cT.b()));
                h.k(ainx.class, new ainy((Context) akfvVar2.i.b(), (axul) akfvVar2.b.b.id.b()));
                h.k(ainz.class, new aioc((Context) akfvVar2.i.b(), akfvVar2.M));
                h.k(aiod.class, new aiog((Context) akfvVar2.b.q.b(), akfvVar2.r(), (adgn) akfvVar2.c.oe.b()));
                Context context7 = (Context) akfvVar2.i.b();
                akis akisVar4 = akfvVar2.b;
                h.k(aioh.class, new aioi(context7, akisVar4.cy(), (ddzb) akisVar4.a.nk.b()));
                h.k(aioj.class, new aiok((Context) akfvVar2.i.b()));
                h.k(aiol.class, new aiom((Context) akfvVar2.i.b()));
                enhk c = h.c();
                akfv akfvVar3 = this.d;
                return new aihf(aigxVar, ffskVar, lkkVar, c, enhk.n(aiid.class, new aiic((aigx) akfvVar3.d.l.b()), aiin.class, new aiim((aigx) akfvVar3.d.l.b()), aiiq.class, new aiip((aigx) akfvVar3.d.l.b())));
            case 25:
                ffhd ffhdVar2 = (ffhd) this.a.a.rZ.b();
                fazv fazvVar = (fazv) this.c.b.b();
                ekki ekkiVar = (ekki) this.d.j.b();
                ffhdVar2.getClass();
                fazvVar.getClass();
                ekkiVar.getClass();
                efbd.c();
                ffsk b = ffsl.b(ffhdVar2.plus(new ffvf(null)));
                ejqt ejqtVar = new ejqt(fazvVar, ekkiVar, b);
                fazvVar.a(ejqtVar);
                ekkiVar.P().c(ejqtVar);
                return b;
            case 26:
                return eklb.a((eg) this.d.m.b());
            case 27:
                return new aijb((ffhd) this.a.cP.b(), (ames) this.a.a.pD.b(), this.b.P);
            case 28:
                akhy akhyVar3 = this.b;
                fazb a = fbaz.a(this.a.a.fP);
                dcxt dcxtVar = (dcxt) this.d.G.b();
                akzt akztVar = (akzt) this.a.a.f.b();
                cpbs cpbsVar = (cpbs) this.a.a.ft.b();
                akkp akkpVar5 = this.a.a;
                return new ddxs(akhyVar3.ob, a, dcxtVar, akztVar, cpbsVar, akkpVar5.Px, (ddzb) akkpVar5.nk.b(), (elbx) this.b.ap.b());
            case 29:
                akis akisVar5 = this.a;
                akkp akkpVar6 = akisVar5.a;
                fbbf fbbfVar4 = akisVar5.q;
                fbbf a2 = fbbg.a(akkpVar6.fP);
                akis akisVar6 = this.a;
                akhy akhyVar4 = this.b;
                akkp akkpVar7 = akisVar6.a;
                fbbf fbbfVar5 = akkpVar7.f;
                akko akkoVar = akisVar6.b;
                return new dcxt(fbbfVar4, akisVar5.aU, a2, fbbfVar5, akkoVar.hn, akkoVar.ie, akkpVar7.Cv, akkoVar.dk, akisVar6.cz, akkpVar7.gJ, akhyVar4.ap, akisVar6.aK, akkpVar7.bj, akkpVar7.cK, akhyVar4.ok, akkpVar7.bo);
            case 30:
                return new ahnp((Activity) this.d.i.b());
            case 31:
                return Optional.of((admk) this.d.J.b());
            case 32:
                cgfd cgfdVar = (cgfd) this.a.a.Dy.b();
                akis akisVar7 = this.a;
                return new admr(cgfdVar, akisVar7.a.ck, (errl) akisVar7.p.b());
            case 33:
                eito aL = ((eitx) fazh.a(((ekki) this.d.j.b()).a, eitx.class)).aL();
                aL.getClass();
                return aL;
            case 34:
                return Optional.of(this.a.b.dt());
            case 35:
                return new cwor((Context) this.d.i.b(), (ffsk) this.d.D.b(), (lkk) this.d.E.b(), (cwos) this.c.m.b());
            case 36:
                fbaz.a(this.d.P);
                return Optional.empty();
            case 37:
                akfv akfvVar4 = this.d;
                return Optional.of(acxg.a(akfvVar4.b.dQ, fbaz.a(akfvVar4.V)));
            case 38:
                Context context8 = (Context) this.a.q.b();
                akfv akfvVar5 = this.d;
                acxk acxkVar = (acxk) akfvVar5.T.b();
                akis akisVar8 = this.a;
                akfv akfvVar6 = this.d;
                akkp akkpVar8 = akisVar8.a;
                return new acxj(context8, akfvVar5.R, akfvVar5.S, acxkVar, akisVar8.aZ, akkpVar8.Px, akfvVar6.U, akkpVar8.al);
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return new acxo((Context) this.d.i.b());
            case 40:
                return Optional.of((acls) this.a.b.jP.b());
            case 41:
                return new acxk((ctwb) this.a.a.c.b(), (ctud) this.a.cT.b());
            case 42:
                akis akisVar9 = this.a;
                akkp akkpVar9 = akisVar9.a;
                return new acso(akisVar9.b.fa, akkpVar9.dr, akkpVar9.f);
            case 43:
                return aejq.a((ekki) this.d.j.b());
            case 44:
                return new crpw(this.d.Z, this.a.b.jR);
            case 45:
                return new crps((crjx) this.a.a.r.b());
            case 46:
                return new stm((Context) this.a.q.b());
            case 47:
                return Optional.of(this.a.b.ct());
            case 48:
                return Optional.of(this.a.b.A());
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return ahre.a((ekki) this.d.j.b());
            case 50:
                return ajmb.a((ekki) this.d.j.b());
            case 51:
                fbaz.a(this.d.ag);
                return Optional.empty();
            case 52:
                return ekjl.b((ekki) this.d.j.b());
            case 53:
                return Optional.of((dsma) this.d.k.b());
            case 54:
                return new ddtv((ctyz) this.a.fM.b(), this.d.ak, (akvg) this.a.a.Px.b(), (adtc) this.b.ob.b(), (Context) this.d.i.b());
            default:
                return new ddpm(this.a.a.f);
        }
    }
}
