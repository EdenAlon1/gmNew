package defpackage;

import android.app.Application;
import android.content.Context;
import defpackage.eiue;
import j$.util.Optional;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aklv implements fbbf {
    public final akis a;
    public final aklw b;
    private final akgg c;
    private final int d;

    public aklv(akis akisVar, akgg akggVar, aklw aklwVar, int i) {
        this.a = akisVar;
        this.c = akggVar;
        this.b = aklwVar;
        this.d = i;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final Object b() {
        eful efulVar;
        switch (this.d) {
            case 0:
                aklw aklwVar = this.b;
                return new eiue.a(aklwVar.a, aklwVar.e);
            case 1:
                aklw aklwVar2 = this.b;
                return new svj(new sxb(aklwVar2.j), (svs) aklwVar2.i.b());
            case 2:
                aklw aklwVar3 = this.b;
                return new sxa(aklwVar3.g, aklwVar3.h, aklwVar3.i);
            case 3:
                ffhd ffhdVar = (ffhd) this.a.cn.b();
                akkp akkpVar = this.b.c.a;
                return new svr(ffhdVar, new bcxj(akkpVar.fx, akkpVar.Z));
            case 4:
                akis akisVar = this.a;
                return new swu(akisVar.co, akisVar.a.ip, akisVar.gH, akisVar.aJ);
            case 5:
                return new svs((ecrj) this.a.cN.b(), (ecnx) this.a.fC.b());
            case 6:
                return new dptq((dptc) this.b.v.b(), (ffsk) this.b.n.b());
            case 7:
                return new akls(this);
            case 8:
                return new dtcg((ffsk) this.a.a.p.b());
            case 9:
                aklw aklwVar4 = this.b;
                ulh ulhVar = new ulh((Context) aklwVar4.c.q.b(), (ffhd) aklwVar4.c.co.b());
                dpqp dpqpVar = (dpqp) this.b.s.b();
                akis akisVar2 = this.a;
                akko akkoVar = akisVar2.b;
                return ujp.a(ulhVar, dpqpVar, akkoVar.mm, akisVar2.cN, akkoVar.mn);
            case 10:
                return new aklt(this);
            case 11:
                return ejrx.a((ffhd) this.b.m.b(), this.b.b);
            case 12:
                akis akisVar3 = this.a;
                ejqy er = akisVar3.er();
                errm errmVar = (errm) akisVar3.a.m.b();
                ffhd ffhdVar2 = (ffhd) this.a.a.rZ.b();
                akis akisVar4 = this.a;
                return ejro.a(er, errmVar, ffhdVar2, (emxc) ((fbbb) akisVar4.i).a, emxc.j(fbaz.a(akisVar4.b.lt)));
            case 13:
                return new dpvo((cbo) this.b.o.b());
            case 14:
                return dpru.a((Context) this.a.q.b());
            case 15:
                return new aklu(this);
            case 16:
                return ujm.a((atbq) this.a.b.jL.b());
            case 17:
                aklw aklwVar5 = this.b;
                return new tzj(aklwVar5.a, aklwVar5.x, aklwVar5.y, aklwVar5.z, aklwVar5.A);
            case 18:
                return new tzs((ffhd) this.a.cn.b(), this.b.b());
            case 19:
                return new tzv((ffhd) this.a.cn.b(), (bctx) this.a.a.Fz.b(), this.b.b(), (bdfp) this.a.a.uM.b());
            case 20:
                return new uag((ffhd) this.a.cn.b(), this.b.b());
            case 21:
                return new uac((ffhd) this.a.cn.b(), new tzn(this.b.a()), (aqkp) this.c.f.b());
            case 22:
                aklw aklwVar6 = this.b;
                akis akisVar5 = this.a;
                akkp akkpVar2 = akisVar5.a;
                return new wge(aklwVar6.a, akkpVar2.ej, akisVar5.b.ck, akkpVar2.iz, (cfyt) akkpVar2.cf.b(), (ffsk) this.a.a.q.b(), this.b.C, (alse) this.a.he.b());
            case 23:
                akkp akkpVar3 = this.a.a;
                return new cluo(akkpVar3.az, akkpVar3.f);
            case 24:
                return new aenx();
            case 25:
                return new eixb(this.b.a);
            case 26:
                ffsk ffskVar = (ffsk) this.b.n.b();
                aklw aklwVar7 = this.b;
                return new dbjv(ffskVar, new dbjh(new dbja((ffhd) aklwVar7.c.cP.b(), (dbjc) aklwVar7.c.b.iS.b()), new dblm((dtve) aklwVar7.c.a.cD.b(), (Context) aklwVar7.c.q.b(), (ffhd) aklwVar7.c.cP.b())), (dbjc) this.a.b.iS.b(), (ffhd) this.a.cP.b(), (cavj) this.a.a.SN.b());
            case 27:
                akis akisVar6 = this.a;
                Application a = fbao.a(akisVar6.c);
                akkp akkpVar4 = akisVar6.a;
                fbbf fbbfVar = akkpVar4.q;
                dqgr dqgrVar = (dqgr) akkpVar4.ul.b();
                akko akkoVar2 = this.a.b;
                return new emge(a, akisVar6.co, fbbfVar, akisVar6.b.qc, dqgrVar, akkoVar2.qe, akkoVar2.qd);
            case 28:
                return new ejmb(this.b.a, (Context) this.a.q.b(), (Executor) this.a.a.m.b());
            case 29:
                return new ahmi(this.a.a.ej);
            case 30:
                return new wok();
            case 31:
                return new ahqx();
            case 32:
                return new depk(this.b.N);
            case 33:
                Context context = (Context) this.a.q.b();
                deki dekiVar = (deki) this.c.bW.b();
                aklw aklwVar8 = this.b;
                depd depdVar = new depd((deki) aklwVar8.d.bW.b(), (ffsk) aklwVar8.n.b());
                akis akisVar7 = this.a;
                akgg akggVar = this.c;
                aklw aklwVar9 = this.b;
                akko akkoVar3 = akisVar7.b;
                fbbf fbbfVar2 = akkoVar3.od;
                fbbf fbbfVar3 = akkoVar3.R;
                Optional empty = Optional.empty();
                ffsk ffskVar2 = (ffsk) aklwVar9.n.b();
                ffsk ffskVar3 = (ffsk) this.a.a.p.b();
                akis akisVar8 = this.a;
                fbbf fbbfVar4 = akggVar.bq;
                fbbf fbbfVar5 = aklwVar9.M;
                fbbf fbbfVar6 = akggVar.bp;
                fbbf fbbfVar7 = akggVar.br;
                fbbf fbbfVar8 = akggVar.c;
                fbbf fbbfVar9 = akggVar.f;
                akko akkoVar4 = akisVar8.b;
                return new deny(context, dekiVar, depdVar, fbbfVar2, fbbfVar4, fbbfVar5, fbbfVar6, fbbfVar7, fbbfVar3, fbbfVar8, empty, fbbfVar9, ffskVar2, ffskVar3, akkoVar4.lu, akkoVar4.jO, akkoVar4.lv, akkoVar4.lw, akkoVar4.lx, akkoVar4.ly);
            case 34:
                akko akkoVar5 = this.a.b;
                return new delm(akkoVar5.hf, akkoVar5.hg);
            case 35:
                ffhd ffhdVar3 = (ffhd) this.a.co.b();
                ffhd ffhdVar4 = (ffhd) this.a.cP.b();
                ffsk ffskVar4 = (ffsk) this.b.n.b();
                akko akkoVar6 = this.a.b;
                egsk egscVar = new egsc((ejvb) akkoVar6.a.dy.b(), (eixo) akkoVar6.a.a.as.b(), (ejar) akkoVar6.a.a.au.b(), akkoVar6.cW());
                egsm cW = akkoVar6.cW();
                if (true != akkoVar6.dP().b()) {
                    egscVar = cW;
                }
                fawt fawtVar = new fawt(new favy(new favv(), null));
                Context context2 = (Context) akkoVar6.a.q.b();
                context2.getClass();
                efuf efufVar = new efuf(context2);
                Context context3 = (Context) akkoVar6.a.q.b();
                context3.getClass();
                efum efumVar = new efum(context3);
                Context context4 = (Context) akkoVar6.a.q.b();
                Context context5 = (Context) akkoVar6.a.q.b();
                context5.getClass();
                Object a2 = new efue(context5).b.a();
                a2.getClass();
                String str = (String) a2;
                if (ffkj.e(str, "")) {
                    efulVar = eful.a;
                } else {
                    eful efulVar2 = eful.a;
                    efulVar = (eful) Enum.valueOf(eful.class, str);
                }
                efulVar.getClass();
                String format = String.format(((eful) emxc.j(efulVar).e(eful.a)).d, Arrays.copyOf(new Object[]{"contactsui-pa"}, 1));
                format.getClass();
                euzy euzyVar = (euzy) akkoVar6.a.a.bx.b();
                evcf evcfVar = (evcf) akkoVar6.qg.b();
                ffhd ffhdVar5 = (ffhd) akkoVar6.a.cP.b();
                context4.getClass();
                euzyVar.getClass();
                evcfVar.getClass();
                ffhdVar5.getClass();
                efun efunVar = new efun(format, euzyVar, evcfVar, ffhdVar5);
                fapp fappVar = fapp.ANDROID_MESSAGES;
                fappVar.getClass();
                Context context6 = (Context) akkoVar6.a.q.b();
                context6.getClass();
                String d = crob.d(context6);
                d.getClass();
                ewjb ewjbVar = (ewjb) ewjg.a.createBuilder();
                ewjbVar.getClass();
                ewjc ewjcVar = (ewjc) ewjf.a.createBuilder();
                ewjcVar.getClass();
                ewjcVar.copyOnWrite();
                ewjf ewjfVar = (ewjf) ewjcVar.instance;
                ewjfVar.d = 1;
                ewjfVar.b |= 2;
                ewjcVar.copyOnWrite();
                ewjf ewjfVar2 = (ewjf) ewjcVar.instance;
                ewjfVar2.c = 7;
                ewjfVar2.b |= 1;
                ewjcVar.copyOnWrite();
                ewjf ewjfVar3 = (ewjf) ewjcVar.instance;
                ewjfVar3.b |= 4;
                ewjfVar3.e = d;
                ewjcVar.copyOnWrite();
                ewjf ewjfVar4 = (ewjf) ewjcVar.instance;
                ewjfVar4.f = fappVar.cJ;
                ewjfVar4.b |= 8;
                eyfy build = ewjcVar.build();
                build.getClass();
                ewjbVar.copyOnWrite();
                ewjg ewjgVar = (ewjg) ewjbVar.instance;
                ewjgVar.c = (ewjf) build;
                ewjgVar.b |= 1;
                eyfy build2 = ewjbVar.build();
                build2.getClass();
                ewjg ewjgVar2 = (ewjg) build2;
                ffhd ffhdVar6 = (ffhd) akkoVar6.a.cP.b();
                ffhd ffhdVar7 = (ffhd) akkoVar6.a.co.b();
                Context context7 = (Context) akkoVar6.a.q.b();
                context7.getClass();
                egsw egswVar = new egsw(egscVar, fawtVar, efufVar, efumVar, efunVar, ewjgVar2, ffhdVar6, ffhdVar7, new egsd(context7), akkoVar6.dP());
                Context context8 = (Context) this.a.b.a.q.b();
                context8.getClass();
                return new egub(ffhdVar3, ffhdVar4, ffskVar4, egswVar, new efug(context8));
            case 36:
                dlpw dlpwVar = (dlpw) this.a.l.b();
                akis akisVar9 = this.a;
                return new ejwn(dlpwVar, (ejvr) akisVar9.aR.b(), (Executor) akisVar9.a.m.b());
            default:
                return new cxln(new cxlc());
        }
    }
}
