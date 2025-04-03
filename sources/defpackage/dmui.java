package defpackage;

import com.google.android.apps.messaging.R;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmui {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final hvi hviVar, final dmvg dmvgVar, hfd hfdVar, final int i) {
        int i2;
        Object gcvVar;
        dmug dmugVar;
        final ZoneId zoneId;
        hfm hfmVar;
        boolean z;
        hvi c;
        hvi c2;
        hviVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-1877236062);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmvgVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            int i4 = Float.compare(dmuy.g(b), 336.0f) <= 0 ? 1 : 0;
            ZoneId systemDefault = ZoneId.systemDefault();
            systemDefault.getClass();
            Object[] objArr = new Object[0];
            b.v(-425017393);
            hfm hfmVar2 = (hfm) b;
            Object R = hfmVar2.R();
            if (R == hfc.a) {
                R = new ffix() { // from class: dmtv
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return new hic(dmuj.a, hla.a);
                    }
                };
                hfmVar2.ad(R);
            }
            hfmVar2.Z();
            final hho hhoVar = (hho) hqr.c(objArr, null, (ffix) R, b, 3072, 6);
            Instant instant = dmvgVar.b.atZone(systemDefault).k(ZoneOffset.UTC).toInstant();
            instant.getClass();
            Long valueOf = Long.valueOf(instant.toEpochMilli());
            dmug dmugVar2 = new dmug(dmvgVar);
            ebe ebeVar = gcy.a;
            fzw fzwVar = fzw.a;
            ffmj ffmjVar = fzw.b;
            Locale a = fwb.a(b);
            Object[] objArr2 = new Object[0];
            hrh a2 = hqn.a(gda.a, new gdb(dmugVar2, a));
            boolean D = b.D(valueOf) | b.D(valueOf) | b.F(ffmjVar) | b.B(i4) | b.D(dmugVar2) | b.F(a);
            Object R2 = hfmVar2.R();
            if (D || R2 == hfc.a) {
                int i5 = i4;
                dmugVar = dmugVar2;
                zoneId = systemDefault;
                gcvVar = new gcv(valueOf, valueOf, ffmjVar, i5, dmugVar, a);
                hfmVar = hfmVar2;
                z = i5;
                hfmVar.ad(gcvVar);
            } else {
                int i6 = i4;
                gcvVar = R2;
                zoneId = systemDefault;
                z = i6;
                hfmVar = hfmVar2;
                dmugVar = dmugVar2;
            }
            final gdc gdcVar = (gdc) hqr.c(objArr2, a2, (ffix) gcvVar, b, 0, 4);
            gdcVar.d.b(dmugVar);
            LocalDateTime ofInstant = LocalDateTime.ofInstant(dmvgVar.b, zoneId);
            ofInstant.getClass();
            boolean z2 = dmvgVar.c;
            int hour = ofInstant.getHour();
            int minute = ofInstant.getMinute();
            float f = guj.a;
            Object[] objArr3 = new Object[0];
            int i7 = i2;
            hrk hrkVar = new hrk(gum.a, gun.a);
            boolean B = b.B(hour) | b.B(minute) | b.E(z2);
            Object R3 = hfmVar.R();
            if (B || R3 == hfc.a) {
                R3 = new gui(hour, minute, z2);
                hfmVar.ad(R3);
            }
            final guo guoVar = (guo) hqr.c(objArr3, hrkVar, (ffix) R3, b, 0, 4);
            b.v(-424970316);
            boolean D2 = b.D(hhoVar);
            Object R4 = hfmVar.R();
            if (D2 || R4 == hfc.a) {
                R4 = new ffix() { // from class: dmtw
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dmui.b(hho.this, dmuj.b);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R4);
            }
            ffix ffixVar = (ffix) R4;
            hfmVar.Z();
            b.v(-424966898);
            boolean D3 = b.D(hhoVar);
            Object R5 = hfmVar.R();
            if (D3 || R5 == hfc.a) {
                R5 = new ffix() { // from class: dmtx
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dmui.b(hho.this, dmuj.a);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R5);
            }
            ffix ffixVar2 = (ffix) R5;
            hfmVar.Z();
            b.v(-424962923);
            boolean D4 = b.D(gdcVar) | b.F(guoVar) | b.F(zoneId);
            boolean z3 = (i7 & 112) == 32;
            Object R6 = hfmVar.R();
            if ((D4 | z3) || R6 == hfc.a) {
                R6 = new ffix() { // from class: dmty
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        Long d = gcz.this.d();
                        if (d == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        dmvg dmvgVar2 = dmvgVar;
                        ZoneId zoneId2 = zoneId;
                        gul gulVar = guoVar;
                        dmvgVar2.f.invoke(Long.valueOf(LocalDateTime.ofInstant(Instant.ofEpochMilli(d.longValue() + TimeUnit.HOURS.toMillis(gulVar.d()) + TimeUnit.MINUTES.toMillis(gulVar.e())), ZoneId.ofOffset("UTC", ZoneOffset.UTC)).q(zoneId2).toInstant().toEpochMilli()));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R6);
            }
            final ffix ffixVar3 = (ffix) R6;
            hfmVar.Z();
            int ordinal = ((dmuj) hhoVar.a()).ordinal();
            if (ordinal == 0) {
                b.v(-288074058);
                float g = z != 0 ? (dmuy.g(b) * 0.9f) / 336.0f : 1.0f;
                c = dix.c(hviVar, dix.a(0, b, 0, 1), false & ((r6 & 8) == 0), (r6 & 2) != 0, true);
                dwgo.a(dmvgVar.i, hpx.d(977108524, new dmuc(ffixVar, gdcVar), b), hya.a(c, g, g), hpx.d(1880029102, new dmud(dmvgVar), b), null, 0.0f, null, null, hpx.d(-848006397, new dmue(gdcVar), b), b, 100666416);
                b = b;
                hfmVar.Z();
            } else {
                if (ordinal != 1) {
                    b.v(-424935510);
                    hfmVar.Z();
                    throw new ffcd();
                }
                b.v(-286920858);
                c2 = dix.c(hviVar, dix.a(0, b, 0, 1), false & ((r6 & 8) == 0), (r6 & 2) != 0, true);
                ffix ffixVar4 = dmvgVar.i;
                doas doasVar = new doas(jii.a(R.string.datetime_picker_dialog_back_button, b), ffixVar2);
                doas doasVar2 = dmvgVar.g;
                String str = doasVar2 != null ? doasVar2.a : null;
                b.v(-424885218);
                if (str == null) {
                    str = jii.a(R.string.datetime_picker_dialog_finish_button, b);
                }
                hfmVar.Z();
                b.v(-424881078);
                boolean D5 = b.D(ffixVar3) | z3;
                Object R7 = hfmVar.R();
                if (D5 || R7 == hfc.a) {
                    R7 = new ffix() { // from class: dmtz
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            ffix.this.invoke();
                            doas doasVar3 = dmvgVar.g;
                            if (doasVar3 != null) {
                                doasVar3.c.invoke();
                            }
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R7);
                }
                hfmVar.Z();
                c(c2, ffixVar4, doasVar, new doas(str, (ffix) R7), hpx.d(1211234615, new dmuf(z, guoVar), b), b, 24576);
                b = b;
                hfmVar.Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmua
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    int i8 = i;
                    dmui.a(hviVar2, dmvgVar, (hfd) obj, hip.a(i8 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(hho hhoVar, dmuj dmujVar) {
        hhoVar.b(dmujVar);
    }

    public static final void c(final hvi hviVar, final ffix ffixVar, final doas doasVar, final doas doasVar2, final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        int i3 = i & 6;
        hfd b = hfdVar.b(793444922);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(doasVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(doasVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(ffjmVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
        } else {
            final String a = jii.a(R.string.time_picker_dialog_pane_title, b);
            hvi b2 = eao.b(hviVar, 1);
            hve hveVar = hvi.e;
            b.v(-1496182644);
            boolean D = b.D(a);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new ffji() { // from class: dmtt
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jkv jkvVar = (jkv) obj;
                        jkvVar.getClass();
                        jkr.o(jkvVar, a);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            c = jjs.c(hveVar, false, (ffji) R);
            dmuy.d(b2.a(c), false, ffixVar, new keh(false, 3), hpx.d(1027460724, new dmuh(doasVar2, doasVar, ffjmVar), b), b, ((i2 << 3) & 896) | 27648, 2);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmtu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    ffix ffixVar2 = ffixVar;
                    doas doasVar3 = doasVar;
                    doas doasVar4 = doasVar2;
                    dmui.c(hviVar2, ffixVar2, doasVar3, doasVar4, ffjmVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
