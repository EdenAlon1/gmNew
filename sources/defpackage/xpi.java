package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.time.Instant;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xpi implements dspp {
    private final xpz a;
    private final Context b;
    private final ffbr c;
    private final ffix d;
    private final dspq e;
    private final ydb f;
    private final dpxc g;

    public xpi(xpz xpzVar, akln aklnVar, ydb ydbVar, Context context, ffbr ffbrVar, dpxc dpxcVar, eptm eptmVar, ffix ffixVar) {
        xpzVar.getClass();
        aklnVar.getClass();
        ydbVar.getClass();
        context.getClass();
        ffbrVar.getClass();
        eptmVar.getClass();
        this.a = xpzVar;
        this.f = ydbVar;
        this.b = context;
        this.c = ffbrVar;
        this.g = dpxcVar;
        this.d = ffixVar;
        epts eptsVar = epts.CAMERA_GALLERY;
        ffji ffjiVar = new ffji() { // from class: xow
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                doxs doxsVar = (doxs) obj;
                doxsVar.getClass();
                boolean z = true;
                if (!(doxsVar.fm() instanceof dpgr) && !(doxsVar.fm() instanceof dpgj)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        };
        akis akisVar = aklnVar.a.a;
        this.e = new xqg(akisVar.b.hw, (cqoh) akisVar.cz.b(), (ydb) aklnVar.a.c.y.b(), eptsVar, eptmVar, ffjiVar);
    }

    public static final float j(dspc dspcVar, hfd hfdVar) {
        float d;
        hfdVar.v(2018824436);
        jzn jznVar = (jzn) hfdVar.e(jdr.e);
        jzn jznVar2 = (jzn) hfdVar.e(jdr.e);
        hfdVar.v(-1567425557);
        if (athu.a()) {
            hfdVar.v(-546098391);
            d = new eal(ecv.h(hfdVar), jznVar2).d();
            hfdVar.o();
        } else {
            hfdVar.v(-546005143);
            d = new eal(ecv.g(hfdVar), jznVar2).d();
            hfdVar.o();
        }
        hkx a = hku.a(new jzq(d), hfdVar);
        hfdVar.o();
        float f = ((jzq) ffmk.m(new jzq((((jznVar.ek(jzk.a(dspcVar.a())) - (jznVar.ek(jzk.b(dspcVar.a())) / 0.75f)) - 50.0f) - 10.0f) - ((jzq) a.a()).a), new jzq(48.0f))).a;
        hfdVar.o();
        return f;
    }

    @Override // defpackage.dspp
    public final dsrs a() {
        hic hicVar = new hic(false, hla.a);
        return new dsrs(xmk.a, xmk.b, new hpw(1284581716, true, new xpg(this, hicVar)), xmk.c, null, new hpw(1156831876, true, new xph(this, hicVar)), xmk.d, 33);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0247, code lost:
    
        if (r5 >= 16) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x025d, code lost:
    
        r18 = new defpackage.dpzv(r2, r1, new defpackage.hic(false, defpackage.hla.a), defpackage.xpi$$ExternalSyntheticApiModelOutline0.m(r1.i.a()), r1.d, new defpackage.dpzj(r1, r4), new defpackage.dpzk(r1, r3), new defpackage.dpzl(), defpackage.dpzu.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0256, code lost:
    
        if (r5 < 15) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x025b, code lost:
    
        if (android.os.Build.VERSION.SDK_INT > 35) goto L37;
     */
    @Override // defpackage.dspp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object b(final defpackage.ffsk r30, final defpackage.ffix r31) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpi.b(ffsk, ffix):java.lang.Object");
    }

    public final void c(final dpzx dpzxVar, final hho hhoVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-381431556);
        if (i3 == 0) {
            i2 = (true != b.F(dpzxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hhoVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            b.v(-1345137125);
            boolean z = ((Boolean) hhoVar.a()).booleanValue() && !xpe.a(b);
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            if (z) {
                hhoVar.b(false);
            }
            boolean booleanValue = ((Boolean) hhoVar.a()).booleanValue();
            dbu c = cxu.c(500, 0, new cyh(0.0f, 0.0f, 0.0f, 1.0f), 2);
            b.v(-1345131422);
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new ffji() { // from class: xox
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        Integer num = (Integer) obj;
                        num.intValue();
                        return num;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            cue e = ctt.e(c, (ffji) R);
            dbu c2 = cxu.c(300, 0, new cyh(0.3f, 0.0f, 0.8f, 0.15f), 2);
            b.v(-1345125502);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = new ffji() { // from class: xoy
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        Integer num = (Integer) obj;
                        num.intValue();
                        return num;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            cru.b(booleanValue, null, e, ctt.h(c2, (ffji) R2), null, hpx.d(-1660736044, new xpc(hhoVar, dpzxVar), b), b, 196608, 18);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: xoz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    xpi xpiVar = xpi.this;
                    dpzx dpzxVar2 = dpzxVar;
                    int i4 = i;
                    xpiVar.c(dpzxVar2, hhoVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public final void d(final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        long f;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(1790920377);
        if (i3 == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            hvi k = ebs.k(hvi.e, 48.0f);
            f = iby.f(ibw.d(r0), ibw.c(r0), ibw.b(r0), 0.15f, ibw.f(ibw.d));
            a = dlsj.a(dfb.d(dee.a(k, f, eqm.a), false, null, ffixVar, 7), jii.a(R.string.compose_icon_gallery_unselected_content_description, b), true);
            int i4 = huo.a;
            ipn a2 = dyc.a(hum.e, false);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a);
            int i5 = ist.a;
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a2, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            dwho.a(dnaa.a(dmzz.i, b), null, ebs.k(hvi.e, 24.0f), ibw.d, b, 3504, 0);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: xov
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    xpi xpiVar = xpi.this;
                    int i6 = i;
                    xpiVar.d(ffixVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    @Override // defpackage.dspq
    public final void e() {
        xpz xpzVar = this.a;
        if (((atbl) xpzVar.f.b()).a()) {
            xpzVar.c.b();
        }
        xnq xnqVar = xpzVar.b.b;
        String str = ((xhu) xnqVar.b.a.c()).a;
        if (str == null) {
            str = "";
        }
        xnqVar.e.i(str);
        this.g.b();
        this.e.e();
    }

    @Override // defpackage.dspq
    public final void f() {
        xqg xqgVar = (xqg) this.e;
        xqgVar.e = xqgVar.a.f();
        xqgVar.f = xqgVar.a();
        aled b = xqgVar.b();
        eptu eptuVar = eptu.FULL_SCREEN;
        epto eptoVar = epto.LOADED;
        Integer valueOf = Integer.valueOf(xqgVar.f);
        Instant instant = xqgVar.e;
        if (instant == null) {
            ffkj.c("openingTime");
            instant = null;
        }
        eptm eptmVar = xqgVar.c;
        epts eptsVar = xqgVar.b;
        Instant instant2 = xqgVar.d;
        instant2.getClass();
        b.d(eptsVar, eptuVar, eptmVar, eptoVar, valueOf, ernl.a(instant, instant2), null);
        this.g.a();
        this.d.invoke();
    }

    public final void g() {
        ajjc ajjcVar = (ajjc) this.c.b();
        String string = this.b.getString(R.string.contains_attachments_error_message);
        string.getClass();
        String string2 = this.b.getString(R.string.contains_attachments_confirm);
        string2.getClass();
        ajjcVar.c(new dmve(string, null, null, null, false, false, new doas(string2, new ffix() { // from class: xou
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }), null, null, 446), true);
    }

    public final boolean h() {
        return xnr.a((xhu) this.f.a.c());
    }

    public final void i(final dsrm dsrmVar, final hvi hviVar, final xqb xqbVar, final float f, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 48;
        hfd b = hfdVar.b(-1800135112);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 16 : 32) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? b.D(xqbVar) : b.F(xqbVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.A(f) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(this) ? 8192 : 16384;
        }
        if ((i2 & 9361) == 9360 && b.I()) {
            b.s();
        } else {
            boolean k = k(xqbVar, b);
            dbu c = cxu.c(500, 0, new cyh(0.2f, 0.0f, 0.0f, 1.0f), 2);
            b.v(338856393);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new ffji() { // from class: xor
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        Integer num = (Integer) obj;
                        num.intValue();
                        return num;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            cue e = ctt.e(c, (ffji) R);
            dbu c2 = cxu.c(1000, 0, new cyh(0.2f, 0.0f, 0.0f, 1.0f), 2);
            b.v(338862377);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = new ffji() { // from class: xos
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        Integer num = (Integer) obj;
                        num.intValue();
                        return num;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            cru.b(k, null, e, ctt.h(c2, (ffji) R2), null, hpx.d(966194448, new xpd(hviVar, xqbVar, f), b), b, 196608, 18);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: xot
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    xpi xpiVar = xpi.this;
                    dsrm dsrmVar2 = dsrmVar;
                    hvi hviVar2 = hviVar;
                    xqb xqbVar2 = xqbVar;
                    xpiVar.i(dsrmVar2, hviVar2, xqbVar2, f, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public final boolean k(xqb xqbVar, hfd hfdVar) {
        hfdVar.v(634088478);
        hkx a = hkf.a(xqbVar.c, hfdVar);
        hkx a2 = hkf.a(this.g.b, hfdVar);
        hfdVar.v(909912971);
        hfdVar.v(909912905);
        hfdVar.v(-511575432);
        dtbv dtbvVar = ((xmr) hkf.a(xqbVar.d, hfdVar).a()).b.a;
        hfdVar.o();
        boolean z = true;
        boolean z2 = (dtbvVar instanceof dtbi) && !xpe.a(hfdVar);
        hfdVar.o();
        boolean z3 = z2 && !(xqc.a(xqbVar, hfdVar) && ((dpxa) a2.a()).a());
        hfdVar.o();
        if (z3) {
            ((List) a.a()).isEmpty();
        } else {
            z = false;
        }
        hfdVar.o();
        return z;
    }
}
