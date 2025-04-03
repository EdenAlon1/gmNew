package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.SurfaceView;
import android.widget.photopicker.EmbeddedPhotoPickerSession;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqco {
    public static final ffbz a = ffca.a(new ffix() { // from class: dqcd
        @Override // defpackage.ffix
        public final Object invoke() {
            return enru.c("com/google/android/libraries/compose/cameragallery/ui/gallery/embedded/EmbeddedGalleryKt");
        }
    });

    public static final long a(hho hhoVar) {
        return ((kaf) hhoVar.a()).a;
    }

    public static final IBinder b(hho hhoVar) {
        return (IBinder) hhoVar.a();
    }

    public static final EmbeddedPhotoPickerSession c(hho hhoVar) {
        return xpi$$ExternalSyntheticApiModelOutline0.m629m(hhoVar.a());
    }

    public static final List d(hkx hkxVar) {
        return (List) hkxVar.a();
    }

    public static final void e(hho hhoVar, EmbeddedPhotoPickerSession embeddedPhotoPickerSession) {
        hhoVar.b(embeddedPhotoPickerSession);
    }

    public static final void f(hho hhoVar, long j) {
        hhoVar.b(new kaf(j));
    }

    public static final void g(hho hhoVar, IBinder iBinder) {
        hhoVar.b(iBinder);
    }

    public static final boolean h(hho hhoVar) {
        return ((Boolean) hhoVar.a()).booleanValue();
    }

    public static final void i(final hvi hviVar, final dpzv dpzvVar, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        Object dqchVar;
        final hho hhoVar;
        int i3;
        EmbeddedPhotoPickerSession embeddedPhotoPickerSession;
        IBinder iBinder;
        final hho hhoVar2;
        ffgu ffguVar;
        hvi c;
        int i4 = i & 6;
        hfd b = hfdVar.b(-1932813064);
        if (i4 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? b.D(dpzvVar) : b.F(dpzvVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar) ? 128 : 256;
        }
        int i5 = i2;
        if ((i5 & 147) == 146 && b.I()) {
            b.s();
        } else {
            Activity b2 = dskj.b((Context) b.e(AndroidCompositionLocals_androidKt.b));
            b.v(-1472892950);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(new kaf(0L), hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            hho hhoVar3 = (hho) R;
            hfmVar.Z();
            b.v(-1472890772);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                hic hicVar2 = new hic(null, hla.a);
                hfmVar.ad(hicVar2);
                R2 = hicVar2;
            }
            hho hhoVar4 = (hho) R2;
            hfmVar.Z();
            b.v(-1472888609);
            Object R3 = hfmVar.R();
            if (R3 == hfc.a) {
                hic hicVar3 = new hic(null, hla.a);
                hfmVar.ad(hicVar3);
                R3 = hicVar3;
            }
            final hho hhoVar5 = (hho) R3;
            hfmVar.Z();
            kaf kafVar = new kaf(a(hhoVar3));
            IBinder b3 = b(hhoVar4);
            EmbeddedPhotoPickerSession c2 = c(hhoVar5);
            b.v(-1472883440);
            int i6 = i5 & 112;
            boolean F = (i6 == 32 || ((i5 & 64) != 0 && b.F(dpzvVar))) | b.F(b2);
            boolean z = (i5 & 896) == 256;
            Object R4 = hfmVar.R();
            if ((F || z) || R4 == hfc.a) {
                hhoVar = hhoVar3;
                i3 = i5;
                embeddedPhotoPickerSession = c2;
                iBinder = b3;
                hhoVar2 = hhoVar4;
                dqchVar = new dqch(dpzvVar, b2, ffixVar, hhoVar2, hhoVar, hhoVar5, null);
                hfmVar.ad(dqchVar);
            } else {
                dqchVar = R4;
                i3 = i5;
                iBinder = b3;
                embeddedPhotoPickerSession = c2;
                hhoVar = hhoVar3;
                hhoVar2 = hhoVar4;
            }
            hfmVar.Z();
            hgs.e(kafVar, iBinder, embeddedPhotoPickerSession, (ffjm) dqchVar, b);
            hho hhoVar6 = dpzvVar.b;
            Boolean valueOf = Boolean.valueOf(h(hhoVar6));
            EmbeddedPhotoPickerSession c3 = c(hhoVar5);
            b.v(-1472842311);
            boolean D = b.D(hhoVar6);
            Object R5 = hfmVar.R();
            if (D || R5 == hfc.a) {
                R5 = new dqci(hhoVar5, hhoVar6, null);
                hfmVar.ad(R5);
            }
            hfmVar.Z();
            hgs.f(valueOf, c3, (ffjm) R5, b);
            b.v(-1472837234);
            Object R6 = hfmVar.R();
            if (R6 == hfc.a) {
                hic hicVar4 = new hic(ffel.a, hla.a);
                hfmVar.ad(hicVar4);
                R6 = hicVar4;
            }
            hho hhoVar7 = (hho) R6;
            hfmVar.Z();
            hkx a2 = hkf.a(dpzvVar.a, b);
            EmbeddedPhotoPickerSession c4 = c(hhoVar5);
            List d = d(a2);
            b.v(-1472831042);
            boolean D2 = b.D(a2);
            Object R7 = hfmVar.R();
            if (D2 || R7 == hfc.a) {
                ffguVar = null;
                R7 = new dqcj(hhoVar5, hhoVar7, a2, null);
                hfmVar.ad(R7);
            } else {
                ffguVar = null;
            }
            hfmVar.Z();
            hgs.f(c4, d, (ffjm) R7, b);
            c = ebs.c(hviVar, 1.0f);
            b.v(-1472818758);
            Object R8 = hfmVar.R();
            if (R8 == hfc.a) {
                R8 = new ffji() { // from class: dqby
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ioc iocVar = (ioc) obj;
                        ffbz ffbzVar = dqco.a;
                        iocVar.getClass();
                        dqco.f(hho.this, iocVar.g());
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R8);
            }
            hfmVar.Z();
            hvi a3 = ipx.a(c, (ffji) R8);
            b.v(-1472816628);
            boolean z2 = i6 == 32 || ((i3 & 64) != 0 && b.F(dpzvVar));
            Object R9 = hfmVar.R();
            if (z2 || R9 == hfc.a) {
                R9 = new ffji() { // from class: dqbz
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        Context context = (Context) obj;
                        ffbz ffbzVar = dqco.a;
                        context.getClass();
                        Object invoke = dpzv.this.h.invoke(context);
                        SurfaceView surfaceView = (SurfaceView) invoke;
                        surfaceView.setZOrderOnTop(true);
                        surfaceView.addOnAttachStateChangeListener(new dqck(surfaceView, hhoVar2, hhoVar5, hhoVar));
                        return invoke;
                    }
                };
                hfmVar.ad(R9);
            }
            ffji ffjiVar = (ffji) R9;
            hfmVar.Z();
            b.v(-1472789939);
            Object R10 = hfmVar.R();
            if (R10 == hfc.a) {
                R10 = new ffji() { // from class: dqca
                    /* JADX WARN: Code restructure failed: missing block: B:3:0x000f, code lost:
                    
                        r0 = r0.getSurfacePackage();
                     */
                    @Override // defpackage.ffji
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r2) {
                        /*
                            r1 = this;
                            android.view.SurfaceView r2 = (android.view.SurfaceView) r2
                            ffbz r0 = defpackage.dqco.a
                            r2.getClass()
                            hho r0 = defpackage.hho.this
                            android.widget.photopicker.EmbeddedPhotoPickerSession r0 = defpackage.dqco.c(r0)
                            if (r0 == 0) goto L18
                            android.view.SurfaceControlViewHost$SurfacePackage r0 = defpackage.xpi$$ExternalSyntheticApiModelOutline0.m(r0)
                            if (r0 == 0) goto L18
                            defpackage.aeb$$ExternalSyntheticApiModelOutline0.m(r2, r0)
                        L18:
                            ffcu r2 = defpackage.ffcu.a
                            return r2
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqca.invoke(java.lang.Object):java.lang.Object");
                    }
                };
                hfmVar.ad(R10);
            }
            hfmVar.Z();
            ffgu ffguVar2 = ffguVar;
            kcg.b(ffjiVar, a3, (ffji) R10, b, 384, 0);
            kaf kafVar2 = new kaf(a(hhoVar));
            b.v(-1472786322);
            Object R11 = hfmVar.R();
            if (R11 == hfc.a) {
                R11 = new dqcl(hhoVar5, hhoVar, ffguVar2);
                hfmVar.ad(R11);
            }
            hfmVar.Z();
            hgs.g(kafVar2, (ffjm) R11, b);
            ffcu ffcuVar = ffcu.a;
            b.v(-1472782988);
            Object R12 = hfmVar.R();
            if (R12 == hfc.a) {
                R12 = new ffji() { // from class: dqcb
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ffbz ffbzVar = dqco.a;
                        ((hgp) obj).getClass();
                        return new dqcm(hho.this);
                    }
                };
                hfmVar.ad(R12);
            }
            hfmVar.Z();
            hgs.c(ffcuVar, (ffji) R12, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dqcc
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    int i7 = i;
                    dpzv dpzvVar2 = dpzvVar;
                    int a4 = hip.a(i7 | 1);
                    dqco.i(hviVar2, dpzvVar2, ffixVar, (hfd) obj, a4);
                    return ffcu.a;
                }
            };
        }
    }
}
