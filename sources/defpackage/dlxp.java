package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateUtils;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlxp {
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.hfd r8, int r9) {
        /*
            r0 = -1192737813(0xffffffffb8e843eb, float:-1.1075273E-4)
            hfd r8 = r8.b(r0)
            if (r9 != 0) goto L16
            boolean r9 = r8.I()
            r0 = 0
            if (r9 != 0) goto L12
            r9 = r0
            goto L16
        L12:
            r8.s()
            goto L35
        L16:
            hve r0 = defpackage.hvi.e
            hvi r0 = defpackage.ebs.t(r0)
            dncj r1 = new dncj
            dmzz r2 = defpackage.dmzz.aV
            r3 = 2132082981(0x7f150125, float:1.9806091E38)
            java.lang.String r3 = defpackage.jii.a(r3, r8)
            r6 = 0
            r7 = 124(0x7c, float:1.74E-43)
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r2 = 48
            defpackage.dnch.d(r1, r0, r8, r2)
            r0 = r9
        L35:
            hio r8 = r8.L()
            if (r8 == 0) goto L42
            dlwy r9 = new dlwy
            r9.<init>()
            r8.d = r9
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlxp.a(hfd, int):void");
    }

    public static final void b(final dlvj dlvjVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1169773195);
        if (i3 == 0) {
            i2 = (true != b.D(dlvjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            h(null, 0, 0, hpx.d(-4839771, new dlxk(dlvjVar), b), b, 3072, 7);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlws
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dlxp.b(dlvj.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final long j, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1699371756);
        if (i3 == 0) {
            i2 = (true != b.C(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            h(null, 0, 0, hpx.d(-534438332, new dlxl(j), b), b, 3072, 7);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlwm
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dlxp.c(j, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final long j, final long j2, hfd hfdVar, final int i) {
        long j3;
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1330133905);
        if (i3 == 0) {
            j3 = j;
            i2 = i | (true != b.C(j3) ? 2 : 4);
        } else {
            j3 = j;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.C(j2) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            gpa.c(eba.d(ebs.k(hvi.e, 48.0f), 7.0f), eqm.a, j3, 0L, 0.0f, 0.0f, null, hpx.d(-2059771596, new dlxm(j2), b), b, 120);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlwr
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    long j4 = j;
                    dlxp.d(j4, j2, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final dlvn dlvnVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1686834829);
        if (i3 == 0) {
            i2 = (true != b.D(dlvnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            h(jfw.a(hvi.e, "audio_bubble_loading"), 0, 0, hpx.d(-463430723, new dlxn(dlvnVar), b), b, 3078, 6);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlwn
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dlxp.e(dlvn.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final ebq ebqVar, final long j, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        hvi c;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1037370465);
        if (i3 == 0) {
            i2 = (true != b.D(ebqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.C(j) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            final String a2 = jii.a(R.string.audiobubble_loading_slider_content_description, b);
            a = ebqVar.a(hvi.e, 1.0f, true);
            hvi d = doaq.d(hxo.a(ebs.e(eba.i(a, 8.0f, 0.0f, 2), 4.0f), gft.c(b).a), new ibw(j), 6);
            b.v(916084273);
            boolean D = b.D(a2);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new ffji() { // from class: dlwo
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jkv jkvVar = (jkv) obj;
                        jkvVar.getClass();
                        jkr.k(jkvVar, a2);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            c = jjs.c(d, false, (ffji) R);
            dyc.b(c, b, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlwp
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ebq ebqVar2 = ebq.this;
                    int i4 = i;
                    dlxp.f(ebqVar2, j, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void g(final boolean z, final ffix ffixVar, final long j, hfd hfdVar, final int i) {
        int i2;
        ffix ffixVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-2032552469);
        if (i3 == 0) {
            i2 = (true != b.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            ffixVar2 = ffixVar;
            i2 |= true != b.F(ffixVar2) ? 16 : 32;
        } else {
            ffixVar2 = ffixVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.C(j) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            dwhl.b(ffixVar2, null, false, null, null, hpx.d(-1929471731, new dlxo(z ? dmzz.cD : dmzz.cW, z ? R.string.audiobubble_pause_button_content_description : R.string.audiobubble_play_button_content_description, j), b), b, ((i2 >> 3) & 14) | 1572864, 62);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlwq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z2 = z;
                    ffix ffixVar3 = ffixVar;
                    dlxp.g(z2, ffixVar3, j, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void h(hvi hviVar, int i, int i2, final ffjn ffjnVar, hfd hfdVar, final int i3, final int i4) {
        int i5;
        int i6 = i4 & 1;
        hfd b = hfdVar.b(-1572672345);
        if (i6 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (true != b.D(hviVar) ? 2 : 4) | i3;
        } else {
            i5 = i3;
        }
        int i7 = i5 | 432;
        if ((i3 & 3072) == 0) {
            i7 |= true != b.F(ffjnVar) ? 1024 : 2048;
        }
        if ((i7 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            if (i6 != 0) {
                hviVar = hvi.e;
            }
            hvi f = eba.f(hviVar, 12.0f, 12.0f, 16.0f, 12.0f);
            int i8 = huo.a;
            int i9 = (i7 & 7168) | 384;
            ipn a = ebm.a(dxu.a, hum.n, b, 48);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, f);
            int i10 = ist.a;
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
            ffjnVar.a(ebr.a, b, Integer.valueOf(((i9 >> 6) & 112) | 6));
            b.n();
            i2 = 12;
            i = 16;
        }
        final hvi hviVar2 = hviVar;
        final int i11 = i;
        final int i12 = i2;
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlwz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar3 = hvi.this;
                    int i13 = i11;
                    int i14 = i12;
                    dlxp.h(hviVar3, i13, i14, ffjnVar, (hfd) obj, hip.a(i3 | 1), i4);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void i(final ebq ebqVar, final dlvo dlvoVar, final long j, final long j2, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        hvi c;
        int i3 = i & 6;
        hfd b = hfdVar.b(-928818076);
        if (i3 == 0) {
            i2 = (true != b.D(ebqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dlvoVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.C(j) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.C(j2) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            final String a2 = jii.a(R.string.audiobubble_slider_content_description, b);
            b.v(-739783068);
            final String string = ((Context) b.e(AndroidCompositionLocals_androidKt.b)).getResources().getString(R.string.audiobubble_slider_state_description, Integer.valueOf((int) (dlvoVar.a * 100.0f)));
            string.getClass();
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            a = ebqVar.a(hvi.e, 1.0f, true);
            b.v(-1018655157);
            boolean D = b.D(a2) | b.D(string);
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new ffji() { // from class: dlwt
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jkv jkvVar = (jkv) obj;
                        jkvVar.getClass();
                        jkr.k(jkvVar, a2);
                        jkr.t(jkvVar, string);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            c = jjs.c(a, false, (ffji) R);
            float f = dlvoVar.a;
            ffmf ffmfVar = new ffmf(0.0f, 1.0f);
            ffix ffixVar = dlvoVar.c;
            gmm c2 = dwiv.c(j, j, j2, b, 1012);
            b.v(-1018649137);
            int i4 = i2 & 112;
            Object R2 = hfmVar.R();
            if (i4 == 32 || R2 == hfc.a) {
                R2 = new ffji() { // from class: dlwu
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        Float f2 = (Float) obj;
                        f2.floatValue();
                        dlvo.this.b.invoke(f2);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            dwja.b(f, (ffji) R2, c, false, ffmfVar, ffixVar, c2, null, b, 0);
            b = b;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlwv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ebq ebqVar2 = ebq.this;
                    dlvo dlvoVar2 = dlvoVar;
                    long j3 = j;
                    dlxp.i(ebqVar2, dlvoVar2, j3, j2, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void j(final long j, final long j2, hfd hfdVar, final int i) {
        int i2;
        long j3;
        final String string;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-2004999742);
        if (i3 == 0) {
            i2 = i | (true != b.C(j) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j3 = j2;
            i2 |= true != b.C(j3) ? 16 : 32;
        } else {
            j3 = j2;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            long j4 = j / 1000;
            b.v(-1086667073);
            Resources resources = ((Context) b.e(AndroidCompositionLocals_androidKt.b)).getResources();
            int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(j);
            int seconds = ((int) TimeUnit.MILLISECONDS.toSeconds(j)) % 60;
            if (minutes == 0) {
                string = resources.getQuantityString(R.plurals.audiobubble_timer_seconds_content_description, seconds, Integer.valueOf(seconds));
                string.getClass();
                ((hfm) b).Z();
            } else if (seconds == 0) {
                string = resources.getQuantityString(R.plurals.audiobubble_timer_minutes_content_description, minutes, Integer.valueOf(minutes));
                string.getClass();
                ((hfm) b).Z();
            } else {
                if (minutes == 1) {
                    if (seconds == 1) {
                        string = resources.getString(R.string.audiobubble_timer_minute_second_content_description);
                        string.getClass();
                        ((hfm) b).Z();
                    } else {
                        minutes = 1;
                    }
                }
                if (minutes > 1 && seconds == 1) {
                    string = resources.getString(R.string.audiobubble_timer_minutes_second_content_description, Integer.valueOf(minutes));
                    string.getClass();
                    ((hfm) b).Z();
                } else if (minutes != 1 || seconds <= 1) {
                    string = resources.getString(R.string.audiobubble_timer_minutes_seconds_content_description, Integer.valueOf(minutes), Integer.valueOf(seconds));
                    string.getClass();
                    ((hfm) b).Z();
                } else {
                    string = resources.getString(R.string.audiobubble_timer_minute_seconds_content_description, Integer.valueOf(seconds));
                    string.getClass();
                    ((hfm) b).Z();
                }
            }
            hvi j5 = eba.j(hvi.e, 4.0f, 0.0f, 0.0f, 0.0f, 14);
            b.v(1179636548);
            boolean D = b.D(string);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new ffji() { // from class: dlww
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jkv jkvVar = (jkv) obj;
                        jkvVar.getClass();
                        jkr.k(jkvVar, string);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hvi c = jjs.c(j5, true, (ffji) R);
            String formatElapsedTime = DateUtils.formatElapsedTime(j4);
            formatElapsedTime.getClass();
            hfdVar2 = b;
            dwjt.b(formatElapsedTime, c, j3, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jpo.y(gft.d(b).n, 0L, 0L, null, null, null, "tnum", 0L, null, 0, 0, 0L, null, null, 0, 16777151), hfdVar2, (i2 << 3) & 896, 0, 65528);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlwx
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    long j6 = j;
                    dlxp.j(j6, j2, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void l(final dlvq dlvqVar, final hvi hviVar, final idh idhVar, hfd hfdVar, final int i) {
        int i2;
        hfd b = hfdVar.b(-1450374329);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dlvqVar) ? 2 : 4) | i;
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
            ffcu ffcuVar = ffcu.a;
            b.v(1694968079);
            int i4 = i3 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new ffji() { // from class: dlxa
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((hgp) obj).getClass();
                        return new dlxj(dlvq.this);
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hgs.c(ffcuVar, (ffji) R, b);
            douq.a(hpx.d(-1946799448, new dlxi(dlvqVar, hviVar, idhVar, (kah) b.e(jdr.j)), b), b, 6);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlxb
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlvq dlvqVar2 = dlvq.this;
                    hvi hviVar2 = hviVar;
                    int i5 = i;
                    dlxp.l(dlvqVar2, hviVar2, idhVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
