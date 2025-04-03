package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import com.google.android.apps.messaging.audio.attachment.AudioAttachmentView;
import com.google.android.apps.messaging.conversation.badges.BadgesRecyclerView;
import com.google.android.apps.messaging.dittosatellite.gaia.gaiapairingsignin.GpWebTabletExpressSignInTopView;
import com.google.android.apps.messaging.gaia.expresssignin.HqmsExpressSignInTopView;
import com.google.android.apps.messaging.home.banner.HomeBannerView;
import com.google.android.apps.messaging.label.ui.recategorize.ChangeCategoryView;
import com.google.android.apps.messaging.otp.deletion.save.SaveOtpView;
import com.google.android.apps.messaging.penpal.gaia.PenpalExpressSignInTopView;
import com.google.android.apps.messaging.shared.ui.attachment.MessageAttachmentContainer;
import com.google.android.apps.messaging.ui.appsettings.RcsSimStatusView;
import com.google.android.apps.messaging.ui.attachment.AttachmentsContainer;
import com.google.android.apps.messaging.ui.attachment.video.VideoAttachmentView;
import com.google.android.apps.messaging.ui.rcs.setup.RcsWelcomeMessageView;
import com.google.android.apps.messaging.ui.search.homeview.ZeroStateContentGridLayout;
import com.google.android.apps.messaging.ui.search.resultsview.StarredMessagesResultItemView;
import com.google.android.apps.messaging.ui.search.resultsview.ZeroStateSearchMultipleResultsView;
import com.google.android.apps.messaging.ui.search.resultsview.ZeroStateSearchResultsView;
import com.google.android.apps.messaging.ui.search.resultsview.conversation.SearchConversationResultItemView;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akkw extends akfm {
    final fbbf A;
    final fbbf B;
    final fbbf C;
    final fbbf D;
    final fbbf E;
    final fbbf F;
    final fbbf G;
    private final akhy H;
    private final akgo I;
    private final akkw J = this;
    public final View a;
    public final akis b;
    public final akfv c;
    final fbbf d;
    final fbbf e;
    final fbbf f;
    final fbbf g;
    final fbbf h;
    final fbbf i;
    final fbbf j;
    final fbbf k;
    final fbbf l;
    final fbbf m;
    final fbbf n;
    final fbbf o;
    final fbbf p;
    final fbbf q;
    final fbbf r;
    final fbbf s;
    final fbbf t;
    final fbbf u;
    final fbbf v;
    final fbbf w;
    final fbbf x;
    final fbbf y;
    final fbbf z;

    public akkw(akis akisVar, akhy akhyVar, akfv akfvVar, akgo akgoVar, View view) {
        this.b = akisVar;
        this.H = akhyVar;
        this.c = akfvVar;
        this.I = akgoVar;
        this.a = view;
        this.d = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 0);
        this.e = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 1);
        this.f = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 2);
        this.g = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 3);
        this.h = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 4);
        this.i = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 5);
        this.j = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 6);
        this.k = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 7);
        this.l = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 8);
        this.m = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 10);
        this.n = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 11);
        this.o = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 13);
        this.p = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 14);
        this.q = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 12);
        this.r = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 16);
        this.s = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 15);
        this.t = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 17);
        this.u = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 18);
        this.v = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 19);
        this.w = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 20);
        this.x = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 9);
        this.y = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 21);
        this.z = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 22);
        this.A = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 23);
        this.B = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 24);
        this.C = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 25);
        this.D = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 26);
        this.E = new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 27);
        this.F = fbbi.a(new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 28));
        this.G = fbbi.a(new akkv(akisVar, akhyVar, akfvVar, akgoVar, this, 29));
    }

    @Override // defpackage.aefo
    public final aefn B() {
        elbx elbxVar = (elbx) this.H.ap.b();
        ejlq ejlqVar = (ejlq) this.I.f.b();
        HomeBannerView a = aefq.a(this.a);
        return new aefn(elbxVar, ejlqVar, a);
    }

    @Override // defpackage.aeio
    public final aein D() {
        return new aein(aeiq.a(this.a), this.I.ab(), this.b.b.kf);
    }

    @Override // defpackage.aept
    public final aepr F() {
        return new aepr(aepv.a(this.a), this.h);
    }

    @Override // defpackage.ahjm
    public final ahjl H() {
        return new ahjl(ahjo.a(this.a));
    }

    @Override // defpackage.ahkq
    public final ahko J() {
        eg egVar = (eg) this.c.m.b();
        ChangeCategoryView a = ahks.a(this.a);
        akis akisVar = this.b;
        akkp akkpVar = akisVar.a;
        aewt aewtVar = new aewt(akkpVar.dF, akkpVar.dE, new aexz(), this.H.S, (Executor) akisVar.p.b(), (errl) this.b.t.b());
        akhy akhyVar = this.H;
        fazb a2 = fbaz.a(this.I.by);
        elbx elbxVar = (elbx) akhyVar.ap.b();
        fbbf fbbfVar = this.i;
        akgo akgoVar = this.I;
        return new ahko(egVar, a, akgoVar.bt, akgoVar.bp, aewtVar, a2, fbbfVar, elbxVar);
    }

    @Override // defpackage.aivo
    public final aivm L() {
        View view = this.a;
        fbbf fbbfVar = this.c.m;
        SaveOtpView a = aivq.a(view);
        akgo akgoVar = this.I;
        fbbf fbbfVar2 = akgoVar.by;
        return new aivm(fbbfVar, a, akgoVar.bw, fbaz.a(fbbfVar2), this.i, this.H.ap, this.j);
    }

    @Override // defpackage.ajew
    public final ajev N() {
        PenpalExpressSignInTopView a = ajey.a(this.a);
        akis akisVar = this.b;
        return new ajev(a, akisVar.cr, this.k, akisVar.b.ld, this.I.az);
    }

    final TypedArray P() {
        return ellu.a(this.a);
    }

    @Override // defpackage.akmo
    public final akmn Q() {
        return new akmn(akmq.a(this.a), P());
    }

    @Override // defpackage.akms
    public final akmr R() {
        return new akmr(akmu.a(this.a));
    }

    @Override // defpackage.cjje
    public final cjjd S() {
        return new cjjd(cjjg.a(this.a), this.h);
    }

    @Override // defpackage.cxbc
    public final cxba T() {
        return new cxba(this.l);
    }

    @Override // defpackage.cxcu
    public final cxct U() {
        RcsSimStatusView a = cxcw.a(this.a);
        akis akisVar = this.b;
        akkp akkpVar = akisVar.a;
        fbbf fbbfVar = this.c.i;
        fbbf fbbfVar2 = akisVar.cz;
        fbbf fbbfVar3 = akkpVar.Px;
        fbbf fbbfVar4 = akisVar.aU;
        fbbf fbbfVar5 = akkpVar.dp;
        fbbf fbbfVar6 = akkpVar.bo;
        fbbf fbbfVar7 = this.H.ob;
        fbbf fbbfVar8 = akisVar.hl;
        akko akkoVar = akisVar.b;
        return new cxct(a, fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, fbbfVar5, fbbfVar6, fbbfVar7, fbbfVar8, akkoVar.lg, akkpVar.wc, akkpVar.HO, akkoVar.lh, akkoVar.li);
    }

    @Override // defpackage.cxnl
    public final cxnk V() {
        AttachmentsContainer a = cxnn.a(this.a);
        akis akisVar = this.b;
        akkp akkpVar = akisVar.a;
        fbbf fbbfVar = akkpVar.fP;
        fbbf fbbfVar2 = akisVar.cK;
        fbbf fbbfVar3 = akisVar.ps;
        fbbf fbbfVar4 = akkpVar.r;
        akgo akgoVar = this.I;
        fbbf fbbfVar5 = akgoVar.p;
        fbbf fbbfVar6 = akkpVar.ha;
        fbbf fbbfVar7 = akkpVar.Px;
        fbbf fbbfVar8 = akkpVar.nl;
        akhy akhyVar = this.H;
        return new cxnk(a, fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, fbbfVar5, fbbfVar6, fbbfVar7, fbbfVar8, akhyVar.oZ, akhyVar.ap, akgoVar.fa, akgoVar.fc);
    }

    @Override // defpackage.cxox
    public final cxow W() {
        VideoAttachmentView a = cxoz.a(this.a);
        TypedArray P = P();
        akgo akgoVar = this.I;
        fbbf fbbfVar = this.c.t;
        fbbf fbbfVar2 = akgoVar.aO;
        akis akisVar = this.b;
        return new cxow(a, P, akisVar.ps, akisVar.b.lj, fbbfVar, fbbfVar2, akisVar.a.al);
    }

    @Override // defpackage.cxpk
    public final cxpj X() {
        return new cxpj(cxpm.a(this.a));
    }

    @Override // defpackage.cxwa
    public final cxtc Y() {
        return new cxtc(this.b.a.ej, this.x);
    }

    @Override // defpackage.czhg
    public final czhe Z() {
        czhi.a(this.a);
        return new czhe();
    }

    @Override // defpackage.sgv
    public final void a(AudioAttachmentView audioAttachmentView) {
        audioAttachmentView.g = (cxqh) this.b.a.af.b();
        audioAttachmentView.h = (smw) this.b.b.la.b();
        audioAttachmentView.i = this.I.aW;
        audioAttachmentView.j = this.d;
        audioAttachmentView.k = this.e;
        audioAttachmentView.l = this.H.ap;
        audioAttachmentView.m = this.c.e;
        audioAttachmentView.n = this.b.a.nk;
    }

    @Override // defpackage.cznb
    public final czna aa() {
        return new czna(cznd.a(this.a), this.c.e);
    }

    @Override // defpackage.czvb
    public final czva ab() {
        akhy akhyVar = this.H;
        fbbf fbbfVar = this.y;
        fbbf fbbfVar2 = this.z;
        fbbf fbbfVar3 = akhyVar.ap;
        akgo akgoVar = this.I;
        akis akisVar = this.b;
        return new czva(fbbfVar, fbbfVar2, fbbfVar3, akhyVar.bb, akisVar.a.p, akisVar.b.iq, akgoVar.bG);
    }

    @Override // defpackage.daes
    public final daer ac() {
        return new daer(daeu.a(this.a));
    }

    @Override // defpackage.dbvh
    public final dbvg ad() {
        return new dbvg(dbvj.a(this.a), this.b.a.Px, (elbx) this.H.ap.b());
    }

    @Override // defpackage.dcyy
    public final dcyx ae() {
        RcsWelcomeMessageView a = dcza.a(this.a);
        akis akisVar = this.b;
        akko akkoVar = akisVar.b;
        return new dcyx(a, akisVar.a.Px, this.I.cL, akkoVar.lr);
    }

    @Override // defpackage.ddog
    public final ddof af() {
        return new ddof(ddoi.a(this.a));
    }

    @Override // defpackage.ddoq
    public final ddop ag() {
        ZeroStateContentGridLayout a = ddos.a(this.a);
        akko akkoVar = this.b.b;
        return new ddop(a, akkoVar.N, akkoVar.kZ);
    }

    @Override // defpackage.ddtg
    public final ddtf ah() {
        akko akkoVar = this.b.b;
        return new ddtf(this.A, akkoVar.fo, this.H.ap, akkoVar.N);
    }

    @Override // defpackage.ddul
    public final dduk ai() {
        StarredMessagesResultItemView a = ddun.a(this.a);
        Map ao = ao();
        akko akkoVar = this.b.b;
        return new dduk(a, ao, akkoVar.kf, akkoVar.kZ);
    }

    @Override // defpackage.ddvg
    public final ddve aj() {
        ZeroStateSearchMultipleResultsView a = ddvi.a(this.a);
        akko akkoVar = this.b.b;
        return new ddve(a, akkoVar.fo, this.I.ci, this.B, this.c.al, this.C, this.D, this.E, this.F, akkoVar.N, this.G, akkoVar.kZ);
    }

    @Override // defpackage.ddvo
    public final ddvm ak() {
        ZeroStateSearchResultsView a = ddvq.a(this.a);
        akko akkoVar = this.b.b;
        return new ddvm(a, this.I.ci, this.B, this.c.al, this.D, this.C, this.E, this.F, akkoVar.N, this.G, akkoVar.kZ);
    }

    @Override // defpackage.ddvs
    public final ddvr al() {
        SearchConversationResultItemView a = ddvu.a(this.a);
        Map ao = ao();
        akko akkoVar = this.b.b;
        return new ddvr(a, ao, akkoVar.kf, akkoVar.kZ);
    }

    @Override // defpackage.demm
    public final deml am() {
        return new deml(demo.a(this.a), (Activity) this.c.i.b(), this.I.az);
    }

    @Override // ellg.c
    public final ellq an() {
        return (ellq) this.c.e.b();
    }

    final Map ao() {
        akfv akfvVar = this.c;
        enhd h = enhk.h(10);
        h.k(aemb.AVATAR, akfvVar.h());
        akfv akfvVar2 = this.c;
        fbbf fbbfVar = akfvVar2.i;
        aemb aembVar = aemb.NAME;
        Context context = (Context) fbbfVar.b();
        akis akisVar = akfvVar2.b;
        akkp akkpVar = akisVar.a;
        h.k(aembVar, new ddvx(context, akfvVar2.j(), akisVar.b.lb, akkpVar.ae));
        akfv akfvVar3 = this.c;
        h.k(aemb.SNIPPET, new ddvz(akfvVar3.k(), akfvVar3.b.b.lb));
        akfv akfvVar4 = this.c;
        h.k(aemb.SUBJECT, new ddwb(akfvVar4.m(), akfvVar4.b.b.lb));
        h.k(aemb.TIMESTAMP, this.c.n());
        h.k(aemb.NOTIFICATION_BELL, new aejk());
        h.k(aemb.WORK_PROFILE_ICON, new aekb());
        h.k(aemb.CONTENT_DESCRIPTION, this.c.i());
        h.k(aemb.UNREAD_BADGE, this.c.o());
        h.k(aemb.STATUS, this.c.l());
        return h.c();
    }

    @Override // defpackage.criu
    public final void ap(MessageAttachmentContainer messageAttachmentContainer) {
        messageAttachmentContainer.e = (crih) this.H.oZ.b();
        akgo akgoVar = this.I;
        messageAttachmentContainer.f = new adgn(Optional.of(fbaz.a(akgoVar.eY)), Optional.of(akgoVar.n()));
        messageAttachmentContainer.g = this.b.b.lf;
    }

    @Override // defpackage.ton
    public final tom b() {
        return new tom(top.a(this.a));
    }

    @Override // defpackage.tos
    public final tor d() {
        return new tor(tou.a(this.a), (cxqh) this.b.a.af.b());
    }

    @Override // defpackage.tvo
    public final tvn f() {
        fbbf fbbfVar = this.c.i;
        BadgesRecyclerView a = tvq.a(this.a);
        enhd h = enhk.h(6);
        h.k(tve.CALENDAR_BADGE, new cztr((Context) fbbfVar.b()));
        akfv akfvVar = this.c;
        h.k(tve.REACTION_BADGE, new vfl((Context) akfvVar.i.b(), new vfm(akfvVar.b.b.lc)));
        h.k(tve.CUSTOM_REACTION_BADGE, new vfp());
        h.k(tve.STAR_BADGE, new wfu((Context) this.c.i.b()));
        h.k(tve.REMINDER_BADGE, new ddks((Context) this.c.i.b()));
        h.k(tve.SCHEDULED_SEND_BADGE, new akqf((Context) this.c.i.b()));
        enhk c = h.c();
        elbx elbxVar = (elbx) this.H.ap.b();
        tvf tvfVar = new tvf((Context) this.b.q.b(), (cuxh) this.b.a.ae.b());
        return new tvn(a, c, elbxVar, tvfVar, (cuxh) this.b.a.ae.b());
    }

    @Override // defpackage.uvt
    public final uvr h() {
        return new uvr();
    }

    @Override // defpackage.vgg
    public final vgf j() {
        return new vgf(vgi.a(this.a), (vfc) this.b.b.lc.b(), (elbx) this.H.ap.b(), cmqp.a((alcb) this.I.p.b(), this.b.b.ig.b()), (cmsl) this.b.lY.b());
    }

    @Override // defpackage.vyq
    public final vyp l() {
        return new vyp(this.f, (ddwu) this.H.ol.b());
    }

    @Override // defpackage.weg
    public final wef n() {
        return new wef((crnx) this.b.a.Df.b(), (ellq) this.c.e.b(), wei.a(this.a), (aolr) this.b.a.Z.b());
    }

    @Override // defpackage.wep
    public final weo p() {
        return new weo((Optional) this.I.bT.b(), new wee((ekyo) this.I.aW.b()), wer.a(this.a));
    }

    @Override // defpackage.acan
    public final acam r() {
        akhy akhyVar = this.H;
        return new acam(this.g, this.b.a.Px, akhyVar.ob, akhyVar.ap);
    }

    @Override // defpackage.acnq
    public final acnp t() {
        GpWebTabletExpressSignInTopView a = acns.a(this.a);
        elbx elbxVar = (elbx) this.H.ap.b();
        akis akisVar = this.b;
        return new acnp(a, this.c.i, this.b.a.Px, elbxVar, akisVar.b.u, (ffsk) akisVar.a.p.b());
    }

    @Override // defpackage.adnd
    public final adnc v() {
        HqmsExpressSignInTopView a = adnf.a(this.a);
        akhy akhyVar = this.H;
        return new adnc(a, akhyVar.ob, this.c.i, (elbx) akhyVar.ap.b());
    }

    @Override // defpackage.adyk
    public final adyj x() {
        return new adyj(adym.a(this.a));
    }

    @Override // defpackage.adyr
    public final adyq z() {
        return new adyq(adyt.a(this.a), this.b.a.xi);
    }

    @Override // defpackage.adys
    public final void A() {
    }

    @Override // defpackage.aefp
    public final void C() {
    }

    @Override // defpackage.aeip
    public final void E() {
    }

    @Override // defpackage.aepu
    public final void G() {
    }

    @Override // defpackage.ahjn
    public final void I() {
    }

    @Override // defpackage.ahkr
    public final void K() {
    }

    @Override // defpackage.aivp
    public final void M() {
    }

    @Override // defpackage.ajex
    public final void O() {
    }

    @Override // defpackage.cxbd
    public final void aA() {
    }

    @Override // defpackage.cxcv
    public final void aB() {
    }

    @Override // defpackage.dcyz
    public final void aC() {
    }

    @Override // defpackage.ddth
    public final void aD() {
    }

    @Override // defpackage.ddvt
    public final void aE() {
    }

    @Override // defpackage.ddum
    public final void aF() {
    }

    @Override // defpackage.czvc
    public final void aG() {
    }

    @Override // defpackage.cznc
    public final void aH() {
    }

    @Override // defpackage.cxoy
    public final void aI() {
    }

    @Override // defpackage.demn
    public final void aJ() {
    }

    @Override // defpackage.ddor
    public final void aK() {
    }

    @Override // defpackage.ddvh
    public final void aL() {
    }

    @Override // defpackage.ddvp
    public final void aM() {
    }

    @Override // defpackage.cxnm
    public final void aq() {
    }

    @Override // defpackage.ddoh
    public final void ar() {
    }

    @Override // defpackage.czhh
    public final void as() {
    }

    @Override // defpackage.cxwb
    public final void at() {
    }

    @Override // defpackage.daet
    public final void au() {
    }

    @Override // defpackage.akmp
    public final void av() {
    }

    @Override // defpackage.cjjf
    public final void aw() {
    }

    @Override // defpackage.dbvi
    public final void ax() {
    }

    @Override // defpackage.cxpl
    public final void ay() {
    }

    @Override // defpackage.akmt
    public final void az() {
    }

    @Override // defpackage.too
    public final void c() {
    }

    @Override // defpackage.tot
    public final void e() {
    }

    @Override // defpackage.tvp
    public final void g() {
    }

    @Override // defpackage.uvu
    public final void i() {
    }

    @Override // defpackage.vgh
    public final void k() {
    }

    @Override // defpackage.vyr
    public final void m() {
    }

    @Override // defpackage.weh
    public final void o() {
    }

    @Override // defpackage.weq
    public final void q() {
    }

    @Override // defpackage.acao
    public final void s() {
    }

    @Override // defpackage.acnr
    public final void u() {
    }

    @Override // defpackage.adne
    public final void w() {
    }

    @Override // defpackage.adyl
    public final void y() {
    }
}
