package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.EditText;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsjw {
    public static final void a(dsjn dsjnVar, final Void[] voidArr, final CharSequence charSequence, final hvi hviVar, final jpo jpoVar, final euw euwVar, final euv euvVar, final float f, final float f2, final float f3, final Integer num, final Integer num2, final boolean z, final boolean z2, final dsjx dsjxVar, boolean z3, hfd hfdVar, final int i, final int i2) {
        int i3;
        jpo jpoVar2;
        int i4;
        boolean z4;
        int i5;
        int i6;
        boolean z5;
        hvi a;
        Object obj;
        int i7;
        hfd hfdVar2;
        boolean z6;
        hfm hfmVar;
        hfd hfdVar3;
        final boolean z7;
        final dsjn dsjnVar2 = dsjnVar;
        Void[] voidArr2 = voidArr;
        voidArr2.getClass();
        int i8 = i & 6;
        hfd b = hfdVar.b(1587046059);
        if (i8 == 0) {
            i3 = (true != b.D(dsjnVar2) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 384) == 0) {
            i3 |= true != b.F(charSequence) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != b.D(hviVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            jpoVar2 = jpoVar;
            i3 |= true != b.D(jpoVar2) ? 8192 : 16384;
        } else {
            jpoVar2 = jpoVar;
        }
        if ((i & 196608) == 0) {
            i3 |= true != b.D(euwVar) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            i3 |= true != b.D(euvVar) ? 524288 : 1048576;
        }
        if ((i & 12582912) == 0) {
            i4 = 12582912;
            z4 = true;
            i3 |= true != b.A(f) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            i4 = 12582912;
            z4 = true;
        }
        if ((i & 100663296) == 0) {
            i3 |= z4 != b.A(f2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((i & 805306368) == 0) {
            i3 |= true != b.A(f3) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            i5 = (true != b.D(num) ? 2 : 4) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i6 = i3;
            z5 = true;
            i5 |= true != b.D(num2) ? 16 : 32;
        } else {
            i6 = i3;
            z5 = true;
        }
        if ((i2 & 384) == 0) {
            i5 |= z5 == b.E(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= z5 == b.E(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= z5 == b.D(dsjxVar) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= z5 == b.D(null) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= z5 != b.A(0.0f) ? 524288 : 1048576;
        }
        if ((i2 & i4) == 0) {
            i5 |= z5 != b.E(z3) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        int i9 = i5;
        b.u(-1190125483, Integer.valueOf(voidArr2.length));
        int i10 = 0;
        while (i10 < voidArr2.length) {
            i6 |= true != b.F(voidArr2[i10]) ? 0 : 32;
            i10++;
            voidArr2 = voidArr;
        }
        hfm hfmVar2 = (hfm) b;
        hfmVar2.Z();
        if ((i6 & 112) == 0) {
            i6 |= 16;
        }
        if ((i6 & 306783363) == 306783362 && (4793491 & i9) == 4793490 && b.I()) {
            b.s();
            z7 = z3;
            hfdVar3 = b;
        } else {
            final jzn jznVar = (jzn) b.e(jdr.e);
            final jse jseVar = (jse) b.e(jdr.g);
            final kah kahVar = (kah) b.e(jdr.j);
            b.v(-1190096316);
            Object R = hfmVar2.R();
            if (R == hfc.a) {
                R = new ixm();
                hfmVar2.ad(R);
            }
            final ixm ixmVar = (ixm) R;
            hfmVar2.Z();
            b.v(-1190094496);
            Object R2 = hfmVar2.R();
            if (R2 == hfc.a) {
                hic hicVar = new hic(false, hla.a);
                hfmVar2.ad(hicVar);
                R2 = hicVar;
            }
            hfmVar2.Z();
            b.v(-1190091763);
            boolean F = b.F(jseVar);
            boolean z8 = (i9 & 7168) == 2048;
            boolean F2 = F | z8 | b.F(charSequence);
            Object R3 = hfmVar2.R();
            if (F2 || R3 == hfc.a) {
                R3 = new ffji() { // from class: dsjo
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        Context context = (Context) obj2;
                        context.getClass();
                        dsjf dsjfVar = new dsjf(context, jse.this);
                        dsjfVar.o = z2;
                        dsjfVar.setText(charSequence);
                        dsjfVar.setSelection(dsjfVar.length());
                        dsjfVar.setId(R.id.compose_message_text);
                        dsjfVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        dsjfVar.setGravity(16);
                        dsjfVar.requestFocus();
                        return dsjfVar;
                    }
                };
                hfmVar2.ad(R3);
            }
            ffji ffjiVar = (ffji) R3;
            hfmVar2.Z();
            hvi f4 = ebs.f(hviVar, f2, f3);
            b.v(-1190067442);
            boolean z9 = (458752 & i9) == 131072;
            boolean F3 = b.F(ixmVar) | z9;
            Object R4 = hfmVar2.R();
            if (F3 || R4 == hfc.a) {
                R4 = new ffji() { // from class: dsjp
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        dsjf dsjfVar;
                        hzo hzoVar = (hzo) obj2;
                        hzoVar.getClass();
                        if (hzoVar.b() && ffkj.e(null, true) && (dsjfVar = (dsjf) ixm.this.a) != null) {
                            dsjfVar.performClick();
                            dsjfVar.performAccessibilityAction(16, Bundle.EMPTY);
                        }
                        return ffcu.a;
                    }
                };
                hfmVar2.ad(R4);
            }
            hfmVar2.Z();
            hvi a2 = hyf.a(f4, (ffji) R4);
            a2.getClass();
            ixmVar.getClass();
            a = dfz.a(jjs.c(a2, true, new ffji() { // from class: dsic
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    long a3;
                    jkv jkvVar = (jkv) obj2;
                    jkvVar.getClass();
                    jkr.v(jkvVar, new jlm((String) charSequence));
                    final ixm ixmVar2 = ixmVar;
                    jkr.J(jkvVar, new ffji() { // from class: dshy
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj3) {
                            jlm jlmVar = (jlm) obj3;
                            jlmVar.getClass();
                            EditText editText = (EditText) ixm.this.a;
                            if (editText != null) {
                                editText.setText(jlmVar.b);
                            }
                            return true;
                        }
                    });
                    jkr.G(jkvVar, new ffix() { // from class: dshz
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            EditText editText = (EditText) ixm.this.a;
                            boolean z10 = false;
                            if (editText != null && editText.requestFocus()) {
                                z10 = true;
                            }
                            return Boolean.valueOf(z10);
                        }
                    });
                    jkr.E(jkvVar, new ffji() { // from class: dsia
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj3) {
                            boolean z10;
                            jlm jlmVar = (jlm) obj3;
                            jlmVar.getClass();
                            EditText editText = (EditText) ixm.this.a;
                            if (editText != null) {
                                int selectionStart = editText.getSelectionStart();
                                editText.getText().replace(selectionStart, editText.getSelectionEnd(), jlmVar);
                                editText.setSelection(ffmk.g(selectionStart + jlmVar.a(), editText.length()));
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            return Boolean.valueOf(z10);
                        }
                    });
                    EditText editText = (EditText) ixmVar2.a;
                    if (editText != null) {
                        a3 = jpn.a(editText.getSelectionStart(), editText.getSelectionEnd());
                        long j = jpm.a;
                    } else {
                        a3 = jpn.a(0, 0);
                        long j2 = jpm.a;
                    }
                    jkr.w(jkvVar, a3);
                    jkr.I(jkvVar, new ffjn() { // from class: dsib
                        @Override // defpackage.ffjn
                        public final Object a(Object obj3, Object obj4, Object obj5) {
                            int intValue = ((Integer) obj3).intValue();
                            int intValue2 = ((Integer) obj4).intValue();
                            ((Boolean) obj5).booleanValue();
                            EditText editText2 = (EditText) ixm.this.a;
                            boolean z10 = false;
                            if (editText2 != null && editText2.isEnabled() && intValue >= 0 && intValue2 <= editText2.length()) {
                                editText2.setSelection(intValue, intValue2);
                                z10 = true;
                            }
                            return Boolean.valueOf(z10);
                        }
                    });
                    return ffcu.a;
                }
            }), true, null);
            b.v(-1190056808);
            boolean F4 = b.F(ixmVar) | b.D(jznVar);
            boolean z10 = (i9 & 3670016) == 1048576;
            Object R5 = hfmVar2.R();
            if ((z10 | F4) || R5 == hfc.a) {
                R5 = new ffji() { // from class: dsjq
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        kaf kafVar = (kaf) obj2;
                        dsjf dsjfVar = (dsjf) ixm.this.a;
                        if (dsjfVar != null) {
                            dsjfVar.setImportantForAccessibility(((int) (kafVar.a & 4294967295L)) == jznVar.eo(0.0f) ? 2 : 1);
                        }
                        return ffcu.a;
                    }
                };
                hfmVar2.ad(R5);
            }
            hfmVar2.Z();
            hvi a3 = iqd.a(a, (ffji) R5);
            b.v(-1190044500);
            boolean F5 = ((i6 & 3670016) == 1048576) | b.F(ixmVar) | b.D(jznVar) | ((i6 & 57344) == 16384) | ((i6 & 458752) == 131072) | b.D(kahVar);
            boolean z11 = (i6 & 29360128) == 8388608;
            boolean z12 = (i6 & 234881024) == 67108864;
            boolean z13 = (i6 & 1879048192) == 536870912;
            boolean z14 = (i9 & 112) == 32;
            boolean z15 = (i9 & 896) == 256;
            boolean z16 = (57344 & i9) == 16384;
            boolean z17 = (i6 & 14) == 4;
            boolean z18 = (i9 & 14) == 4;
            Object R6 = hfmVar2.R();
            if ((z18 || (F5 | z11 | z12 | z13 | z14 | z15 | z8 | z16 | z9 | z17)) || R6 == hfc.a) {
                dsjnVar2 = dsjnVar;
                i7 = i9;
                hfdVar2 = b;
                z6 = true;
                final jpo jpoVar3 = jpoVar2;
                obj = new ffji() { // from class: dsjr
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        dsjf dsjfVar = (dsjf) obj2;
                        dsjfVar.getClass();
                        ixm.this.a = dsjfVar;
                        jzn jznVar2 = jznVar;
                        jznVar2.getClass();
                        dsjfVar.e = jznVar2;
                        ffmx ffmxVar = dsjf.a[0];
                        ffls fflsVar = dsjfVar.f;
                        jpo jpoVar4 = jpoVar3;
                        fflsVar.d(ffmxVar, jpoVar4);
                        dsjfVar.h.d(dsjf.a[2], euwVar);
                        dsjfVar.i.d(dsjf.a[3], euvVar);
                        dsjfVar.g.d(dsjf.a[1], kahVar);
                        dsjfVar.j.d(dsjf.a[4], new jzq(f));
                        dsjfVar.k.d(dsjf.a[5], new jzq(f2));
                        dsjfVar.l.d(dsjf.a[6], new jzq(f3));
                        dsjfVar.m.d(dsjf.a[7], num2);
                        dsjfVar.n = z;
                        dsjfVar.o = z2;
                        dsjfVar.p.d(dsjf.a[8], dsjxVar);
                        dsjfVar.q.d(dsjf.a[9], null);
                        if (Build.VERSION.SDK_INT >= 29) {
                            if (dsjfVar.getWidth() <= 0 || dsjfVar.getHeight() <= 0) {
                                dsjfVar.getViewTreeObserver().addOnGlobalLayoutListener(new dsju(dsjfVar, dsjfVar, jpoVar4, jznVar2));
                            } else {
                                dsjfVar.getWidth();
                                int height = dsjfVar.getHeight();
                                ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
                                shapeDrawable.getPaint().setColor(iby.b(jpoVar4.f()));
                                shapeDrawable.setIntrinsicHeight(height);
                                shapeDrawable.setIntrinsicWidth(Integer.valueOf(jznVar2.eo(2.0f)).intValue());
                                shapeDrawable.setBounds(0, 0, shapeDrawable.getIntrinsicWidth(), shapeDrawable.getIntrinsicHeight());
                                dsjfVar.setTextCursorDrawable(shapeDrawable);
                            }
                        }
                        dsjn dsjnVar3 = dsjnVar2;
                        dqmw c = dsjfVar.c();
                        c.getClass();
                        dsjnVar3.a(new dsjl(dsjfVar, c));
                        dsjfVar.setMaxLines(dsjfVar.c().a().length() != 0 ? num.intValue() : 1);
                        dsjfVar.setEllipsize(TextUtils.TruncateAt.END);
                        return ffcu.a;
                    }
                };
                ixmVar = ixmVar;
                hfmVar = hfmVar2;
                hfmVar.ad(obj);
            } else {
                i7 = i9;
                hfdVar2 = b;
                obj = R6;
                z6 = true;
                dsjnVar2 = dsjnVar;
                hfmVar = hfmVar2;
            }
            hfmVar.Z();
            hfdVar3 = hfdVar2;
            kcg.b(ffjiVar, a3, (ffji) obj, hfdVar3, 0, 0);
            ffcu ffcuVar = ffcu.a;
            hfdVar3.v(-1190000356);
            boolean F6 = z17 | hfdVar3.F(ixmVar);
            boolean z19 = (i7 & 29360128) == 8388608 ? z6 : false;
            Object R7 = hfmVar.R();
            if ((F6 || z19) || R7 == hfc.a) {
                z7 = z3;
                R7 = new ffji() { // from class: dsjs
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        ((hgp) obj2).getClass();
                        return new dsjv(dsjn.this, ixmVar, z7);
                    }
                };
                hfmVar.ad(R7);
            } else {
                z7 = z3;
            }
            hfmVar.Z();
            hgs.c(ffcuVar, (ffji) R7, hfdVar3);
        }
        hio L = hfdVar3.L();
        if (L != null) {
            final boolean z20 = z7;
            final dsjn dsjnVar3 = dsjnVar2;
            L.d = new ffjm() { // from class: dsjt
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    Void[] voidArr3 = voidArr;
                    Void[] voidArr4 = (Void[]) Arrays.copyOf(voidArr3, voidArr3.length);
                    CharSequence charSequence2 = charSequence;
                    hvi hviVar2 = hviVar;
                    jpo jpoVar4 = jpoVar;
                    euw euwVar2 = euwVar;
                    euv euvVar2 = euvVar;
                    float f5 = f;
                    float f6 = f2;
                    float f7 = f3;
                    Integer num3 = num;
                    Integer num4 = num2;
                    boolean z21 = z;
                    boolean z22 = z2;
                    dsjx dsjxVar2 = dsjxVar;
                    int i11 = i;
                    dsjw.a(dsjn.this, voidArr4, charSequence2, hviVar2, jpoVar4, euwVar2, euvVar2, f5, f6, f7, num3, num4, z21, z22, dsjxVar2, z20, (hfd) obj2, hip.a(i11 | 1), hip.a(i2));
                    return ffcu.a;
                }
            };
        }
    }
}
