package defpackage;

import com.google.android.apps.messaging.R;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmmi {
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.dmmk r25, final boolean r26, final defpackage.dmpg r27, final float r28, java.lang.String r29, defpackage.hfd r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmmi.a(dmmk, boolean, dmpg, float, java.lang.String, hfd, int, int):void");
    }

    public static final void b(final dmmk dmmkVar, final boolean z, final dmpg dmpgVar, final float f, hfd hfdVar, final int i) {
        hvi d;
        hvi c;
        int i2 = i & 6;
        hfd b = hfdVar.b(-1315329833);
        int i3 = 1;
        int i4 = i2 == 0 ? (true != b.D(dmmkVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i4 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i4 |= true != b.D(dmpgVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i4 |= true != b.A(f) ? 1024 : 2048;
        }
        if ((i4 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            b.v(1910238336);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new hhy(0);
                hfmVar.ad(R);
            }
            hjz hjzVar = (hjz) R;
            hfmVar.Z();
            dji a = dix.a(0, b, 0, 1);
            Integer valueOf = Integer.valueOf(dmmkVar.a.size());
            b.v(1910242016);
            boolean z2 = (i4 & 14) == 4;
            boolean D = b.D(a) | z2;
            Object R2 = hfmVar.R();
            if (D || R2 == hfc.a) {
                R2 = new dmma(dmmkVar, a, hjzVar, null);
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hgs.g(valueOf, (ffjm) R2, b);
            d = ebs.d(hvi.e, 1.0f);
            c = dix.c(d, a, false, true, false);
            hvi c2 = eba.c(c, dmmkVar.a.isEmpty() ? new ebf(0.0f, 0.0f, 0.0f, 0.0f) : eba.h(16.0f, 12.0f, 12.0f, 0.0f, 8));
            dxi dxiVar = dxu.a;
            int i5 = huo.a;
            ipn a2 = ebm.a(dxiVar, hum.m, b, 0);
            int a3 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, c2);
            int i6 = ist.a;
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
                Integer valueOf2 = Integer.valueOf(a3);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            b.v(-1518341334);
            final int i7 = 0;
            for (Object obj : dmmkVar.a) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    ffdx.l();
                }
                dlwk dlwkVar = (dlwk) obj;
                String a4 = jii.a(R.string.compose_remove_button_content_description, b);
                Object[] objArr = new Object[i3];
                objArr[0] = dlwkVar.e();
                String format = String.format(a4, Arrays.copyOf(objArr, i3));
                format.getClass();
                b.v(-1244950987);
                boolean B = b.B(i7) | z2;
                Object R3 = hfmVar.R();
                if (B || R3 == hfc.a) {
                    R3 = new ffix() { // from class: dmlg
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            dmmk.this.c.invoke(Integer.valueOf(i7));
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R3);
                }
                hfmVar.Z();
                dlsf dlsfVar = new dlsf(format, (ffix) R3);
                b.v(-1244941996);
                boolean B2 = b.B(i7) | z2;
                Object R4 = hfmVar.R();
                if (B2 || R4 == hfc.a) {
                    R4 = new ffix() { // from class: dmlh
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            dmmk.this.b.invoke(Integer.valueOf(i7));
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R4);
                }
                ffix ffixVar2 = (ffix) R4;
                hfmVar.Z();
                b.v(-1244940424);
                boolean B3 = b.B(i7) | z2;
                Object R5 = hfmVar.R();
                if (B3 || R5 == hfc.a) {
                    R5 = new ffix() { // from class: dmli
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            dmmk.this.d.invoke(Integer.valueOf(i7));
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R5);
                }
                hfmVar.Z();
                dlzk.b(new dlzl(dlsfVar, ffixVar2, (ffix) R5, (dlwkVar instanceof dlwf) & z), null, new ibw(m(dmpgVar, f, b)), hpx.d(-986761395, new dmmb(dlwkVar), b), b, 3072);
                i7 = i8;
                i3 = 1;
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmlk
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dmmk dmmkVar2 = dmmk.this;
                    boolean z3 = z;
                    dmpg dmpgVar2 = dmpgVar;
                    dmmi.b(dmmkVar2, z3, dmpgVar2, f, (hfd) obj2, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.igq r15, final java.lang.String r16, defpackage.hvi r17, long r18, defpackage.hfd r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmmi.c(igq, java.lang.String, hvi, long, hfd, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.dmqe r29, int r30, defpackage.hfd r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmmi.d(dmqe, int, hfd, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final java.lang.String r25, final defpackage.dmpg r26, defpackage.hvi r27, boolean r28, defpackage.hfd r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmmi.e(java.lang.String, dmpg, hvi, boolean, hfd, int, int):void");
    }

    public static final void f(hho hhoVar, boolean z) {
        hhoVar.b(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0369  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final defpackage.dmnc r32, final defpackage.dmnh r33, final defpackage.dmpi r34, boolean r35, defpackage.hho r36, boolean r37, defpackage.dmpg r38, float r39, defpackage.hvi r40, defpackage.hfd r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 1559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmmi.g(dmnc, dmnh, dmpi, boolean, hho, boolean, dmpg, float, hvi, hfd, int, int):void");
    }

    public static final void h(final dmmq dmmqVar, final dmpg dmpgVar, final float f, boolean z, hfd hfdVar, final int i, final int i2) {
        int i3;
        final boolean z2;
        int i4 = i2 & 1;
        hfd b = hfdVar.b(666911971);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(dmmqVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.D(dmpgVar) ? 16 : 32;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != b.A(f) ? 128 : 256;
        }
        int i5 = i2 & 8;
        boolean z3 = i5 == 0;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= true != b.E(z) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && b.I()) {
            b.s();
            z2 = z;
        } else {
            boolean z4 = z3 & z;
            if (dmmqVar instanceof dmmm) {
                b.v(-1192257494);
                dmnn.a((dmmm) dmmqVar, f, b, (i3 >> 3) & 112);
                ((hfm) b).Z();
            } else if (dmmqVar instanceof dmnb) {
                b.v(-1192254751);
                dmna.a((dmnb) dmmqVar, null, null, z4, b, i3 & 7168, 6);
                ((hfm) b).Z();
            } else if (dmmqVar instanceof dmpf) {
                int i6 = i3 >> 3;
                b.v(-1192250928);
                dmpf dmpfVar = (dmpf) dmmqVar;
                b.v(-1192247913);
                ibw ibwVar = dmpgVar == null ? null : new ibw(m(dmpgVar, f, b));
                hfm hfmVar = (hfm) b;
                hfmVar.Z();
                dmpe.a(dmpfVar, ibwVar, z4, b, i6 & 896);
                hfmVar.Z();
            } else {
                b.v(1695142627);
                ((hfm) b).Z();
            }
            z2 = z4;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmla
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmmq dmmqVar2 = dmmq.this;
                    dmpg dmpgVar2 = dmpgVar;
                    float f2 = f;
                    dmmi.h(dmmqVar2, dmpgVar2, f2, z2, (hfd) obj, hip.a(i | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }

    public static final boolean i(dmnc dmncVar, dmnh dmnhVar) {
        dmncVar.getClass();
        int ordinal = dmncVar.ordinal();
        if (ordinal == 2) {
            dmkg dmkgVar = dmnhVar.c;
            if (dmkgVar == null) {
                return false;
            }
            return dmkgVar.a;
        }
        if (ordinal == 3) {
            return dmnhVar.e != null;
        }
        if (ordinal == 4) {
            return dmnhVar.d != null;
        }
        if (ordinal != 5) {
            return true;
        }
        dmsk dmskVar = dmnhVar.b;
        if (dmskVar == null) {
            return false;
        }
        return dmskVar.b;
    }

    public static final void j(final hvi hviVar, final boolean z, final gdx gdxVar, final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1342249231);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(gdxVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjmVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            hvi a2 = gex.a(hviVar);
            b.v(1611271659);
            float f = true != ((Boolean) dooy.b(b).i.invoke()).booleanValue() ? 40.0f : 56.0f;
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            a = dee.a(hxo.a(ebs.o(ebs.e(a2, f), 40.0f), eqm.a), z ? gdxVar.a : gdxVar.c, idb.a);
            int i4 = huo.a;
            ipn a3 = dyc.a(hum.e, false);
            int a4 = hey.a(b);
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
            hlc.b(b, a3, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar2);
            }
            hlc.b(b, b2, iss.c);
            hfz.a(fzc.a.c(new ibw(z ? gdxVar.b : gdxVar.d)), ffjmVar, b, ((i2 >> 6) & 112) | 8);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmll
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    boolean z2 = z;
                    gdx gdxVar2 = gdxVar;
                    dmmi.j(hviVar2, z2, gdxVar2, ffjmVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final String k(dmnc dmncVar, boolean z, hfd hfdVar) {
        int i;
        int i2;
        dmncVar.getClass();
        hfdVar.v(1251414004);
        int ordinal = dmncVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            i = R.string.compose_icon_ai_unselected_content_description;
            i2 = R.string.compose_icon_ai_selected_content_description;
        } else if (ordinal == 2) {
            i = R.string.compose_icon_gallery_unselected_content_description;
            i2 = R.string.compose_icon_gallery_selected_content_description;
        } else if (ordinal == 3) {
            i = R.string.compose_icon_emotive_unselected_content_description;
            i2 = R.string.compose_icon_emotive_selected_content_description;
        } else if (ordinal == 4) {
            i = R.string.compose_icon_shortcuts_unselected_content_description;
            i2 = R.string.compose_icon_shortcuts_selected_content_description;
        } else {
            if (ordinal != 5) {
                throw new ffcd();
            }
            i = R.string.compose_icon_voice_unselected_content_description;
            i2 = R.string.compose_icon_voice_selected_content_description;
        }
        if (true == z) {
            i = i2;
        }
        String a = jii.a(i, hfdVar);
        hfdVar.o();
        return a;
    }

    public static final igq l(dmnc dmncVar, boolean z, hfd hfdVar) {
        dmzz dmzzVar;
        hfdVar.v(2056513199);
        int ordinal = dmncVar.ordinal();
        if (ordinal == 0) {
            dmzzVar = z ? dmzz.cH : dmzz.cG;
        } else if (ordinal == 1) {
            dmzzVar = z ? dmzz.av : dmzz.au;
        } else if (ordinal == 2) {
            dmzzVar = z ? dmzz.at : dmzz.aq;
        } else if (ordinal == 3) {
            dmzzVar = z ? dmzz.ap : dmzz.ao;
        } else if (ordinal == 4) {
            dmzzVar = z ? dmzz.h : dmzz.g;
        } else {
            if (ordinal != 5) {
                throw new ffcd();
            }
            dmzzVar = dmzz.ay;
        }
        igq a = dnaa.a(dmzzVar, hfdVar);
        hfdVar.o();
        return a;
    }

    public static final long m(dmpg dmpgVar, float f, hfd hfdVar) {
        long j;
        dmpgVar.getClass();
        hfdVar.v(-1126102497);
        if (dooy.g(hfdVar)) {
            hfdVar.v(-1819831086);
            j = gft.a(hfdVar).J;
            hfdVar.o();
        } else if (dmpgVar == dmpg.b) {
            hfdVar.v(-1819828496);
            j = gft.a(hfdVar).G;
            hfdVar.o();
        } else if (dmpgVar == dmpg.c) {
            hfdVar.v(-1819826623);
            hfdVar.o();
            j = ibw.d;
        } else {
            hfdVar.v(-1819825204);
            j = gft.a(hfdVar).v;
            hfdVar.o();
        }
        if (ibw.a(j) != f) {
            j = iby.f(ibw.d(j), ibw.c(j), ibw.b(j), f, ibw.f(j));
        }
        hfdVar.o();
        return j;
    }

    public static final igq n(dmnc dmncVar, boolean z, hfd hfdVar) {
        dmzz dmzzVar;
        hfdVar.v(-1749598806);
        int ordinal = dmncVar.ordinal();
        if (ordinal == 0) {
            dmzzVar = z ? dmzz.cH : dmzz.cG;
        } else if (ordinal == 1) {
            dmzzVar = z ? dmzz.ch : dmzz.cg;
        } else if (ordinal == 2) {
            dmzzVar = z ? dmzz.as : dmzz.ar;
        } else if (ordinal == 3) {
            dmzzVar = z ? dmzz.ap : dmzz.ao;
        } else if (ordinal == 4) {
            dmzzVar = z ? dmzz.an : dmzz.am;
        } else {
            if (ordinal != 5) {
                throw new ffcd();
            }
            dmzzVar = dmzz.ay;
        }
        igq a = dnaa.a(dmzzVar, hfdVar);
        hfdVar.o();
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final defpackage.ebq r14, final defpackage.dmms r15, final defpackage.hzi r16, final defpackage.dmpg r17, final float r18, defpackage.ffji r19, final defpackage.dmpi r20, defpackage.hfd r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmmi.o(ebq, dmms, hzi, dmpg, float, ffji, dmpi, hfd, int, int):void");
    }

    public static final long p(dmpg dmpgVar, float f, dmrq dmrqVar, boolean z, hfd hfdVar) {
        long m;
        hfdVar.v(-508894614);
        if (z) {
            hfdVar.v(1306029064);
            int ordinal = dmrqVar.ordinal();
            if (ordinal == 1) {
                hfdVar.v(319227640);
                m = gft.a(hfdVar).a;
                ((hfm) hfdVar).Z();
            } else if (ordinal != 2) {
                hfdVar.v(319231754);
                m = m(dmpgVar, f, hfdVar);
                ((hfm) hfdVar).Z();
            } else {
                hfdVar.v(319230402);
                m = gft.a(hfdVar).l;
                ((hfm) hfdVar).Z();
            }
            ((hfm) hfdVar).Z();
        } else {
            hfdVar.v(1306354254);
            m = m(dmpgVar, f, hfdVar);
            ((hfm) hfdVar).Z();
        }
        ((hfm) hfdVar).Z();
        return m;
    }

    public static final long q(boolean z, boolean z2, boolean z3, boolean z4, dmpg dmpgVar, float f, dmrq dmrqVar, boolean z5, hfd hfdVar) {
        long m;
        dmrqVar.getClass();
        hfdVar.v(-806002448);
        if (z4) {
            hfdVar.v(-326218120);
            if (z) {
                hfdVar.v(-326202248);
                m = gft.a(hfdVar).a;
                ((hfm) hfdVar).Z();
            } else if (!z2 || z3) {
                hfdVar.v(-325853064);
                m = gft.a(hfdVar).a;
                ((hfm) hfdVar).Z();
            } else {
                hfdVar.v(-326099762);
                m = p(dmpgVar, f, dmrqVar, z5, hfdVar);
                ((hfm) hfdVar).Z();
            }
            ((hfm) hfdVar).Z();
        } else if (dmrqVar == dmrq.VOICE_BUTTON_BACKGROUND_DEFAULT || !z2 || z3 || z) {
            hfdVar.v(-325406044);
            m = m(dmpgVar, f, hfdVar);
            ((hfm) hfdVar).Z();
        } else {
            hfdVar.v(-325640900);
            m = p(dmpgVar, f, dmrqVar, z5, hfdVar);
            ((hfm) hfdVar).Z();
        }
        ((hfm) hfdVar).Z();
        return m;
    }

    private static final hvi r(hvi hviVar, final ffji ffjiVar, final dmnc dmncVar, hfd hfdVar, int i) {
        hfdVar.v(1118454715);
        hfdVar.v(1216810393);
        hfm hfmVar = (hfm) hfdVar;
        Object R = hfmVar.R();
        if (R == hfc.a) {
            R = new dwn();
            hfmVar.ad(R);
        }
        dwn dwnVar = (dwn) R;
        hfmVar.Z();
        jjj jjjVar = new jjj(0);
        hfdVar.v(1216805716);
        boolean z = ((((i & 896) ^ 384) > 256 && hfdVar.D(dmncVar)) || (i & 384) == 256) | ((((i & 112) ^ 48) > 32 && hfdVar.D(ffjiVar)) || (i & 48) == 32);
        Object R2 = hfmVar.R();
        if (z || R2 == hfc.a) {
            R2 = new ffix() { // from class: dmlt
                @Override // defpackage.ffix
                public final Object invoke() {
                    ffji ffjiVar2 = ffji.this;
                    if (ffjiVar2 != null) {
                        ffjiVar2.invoke(dmncVar);
                    }
                    return ffcu.a;
                }
            };
            hfmVar.ad(R2);
        }
        boolean z2 = ffjiVar != null;
        hfmVar.Z();
        hvi c = dfb.c(hviVar, dwnVar, null, z2, null, jjjVar, (ffix) R2, 8);
        hfmVar.Z();
        return c;
    }

    private static final hvi s(hvi hviVar, final dmnh dmnhVar, final dmnc dmncVar, hfd hfdVar, int i) {
        hfdVar.v(1781157691);
        dhf a = gkw.a(false, 20.0f, 0L, 4);
        boolean i2 = i(dmncVar, dmnhVar);
        hfdVar.v(-1457405999);
        hfm hfmVar = (hfm) hfdVar;
        Object R = hfmVar.R();
        if (R == hfc.a) {
            R = new dwn();
            hfmVar.ad(R);
        }
        dwn dwnVar = (dwn) R;
        hfmVar.Z();
        jjj jjjVar = new jjj(0);
        hfdVar.v(-1457411423);
        boolean z = ((((i & 112) ^ 48) > 32 && hfdVar.D(dmnhVar)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && hfdVar.D(dmncVar)) || (i & 384) == 256);
        Object R2 = hfmVar.R();
        if (z || R2 == hfc.a) {
            R2 = new ffix() { // from class: dmlb
                @Override // defpackage.ffix
                public final Object invoke() {
                    dmnh.this.i.invoke(dmncVar);
                    return ffcu.a;
                }
            };
            hfmVar.ad(R2);
        }
        hfmVar.Z();
        hvi c = dfb.c(hviVar, dwnVar, a, i2, null, jjjVar, (ffix) R2, 8);
        hfmVar.Z();
        return c;
    }
}
