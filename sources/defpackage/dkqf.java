package defpackage;

import android.content.Context;
import android.os.Build;
import android.telephony.ims.ImsException;
import android.telephony.ims.ProvisioningManager;
import android.text.TextUtils;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;
import com.google.android.ims.chatsession.ChatSessionEngine;
import com.google.android.ims.jibe.service.businessinfo.BusinessInfoEngine;
import com.google.android.ims.jibe.service.connectiontracker.ImsConnectionTrackerEngine;
import com.google.android.ims.jibe.service.contactsmanager.ContactsManager;
import com.google.android.ims.jibe.service.filetransfer.FileTransferEngine;
import com.google.android.ims.jibe.service.profile.RcsProfileEngine;
import com.google.android.ims.jibe.service.signup.SignupEngine;
import com.google.android.ims.jibe.service.singleregistration.SingleRegistrationVendorImsController;
import com.google.android.ims.jibe.service.transportcontrol.TransportControlEngine;
import com.google.android.ims.messaging.MessagingEngine;
import com.google.android.ims.rcs.engine.impl.RcsEngineProxyImpl;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabase;
import com.google.android.ims.receiver.sip.DebugOptionsReceiver;
import com.google.android.libraries.jibe.service.locationsharing.LocationSharingEngine;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkqf implements fbbf {
    private final dkqg a;
    private final int b;

    public dkqf(dkqg dkqgVar, int i) {
        this.a = dkqgVar;
        this.b = i;
    }

    private final Object a() {
        int i = this.b;
        switch (i) {
            case 0:
                dkrx dkrxVar = (dkrx) ((dipk) this.a.a).c.b();
                dkrxVar.getClass();
                return dkrxVar;
            case 1:
                dkpm q = this.a.a.q();
                q.getClass();
                return q;
            case 2:
                errl v = this.a.a.v();
                v.getClass();
                return v;
            case 3:
                dkgw dkgwVar = (dkgw) this.a.e.b();
                dksa s = this.a.a.s();
                s.getClass();
                return new dkeq(dkgwVar, s, this.a.a.w());
            case 4:
                return new dkgw();
            case 5:
                Context context = (Context) this.a.g.b();
                dkqg dkqgVar = this.a;
                enhk m = enhk.m(dkvg.DUAL_REG, dkqgVar.aJ, dkvg.SINGLE_REG, dkqgVar.aO);
                dkqg dkqgVar2 = this.a;
                fbbf fbbfVar = dkqgVar2.bk;
                fbbf fbbfVar2 = dkqgVar2.aG;
                fbbf fbbfVar3 = dkqgVar2.D;
                fbbf fbbfVar4 = dkqgVar2.r;
                fbbf fbbfVar5 = dkqgVar2.c;
                fbbf fbbfVar6 = dkqgVar2.n;
                fbbf fbbfVar7 = dkqgVar2.bj;
                fbbf fbbfVar8 = dkqgVar2.bi;
                fbbf fbbfVar9 = dkqgVar2.bb;
                fbbf fbbfVar10 = dkqgVar2.ba;
                fbbf fbbfVar11 = dkqgVar2.aZ;
                fbbf fbbfVar12 = dkqgVar2.aQ;
                fbbf fbbfVar13 = dkqgVar2.aP;
                fbbf fbbfVar14 = dkqgVar2.v;
                fbbf fbbfVar15 = dkqgVar2.u;
                fbbf fbbfVar16 = dkqgVar2.t;
                fazb a = fbaz.a(dkqgVar2.O);
                fazb a2 = fbaz.a(fbbfVar16);
                fazb a3 = fbaz.a(fbbfVar15);
                fazb a4 = fbaz.a(fbbfVar14);
                fazb a5 = fbaz.a(fbbfVar13);
                fazb a6 = fbaz.a(fbbfVar12);
                fazb a7 = fbaz.a(fbbfVar11);
                fazb a8 = fbaz.a(fbbfVar10);
                fazb a9 = fbaz.a(fbbfVar9);
                fazb a10 = fbaz.a(fbbfVar8);
                fazb a11 = fbaz.a(fbbfVar7);
                fazb a12 = fbaz.a(fbbfVar6);
                fazb a13 = fbaz.a(fbbfVar5);
                fazb a14 = fbaz.a(fbbfVar4);
                fazb a15 = fbaz.a(fbbfVar3);
                fazb a16 = fbaz.a(fbbfVar2);
                dkpe dkpeVar = (dkpe) fbbfVar.b();
                dfpi f = this.a.a.f();
                f.getClass();
                ctwb e = this.a.a.e();
                e.getClass();
                errl errlVar = (errl) this.a.d.b();
                dkqg dkqgVar3 = this.a;
                dipm dipmVar = dkqgVar3.a;
                fazb a17 = fbaz.a(dkqgVar3.q);
                dhvo g = dipmVar.g();
                g.getClass();
                return new RcsEngineProxyImpl(context, m, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, dkqgVar2.J, a14, a15, dkqgVar2.b, a16, dkpeVar, f, e, errlVar, a17, g);
            case 6:
                return this.a.a.a();
            case 7:
                dkqg dkqgVar4 = this.a;
                fbbf fbbfVar17 = dkqgVar4.g;
                dkfd k = dkqgVar4.k();
                Context context2 = (Context) fbbfVar17.b();
                dkpf dkpfVar = (dkpf) dkqgVar4.Z.b();
                dkgw dkgwVar2 = (dkgw) dkqgVar4.e.b();
                diod diodVar = (diod) dkqgVar4.B.b();
                dikj j = dkqgVar4.a.j();
                j.getClass();
                dkga dkgaVar = (dkga) dkqgVar4.K.b();
                dipm dipmVar2 = dkqgVar4.a;
                eenq u = dipmVar2.u();
                dipk dipkVar = (dipk) dipmVar2;
                Context context3 = (Context) ((fbbb) dipkVar.b).a;
                djjz n = dipkVar.n();
                int[] iArr = djkm.a;
                dktn dktnVar = new dktn("(RCS): ");
                dikj dikjVar = (dikj) dipkVar.bo.b();
                int[] iArr2 = djkm.a;
                if (djak.n()) {
                    iArr2 = djkm.b;
                }
                djkt djktVar = new djkt(context2, dkpfVar, dkgwVar2, diodVar, j, dkgaVar, u, new djkq(context3, n.a, iArr2, dktnVar, dikjVar), (djky) dkqgVar4.at.b());
                diru diruVar = (diru) this.a.aF.b();
                dkqg dkqgVar5 = this.a;
                return k.a(dkvg.DUAL_REG, djktVar, diruVar, new dkih((diul) dkqgVar5.aG.b(), (dkii) dkqgVar5.aI.b(), (ctvb) dkqgVar5.j.b(), (dkib) dkqgVar5.l.b(), (eehz) dkqgVar5.M.b(), (dkhx) dkqgVar5.p.b(), new dkid((dkib) dkqgVar5.l.b()), new dkiq(dkqgVar5.ad, dkqgVar5.ac, dkqgVar5.ab, dkqgVar5.l()), new dkhz(dkqgVar5.l())));
            case 8:
                BusinessInfoDatabase businessInfoDatabase = (BusinessInfoDatabase) ((dipk) this.a.a).bA.b();
                businessInfoDatabase.getClass();
                return businessInfoDatabase;
            case 9:
                dipa dipaVar = (dipa) ((dipk) this.a.a).by.b();
                dipaVar.getClass();
                return dipaVar;
            case 10:
                return new dipf((Context) this.a.g.b(), (dipa) this.a.i.b(), (dkrx) this.a.b.b(), (ctvb) this.a.j.b());
            case 11:
                ctvb d = this.a.a.d();
                d.getClass();
                return d;
            case 12:
                Context context4 = (Context) this.a.g.b();
                dioo diooVar = (dioo) ((dipk) this.a.a).by.b();
                diooVar.getClass();
                return new dioc(context4, diooVar, (dipf) this.a.k.b(), (dkrx) this.a.b.b(), (dkib) this.a.l.b());
            case 13:
                dkib dkibVar = (dkib) ((dipk) this.a.a).bB.b();
                dkibVar.getClass();
                return dkibVar;
            case 14:
                dkrx dkrxVar2 = (dkrx) this.a.b.b();
                dips dipsVar = (dips) this.a.n.b();
                ctvb ctvbVar = (ctvb) this.a.j.b();
                dkib dkibVar2 = (dkib) this.a.l.b();
                ExecutorService executorService = (ExecutorService) ((dipk) this.a.a).bx.b();
                executorService.getClass();
                return new dkhx(dkrxVar2, dipsVar, ctvbVar, dkibVar2, executorService, (djkd) this.a.o.b());
            case 15:
                dips dipsVar2 = (dips) ((dipk) this.a.a).bu.b();
                dipsVar2.getClass();
                return dipsVar2;
            case 16:
                return new djkd((Context) this.a.g.b());
            case 17:
                return new dkph((dikt) this.a.q.b());
            case 18:
                return this.a.a.k();
            case 19:
                dkmv dkmvVar = (dkmv) ((dipk) this.a.a).bN.b();
                dkmvVar.getClass();
                return dkmvVar;
            case 20:
                return new FileTransferEngine((Context) this.a.g.b(), (dkrx) this.a.b.b(), (dkmv) this.a.s.b(), (dikt) this.a.q.b());
            case 21:
                return new ChatSessionEngine((Context) this.a.g.b(), (dkmv) this.a.s.b(), (dikt) this.a.q.b());
            case 22:
                return new LocationSharingEngine((Context) this.a.g.b(), (dkrx) this.a.b.b(), (dikt) this.a.q.b());
            case 23:
                dkpp r = this.a.a.r();
                r.getClass();
                return r;
            case 24:
                diyp diypVar = (diyp) ((dipk) this.a.a).bw.b();
                diypVar.getClass();
                return diypVar;
            case 25:
                diib diibVar = (diib) ((dipk) this.a.a).bD.b();
                diibVar.getClass();
                return diibVar;
            case 26:
                dkel p = this.a.a.p();
                p.getClass();
                return p;
            case 27:
                errm errmVar = (errm) ((dipk) this.a.a).bv.b();
                errmVar.getClass();
                return errmVar;
            case 28:
                Context context5 = (Context) this.a.g.b();
                dikt diktVar = (dikt) this.a.q.b();
                this.a.a.i().getClass();
                return new diog(context5, diktVar);
            case 29:
                return new djtt();
            case 30:
                dipg dipgVar = (dipg) ((dipk) this.a.a).bz.b();
                dipgVar.getClass();
                return dipgVar;
            case 31:
                return new ditk((dipa) this.a.i.b());
            case 32:
                djjc m2 = this.a.a.m();
                m2.getClass();
                return m2;
            case 33:
                eeft eeftVar = (eeft) ((dipk) this.a.a).bK.b();
                eeftVar.getClass();
                return eeftVar;
            case 34:
                djqt djqtVar = (djqt) ((dipk) this.a.a).bC.b();
                djqtVar.getClass();
                return djqtVar;
            case 35:
                return new dkly((dkhx) this.a.p.b(), (dkib) this.a.l.b());
            case 36:
                dkcp dkcpVar = (dkcp) ((dipk) this.a.a).bj.b();
                dkcpVar.getClass();
                return dkcpVar;
            case 37:
                return new dkga();
            case 38:
                return this.a.a.n();
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return new eehz();
            case 40:
                dkrp dkrpVar = (dkrp) ((dipk) this.a.a).bO.b();
                dkrpVar.getClass();
                return dkrpVar;
            case 41:
                return new SignupEngine();
            case 42:
                djix djixVar = (djix) ((dipk) this.a.a).aG.b();
                djixVar.getClass();
                return djixVar;
            case 43:
                dksa s2 = this.a.a.s();
                s2.getClass();
                return new djck(s2, (errl) this.a.d.b(), (djct) this.a.X.b());
            case 44:
                Context context6 = (Context) this.a.g.b();
                Executor executor = (Executor) this.a.d.b();
                djgk djgkVar = (djgk) this.a.R.b();
                dlpw dlpwVar = (dlpw) this.a.Q.b();
                eikl eiklVar = new eikl();
                errl errlVar2 = (errl) this.a.d.b();
                ctvb ctvbVar2 = (ctvb) this.a.j.b();
                dkgw dkgwVar3 = (dkgw) this.a.e.b();
                eehz eehzVar = (eehz) this.a.M.b();
                dipa dipaVar2 = (dipa) this.a.i.b();
                dkqg dkqgVar6 = this.a;
                fbbf fbbfVar18 = dkqgVar6.V;
                djgt c = dkqgVar6.c();
                djcs djcsVar = (djcs) fbbfVar18.b();
                dkqg dkqgVar7 = this.a;
                return new djct(context6, executor, djgkVar, dlpwVar, eiklVar, errlVar2, ctvbVar2, dkgwVar3, eehzVar, dipaVar2, c, djcsVar, dkqgVar7.b(), (djhc) dkqgVar7.W.b(), (clpn) this.a.U.b(), (errm) this.a.A.b());
            case 45:
                return new djgk((dlpw) this.a.Q.b());
            case 46:
                dlpw dlpwVar2 = (dlpw) ((dipk) this.a.a).br.b();
                dlpwVar2.getClass();
                return dlpwVar2;
            case 47:
                Context context7 = (Context) this.a.g.b();
                Executor executor2 = (Executor) this.a.d.b();
                djgk djgkVar2 = (djgk) this.a.R.b();
                djgj djgjVar = (djgj) this.a.T.b();
                dlpw dlpwVar3 = (dlpw) this.a.Q.b();
                eikl eiklVar2 = new eikl();
                errl errlVar3 = (errl) this.a.d.b();
                ctvb ctvbVar3 = (ctvb) this.a.j.b();
                dkgw dkgwVar4 = (dkgw) this.a.e.b();
                eehz eehzVar2 = (eehz) this.a.M.b();
                dipa dipaVar3 = (dipa) this.a.i.b();
                dkqg dkqgVar8 = this.a;
                return new djcs(context7, executor2, djgkVar2, djgjVar, dlpwVar3, eiklVar2, errlVar3, ctvbVar3, dkgwVar4, eehzVar2, dipaVar3, dkqgVar8.c(), (clpn) dkqgVar8.U.b(), (errm) this.a.A.b());
            case 48:
                return new djgj();
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                clpn clpnVar = (clpn) ((dipk) this.a.a).bY.b();
                clpnVar.getClass();
                return clpnVar;
            case 50:
                dkqg dkqgVar9 = this.a;
                return new djhc(dkqgVar9.c(), new djha(new djgs((dkcp) dkqgVar9.J.b())));
            case 51:
                return new dkpf();
            case 52:
                return new dkxc(this.a.ad);
            case 53:
                dkqg dkqgVar10 = this.a;
                return new dkwz(dkqgVar10.aa, dkqgVar10.ac);
            case 54:
                dkwo dkwoVar = (dkwo) ((dipk) this.a.a).bQ.b();
                dkwoVar.getClass();
                return dkwoVar;
            case 55:
                dkqg dkqgVar11 = this.a;
                return new dkxe(dkqgVar11.n(), dkqgVar11.ab, dkqgVar11.aa);
            case 56:
                return new dkxd(this.a.aa);
            case 57:
                return new dkou(this.a.ak);
            case 58:
                dkqg dkqgVar12 = this.a;
                return new dkot(dkqgVar12.aa, dkqgVar12.aj);
            case 59:
                dkqg dkqgVar13 = this.a;
                return new dkov(dkqgVar13.aa, dkqgVar13.af, dkqgVar13.ai);
            case 60:
                return new dkyb(this.a.aa);
            case 61:
                dkqg dkqgVar14 = this.a;
                return new dkxl(dkqgVar14.ag, dkqgVar14.ah);
            case 62:
                return new dkxn(this.a.aa);
            case 63:
                return new dkxr(this.a.aa);
            case 64:
                return new djav((dkou) this.a.al.b());
            case 65:
                return new dkyp(this.a.ap);
            case 66:
                return new dkyo(this.a.ao);
            case 67:
                return new dkyr(this.a.an);
            case 68:
                return new dkyn(this.a.aa);
            case 69:
                Context context8 = (Context) this.a.g.b();
                djix djixVar2 = (djix) this.a.P.b();
                dkpp dkppVar = (dkpp) this.a.w.b();
                errl errlVar4 = (errl) this.a.d.b();
                dijt i2 = this.a.a.i();
                i2.getClass();
                return new dikx(context8, djixVar2, dkppVar, errlVar4, i2);
            case 70:
                return new dila();
            case 71:
                return new djky();
            case 72:
                return aogg.a(enpd.a);
            case 73:
                dkqg dkqgVar15 = this.a;
                fbbf fbbfVar19 = dkqgVar15.aE;
                dirv a18 = dkqgVar15.a();
                disq disqVar = (disq) fbbfVar19.b();
                final dirh dirhVar = new dirh();
                return a18.a(disqVar, dirhVar, dirhVar, new ffbr() { // from class: dirr
                    @Override // defpackage.ffbr, defpackage.ffbq
                    public final Object b() {
                        dkty.d(new dktn("FileTransferModule"), "getting download digest based HttpRequestExecutor", new Object[0]);
                        return dirh.this;
                    }
                }, new ffbr() { // from class: dirs
                    @Override // defpackage.ffbr, defpackage.ffbq
                    public final Object b() {
                        dkty.d(new dktn("FileTransferModule"), "getting upload digest based HttpRequestExecutor", new Object[0]);
                        return dirh.this;
                    }
                }, new dirk(this.a.m()));
            case 74:
                dkqg dkqgVar16 = this.a;
                return new dirz(dkqgVar16.g, dkqgVar16.n, dkqgVar16.H, dkqgVar16.av, dkqgVar16.aw, dkqgVar16.ax);
            case 75:
                return new diqe();
            case 76:
                eefj eefjVar = (eefj) ((dipk) this.a.a).bM.b();
                eefjVar.getClass();
                return eefjVar;
            case 77:
                return new diwz() { // from class: divh
                };
            case 78:
                dkqg dkqgVar17 = this.a;
                return new dirm(dkqgVar17.g, dkqgVar17.n, dkqgVar17.H, dkqgVar17.av, dkqgVar17.ax);
            case 79:
                eefk eefkVar = (eefk) ((dipk) this.a.a).bL.b();
                eefkVar.getClass();
                return eefkVar;
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                dkqg dkqgVar18 = this.a;
                return new diuj(dkqgVar18.g, dkqgVar18.n, dkqgVar18.av, dkqgVar18.ax);
            case 81:
                Context context9 = (Context) this.a.g.b();
                djix djixVar3 = (djix) this.a.P.b();
                dkpp dkppVar2 = (dkpp) this.a.w.b();
                errl errlVar5 = (errl) this.a.d.b();
                dijt i3 = this.a.a.i();
                i3.getClass();
                return new dijz(context9, djixVar3, dkppVar2, errlVar5, i3);
            case 82:
                final dirj dirjVar = (dirj) this.a.aD.b();
                return new disq() { // from class: dirq
                    @Override // defpackage.disq
                    public final disp a(dijy dijyVar, disr disrVar) {
                        return dirj.this.a();
                    }
                };
            case 83:
                return new dirj(this.a.az);
            case 84:
                Context context10 = (Context) this.a.g.b();
                dkrx dkrxVar3 = (dkrx) this.a.b.b();
                djqt djqtVar2 = (djqt) this.a.H.b();
                dkxc dkxcVar = (dkxc) this.a.ae.b();
                diom.b(context10);
                diom.a(context10);
                ditr.a(context10);
                return new diul(dkrxVar3, djqtVar2, dkxcVar);
            case 85:
                return new dkig((dkib) this.a.l.b());
            case 86:
                dkqg dkqgVar19 = this.a;
                fbbf fbbfVar20 = dkqgVar19.g;
                dkfd k2 = dkqgVar19.k();
                Context context11 = (Context) fbbfVar20.b();
                dkpp dkppVar3 = (dkpp) dkqgVar19.w.b();
                djjo djjoVar = new djjo((Context) dkqgVar19.g.b());
                dikt diktVar2 = (dikt) dkqgVar19.q.b();
                dikj j2 = dkqgVar19.a.j();
                j2.getClass();
                djlo djloVar = new djlo(context11, dkppVar3, djjoVar, diktVar2, j2, (errm) dkqgVar19.A.b(), (djky) dkqgVar19.at.b());
                diru diruVar2 = (diru) this.a.aN.b();
                dkqg dkqgVar20 = this.a;
                return k2.a(dkvg.SINGLE_REG, djloVar, diruVar2, new dkir((dkii) dkqgVar20.aI.b(), (dikt) dkqgVar20.q.b()));
            case 87:
                dkqg dkqgVar21 = this.a;
                fbbf fbbfVar21 = dkqgVar21.aL;
                dirv a19 = dkqgVar21.a();
                disq disqVar2 = (disq) fbbfVar21.b();
                final dirh dirhVar2 = new dirh();
                dkqg dkqgVar22 = this.a;
                final disj disjVar = new disj(dkqgVar22.aM, dkqgVar22.d, dkqgVar22.ax);
                disy disyVar = new disy(dkqgVar22.m());
                ffbr ffbrVar = new ffbr() { // from class: dirn
                    @Override // defpackage.ffbr, defpackage.ffbq
                    public final Object b() {
                        dkty.l(new dktn("FileTransferModule"), "initializing download %s HttpRequestExecutorFactory", true != dizg.I() ? "Digest" : "GbaBased");
                        return dizg.I() ? disj.this : dirhVar2;
                    }
                };
                ffbr ffbrVar2 = new ffbr() { // from class: diro
                    @Override // defpackage.ffbr, defpackage.ffbq
                    public final Object b() {
                        dkty.l(new dktn("FileTransferModule"), "initializing upload %s HttpRequestExecutorFactory", true != dizg.H() ? "Digest" : "GbaBased");
                        return dizg.H() ? disj.this : dirhVar2;
                    }
                };
                return a19.a(disqVar2, (diss) ffbrVar.b(), (diss) ffbrVar2.b(), ffbrVar, ffbrVar2, disyVar);
            case 88:
                dkqg dkqgVar23 = this.a;
                final fbbf fbbfVar22 = dkqgVar23.aK;
                final fbbf fbbfVar23 = dkqgVar23.aD;
                return new disq() { // from class: dirp
                    @Override // defpackage.disq
                    public final disp a(dijy dijyVar, disr disrVar) {
                        if (!dizg.I() && ((!((Boolean) dizg.o().a.K.a()).booleanValue() || dizg.o().L()) && (!((Boolean) dizg.o().a.M.a()).booleanValue() || dizg.o().L()))) {
                            return ((dirj) fbbfVar23.b()).a();
                        }
                        disx disxVar = (disx) ffbr.this.b();
                        return new disw((errl) disxVar.b.b(), disxVar.c, dijyVar, disrVar);
                    }
                };
            case 89:
                dkqg dkqgVar24 = this.a;
                return new disx(dkqgVar24.aw, dkqgVar24.d, dkqgVar24.ax);
            case 90:
                Context context12 = (Context) this.a.g.b();
                errl errlVar6 = (errl) this.a.d.b();
                dkqg dkqgVar25 = this.a;
                return new disn(dkvt.g(context12), errlVar6, new disz((Context) dkqgVar25.g.b(), (dikt) dkqgVar25.q.b()), disa.b);
            case 91:
                return new ImsConnectionTrackerEngine((Context) this.a.g.b(), this.a.S);
            case 92:
                return new TransportControlEngine((dket) this.a.S.b(), (dkpp) this.a.w.b());
            case 93:
                return new SingleRegistrationVendorImsController((dkpm) this.a.c.b(), (djqw) this.a.aY.b());
            case 94:
                dkqg dkqgVar26 = this.a;
                return new djrh(dkqgVar26.aV, dkqgVar26.aW, dkqgVar26.J);
            case 95:
                dkqg dkqgVar27 = this.a;
                return new djrd(dkqgVar27.g, dkqgVar27.J, dkqgVar27.aR, dkqgVar27.aS, dkqgVar27.aU);
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                return this.a.a.o();
            case 97:
                djvk djvkVar = (djvk) ((dipk) this.a.a).bt.b();
                djvkVar.getClass();
                return djvkVar;
            case 98:
                return new djrf((Context) this.a.g.b(), (dikt) this.a.q.b());
            case 99:
                return new djqu() { // from class: djqx
                    @Override // defpackage.djqu
                    public final ProvisioningManager a(int i4) {
                        try {
                            return ProvisioningManager.createForSubscriptionId(i4);
                        } catch (IllegalArgumentException e2) {
                            throw new ImsException("Invalid subscription id.", 3, e2);
                        }
                    }
                };
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final Object b() {
        int i = this.b;
        if (i / 100 == 0) {
            return a();
        }
        switch (i) {
            case VCardConstants.DEFAULT_PREF /* 100 */:
                return new ContactsManager((Context) this.a.g.b(), (dkhx) this.a.p.b());
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                Context context = (Context) this.a.g.b();
                dkrx dkrxVar = (dkrx) this.a.b.b();
                ctvb ctvbVar = (ctvb) this.a.j.b();
                dked dkedVar = (dked) ((dipk) this.a.a).aF.b();
                dkedVar.getClass();
                return new RcsProfileEngine(context, dkrxVar, ctvbVar, dkedVar, (dkcp) this.a.J.b());
            case 102:
                errl errlVar = (errl) this.a.d.b();
                dkqg dkqgVar = this.a;
                djgj djgjVar = (djgj) dkqgVar.T.b();
                dkqg dkqgVar2 = this.a;
                fbbf fbbfVar = dkqgVar2.ar;
                djil h = dkqgVar2.h();
                djhl e = dkqgVar2.e();
                djhi d = dkqgVar2.d();
                djif g = dkqgVar2.g();
                djir j = dkqgVar2.j();
                djio i2 = dkqgVar2.i();
                dikx dikxVar = (dikx) fbbfVar.b();
                djfx djfxVar = (djfx) this.a.be.b();
                return new MessagingEngine(errlVar, dkqgVar.R, djgjVar, h, e, d, g, j, i2, dkqgVar2.bh, dikxVar, djfxVar);
            case 103:
                return new eima();
            case 104:
                return new eing();
            case 105:
                return new djfx();
            case 106:
                return new eine();
            case 107:
                Context context2 = (Context) this.a.g.b();
                Executor executor = (Executor) this.a.d.b();
                dlpw dlpwVar = (dlpw) this.a.Q.b();
                errl errlVar2 = (errl) this.a.d.b();
                eeft eeftVar = (eeft) this.a.G.b();
                eehz eehzVar = (eehz) this.a.M.b();
                dkib dkibVar = (dkib) this.a.l.b();
                dkqg dkqgVar3 = this.a;
                fbbf fbbfVar2 = dkqgVar3.e;
                djgt c = dkqgVar3.c();
                dkgw dkgwVar = (dkgw) fbbfVar2.b();
                djix djixVar = (djix) this.a.P.b();
                ctvb ctvbVar2 = (ctvb) this.a.j.b();
                djcs djcsVar = (djcs) this.a.V.b();
                errm errmVar = (errm) this.a.A.b();
                dkqg dkqgVar4 = this.a;
                djcq b = dkqgVar4.b();
                djcn djcnVar = new djcn(dkqgVar4.bg);
                dkrp dkrpVar = (dkrp) dkqgVar4.N.b();
                dkpp dkppVar = (dkpp) this.a.w.b();
                dkcp dkcpVar = (dkcp) this.a.J.b();
                djhc djhcVar = (djhc) this.a.W.b();
                return new djcu(context2, executor, dlpwVar, errlVar2, eeftVar, eehzVar, dkibVar, c, dkgwVar, djixVar, ctvbVar2, djcsVar, errmVar, b, djcnVar, dkrpVar, dkppVar, dkcpVar, djhcVar, new djey());
            case 108:
                return new djfw();
            case 109:
                return new BusinessInfoEngine((Context) this.a.g.b(), (diib) this.a.y.b());
            case 110:
                return new dkpe();
            case 111:
                Context context3 = (Context) this.a.g.b();
                dkqg dkqgVar5 = this.a;
                return new diuk(context3, dkqgVar5.c, dkqgVar5.S, dkqgVar5.b, dkqgVar5.bl);
            case 112:
                return (dkdw) ((dipk) this.a.a).bg.b();
            case 113:
                final Context context4 = (Context) this.a.g.b();
                final djqt djqtVar = (djqt) this.a.H.b();
                final dkrx dkrxVar2 = (dkrx) this.a.b.b();
                final dket dketVar = (dket) this.a.S.b();
                return new dipr() { // from class: dipq
                    @Override // defpackage.dipr
                    public final void a() {
                        Context context5 = context4;
                        dket dketVar2 = dketVar;
                        djqt djqtVar2 = djqtVar;
                        dkrx dkrxVar3 = dkrxVar2;
                        try {
                            if (Build.VERSION.SDK_INT == 28) {
                                dfwe.a = 32;
                            }
                            diom.b(context5);
                            diom.a(context5);
                            ditr.a(context5);
                            String d2 = djqtVar2.d();
                            csix.f(TextUtils.isEmpty(d2));
                            if (TextUtils.isEmpty(d2)) {
                                throw new IllegalArgumentException("Cannot create directory, invalid empty path");
                            }
                            File file = new File(d2);
                            try {
                                if (!file.exists()) {
                                    file.mkdirs();
                                }
                                DebugOptionsReceiver.a(context5, dketVar2, dkrxVar3);
                                dkqa.a(context5, dketVar2);
                                deuu deuuVar = dkrq.a;
                                deuu.a(context5);
                            } catch (SecurityException unused) {
                                throw new IllegalStateException("Attempted create directory without permissions");
                            }
                        } catch (Exception e2) {
                            dkty.i(e2, "Failed to properly initialize JibeService", new Object[0]);
                        }
                    }
                };
            case 114:
                return new dkqb();
            case 115:
                return new eink((Context) this.a.g.b());
            case 116:
                return new einj();
            case 117:
                return new eimb((Context) this.a.g.b());
            case 118:
                return new eiky((Context) this.a.g.b());
            case 119:
                return new eini((Context) this.a.g.b());
            case 120:
                return new einn((Context) this.a.g.b());
            case 121:
                return new einm((Context) this.a.g.b());
            default:
                throw new AssertionError(i);
        }
    }
}
