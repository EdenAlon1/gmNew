package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aiab implements ffjn {
    final /* synthetic */ aiba a;

    public aiab(aiba aibaVar) {
        this.a = aibaVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi d;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((edi) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            d = ebs.d(hvi.e, 1.0f);
            hvi e = ebs.e(d, 40.0f);
            final aiba aibaVar = this.a;
            int i = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, e);
            int i2 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a, iss.e);
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Object valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            String str = aibaVar.a;
            dyi dyiVar = dyi.a;
            hfdVar.v(-1714504606);
            jlj jljVar = new jlj((byte[]) null);
            jljVar.a(new jou(gft.a(hfdVar).a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            jljVar.i("load_text_tag", str);
            jljVar.f(str);
            jljVar.g();
            jljVar.b();
            jlm b2 = jljVar.b();
            hfdVar.o();
            jpo jpoVar = gft.d(hfdVar).m;
            hvi a3 = dyiVar.a(hvi.e, hum.e);
            hfdVar.v(812315437);
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = new dwn();
                hfdVar.y(f);
            }
            dwn dwnVar = (dwn) f;
            hfdVar.o();
            hfdVar.v(812318941);
            boolean D = hfdVar.D(aibaVar);
            Object f2 = hfdVar.f();
            if (D || f2 == hfc.a) {
                f2 = new ffix() { // from class: aiaa
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        aiba.this.b.invoke();
                        return ffcu.a;
                    }
                };
                hfdVar.y(f2);
            }
            hfdVar.o();
            grl.c(b2, dfb.c(a3, dwnVar, null, false, null, null, (ffix) f2, 28), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, jpoVar, hfdVar, 0, 0, 131068);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
