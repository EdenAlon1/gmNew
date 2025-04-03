package defpackage;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zjc {
    public static final void a(final hvi hviVar, final zhr zhrVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(289471452);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(zhrVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            b.v(781157926);
            boolean F = b.F(zhrVar);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new ffix() { // from class: zil
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        zhr.this.e.invoke();
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hvi d = dfb.d(hviVar, false, null, (ffix) R, 7);
            ibq ibqVar = zhs.a;
            hvi j = eba.j(d, 0.0f, 0.0f, 0.0f, 24.0f, 7);
            dxi dxiVar = dxu.a;
            int i4 = huo.a;
            ipn a = ebm.a(dxiVar, hum.m, b, 0);
            int a2 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, j);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            dnxw.j(zhrVar.a.a.a, ebs.k(hvi.e, 48.0f), b, 48);
            ebv.a(ebs.k(hvi.e, 8.0f), b);
            hve hveVar = hvi.e;
            ipn a3 = dyo.a(dxu.c, hum.j, b, 0);
            int a4 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, hveVar);
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a3, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                Integer valueOf2 = Integer.valueOf(a4);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar2);
            }
            hlc.b(b, b3, iss.c);
            b(zhrVar.a, b, 0);
            hus husVar = hum.n;
            hve hveVar2 = hvi.e;
            ipn a5 = ebm.a(dxu.a, husVar, b, 48);
            int a6 = hey.a(b);
            hqb ai3 = hfmVar.ai();
            hvi b4 = huz.b(b, hveVar2);
            ffix ffixVar3 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar3);
            } else {
                b.z();
            }
            hlc.b(b, a5, iss.e);
            hlc.b(b, ai3, iss.d);
            ffjm ffjmVar3 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a6))) {
                Integer valueOf3 = Integer.valueOf(a6);
                hfmVar.ad(valueOf3);
                b.h(valueOf3, ffjmVar3);
            }
            hlc.b(b, b4, iss.c);
            f(zhrVar, b, (i2 >> 3) & 14);
            b.v(1399854328);
            if (zhrVar.b) {
                ebv.a(ebs.o(hvi.e, 4.0f), b);
                igq a7 = dnaa.a(dmzz.aV, b);
                hvi k = ebs.k(hvi.e, 20.0f);
                long j2 = dwgz.a;
                dwho.a(a7, "ERROR", k, dwgz.b, b, 384, 0);
            }
            hfmVar.Z();
            b.n();
            b.n();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zim
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    int i6 = i;
                    zjc.a(hviVar2, zhrVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final zic zicVar, hfd hfdVar, final int i) {
        int i2 = i & 6;
        hfd b = hfdVar.b(1920536548);
        if (((i2 == 0 ? (true != b.F(zicVar) ? 2 : 4) | i : i) & 3) == 2 && b.I()) {
            b.s();
        } else {
            int i3 = huo.a;
            hus husVar = hum.n;
            hve hveVar = hvi.e;
            ipn a = ebm.a(dxu.a, husVar, b, 48);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hveVar);
            int i4 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            b.v(-792390502);
            Iterator it = zicVar.b.iterator();
            while (it.hasNext()) {
                d((String) it.next(), true, b, 48, 0);
                c(b, 0);
            }
            hfmVar.Z();
            String str = zicVar.c;
            b.v(-792386351);
            if (str != null) {
                d(jii.a(R.string.metatext_separator, b), false, b, 0, 2);
                c(b, 0);
                d(str, false, b, 0, 2);
                c(b, 0);
            }
            hfmVar.Z();
            b.v(-792381048);
            for (dmzz dmzzVar : zicVar.d) {
                c(b, 0);
                igq a3 = dnaa.a(dmzzVar, b);
                String name = dmzzVar.name();
                hvi k = ebs.k(hvi.e, 12.0f);
                ibq ibqVar = zhs.a;
                dwho.a(a3, name, k, zhs.a(b), b, 384, 0);
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zid
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    zjc.b(zic.this, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.hfd r2, int r3) {
        /*
            r0 = -1803620204(0xffffffff947ef094, float:-1.28711685E-26)
            hfd r2 = r2.b(r0)
            if (r3 != 0) goto L16
            boolean r3 = r2.I()
            r0 = 0
            if (r3 != 0) goto L12
            r3 = r0
            goto L16
        L12:
            r2.s()
            goto L22
        L16:
            hve r0 = defpackage.hvi.e
            r1 = 1073741824(0x40000000, float:2.0)
            hvi r0 = defpackage.ebs.o(r0, r1)
            defpackage.ebv.a(r0, r2)
            r0 = r3
        L22:
            hio r2 = r2.L()
            if (r2 == 0) goto L2f
            zij r3 = new zij
            r3.<init>()
            r2.d = r3
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zjc.c(hfd, int):void");
    }

    public static final void d(final String str, boolean z, hfd hfdVar, final int i, final int i2) {
        int i3;
        hfd hfdVar2;
        final boolean z2 = z;
        int i4 = i2 & 1;
        hfd b = hfdVar.b(-188147200);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (true != b.D(str) ? 2 : 4);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        boolean z3 = i5 == 0;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.E(z2) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            boolean z4 = z3 & z2;
            jsy jsyVar = z4 ? jsy.h : jsy.e;
            ibq ibqVar = zhs.a;
            hfdVar2 = b;
            dwjt.b(str, null, zhs.a(hfdVar2), 0L, null, jsyVar, 0L, null, 0L, 0, false, 0, 0, null, gft.d(hfdVar2).l, hfdVar2, i3 & 14, 0, 65498);
            z2 = z4;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zip
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i6 = i;
                    zjc.d(str2, z2, (hfd) obj, hip.a(i6 | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1969357449);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            c = ebs.c(hviVar, 1.0f);
            dxj dxjVar = dxu.e;
            int i4 = huo.a;
            ipn a = dyo.a(dxjVar, hum.k, b, 54);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, c);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            hfdVar2 = b;
            dwjt.b(jii.a(R.string.no_comments_yet, b), null, ibw.d, 0L, null, null, 0L, new jyj(3), 0L, 0, false, 0, 0, null, gft.d(b).g, hfdVar2, 384, 0, 65018);
            dwjt.b(jii.a(R.string.start_conversation_hint, b), null, ibw.d, 0L, null, null, 0L, new jyj(3), 0L, 0, false, 0, 0, null, gft.d(b).j, hfdVar2, 384, 0, 65018);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zir
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    zjc.e(hvi.this, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final zhr zhrVar, hfd hfdVar, final int i) {
        int i2;
        String string;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1522183337);
        if (i3 == 0) {
            i2 = (true != b.F(zhrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            zib zibVar = zhrVar.d;
            if (zibVar instanceof zia) {
                b.v(229111400);
                g(((zia) zibVar).a, null, zhrVar.c, zhrVar.b, b, 0, 2);
                ((hfm) b).Z();
            } else {
                if (!(zibVar instanceof zhz)) {
                    b.v(229109395);
                    ((hfm) b).Z();
                    throw new ffcd();
                }
                b.v(229116490);
                zhz zhzVar = (zhz) zibVar;
                b.v(858626087);
                if (zhzVar instanceof zht) {
                    b.v(-1580015040);
                    string = ((Context) b.e(AndroidCompositionLocals_androidKt.b)).getString(R.string.attachment_audio_clip);
                    ((hfm) b).Z();
                } else if (zhzVar instanceof zhw) {
                    b.v(-1580012517);
                    string = ((Context) b.e(AndroidCompositionLocals_androidKt.b)).getString(R.string.attachment_image);
                    ((hfm) b).Z();
                } else if (zhzVar instanceof zhy) {
                    b.v(-1580010149);
                    string = ((Context) b.e(AndroidCompositionLocals_androidKt.b)).getString(R.string.attachment_video);
                    ((hfm) b).Z();
                } else if (zhzVar instanceof zhv) {
                    b.v(-1580007814);
                    string = ((Context) b.e(AndroidCompositionLocals_androidKt.b)).getString(R.string.attachment_file);
                    ((hfm) b).Z();
                } else if (zhzVar instanceof zhu) {
                    b.v(-1580005413);
                    string = ((Context) b.e(AndroidCompositionLocals_androidKt.b)).getString(R.string.attachment_vcard);
                    ((hfm) b).Z();
                } else {
                    if (!(zhzVar instanceof zhx)) {
                        b.v(-1580016230);
                        ((hfm) b).Z();
                        throw new ffcd();
                    }
                    b.v(-1580002842);
                    string = ((Context) b.e(AndroidCompositionLocals_androidKt.b)).getString(R.string.attachment_unsupported_file);
                    ((hfm) b).Z();
                }
                string.getClass();
                hfm hfmVar = (hfm) b;
                hfmVar.Z();
                h(string, zhrVar.c, zhrVar.b, b, 0);
                hfmVar.Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zis
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    zjc.f(zhr.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final java.lang.String r20, java.util.List r21, final java.lang.String r22, final boolean r23, defpackage.hfd r24, final int r25, final int r26) {
        /*
            r1 = r20
            r3 = r22
            r4 = r23
            r5 = r25
            r0 = r26 & 1
            r2 = 356845521(0x154507d1, float:3.979E-26)
            r6 = r24
            hfd r2 = r6.b(r2)
            r6 = 1
            if (r0 == 0) goto L19
            r0 = r5 | 6
            goto L29
        L19:
            r0 = r5 & 6
            if (r0 != 0) goto L28
            boolean r0 = r2.D(r1)
            if (r6 == r0) goto L25
            r0 = 2
            goto L26
        L25:
            r0 = 4
        L26:
            r0 = r0 | r5
            goto L29
        L28:
            r0 = r5
        L29:
            r7 = r26 & 2
            if (r7 == 0) goto L30
            r0 = r0 | 48
            goto L43
        L30:
            r8 = r5 & 48
            if (r8 != 0) goto L43
            r8 = r21
            boolean r9 = r2.F(r8)
            if (r6 == r9) goto L3f
            r9 = 16
            goto L41
        L3f:
            r9 = 32
        L41:
            r0 = r0 | r9
            goto L45
        L43:
            r8 = r21
        L45:
            r9 = r5 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L55
            boolean r9 = r2.D(r3)
            if (r6 == r9) goto L52
            r9 = 128(0x80, float:1.794E-43)
            goto L54
        L52:
            r9 = 256(0x100, float:3.59E-43)
        L54:
            r0 = r0 | r9
        L55:
            r9 = r5 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L65
            boolean r9 = r2.E(r4)
            if (r6 == r9) goto L62
            r6 = 1024(0x400, float:1.435E-42)
            goto L64
        L62:
            r6 = 2048(0x800, float:2.87E-42)
        L64:
            r0 = r0 | r6
        L65:
            r0 = r0 & 1171(0x493, float:1.641E-42)
            r6 = 1170(0x492, float:1.64E-42)
            if (r0 != r6) goto L79
            boolean r0 = r2.I()
            if (r0 != 0) goto L72
            goto L79
        L72:
            r2.s()
            r17 = r2
            r2 = r8
            goto Lab
        L79:
            if (r7 == 0) goto L7e
            ffel r0 = defpackage.ffel.a
            goto L7f
        L7e:
            r0 = r8
        L7f:
            dluu r6 = new dluu
            r6.<init>(r1, r0, r3)
            gvs r7 = defpackage.gft.d(r2)
            jpo r10 = r7.j
            if (r4 == 0) goto L96
            long r7 = defpackage.ibw.d
            r9 = 1058642330(0x3f19999a, float:0.6)
            long r7 = defpackage.ibw.h(r7, r9)
            goto L98
        L96:
            long r7 = defpackage.ibw.d
        L98:
            r8 = r7
            r18 = 0
            r19 = 498(0x1f2, float:6.98E-43)
            r7 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = r2
            defpackage.dlur.e(r6, r7, r8, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r2 = r0
        Lab:
            hio r7 = r17.L()
            if (r7 == 0) goto Lba
            zin r0 = new zin
            r6 = r26
            r0.<init>()
            r7.d = r0
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zjc.g(java.lang.String, java.util.List, java.lang.String, boolean, hfd, int, int):void");
    }

    public static final void h(final String str, final String str2, final boolean z, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-232919504);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            int i4 = i2 & 14;
            int i5 = i2 << 3;
            g(str, ffdx.b(new dlto(dlus.e, 0, str.length(), (ffji) null, 24)), str2, z, b, i4 | (i5 & 896) | (i5 & 7168), 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: ziq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str3 = str;
                    String str4 = str2;
                    int i6 = i;
                    zjc.h(str3, str4, z, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void i(final dys dysVar, final boolean z, final engw engwVar, final boolean z2, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        hvi b;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-271337703);
        if (i3 == 0) {
            i2 = (true != b2.D(dysVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.F(engwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.E(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b2.F(ffixVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && b2.I()) {
            b2.s();
        } else {
            b = dys.b(hvi.e, 1.0f, true);
            cru.f(dysVar, z, b, ctt.k(null, null, 15).a(ctt.l(null, 3)), ctt.q(null, null, 15).a(ctt.m(null, 3)), null, hpx.d(-794757647, new zit(ffixVar, engwVar, dysVar, z2), b2), b2, (i2 & 14) | 1600512 | (i2 & 112), 16);
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zio
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dys dysVar2 = dys.this;
                    boolean z3 = z;
                    engw engwVar2 = engwVar;
                    boolean z4 = z2;
                    zjc.i(dysVar2, z3, engwVar2, z4, ffixVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void j(final hjz hjzVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        long f;
        hvi a;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(637790593);
        if (i3 == 0) {
            i2 = (true != b.D(hjzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            d = ebs.d(hvi.e, 1.0f);
            ibq ibqVar = zhs.a;
            hvi j = eba.j(d, 0.0f, 0.0f, 0.0f, 24.0f, 7);
            b.v(-1545711615);
            int i4 = i2 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new ffji() { // from class: zih
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ioc iocVar = (ioc) obj;
                        iocVar.getClass();
                        hjz.this.i((int) (iocVar.g() & 4294967295L));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hvi a2 = ipx.a(j, (ffji) R);
            int i5 = huo.a;
            ipn a3 = dyo.a(dxu.c, hum.k, b, 48);
            int a4 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a2);
            int i6 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a3, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            hvi a5 = hxo.a(hvi.e, eqm.a);
            f = iby.f(ibw.d(r4), ibw.c(r4), ibw.b(r4), 0.5f, ibw.f(ibw.a));
            a = dee.a(a5, f, idb.a);
            hfdVar2 = b;
            dwjt.b(jii.a(R.string.comments_overflow, b), eba.e(a, 20.0f, 7.0f), ibw.d, 0L, null, null, 0L, new jyj(3), 0L, 0, false, 0, 0, null, gft.d(b).k, hfdVar2, 384, 0, 65016);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zii
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i7 = i;
                    zjc.j(hjz.this, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void k(final dys dysVar, final hvi hviVar, final engw engwVar, final boolean z, hfd hfdVar, final int i) {
        int i2;
        boolean z2;
        hvi d;
        hvi b;
        hfm hfmVar;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-903943329);
        if (i3 == 0) {
            i2 = (true != b2.D(dysVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.F(engwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= true != b2.E(z2) ? 1024 : 2048;
        } else {
            z2 = z;
        }
        if ((i2 & 1171) == 1170 && b2.I()) {
            b2.s();
            hfdVar2 = b2;
        } else {
            final eey a = efb.a(0, b2, 3);
            b2.v(1940502291);
            hfm hfmVar2 = (hfm) b2;
            Object R = hfmVar2.R();
            if (R == hfc.a) {
                R = new hhy(0);
                hfmVar2.ad(R);
            }
            final hjz hjzVar = (hjz) R;
            hfmVar2.Z();
            b2.v(1940504307);
            Object R2 = hfmVar2.R();
            if (R2 == hfc.a) {
                R2 = new hhy(0);
                hfmVar2.ad(R2);
            }
            final hjz hjzVar2 = (hjz) R2;
            hfmVar2.Z();
            ibq ibqVar = zhs.a;
            final ibq ibqVar2 = zhs.a;
            boolean z3 = false;
            d = ebs.d(hxs.c(icf.b(hviVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 1, 65535), new ffji() { // from class: zig
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ifo ifoVar = (ifo) obj;
                    ifoVar.getClass();
                    ifoVar.p();
                    ifq.i(ifoVar, ibq.this, 0L, 0L, 0.0f, null, 6, 62);
                    return ffcu.a;
                }
            }), 1.0f);
            b = dys.b(d, 1.0f, true);
            hvi a2 = jfw.a(b, "ReplyOverlay.repliesList");
            b2.v(1940514247);
            boolean F = b2.F(engwVar);
            if ((i2 & 7168) == 2048) {
                z3 = true;
            }
            boolean D = F | z3 | b2.D(a);
            Object R3 = hfmVar2.R();
            if (D || R3 == hfc.a) {
                final boolean z4 = z2;
                ffji ffjiVar = new ffji() { // from class: zie
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        edp edpVar = (edp) obj;
                        edpVar.getClass();
                        engw engwVar2 = engw.this;
                        int size = engwVar2.size();
                        int size2 = engwVar2.size();
                        ziy ziyVar = new ziy(engwVar2);
                        hjz hjzVar3 = hjzVar;
                        edpVar.a(size2, null, ziyVar, new hpw(-1091073711, true, new ziz(engwVar2, size, hjzVar3)));
                        hjz hjzVar4 = hjzVar2;
                        if (z4) {
                            eek.a(edpVar, null, new hpw(1608480815, true, new ziv(hjzVar4)), 3);
                        }
                        eek.a(edpVar, null, new hpw(-1525017686, true, new zix(a, hjzVar3, hjzVar4)), 3);
                        return ffcu.a;
                    }
                };
                hfmVar = hfmVar2;
                hfmVar.ad(ffjiVar);
                R3 = ffjiVar;
            } else {
                hfmVar = hfmVar2;
            }
            hfmVar.Z();
            hfdVar2 = b2;
            edh.a(a2, a, null, true, null, null, null, false, null, (ffji) R3, hfdVar2, 3072, 500);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zif
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dys dysVar2 = dys.this;
                    hvi hviVar2 = hviVar;
                    engw engwVar2 = engwVar;
                    zjc.k(dysVar2, hviVar2, engwVar2, z, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void l(final dyn dynVar, final hvi hviVar, final zjv zjvVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        hvi d;
        zjvVar.getClass();
        int i3 = i & 48;
        hfd b = hfdVar.b(380620860);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 16 : 32) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(zjvVar) ? 128 : 256;
        }
        if ((i2 & 145) == 144 && b.I()) {
            b.s();
        } else {
            c = ebs.c(hvi.e, 1.0f);
            ffcu ffcuVar = ffcu.a;
            b.v(-119698003);
            boolean F = b.F(zjvVar);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new zjb(zjvVar);
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hvi a = ilv.a(c, ffcuVar, (PointerInputEventHandler) R);
            int i4 = huo.a;
            ipn a2 = dyc.a(hum.a, false);
            int a3 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
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
            dyi dyiVar = dyi.a;
            d = ebs.d(hviVar, 1.0f);
            ibq ibqVar = zhs.a;
            hvi a4 = dyiVar.a(ebs.b(eba.d(d, 24.0f), 0.8f), hum.h);
            ipn a5 = dyo.a(dxu.d, hum.j, b, 6);
            int a6 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, a4);
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a5, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a6))) {
                Integer valueOf2 = Integer.valueOf(a6);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar2);
            }
            hlc.b(b, b3, iss.c);
            i(dys.a, zjvVar.c, zjvVar.a, zjvVar.b, zjvVar.d, b, 6);
            b.n();
            b.n();
            acu.a(false, zjvVar.d, b, 0, 1);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zik
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dyn dynVar2 = dyn.this;
                    hvi hviVar2 = hviVar;
                    int i6 = i;
                    zjc.l(dynVar2, hviVar2, zjvVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
