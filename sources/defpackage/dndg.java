package defpackage;

import android.net.Uri;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dndg {
    /* JADX WARN: Removed duplicated region for block: B:16:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.hfd r25, int r26) {
        /*
            r0 = 273838333(0x105270fd, float:4.150224E-29)
            r1 = r25
            hfd r0 = r1.b(r0)
            if (r26 != 0) goto L1c
            boolean r1 = r0.I()
            r2 = 0
            if (r1 != 0) goto L15
            r24 = r2
            goto L1e
        L15:
            r0.s()
            r20 = r0
            goto Lb8
        L1c:
            r24 = r26
        L1e:
            hve r1 = defpackage.hvi.e
            hvi r1 = defpackage.ebs.t(r1)
            r2 = 1118830592(0x42b00000, float:88.0)
            hvi r1 = defpackage.ebs.e(r1, r2)
            dxj r2 = defpackage.dxu.e
            int r3 = defpackage.huo.a
            hun r3 = defpackage.hum.k
            r4 = 54
            ipn r2 = defpackage.dyo.a(r2, r3, r0, r4)
            int r3 = defpackage.hey.a(r0)
            r4 = r0
            hfm r4 = (defpackage.hfm) r4
            hqb r5 = r4.ai()
            hvi r1 = defpackage.huz.b(r0, r1)
            int r6 = defpackage.ist.a
            ffix r6 = defpackage.iss.a
            r0.x()
            boolean r7 = r4.z
            if (r7 == 0) goto L54
            r0.j(r6)
            goto L57
        L54:
            r0.z()
        L57:
            ffjm r6 = defpackage.iss.e
            defpackage.hlc.b(r0, r2, r6)
            ffjm r2 = defpackage.iss.d
            defpackage.hlc.b(r0, r5, r2)
            ffjm r2 = defpackage.iss.f
            boolean r5 = r4.z
            if (r5 != 0) goto L75
            java.lang.Object r5 = r4.R()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            boolean r5 = defpackage.ffkj.e(r5, r6)
            if (r5 != 0) goto L7f
        L75:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.ad(r3)
            r0.h(r3, r2)
        L7f:
            ffjm r2 = defpackage.iss.c
            defpackage.hlc.b(r0, r1, r2)
            r1 = 2132085140(0x7f150994, float:1.981047E38)
            java.lang.String r1 = defpackage.jii.a(r1, r0)
            gvs r2 = defpackage.gft.d(r0)
            jpo r2 = r2.i
            r22 = 0
            r23 = 65534(0xfffe, float:9.1833E-41)
            r19 = r2
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 0
            r20 = r0
            defpackage.dwjt.b(r1, r2, r3, r5, r7, r8, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r20.n()
            r2 = r24
        Lb8:
            hio r0 = r20.L()
            if (r0 == 0) goto Lc5
            dndb r1 = new dndb
            r1.<init>()
            r0.d = r1
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dndg.a(hfd, int):void");
    }

    public static final void b(final dndl dndlVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        boolean z;
        hfm hfmVar;
        hvi d;
        hfd hfdVar3;
        int i3 = i & 6;
        hfd b = hfdVar.b(-701199013);
        if (i3 == 0) {
            i2 = (true != b.D(dndlVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar3 = b;
        } else {
            hvi x = ebs.x(hvi.e, 0.0f, dnrx.b(0.0f, dndlVar.g.a, false, b, 5), 1);
            dxq dxqVar = dxu.c;
            int i4 = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, b, 0);
            int a2 = hey.a(b);
            hfm hfmVar2 = (hfm) b;
            hqb ai = hfmVar2.ai();
            hvi b2 = huz.b(b, x);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar2.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar2.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            b.v(852265278);
            if (ffkj.e(dndlVar.d, Uri.EMPTY)) {
                hfdVar2 = b;
                z = true;
                hfmVar = hfmVar2;
            } else {
                hvi e = ebs.e(ebs.o(hvi.e, dnrx.b(0.0f, dndlVar.g.a, false, b, 5)), 135.0f);
                ipn a3 = dyc.a(hum.a, false);
                int a4 = hey.a(b);
                hqb ai2 = hfmVar2.ai();
                hvi b3 = huz.b(b, e);
                ffix ffixVar2 = iss.a;
                b.x();
                if (hfmVar2.z) {
                    b.j(ffixVar2);
                } else {
                    b.z();
                }
                hlc.b(b, a3, iss.e);
                hlc.b(b, ai2, iss.d);
                ffjm ffjmVar2 = iss.f;
                if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a4))) {
                    Integer valueOf2 = Integer.valueOf(a4);
                    hfmVar2.ad(valueOf2);
                    b.h(valueOf2, ffjmVar2);
                }
                hlc.b(b, b3, iss.c);
                Uri uri = dndlVar.d;
                z = true;
                String str = dndlVar.e;
                hvi b4 = dyi.a.b(hvi.e);
                int i6 = inp.a;
                hfmVar = hfmVar2;
                dnac.a(uri, str, b4, null, null, null, ino.d, null, 0.0f, null, null, null, null, null, dndlVar.f, null, b, 12582912, 0, 393080);
                hfdVar2 = b;
                hfdVar2.n();
            }
            hfmVar.Z();
            d = ebs.d(eba.e(hvi.e, 16.0f, 12.0f), 1.0f);
            ipn a5 = dyo.a(new dxn(8.0f, z, dxr.a), hum.j, hfdVar2, 6);
            int a6 = hey.a(hfdVar2);
            hqb ai3 = hfmVar.ai();
            hvi b5 = huz.b(hfdVar2, d);
            ffix ffixVar3 = iss.a;
            hfdVar2.x();
            if (hfmVar.z) {
                hfdVar2.j(ffixVar3);
            } else {
                hfdVar2.z();
            }
            hlc.b(hfdVar2, a5, iss.e);
            hlc.b(hfdVar2, ai3, iss.d);
            ffjm ffjmVar3 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a6))) {
                Integer valueOf3 = Integer.valueOf(a6);
                hfmVar.ad(valueOf3);
                hfdVar2.h(valueOf3, ffjmVar3);
            }
            hlc.b(hfdVar2, b5, iss.c);
            hfdVar2.v(-1565572194);
            if (!ffpc.J(dndlVar.a)) {
                hfd hfdVar4 = hfdVar2;
                dwjt.b(dndlVar.a, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, gft.d(hfdVar4).m, hfdVar4, 0, 3120, 55294);
                hfdVar2 = hfdVar4;
            }
            hfmVar.Z();
            hfdVar2.v(-1565565013);
            if (!ffpc.J(dndlVar.b)) {
                hfd hfdVar5 = hfdVar2;
                dwjt.b(dndlVar.b, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, null, gft.d(hfdVar5).l, hfdVar5, 0, 3120, 55294);
                hfdVar2 = hfdVar5;
            }
            hfmVar.Z();
            hfdVar2.v(-1565557439);
            hfdVar3 = hfdVar2;
            if (!ffpc.J(dndlVar.c)) {
                dwjt.b(dndlVar.c, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, gft.d(hfdVar3).l, hfdVar3, 0, 3120, 55294);
            }
            hfmVar.Z();
            hfdVar3.n();
            hfdVar3.n();
        }
        hio L = hfdVar3.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnda
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i7 = i;
                    dndg.b(dndl.this, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.hfd r12, final int r13) {
        /*
            r0 = 1992016201(0x76bbc149, float:1.9040621E33)
            hfd r9 = r12.b(r0)
            if (r13 != 0) goto L16
            boolean r12 = r9.I()
            r13 = 0
            if (r12 != 0) goto L11
            goto L16
        L11:
            r9.s()
            goto L9f
        L16:
            hve r12 = defpackage.hvi.e
            hvi r12 = defpackage.ebs.t(r12)
            r0 = 1118830592(0x42b00000, float:88.0)
            hvi r12 = defpackage.ebs.e(r12, r0)
            dxj r0 = defpackage.dxu.e
            int r1 = defpackage.huo.a
            hun r1 = defpackage.hum.k
            r2 = 54
            ipn r0 = defpackage.dyo.a(r0, r1, r9, r2)
            int r1 = defpackage.hey.a(r9)
            r2 = r9
            hfm r2 = (defpackage.hfm) r2
            hqb r3 = r2.ai()
            hvi r12 = defpackage.huz.b(r9, r12)
            int r4 = defpackage.ist.a
            ffix r4 = defpackage.iss.a
            r9.x()
            boolean r5 = r2.z
            if (r5 == 0) goto L4c
            r9.j(r4)
            goto L4f
        L4c:
            r9.z()
        L4f:
            ffjm r4 = defpackage.iss.e
            defpackage.hlc.b(r9, r0, r4)
            ffjm r0 = defpackage.iss.d
            defpackage.hlc.b(r9, r3, r0)
            ffjm r0 = defpackage.iss.f
            boolean r3 = r2.z
            if (r3 != 0) goto L6d
            java.lang.Object r3 = r2.R()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            boolean r3 = defpackage.ffkj.e(r3, r4)
            if (r3 != 0) goto L77
        L6d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.ad(r1)
            r9.h(r1, r0)
        L77:
            ffjm r0 = defpackage.iss.c
            defpackage.hlc.b(r9, r12, r0)
            hve r12 = defpackage.hvi.e
            r0 = 1108344832(0x42100000, float:36.0)
            hvi r12 = defpackage.ebs.k(r12, r0)
            r0 = 2132085143(0x7f150997, float:1.9810476E38)
            java.lang.String r0 = defpackage.jii.a(r0, r9)
            hvi r1 = defpackage.dlsj.d(r12, r0)
            r10 = 0
            r11 = 62
            r2 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            defpackage.dwij.a(r1, r2, r4, r5, r7, r8, r9, r10, r11)
            r9.n()
        L9f:
            hio r12 = r9.L()
            if (r12 == 0) goto Lac
            dncy r0 = new dncy
            r0.<init>()
            r12.d = r0
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dndg.c(hfd, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.hfd r24, int r25) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dndg.d(hfd, int):void");
    }

    public static final void e(final dndq dndqVar, final hvi hviVar, final idh idhVar, hfd hfdVar, final int i) {
        int i2;
        dndqVar.getClass();
        hfd b = hfdVar.b(-1275159904);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dndqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= true != b.D(idhVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
        } else {
            hviVar = hvi.e;
            hvi a = jfw.a(hviVar, "LinkPreviewContent");
            ffcu ffcuVar = ffcu.a;
            b.v(-2107027947);
            int i4 = i3 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new dnde(dndqVar);
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hvi a2 = ilv.a(a, ffcuVar, (PointerInputEventHandler) R);
            b.v(-2107023668);
            der a3 = dooy.g(b) ? null : des.a(1.0f, gft.a(b).B);
            hfmVar.Z();
            gpa.c(a2, idhVar, 0L, 0L, 0.0f, 0.0f, a3, hpx.d(-1790592005, new dndf(dndqVar), b), b, 60);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dncz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dndq dndqVar2 = dndq.this;
                    hvi hviVar2 = hviVar;
                    int i5 = i;
                    dndg.e(dndqVar2, hviVar2, idhVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
