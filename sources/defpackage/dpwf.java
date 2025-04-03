package defpackage;

import android.content.Context;
import android.util.Size;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.research.xeno.effect.Callbacks$StatusCallback;
import com.google.research.xeno.effect.Effect;
import j$.util.Optional;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpwf {
    public static final enru a = enru.c("com/google/android/libraries/compose/cameragallery/ui/camera/inapp/effects/CameraEffectsManager");
    public static final boy b = new boy(bow.a, new boz(new Size(1920, 1440), 4));
    public static final bro c;
    public final dpvm d;
    public final dpvy e;
    public final fgcm f;
    public final fgcm g;
    public final fgcm h;
    public final dpvw i;
    public final dtll j;
    public fafg k;
    public boolean l;
    public final ffji m;
    public final fgdj n;
    private final Executor o;
    private final ffsk p;
    private final Context q;

    static {
        brk brkVar = brk.c;
        brk brkVar2 = brk.c;
        int i = bqy.d;
        bqj bqjVar = new bqj(brkVar2, 4);
        ksw.i(brkVar, "quality cannot be null");
        boolean d = brk.d(brkVar);
        Objects.toString(brkVar);
        ksw.b(d, "Invalid quality: ".concat(String.valueOf(brkVar)));
        c = new bro(Collections.singletonList(brkVar), bqjVar);
    }

    public dpwf(Optional optional, dpvm dpvmVar, Executor executor, ffsk ffskVar, Context context, dpvy dpvyVar) {
        dpvmVar.getClass();
        executor.getClass();
        ffskVar.getClass();
        context.getClass();
        this.d = dpvmVar;
        this.o = executor;
        this.p = ffskVar;
        this.q = context;
        this.e = dpvyVar;
        fgcm a2 = fgdm.a(null);
        this.f = a2;
        fgcm a3 = fgdm.a(false);
        this.g = a3;
        fgcm a4 = fgdm.a(new LinkedHashSet());
        this.h = a4;
        String string = context.getString(R.string.no_effect_display_name);
        string.getClass();
        this.i = new dpvw("no_effect", string, new dpwk(R.drawable.gs_block_vd_theme_24, null));
        this.j = (dtll) fflm.b(optional);
        this.m = new eogl(new dpwd(this, null));
        ffxx a5 = fgck.a(a2, a4, a3, new dpwc(this, null));
        int i = fgcz.a;
        this.n = fgbn.b(a5, ffskVar, fgcy.b, new dpwi(null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x010b, code lost:
    
        if (r2.e(r6, r14, r4) == r5) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dpvw r22, defpackage.ffji r23, defpackage.ffgu r24) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpwf.a(dpvw, ffji, ffgu):java.lang.Object");
    }

    public final void b(Effect effect, final String str, final ffji ffjiVar, final dpwh dpwhVar) {
        fafg fafgVar = this.k;
        if (fafgVar == null) {
            return;
        }
        fafgVar.d.d.b(effect, new Callbacks$StatusCallback() { // from class: dpwb
            @Override // com.google.research.xeno.effect.NativeCallbacks$StatusCallback
            public final void onCompletion(boolean z, String str2) {
                dpwf dpwfVar = dpwf.this;
                dpwfVar.g.f(false);
                String str3 = str;
                dpwh dpwhVar2 = dpwhVar;
                if (z) {
                    ((enrr) dpwf.a.h().h("com/google/android/libraries/compose/cameragallery/ui/camera/inapp/effects/CameraEffectsManager", "setProcessorEffect$lambda$4", BasePaymentResult.ERROR_REQUEST_FAILED, "CameraEffectsManager.kt")).t("Set camera effect: %s", str3);
                    if (dpwhVar2 != null) {
                        dpwfVar.e.c.a(dpwhVar2, ecrh.SUCCESS);
                        return;
                    }
                    return;
                }
                ((enrr) dpwf.a.j().h("com/google/android/libraries/compose/cameragallery/ui/camera/inapp/effects/CameraEffectsManager", "setProcessorEffect$lambda$4", 205, "CameraEffectsManager.kt")).D("Failed to set camera effect: %s, error: %s", str3, str2);
                if (dpwhVar2 != null) {
                    dpwfVar.e.c.a(dpwhVar2, ecrh.ERROR);
                }
                if (ffkj.e(str2, "xeno::effect::EffectWasReconfiguredStatus()")) {
                    return;
                }
                ffjiVar.invoke(new dpvx(str2));
            }
        });
    }
}
