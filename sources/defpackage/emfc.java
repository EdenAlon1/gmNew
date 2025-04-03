package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.compose.foundation.layout.OffsetPxElement;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emfc {
    public static final int a(int i, float f, float f2, float f3) {
        return (int) Math.max(0.0f, Math.min(f, (i - f2) - f3) - f2);
    }

    public static final long b(hho hhoVar) {
        return ((kaf) hhoVar.a()).a;
    }

    public static final void c(final emge emgeVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        int i3 = i & 6;
        hfd b = hfdVar.b(1971147004);
        if (i3 == 0) {
            i2 = (true != b.F(emgeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            fgdj fgdjVar = emgeVar.g;
            enru c2 = enru.c("com/google/chat/smartmessaging/penpal/ui/EmotifyCropUiKt");
            hkx a = hkf.a(fgdjVar, b);
            ((enrr) c2.h().h("com/google/chat/smartmessaging/penpal/ui/EmotifyCropUiKt", "EmotifyCropUi", 44, "EmotifyCropUi.kt")).t("Emotify compose constructor ui called with state: %s", a);
            b.v(-1889854839);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(new kaf(0L), hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            final hho hhoVar = (hho) R;
            hfmVar.Z();
            c = ebs.c(hvi.e, 1.0f);
            b.v(-1889851017);
            boolean F = b.F(emgeVar);
            Object R2 = hfmVar.R();
            if (F || R2 == hfc.a) {
                R2 = new ffji() { // from class: emer
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ioc iocVar = (ioc) obj;
                        iocVar.getClass();
                        if (!kaf.e(iocVar.g(), 0L)) {
                            hho hhoVar2 = hhoVar;
                            if (!kaf.e(emfc.b(hhoVar2), iocVar.g())) {
                                emge emgeVar2 = emge.this;
                                hhoVar2.b(new kaf(iocVar.g()));
                                emgeVar2.s.f(new kaf(iocVar.g()));
                            }
                        }
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hvi a2 = ipx.a(c, (ffji) R2);
            int i4 = huo.a;
            ipn a3 = dyc.a(hum.e, false);
            int a4 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a2);
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
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            b.v(-379032609);
            if (a.a() != emfz.a) {
                d(emgeVar, emgeVar.g, b, i2 & 14);
            }
            hfmVar.Z();
            b.v(-379029081);
            if (a.a() == emfz.b) {
                hvi l = ebs.l(hvi.e, emgu.a(emgeVar.n, b));
                ipn a5 = dyc.a(hum.a, false);
                int a6 = hey.a(b);
                hqb ai2 = hfmVar.ai();
                hvi b3 = huz.b(b, l);
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
                hkx a7 = hkf.a(emgeVar.j, b);
                long b4 = b(hhoVar);
                int i6 = 0;
                emhc emhcVar = emgeVar.n;
                Bitmap bitmap = (Bitmap) emgeVar.m.a();
                int width = bitmap != null ? bitmap.getWidth() : 0;
                Bitmap bitmap2 = (Bitmap) emgeVar.m.a();
                if (bitmap2 != null) {
                    i6 = bitmap2.getHeight();
                }
                emhc emhcVar2 = new emhc(width, i6);
                b.v(-538465578);
                boolean F2 = b.F(emgeVar);
                Object R3 = hfmVar.R();
                if (F2 || R3 == hfc.a) {
                    R3 = new emfb(emgeVar);
                    hfmVar.ad(R3);
                }
                hfmVar.Z();
                e(a7, b4, emhcVar, emhcVar2, (ffix) ((ffmq) R3), b, 0);
                b.n();
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: emes
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i7 = i;
                    emfc.c(emge.this, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final emge emgeVar, final fgdj fgdjVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1966170835);
        if (i3 == 0) {
            i2 = (true != b.F(emgeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(fgdjVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            final hkx a = hkf.a(fgdjVar, b);
            b.v(2008553066);
            boolean F = b.F(emgeVar);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new ffji() { // from class: emex
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        Context context = (Context) obj;
                        context.getClass();
                        emge emgeVar2 = emge.this;
                        emgo emgoVar = new emgo(context, emgeVar2);
                        emgoVar.h = new emfa(emgeVar2);
                        return emgoVar;
                    }
                };
                hfmVar.ad(R);
            }
            ffji ffjiVar = (ffji) R;
            hfmVar.Z();
            hvi l = ebs.l(hvi.e, emgu.a(emgeVar.n, b));
            b.v(2008562146);
            boolean D = b.D(a);
            Object R2 = hfmVar.R();
            if (D || R2 == hfc.a) {
                R2 = new ffji() { // from class: emey
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        final emgo emgoVar = (emgo) obj;
                        emgoVar.getClass();
                        int ordinal = ((emfz) hkx.this.a()).ordinal();
                        if (ordinal != 0) {
                            ValueAnimator valueAnimator = null;
                            if (ordinal == 1) {
                                ((enrr) emgoVar.b.h().h("com/google/chat/smartmessaging/penpal/ui/SegmentDisplayAndSelectionView", "highlightCroppedParts", 82, "SegmentDisplayAndSelectionView.kt")).q("highlightCroppedParts called");
                                emgoVar.e = emfz.b;
                                if (!emgoVar.f) {
                                    emhc emhcVar = emgoVar.a.n;
                                    emgoVar.c = Bitmap.createBitmap(emhcVar.a, emhcVar.b, Bitmap.Config.ARGB_8888);
                                    Bitmap bitmap = emgoVar.c;
                                    bitmap.getClass();
                                    emgoVar.d = new Canvas(bitmap);
                                    float f = emgoVar.a.n.a;
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f + f);
                                    ofFloat.setDuration(2500L);
                                    ofFloat.setRepeatCount(-1);
                                    ofFloat.setRepeatMode(1);
                                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: emgn
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            valueAnimator2.getClass();
                                            emgo.this.invalidate();
                                        }
                                    });
                                    emgoVar.g = ofFloat;
                                    ValueAnimator valueAnimator2 = emgoVar.g;
                                    if (valueAnimator2 == null) {
                                        ffkj.c("shimmerAnimator");
                                    } else {
                                        valueAnimator = valueAnimator2;
                                    }
                                    valueAnimator.start();
                                    emgoVar.f = true;
                                }
                            } else {
                                if (ordinal != 2) {
                                    throw new ffcd();
                                }
                                emgoVar.e = emfz.c;
                                Bitmap bitmap2 = emgoVar.c;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                }
                                emgoVar.c = null;
                            }
                        }
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            kcg.b(ffjiVar, l, (ffji) R2, b, 0, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: emez
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    emge emgeVar2 = emge.this;
                    int i4 = i;
                    emfc.d(emgeVar2, fgdjVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final hkx hkxVar, final long j, final emhc emhcVar, final emhc emhcVar2, final ffix ffixVar, hfd hfdVar, final int i) {
        hkx hkxVar2;
        int i2;
        hvi c;
        hkxVar.getClass();
        emhcVar.getClass();
        ffixVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(1420767461);
        if (i3 == 0) {
            hkxVar2 = hkxVar;
            i2 = (true != b.D(hkxVar2) ? 2 : 4) | i;
        } else {
            hkxVar2 = hkxVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.C(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(emhcVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(emhcVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(ffixVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
        } else {
            float max = Math.max(emhcVar.a / emhcVar2.a, emhcVar.b / emhcVar2.b);
            final ffkz ffkzVar = new ffkz();
            final ffkz ffkzVar2 = new ffkz();
            kaa kaaVar = (kaa) hkxVar2.a();
            b.v(210338109);
            if (kaaVar != null) {
                float em = ((jzn) b.e(jdr.e)).em(24.0f);
                float em2 = ((jzn) b.e(jdr.e)).em(16.0f);
                ffkzVar.a = a((int) (j >> 32), kaa.a(kaaVar.a) * max, em, em2);
                ffkzVar2.a = a((int) (j & 4294967295L), kaa.b(kaaVar.a) * max, em, em2);
            }
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            b.v(210356448);
            int i4 = 57344 & i2;
            Object R = hfmVar.R();
            if (i4 == 16384 || R == hfc.a) {
                R = new ffix() { // from class: emet
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ffix.this.invoke();
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            ffix ffixVar2 = (ffix) R;
            hfmVar.Z();
            hve hveVar = hvi.e;
            hvi m = ebs.m(dee.a(new OffsetPxElement(new ffji() { // from class: emeu
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((jzn) obj).getClass();
                    return new kaa((ffkz.this.a << 32) | (ffkzVar2.a & 4294967295L));
                }
            }, false), gft.a(b).p, eqm.a), 48.0f, 48.0f);
            b.v(210363027);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = new ffji() { // from class: emev
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jkv jkvVar = (jkv) obj;
                        jkvVar.getClass();
                        jkr.k(jkvVar, "send button");
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            c = jjs.c(m, false, (ffji) R2);
            gem.b(ffixVar2, c, false, null, null, emed.a, b, 1572864, 60);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: emew
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hkx hkxVar3 = hkx.this;
                    long j2 = j;
                    emhc emhcVar3 = emhcVar;
                    emhc emhcVar4 = emhcVar2;
                    emfc.e(hkxVar3, j2, emhcVar3, emhcVar4, ffixVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
