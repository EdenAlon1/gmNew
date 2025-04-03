package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmmd implements ffjm {
    final /* synthetic */ dmms a;
    final /* synthetic */ dmpi b;
    final /* synthetic */ dmpg c;
    final /* synthetic */ float d;
    final /* synthetic */ int e;
    final /* synthetic */ ebq f;
    final /* synthetic */ hzi g;
    final /* synthetic */ ffji h;

    public dmmd(dmms dmmsVar, dmpi dmpiVar, dmpg dmpgVar, float f, int i, ebq ebqVar, hzi hziVar, ffji ffjiVar) {
        this.a = dmmsVar;
        this.b = dmpiVar;
        this.c = dmpgVar;
        this.d = f;
        this.e = i;
        this.f = ebqVar;
        this.g = hziVar;
        this.h = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        long j;
        hvi a;
        long j2;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmms dmmsVar = this.a;
            jpo jpoVar = gft.d(hfdVar).j;
            if (this.b.e) {
                hfdVar.v(-1300719715);
                dmpg dmpgVar = this.c;
                float f = this.d;
                hfdVar.v(-351555844);
                if (dmpgVar != dmpg.c || f <= 0.5f) {
                    hfdVar.v(164914256);
                    j = gft.a(hfdVar).q;
                    hfdVar.o();
                } else {
                    hfdVar.v(164835795);
                    j = dooy.e(hfdVar).p;
                    hfdVar.o();
                }
                hfdVar.o();
                hfdVar.o();
            } else {
                hfdVar.v(-1300619368);
                j = gft.a(hfdVar).q;
                hfdVar.o();
            }
            jpo b = dops.b(jpo.y(jpoVar, j, 0L, null, null, null, null, 0L, null, 0, this.e, 0L, null, null, 0, 16711678), hfdVar);
            a = this.f.a(hvi.e, 1.0f, true);
            if (!this.a.a.g.b) {
                a = a.a(cry.b(hvi.e));
            }
            hvi a2 = hyj.a(jfw.a(hzk.a(a, this.g), "Compose:Draft:Text"), this.h);
            euw euwVar = new euw(3, null, 0, true != this.a.a.g.c ? -1 : 4, 118);
            hfdVar.v(1620635393);
            boolean D = hfdVar.D(this.a);
            final dmms dmmsVar2 = this.a;
            Object f2 = hfdVar.f();
            if (D || f2 == hfc.a) {
                f2 = new ffji() { // from class: dmmc
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        ((euu) obj3).getClass();
                        dmms.this.d.b.invoke();
                        return ffcu.a;
                    }
                };
                hfdVar.y(f2);
            }
            hfdVar.o();
            euv euvVar = new euv(null, null, null, (ffji) f2, 31);
            hfdVar.v(1971128241);
            float f3 = true != ((Boolean) dooy.b(hfdVar).i.invoke()).booleanValue() ? 8.0f : 12.0f;
            hfdVar.o();
            float a3 = dmkx.a(hfdVar);
            hfdVar.v(1620643878);
            float f4 = this.a.f.a ? Float.NaN : (float) (((Configuration) hfdVar.e(AndroidCompositionLocals_androidKt.a)).screenHeightDp * 0.25d);
            hfdVar.o();
            dmms dmmsVar3 = this.a;
            int i = true == dmmsVar3.f.a ? 12 : 4;
            if (this.b.e) {
                hfdVar.v(-1299086046);
                dmpg dmpgVar2 = this.c;
                float f5 = this.d;
                hfdVar.v(-340327303);
                if (dmpgVar2 != dmpg.c || f5 <= 0.5f) {
                    hfdVar.v(1883604440);
                    j2 = gft.a(hfdVar).s;
                    hfdVar.o();
                } else {
                    hfdVar.v(1883512308);
                    j2 = dooy.e(hfdVar).F;
                    hfdVar.o();
                }
                hfdVar.o();
                hfdVar.o();
            } else {
                hfdVar.v(-1298990411);
                j2 = gft.a(hfdVar).s;
                hfdVar.o();
            }
            dmmp dmmpVar = dmmsVar3.a;
            dmmp dmmpVar2 = dmmsVar.a;
            dsjx dsjxVar = new dsjx(dmmpVar.c, j2);
            dmpi dmpiVar = this.b;
            float f6 = f3;
            dsjw.a(dmmpVar2.a, new Void[0], dmmpVar2.b, a2, b, euwVar, euvVar, f6, a3, f4, Integer.valueOf(i), dmmpVar.d, dmmpVar.e, dmmpVar.g.a, dsjxVar, dmpiVar.c, hfdVar, 0, 0);
        }
        return ffcu.a;
    }
}
