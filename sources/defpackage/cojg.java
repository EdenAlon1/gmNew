package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import java.lang.reflect.Method;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cojg {
    private static final cfva e;
    private static final cfva f;
    public final ffbr b;
    private final ffbr g;
    private final ffbr h;
    private final ffsk i;
    private static final enru c = enru.c("com/google/android/apps/messaging/shared/screendetection/ScreenDetectionChecker");
    public static final emyl a = cfvl.y("enable_screen_detection_checker_2");
    private static final emyl d = cfvl.y("enable_skip_screen_detection_check_v");

    static {
        ecwh ecwhVar = cfvl.b;
        ezgv ezgvVar = (ezgv) ezgw.a.createBuilder();
        ezgvVar.a(ffdx.i("com.google.android.projection.gearhead", "com.google.android.marvin.talkback"));
        e = cfvl.u(ecwhVar, "screen_detection_checker_allowed_packages", ezgvVar.build(), new ecwg() { // from class: cojd
            @Override // defpackage.ecwg
            public final Object a(byte[] bArr) {
                return (ezgw) eyfy.parseFrom(ezgw.a, bArr);
            }
        });
        f = cfvl.u(cfvl.b, "screen_detection_checker_denied_packages", ((ezgv) ezgw.a.createBuilder()).build(), new ecwg() { // from class: cojd
            @Override // defpackage.ecwg
            public final Object a(byte[] bArr) {
                return (ezgw) eyfy.parseFrom(ezgw.a, bArr);
            }
        });
    }

    public cojg(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffsk ffskVar) {
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffskVar.getClass();
        this.g = ffbrVar;
        this.h = ffbrVar2;
        this.b = ffbrVar3;
        this.i = ffskVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final coje a() {
        coje cojeVar;
        String str;
        ekzz f2 = eleg.f("ScreenDetectionChecker.isScreenCaptureProbablyActiveWithPackageName");
        try {
            if (!((Boolean) ((cfup) a.get()).e()).booleanValue()) {
                coje cojeVar2 = new coje();
                ffig.a(f2, null);
                return cojeVar2;
            }
            ekzz f3 = eleg.f("ScreenDetectionChecker#isScreenCaptureProbablyActiveWithoutLogging");
            try {
                DisplayManager displayManager = (DisplayManager) ((Context) this.h.b()).getSystemService("display");
                if (displayManager != null) {
                    Display[] displays = displayManager.getDisplays();
                    if (displays.length > 1) {
                        Iterator a2 = ffjw.a(displays);
                        while (true) {
                            if (!a2.hasNext()) {
                                cojeVar = new coje();
                                ffig.a(f3, null);
                                break;
                            }
                            final Display display = (Display) a2.next();
                            try {
                                final Method declaredMethod = display.getClass().getDeclaredMethod("getOwnerPackageName", new Class[0]);
                                str = new ffix() { // from class: cojc
                                    @Override // defpackage.ffix
                                    public final Object invoke() {
                                        emyl emylVar = cojg.a;
                                        return (String) declaredMethod.invoke(display, new Object[0]);
                                    }
                                }.invoke();
                            } catch (Throwable th) {
                                ((enrr) ((enrr) c.i()).g(th).h("com/google/android/apps/messaging/shared/screendetection/ScreenDetectionChecker", "isScreenCaptureProbablyActiveWithoutLogging", 122, "ScreenDetectionChecker.kt")).q("ScreenDetectionChecker: failed to call getOwnerPackageName");
                                str = null;
                            }
                            if (str != null && str.length() != 0) {
                                if (!((ezgw) e.e()).b.contains(str)) {
                                    if (((ezgw) f.e()).b.contains(str)) {
                                        cojeVar = new coje(true, str);
                                        ffig.a(f3, null);
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                            int flags = display.getFlags();
                            if ((flags & 1) == 0 && (flags & 2) == 0 && display.getDisplayId() != 0) {
                                cojeVar = new coje(true, str);
                                ffig.a(f3, null);
                                break;
                            }
                        }
                    } else {
                        cojeVar = new coje();
                        ffig.a(f3, null);
                    }
                } else {
                    cojeVar = new coje();
                    ffig.a(f3, null);
                }
                if (cojeVar.a) {
                    axol.k(this.i, null, new cojf(this, null), 3);
                }
                ffig.a(f2, null);
                return cojeVar;
            } finally {
            }
        } finally {
        }
    }

    public final boolean b() {
        ekzz f2 = eleg.f("ScreenDetectionChecker.isScreenCaptureProbablyActive");
        try {
            if (((Boolean) ((cfup) d.get()).e()).booleanValue() && ctid.i) {
                ffig.a(f2, null);
                return false;
            }
            if (!((Boolean) ((cfup) a.get()).e()).booleanValue()) {
                ffig.a(f2, null);
                return false;
            }
            boolean z = a().a;
            ffig.a(f2, null);
            return z;
        } finally {
        }
    }
}
