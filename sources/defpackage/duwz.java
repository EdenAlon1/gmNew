package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duwz implements duof {
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/keypresseffect/PressEffectPlayer");
    private static volatile duwz c;
    public boolean b;
    private final emyl d;
    private final duzk e;
    private final int f;
    private final boolean g;
    private final duxc h;
    private int i;
    private final int j;
    private final duzj k;
    private final duzj l;
    private final duzj m;
    private final duzj n;

    /* JADX WARN: Removed duplicated region for block: B:39:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private duwz(final android.content.Context r24) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duwz.<init>(android.content.Context):void");
    }

    public static duwz a(Context context) {
        if (c == null) {
            synchronized (duwz.class) {
                if (c == null) {
                    duoe duoeVar = duoe.a;
                    c = new duwz(context.getApplicationContext());
                    duoeVar.a(c);
                }
            }
        }
        return c;
    }

    private static final void e(View view) {
        try {
            view.performHapticFeedback(3);
        } catch (RuntimeException unused) {
        }
        SystemClock.uptimeMillis();
    }

    public final void b() {
        int i;
        if (this.g) {
            i = this.j;
        } else {
            duzk duzkVar = this.e;
            int i2 = this.j;
            try {
                i = Integer.parseInt(duzkVar.o(duzkVar.g.a(R.string.pref_key_vibration_duration_on_keypress)));
            } catch (NumberFormatException unused) {
                i = i2;
            }
        }
        this.i = Math.min(i, 100);
    }

    final boolean c() {
        return this.j != this.i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:27|(2:31|(3:33|34|35))|36|37|38|34|35) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.View r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L4
            goto L87
        L4:
            duxc r0 = r5.h
            if (r0 == 0) goto Lb
            java.lang.Boolean r0 = r0.e
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L1a
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L87
            e(r6)
            return
        L1a:
            boolean r0 = r5.b
            if (r0 == 0) goto L87
            boolean r0 = defpackage.dvak.b
            if (r0 != 0) goto L28
            boolean r0 = r5.c()
            if (r0 == 0) goto L87
        L28:
            emyl r0 = r5.d
            java.lang.Object r0 = r0.get()
            android.os.Vibrator r0 = (android.os.Vibrator) r0
            if (r0 == 0) goto L84
            int r1 = r5.j
            r2 = -1
            if (r1 == r2) goto L38
            goto L3f
        L38:
            boolean r1 = r5.c()
            if (r1 != 0) goto L3f
            goto L84
        L3f:
            int r6 = r5.i
            if (r6 <= 0) goto L87
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L7c
            int r1 = android.os.Build.VERSION.SDK_INT
            long r1 = (long) r1
            duvz r3 = defpackage.duws.a
            java.lang.Object r3 = r3.b()
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L7c
            r1 = 1
            int[] r2 = new int[]{r1}
            boolean r2 = defpackage.aeb$$ExternalSyntheticApiModelOutline0.m(r0, r2)
            if (r2 == 0) goto L7c
            float r6 = (float) r6
            android.os.VibrationEffect$Composition r2 = defpackage.aeb$$ExternalSyntheticApiModelOutline0.m66m()
            r3 = 1008981770(0x3c23d70a, float:0.01)
            float r6 = r6 * r3
            android.os.VibrationEffect$Composition r6 = defpackage.aeb$$ExternalSyntheticApiModelOutline0.m(r2, r1, r6)
            android.os.VibrationEffect r6 = defpackage.aeb$$ExternalSyntheticApiModelOutline0.m(r6)
            defpackage.iy$$ExternalSyntheticApiModelOutline1.m(r0, r6)
            goto L80
        L7c:
            long r1 = (long) r6
            r0.vibrate(r1)     // Catch: java.lang.RuntimeException -> L80
        L80:
            android.os.SystemClock.uptimeMillis()
            return
        L84:
            e(r6)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duwz.d(android.view.View):void");
    }
}
