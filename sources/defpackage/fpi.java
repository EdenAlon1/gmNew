package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpi {
    public static final int a(iqk iqkVar) {
        if (iqkVar != null) {
            return iqkVar.b;
        }
        return 0;
    }

    public static final int b(iqk iqkVar) {
        if (iqkVar != null) {
            return iqkVar.a;
        }
        return 0;
    }

    public static final Object c(inx inxVar) {
        Object f = inxVar.f();
        iog iogVar = f instanceof iog ? (iog) f : null;
        if (iogVar != null) {
            return iogVar.b();
        }
        return null;
    }

    public static final void d(long j, jpo jpoVar, ffjm ffjmVar, hfd hfdVar, int i, int i2) {
        int i3;
        int i4 = i2 & 1;
        hfd b = hfdVar.b(-399493340);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.C(j) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.D(jpoVar) ? 16 : 32;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != b.D(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != b.F(ffjmVar) ? 1024 : 2048;
        }
        if (b.J((i3 & 1171) != 1170, i3 & 1)) {
            if (i5 != 0) {
                jpoVar = null;
            }
            hpn d = hpx.d(494684590, new fph(j, ffjmVar), b);
            if (jpoVar != null) {
                b.v(2115981348);
                fqi.a(jpoVar, d, b, ((i3 >> 3) & 14) | 48);
            } else {
                b.v(2115982984);
                d.a(b, 6);
            }
            ((hfm) b).Z();
        } else {
            b.s();
        }
        jpo jpoVar2 = jpoVar;
        hio L = b.L();
        if (L != null) {
            L.d = new fpf(j, jpoVar2, ffjmVar, i, i2);
        }
    }

    public static final void e(fqb fqbVar, String str, ffjm ffjmVar, jwn jwnVar, ffjm ffjmVar2, ffjm ffjmVar3, boolean z, dwn dwnVar, ebe ebeVar, idh idhVar, fjj fjjVar, ffjm ffjmVar4, hfd hfdVar, int i, int i2) {
        int i3;
        ffjm ffjmVar5;
        ffjm ffjmVar6;
        int i4;
        ebe ebeVar2;
        hfd hfdVar2;
        int i5 = i & 6;
        hfd b = hfdVar.b(341783750);
        if (i5 == 0) {
            i3 = (true != b.D(fqbVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != b.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            ffjmVar5 = ffjmVar;
            i3 |= true != b.F(ffjmVar5) ? 128 : 256;
        } else {
            ffjmVar5 = ffjmVar;
        }
        if ((i & 3072) == 0) {
            i3 |= true != b.D(jwnVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != b.F(ffjmVar2) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i3 |= true != b.F(null) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != b.F(null) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            ffjmVar6 = ffjmVar3;
            i3 |= true != b.F(ffjmVar6) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            ffjmVar6 = ffjmVar3;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != b.E(false) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != b.E(z) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != b.E(false) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != b.D(dwnVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            ebeVar2 = ebeVar;
            i4 |= true == b.D(ebeVar2) ? 256 : 128;
        } else {
            ebeVar2 = ebeVar;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true == b.D(idhVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true == b.D(fjjVar) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= true == b.F(ffjmVar4) ? 131072 : 65536;
        }
        if (b.J(((306783379 & i3) == 306783378 && (74899 & i4) == 74898) ? false : true, i3 & 1)) {
            boolean z2 = (i3 & 112) == 32;
            boolean z3 = (i3 & 7168) == 2048;
            hfm hfmVar = (hfm) b;
            boolean z4 = z2;
            Object R = hfmVar.R();
            if ((z4 | z3) || R == hfc.a) {
                R = jwnVar.a(new jlm(str, null, 6));
                hfmVar.ad(R);
            }
            fkw fkwVar = ((Boolean) dwj.a(dwnVar, b, (i4 >> 3) & 14).a()).booleanValue() ? fkw.a : ((jwk) R).a.b.length() == 0 ? fkw.b : fkw.c;
            fpe fpeVar = new fpe(fjjVar, z, dwnVar);
            fqj c = fla.c(b);
            jpo jpoVar = c.a;
            jpo jpoVar2 = c.d;
            boolean z5 = (ffcp.a(jpoVar.f(), ibw.h) && !ffcp.a(jpoVar2.f(), ibw.h)) || (!ffcp.a(jpoVar.f(), ibw.h) && ffcp.a(jpoVar2.f(), ibw.h));
            fqa fqaVar = fqa.a;
            b.v(1578866909);
            long f = fla.c(b).d.f();
            if (z5) {
                b.v(-1572812364);
                if (f == 16) {
                    f = ((ibw) fpeVar.a(fkwVar, b, 0)).i;
                }
                hfmVar.Z();
            } else {
                b.v(780549965);
                hfmVar.Z();
            }
            long j = f;
            hfmVar.Z();
            b.v(1578874175);
            long f2 = fla.c(b).a.f();
            if (z5) {
                b.v(-1572585196);
                if (f2 == 16) {
                    f2 = ((ibw) fpeVar.a(fkwVar, b, 0)).i;
                }
                hfmVar.Z();
            } else {
                b.v(780557293);
                hfmVar.Z();
            }
            hfmVar.Z();
            hpn d = hpx.d(225557475, new fpc(ffjmVar2, fjjVar, z, ffjmVar6, idhVar, fqbVar, ffjmVar5, ebeVar2, z5, ffjmVar4), b);
            hfdVar2 = b;
            fqaVar.a(fkwVar, j, f2, fpeVar, d, hfdVar2, 1769472);
        } else {
            hfdVar2 = b;
            hfdVar2.s();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new fpd(fqbVar, str, ffjmVar, jwnVar, ffjmVar2, ffjmVar3, z, dwnVar, ebeVar, idhVar, fjjVar, ffjmVar4, i, i2);
        }
    }
}
