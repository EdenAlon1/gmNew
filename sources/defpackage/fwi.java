package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwi {
    public final float a;

    public fwi(float f) {
        this.a = f;
    }

    public final hkx a(boolean z, dwn dwnVar, hfd hfdVar, int i) {
        cxj cxjVar;
        hfdVar.v(-1763481333);
        float f = 0.0f;
        if (dwnVar == null) {
            hfdVar.v(-1304675619);
            hfm hfmVar = (hfm) hfdVar;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(new jzq(0.0f), hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            hho hhoVar = (hho) R;
            hfmVar.Z();
            hfmVar.Z();
            return hhoVar;
        }
        hfdVar.v(-1304602583);
        hfm hfmVar2 = (hfm) hfdVar;
        hfmVar2.Z();
        Object R2 = hfmVar2.R();
        if (R2 == hfc.a) {
            R2 = new hss();
            hfmVar2.ad(R2);
        }
        hss hssVar = (hss) R2;
        boolean z2 = (((i & 112) ^ 48) > 32 && hfdVar.D(dwnVar)) || (i & 48) == 32;
        Object R3 = hfmVar2.R();
        if (z2 || R3 == hfc.a) {
            R3 = new fwg(dwnVar, hssVar, null);
            hfmVar2.ad(R3);
        }
        hgs.g(dwnVar, (ffjm) R3, hfdVar);
        dwm dwmVar = (dwm) ffdx.Q(hssVar);
        if (z && !(dwmVar instanceof dwp)) {
            if (dwmVar instanceof dwk) {
                f = this.a;
            } else if (!(dwmVar instanceof dwf) && (dwmVar instanceof dwd)) {
                f = 6.0f;
            }
        }
        Object R4 = hfmVar2.R();
        if (R4 == hfc.a) {
            R4 = new cxj(new jzq(f), dcp.c, null, 12);
            hfmVar2.ad(R4);
        }
        cxj cxjVar2 = (cxj) R4;
        jzq jzqVar = new jzq(f);
        boolean F = hfdVar.F(cxjVar2) | hfdVar.A(f) | ((((i & 14) ^ 6) > 4 && hfdVar.E(z)) || (i & 6) == 4) | ((((i & 896) ^ 384) > 256 && hfdVar.D(this)) || (i & 384) == 256) | hfdVar.F(dwmVar);
        Object R5 = hfmVar2.R();
        if (F || R5 == hfc.a) {
            cxjVar = cxjVar2;
            fwh fwhVar = new fwh(cxjVar, f, z, this, dwmVar, null);
            hfmVar2.ad(fwhVar);
            R5 = fwhVar;
        } else {
            cxjVar = cxjVar2;
        }
        hgs.g(jzqVar, (ffjm) R5, hfdVar);
        cxv cxvVar = cxjVar.b;
        hfmVar2.Z();
        return cxvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fwi)) {
            return false;
        }
        return jzq.b(0.0f, 0.0f) && jzq.b(0.0f, 0.0f) && jzq.b(0.0f, 0.0f) && jzq.b(this.a, ((fwi) obj).a) && jzq.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(0.0f) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(this.a)) * 31) + Float.floatToIntBits(0.0f);
    }
}
