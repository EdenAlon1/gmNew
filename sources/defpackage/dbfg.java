package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbfg {
    public final ffbr a;
    public final ffbr b;
    public final List c;
    private final ffbz d;

    /* JADX WARN: Multi-variable type inference failed */
    public dbfg(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, Optional optional, ffbr ffbrVar5) {
        ffbrVar2.getClass();
        ffbrVar5.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        ffbz a = ffca.a(new ffix() { // from class: dbev
            @Override // defpackage.ffix
            public final Object invoke() {
                comu c = comv.c();
                c.d(comb.CMS_SETTINGS);
                c.f(axez.a);
                return ((comy) dbfg.this.b.b()).a(c.a());
            }
        });
        this.d = a;
        List i = ((axmm) ffbrVar5.b()).j((axez) ((comc) a.a()).l()) ? ffdx.i(ffbrVar3.b(), ffbrVar4.b()) : ffdx.i(ffbrVar3.b());
        optional.isPresent();
        this.c = i;
    }

    public final void a(final hho hhoVar, final int i, final dbhe dbheVar, hfd hfdVar, final int i2) {
        int i3;
        boolean z;
        hhoVar.getClass();
        dbheVar.getClass();
        int i4 = i2 & 6;
        hfd b = hfdVar.b(-77460674);
        boolean z2 = true;
        if (i4 == 0) {
            i3 = (true != b.D(hhoVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b.B(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b.F(dbheVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
        } else {
            if (((Number) hhoVar.a()).intValue() == i) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            b.v(-1036941906);
            boolean z3 = (i3 & 14) == 4 ? z : false;
            if ((i3 & 112) != 32) {
                z = false;
            }
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if ((z3 | z) || R == hfc.a) {
                R = new ffix() { // from class: dbew
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        hho.this.b(Integer.valueOf(i));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            dwjg.a(z2, (ffix) R, null, false, hpx.d(-1225393000, new dbey(dbheVar), b), 0L, 0L, b, 24576, 492);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dbex
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dbfg dbfgVar = dbfg.this;
                    hho hhoVar2 = hhoVar;
                    int i5 = i;
                    dbfgVar.a(hhoVar2, i5, dbheVar, (hfd) obj, hip.a(i2 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public final void b(hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(627874778);
        if (i3 == 0) {
            i2 = (true != b.F(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            dweu.a(dbeo.a, null, hpx.d(-1522715820, new dbfa(this), b), null, 0.0f, null, null, null, b, 390, 250);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dbeu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dbfg.this.b((hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
