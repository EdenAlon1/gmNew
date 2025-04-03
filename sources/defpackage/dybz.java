package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dybz implements fbba {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v46, types: [dxwr, java.lang.Object] */
    public static dwub a(Context context, errl errlVar, engw engwVar, dwxk dwxkVar, efbm efbmVar, dxxg dxxgVar, emxc emxcVar, emyl emylVar, emxc emxcVar2, dwxo dwxoVar, dxwx dxwxVar, dwxf dwxfVar, efgc efgcVar, emxc emxcVar3, emxc emxcVar4, dwqy dwqyVar, emxc emxcVar5, emxc emxcVar6) {
        dxsy dxtyVar;
        final dwuf dwufVar = new dwuf();
        dwufVar.b = context.getApplicationContext();
        errlVar.getClass();
        dwufVar.c = errlVar;
        dwufVar.d.addAll(engwVar);
        dwufVar.e = emxc.i(dwxkVar);
        dwufVar.f = efbmVar;
        dwufVar.g = dxxgVar;
        dwufVar.h = emxcVar;
        dwufVar.i = emys.a(emylVar);
        dwufVar.k = emxcVar2;
        dwufVar.l = emxc.j(dwxoVar);
        dwufVar.m = emxc.j(dxwxVar);
        dwufVar.n = emxc.j(dwxfVar);
        dwufVar.o = emxcVar3;
        dwufVar.p = emxc.j(dxbs.class);
        dwufVar.j = efgcVar;
        dwufVar.v = emxcVar4;
        dwufVar.q = emxc.j(dwqyVar);
        dwufVar.s = emxcVar5;
        dwufVar.t = emxcVar6;
        dwufVar.b.getClass();
        dwufVar.e.getClass();
        dwufVar.f.getClass();
        dwufVar.j.getClass();
        dwufVar.g.getClass();
        dwufVar.h.getClass();
        dwufVar.i.getClass();
        dwufVar.s.getClass();
        ersb ersbVar = new ersb(dwufVar.c);
        if (dwufVar.l.g()) {
            elfr.l(elfr.i(new erog() { // from class: dwuc
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    dwxo dwxoVar2 = (dwxo) dwuf.this.l.c();
                    Context context2 = dwxoVar2.a;
                    String concat = context2.getPackageName().equals("com.google.android.gms") ? "com.google.android.gms.icing.mdd" : "com.google.android.gms.icing.mdd#".concat(String.valueOf(context2.getPackageName()));
                    Context context3 = dwxoVar2.a;
                    dfqt dfqtVar = dhkk.a;
                    return duin.a(new dhlf(context3).n(concat));
                }
            }, ersbVar), new dwud(), erpp.a);
        }
        dwufVar.a.a = new dxqd(dwufVar.b);
        dxqf dxqfVar = dwufVar.a;
        dxqfVar.c = new dxqk(ersbVar, dwufVar.c);
        dxqfVar.b = new dxqh(dwufVar.k, dwufVar.i);
        dwqy dwqyVar2 = (dwqy) dwufVar.q.e(new dwue());
        if (dwufVar.m.g()) {
            dxtyVar = new dxtu(dwufVar.b, (dxwx) dwufVar.m.c(), new dxtf(dwqyVar2, emxr.a), dwqyVar2);
        } else {
            dxtyVar = new dxty();
        }
        dwufVar.r = emxc.j(new dwxm(dwufVar.b));
        dxqf dxqfVar2 = dwufVar.a;
        dxsy dxsyVar = dxtyVar;
        dxqfVar2.d = new dxqo(dwufVar.f, dwufVar.g, dxsyVar, dwufVar.h, dwufVar.n, dwufVar.o, dwufVar.v, dwufVar.r, dwqyVar2, dwufVar.t, dwufVar.u);
        dxqfVar2.e = new dxri(dwufVar.c, dwufVar.j);
        fbbe.a(dxqfVar2.a, dxqd.class);
        fbbe.a(dxqfVar2.b, dxqh.class);
        fbbe.a(dxqfVar2.c, dxqk.class);
        fbbe.a(dxqfVar2.d, dxqo.class);
        fbbe.a(dxqfVar2.e, dxri.class);
        dxqd dxqdVar = dxqfVar2.a;
        dxqh dxqhVar = dxqfVar2.b;
        dxqk dxqkVar = dxqfVar2.c;
        dxqo dxqoVar = dxqfVar2.d;
        dxri dxriVar = dxqfVar2.e;
        fbbf c = fbaz.c(new dxqx(dxqoVar));
        fbbf c2 = fbaz.c(new dxrh(dxqoVar));
        dxqe dxqeVar = new dxqe(dxqdVar);
        fbbf c3 = fbaz.c(new dxra(dxqoVar));
        fbbf c4 = fbaz.c(new dxqz(dxqoVar));
        dxpx dxpxVar = new dxpx(dxqeVar, c2, c3, c4);
        fbbf c5 = fbaz.c(new dxrr(dxqeVar, c3));
        fbbf c6 = fbaz.c(new dxrf(dxqoVar));
        dxni dxniVar = new dxni(c4);
        fbbf c7 = fbaz.c(new dxrm(dxriVar, dxqeVar, c5, c6, c, dxniVar, c3));
        fbbf c8 = fbaz.c(new dxqm(dxqkVar));
        fbbf c9 = fbaz.c(new dxqv(dxqeVar, c2, c7, c8, c4));
        fbbf c10 = fbaz.c(new dxrq(dxqeVar, c3));
        fbbf c11 = fbaz.c(new dxrd(new dxki(dxqeVar, c, dxpxVar, c9, fbaz.c(new dxqt(dxqeVar, c2, fbaz.c(new dxrk(dxriVar, dxqeVar, c10, c6, c, dxniVar, c3)), c8, c4)), c5, c10, dxniVar, c6, c8, c4)));
        fbbf c12 = fbaz.c(new dxqj(dxqhVar));
        fbbf c13 = fbaz.c(new dxrc(dxqoVar));
        fbbf c14 = fbaz.c(new dxqw(dxqoVar));
        fbbf c15 = fbaz.c(new dxrp(dxriVar, dxqeVar, c3));
        fbbf c16 = fbaz.c(new dxrg(fbaz.c(dxqq.a)));
        fbbf c17 = fbaz.c(new dxrb(c15, c16, c8));
        fbbf c18 = fbaz.c(new dxqi(dxqhVar));
        dxpu dxpuVar = new dxpu(dxqeVar, c16, c2, c3, c8);
        fbbf c19 = fbaz.c(new dxro(dxqeVar, c3));
        fbbf c20 = fbaz.c(new dxqu(dxqeVar, c16, c2, fbaz.c(new dxrl(dxriVar, dxqeVar, c19, c6, c, dxniVar, c3)), c8));
        fbbf c21 = fbaz.c(new dxrn(dxqeVar, c3));
        fbbf c22 = fbaz.c(new dxqy(new dxjl(c, dxpuVar, c20, fbaz.c(new dxqs(dxqeVar, c16, c2, fbaz.c(new dxrj(dxriVar, dxqeVar, c21, c6, c, dxniVar, c3)), c8, c4)), c19, c21, dxniVar, c6, c8, c4)));
        fbbf c23 = fbaz.c(new dxqp(dxqoVar, dxqeVar));
        fbbf c24 = fbaz.c(new dxre(dxqoVar));
        fbbf c25 = fbaz.c(new dxql(dxqkVar));
        if (dxsyVar instanceof dxtu) {
            ((dxtu) dxsyVar).b = emxc.j((dxti) c17.b());
        }
        dxwf dxwfVar = new dxwf();
        dxwfVar.b(dwufVar.b);
        dxwfVar.c(ersbVar);
        dxwfVar.e(dwufVar.i);
        if (dwufVar.h.g()) {
            dxwfVar.d(dwufVar.h.c());
        }
        if (dwufVar.p.g()) {
            dxwfVar.f((Class) dwufVar.p.c());
        }
        dxwg a = dxwfVar.a();
        Context context2 = dwufVar.b;
        dxsy dxsyVar2 = (dxsy) c.b();
        Context c26 = dxqe.c(dxqdVar);
        dxsy dxsyVar3 = (dxsy) c.b();
        dxpn b = dxqg.b(dxqdVar, dxqoVar, c, c2, c3, c4, c6, c8, c11, c12, c13, c14, c17, c18, c22);
        dxpq dxpqVar = (dxpq) c11.b();
        dxig c27 = dxqg.c(dxqdVar, dxqoVar, c, c2, c3, c4, c6, c8, c11, c12, c13, c14, c16, c17, c18, c22, c23, c24, c25);
        dxih dxihVar = (dxih) c22.b();
        dxcu dxcuVar = new dxcu(dxqe.c(dxqdVar), (dxih) c22.b(), dxqg.b(dxqdVar, dxqoVar, c, c2, c3, c4, c6, c8, c11, c12, c13, c14, c17, c18, c22), (dxpq) c11.b(), (dxsy) c.b(), (dxbv) c16.b(), (efbm) c6.b(), (emxc) c3.b(), (dwxf) c2.b(), (Executor) c8.b(), (dwqy) c4.b());
        dwxf dwxfVar2 = (dwxf) c2.b();
        dxuw dxuwVar = new dxuw(dxqe.c(dxqdVar), (dxih) c22.b(), dxqg.b(dxqdVar, dxqoVar, c, c2, c3, c4, c6, c8, c11, c12, c13, c14, c17, c18, c22), (efbm) c6.b(), (dxsy) c.b(), (dwxf) c2.b(), (emxc) c3.b(), (Executor) c8.b());
        dxtd dxtdVar = new dxtd(dxqg.c(dxqdVar, dxqoVar, c, c2, c3, c4, c6, c8, c11, c12, c13, c14, c16, c17, c18, c22, c23, c24, c25), (dxih) c22.b(), (dxsy) c.b(), (Executor) c8.b());
        dxqe.c(dxqdVar);
        dxsy dxsyVar4 = (dxsy) c.b();
        dxtx dxtxVar = new dxtx(dxsyVar4, (dwqy) c4.b(), (dxti) c17.b());
        emxc emxcVar7 = (emxc) c3.b();
        Executor executor = (Executor) c8.b();
        emxc emxcVar8 = (emxc) c24.b();
        dwqy dwqyVar3 = (dwqy) c4.b();
        dxti dxtiVar = (dxti) c17.b();
        dxqg.a(dxqoVar, c4, c8, c22);
        return new dwxa(context2, dxsyVar2, new dxmi(c26, dxsyVar3, b, dxpqVar, c27, dxihVar, dxcuVar, dwxfVar2, dxuwVar, dxtdVar, dxtxVar, emxcVar7, executor, emxcVar8, dwqyVar3, dxtiVar), ersbVar, dwufVar.d, dwufVar.e, dwufVar.f, dwufVar.h, dwufVar.p, dwqyVar2, a, (dxbv) c16.b());
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
