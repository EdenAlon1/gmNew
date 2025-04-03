package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.vcard.VCardConfig;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvyu {
    private final dvzc a;

    public dvyu(dvzc dvzcVar) {
        this.a = dvzcVar;
    }

    public static final void c(ffix ffixVar) {
        ffixVar.invoke();
    }

    public final void a(final int i, final dvxb[] dvxbVarArr, final dvxc[] dvxcVarArr, final ffjm ffjmVar, final ffjm ffjmVar2, hfd hfdVar, final int i2) {
        final dvxe dvxeVar;
        int i3 = i2 & 6;
        hfd b = hfdVar.b(1083810443);
        int i4 = i3 == 0 ? (true != b.B(i) ? 2 : 4) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= true != b.F(dvxbVarArr) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != b.F(dvxcVarArr) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != b.F(null) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != b.F(null) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != b.E(false) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i4 |= true != b.F(ffjmVar) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != b.F(null) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i2) == 0) {
            i4 |= true != b.F(ffjmVar2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i2) == 0) {
            i4 |= true != b.D(this) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((306783379 & i4) == 306783378 && b.I()) {
            b.s();
        } else {
            b.t();
            if ((i2 & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            b.v(865374248);
            hik hikVar = dvyx.a;
            int length = dvxcVarArr.length;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    Object obj = dvxcVarArr[i5].b;
                    if ((obj instanceof dwce) && ((dwce) obj).d) {
                        dvxeVar = null;
                        break;
                    }
                    i5++;
                } else {
                    b.v(865380126);
                    Object e = b.e(dvyx.a);
                    hfm hfmVar = (hfm) b;
                    hfmVar.Z();
                    if (e != null) {
                        b.v(1057006978);
                        dvxeVar = (dvxe) b.e(dvyx.a);
                        hfmVar.Z();
                    } else {
                        b.v(1057114083);
                        dvxe dvxeVar2 = null;
                        for (View view = (View) b.e(AndroidCompositionLocals_androidKt.g); view != null; view = (View) view.getParent()) {
                            dvxeVar2 = dvxv.c(view);
                            if (dvxeVar2 != null || view.getId() == 16908290) {
                                break;
                            }
                        }
                        dvxeVar = dvxeVar2;
                        hfmVar.Z();
                    }
                }
            }
            hfm hfmVar2 = (hfm) b;
            hfmVar2.Z();
            b.v(865401237);
            dvyr dvyrVar = new dvyr(i, dvxbVarArr, dvxcVarArr);
            b.v(865401950);
            boolean D = b.D(dvyrVar);
            Object R = hfmVar2.R();
            if (D || R == hfc.a) {
                dvwz dvwzVar = new dvwz(dvxd.a(i), new emwl() { // from class: dwcn
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        dvxe dvxeVar3 = (dvxe) obj2;
                        dwcl dwclVar = new dwcl(dvxeVar3);
                        dvxeVar3.f = dwclVar;
                        dwclVar.l();
                        return dvxeVar3;
                    }
                }, this.a, null);
                int length2 = dvxbVarArr.length;
                for (dvxc dvxcVar : dvxcVarArr) {
                    dvwzVar.g(dvxcVar);
                }
                R = dvwzVar.a();
                hfmVar2.ad(R);
            }
            final dvxe dvxeVar3 = (dvxe) R;
            hfmVar2.Z();
            hfmVar2.Z();
            hfz.a(dvyx.a.c(dvxeVar3), ffjmVar2, b, ((i4 >> 21) & 112) | 8);
            b.v(865424670);
            boolean F = b.F(dvxeVar) | b.F(dvxeVar3);
            boolean z = (3670016 & i4) == 1048576;
            boolean z2 = (i4 & 14) == 4;
            int i6 = i4;
            boolean z3 = (458752 & i4) == 131072;
            boolean z4 = (i6 & 1879048192) == 536870912;
            Object R2 = hfmVar2.R();
            if ((F | z | z2 | z3 | z4) || R2 == hfc.a) {
                R2 = new ffji() { // from class: dvym
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        ((hgp) obj2).getClass();
                        final dvxe dvxeVar4 = dvxe.this;
                        final dvxe dvxeVar5 = dvxeVar3;
                        final ffjm ffjmVar3 = ffjmVar;
                        final int i7 = i;
                        dvyu.c(new ffix() { // from class: dvyo
                            @Override // defpackage.ffix
                            public final Object invoke() {
                                dvxe dvxeVar6 = dvxe.this;
                                dvxe dvxeVar7 = dvxeVar5;
                                if (dvxeVar6 == null) {
                                    dvxeVar7.f.h();
                                } else {
                                    Object d = dvxeVar7.f.d();
                                    if (d != null) {
                                        int i8 = i7;
                                        ffjm ffjmVar4 = ffjmVar3;
                                        if (ffkj.e(d, dvxeVar6)) {
                                            ffjmVar4.a(Integer.valueOf(i8), "CVE is already linked to the same parent");
                                        } else {
                                            ffjmVar4.a(Integer.valueOf(i8), "CVE is already linked to a different parent");
                                        }
                                    } else {
                                        dvxeVar6.f.e(dvxeVar7);
                                    }
                                }
                                return ffcu.a;
                            }
                        });
                        return new dvyt(dvxeVar4, dvxeVar5, ffjmVar3, i7);
                    }
                };
                hfmVar2.ad(R2);
            }
            hfmVar2.Z();
            hgs.b(dvxeVar, dvxeVar3, (ffji) R2, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dvyn
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dvyu dvyuVar = dvyu.this;
                    int i7 = i;
                    dvxb[] dvxbVarArr2 = dvxbVarArr;
                    dvxc[] dvxcVarArr2 = dvxcVarArr;
                    ffjm ffjmVar3 = ffjmVar;
                    dvyuVar.a(i7, dvxbVarArr2, dvxcVarArr2, ffjmVar3, ffjmVar2, (hfd) obj2, hip.a(i2 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public final void b(final int i, dvxb[] dvxbVarArr, dvxc[] dvxcVarArr, ffjm ffjmVar, final ffjm ffjmVar2, hfd hfdVar, final int i2, final int i3) {
        int i4;
        int i5;
        dvxb[] dvxbVarArr2;
        dvxc[] dvxcVarArr2;
        ffjm ffjmVar3;
        dvxc[] dvxcVarArr3;
        dvxc[] dvxcVarArr4;
        dvxb[] dvxbVarArr3;
        ffjm ffjmVar4;
        final dvxb[] dvxbVarArr4;
        final dvxc[] dvxcVarArr5;
        final ffjm ffjmVar5;
        ffjmVar2.getClass();
        int i6 = i3 & 1;
        hfd b = hfdVar.b(-2099895634);
        if (i6 != 0) {
            i5 = i2 | 6;
            i4 = i;
        } else if ((i2 & 6) == 0) {
            i4 = i;
            i5 = (true != b.B(i4) ? 2 : 4) | i2;
        } else {
            i4 = i;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            int i7 = 16;
            if ((i3 & 2) == 0) {
                dvxbVarArr2 = dvxbVarArr;
                if (b.F(dvxbVarArr2)) {
                    i7 = 32;
                }
            } else {
                dvxbVarArr2 = dvxbVarArr;
            }
            i5 |= i7;
        } else {
            dvxbVarArr2 = dvxbVarArr;
        }
        if ((i2 & 384) == 0) {
            int i8 = 128;
            if ((i3 & 4) == 0) {
                dvxcVarArr2 = dvxcVarArr;
                if (b.F(dvxcVarArr2)) {
                    i8 = 256;
                }
            } else {
                dvxcVarArr2 = dvxcVarArr;
            }
            i5 |= i8;
        } else {
            dvxcVarArr2 = dvxcVarArr;
        }
        int i9 = i5 | 1797120;
        if ((i2 & 12582912) == 0) {
            ffjmVar3 = ffjmVar2;
            i9 |= true != b.F(ffjmVar3) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            ffjmVar3 = ffjmVar2;
        }
        if ((100663296 & i2) == 0) {
            i9 |= true != b.D(this) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((38347923 & i9) == 38347922 && b.I()) {
            b.s();
            ffjmVar5 = ffjmVar;
            dvxcVarArr5 = dvxcVarArr2;
            dvxbVarArr4 = dvxbVarArr2;
        } else {
            int i10 = i3 & 4;
            int i11 = i3 & 2;
            b.t();
            if ((i2 & 1) == 0 || b.G()) {
                if (i11 != 0) {
                    i9 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                    dvxbVarArr2 = new dvxb[0];
                }
                if (i10 != 0) {
                    dvxcVarArr3 = new dvxc[0];
                    i9 &= -897;
                } else {
                    dvxcVarArr3 = dvxcVarArr2;
                }
                b.v(865342066);
                hfm hfmVar = (hfm) b;
                Object R = hfmVar.R();
                if (R == hfc.a) {
                    R = new ffjm() { // from class: dvyp
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj).intValue();
                            ((String) obj2).getClass();
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R);
                }
                hfmVar.Z();
                dvxcVarArr4 = dvxcVarArr3;
                dvxbVarArr3 = dvxbVarArr2;
                ffjmVar4 = (ffjm) R;
            } else {
                b.s();
                if (i11 != 0) {
                    i9 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                }
                if (i10 != 0) {
                    i9 &= -897;
                }
                ffjmVar4 = ffjmVar;
                dvxbVarArr3 = dvxbVarArr2;
                dvxcVarArr4 = dvxcVarArr2;
            }
            b.l();
            int i12 = i9 << 3;
            a(i4, dvxbVarArr3, dvxcVarArr4, ffjmVar4, ffjmVar3, b, (i9 & 3670016) | (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (234881024 & i12) | (1879048192 & i12));
            dvxbVarArr4 = dvxbVarArr3;
            dvxcVarArr5 = dvxcVarArr4;
            ffjmVar5 = ffjmVar4;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dvyq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dvyu dvyuVar = dvyu.this;
                    int i13 = i;
                    dvxb[] dvxbVarArr5 = dvxbVarArr4;
                    dvxc[] dvxcVarArr6 = dvxcVarArr5;
                    ffjm ffjmVar6 = ffjmVar5;
                    dvyuVar.b(i13, dvxbVarArr5, dvxcVarArr6, ffjmVar6, ffjmVar2, (hfd) obj, hip.a(i2 | 1), i3);
                    return ffcu.a;
                }
            };
        }
    }
}
