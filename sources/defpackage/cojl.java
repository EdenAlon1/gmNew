package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cojl {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/screendetection/ScreenDetectionHelper");
    public final ffbr b;
    public final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffsk f;

    public cojl(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffsk ffskVar) {
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffskVar.getClass();
        this.d = ffbrVar;
        this.b = ffbrVar2;
        this.e = ffbrVar3;
        this.c = ffbrVar4;
        this.f = ffskVar;
    }

    private final DisplayManager e() {
        return (DisplayManager) ((Context) this.b.b()).getSystemService("display");
    }

    public final DisplayManager.DisplayListener a(ffix ffixVar) {
        ekzz f = eleg.f("ScreenDetectionHelper.registerDisplayListener");
        try {
            DisplayManager e = e();
            if (e == null) {
                ffig.a(f, null);
                return null;
            }
            cojk cojkVar = new cojk(ffixVar);
            e.registerDisplayListener(cojkVar, (Handler) this.e.b());
            ffig.a(f, null);
            return cojkVar;
        } finally {
        }
    }

    public final coje b(coje cojeVar) {
        ekzz f = eleg.f("ScreenDetectionHelper.handleDisplayChange");
        try {
            coje a2 = ((cojg) this.d.b()).a();
            if (cojeVar == null || cojeVar.a != a2.a) {
                f = eleg.f("ScreenDetectionHelper.refreshNotifications");
                try {
                    axol.k(this.f, null, new cojj(this, null), 3);
                    ffig.a(f, null);
                } finally {
                }
            }
            ffig.a(f, null);
            return a2;
        } finally {
        }
    }

    public final coji c(coje cojeVar) {
        cojeVar.getClass();
        String str = cojeVar.b;
        if (str == null || str.length() == 0) {
            String string = ((Context) this.b.b()).getString(R.string.screen_detection_dialog_body_no_package_name);
            string.getClass();
            return new coji(string, null, null);
        }
        String string2 = ((Context) this.b.b()).getString(R.string.screen_detection_dialog_body_with_package_name, str);
        string2.getClass();
        int Q = ffpc.Q(string2, str, 0, false, 6);
        return new coji(string2, Integer.valueOf(Q), Integer.valueOf(Q + str.length()));
    }

    public final void d(DisplayManager.DisplayListener displayListener) {
        ekzz f = eleg.f("ScreenDetectionHelper.unregisterDisplayListener");
        try {
            DisplayManager e = e();
            if (e != null) {
                e.unregisterDisplayListener(displayListener);
            }
            ffig.a(f, null);
        } finally {
        }
    }
}
