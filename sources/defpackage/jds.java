package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jds implements iir {
    private final View a;

    public jds(View view) {
        this.a = view;
    }

    @Override // defpackage.iir
    public final void a(int i) {
        if (iis.a(i, 16)) {
            this.a.performHapticFeedback(16);
            return;
        }
        if (iis.a(i, 6)) {
            this.a.performHapticFeedback(6);
            return;
        }
        if (iis.a(i, 13)) {
            this.a.performHapticFeedback(13);
            return;
        }
        if (iis.a(i, 23)) {
            this.a.performHapticFeedback(23);
            return;
        }
        if (iis.a(i, 3)) {
            this.a.performHapticFeedback(3);
            return;
        }
        if (iis.a(i, 0)) {
            this.a.performHapticFeedback(0);
            return;
        }
        if (iis.a(i, 17)) {
            this.a.performHapticFeedback(17);
            return;
        }
        if (iis.a(i, 27)) {
            this.a.performHapticFeedback(27);
            return;
        }
        if (iis.a(i, 26)) {
            this.a.performHapticFeedback(26);
            return;
        }
        if (iis.a(i, 9)) {
            this.a.performHapticFeedback(9);
            return;
        }
        if (iis.a(i, 22)) {
            this.a.performHapticFeedback(22);
        } else if (iis.a(i, 21)) {
            this.a.performHapticFeedback(21);
        } else if (iis.a(i, 1)) {
            this.a.performHapticFeedback(1);
        }
    }
}
