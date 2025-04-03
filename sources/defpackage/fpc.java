package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fpc extends ffkk implements ffjq {
    final /* synthetic */ ffjm a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ idh d;
    final /* synthetic */ fqb e;
    final /* synthetic */ ffjm f;
    final /* synthetic */ ebe g;
    final /* synthetic */ boolean h;
    final /* synthetic */ ffjm i;
    final /* synthetic */ fjj j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpc(ffjm ffjmVar, fjj fjjVar, boolean z, ffjm ffjmVar2, idh idhVar, fqb fqbVar, ffjm ffjmVar3, ebe ebeVar, boolean z2, ffjm ffjmVar4) {
        super(6);
        this.a = ffjmVar;
        this.j = fjjVar;
        this.b = z;
        this.c = ffjmVar2;
        this.d = idhVar;
        this.e = fqbVar;
        this.f = ffjmVar3;
        this.g = ebeVar;
        this.h = z2;
        this.i = ffjmVar4;
    }

    @Override // defpackage.ffjq
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        hpn d;
        float floatValue = ((Number) obj).floatValue();
        long j = ((ibw) obj2).i;
        long j2 = ((ibw) obj3).i;
        float floatValue2 = ((Number) obj4).floatValue();
        hfd hfdVar = (hfd) obj5;
        int intValue = ((Number) obj6).intValue();
        if ((intValue & 6) == 0) {
            i = (true != hfdVar.A(floatValue) ? 2 : 4) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= true != hfdVar.C(j) ? 16 : 32;
        }
        if ((intValue & 384) == 0) {
            i |= true != hfdVar.C(j2) ? 128 : 256;
        }
        if ((intValue & 3072) == 0) {
            i |= true != hfdVar.A(floatValue2) ? 1024 : 2048;
        }
        if (hfdVar.J((i & 9363) != 9362, i & 1)) {
            ffjm ffjmVar = this.a;
            hfdVar.v(-1572254147);
            hpn d2 = hpx.d(-1865025495, new foz(floatValue, j2, ffjmVar, this.h, j), hfdVar);
            hfdVar.o();
            hfdVar.v(-1570844268);
            hfdVar.o();
            fjj fjjVar = this.j;
            boolean z = this.b;
            hfdVar.v(-1519634405);
            hkx a = hku.a(new ibw(!z ? fjjVar.e : fjjVar.d), hfdVar);
            hfdVar.o();
            long j3 = ((ibw) a.a()).i;
            hfdVar.v(-1570655509);
            hfdVar.o();
            fjj fjjVar2 = this.j;
            boolean z2 = this.b;
            hfdVar.v(1383318157);
            hkx a2 = hku.a(new ibw(!z2 ? fjjVar2.g : fjjVar2.f), hfdVar);
            hfdVar.o();
            long j4 = ((ibw) a2.a()).i;
            ffjm ffjmVar2 = this.c;
            if (ffjmVar2 == null) {
                hfdVar.v(-1570361846);
                hfdVar.o();
                d = null;
            } else {
                hfdVar.v(-1570361845);
                d = hpx.d(1694126319, new fpa(j4, ffjmVar2), hfdVar);
                hfdVar.o();
            }
            hpn hpnVar = d;
            fjj fjjVar3 = this.j;
            hve hveVar = hvi.e;
            hfdVar.v(-1423938813);
            hkx a3 = hku.a(new ibw(fjjVar3.h), hfdVar);
            hfdVar.o();
            hvi a4 = dee.a(hveVar, ((ibw) a3.a()).i, this.d);
            int ordinal = this.e.ordinal();
            if (ordinal == 0) {
                hfdVar.v(-1570081481);
                fpn.e(a4, this.f, d2, hpnVar, floatValue, this.g, hfdVar, (i << 21) & 29360128);
                hfdVar.o();
            } else if (ordinal != 1) {
                hfdVar.v(-1568043975);
                hfdVar.o();
            } else {
                int i2 = (i << 21) & 29360128;
                hfdVar.v(-1569502122);
                Object f = hfdVar.f();
                if (f == hfc.a) {
                    hic hicVar = new hic(new iar(0L), hla.a);
                    hfdVar.y(hicVar);
                    f = hicVar;
                }
                hho hhoVar = (hho) f;
                hpn d3 = hpx.d(-1212965554, new fpb(hhoVar, this.g, this.i), hfdVar);
                ffjm ffjmVar3 = this.f;
                int i3 = i & 14;
                Object f2 = hfdVar.f();
                if (i3 == 4 || f2 == hfc.a) {
                    f2 = new foy(floatValue, hhoVar);
                    hfdVar.y(f2);
                }
                flu.e(a4, ffjmVar3, d2, hpnVar, floatValue, (ffji) f2, d3, this.g, hfdVar, i2 | 805306368, 0);
                hfdVar.o();
            }
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
