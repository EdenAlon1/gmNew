package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyc {
    private static final cop a = e(true);
    private static final cop b = e(false);
    private static final ipn c;

    static {
        int i = huo.a;
        c = dyb.a;
    }

    public static final ipn a(huo huoVar, boolean z) {
        ipn ipnVar = (ipn) (z ? a : b).f(huoVar);
        return ipnVar == null ? new dyg(huoVar, z) : ipnVar;
    }

    public static final void b(hvi hviVar, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-211209833);
        if (i3 == 0) {
            i2 = (true != b2.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (b2.J((i2 & 3) != 2, i2 & 1)) {
            ipn ipnVar = c;
            int a2 = hey.a(b2);
            hvi b3 = huz.b(b2, hviVar);
            hfm hfmVar = (hfm) b2;
            hqb ai = hfmVar.ai();
            int i4 = ist.a;
            ffix ffixVar = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar);
            } else {
                b2.z();
            }
            hlc.b(b2, ipnVar, iss.e);
            hlc.b(b2, ai, iss.d);
            hlc.b(b2, b3, iss.c);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b2.h(valueOf, ffjmVar);
            }
            b2.n();
        } else {
            b2.s();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new dxz(hviVar, i);
        }
    }

    public static final void c(iqj iqjVar, iqk iqkVar, ipl iplVar, kah kahVar, int i, int i2, huo huoVar) {
        huo huoVar2;
        dxy f = f(iplVar);
        iqjVar.f(iqkVar, ((f == null || (huoVar2 = f.a) == null) ? huoVar : huoVar2).a((iqkVar.a << 32) | (iqkVar.b & 4294967295L), (i << 32) | (i2 & 4294967295L), kahVar), 0.0f);
    }

    public static final boolean d(ipl iplVar) {
        dxy f = f(iplVar);
        if (f != null) {
            return f.b;
        }
        return false;
    }

    private static final cop e(boolean z) {
        cop copVar = new cop(9);
        int i = huo.a;
        huo huoVar = hum.a;
        copVar.e(huoVar, new dyg(huoVar, z));
        huo huoVar2 = hum.b;
        copVar.e(huoVar2, new dyg(huoVar2, z));
        huo huoVar3 = hum.c;
        copVar.e(huoVar3, new dyg(huoVar3, z));
        huo huoVar4 = hum.d;
        copVar.e(huoVar4, new dyg(huoVar4, z));
        huo huoVar5 = hum.e;
        copVar.e(huoVar5, new dyg(huoVar5, z));
        huo huoVar6 = hum.f;
        copVar.e(huoVar6, new dyg(huoVar6, z));
        huo huoVar7 = hum.g;
        copVar.e(huoVar7, new dyg(huoVar7, z));
        huo huoVar8 = hum.h;
        copVar.e(huoVar8, new dyg(huoVar8, z));
        huo huoVar9 = hum.i;
        copVar.e(huoVar9, new dyg(huoVar9, z));
        return copVar;
    }

    private static final dxy f(ipl iplVar) {
        Object f = iplVar.f();
        if (f instanceof dxy) {
            return (dxy) f;
        }
        return null;
    }
}
