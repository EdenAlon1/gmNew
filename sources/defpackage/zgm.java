package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zgm implements dspp {
    public fgcm a;
    public Integer b;
    private final List c;
    private final int d;
    private final ffbz e;

    public zgm(final ffbr ffbrVar, List list, int i) {
        ffbrVar.getClass();
        this.c = list;
        this.d = i;
        this.e = ffca.a(new ffix() { // from class: zgc
            @Override // defpackage.ffix
            public final Object invoke() {
                return (zgu) ffbr.this.b();
            }
        });
    }

    public static final boolean h(zgv zgvVar) {
        Object obj = ((dste) zgvVar.e.a()).a;
        dsum dsumVar = obj instanceof dsum ? (dsum) obj : null;
        return dsumVar != null && ((Boolean) dsumVar.e.a()).booleanValue();
    }

    @Override // defpackage.dspp
    public final dsrs a() {
        return new dsrs(new hpw(1263267944, true, new zgf()), new hpw(785535786, true, new zgh(this)), new hpw(-1968633507, true, new zgj(this)), new hpw(-1967317028, true, new zgk(this)), new hpw(288228835, true, new zgl(this)), null, null, 193);
    }

    @Override // defpackage.dspp
    public final /* synthetic */ Object b(ffsk ffskVar, ffix ffixVar) {
        fgcm fgcmVar;
        Object drnlVar;
        dsss a;
        this.a = fgdm.a(Integer.valueOf(this.d));
        this.b = Integer.valueOf(this.c.size());
        zgu zguVar = (zgu) this.e.a();
        fgcm fgcmVar2 = this.a;
        if (fgcmVar2 == null) {
            ffkj.c("currentPage");
            fgcmVar = null;
        } else {
            fgcmVar = fgcmVar2;
        }
        List list = this.c;
        fgcmVar.getClass();
        hsv hsvVar = new hsv();
        fgcm fgcmVar3 = fgcmVar;
        axol.m(ffskVar, new zgt(fgcmVar, hsvVar, list, zguVar, ffskVar, ffixVar, null));
        hic hicVar = new hic(new dste(null, 0.0f, null), hla.a);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            appj g = ((alxr) it.next()).g();
            if (le.n(g.b()) && (g instanceof apqd)) {
                apqd apqdVar = (apqd) g;
                String b = apqdVar.b();
                b.getClass();
                drld drldVar = (drld) drjz.d(b);
                String uri = apqdVar.e().toString();
                uri.getClass();
                String k = apqdVar.k();
                int width = apqdVar.f().getWidth();
                int height = apqdVar.f().getHeight();
                Instant ofEpochMilli = apqdVar instanceof appq ? Instant.ofEpochMilli(((appq) apqdVar).a()) : Instant.now();
                ofEpochMilli.getClass();
                drnlVar = new drni(drldVar, uri, null, k, width, height, 0L, ofEpochMilli, doxq.a, 4);
            } else {
                if (!le.A(g.b()) || !(g instanceof appq)) {
                    throw new IllegalStateException("Unhandled message content-type: ".concat(String.valueOf(g.b())));
                }
                appq appqVar = (appq) g;
                drnd drndVar = (drnd) drjz.d(appqVar.b());
                String uri2 = appqVar.e().toString();
                uri2.getClass();
                int width2 = appqVar.f().getWidth();
                int height2 = appqVar.f().getHeight();
                Instant ofEpochMilli2 = Instant.ofEpochMilli(appqVar.a());
                ofEpochMilli2.getClass();
                doxq doxqVar = doxq.a;
                Object orElse = appqVar.j().orElse(0L);
                orElse.getClass();
                Duration ofMillis = Duration.ofMillis(((Number) orElse).longValue());
                ofMillis.getClass();
                drnlVar = new drnl(drndVar, uri2, null, null, width2, height2, 0L, ofEpochMilli2, doxqVar, ofMillis, 12);
            }
            if (drnlVar instanceof drni) {
                dsui dsuiVar = zguVar.a;
                a = dsui.a(new dsuk((drni) drnlVar, null, null, true, true, 2));
            } else {
                if (!(drnlVar instanceof drnl)) {
                    drnlVar.toString();
                    throw new IllegalStateException("Unhandled media attachment ".concat(drnlVar.toString()));
                }
                a = zguVar.b.a(ffskVar, new dsvw((drnl) drnlVar, null, null, true, true, 82));
            }
            arrayList.add(a);
        }
        boolean a2 = ((atcx) zguVar.e.b()).a();
        zgr zgrVar = new zgr(fgcmVar3, hsvVar, ffskVar, list, zguVar);
        int i = fgcz.a;
        return new zgv(ffskVar, hsvVar, arrayList, a2, fgbn.b(zgrVar, ffskVar, fgcy.b, null), hicVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x014a, code lost:
    
        if (r12.F(r23) != false) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(final defpackage.dspe r21, final defpackage.hvi r22, final defpackage.zgv r23, defpackage.hfd r24, final int r25) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgm.c(dspe, hvi, zgv, hfd, int):void");
    }

    public final void d(final ibq ibqVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(862909281);
        if (i3 == 0) {
            i2 = (true != b.D(ibqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hvi.e, 1.0f);
            hvi b2 = icf.b(ebs.e(d, 186.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 1, 65535);
            b.v(-1642616445);
            int i4 = i2 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new ffji() { // from class: zfx
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ifo ifoVar = (ifo) obj;
                        ifoVar.getClass();
                        ifoVar.p();
                        ifq.i(ifoVar, ibq.this, 0L, 0L, 0.0f, null, 0, 126);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            dyc.b(hxs.c(b2, (ffji) R), b, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zfy
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    zgm zgmVar = zgm.this;
                    int i5 = i;
                    zgmVar.d(ibqVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    @Override // defpackage.dspq
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.dspq
    public final /* synthetic */ void f() {
    }
}
