package defpackage;

import android.content.Context;
import android.os.Trace;
import android.view.View;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.view.PreviewView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpyd extends dpnn {
    private static final atl D;
    static final /* synthetic */ ffmx[] u;
    public static final enru v;
    public final dpfr A;
    public atl B;
    public final PreviewView C;
    private final Context E;
    private final ea F;
    private final dqkk G;
    private bqc H;
    private axv I;
    private ffss J;
    private final ffbz K;
    private final View L;
    private final View M;
    private final View N;
    private final View O;
    private final View P;
    private final ffls Q;
    public final ffsk w;
    public final dqli x;
    public final dpnj y;
    public final ffji z;

    static {
        ffko ffkoVar = new ffko(dpyd.class, "miniCameraMode", "getMiniCameraMode()Lcom/google/android/libraries/compose/cameragallery/ui/camera/CameraConfiguration$MiniCameraMode;", 0);
        int i = fflc.a;
        u = new ffmx[]{ffkoVar};
        atl atlVar = atl.b;
        atlVar.getClass();
        D = atlVar;
        v = enru.c("com/google/android/libraries/compose/cameragallery/ui/camera/mini/MiniCameraViewHolder");
    }

    public dpyd(Context context, ea eaVar, final dpuj dpujVar, dqkk dqkkVar, ffsk ffskVar, Optional optional, dqli dqliVar, View view, dpnj dpnjVar, ffji ffjiVar) {
        super(view);
        this.E = context;
        this.F = eaVar;
        this.G = dqkkVar;
        this.w = ffskVar;
        this.x = dqliVar;
        this.y = dpnjVar;
        this.z = ffjiVar;
        this.A = (dpfr) fflm.b(optional);
        this.K = ffca.a(new ffix() { // from class: dpxv
            @Override // defpackage.ffix
            public final Object invoke() {
                dpuj dpujVar2 = dpuj.this;
                Context context2 = (Context) dpujVar2.a.b();
                context2.getClass();
                Executor executor = (Executor) dpujVar2.b.b();
                executor.getClass();
                ((ernh) dpujVar2.c.b()).getClass();
                Executor executor2 = (Executor) dpujVar2.d.b();
                executor2.getClass();
                ffsk ffskVar2 = (ffsk) dpujVar2.e.b();
                ffskVar2.getClass();
                Optional optional2 = (Optional) dpujVar2.f.b();
                dqhs dqhsVar = (dqhs) dpujVar2.g.b();
                dqhsVar.getClass();
                drpd drpdVar = (drpd) dpujVar2.h.b();
                drpdVar.getClass();
                dpnj dpnjVar2 = this.y;
                dpnjVar2.getClass();
                return new dpui(context2, executor, executor2, ffskVar2, optional2, dqhsVar, drpdVar, dpnjVar2);
            }
        });
        this.B = D;
        View findViewById = view.findViewById(R.id.open_fullscreen_camera_button);
        findViewById.getClass();
        this.L = findViewById;
        View findViewById2 = view.findViewById(R.id.mini_camera_indicator);
        findViewById2.getClass();
        this.M = findViewById2;
        View findViewById3 = view.findViewById(R.id.mini_camera_indicator_overlay);
        findViewById3.getClass();
        this.N = findViewById3;
        PreviewView previewView = (PreviewView) view.findViewById(R.id.mini_camera_preview_view);
        previewView.d(2);
        this.C = previewView;
        View findViewById4 = view.findViewById(R.id.flip_camera_button);
        findViewById4.getClass();
        this.O = findViewById4;
        View findViewById5 = view.findViewById(R.id.shutter_button);
        findViewById5.getClass();
        this.P = findViewById5;
        this.Q = new dpyb(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.dpnn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(defpackage.ffgu r8) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpyd.C(ffgu):java.lang.Object");
    }

    @Override // defpackage.dpnn
    public final void D(dpni dpniVar) {
        this.Q.d(u[0], dpniVar);
    }

    @Override // defpackage.dpnn
    public final Object E() {
        ffss ffssVar = this.J;
        if (ffssVar != null) {
            ffssVar.t(null);
        }
        this.J = null;
        bqc bqcVar = this.H;
        if (bqcVar != null) {
            bqcVar.a();
        }
        return ffcu.a;
    }

    public final dpni F() {
        return (dpni) this.Q.c(u[0]);
    }

    public final dpui G() {
        return (dpui) this.K.a();
    }

    public final void H(boolean z) {
        axv axvVar = null;
        if (!z) {
            bqc bqcVar = this.H;
            if (bqcVar == null) {
                ffkj.c("cameraProvider");
                bqcVar = null;
            }
            axv axvVar2 = this.I;
            if (axvVar2 == null) {
                ffkj.c("cameraPreviewUseCase");
                axvVar2 = null;
            }
            axvVar2.getClass();
            for (Object obj : bqcVar.b.d.b()) {
                obj.getClass();
                if (((LifecycleCamera) obj).f(axvVar2)) {
                    return;
                }
            }
        }
        bqc bqcVar2 = this.H;
        if (bqcVar2 == null) {
            ffkj.c("cameraProvider");
            bqcVar2 = null;
        }
        bqcVar2.a();
        bqc bqcVar3 = this.H;
        if (bqcVar3 == null) {
            ffkj.c("cameraProvider");
            bqcVar3 = null;
        }
        ea eaVar = this.F;
        atl atlVar = this.B;
        axv[] axvVarArr = new axv[2];
        axv axvVar3 = this.I;
        if (axvVar3 == null) {
            ffkj.c("cameraPreviewUseCase");
        } else {
            axvVar = axvVar3;
        }
        axvVarArr[0] = axvVar;
        axvVarArr[1] = G().e;
        eaVar.getClass();
        atlVar.getClass();
        bpx bpxVar = bqcVar3.b;
        axv[] axvVarArr2 = (axv[]) Arrays.copyOf(axvVarArr, 2);
        axvVarArr2.getClass();
        ozg.a("CX:bindToLifecycle");
        try {
            bpxVar.e();
            bpxVar.b(1);
            atz atzVar = atz.a;
            atzVar.getClass();
            atz atzVar2 = atz.a;
            atzVar2.getClass();
            bpx.d(bpxVar, eaVar, atlVar, atzVar, atzVar2, null, ffel.a, (axv[]) Arrays.copyOf(axvVarArr2, axvVarArr2.length));
        } finally {
            Trace.endSection();
        }
    }

    public final void I(int i) {
        eg G = this.F.G();
        if (G != null) {
            dskt.b(G, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(boolean r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 8
            if (r6 == 0) goto L2b
            bqc r2 = r5.H
            if (r2 == 0) goto L2b
            atl r3 = defpackage.atl.a
            r3.getClass()
            boolean r2 = r2.b(r3)
            if (r2 == 0) goto L2b
            bqc r2 = r5.H
            if (r2 != 0) goto L1e
            java.lang.String r2 = "cameraProvider"
            defpackage.ffkj.c(r2)
            r2 = 0
        L1e:
            atl r3 = defpackage.atl.b
            r3.getClass()
            boolean r2 = r2.b(r3)
            if (r2 == 0) goto L2b
            r2 = r0
            goto L2c
        L2b:
            r2 = r1
        L2c:
            android.view.View r3 = r5.O
            r3.setVisibility(r2)
            android.view.View r2 = r5.P
            r3 = 1
            if (r3 == r6) goto L38
            r4 = r1
            goto L39
        L38:
            r4 = r0
        L39:
            r2.setVisibility(r4)
            android.view.View r2 = r5.L
            r2.setVisibility(r4)
            android.view.View r2 = r5.M
            if (r3 == r6) goto L46
            goto L47
        L46:
            r0 = r1
        L47:
            r2.setVisibility(r0)
            android.view.View r6 = r5.N
            r6.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpyd.J(boolean):void");
    }
}
