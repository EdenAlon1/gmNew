package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;
import com.google.android.apps.messaging.conversation2.viewmodel.ConversationViewModel;
import com.google.android.apps.messaging.gaia.signoutaccount.SignOutAccountViewModel;
import com.google.android.apps.messaging.home.minidetailspage.MiniConversationDetailsPageViewModel;
import com.google.android.apps.messaging.messagedetails.viewmodel.MessageDetailsViewModel;
import com.google.android.apps.messaging.multishare.viewmodel.MultiShareViewModel;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.startchat.viewmodel.StartChatViewModel;
import com.google.android.apps.messaging.ui.conversation.details.CdpOpeningArguments;
import com.google.android.apps.messaging.ui.conversation.details.ConversationDetailsViewModel;
import com.google.android.apps.messaging.welcome.v1.viewmodel.AccountWelcomeViewModel;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aklp implements fbbf {
    public final akis a;
    public final akhy b;
    public final aklq c;
    private final akfy d;
    private final int e;

    public aklp(akis akisVar, akhy akhyVar, akfy akfyVar, aklq aklqVar, int i) {
        this.a = akisVar;
        this.b = akhyVar;
        this.d = akfyVar;
        this.c = aklqVar;
        this.e = i;
    }

    private final Object a() {
        fazj fazjVar;
        llv llvVar;
        llv llvVar2;
        llv llvVar3;
        llv llvVar4;
        int i = this.e;
        switch (i) {
            case 0:
                return new AccountWelcomeViewModel(this.c.f);
            case 1:
                Context context = (Context) this.a.q.b();
                deki dekiVar = (deki) this.d.r.b();
                aklq aklqVar = this.c;
                akhy akhyVar = this.b;
                akfy akfyVar = this.d;
                akko akkoVar = this.a.b;
                depd aY = aklqVar.aY();
                fbbf fbbfVar = akkoVar.R;
                fbbf fbbfVar2 = akhyVar.M;
                Optional of = Optional.of(akhyVar.gb);
                akhy akhyVar2 = this.b;
                ffsk ffskVar = (ffsk) this.c.e.b();
                ffsk ffskVar2 = (ffsk) this.a.a.p.b();
                akis akisVar = this.a;
                fbbf fbbfVar3 = akhyVar.nJ;
                fbbf fbbfVar4 = akfyVar.u;
                fbbf fbbfVar5 = akhyVar.nH;
                akko akkoVar2 = akisVar.b;
                fbbf fbbfVar6 = akkoVar2.lu;
                fbbf fbbfVar7 = akkoVar2.jO;
                fbbf fbbfVar8 = akkoVar2.lv;
                fbbf fbbfVar9 = akkoVar2.lw;
                fbbf fbbfVar10 = akkoVar2.lx;
                fbbf fbbfVar11 = akkoVar2.ly;
                return new deny(context, dekiVar, aY, fbbfVar3, fbbfVar4, fbbfVar5, akhyVar.pc, akfyVar.v, fbbfVar, fbbfVar2, of, akhyVar2.aE, ffskVar, ffskVar2, fbbfVar6, fbbfVar7, fbbfVar8, fbbfVar9, fbbfVar10, fbbfVar11);
            case 2:
                ffhd ffhdVar = (ffhd) this.c.d.b();
                fazjVar = this.c.gV;
                return ejrx.a(ffhdVar, fazjVar);
            case 3:
                akis akisVar2 = this.a;
                return ejro.a(akisVar2.er(), (errm) akisVar2.a.m.b(), (ffhd) this.a.a.rZ.b(), (emxc) this.a.i.b(), emxc.j(fbaz.a(this.a.b.lt)));
            case 4:
                ConversationId conversationId = (ConversationId) this.c.i.b();
                ffsk ffskVar3 = (ffsk) this.c.e.b();
                ffxx ffxxVar = (ffxx) this.c.l.b();
                Optional.empty();
                return new ConversationDetailsViewModel(conversationId, ffskVar3, ffxxVar, (aigz) this.d.l.b(), this.c.aW());
            case 5:
                return xdc.a((OpenConversation2Arguments) this.c.h.b());
            case 6:
                llvVar = this.c.gW;
                return xeb.a(llvVar);
            case 7:
                return xdn.a((Conversation) this.c.k.b(), (ffsk) this.c.e.b());
            case 8:
                return xdm.a((ConversationId) this.c.i.b(), (alxk) this.c.j.b(), (alxl) this.b.ao.b(), (abar) this.b.oV.b());
            case 9:
                return xec.a((OpenConversation2Arguments) this.c.h.b());
            case 10:
                return new ajjk();
            case 11:
                return new czdi(this.c.n);
            case 12:
                return new wwd((Context) this.a.q.b(), (aigz) this.d.l.b());
            case 13:
                ffsk ffskVar4 = (ffsk) this.c.e.b();
                Context context2 = (Context) this.a.q.b();
                ffxx ffxxVar2 = (ffxx) this.c.l.b();
                ConversationId conversationId2 = (ConversationId) this.c.i.b();
                aimk aimkVar = new aimk();
                aklq aklqVar2 = this.c;
                akko akkoVar3 = this.a.b;
                fbbf fbbfVar12 = aklqVar2.p;
                fbbf fbbfVar13 = aklqVar2.s;
                fbbf fbbfVar14 = aklqVar2.u;
                llvVar2 = aklqVar2.gW;
                return new cysj(ffskVar4, context2, ffxxVar2, conversationId2, aimkVar, fbbfVar12, fbbfVar13, fbbfVar14, llvVar2, aklqVar2.N, akkoVar3.lB, aklqVar2.n, akkoVar3.aI(), (auxw) akkoVar3.lA.b(), (atzo) this.a.a.mM.b(), this.d.l, this.b.ao);
            case 14:
                return new ablq();
            case 15:
                return new cytp((ffsk) this.c.e.b(), (ffxx) this.c.l.b(), (ffxx) this.c.q.b(), this.d.x, this.c.r);
            case 16:
                return xdp.a((Conversation) this.c.k.b(), (ffsk) this.c.e.b());
            case 17:
                return new cyxs((ffsk) this.a.a.aq.b());
            case 18:
                ffsk ffskVar5 = (ffsk) this.c.e.b();
                ffxx ffxxVar3 = (ffxx) this.c.l.b();
                ConversationId conversationId3 = (ConversationId) this.c.i.b();
                ffxx ffxxVar4 = (ffxx) this.c.q.b();
                ffxx ffxxVar5 = (ffxx) this.c.t.b();
                akkp akkpVar = this.a.a;
                fbbf fbbfVar15 = akkpVar.no;
                cuxh cuxhVar = (cuxh) akkpVar.ae.b();
                akko akkoVar4 = this.a.b;
                return new cytz(ffskVar5, ffxxVar3, conversationId3, ffxxVar4, ffxxVar5, fbbfVar15, cuxhVar, akkoVar4.lz, akkoVar4.lA, akkoVar4.aG());
            case 19:
                return xee.a((ffsk) this.c.e.b(), (ffxx) this.c.q.b(), (ffxx) this.c.l.b());
            case 20:
                Context context3 = (Context) this.a.q.b();
                ffsk ffskVar6 = (ffsk) this.c.e.b();
                ffxx ffxxVar6 = (ffxx) this.c.l.b();
                ffxx ffxxVar7 = (ffxx) this.c.q.b();
                ffxx ffxxVar8 = (ffxx) this.c.t.b();
                akfy akfyVar2 = this.d;
                aklq aklqVar3 = this.c;
                akis akisVar3 = this.a;
                fbbf fbbfVar16 = akfyVar2.l;
                fbbf fbbfVar17 = aklqVar3.w;
                fbbf fbbfVar18 = aklqVar3.E;
                fbbf fbbfVar19 = aklqVar3.I;
                fbbf fbbfVar20 = aklqVar3.L;
                fbbf fbbfVar21 = aklqVar3.M;
                akko akkoVar5 = akisVar3.b;
                return new cytf(context3, ffskVar6, ffxxVar6, ffxxVar7, ffxxVar8, fbbfVar16, fbbfVar17, fbbfVar18, fbbfVar19, fbbfVar20, fbbfVar21, akkoVar5.lA, akkoVar5.aG());
            case 21:
                Context context4 = (Context) this.a.q.b();
                ffxx ffxxVar9 = (ffxx) this.c.q.b();
                ffxx ffxxVar10 = (ffxx) this.c.l.b();
                ffsk ffskVar7 = (ffsk) this.c.e.b();
                aigz aigzVar = (aigz) this.d.l.b();
                aleq aleqVar = (aleq) this.a.a.lO.b();
                Optional of2 = Optional.of((cyvq) this.c.v.b());
                akis akisVar4 = this.a;
                aklq aklqVar4 = this.c;
                akkp akkpVar2 = akisVar4.a;
                return new wsf(context4, ffxxVar9, ffxxVar10, ffskVar7, aigzVar, aleqVar, of2, akkpVar2.hj, akkpVar2.hh, aklqVar4.bj());
            case 22:
                return new cyvq((ffsk) this.c.e.b(), this.a.a.C);
            case 23:
                Context context5 = (Context) this.a.q.b();
                ffsk ffskVar8 = (ffsk) this.c.e.b();
                akis akisVar5 = this.a;
                aklq aklqVar5 = this.c;
                fbbf fbbfVar22 = akisVar5.a.np;
                ffxx ffxxVar11 = (ffxx) aklqVar5.q.b();
                ffxx ffxxVar12 = (ffxx) this.c.l.b();
                ffxx ffxxVar13 = (ffxx) this.c.x.b();
                ffxx ffxxVar14 = (ffxx) this.c.t.b();
                akis akisVar6 = this.a;
                aklq aklqVar6 = this.c;
                akfy akfyVar3 = this.d;
                akkp akkpVar3 = akisVar6.a;
                return new xck(context5, ffskVar8, fbbfVar22, ffxxVar11, ffxxVar12, ffxxVar13, ffxxVar14, akkpVar3.no, akkpVar3.bV(), akkpVar3.lu(), aklqVar6.aM(), aklqVar6.D, akkpVar3.hj, akfyVar3.l, akisVar6.b.bs(), aklqVar6.aN(), akkpVar3.hh, aklqVar6.bj());
            case 24:
                return xcw.a((alxl) this.b.ao.b(), (ampf) this.b.hx.b(), (ffsk) this.c.e.b(), (ffxx) this.c.t.b(), (ffhd) this.a.cP.b(), (Conversation) this.c.k.b(), (ConversationId) this.c.i.b(), (ffxx) this.c.l.b(), this.a.a.no);
            case 25:
                Context context6 = (Context) this.a.q.b();
                ffsk ffskVar9 = (ffsk) this.c.e.b();
                akis akisVar7 = this.a;
                aklq aklqVar7 = this.c;
                akkp akkpVar4 = akisVar7.a;
                return new xbu(context6, ffskVar9, akkpVar4.lu(), akkpVar4.np, aklqVar7.C, (ajjc) aklqVar7.m.b());
            case 26:
                return new ygy((ffhd) this.a.cn.b(), (ydb) this.c.y.b(), this.c.B(), this.a.b.n());
            case 27:
                return new ydb();
            case 28:
                llvVar3 = this.c.gW;
                return xip.a(llvVar3);
            case 29:
                return new ydq((ConversationId) this.c.i.b(), (ffhd) this.a.cn.b(), (ffhd) this.a.co.b(), (cbwj) this.a.a.kG.b(), this.c.bg());
            case 30:
                return new ydz();
            case 31:
                Context context7 = (Context) this.a.q.b();
                ffsk ffskVar10 = (ffsk) this.c.e.b();
                ffxx ffxxVar15 = (ffxx) this.c.q.b();
                ConversationId conversationId4 = (ConversationId) this.c.i.b();
                aigz aigzVar2 = (aigz) this.d.l.b();
                OpenConversation2Arguments openConversation2Arguments = (OpenConversation2Arguments) this.c.h.b();
                ffxx ffxxVar16 = (ffxx) this.c.l.b();
                ffxx ffxxVar17 = (ffxx) this.c.G.b();
                aklq aklqVar8 = this.c;
                akis akisVar8 = this.a;
                akkp akkpVar5 = akisVar8.a;
                return new wrn(context7, ffskVar10, ffxxVar15, conversationId4, aigzVar2, openConversation2Arguments, ffxxVar16, ffxxVar17, aklqVar8.H, akisVar8.b.ak, akkpVar5.no, (ffxx) aklqVar8.t.b());
            case 32:
                return xcx.a((alxs) this.c.F.b(), (ffsk) this.c.e.b());
            case 33:
                return xcy.a((Conversation) this.c.k.b());
            case 34:
                akis akisVar9 = this.a;
                return new vyz(akisVar9.cI, akisVar9.a.Il);
            case 35:
                Context context8 = (Context) this.a.q.b();
                ConversationId conversationId5 = (ConversationId) this.c.i.b();
                aigz aigzVar3 = (aigz) this.d.l.b();
                aklq aklqVar9 = this.c;
                return new wyu(context8, conversationId5, aigzVar3, aklqVar9.bd(), (ffsk) aklqVar9.e.b());
            case 36:
                cbpf cbpfVar = (cbpf) this.c.J.b();
                cbnc.a(cbpfVar);
                return cbpfVar;
            case 37:
                return new cbpf((cbsf) this.a.a.sp.b(), (Executor) this.a.t.b());
            case 38:
                return new cyuj((akzt) this.a.a.C.b());
            case Maneuver.TYPE_DESTINATION /* 39 */:
                Context context9 = (Context) this.a.q.b();
                ffsk ffskVar11 = (ffsk) this.c.e.b();
                aklq aklqVar10 = this.c;
                ConversationId conversationId6 = (ConversationId) aklqVar10.i.b();
                aklq aklqVar11 = this.c;
                ffxx ffxxVar18 = (ffxx) aklqVar11.t.b();
                akhy akhyVar3 = this.b;
                akfy akfyVar4 = this.d;
                aklq aklqVar12 = this.c;
                akis akisVar10 = this.a;
                return new czcv(context9, ffskVar11, aklqVar10.P, conversationId6, aklqVar11.Q, aklqVar11.L, aklqVar11.R, ffxxVar18, akhyVar3.pb, akfyVar4.l, aklqVar12.M, akisVar10.a.no);
            case 40:
                return xdy.a((Conversation) this.c.k.b());
            case 41:
                return new wwm((Context) this.a.q.b(), (aigz) this.d.l.b(), (ffsk) this.c.e.b(), (ffxx) this.c.l.b());
            case 42:
                return new xcq((Context) this.a.q.b(), (ConversationId) this.c.i.b(), (aigz) this.d.l.b(), (ffsk) this.c.e.b());
            case 43:
                Context context10 = (Context) this.a.q.b();
                ffsk ffskVar12 = (ffsk) this.c.e.b();
                ffxx ffxxVar19 = (ffxx) this.c.l.b();
                ffxx ffxxVar20 = (ffxx) this.c.q.b();
                ConversationId conversationId7 = (ConversationId) this.c.i.b();
                aklq aklqVar13 = this.c;
                ffxx bi = aklqVar13.bi();
                ffxx ffxxVar21 = (ffxx) aklqVar13.t.b();
                akfy akfyVar5 = this.d;
                akis akisVar11 = this.a;
                aklq aklqVar14 = this.c;
                return new cyqd(context10, ffskVar12, ffxxVar19, ffxxVar20, conversationId7, bi, ffxxVar21, akfyVar5.l, akisVar11.a.no, aklqVar14.T, aklqVar14.Y);
            case 44:
                return new wyd((Context) this.a.q.b(), (aigz) this.d.l.b());
            case 45:
                Context context11 = (Context) this.a.q.b();
                ffxx ffxxVar22 = (ffxx) this.c.l.b();
                ffxx ffxxVar23 = (ffxx) this.c.q.b();
                ffsk ffskVar13 = (ffsk) this.c.e.b();
                ffxx ffxxVar24 = (ffxx) this.c.G.b();
                Conversation conversation = (Conversation) this.c.k.b();
                aklq aklqVar15 = this.c;
                akkp akkpVar6 = this.a.a;
                ffxx bi2 = aklqVar15.bi();
                ffsk ffskVar14 = (ffsk) akkpVar6.aq.b();
                aklq aklqVar16 = this.c;
                ejvb ejvbVar = (ejvb) this.a.dy.b();
                akhy akhyVar4 = this.b;
                aklq aklqVar17 = this.c;
                akis akisVar12 = this.a;
                fbbf fbbfVar23 = akhyVar4.jl;
                return new cyqp(context11, ffxxVar22, ffxxVar23, ffskVar13, ffxxVar24, conversation, bi2, ffskVar14, aklqVar16.V, ejvbVar, fbbfVar23, aklqVar17.W, aklqVar17.X, akisVar12.cI);
            case 46:
                return Integer.valueOf(cyni.a((CdpOpeningArguments) this.c.U.b()));
            case 47:
                llvVar4 = this.c.gW;
                return cynj.a(llvVar4);
            case 48:
                return new cyqs(this.a.q);
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                akis akisVar13 = this.a;
                return new cyqu(akisVar13.q, akisVar13.cI);
            case 50:
                ffsk ffskVar15 = (ffsk) this.c.e.b();
                ffxx ffxxVar25 = (ffxx) this.c.l.b();
                ffxx ffxxVar26 = (ffxx) this.c.t.b();
                ConversationId conversationId8 = (ConversationId) this.c.i.b();
                akis akisVar14 = this.a;
                aklq aklqVar18 = this.c;
                return new cyoq(ffskVar15, ffxxVar25, ffxxVar26, conversationId8, akisVar14.a.no, aklqVar18.an, aklqVar18.ap);
            case 51:
                Context context12 = (Context) this.a.q.b();
                ffsk ffskVar16 = (ffsk) this.c.e.b();
                ffxx ffxxVar27 = (ffxx) this.c.l.b();
                aklq aklqVar19 = this.c;
                return new cyow(context12, ffskVar16, ffxxVar27, aklqVar19.aa, aklqVar19.ab, aklqVar19.ad, aklqVar19.aj, aklqVar19.am, this.a.b.aK());
            case 52:
                return new wxd((Context) this.a.q.b(), (aigz) this.d.l.b(), (ffxx) this.c.l.b(), (ffxx) this.c.q.b());
            case 53:
                return new wvh((Context) this.a.q.b(), (aigz) this.d.l.b(), (ffxx) this.c.q.b(), (ffxx) this.c.l.b(), (alxs) this.c.F.b(), (ffsk) this.c.e.b());
            case 54:
                return new wxa((Context) this.a.q.b(), (ffsk) this.c.e.b(), (alxl) this.b.ao.b(), (ajjc) this.c.m.b(), (cuxz) this.a.kf.b(), (csll) this.b.N.b(), this.a.a.C, (deaj) this.c.ac.b(), (elbx) this.b.ap.b(), (aigz) this.d.l.b(), (ffxx) this.c.l.b());
            case 55:
                return new deaj((Context) this.a.q.b(), (ctvs) this.a.aZ.b(), (ctwb) this.a.a.c.b(), (ddzb) this.a.a.nk.b());
            case 56:
                return new wrw(this.c.k());
            case 57:
                return new tac((ajjc) this.c.m.b(), this.c.bf());
            case 58:
                return new syv((Context) this.a.q.b(), (ffsk) this.c.e.b(), (ffhd) this.a.co.b(), (aigz) this.d.l.b(), this.b.gu, (sxq) this.c.ae.b());
            case 59:
                return new sxq((Context) this.a.q.b(), (ablq) this.c.p.b());
            case 60:
                return new szc((Context) this.a.q.b(), (ffsk) this.c.e.b(), (ffhd) this.a.co.b(), (aigz) this.d.l.b(), this.b.gu, (sxq) this.c.ae.b());
            case 61:
                return new szm((Context) this.a.q.b(), (ffsk) this.c.e.b(), (ffhd) this.a.co.b(), (aigz) this.d.l.b(), this.b.gu, (sxq) this.c.ae.b());
            case 62:
                return new zbj((ffxx) this.c.G.b(), (Context) this.a.q.b(), (ajjc) this.c.m.b(), (zbo) this.c.al.b());
            case 63:
                return new zbo((zcb) this.c.ak.b(), (ffsk) this.a.a.aq.b());
            case 64:
                return new zcb((ffxx) this.c.G.b(), (ffxx) this.c.l.b(), (ConversationId) this.c.i.b(), (ffsk) this.c.e.b(), (Context) this.a.q.b(), (alxl) this.b.ao.b(), (cqoh) this.a.cz.b(), (abam) this.d.o.b());
            case 65:
                ffsk ffskVar17 = (ffsk) this.c.e.b();
                ffxx ffxxVar28 = (ffxx) this.c.l.b();
                ffxx ffxxVar29 = (ffxx) this.c.G.b();
                aklq aklqVar20 = this.c;
                return new cyoz(ffskVar17, ffxxVar28, ffxxVar29, aklqVar20.aa, aklqVar20.ao, aklqVar20.aj, aklqVar20.am);
            case 66:
                return new wxh((Context) this.a.q.b(), (ffsk) this.c.e.b(), (amhs) this.b.aM.b(), (ffxx) this.c.l.b(), (ffxx) this.c.q.b());
            case 67:
                Context context13 = (Context) this.a.q.b();
                ffsk ffskVar18 = (ffsk) this.c.e.b();
                ffxx ffxxVar30 = (ffxx) this.c.q.b();
                ffxx ffxxVar31 = (ffxx) this.c.x.b();
                ffxx ffxxVar32 = (ffxx) this.c.l.b();
                ffxx ffxxVar33 = (ffxx) this.c.G.b();
                ConversationId conversationId9 = (ConversationId) this.c.i.b();
                Conversation conversation2 = (Conversation) this.c.k.b();
                ffxx ffxxVar34 = (ffxx) this.c.t.b();
                akfy akfyVar6 = this.d;
                aklq aklqVar21 = this.c;
                fbbf fbbfVar24 = this.a.a.no;
                ajjc ajjcVar = (ajjc) aklqVar21.m.b();
                elbx elbxVar = (elbx) this.b.ap.b();
                akhy akhyVar5 = this.b;
                aklq aklqVar22 = this.c;
                cuxh cuxhVar2 = (cuxh) this.a.a.ae.b();
                Optional of3 = Optional.of((cyvq) this.c.v.b());
                akis akisVar15 = this.a;
                akkp akkpVar7 = akisVar15.a;
                return new cyrs(context13, ffskVar18, ffxxVar30, ffxxVar31, ffxxVar32, ffxxVar33, conversationId9, conversation2, ffxxVar34, akfyVar6.x, akfyVar6.l, aklqVar21.ar, fbbfVar24, ajjcVar, elbxVar, akhyVar5.pd, aklqVar22.I, cuxhVar2, of3, akisVar15.b.aJ(), (atbw) akkpVar7.ry.b());
            case 68:
                return new wcm((akzt) this.a.a.f.b());
            case 69:
                return new cypg((Context) this.a.q.b(), (ffsk) this.c.e.b(), (ffsk) this.a.a.p.b(), (ConversationId) this.c.i.b(), (ffxx) this.c.l.b(), (ffxx) this.c.x.b(), (fgcq) this.c.aw.b(), this.c.bi(), (alxl) this.b.ao.b(), (atbw) this.a.a.ry.b());
            case 70:
                return xlx.a((ffsk) this.c.e.b(), (xle) this.c.av.b());
            case 71:
                Context context14 = (Context) this.a.q.b();
                ffxx ffxxVar35 = (ffxx) this.c.G.b();
                ffxx ffxxVar36 = (ffxx) this.c.l.b();
                ydb ydbVar = (ydb) this.c.y.b();
                ffhd ffhdVar2 = (ffhd) this.a.co.b();
                ffhd ffhdVar3 = (ffhd) this.a.cP.b();
                akis akisVar16 = this.a;
                aklq aklqVar23 = this.c;
                akkp akkpVar8 = akisVar16.a;
                fbbf fbbfVar25 = akkpVar8.hH;
                fbbf fbbfVar26 = aklqVar23.t;
                asvn asvnVar = (asvn) akkpVar8.Q.b();
                Duration duration = xma.a;
                askf askfVar = (askf) this.a.a.ld.b();
                akis akisVar17 = this.a;
                akkp akkpVar9 = akisVar17.a;
                akko akkoVar6 = akisVar17.b;
                return new xle(context14, ffxxVar35, ffxxVar36, ydbVar, ffhdVar2, ffhdVar3, fbbfVar25, fbbfVar26, asvnVar, askfVar, akkoVar6.lC, akkoVar6.bf(), (auol) akkpVar9.pU.b(), (ffxx) this.c.au.b(), (attl) this.a.a.hJ.b());
            case 72:
                return xdv.a((ffxx) this.c.at.b(), (alxs) this.c.F.b());
            case 73:
                return xdw.a((alxs) this.c.F.b());
            case 74:
                Context context15 = (Context) this.a.q.b();
                ffsk ffskVar19 = (ffsk) this.c.e.b();
                akis akisVar18 = this.a;
                aklq aklqVar24 = this.c;
                return new cyuo(context15, ffskVar19, akisVar18.a.C, aklqVar24.w, aklqVar24.ay, aklqVar24.az, aklqVar24.aA);
            case 75:
                return new wut((Context) this.a.q.b(), (ffsk) this.c.e.b(), (ffxx) this.c.l.b(), (alxs) this.c.F.b(), (ffxx) this.c.q.b(), (ConversationId) this.c.i.b(), (aigz) this.d.l.b(), Optional.of((cyvq) this.c.v.b()), this.b.ao, this.a.a.ld);
            case 76:
                return new cyvb((Context) this.a.q.b(), (aigz) this.d.l.b(), (ffxx) this.c.q.b(), (ffxx) this.c.l.b(), (ffsk) this.c.e.b(), Optional.of((cyvq) this.c.v.b()));
            case 77:
                return new wza((Context) this.a.q.b(), (ffsk) this.c.e.b(), (ffxx) this.c.l.b(), Optional.of((cyvq) this.c.v.b()), (aigz) this.d.l.b(), (alxl) this.b.ao.b());
            case 78:
                ffsk ffskVar20 = (ffsk) this.c.e.b();
                ffxx ffxxVar37 = (ffxx) this.c.l.b();
                ffxx ffxxVar38 = (ffxx) this.c.q.b();
                akis akisVar19 = this.a;
                aklq aklqVar25 = this.c;
                akkp akkpVar10 = akisVar19.a;
                fbbf fbbfVar27 = akkpVar10.r;
                fbbf fbbfVar28 = akkpVar10.fx;
                cyvq cyvqVar = (cyvq) aklqVar25.v.b();
                aklq aklqVar26 = this.c;
                akko akkoVar7 = this.a.b;
                return new cyvh(ffskVar20, ffxxVar37, ffxxVar38, fbbfVar27, fbbfVar28, cyvqVar, aklqVar26.r, akkoVar7.aH(), akkoVar7.aT(), akkoVar7.lB);
            case 79:
                ConversationId conversationId10 = (ConversationId) this.c.i.b();
                ffsk ffskVar21 = (ffsk) this.c.e.b();
                aklq aklqVar27 = this.c;
                abdj ax = aklqVar27.ax();
                fbbf fbbfVar29 = aklqVar27.fh;
                Optional.empty();
                aklq aklqVar28 = this.c;
                akis akisVar20 = this.a;
                akhy akhyVar6 = this.b;
                fbbf fbbfVar30 = this.d.l;
                akkp akkpVar11 = akisVar20.a;
                akko akkoVar8 = akisVar20.b;
                aapm ap = aklqVar28.ap();
                fbbf fbbfVar31 = aklqVar28.fi;
                fbbf fbbfVar32 = aklqVar28.fk;
                fbbf fbbfVar33 = aklqVar28.fm;
                boolean dO = akkoVar8.dO();
                fbbf fbbfVar34 = akkpVar11.hJ;
                aigz aigzVar4 = (aigz) fbbfVar30.b();
                aigx aigxVar = (aigx) this.d.l.b();
                dltj dltjVar = (dltj) this.c.co.b();
                ffxx ffxxVar39 = (ffxx) this.c.at.b();
                Optional of4 = Optional.of(new dplb());
                ffxx ffxxVar40 = (ffxx) this.c.l.b();
                Optional of5 = Optional.of((ajbd) this.c.fr.b());
                Optional of6 = Optional.of((ajcx) this.c.fs.b());
                aklq aklqVar29 = this.c;
                akis akisVar21 = this.a;
                fbbf fbbfVar35 = aklqVar28.ak;
                akkp akkpVar12 = akisVar21.a;
                fbbf fbbfVar36 = aklqVar29.ft;
                fbbf fbbfVar37 = aklqVar29.fu;
                fbbf fbbfVar38 = aklqVar29.fv;
                fbbf fbbfVar39 = akkpVar12.hh;
                return new ConversationViewModel(conversationId10, ffskVar21, ax, fbbfVar29, ap, fbbfVar35, aklqVar28.bE, aklqVar28.bI, fbbfVar31, fbbfVar32, fbbfVar33, dO, akhyVar6.pg, fbbfVar34, aigzVar4, aigxVar, dltjVar, ffxxVar39, of4, ffxxVar40, of5, of6, fbbfVar36, fbbfVar37, fbbfVar38, fbbfVar39);
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                return new zep();
            case 81:
                Context context16 = (Context) this.a.q.b();
                ffsk ffskVar22 = (ffsk) this.c.e.b();
                akfy akfyVar7 = this.d;
                akhy akhyVar7 = this.b;
                aklq aklqVar30 = this.c;
                akis akisVar22 = this.a;
                return new cvng(context16, ffskVar22, akfyVar7.l, akhyVar7.ao, aklqVar30.p, aklqVar30.aF, akisVar22.b.br());
            case 82:
                akkp akkpVar13 = this.a.a;
                return new cued(akkpVar13.C, (ffsk) akkpVar13.p.b());
            case 83:
                return new aaxb(this.a.b.al(), (ffsk) this.c.e.b(), (ffhd) this.a.co.b(), (eisx) this.b.b.b(), this.a.a.av);
            case 84:
                Context context17 = (Context) this.a.q.b();
                ConversationId conversationId11 = (ConversationId) this.c.i.b();
                akis akisVar23 = this.a;
                aklq aklqVar31 = this.c;
                fbbf fbbfVar40 = akisVar23.a.no;
                ajjc ajjcVar2 = (ajjc) aklqVar31.m.b();
                deaj deajVar = (deaj) this.c.ac.b();
                alye alyeVar = (alye) this.c.P.b();
                ffsk ffskVar23 = (ffsk) this.c.e.b();
                aawu aawuVar = (aawu) this.c.aH.b();
                cuxz cuxzVar = (cuxz) this.a.kf.b();
                asix asixVar = (asix) this.a.a.pR.b();
                cslr cslrVar = (cslr) this.a.iq.b();
                aklq aklqVar32 = this.c;
                return new wug(context17, conversationId11, fbbfVar40, ajjcVar2, deajVar, alyeVar, ffskVar23, aawuVar, cuxzVar, asixVar, cslrVar, aklqVar32.bi(), (fgcq) aklqVar32.aw.b(), (auol) this.a.a.pU.b(), this.a.b.bd(), (aaad) this.c.aK.b(), (ffxx) this.c.t.b());
            case 85:
                return new aaad((zrx) this.c.aJ.b());
            case 86:
                return new zrx((zsi) this.c.aI.b(), (ffsk) this.c.e.b(), (ffhd) this.a.cn.b(), Optional.of(this.c.bk()));
            case 87:
                return new zsi((akzt) this.a.a.C.b(), (ffsk) this.a.a.p.b());
            case 88:
                return new zdo((Context) this.a.q.b(), (ablq) this.c.p.b(), (aigz) this.d.l.b(), (csjk) this.a.a.el.b(), (ffsk) this.c.e.b(), this.a.a.f);
            case 89:
                return new wwb((Context) this.a.q.b(), (ConversationId) this.c.i.b(), (aawu) this.c.aH.b(), (aigz) this.d.l.b(), this.a.a.no, (ffxx) this.c.t.b(), Optional.of((abke) this.c.aN.b()), (ajjc) this.c.m.b());
            case 90:
                return new abkp((Context) this.a.q.b(), this.c.ay(), (aigz) this.d.l.b(), (ffsk) this.c.e.b());
            case 91:
                Context context18 = (Context) this.a.q.b();
                ffsk ffskVar24 = (ffsk) this.c.e.b();
                aawu aawuVar2 = (aawu) this.c.aH.b();
                ajjc ajjcVar3 = (ajjc) this.c.m.b();
                aklq aklqVar33 = this.c;
                return new wuy(context18, ffskVar24, aawuVar2, ajjcVar3, aklqVar33.aP, (asmm) this.a.a.rK.b(), (aigz) this.d.l.b(), (ConversationId) this.c.i.b());
            case 92:
                return Optional.of(this.c.l());
            case 93:
                return new yhr((Context) this.a.q.b(), (ffhd) this.a.cn.b(), (ffsk) this.c.e.b(), (alye) this.c.P.b(), (ydb) this.c.y.b(), (abcp) this.a.b.lF.b(), this.c.x(), this.a.a.hH);
            case 94:
                fgcq fgcqVar = (fgcq) this.c.aw.b();
                ffxx ffxxVar41 = (ffxx) this.c.l.b();
                ffxx ffxxVar42 = (ffxx) this.c.q.b();
                aklq aklqVar34 = this.c;
                akko akkoVar9 = this.a.b;
                return new abco(fgcqVar, ffxxVar41, ffxxVar42, aklqVar34.bi(), akkoVar9.al(), akkoVar9.bh(), akkoVar9.bg());
            case 95:
                return new wys((Context) this.a.q.b(), (ffsk) this.c.e.b(), (aawu) this.c.aH.b(), (ctud) this.a.cT.b(), (sfy) this.a.a.Pv.b(), (aigz) this.d.l.b());
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                Context context19 = (Context) this.a.q.b();
                aawu aawuVar3 = (aawu) this.c.aH.b();
                aigz aigzVar5 = (aigz) this.d.l.b();
                aklq aklqVar35 = this.c;
                Optional of7 = Optional.of((abke) aklqVar35.aN.b());
                ajjc ajjcVar4 = (ajjc) this.c.m.b();
                akis akisVar24 = this.a;
                return new wzg(context19, aawuVar3, aigzVar5, aklqVar35.aP, of7, ajjcVar4, akisVar24.b.bj(), (cbgh) akisVar24.dY.b());
            case 97:
                return new ymy((Context) this.a.q.b(), (ffsk) this.c.e.b(), (ydb) this.c.y.b(), (ajjc) this.c.m.b(), this.c.m(), this.a.b.br());
            case 98:
                return xdo.a((ffxx) this.c.q.b());
            case 99:
                return new aewf((ffxx) this.c.l.b(), (ffsk) this.c.e.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        llv llvVar;
        llv llvVar2;
        llv llvVar3;
        int i = this.e;
        switch (i) {
            case VCardConstants.DEFAULT_PREF /* 100 */:
                return Optional.of(true);
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                ffsk ffskVar = (ffsk) this.c.e.b();
                OpenConversation2Arguments openConversation2Arguments = (OpenConversation2Arguments) this.c.h.b();
                aigz aigzVar = (aigz) this.d.l.b();
                cuxh cuxhVar = (cuxh) this.a.a.ae.b();
                aawu aawuVar = (aawu) this.c.aH.b();
                ffxx ffxxVar = (ffxx) this.c.l.b();
                ffxx ffxxVar2 = (ffxx) this.c.q.b();
                alxs alxsVar = (alxs) this.c.F.b();
                akis akisVar = this.a;
                akfy akfyVar = this.d;
                aklq aklqVar = this.c;
                fbbf fbbfVar = akisVar.b.lI;
                aboy aboyVar = (aboy) aklqVar.ds.b();
                zpd zpdVar = (zpd) this.c.aZ.b();
                akis akisVar2 = this.a;
                fbbf fbbfVar2 = this.c.aX;
                askl ak = akisVar2.b.ak();
                aewf aewfVar = (aewf) fbbfVar2.b();
                akis akisVar3 = this.a;
                akko akkoVar = akisVar3.b;
                fbbf fbbfVar3 = akkoVar.mD;
                akkp akkpVar = akisVar3.a;
                return new abos(ffskVar, openConversation2Arguments, aigzVar, cuxhVar, aawuVar, ffxxVar, ffxxVar2, alxsVar, fbbfVar, akfyVar.x, aboyVar, zpdVar, ak, aewfVar, fbbfVar3, akkpVar.fP, akkoVar.mE, (askf) akkpVar.ld.b());
            case 102:
                return new abpd((ffsk) this.c.e.b(), (abpg) this.c.bb.b(), (aawr) this.c.dr.b(), this.a.b.lI);
            case 103:
                Context context = (Context) this.a.q.b();
                ffsk ffskVar2 = (ffsk) this.c.e.b();
                aklq aklqVar2 = this.c;
                return new abpg(context, ffskVar2, aklqVar2.P, (zpd) aklqVar2.aZ.b(), (abpn) this.c.ba.b());
            case 104:
                return new zpd();
            case 105:
                return new abpn((ffsk) this.a.a.q.b(), (effy) this.a.b.lJ.b(), (cqoh) this.a.cz.b());
            case 106:
                akis akisVar4 = this.a;
                return new aawr(akisVar4.fK, this.c.bL, (aski) akisVar4.b.lV.b(), (dltj) this.c.co.b(), this.a.b.bb());
            case 107:
                ffsk ffskVar3 = (ffsk) this.c.e.b();
                dqmn dqmnVar = (dqmn) this.c.bE.b();
                dqlx dqlxVar = (dqlx) this.c.bI.b();
                aklq aklqVar3 = this.c;
                Optional optional = (Optional) aklqVar3.dn.b();
                yvz yvzVar = (yvz) this.c.dp.b();
                yqq yqqVar = (yqq) this.c.dq.b();
                aklq aklqVar4 = this.c;
                akis akisVar5 = this.a;
                llvVar = aklqVar4.gW;
                akkp akkpVar2 = akisVar5.a;
                fbbf fbbfVar4 = akkpVar2.nb;
                akko akkoVar2 = akisVar5.b;
                fbbf fbbfVar5 = akkoVar2.my;
                fbbf fbbfVar6 = akkoVar2.jf;
                fbbf fbbfVar7 = akkoVar2.mx;
                Optional of = Optional.of((dqza) akkpVar2.Kh.b());
                akis akisVar6 = this.a;
                akkp akkpVar3 = akisVar6.a;
                cftn hk = akkpVar3.hk();
                boolean dN = akisVar6.b.dN();
                aleq aleqVar = (aleq) akkpVar3.lO.b();
                ffxx ffxxVar3 = (ffxx) this.c.t.b();
                akis akisVar7 = this.a;
                akkp akkpVar4 = akisVar7.a;
                fbbf fbbfVar8 = akkpVar4.fo;
                fbbf fbbfVar9 = akkpVar4.hj;
                Context context2 = (Context) akisVar7.q.b();
                ablq ablqVar = (ablq) this.c.p.b();
                xgw xgwVar = (xgw) this.a.b.hK.b();
                ConversationId conversationId = (ConversationId) this.c.i.b();
                asvn asvnVar = (asvn) this.a.a.Q.b();
                akis akisVar8 = this.a;
                aklq aklqVar5 = this.c;
                fbbf fbbfVar10 = aklqVar5.cG;
                akko akkoVar3 = akisVar8.b;
                fbbf fbbfVar11 = akkoVar3.mc;
                fbbf fbbfVar12 = akkoVar3.jL;
                fbbf fbbfVar13 = akisVar8.a.no;
                aklh aklhVar = (aklh) fbbfVar10.b();
                akis akisVar9 = this.a;
                aklq aklqVar6 = this.c;
                akkp akkpVar5 = akisVar9.a;
                akko akkoVar4 = akisVar9.b;
                fbbf fbbfVar14 = akkoVar4.jC;
                fbbf fbbfVar15 = akkoVar4.mA;
                fbbf fbbfVar16 = akkoVar4.lG;
                fbbf fbbfVar17 = akkoVar4.mB;
                fbbf fbbfVar18 = akkoVar4.mC;
                fbbf fbbfVar19 = akkpVar5.hn;
                fbbf fbbfVar20 = akkpVar5.hp;
                ffxx bi = aklqVar6.bi();
                fbbf fbbfVar21 = aklqVar5.bN;
                fbbf fbbfVar22 = aklqVar4.cU;
                return new yqb(ffskVar3, dqmnVar, dqlxVar, aklqVar3.cW, aklqVar3.cZ, aklqVar3.cP, optional, yvzVar, yqqVar, fbbfVar22, llvVar, fbbfVar4, fbbfVar5, fbbfVar6, fbbfVar7, of, hk, dN, aleqVar, ffxxVar3, fbbfVar8, fbbfVar9, context2, ablqVar, xgwVar, conversationId, asvnVar, fbbfVar11, fbbfVar12, fbbfVar13, fbbfVar21, aklhVar, fbbfVar14, fbbfVar15, fbbfVar16, fbbfVar17, fbbfVar18, fbbfVar19, fbbfVar20, bi, akkpVar5.hh, aklqVar6.bj());
            case 108:
                return ymz.a((you) this.c.bH.b());
            case 109:
                Context context3 = (Context) this.a.q.b();
                ffsk ffskVar4 = (ffsk) this.c.e.b();
                ffsk ffskVar5 = (ffsk) this.a.a.p.b();
                ydb ydbVar = (ydb) this.c.y.b();
                aklq aklqVar7 = this.c;
                fbbf fbbfVar23 = aklqVar7.bF;
                yrn G = aklqVar7.G();
                Optional optional2 = (Optional) fbbfVar23.b();
                fgcq fgcqVar = (fgcq) this.c.aw.b();
                aklq aklqVar8 = this.c;
                akis akisVar10 = this.a;
                xgl o = aklqVar8.o();
                aleq aleqVar2 = (aleq) akisVar10.a.lO.b();
                akis akisVar11 = this.a;
                fbbf fbbfVar24 = aklqVar7.F;
                akko akkoVar5 = akisVar11.b;
                return new you(context3, ffskVar4, ffskVar5, ydbVar, G, fbbfVar24, optional2, fgcqVar, o, aleqVar2, akkoVar5.as(), akkoVar5.at(), akkoVar5.aA(), akkoVar5.au());
            case 110:
                return xwd.a((xuk) this.c.bC.b());
            case 111:
                ffhd ffhdVar = (ffhd) this.a.cn.b();
                ffsk ffskVar6 = (ffsk) this.a.a.p.b();
                ffsk ffskVar7 = (ffsk) this.c.e.b();
                ydb ydbVar2 = (ydb) this.c.y.b();
                aklq aklqVar9 = this.c;
                fbbf fbbfVar25 = aklqVar9.bn;
                xyd x = aklqVar9.x();
                xww bm = aklq.bm();
                xuw xuwVar = (xuw) fbbfVar25.b();
                fgcq fgcqVar2 = (fgcq) this.c.aw.b();
                akis akisVar12 = this.a;
                aklq aklqVar10 = this.c;
                fbbf fbbfVar26 = aklqVar10.bi;
                akko akkoVar6 = akisVar12.b;
                xzu p = akkoVar6.p();
                xsw s = aklqVar10.s();
                yoz E = aklqVar10.E();
                fbbf fbbfVar27 = akkoVar6.lS;
                xtc t = aklqVar10.t();
                asxr ao = akkoVar6.ao();
                fbbf fbbfVar28 = akisVar12.a.hH;
                emyv a = cqom.a();
                xzv xzvVar = (xzv) fbbfVar26.b();
                xwh xwhVar = (xwh) this.c.bB.b();
                akis akisVar13 = this.a;
                fbbf fbbfVar29 = this.c.bd;
                fbbf fbbfVar30 = akisVar13.b.jL;
                dpaa dpaaVar = (dpaa) fbbfVar29.b();
                aklq aklqVar11 = this.c;
                akko akkoVar7 = this.a.b;
                return new xuk(ffhdVar, ffskVar6, ffskVar7, ydbVar2, x, bm, xuwVar, fgcqVar2, p, s, E, aklqVar10.bA, fbbfVar27, t, ao, fbbfVar28, a, xzvVar, xwhVar, fbbfVar30, dpaaVar, fbaz.a(aklqVar11.bl), akkoVar7.av(), akkoVar7.aw(), akkoVar7.n(), aklqVar11.bm, akkoVar7.aS());
            case 112:
                ffhd ffhdVar2 = (ffhd) this.a.cn.b();
                ffsk ffskVar8 = (ffsk) this.c.e.b();
                ydb ydbVar3 = (ydb) this.c.y.b();
                aklq aklqVar12 = this.c;
                return new xuw(ffhdVar2, ffskVar8, ydbVar3, aklqVar12.y(), (xzv) aklqVar12.bi.b(), (asnv) this.a.a.oQ.b(), this.a.b.aw(), this.c.bm);
            case 113:
                dpaa dpaaVar2 = (dpaa) this.c.bd.b();
                ernh ernhVar = (ernh) this.a.lm.b();
                fazb a2 = fbaz.a(this.a.b.ku);
                akhy akhyVar = this.b;
                return new dozh(dpaaVar2, ernhVar, a2, fbaz.a(akhyVar.oY), akhyVar.oW, this.a.b.ky);
            case 114:
                return new dpaa((Context) this.a.q.b(), (ffsk) this.c.bc.b());
            case 115:
                return dsfe.a((ffhd) this.a.cP.b());
            case 116:
                return new yav((fgcq) this.c.aw.b(), xmb.a(), this.a.b.r());
            case 117:
                return new yam();
            case 118:
                return yah.a((xim) this.c.z.b(), this.c.bh, this.a.b.lL);
            case 119:
                ffsk ffskVar9 = (ffsk) this.a.a.q.b();
                ffsk ffskVar10 = (ffsk) this.a.a.p.b();
                ffhd ffhdVar3 = (ffhd) this.a.co.b();
                cbit cbitVar = (cbit) this.a.a.Bb.b();
                fgcq fgcqVar3 = (fgcq) this.c.aw.b();
                Conversation conversation = (Conversation) this.c.k.b();
                akis akisVar14 = this.a;
                drlk a3 = xmb.a();
                asnv asnvVar = (asnv) akisVar14.a.oQ.b();
                akhy akhyVar2 = this.b;
                akis akisVar15 = this.a;
                appm W = akhyVar2.W();
                akko akkoVar8 = akisVar15.b;
                return new yag(ffskVar9, ffskVar10, ffhdVar3, cbitVar, fgcqVar3, conversation, a3, asnvVar, W, akkoVar8.o(), akkoVar8.ay(), akisVar15.a.cv(), (atws) akkoVar8.lK.b(), this.a.b.aS());
            case 120:
                return new xgq((xgt) this.c.bj.b(), fbaz.a(this.c.bl), this.a.b.ax());
            case 121:
                return new xgt();
            case 122:
                ffsk ffskVar11 = (ffsk) this.a.a.p.b();
                ffhd ffhdVar4 = (ffhd) this.a.cn.b();
                xfu xfuVar = new xfu();
                aklq aklqVar13 = this.c;
                return new xgb(ffskVar11, ffhdVar4, xfuVar, aklqVar13.aJ(), aklqVar13.bk, this.a.b.aw());
            case 123:
                return ctaz.a(this.a.a.aT);
            case 124:
                return ylp.a((ylo) this.c.bz.b());
            case 125:
                return new aklg(this);
            case 126:
                return new abaj((cpev) this.a.a.gp.b(), (alye) this.c.P.b(), (aleq) this.a.a.lO.b());
            case 127:
                return xcz.a((Conversation) this.c.k.b());
            case 128:
                aklq aklqVar14 = this.c;
                fbbf fbbfVar31 = aklqVar14.br;
                aauv aq = aklqVar14.aq();
                aczw aB = aklqVar14.aB();
                xik xikVar = (xik) fbbfVar31.b();
                aklq aklqVar15 = this.c;
                return enip.v(aq, aB, xikVar, aklqVar15.i(), (xik) aklqVar15.bt.b(), (xik) this.c.bu.b(), this.c.D());
            case 129:
                return new ajge(this.a.b.ld);
            case 130:
                return new zqw();
            case 131:
                return new wmr(this.a.a.cc);
            case 132:
                return new zwe((ffsk) this.c.e.b());
            case 133:
                return new aawq((alye) this.c.P.b(), (ffsk) this.c.e.b());
            case 134:
                return new enpx(this.c.ar());
            case 135:
                return new aauw();
            case 136:
                return Boolean.valueOf(xdx.a((OpenConversation2Arguments) this.c.h.b()));
            case 137:
                return new xwh();
            case 138:
                return Optional.of((wmu) this.d.c.b());
            case 139:
                return new ConcurrentHashMap();
            case 140:
                return xwe.a((xuk) this.c.bC.b());
            case 141:
                return new ysk((Map) this.c.cU.b(), (Context) this.a.q.b(), (aklo) this.c.cV.b(), this.a.a.nb, this.c.I());
            case 142:
                aklq aklqVar16 = this.c;
                enhd h = enhk.h(9);
                h.k(yrq.class, aklqVar16.J());
                h.k(yrr.class, this.c.K());
                h.k(yrs.class, this.c.L());
                h.k(yrt.class, this.c.M());
                h.k(yru.class, this.c.N());
                h.k(yrv.class, this.c.O());
                h.k(yrw.class, this.c.P());
                h.k(yrx.class, this.c.Q());
                h.k(yry.class, this.c.R());
                return h.h();
            case 143:
                return new dbzh((ejtr) this.b.aB.b(), (Executor) this.a.t.b(), (cfyt) this.a.a.cf.b());
            case 144:
                return new dbzj((Context) this.a.q.b());
            case 145:
                return new dsra((ffsk) this.c.e.b());
            case 146:
                return new aklh(this);
            case 147:
                aklq aklqVar17 = this.c;
                fbbf fbbfVar32 = aklqVar17.cu;
                xmw q = aklqVar17.q();
                aklj akljVar = (aklj) fbbfVar32.b();
                dqlx dqlxVar2 = (dqlx) this.c.bI.b();
                ydb ydbVar4 = (ydb) this.c.y.b();
                aklq aklqVar18 = this.c;
                akis akisVar16 = this.a;
                dsvu bb = aklqVar18.bb();
                xoa r = aklqVar18.r();
                xmp p2 = aklqVar18.p();
                akko akkoVar9 = akisVar16.b;
                return new xpz(q, akljVar, dqlxVar2, ydbVar4, bb, r, p2, akkoVar9.mk, aklqVar18.u(), akkoVar9.mo, akkoVar9.aO(), akkoVar9.aP(), akkoVar9.ba(), akkoVar9.aw(), aklqVar18.bm);
            case 148:
                return ykv.a((ykt) this.c.cf.b(), this.c.cr);
            case 149:
                return new akli(this);
            case 150:
                ffsk ffskVar12 = (ffsk) this.a.a.p.b();
                ConversationId conversationId2 = (ConversationId) this.c.i.b();
                ffxx ffxxVar4 = (ffxx) this.c.l.b();
                alxl alxlVar = (alxl) this.b.ao.b();
                akis akisVar17 = this.a;
                aklq aklqVar19 = this.c;
                fbbf fbbfVar33 = aklqVar19.bO;
                xyx o2 = akisVar17.b.o();
                ydy B = aklqVar19.B();
                yec yecVar = (yec) fbbfVar33.b();
                ydb ydbVar5 = (ydb) this.c.y.b();
                aklq aklqVar20 = this.c;
                return new ycc(ffskVar12, conversationId2, ffxxVar4, alxlVar, o2, B, yecVar, ydbVar5, aklqVar20.n(), aklqVar20.bQ);
            case 151:
                return new yec((ffsk) this.c.e.b(), (ffhd) this.a.cn.b(), (ydb) this.c.y.b(), this.c.B(), xmc.a());
            case 152:
                ybu ybuVar = (ybu) this.c.bP.b();
                ybu ybuVar2 = (ybu) this.c.bH.b();
                aklq aklqVar21 = this.c;
                return enip.t(ybuVar, ybuVar2, aklqVar21.H(), (ybu) aklqVar21.aV.b());
            case 153:
                Context context4 = (Context) this.a.q.b();
                ffsk ffskVar13 = (ffsk) this.c.e.b();
                ydb ydbVar6 = (ydb) this.c.y.b();
                aksx aksxVar = (aksx) this.a.b.ln.b();
                aklq aklqVar22 = this.c;
                return new yja(context4, ffskVar13, ydbVar6, aksxVar, aklqVar22.C(), (ajjc) aklqVar22.m.b(), (aigz) this.d.l.b(), (cqoh) this.a.cz.b(), this.c.x(), (ctud) this.a.cT.b(), (ablq) this.c.p.b(), this.a.a.hH);
            case 154:
                ffsk ffskVar14 = (ffsk) this.c.e.b();
                ffxx ffxxVar5 = (ffxx) this.c.G.b();
                ffxx ffxxVar6 = (ffxx) this.c.q.b();
                aklq aklqVar23 = this.c;
                fbbf fbbfVar34 = this.a.cP;
                return new ajmw(ffskVar14, ffxxVar5, ffxxVar6, aklqVar23.bi(), (ffhd) fbbfVar34.b(), this.b.dO(), (zqx) this.c.bT.b(), (crpw) this.d.x.b(), (cjtu) this.a.b.R.b(), (zer) this.d.n.b(), this.c.cp, this.a.a.qV);
            case 155:
                return new zqx();
            case 156:
                ffsk ffskVar15 = (ffsk) this.c.e.b();
                xsc xscVar = (xsc) this.c.ci.b();
                yxk yxkVar = (yxk) this.c.cj.b();
                ypb ypbVar = (ypb) this.c.bL.b();
                xre xreVar = (xre) this.c.cm.b();
                fgcq fgcqVar4 = (fgcq) this.c.aw.b();
                ConversationId conversationId3 = (ConversationId) this.c.i.b();
                zej zejVar = (zej) this.c.cn.b();
                akkp akkpVar6 = this.a.a;
                cftn hk2 = akkpVar6.hk();
                Optional of2 = Optional.of((dqza) akkpVar6.Kh.b());
                asvn asvnVar2 = (asvn) this.a.a.Q.b();
                aklq aklqVar24 = this.c;
                akis akisVar18 = this.a;
                fbbf fbbfVar35 = this.d.o;
                xez m = aklqVar24.m();
                akko akkoVar10 = akisVar18.b;
                return new xfm(ffskVar15, xscVar, yxkVar, ypbVar, xreVar, fgcqVar4, conversationId3, zejVar, hk2, of2, asvnVar2, m, akkoVar10.mc, akkoVar10.jL, akkoVar10.md, akkoVar10.me, (abam) fbbfVar35.b(), this.a.b.aB(), (dltj) this.c.co.b());
            case 157:
                return new xsr((ffsk) this.c.e.b(), (ycn) this.c.bZ.b(), (yna) this.c.bH.b(), (xux) this.c.cd.b(), (ymb) this.c.aV.b(), Optional.of((ygz) this.c.aR.b()), Optional.of((yfj) this.c.ce.b()), (yju) this.c.cg.b(), (ygj) this.c.ch.b(), Optional.of((yig) this.c.bS.b()), this.a.b.bq(), this.c.m());
            case 158:
                ffhd ffhdVar5 = (ffhd) this.a.cn.b();
                ffsk ffskVar16 = (ffsk) this.c.e.b();
                aklq aklqVar25 = this.c;
                fbbf fbbfVar36 = aklqVar25.bO;
                ydy B2 = aklqVar25.B();
                yec yecVar2 = (yec) fbbfVar36.b();
                aklq aklqVar26 = this.c;
                akfy akfyVar2 = this.d;
                ydb ydbVar7 = (ydb) aklqVar26.y.b();
                aklq aklqVar27 = this.c;
                akis akisVar19 = this.a;
                fbbf fbbfVar37 = aklqVar27.bY;
                fbbf fbbfVar38 = aklqVar27.bL;
                llvVar2 = aklqVar27.gW;
                akkp akkpVar7 = akisVar19.a;
                return new ycn(ffhdVar5, ffskVar16, B2, yecVar2, aklqVar26.bU, aklqVar26.bW, aklqVar26.bX, akfyVar2.o, ydbVar7, fbbfVar37, fbbfVar38, llvVar2, akkpVar7.Fo, akkpVar7.nV);
            case 159:
                aklq aklqVar28 = this.c;
                return new ybg(aklqVar28.z(), aklqVar28.A());
            case 160:
                aklq aklqVar29 = this.c;
                akis akisVar20 = this.a;
                fbbf fbbfVar39 = akisVar20.cP;
                llvVar3 = aklqVar29.gW;
                xsw s2 = aklqVar29.s();
                xgp n = akisVar20.b.n();
                ffhd ffhdVar6 = (ffhd) fbbfVar39.b();
                akis akisVar21 = this.a;
                return new ybt(llvVar3, s2, n, ffhdVar6, akisVar21.b.lW, akisVar21.a.al, akisVar21.cz, this.c.bV);
            case 161:
                akis akisVar22 = this.a;
                return ycr.a(akisVar22.b.lW, akisVar22.a.aT);
            case 162:
                return new yce();
            case 163:
                return new ygi((ffsk) this.c.e.b(), (ydb) this.c.y.b(), (fgcq) this.c.aw.b());
            case 164:
                ffsk ffskVar17 = (ffsk) this.c.e.b();
                aklq aklqVar30 = this.c;
                fbbf fbbfVar40 = aklqVar30.bn;
                xwb w = aklqVar30.w();
                xvy v = aklqVar30.v();
                xuw xuwVar2 = (xuw) fbbfVar40.b();
                aklq aklqVar31 = this.c;
                return new xvs(ffskVar17, w, v, xuwVar2, aklqVar31.aH(), (xuk) aklqVar31.bC.b(), (xwh) this.c.bB.b(), this.a.b.aw(), this.c.bm);
            case 165:
                return new bcyc((Context) this.a.q.b(), (crji) this.a.a.ab.b(), this.a.a.Z);
            case 166:
                return new xwu((ffsk) this.c.e.b(), this.a.b.lD, (zxm) this.c.cb.b());
            case 167:
                return new zxm((Context) this.a.q.b(), this.c.ae());
            case 168:
                return new yfu((Context) this.a.q.b(), (ffsk) this.c.e.b(), (alye) this.c.P.b(), (ydb) this.c.y.b(), this.c.at());
            case 169:
                return yku.a((ykt) this.c.cf.b(), this.c.bA);
            case 170:
                return new ygv((Context) this.a.q.b(), (ffsk) this.c.e.b(), xmb.a(), new yay(), (xuw) this.c.bn.b(), (fgcq) this.c.aw.b());
            case 171:
                ConversationId conversationId4 = (ConversationId) this.c.i.b();
                ffsk ffskVar18 = (ffsk) this.c.e.b();
                ffhd ffhdVar7 = (ffhd) this.a.cn.b();
                ffhd ffhdVar8 = (ffhd) this.a.cP.b();
                alxl alxlVar2 = (alxl) this.b.ao.b();
                aklq aklqVar32 = this.c;
                return new yya(conversationId4, ffskVar18, ffhdVar7, ffhdVar8, alxlVar2, aklqVar32.U(), aklqVar32.bi(), (ffxx) aklqVar32.x.b(), (fgcq) this.c.aw.b(), this.a.b.be(), (ydb) this.c.y.b(), (atbw) this.a.a.ry.b());
            case 172:
                return new xsa((Context) this.a.q.b(), (ffsk) this.c.e.b(), (ajjc) this.c.m.b(), this.d.l, (ffxx) this.c.x.b(), (fgcq) this.c.aw.b(), (ffxx) this.c.l.b(), (ywt) this.c.ck.b(), (asvn) this.a.a.Q.b(), this.c.cl);
            case 173:
                Context context5 = (Context) this.a.q.b();
                ffsk ffskVar19 = (ffsk) this.a.a.p.b();
                aklq aklqVar33 = this.c;
                ffxx bi2 = aklqVar33.bi();
                ffxx ffxxVar7 = (ffxx) aklqVar33.x.b();
                aqvh aqvhVar = (aqvh) this.b.M.b();
                akkp akkpVar8 = this.a.a;
                return new ywz(context5, ffskVar19, bi2, ffxxVar7, aqvhVar, akkpVar8.Z, (cxao) akkpVar8.fv.b(), (ajjc) this.c.m.b());
            case 174:
                akis akisVar23 = this.a;
                akkp akkpVar9 = akisVar23.a;
                return new ckki(akkpVar9.bi, akisVar23.b.mb, (ffsk) akkpVar9.q.b(), this.a.a.dE);
            case 175:
                return new zej();
            case 176:
                return new dltj();
            case 177:
                return ylq.a((ylo) this.c.bz.b());
            case 178:
                return new aklj(this);
            case 179:
                return Optional.of(this.a.b.j());
            case 180:
                return dswy.a((Context) this.a.q.b(), Optional.of(this.a.b.cM()));
            case 181:
                return new aklk(this);
            case 182:
                return new dtcg((ffsk) this.a.a.p.b());
            case 183:
                aklq aklqVar34 = this.c;
                fbbf fbbfVar41 = aklqVar34.cB;
                ulh e = aklqVar34.e();
                dpqp dpqpVar = (dpqp) fbbfVar41.b();
                akis akisVar24 = this.a;
                akko akkoVar11 = akisVar24.b;
                return ujp.a(e, dpqpVar, akkoVar11.mm, akisVar24.cN, akkoVar11.mn);
            case 184:
                return new akll(this);
            case 185:
                return new dpvo((cbo) this.c.cx.b());
            case 186:
                return dpru.a((Context) this.a.q.b());
            case 187:
                return new aklm(this);
            case 188:
                return ujm.a((atbq) this.a.b.jL.b());
            case 189:
                return new akln(this);
            case 190:
                Context context6 = (Context) this.a.q.b();
                ffsk ffskVar20 = (ffsk) this.c.e.b();
                aklq aklqVar35 = this.c;
                akis akisVar25 = this.a;
                akfy akfyVar3 = this.d;
                akhy akhyVar3 = this.b;
                fbbf fbbfVar42 = aklqVar35.i;
                fbbf fbbfVar43 = akisVar25.fM;
                elbx elbxVar = (elbx) akhyVar3.ap.b();
                return new wii(context6, ffskVar20, aklqVar35.bE, aklqVar35.bL, aklqVar35.cK, aklqVar35.cL, aklqVar35.cN, aklqVar35.cO, fbbfVar42, aklqVar35.bF, fbbfVar43, akisVar25.aU, akfyVar3.d, akhyVar3.nR, elbxVar);
            case 191:
                return Optional.of(this.c.h());
            case 192:
                return new wlw((Context) this.a.q.b());
            case 193:
                return Optional.of((abad) this.a.b.jj.b());
            case 194:
                return Optional.of(this.c.f());
            case 195:
                return Optional.of((wly) this.d.g.b());
            case 196:
                return Optional.of(this.c.j());
            case 197:
                return new woi((ffsk) this.a.a.p.b(), (ffhd) this.a.cn.b(), (ffhd) this.a.co.b(), (comc) this.a.a.Lb.b(), (ejvb) this.a.dy.b());
            case 198:
                return Optional.of(this.c.aX());
            case 199:
                return Optional.of((yrg) this.c.cS.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        llv llvVar;
        Object aaeeVar;
        int i = this.e;
        switch (i) {
            case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
                ffsk ffskVar = (ffsk) this.c.e.b();
                ffhd ffhdVar = (ffhd) this.a.cn.b();
                Context context = (Context) this.a.q.b();
                dpif dpifVar = (dpif) this.c.cR.b();
                ajjc ajjcVar = (ajjc) this.c.m.b();
                aklq aklqVar = this.c;
                akis akisVar = this.a;
                fbbf fbbfVar = akisVar.cT;
                return new yrg(ffskVar, ffhdVar, context, dpifVar, ajjcVar, aklqVar.aZ(), akisVar.a.fo, (ctud) fbbfVar.b(), (aigz) this.d.l.b(), (abai) this.a.b.jD.b());
            case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                Context context2 = (Context) this.a.q.b();
                aklq aklqVar2 = this.c;
                ffsk ffskVar2 = (ffsk) aklqVar2.e.b();
                ffsk ffskVar3 = (ffsk) this.a.a.q.b();
                aklq aklqVar3 = this.c;
                dqlx dqlxVar = (dqlx) aklqVar3.bI.b();
                aklq aklqVar4 = this.c;
                dpgu aZ = aklqVar4.aZ();
                Optional of = Optional.of(aklqVar4.F());
                dtee cO = this.a.b.cO();
                return new dpif(context2, aklqVar2.cQ, ffskVar2, ffskVar3, aklqVar3.cw, dqlxVar, aZ, of, cO);
            case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                aklq aklqVar5 = this.c;
                fbbf fbbfVar2 = aklqVar5.cB;
                ulh e = aklqVar5.e();
                dpqp dpqpVar = (dpqp) fbbfVar2.b();
                akko akkoVar = this.a.b;
                return yqt.a(e, dpqpVar, akkoVar.ms, akkoVar.mt, akkoVar.mn);
            case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                return new aklo(this);
            case 204:
                arby arbyVar = (arby) this.c.cX.b();
                ffsk ffskVar4 = (ffsk) this.a.a.q.b();
                ffsk ffskVar5 = (ffsk) this.c.e.b();
                Context context3 = (Context) this.a.q.b();
                ejmh ejmhVar = (ejmh) this.a.hA.b();
                cqoh cqohVar = (cqoh) this.a.cz.b();
                arca arcaVar = (arca) this.c.cY.b();
                ddzb ddzbVar = (ddzb) this.a.a.nk.b();
                fgcq fgcqVar = (fgcq) this.c.aw.b();
                dqlx dqlxVar2 = (dqlx) this.c.bI.b();
                aklq aklqVar6 = this.c;
                cteg ctegVar = (cteg) this.a.b.lp.b();
                akis akisVar2 = this.a;
                aklq aklqVar7 = this.c;
                fbbf fbbfVar3 = aklqVar7.dj;
                akkp akkpVar = akisVar2.a;
                akko akkoVar2 = akisVar2.b;
                arer ae = akkoVar2.ae();
                fbbf fbbfVar4 = akkpVar.pK;
                fbbf fbbfVar5 = akkoVar2.mx;
                aldm aldmVar = (aldm) fbbfVar3.b();
                aldr aldrVar = (aldr) this.c.dk.b();
                Optional of2 = Optional.of((dpdv) this.c.df.b());
                aklq aklqVar8 = this.c;
                cwrk cwrkVar = (cwrk) aklqVar8.dm.b();
                fbbf fbbfVar6 = aklqVar8.ak;
                return new ywq(arbyVar, ffskVar4, ffskVar5, context3, ejmhVar, cqohVar, arcaVar, ddzbVar, fgcqVar, dqlxVar2, aklqVar6.bL, ctegVar, ae, fbbfVar4, fbbfVar5, aklqVar7.di, aldmVar, aldrVar, of2, fbbfVar6, cwrkVar);
            case 205:
                return new arby((Context) this.a.q.b(), (errm) this.a.p.b(), (errl) this.a.t.b(), new arbt(), (cvjg) this.a.a.wf.b());
            case 206:
                return new arca((ffsk) this.a.a.q.b());
            case 207:
                return yws.a((dthj) this.c.dh.b(), (ffsk) this.c.e.b(), (cteg) this.a.b.lp.b());
            case 208:
                return new aklb(this);
            case 209:
                aklq aklqVar9 = this.c;
                akis akisVar3 = this.a;
                fbbf fbbfVar7 = aklqVar9.cZ;
                return ywr.a(aklqVar9.S(), aklqVar9.e(), akisVar3.a.pK, (ywq) fbbfVar7.b());
            case 210:
                return new aklc(this);
            case 211:
                return new dpbw(this.b.jC, this.a.q);
            case 212:
                return new dpbf(this.b.jC, this.a.q);
            case 213:
                return Optional.of(new dpcf(true));
            case 214:
                akhy akhyVar = this.b;
                akis akisVar4 = this.a;
                aklq aklqVar10 = this.c;
                akko akkoVar3 = akisVar4.b;
                return new dpdu(akhyVar.jD, akisVar4.a.p, akkoVar3.ml, aklqVar10.df);
            case 215:
                return new ywb();
            case 216:
                akis akisVar5 = this.a;
                return new aldm(akisVar5.a.dF, new alcs(), (Executor) akisVar5.p.b());
            case 217:
                akis akisVar6 = this.a;
                return new aldr(akisVar6.a.dF, new alcs(), (Executor) akisVar6.p.b());
            case 218:
                return new cwrk((ffsk) this.c.e.b(), (Optional) this.c.dl.b());
            case 219:
                return Optional.of(this.a.b.cp());
            case 220:
                return Optional.of((dris) this.a.b.hO.b());
            case 221:
                ffsk ffskVar6 = (ffsk) this.c.e.b();
                ffhd ffhdVar2 = (ffhd) this.a.cP.b();
                aklq aklqVar11 = this.c;
                fbbf fbbfVar8 = this.a.nY;
                yvj T = aklqVar11.T();
                AudioManager audioManager = (AudioManager) fbbfVar8.b();
                ctud ctudVar = (ctud) this.a.cT.b();
                aigz aigzVar = (aigz) this.d.l.b();
                zqv zqvVar = (zqv) this.c.f9do.b();
                akis akisVar7 = this.a;
                aklq aklqVar12 = this.c;
                fbbf fbbfVar9 = akisVar7.b.my;
                akkp akkpVar2 = akisVar7.a;
                return new yvz(ffskVar6, ffhdVar2, aklqVar11.cZ, T, audioManager, ctudVar, aigzVar, zqvVar, fbbfVar9, aklqVar12.di, akkpVar2.hj, aklqVar12.bi(), akkpVar2.hh, aklqVar12.bj());
            case 222:
                return new zqv();
            case 223:
                Context context4 = (Context) this.a.q.b();
                ffsk ffskVar7 = (ffsk) this.c.e.b();
                ffxx ffxxVar = (ffxx) this.c.l.b();
                akis akisVar8 = this.a;
                aklq aklqVar13 = this.c;
                akko akkoVar4 = akisVar8.b;
                akkp akkpVar3 = akisVar8.a;
                fbbf fbbfVar10 = akkpVar3.nb;
                fbbf fbbfVar11 = akkpVar3.fo;
                fbbf fbbfVar12 = akkoVar4.mz;
                ydb ydbVar = (ydb) aklqVar13.y.b();
                akis akisVar9 = this.a;
                aklq aklqVar14 = this.c;
                akkp akkpVar4 = akisVar9.a;
                akko akkoVar5 = akisVar9.b;
                return new yqq(context4, ffskVar7, ffxxVar, fbbfVar10, aklqVar13.cT, fbbfVar11, fbbfVar12, ydbVar, akkoVar5.mc, akkoVar5.jL, akkpVar4.hj, aklqVar14.bi(), akkpVar4.hh, aklqVar14.bj());
            case 224:
                ffsk ffskVar8 = (ffsk) this.c.e.b();
                ConversationId conversationId = (ConversationId) this.c.i.b();
                akis akisVar10 = this.a;
                aklq aklqVar15 = this.c;
                return new abll(ffskVar8, conversationId, akisVar10.b.lD, aklqVar15.bd(), aklqVar15.az(), (alse) akisVar10.he.b());
            case 225:
                return new cydh((ffhd) this.a.cn.b(), (ffsk) this.c.e.b());
            case 226:
                Context context5 = (Context) this.a.q.b();
                ffhd ffhdVar3 = (ffhd) this.a.co.b();
                ffsk ffskVar9 = (ffsk) this.c.e.b();
                ConversationId conversationId2 = (ConversationId) this.c.i.b();
                akhy akhyVar2 = this.b;
                return new sui(context5, ffhdVar3, ffskVar9, conversationId2, akhyVar2.l(), (airu) akhyVar2.aZ.b(), (aigz) this.d.l.b(), (sup) this.c.dx.b());
            case 227:
                cqoh cqohVar2 = (cqoh) this.a.cz.b();
                stm stmVar = (stm) this.d.A.b();
                aqkp aqkpVar = (aqkp) this.b.aE.b();
                akis akisVar11 = this.a;
                akhy akhyVar3 = this.b;
                aklq aklqVar16 = this.c;
                return new sup(cqohVar2, stmVar, aqkpVar, akisVar11.a.Dn, akhyVar3.pe, (ffxx) aklqVar16.dw.b(), (ConversationId) this.c.i.b());
            case 228:
                return xda.a((Conversation) this.c.k.b(), (ffsk) this.c.e.b());
            case 229:
                Context context6 = (Context) this.a.q.b();
                ffhd ffhdVar4 = (ffhd) this.a.co.b();
                ffsk ffskVar10 = (ffsk) this.c.e.b();
                ConversationId conversationId3 = (ConversationId) this.c.i.b();
                aklq aklqVar17 = this.c;
                return new cykn(context6, ffhdVar4, ffskVar10, conversationId3, aklqVar17.aT(), (ablq) aklqVar17.p.b());
            case 230:
                Context context7 = (Context) this.a.q.b();
                aklq aklqVar18 = this.c;
                return new cyjk(context7, aklqVar18.dA, this.a.a.ij, aklqVar18.p, (ConversationId) aklqVar18.i.b(), (ffhd) this.a.co.b(), (ffsk) this.c.e.b());
            case 231:
                ffxx ffxxVar2 = (ffxx) this.c.l.b();
                akis akisVar12 = this.a;
                return new cyjq(ffxxVar2, akisVar12.nS, (croc) this.b.cD.b(), (ffsk) this.a.a.aq.b());
            case 232:
                Context context8 = (Context) this.a.q.b();
                ffhd ffhdVar5 = (ffhd) this.a.co.b();
                ffsk ffskVar11 = (ffsk) this.c.e.b();
                ConversationId conversationId4 = (ConversationId) this.c.i.b();
                aklq aklqVar19 = this.c;
                return new cyil(context8, ffhdVar5, ffskVar11, conversationId4, aklqVar19.aS(), (tac) aklqVar19.ai.b(), (ssm) this.c.dC.b());
            case 233:
                return new ssm();
            case 234:
                Context context9 = (Context) this.a.q.b();
                ffhd ffhdVar6 = (ffhd) this.a.co.b();
                ffsk ffskVar12 = (ffsk) this.c.e.b();
                ConversationId conversationId5 = (ConversationId) this.c.i.b();
                aklq aklqVar20 = this.c;
                fbbf fbbfVar13 = this.d.l;
                return new cybu(context9, ffhdVar6, ffskVar12, conversationId5, aklqVar20.aQ(), (aigz) fbbfVar13.b(), (crnx) this.a.a.Df.b(), this.a.a.fP, (tac) this.c.ai.b(), (ssm) this.c.dC.b());
            case 235:
                return new cydb(this.b.P, (errm) this.a.t.b());
            case 236:
                return new cydx((Context) this.a.q.b(), (ffhd) this.a.co.b(), (ffsk) this.c.e.b(), (aigz) this.d.l.b(), this.b.fs(), (ffxx) this.c.q.b());
            case 237:
                return new cyep((Context) this.a.q.b(), (ffhd) this.a.co.b(), (ffsk) this.c.e.b(), (aigz) this.d.l.b(), (ctvb) this.a.a.u.b(), this.b.ft(), (ffxx) this.c.q.b());
            case 238:
                return new cyfb((Context) this.a.q.b(), (ffhd) this.a.co.b(), (ffsk) this.c.e.b(), this.a.a.Px, this.b.ob, this.c.aR());
            case 239:
                return new abnl((Context) this.a.q.b(), (ffsk) this.c.e.b(), (abnt) this.c.dJ.b(), (aigz) this.d.l.b(), this.a.b.mI);
            case 240:
                ffsk ffskVar13 = (ffsk) this.a.a.q.b();
                effy effyVar = (effy) this.a.b.mF.b();
                cqoh cqohVar3 = (cqoh) this.a.cz.b();
                akko akkoVar6 = this.a.b;
                return new abnt(ffskVar13, effyVar, cqohVar3, akkoVar6.mG, akkoVar6.mH);
            case 241:
                return new abnz((Context) this.a.q.b(), (ffsk) this.c.e.b(), (ffxx) this.c.dL.b(), (Conversation) this.c.k.b());
            case 242:
                return xct.a((Conversation) this.c.k.b(), (ffsk) this.c.e.b());
            case 243:
                return new src((sso) this.c.dN.b(), new stc());
            case 244:
                return new ssx((ssm) this.c.dC.b(), (ffsk) this.c.e.b());
            case 245:
                return Optional.of((zaa) this.c.dP.b());
            case 246:
                ffsk ffskVar14 = (ffsk) this.c.e.b();
                ConversationId conversationId6 = (ConversationId) this.c.i.b();
                ffxx ffxxVar3 = (ffxx) this.c.l.b();
                ffxx ffxxVar4 = (ffxx) this.c.q.b();
                ffxx ffxxVar5 = (ffxx) this.c.dw.b();
                akis akisVar13 = this.a;
                akko akkoVar7 = akisVar13.b;
                akkp akkpVar5 = akisVar13.a;
                return new zaa(ffskVar14, conversationId6, ffxxVar3, ffxxVar4, ffxxVar5, akkpVar5.ih, akkpVar5.ig, akkoVar7.mJ);
            case 247:
                return new aagl((ffsk) this.c.e.b(), (Context) this.a.q.b(), (alye) this.c.P.b(), (cnpd) this.a.a.hj.b(), (atte) this.a.a.hn.b(), (attd) this.a.a.hp.b(), this.c.bi());
            case 248:
                return new abbv(this.c.aL(), (aleq) this.a.a.lO.b(), this.a.b.bi());
            case 249:
                return new abak((ecrj) this.a.cN.b());
            case 250:
                return Optional.of((adak) this.a.b.lP.b());
            case 251:
                return Optional.of((drau) this.a.b.lQ.b());
            case 252:
                ffsk ffskVar15 = (ffsk) this.c.e.b();
                ffsk ffskVar16 = (ffsk) this.a.a.p.b();
                aklq aklqVar21 = this.c;
                return new abbu(ffskVar15, ffskVar16, aklqVar21.P, (cslr) this.a.iq.b(), (abak) this.c.dT.b(), (abbv) this.c.dS.b(), (Optional) this.c.dV.b());
            case 253:
                return Optional.of((ajfs) this.a.b.ld.b());
            case 254:
                Context context10 = (Context) this.a.q.b();
                ffsk ffskVar17 = (ffsk) this.c.e.b();
                akfy akfyVar = this.d;
                this.c.au();
                abbu abbuVar = (abbu) this.c.dW.b();
                aklq aklqVar22 = this.c;
                llvVar = aklqVar22.gW;
                return new abbk(context10, ffskVar17, akfyVar.l, abbuVar, llvVar, (ffxx) aklqVar22.t.b(), (Optional) this.a.a.uo.b(), (Optional) this.c.dU.b(), (Optional) this.c.dV.b(), Optional.of((dqza) this.a.a.Kh.b()));
            case PrivateKeyType.INVALID /* 255 */:
                return new cydc(this.a.a.az);
            case 256:
                return Optional.of((aajq) this.c.ec.b());
            case 257:
                Context context11 = (Context) this.a.q.b();
                ffsk ffskVar18 = (ffsk) this.c.e.b();
                aklq aklqVar23 = this.c;
                akko akkoVar8 = this.a.b;
                return new aajq(context11, ffskVar18, aklqVar23.ea, aklqVar23.eb, akkoVar8.iB, aklqVar23.aS, akkoVar8.mN);
            case 258:
                return aain.a(this.a.a.Qe);
            case 259:
                return xeh.a((alxs) this.c.F.b(), (ffsk) this.c.e.b());
            case 260:
                return new zvz((Context) this.a.q.b(), (ConnectivityManager) this.a.dq.b(), (ffsk) this.c.e.b(), (ejlk) this.a.ds.b(), (ffsk) this.a.a.p.b(), (ffhd) this.a.cP.b(), this.a.b.aj());
            case 261:
                return new zwc((Context) this.a.q.b(), (csrh) this.a.a.xi.b(), (crnx) this.a.a.Df.b(), (askx) this.a.b.mN.b(), this.a.a.hH);
            case 262:
                zxm zxmVar = (zxm) this.c.cb.b();
                aigz aigzVar2 = (aigz) this.d.l.b();
                aklq aklqVar24 = this.c;
                akis akisVar14 = this.a;
                akkp akkpVar6 = akisVar14.a;
                akko akkoVar9 = akisVar14.b;
                fbbf fbbfVar14 = aklqVar24.eg;
                fbbf fbbfVar15 = aklqVar24.eh;
                abln u = akkoVar9.u();
                fbbf fbbfVar16 = akkpVar6.C;
                fbbf fbbfVar17 = akkpVar6.pK;
                fbbf fbbfVar18 = akkoVar9.G;
                ffsk ffskVar19 = (ffsk) akkpVar6.q.b();
                cwrk cwrkVar2 = (cwrk) this.c.dm.b();
                Conversation conversation = (Conversation) this.c.k.b();
                akis akisVar15 = this.a;
                akko akkoVar10 = akisVar15.b;
                return new zxk(zxmVar, aigzVar2, fbbfVar14, fbbfVar15, u, fbbfVar16, fbbfVar17, akisVar14.cz, fbbfVar18, ffskVar19, cwrkVar2, conversation, akisVar15.a.bM(), akkoVar10.aC());
            case 263:
                return Optional.of(this.c.c());
            case 264:
                return Optional.of(this.c.b());
            case 265:
                Context context12 = (Context) this.a.q.b();
                ffsk ffskVar20 = (ffsk) this.c.e.b();
                ffhd ffhdVar7 = (ffhd) this.a.cn.b();
                Conversation conversation2 = (Conversation) this.c.k.b();
                alye alyeVar = (alye) this.c.P.b();
                aklq aklqVar25 = this.c;
                fbbf fbbfVar19 = this.d.l;
                fbbf fbbfVar20 = aklqVar25.dR;
                aigz aigzVar3 = (aigz) fbbfVar19.b();
                xto xtoVar = (xto) this.c.bD.b();
                aklq aklqVar26 = this.c;
                akko akkoVar11 = this.a.b;
                ailp aH = aklqVar26.aH();
                aufr aufrVar = (aufr) akkoVar11.jM.b();
                aklq aklqVar27 = this.c;
                aans ao = aklqVar27.ao();
                zel zelVar = (zel) aklqVar27.em.b();
                aklq aklqVar28 = this.c;
                akis akisVar16 = this.a;
                fbbf fbbfVar21 = aklqVar28.aT;
                akko akkoVar12 = akisVar16.b;
                akkp akkpVar7 = akisVar16.a;
                fbbf fbbfVar22 = aklqVar28.er;
                aufn cw = akkpVar7.cw();
                aufk aX = akkoVar12.aX();
                fbbf fbbfVar23 = akkoVar12.mT;
                zen W = aklqVar28.W();
                asnh bM = akkpVar7.bM();
                wys wysVar = (wys) fbbfVar21.b();
                zem zemVar = (zem) this.c.es.b();
                ajjc ajjcVar2 = (ajjc) this.c.m.b();
                Optional of3 = Optional.of((abke) this.c.aN.b());
                akko akkoVar13 = this.a.b;
                aufp aZ2 = akkoVar13.aZ();
                athi aE = akkoVar13.aE();
                askd askdVar = (askd) akkoVar13.jY.b();
                akis akisVar17 = this.a;
                fbbf fbbfVar24 = akisVar17.cp;
                akko akkoVar14 = akisVar17.b;
                aaeeVar = new aaee(context12, ffskVar20, ffhdVar7, conversation2, alyeVar, fbbfVar20, aigzVar3, xtoVar, aH, aufrVar, aklqVar27.bN, ao, zelVar, fbbfVar22, cw, aX, fbbfVar23, W, bM, wysVar, zemVar, ajjcVar2, of3, aZ2, aE, askdVar, akkoVar14.n(), akkoVar14.aY(), akkoVar14.aC(), akkoVar14.aR(), (cstx) fbbfVar24.b(), this.c.ah());
                break;
            case 266:
                akis akisVar18 = this.a;
                aklq aklqVar29 = this.c;
                akhy akhyVar4 = this.b;
                akkp akkpVar8 = akisVar18.a;
                akko akkoVar15 = akisVar18.b;
                return new cvoj(akisVar18.q, aklqVar29.ek, akkoVar15.f21io, akkpVar8.ih, akkpVar8.ig, aklqVar29.m, (eisx) akhyVar4.b.b(), this.a.a.C, (ffsk) this.c.e.b(), (ffhd) this.a.cn.b());
            case 267:
                aklq aklqVar30 = this.c;
                akhy akhyVar5 = this.b;
                akkp akkpVar9 = this.a.a;
                return new cuks(aklqVar30.ej, akhyVar5.dw, akhyVar5.cM, akhyVar5.cJ, akhyVar5.cO, akhyVar5.cG, (ffsk) akkpVar9.aq.b());
            case 268:
                return enip.o(this.b.gR());
            case 269:
                return new zel();
            case 270:
                return new akld(this);
            case 271:
                fbbf fbbfVar25 = this.c.eo;
                dsui dsuiVar = new dsui();
                aklq aklqVar31 = this.c;
                return new zgu(fbbfVar25, dsuiVar, aklqVar31.bb(), aklqVar31.o(), aklqVar31.n(), aklqVar31.ep, this.a.b.mo);
            case 272:
                alye alyeVar2 = (alye) this.c.P.b();
                Context context13 = (Context) this.a.q.b();
                aklq aklqVar32 = this.c;
                zhp X = aklqVar32.X();
                zjt Y = aklqVar32.Y();
                zzb af = aklqVar32.af();
                akle akleVar = (akle) aklqVar32.en.b();
                akis akisVar19 = this.a;
                fbbf fbbfVar26 = this.c.cm;
                akko akkoVar16 = akisVar19.b;
                return new zfi(alyeVar2, context13, X, Y, af, akleVar, akkoVar16.mR, akkoVar16.mS, (xre) fbbfVar26.b());
            case 273:
                return new akle(this);
            case 274:
                return ylr.a((ylo) this.c.bz.b());
            case 275:
                return new zem((ecrj) this.a.cN.b());
            case 276:
                ffsk ffskVar21 = (ffsk) this.c.e.b();
                Context context14 = (Context) this.a.q.b();
                ffhd ffhdVar8 = (ffhd) this.a.cn.b();
                Conversation conversation3 = (Conversation) this.c.k.b();
                aklq aklqVar33 = this.c;
                fbbf fbbfVar27 = this.d.l;
                fbbf fbbfVar28 = aklqVar33.dR;
                aigz aigzVar4 = (aigz) fbbfVar27.b();
                xto xtoVar2 = (xto) this.c.bD.b();
                aklq aklqVar34 = this.c;
                akko akkoVar17 = this.a.b;
                ailp aH2 = aklqVar34.aH();
                aufr aufrVar2 = (aufr) akkoVar17.jM.b();
                aklq aklqVar35 = this.c;
                akis akisVar20 = this.a;
                akko akkoVar18 = akisVar20.b;
                akkp akkpVar10 = akisVar20.a;
                return new aapg(ffskVar21, context14, ffhdVar8, conversation3, fbbfVar28, aigzVar4, xtoVar2, aH2, aklqVar34.bN, aufrVar2, aklqVar35.er, aklqVar35.W(), akkpVar10.bM(), akkoVar18.aZ(), akkoVar18.n(), akkoVar18.aC());
            case 277:
                ffsk ffskVar22 = (ffsk) this.a.a.p.b();
                ffsk ffskVar23 = (ffsk) this.c.e.b();
                Context context15 = (Context) this.a.q.b();
                Conversation conversation4 = (Conversation) this.c.k.b();
                alxs alxsVar = (alxs) this.c.F.b();
                alxu alxuVar = (alxu) this.c.bp.b();
                ffxx ffxxVar6 = (ffxx) this.c.q.b();
                aklq aklqVar36 = this.c;
                akis akisVar21 = this.a;
                akfy akfyVar2 = this.d;
                akhy akhyVar6 = this.b;
                akko akkoVar19 = akisVar21.b;
                akkp akkpVar11 = akisVar21.a;
                fbbf fbbfVar29 = akkpVar11.nb;
                fbbf fbbfVar30 = akkpVar11.ne;
                fbbf fbbfVar31 = akkoVar19.iX;
                fbbf fbbfVar32 = akkpVar11.rg;
                Optional of4 = Optional.of(akkoVar19.jj);
                akis akisVar22 = this.a;
                aklq aklqVar37 = this.c;
                akhy akhyVar7 = this.b;
                akko akkoVar20 = akisVar22.b;
                akkp akkpVar12 = akisVar22.a;
                fbbf fbbfVar33 = akkpVar12.nm;
                fbbf fbbfVar34 = akisVar22.jy;
                fbbf fbbfVar35 = aklqVar37.p;
                fbbf fbbfVar36 = akkpVar12.uo;
                fbbf fbbfVar37 = aklqVar37.dU;
                fbbf fbbfVar38 = aklqVar37.dV;
                fbbf fbbfVar39 = aklqVar37.ev;
                fbbf fbbfVar40 = akkoVar20.iq;
                fbbf fbbfVar41 = akkpVar12.Z;
                fbbf fbbfVar42 = akhyVar7.ao;
                ajjc ajjcVar3 = (ajjc) aklqVar37.m.b();
                akis akisVar23 = this.a;
                aklq aklqVar38 = this.c;
                akkp akkpVar13 = akisVar23.a;
                fbbf fbbfVar43 = akkpVar13.eT;
                fbbf fbbfVar44 = aklqVar38.ew;
                fbbf fbbfVar45 = aklqVar38.cP;
                fbbf fbbfVar46 = akkpVar13.nV;
                fbbf fbbfVar47 = aklqVar36.C;
                fbbf fbbfVar48 = aklqVar36.P;
                fbbf fbbfVar49 = aklqVar37.D;
                akko akkoVar21 = akisVar23.b;
                fbbf fbbfVar50 = aklqVar38.bt;
                fbbf fbbfVar51 = akisVar23.kf;
                aaxj as = aklqVar38.as();
                xgp n = akkoVar21.n();
                fbbf fbbfVar52 = akhyVar7.aE;
                fbbf fbbfVar53 = aklqVar37.cT;
                aaeeVar = new abac(ffskVar22, ffskVar23, context15, conversation4, alxsVar, alxuVar, ffxxVar6, fbbfVar48, fbbfVar29, fbbfVar47, aklqVar36.bL, fbbfVar30, fbbfVar31, fbbfVar32, akfyVar2.l, akhyVar6.bb, akhyVar6.aS, of4, fbbfVar33, fbbfVar34, fbbfVar35, fbbfVar49, fbbfVar36, fbbfVar37, fbbfVar38, fbbfVar53, fbbfVar39, fbbfVar40, fbbfVar41, fbbfVar52, fbbfVar42, ajjcVar3, fbbfVar43, fbbfVar44, fbbfVar45, fbbfVar46, fbbfVar50, fbbfVar51, as, n);
                break;
            case 278:
                return yls.a((ylo) this.c.bz.b());
            case 279:
                return new avin((Context) this.a.q.b(), (ffsk) this.c.e.b(), this.d.l, this.a.a.r);
            case 280:
                return new czmh(this.a.a.al);
            case 281:
                Context context16 = (Context) this.a.q.b();
                akis akisVar24 = this.a;
                return new zwm(context16, akisVar24.a.bM(), akisVar24.b.aC());
            case 282:
                Context context17 = (Context) this.a.q.b();
                ajjc ajjcVar4 = (ajjc) this.c.m.b();
                akis akisVar25 = this.a;
                return new zwq(context17, ajjcVar4, akisVar25.a.bM(), akisVar25.b.aC());
            case 283:
                return Optional.of(this.c.aj());
            case 284:
                return Optional.of(this.c.an());
            case 285:
                return Optional.of((zbo) this.c.al.b());
            case 286:
                return new czxo((Context) this.a.q.b(), Optional.empty());
            case 287:
                Context context18 = (Context) this.a.q.b();
                akis akisVar26 = this.a;
                aklq aklqVar39 = this.c;
                fbbf fbbfVar54 = this.d.l;
                akko akkoVar22 = akisVar26.b;
                return new aapt(context18, akkoVar22.dw(), akkoVar22.dx(), aklqVar39.aw(), (aigz) fbbfVar54.b(), (aolr) this.a.a.Z.b());
            case 288:
                return xdq.a((alxs) this.c.F.b(), (ffsk) this.c.e.b());
            case 289:
                return xei.a((alxs) this.c.F.b(), (ffsk) this.c.e.b());
            case 290:
                Context context19 = (Context) this.a.q.b();
                ffsk ffskVar24 = (ffsk) this.c.e.b();
                alye alyeVar3 = (alye) this.c.P.b();
                ffxx ffxxVar7 = (ffxx) this.c.l.b();
                aklq aklqVar40 = this.c;
                return new aavd(context19, ffskVar24, alyeVar3, ffxxVar7, aklqVar40.Z(), (aklf) aklqVar40.eI.b(), (aauw) this.c.bw.b(), (crnr) this.a.b.nd.b());
            case 291:
                return new aklf(this);
            case 292:
                return new aaul((akzt) this.a.a.C.b(), (ffsk) this.a.a.p.b());
            case 293:
                return new aauf(this.a.b.ne);
            case 294:
                return new aauo((aklf) this.c.eI.b(), this.c.bh());
            case 295:
                return new aaup((Context) this.a.q.b(), (ConversationId) this.c.i.b(), (aklf) this.c.eI.b());
            case 296:
                return new aaxc();
            case 297:
                return xdk.a((alye) this.c.P.b(), (ffsk) this.c.e.b());
            case 298:
                return new aaus((ffxx) this.c.t.b(), (ConversationId) this.c.i.b(), (ffsk) this.c.e.b(), this.a.a.no, this.c.bq);
            case 299:
                ffsk ffskVar25 = (ffsk) this.c.e.b();
                ffhd ffhdVar9 = (ffhd) this.a.co.b();
                aklq aklqVar41 = this.c;
                fbbf fbbfVar55 = aklqVar41.eR;
                ffxx ffxxVar8 = (ffxx) aklqVar41.eS.b();
                ffxx ffxxVar9 = (ffxx) this.c.eT.b();
                zej zejVar = (zej) this.c.cn.b();
                Conversation conversation5 = (Conversation) this.c.k.b();
                akhy akhyVar8 = this.b;
                aklq aklqVar42 = this.c;
                akis akisVar27 = this.a;
                fbbf fbbfVar56 = akisVar27.cz;
                return new aawf(ffskVar25, ffhdVar9, fbbfVar55, ffxxVar8, ffxxVar9, zejVar, conversation5, akhyVar8.aS, aklqVar42.eU, akisVar27.jA, aklqVar42.eV, (cqoh) fbbfVar56.b(), (cwrk) this.c.dm.b());
            default:
                throw new AssertionError(i);
        }
        return aaeeVar;
    }

    private final Object e() {
        Object ajeeVar;
        llv llvVar;
        llv llvVar2;
        llv llvVar3;
        llv llvVar4;
        llv llvVar5;
        llv llvVar6;
        llv llvVar7;
        llv llvVar8;
        llv llvVar9;
        llv llvVar10;
        int i = this.e;
        switch (i) {
            case 300:
                akkp akkpVar = this.a.a;
                fbbf fbbfVar = akkpVar.nc;
                ffsk ffskVar = (ffsk) akkpVar.p.b();
                akko akkoVar = this.a.b;
                return new aawh(fbbfVar, ffskVar, akkoVar.nh, akkoVar.bl());
            case 301:
                return xef.a((alxs) this.c.F.b(), (ffsk) this.c.e.b());
            case 302:
                return xeg.a((alxs) this.c.F.b(), (ffsk) this.c.e.b());
            case 303:
                return new aawk(this.a.a.C);
            case 304:
                return new aawl((akyb) this.a.a.bi.b());
            case 305:
                return new zkt();
            case 306:
                return new aabk(this.a.b.mN);
            case 307:
                return Optional.of(this.c.V());
            case 308:
                aklq aklqVar = this.c;
                return new cojz(aklqVar.fa, aklqVar.m, this.b.ap, (ffsk) aklqVar.e.b());
            case 309:
                akis akisVar = this.a;
                akhy akhyVar = this.b;
                akkp akkpVar2 = akisVar.a;
                return new cojl(akkpVar2.Sq, akisVar.q, akisVar.ds, akhyVar.cT, (ffsk) akkpVar2.aq.b());
            case 310:
                return new zef((ffxx) this.c.l.b());
            case 311:
                return new abeo((abam) this.d.o.b());
            case 312:
                return enip.v((abqq) this.c.fe.b(), (abqq) this.c.ei.b(), (abqq) this.c.cb.b(), (abqq) this.c.em.b(), (abqq) this.c.bR.b(), (abqq) this.c.bH.b(), (abqq) this.c.es.b(), (abqq) this.c.et.b(), (abqq) this.c.eM.b(), (abqq) this.c.aI.b(), (abqq) this.c.ee.b(), (abqq) this.c.ff.b(), (abqq) this.c.fg.b(), (abqq) this.c.cZ.b());
            case 313:
                return xdl.a((Conversation) this.c.k.b());
            case 314:
                return new aawi(this.a.jA);
            case 315:
                return new abap(this.d.o);
            case 316:
                return Optional.of((ajge) this.c.bq.b());
            case 317:
                return new enpx((abcr) this.c.fj.b());
            case 318:
                return new abcr((Context) this.a.q.b(), (ffsk) this.a.a.p.b(), (ffxx) this.c.q.b());
            case 319:
                return xel.a(fbaz.a(this.c.fl), (athn) this.a.b.nj.b());
            case 320:
                return new xek((ConversationId) this.c.i.b(), (ffxx) this.c.l.b(), (ffsk) this.c.e.b());
            case 321:
                ffsk ffskVar2 = (ffsk) this.c.e.b();
                ffxx ffxxVar = (ffxx) this.c.t.b();
                ConversationId conversationId = (ConversationId) this.c.i.b();
                Optional of = Optional.of((aizr) this.c.fq.b());
                zqx zqxVar = (zqx) this.c.bT.b();
                aepg aepgVar = (aepg) this.b.ls.b();
                aigz aigzVar = (aigz) this.d.l.b();
                Optional optional = (Optional) this.b.iY.b();
                akhy akhyVar2 = this.b;
                akis akisVar2 = this.a;
                aklq aklqVar2 = this.c;
                return new ajbx(ffskVar2, ffxxVar, conversationId, of, zqxVar, aepgVar, aigzVar, optional, akhyVar2.b, akhyVar2.nR, akisVar2.a.no, (ajjc) aklqVar2.m.b(), (Optional) this.a.cs.b(), this.a.b.nl);
            case 322:
                Context context = (Context) this.a.q.b();
                akis akisVar3 = this.a;
                akfy akfyVar = this.d;
                aklq aklqVar3 = this.c;
                akhy akhyVar3 = this.b;
                fbbf fbbfVar2 = akisVar3.b.nk;
                fbbf fbbfVar3 = aklqVar3.fo;
                cjeo cjeoVar = (cjeo) akhyVar3.aG.b();
                aklq aklqVar4 = this.c;
                akhy akhyVar4 = this.b;
                akkp akkpVar3 = this.a.a;
                ajfa aI = aklqVar4.aI();
                fbbf fbbfVar4 = akhyVar4.b;
                fbbf fbbfVar5 = akkpVar3.au;
                ajjc ajjcVar = (ajjc) aklqVar4.m.b();
                ajba ajbaVar = (ajba) this.a.b.nl.b();
                akis akisVar4 = this.a;
                return new ajax(context, fbbfVar2, akfyVar.l, fbbfVar3, cjeoVar, aI, fbbfVar4, fbbfVar5, ajjcVar, ajbaVar, akisVar4.a.as, (cjdk) akisVar4.cr.b(), this.a.b.ld, this.b.F(), (ajaz) this.c.fp.b(), (ffsk) this.a.a.aq.b());
            case 323:
                return new ajbz((Context) this.a.q.b(), (cjdk) this.a.cr.b(), this.c.fn);
            case 324:
                return new arbp(this.a.a.cc);
            case 325:
                return new ajaz((Context) this.a.q.b());
            case 326:
                Context context2 = (Context) this.a.q.b();
                ffsk ffskVar3 = (ffsk) this.c.e.b();
                ffhd ffhdVar = (ffhd) this.a.cP.b();
                ffxx ffxxVar2 = (ffxx) this.c.t.b();
                ConversationId conversationId2 = (ConversationId) this.c.i.b();
                akzt akztVar = (akzt) this.a.a.C.b();
                zqx zqxVar2 = (zqx) this.c.bT.b();
                aepg aepgVar2 = (aepg) this.b.ls.b();
                aigz aigzVar2 = (aigz) this.d.l.b();
                Optional optional2 = (Optional) this.b.iY.b();
                akhy akhyVar5 = this.b;
                fbbf fbbfVar6 = akhyVar5.b;
                elbx elbxVar = (elbx) akhyVar5.ap.b();
                ajjc ajjcVar2 = (ajjc) this.c.m.b();
                akis akisVar5 = this.a;
                akkp akkpVar4 = akisVar5.a;
                ajeeVar = new ajee(context2, ffskVar3, ffhdVar, ffxxVar2, conversationId2, akztVar, zqxVar2, aepgVar2, aigzVar2, optional2, fbbfVar6, elbxVar, ajjcVar2, akisVar5.mv, akkpVar4.au, akkpVar4.no);
                break;
            case 327:
                return new aewb((ffsk) this.c.e.b(), (ffxx) this.c.l.b(), this.a.a.al, (aigz) this.d.l.b());
            case 328:
                ffsk ffskVar4 = (ffsk) this.c.e.b();
                Conversation conversation = (Conversation) this.c.k.b();
                ffxx ffxxVar3 = (ffxx) this.c.G.b();
                akkp akkpVar5 = this.a.a;
                return new abqp(ffskVar4, conversation, ffxxVar3, akkpVar5.no, akkpVar5.fP, akkpVar5.il, akkpVar5.pP);
            case 329:
                akis akisVar6 = this.a;
                aklq aklqVar5 = this.c;
                fbbf fbbfVar7 = akisVar6.a.hj;
                ffsk ffskVar5 = (ffsk) aklqVar5.e.b();
                ffsk ffskVar6 = (ffsk) this.a.a.aq.b();
                akhy akhyVar6 = this.b;
                return new abcy(fbbfVar7, ffskVar5, ffskVar6, akhyVar6.cR, akhyVar6.S, (ConversationId) this.c.i.b(), (dtuu) this.a.a.ay.b(), (Conversation) this.c.k.b(), this.a.b.nm);
            case 330:
                fbbf fbbfVar8 = this.c.fx;
                Optional.empty();
                ffxx ffxxVar4 = (ffxx) this.c.fz.b();
                aklq aklqVar6 = this.c;
                Optional of2 = Optional.of((abeo) aklqVar6.fd.b());
                aklq aklqVar7 = this.c;
                return new MessageDetailsViewModel(fbbfVar8, ffxxVar4, aklqVar6.ak, of2, aklqVar7.ap(), (ffxx) aklqVar7.G.b());
            case 331:
                eisx eisxVar = (eisx) this.b.b.b();
                aklq aklqVar8 = this.c;
                ahtl aE = aklqVar8.aE();
                zum ab = aklqVar8.ab();
                aklf aklfVar = (aklf) aklqVar8.eI.b();
                Context context3 = (Context) this.a.q.b();
                ffsk ffskVar7 = (ffsk) this.c.e.b();
                ffxx ffxxVar5 = (ffxx) this.c.l.b();
                ffxx ffxxVar6 = (ffxx) this.c.q.b();
                ffhd ffhdVar2 = (ffhd) this.a.cn.b();
                csrh csrhVar = (csrh) this.a.a.xi.b();
                aklq aklqVar9 = this.c;
                aklqVar9.aD();
                Optional.of((cyvq) aklqVar9.v.b());
                return new ahtb(eisxVar, aE, ab, aklfVar, context3, ffskVar7, ffxxVar5, ffxxVar6, ffhdVar2, csrhVar);
            case 332:
                return ahsu.a((Conversation) this.c.k.b(), (MessageId) this.c.fy.b());
            case 333:
                llvVar = this.c.gW;
                return ahsv.a(llvVar);
            case 334:
                Optional of3 = Optional.of(this.c.aU());
                Optional of4 = Optional.of((cyvq) this.c.v.b());
                Optional.empty();
                return new MiniConversationDetailsPageViewModel(of3, of4);
            case 335:
                aklq aklqVar10 = this.c;
                return new MultiShareViewModel(aklqVar10.gd, this.a.a.zX, aklqVar10.gf);
            case 336:
                return new aicg((aifx) this.c.fK.b(), (ahzh) this.c.fR.b(), (aibw) this.c.gc.b(), (ahvb) this.c.fL.b(), (ahvh) this.c.gb.b(), this.a.b.no);
            case 337:
                Context context4 = (Context) this.a.q.b();
                ffsk ffskVar8 = (ffsk) this.c.e.b();
                aigz aigzVar3 = (aigz) this.d.l.b();
                aicd aicdVar = (aicd) this.c.fC.b();
                aklq aklqVar11 = this.c;
                return new aigd(context4, ffskVar8, aigzVar3, aicdVar, aklqVar11.fD, (aicu) aklqVar11.fF.b(), (aidw) this.c.fJ.b());
            case 338:
                return new aicf();
            case 339:
                return new aifv(this.a.a.dF, new aifp(), (Executor) this.a.p.b(), this.a.cN);
            case 340:
                return new aicu((Context) this.a.q.b(), (ffsk) this.c.e.b(), (ahuu) this.c.fE.b(), this.c.fD);
            case 341:
                Context context5 = (Context) this.a.q.b();
                akis akisVar7 = this.a;
                akfy akfyVar2 = this.d;
                fbbf fbbfVar9 = akisVar7.b.nn;
                cwos cwosVar = (cwos) akfyVar2.m.b();
                llvVar2 = this.c.gW;
                return new ahuw(context5, fbbfVar9, cwosVar, llvVar2);
            case 342:
                ffsk ffskVar9 = (ffsk) this.c.e.b();
                Context context6 = (Context) this.a.q.b();
                akis akisVar8 = this.a;
                aklq aklqVar12 = this.c;
                akkp akkpVar6 = akisVar8.a;
                fbbf fbbfVar10 = akkpVar6.Z;
                fbbf fbbfVar11 = akkpVar6.ap;
                aicd aicdVar2 = (aicd) aklqVar12.fC.b();
                amav amavVar = (amav) this.a.a.zX.b();
                ahuu ahuuVar = (ahuu) this.c.fE.b();
                akis akisVar9 = this.a;
                aklq aklqVar13 = this.c;
                return new aiew(ffskVar9, context6, fbbfVar10, fbbfVar11, aicdVar2, amavVar, ahuuVar, akisVar9.cN, aklqVar13.fD, aklqVar13.fG, aklqVar13.fI, (equr) aklqVar13.fH.b(), this.a.b.no);
            case 343:
                return new tud((Context) this.a.q.b(), this.a.a.t);
            case 344:
                ffsk ffskVar10 = (ffsk) this.c.e.b();
                ffhd ffhdVar3 = (ffhd) this.a.cn.b();
                aqkp aqkpVar = (aqkp) this.b.aE.b();
                alxl alxlVar = (alxl) this.b.ao.b();
                aicd aicdVar3 = (aicd) this.c.fC.b();
                ahuu ahuuVar2 = (ahuu) this.c.fE.b();
                akis akisVar10 = this.a;
                aklq aklqVar14 = this.c;
                akkp akkpVar7 = akisVar10.a;
                return new aidp(ffskVar10, ffhdVar3, aqkpVar, alxlVar, aicdVar3, ahuuVar2, akkpVar7.xl, akkpVar7.zX, akkpVar7.ab, aklqVar14.fD, akisVar10.cN, (equr) aklqVar14.fH.b(), this.a.a.xy);
            case 345:
                llvVar3 = this.c.gW;
                return ahuh.a(llvVar3);
            case 346:
                ffsk ffskVar11 = (ffsk) this.c.e.b();
                akis akisVar11 = this.a;
                aklq aklqVar15 = this.c;
                akko akkoVar2 = akisVar11.b;
                fbbf fbbfVar12 = akkoVar2.np;
                fbbf fbbfVar13 = akkoVar2.nq;
                fbbf fbbfVar14 = akkoVar2.nr;
                equr equrVar = (equr) aklqVar15.fH.b();
                aklq aklqVar16 = this.c;
                return new ahzo(ffskVar11, fbbfVar12, fbbfVar13, fbbfVar14, equrVar, aklqVar16.fD, this.a.b.cj(), (aiap) aklqVar16.fN.b(), (aibc) this.c.fO.b(), (aibs) this.c.fP.b(), (aidc) this.d.s.b(), (aibu) this.c.fQ.b(), this.a.b.no, (ahuu) this.c.fE.b());
            case 347:
                aklq aklqVar17 = this.c;
                return new aiaq(aklqVar17.d(), (ahva) aklqVar17.fM.b(), this.c.fG);
            case 348:
                return new ahva((ahuu) this.c.fE.b(), (elbx) this.b.ap.b(), (ahvb) this.c.fL.b(), this.c.fD);
            case 349:
                return new ahvg((Context) this.a.q.b(), (ffsk) this.c.e.b(), (ahuu) this.c.fE.b());
            case 350:
                Context context7 = (Context) this.a.q.b();
                ffsk ffskVar12 = (ffsk) this.c.e.b();
                akis akisVar12 = this.a;
                aklq aklqVar18 = this.c;
                akko akkoVar3 = akisVar12.b;
                fbbf fbbfVar15 = akkoVar3.ns;
                fbbf fbbfVar16 = akkoVar3.nt;
                ahuu ahuuVar3 = (ahuu) aklqVar18.fE.b();
                alxl alxlVar2 = (alxl) this.b.ao.b();
                akkp akkpVar8 = this.a.a;
                fbbf fbbfVar17 = akkpVar8.ab;
                fbbf fbbfVar18 = akkpVar8.Z;
                cuxh cuxhVar = (cuxh) akkpVar8.ae.b();
                akhy akhyVar7 = this.b;
                aklq aklqVar19 = this.c;
                akis akisVar13 = this.a;
                fbbf fbbfVar19 = aklqVar19.fD;
                ecrj ecrjVar = (ecrj) akisVar13.cN.b();
                aklq aklqVar20 = this.c;
                fbbf fbbfVar20 = akhyVar7.pa;
                llvVar4 = aklqVar20.gW;
                return new aibn(context7, ffskVar12, fbbfVar15, fbbfVar16, ahuuVar3, alxlVar2, fbbfVar17, fbbfVar18, cuxhVar, fbbfVar20, fbbfVar19, ecrjVar, llvVar4);
            case 351:
                return new aibs((ffsk) this.c.e.b(), (amav) this.a.a.zX.b());
            case 352:
                return new aibv(this.a.fK);
            case 353:
                ffsk ffskVar13 = (ffsk) this.c.e.b();
                ffhd ffhdVar4 = (ffhd) this.a.cn.b();
                Context context8 = (Context) this.a.q.b();
                elbx elbxVar2 = (elbx) this.b.ap.b();
                aqkp aqkpVar2 = (aqkp) this.b.aE.b();
                ahuu ahuuVar4 = (ahuu) this.c.fE.b();
                alxl alxlVar3 = (alxl) this.b.ao.b();
                ahvh ahvhVar = (ahvh) this.c.gb.b();
                aklq aklqVar21 = this.c;
                akfy akfyVar3 = this.d;
                llvVar5 = aklqVar21.gW;
                aigz aigzVar4 = (aigz) akfyVar3.l.b();
                aklq aklqVar22 = this.c;
                akis akisVar14 = this.a;
                return new aica(ffskVar13, ffhdVar4, context8, elbxVar2, aqkpVar2, ahuuVar4, alxlVar3, ahvhVar, llvVar5, aigzVar4, aklqVar22.fD, akisVar14.a.nV, akisVar14.b.nv, (aicu) aklqVar22.fF.b());
            case 354:
                return new ahvk((Context) this.a.q.b(), (ffsk) this.c.e.b(), (aicu) this.c.fF.b(), (ahvw) this.c.ga.b(), this.c.fD, this.a.b.no);
            case 355:
                return new ahvw((ahwb) this.c.fZ.b());
            case 356:
                ffsk ffskVar14 = (ffsk) this.c.e.b();
                ahyl ahylVar = (ahyl) this.c.fU.b();
                ahwj ahwjVar = (ahwj) this.c.fV.b();
                ahxr ahxrVar = (ahxr) this.c.fY.b();
                akis akisVar15 = this.a;
                aklq aklqVar23 = this.c;
                akko akkoVar4 = akisVar15.b;
                return new ahwi(ffskVar14, ahylVar, ahwjVar, ahxrVar, akkoVar4.as(), akkoVar4.at(), akkoVar4.bq(), aklqVar23.m(), (avaf) akkoVar4.md.b(), (aval) this.a.b.me.b(), this.a.b.au());
            case 357:
                Context context9 = (Context) this.a.q.b();
                ffsk ffskVar15 = (ffsk) this.c.e.b();
                ydb ydbVar = (ydb) this.c.y.b();
                aklq aklqVar24 = this.c;
                fbbf fbbfVar21 = aklqVar24.fD;
                ahzc ahzcVar = (ahzc) aklqVar24.fS.b();
                ahxd ahxdVar = (ahxd) this.c.fT.b();
                akko akkoVar5 = this.a.b;
                return new ahzb(context9, ffskVar15, ydbVar, fbbfVar21, ahzcVar, ahxdVar, akkoVar5.as(), akkoVar5.at(), akkoVar5.au());
            case 358:
                return new ahzc();
            case 359:
                ffhd ffhdVar5 = (ffhd) this.a.cn.b();
                ffsk ffskVar16 = (ffsk) this.c.e.b();
                aklq aklqVar25 = this.c;
                return new ahxd(ffhdVar5, ffskVar16, aklqVar25.bU, aklqVar25.bW, (ydb) aklqVar25.y.b(), this.a.a.nV);
            case 360:
                ffsk ffskVar17 = (ffsk) this.c.e.b();
                ydb ydbVar2 = (ydb) this.c.y.b();
                aklq aklqVar26 = this.c;
                return new ahwz(ffskVar17, ydbVar2, aklqVar26.v(), (xuw) aklqVar26.bn.b());
            case 361:
                ffsk ffskVar18 = (ffsk) this.c.e.b();
                ffsk ffskVar19 = (ffsk) this.a.a.p.b();
                ffhd ffhdVar6 = (ffhd) this.a.cn.b();
                equr equrVar2 = (equr) this.c.fH.b();
                Context context10 = (Context) this.a.q.b();
                elbx elbxVar3 = (elbx) this.b.ap.b();
                zwe zweVar = (zwe) this.c.bt.b();
                ahxo ahxoVar = (ahxo) this.c.fW.b();
                ahuu ahuuVar5 = (ahuu) this.c.fE.b();
                alxl alxlVar4 = (alxl) this.b.ao.b();
                aqkp aqkpVar3 = (aqkp) this.b.aE.b();
                cslr cslrVar = (cslr) this.a.iq.b();
                akfy akfyVar4 = this.d;
                akis akisVar16 = this.a;
                aklq aklqVar27 = this.c;
                akkp akkpVar9 = akisVar16.a;
                akko akkoVar6 = akisVar16.b;
                xyx o = akkoVar6.o();
                ahxk aF = aklqVar27.aF();
                fbbf fbbfVar22 = aklqVar27.fD;
                fbbf fbbfVar23 = akkpVar9.qe;
                fbbf fbbfVar24 = akkoVar6.lN;
                cwos cwosVar2 = (cwos) akfyVar4.m.b();
                aklq aklqVar28 = this.c;
                akis akisVar17 = this.a;
                fbbf fbbfVar25 = aklqVar28.fX;
                ecrj ecrjVar2 = (ecrj) akisVar17.cN.b();
                akis akisVar18 = this.a;
                aklq aklqVar29 = this.c;
                fbbf fbbfVar26 = aklqVar29.bk;
                fbbf fbbfVar27 = aklqVar29.bW;
                fbbf fbbfVar28 = akfyVar4.l;
                akko akkoVar7 = akisVar18.b;
                ajeeVar = new ahyk(ffskVar18, ffskVar19, ffhdVar6, equrVar2, context10, elbxVar3, zweVar, ahxoVar, ahuuVar5, alxlVar4, aqkpVar3, cslrVar, fbbfVar28, o, aF, fbbfVar22, fbbfVar23, fbbfVar24, cwosVar2, fbbfVar25, ecrjVar2, fbbfVar26, fbbfVar27, akisVar18.a.nV, akkoVar7.bc(), akkoVar7.nu);
                break;
            case 362:
                return new ahxq((Context) this.a.q.b(), (ffsk) this.c.e.b(), (ahzc) this.c.fS.b(), (ydb) this.c.y.b(), this.a.b.nu);
            case 363:
                ffhd ffhdVar7 = (ffhd) this.a.cn.b();
                alxl alxlVar5 = (alxl) this.b.ao.b();
                akko akkoVar8 = this.a.b;
                return new ahxi(ffhdVar7, alxlVar5, akkoVar8.o(), akkoVar8.cJ());
            case 364:
                return enip.r((ahuy) this.c.ge.b(), this.c.aG());
            case 365:
                return new ahul((ffsk) this.c.e.b(), (Context) this.a.q.b(), (ffhd) this.a.cn.b(), (ahuu) this.c.fE.b(), (cwos) this.d.m.b());
            case 366:
                return new SignOutAccountViewModel(this.c.aC());
            case 367:
                llvVar6 = this.c.gW;
                return adof.a(llvVar6);
            case 368:
                aklq aklqVar30 = this.c;
                akkp akkpVar10 = this.a.a;
                fbbf fbbfVar29 = aklqVar30.gQ;
                fbbf fbbfVar30 = aklqVar30.gl;
                fbbf fbbfVar31 = akkpVar10.zX;
                fbbf fbbfVar32 = aklqVar30.gp;
                fbbf fbbfVar33 = aklqVar30.gq;
                Optional.empty();
                return new StartChatViewModel(fbbfVar29, fbbfVar30, fbbfVar31, fbbfVar32, fbbfVar33, (ffsk) this.c.e.b(), this.c.gT);
            case 369:
                return new cwcn((cvyp) this.c.gj.b(), (cwht) this.c.gC.b(), (cvsk) this.c.gN.b(), (cwax) this.c.gP.b(), (cvwh) this.c.gD.b(), (ajjd) this.c.m.b(), (cvyr) this.c.gO.b(), (cwgr) this.c.gE.b(), (ablq) this.c.p.b(), this.a.b.nF);
            case 370:
                llvVar7 = this.c.gW;
                return cvyq.a(llvVar7);
            case 371:
                Context context11 = (Context) this.a.q.b();
                ffsk ffskVar20 = (ffsk) this.c.e.b();
                ConversationId conversationId3 = (ConversationId) this.c.gk.b();
                cwis cwisVar = (cwis) this.c.gl.b();
                cwbc cwbcVar = (cwbc) this.c.gn.b();
                cwav cwavVar = (cwav) this.c.go.b();
                cwjc cwjcVar = (cwjc) this.c.gp.b();
                cwhi cwhiVar = (cwhi) this.c.gr.b();
                aigz aigzVar5 = (aigz) this.d.l.b();
                cwha cwhaVar = (cwha) this.c.gB.b();
                aklq aklqVar31 = this.c;
                akko akkoVar9 = this.a.b;
                return new cwhz(context11, ffskVar20, conversationId3, cwisVar, cwbcVar, cwavVar, cwjcVar, cwhiVar, aigzVar5, cwhaVar, aklqVar31.gq, akkoVar9.jC, akkoVar9.nG);
            case 372:
                llvVar8 = this.c.gW;
                return cvsb.a(llvVar8);
            case 373:
                llvVar9 = this.c.gW;
                return new cwiv(llvVar9);
            case 374:
                return new cwbn((ffsk) this.a.a.p.b(), (ffsk) this.a.a.q.b(), (capp) this.b.jl.b(), (cwds) this.c.gm.b(), (djrv) this.a.a.br.b(), this.b.aF);
            case 375:
                return new cwds((ffsk) this.c.e.b(), (ffhd) this.a.cn.b(), (cwis) this.c.gl.b(), (aqkp) this.b.aE.b());
            case 376:
                twk twkVar = (twk) this.a.b.ak.b();
                aleq aleqVar = (aleq) this.a.a.lO.b();
                aklq aklqVar32 = this.c;
                akis akisVar19 = this.a;
                akko akkoVar10 = akisVar19.b;
                akkp akkpVar11 = akisVar19.a;
                llvVar10 = aklqVar32.gW;
                return new cwav(twkVar, aleqVar, llvVar10, akisVar19.cN, akkpVar11.L, akkoVar10.bo(), (ffsk) akkpVar11.q.b());
            case 377:
                return new cwjc();
            case 378:
                return new cwhr((Context) this.a.q.b(), (ffsk) this.c.e.b(), (cwiw) this.c.gq.b(), (aqvh) this.b.M.b(), (ctwb) this.a.a.c.b(), (ajjc) this.c.m.b(), (cwis) this.c.gl.b());
            case 379:
                return new cwiz((ffsk) this.c.e.b(), this.b.M);
            case 380:
                Context context12 = (Context) this.a.q.b();
                cwhc cwhcVar = (cwhc) this.c.gs.b();
                cwis cwisVar2 = (cwis) this.c.gl.b();
                cwed cwedVar = (cwed) this.c.gz.b();
                cwav cwavVar2 = (cwav) this.c.go.b();
                aklq aklqVar33 = this.c;
                return new cwha(context12, cwhcVar, cwisVar2, cwedVar, cwavVar2, aklqVar33.gA, aklqVar33.fG);
            case 381:
                return new cwhe();
            case 382:
                ffsk ffskVar21 = (ffsk) this.c.e.b();
                Context context13 = (Context) this.a.q.b();
                cwhc cwhcVar2 = (cwhc) this.c.gs.b();
                amav amavVar2 = (amav) this.a.a.zX.b();
                cwis cwisVar3 = (cwis) this.c.gl.b();
                akis akisVar20 = this.a;
                cwav cwavVar3 = (cwav) this.c.go.b();
                aklq aklqVar34 = this.c;
                return new cwfa(ffskVar21, context13, cwhcVar2, amavVar2, cwisVar3, akisVar20.cN, cwavVar3, aklqVar34.gw, aklqVar34.gx, aklqVar34.gv, aklqVar34.fG, this.a.b.nF, (cvwx) aklqVar34.gy.b(), (attl) this.a.a.hJ.b());
            case 383:
                ffsk ffskVar22 = (ffsk) this.c.e.b();
                Context context14 = (Context) this.a.q.b();
                cwhc cwhcVar3 = (cwhc) this.c.gs.b();
                akis akisVar21 = this.a;
                aklq aklqVar35 = this.c;
                fbbf fbbfVar34 = akisVar21.a.Z;
                cwis cwisVar4 = (cwis) aklqVar35.gl.b();
                aklq aklqVar36 = this.c;
                akkp akkpVar12 = this.a.a;
                fbbf fbbfVar35 = aklqVar36.gv;
                fbbf fbbfVar36 = akkpVar12.lI;
                cpdg cpdgVar = (cpdg) akkpVar12.ap.b();
                elho elhoVar = (elho) this.b.ar.b();
                akis akisVar22 = this.a;
                akko akkoVar11 = akisVar22.b;
                akkp akkpVar13 = akisVar22.a;
                return new cwgn(ffskVar22, context14, cwhcVar3, fbbfVar34, cwisVar4, fbbfVar35, fbbfVar36, cpdgVar, elhoVar, akkpVar13.bF, akkpVar13.hJ, akkoVar11.aN());
            case 384:
                return new cwgg((ffsk) this.c.e.b(), (cwhc) this.c.gs.b(), (cwis) this.c.gl.b(), (cwiw) this.c.gq.b(), (cwde) this.c.gt.b(), (cwav) this.c.go.b(), this.c.gu);
            case 385:
                ffhd ffhdVar8 = (ffhd) this.a.cn.b();
                cwds cwdsVar = (cwds) this.c.gm.b();
                akfy akfyVar5 = this.d;
                akhy akhyVar8 = this.b;
                akis akisVar23 = this.a;
                aklq aklqVar37 = this.c;
                fbbf fbbfVar37 = akfyVar5.l;
                fbbf fbbfVar38 = akhyVar8.ao;
                fbbf fbbfVar39 = akisVar23.cN;
                akkp akkpVar14 = akisVar23.a;
                fbbf fbbfVar40 = akkpVar14.Z;
                fbbf fbbfVar41 = akhyVar8.aE;
                akko akkoVar12 = akisVar23.b;
                return new cwdp(ffhdVar8, cwdsVar, fbbfVar37, fbbfVar38, fbbfVar39, fbbfVar40, fbbfVar41, akhyVar8.M, akkoVar12.ny, aklqVar37.aP(), akkpVar14.xx, akkoVar12.bn());
            case 386:
                return new cvsd((ffsk) this.c.e.b());
            case 387:
                ffsk ffskVar23 = (ffsk) this.c.e.b();
                ffhd ffhdVar9 = (ffhd) this.a.cn.b();
                cwhc cwhcVar4 = (cwhc) this.c.gs.b();
                alxl alxlVar6 = (alxl) this.b.ao.b();
                aqkp aqkpVar4 = (aqkp) this.b.aE.b();
                cwis cwisVar5 = (cwis) this.c.gl.b();
                akis akisVar24 = this.a;
                aklq aklqVar38 = this.c;
                akkp akkpVar15 = akisVar24.a;
                return new cwfx(ffskVar23, ffhdVar9, cwhcVar4, alxlVar6, aqkpVar4, cwisVar5, akkpVar15.ab, akkpVar15.zX, akkpVar15.xl, aklqVar38.gv, akisVar24.cN, aklqVar38.go, akkpVar15.xy, new auye() { // from class: auxs
                });
            case 388:
                return new cvxj(this.a.a.Z, (cwhc) this.c.gs.b(), (cwis) this.c.gl.b(), (ffsk) this.c.e.b(), (Context) this.a.q.b(), (cwde) this.c.gt.b(), (cwiw) this.c.gq.b(), this.a.a.hJ);
            case 389:
                return new daxg((csrv) this.a.a.iK.b(), (ddzb) this.a.a.nk.b());
            case 390:
                ffsk ffskVar24 = (ffsk) this.c.e.b();
                cvyf cvyfVar = (cvyf) this.c.gH.b();
                akis akisVar25 = this.a;
                aklq aklqVar39 = this.c;
                cvvb cj = akisVar25.b.cj();
                cvuf cvufVar = (cvuf) aklqVar39.gI.b();
                Optional of5 = Optional.of((cvvd) this.c.gJ.b());
                cvuw cvuwVar = (cvuw) this.c.gL.b();
                cwdv cwdvVar = (cwdv) this.d.t.b();
                cwis cwisVar6 = (cwis) this.c.gl.b();
                cvwe cvweVar = (cvwe) this.c.gM.b();
                cvvt cvvtVar = (cvvt) this.c.gK.b();
                cwav cwavVar4 = (cwav) this.c.go.b();
                aklq aklqVar40 = this.c;
                akis akisVar26 = this.a;
                akkp akkpVar16 = akisVar26.a;
                akko akkoVar13 = akisVar26.b;
                return new cvsy(ffskVar24, cvyfVar, cj, cvufVar, of5, cvuwVar, cwdvVar, cwisVar6, cvweVar, cvvtVar, cwavVar4, aklqVar40.gx, akkoVar13.nF, aklqVar40.gy, akkpVar16.hJ, akkoVar13.bp());
            case 391:
                return new cvyj((Context) this.a.q.b(), (ffsk) this.c.e.b(), (cvsa) this.c.gG.b(), (cwis) this.c.gl.b(), (amav) this.a.a.zX.b(), (ecrj) this.a.cN.b(), this.c.fG);
            case 392:
                ffsk ffskVar25 = (ffsk) this.c.e.b();
                ConversationId conversationId4 = (ConversationId) this.c.gk.b();
                cwde cwdeVar = (cwde) this.c.gt.b();
                cwis cwisVar7 = (cwis) this.c.gl.b();
                cvwh cvwhVar = (cvwh) this.c.gD.b();
                elbx elbxVar4 = (elbx) this.b.ap.b();
                cwch cwchVar = (cwch) this.c.gF.b();
                cwav cwavVar5 = (cwav) this.c.go.b();
                aklq aklqVar41 = this.c;
                return new cvsa(ffskVar25, conversationId4, cwdeVar, cwisVar7, cvwhVar, elbxVar4, cwchVar, cwavVar5, aklqVar41.gq, aklqVar41.gu);
            case 393:
                return new cvwo((ffsk) this.c.e.b(), (cwde) this.c.gt.b(), (cwis) this.c.gl.b(), (cwiw) this.c.gq.b());
            case 394:
                return new cwcm((Context) this.a.q.b(), (ffhd) this.a.cn.b(), (cwgr) this.c.gE.b(), (cwbc) this.c.gn.b(), (aigz) this.d.l.b(), this.b.dY());
            case 395:
                return new cwgr();
            case 396:
                cvsa cvsaVar = (cvsa) this.c.gG.b();
                aklq aklqVar42 = this.c;
                return new cvuf(cvsaVar, aklqVar42.d(), aklqVar42.fG);
            case 397:
                Context context15 = (Context) this.a.q.b();
                ffhd ffhdVar10 = (ffhd) this.a.cP.b();
                ffsk ffskVar26 = (ffsk) this.c.e.b();
                akis akisVar27 = this.a;
                aklq aklqVar43 = this.c;
                fbbf fbbfVar42 = akisVar27.a.Z;
                cwis cwisVar8 = (cwis) aklqVar43.gl.b();
                cwde cwdeVar2 = (cwde) this.c.gt.b();
                elbx elbxVar5 = (elbx) this.b.ap.b();
                akhy akhyVar9 = this.b;
                return new cvvj(context15, ffhdVar10, ffskVar26, fbbfVar42, akisVar27.cr, cwisVar8, cwdeVar2, elbxVar5, akhyVar9.nR, this.a.b.kk, akhyVar9.M);
            case 398:
                ffsk ffskVar27 = (ffsk) this.c.e.b();
                amav amavVar3 = (amav) this.a.a.zX.b();
                cvyf cvyfVar2 = (cvyf) this.c.gH.b();
                cvvt cvvtVar2 = (cvvt) this.c.gK.b();
                Optional of6 = Optional.of((cvvd) this.c.gJ.b());
                cwis cwisVar9 = (cwis) this.c.gl.b();
                aklq aklqVar44 = this.c;
                return new cvuw(ffskVar27, amavVar3, cvyfVar2, cvvtVar2, of6, cwisVar9, aklqVar44.gx, (cvwx) aklqVar44.gy.b());
            case 399:
                return new cvvx((ffsk) this.c.e.b(), (cwis) this.c.gl.b(), this.c.aO(), this.d.l);
            default:
                throw new AssertionError(i);
        }
        return ajeeVar;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final Object b() {
        int i = this.e;
        int i2 = i / 100;
        if (i2 == 0) {
            return a();
        }
        if (i2 == 1) {
            return c();
        }
        if (i2 == 2) {
            return d();
        }
        if (i2 == 3) {
            return e();
        }
        switch (i) {
            case 400:
                return new cvwf(this.a.fK);
            case 401:
                return new cwax((ffsk) this.c.e.b(), (Context) this.a.q.b(), (cvyr) this.c.gO.b(), (cwis) this.c.gl.b(), (cvsa) this.c.gG.b());
            case 402:
                ffsk ffskVar = (ffsk) this.c.e.b();
                Context context = (Context) this.a.q.b();
                ffhd ffhdVar = (ffhd) this.a.cn.b();
                cvyp cvypVar = (cvyp) this.c.gj.b();
                ConversationId conversationId = (ConversationId) this.c.gk.b();
                aklq aklqVar = this.c;
                akhy akhyVar = this.b;
                akfy akfyVar = this.d;
                fbbf fbbfVar = aklqVar.p;
                fbbf fbbfVar2 = akhyVar.ao;
                cwis cwisVar = (cwis) aklqVar.gl.b();
                aklq aklqVar2 = this.c;
                fbbf fbbfVar3 = aklqVar2.gm;
                fbbf fbbfVar4 = aklqVar2.gG;
                cwav cwavVar = (cwav) aklqVar2.go.b();
                akhy akhyVar2 = this.b;
                aklq aklqVar3 = this.c;
                akis akisVar = this.a;
                fbbf fbbfVar5 = aklqVar3.fG;
                fbbf fbbfVar6 = aklqVar3.gq;
                akko akkoVar = akisVar.b;
                auvq bn = akkoVar.bn();
                auvm auvmVar = new auvm(akkoVar.a.a.s);
                return new cvzm(ffskVar, context, ffhdVar, cvypVar, conversationId, fbbfVar, fbbfVar2, akfyVar.l, cwisVar, fbbfVar3, fbbfVar4, cwavVar, akhyVar2.aM, fbbfVar5, fbbfVar6, bn, auvmVar);
            case 403:
                cvrr cvrrVar = (cvrr) this.c.gR.b();
                cvrr cvrrVar2 = (cvrr) this.c.gS.b();
                aklq aklqVar4 = this.c;
                return enip.s(cvrrVar, cvrrVar2, new cwat((ffsk) aklqVar4.e.b(), aklqVar4.b.aE, aklqVar4.gl, aklqVar4.c.l));
            case 404:
                return new cvrn((ffsk) this.c.e.b(), (Context) this.a.q.b(), (ffhd) this.a.cn.b(), (cwis) this.c.gl.b(), (cwgr) this.c.gE.b());
            case 405:
                return new cwcg((ffsk) this.c.e.b(), (Context) this.a.q.b(), (ffhd) this.a.cn.b(), (cwis) this.c.gl.b(), (cwbc) this.c.gn.b(), (ajjc) this.c.m.b(), (cpbs) this.a.a.ft.b(), this.c.gq, (akzt) this.a.a.C.b(), (auee) this.a.a.mZ.b());
            default:
                throw new AssertionError(i);
        }
    }
}
