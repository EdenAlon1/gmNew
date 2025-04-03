package defpackage;

import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvm extends hvh {
    public boolean a;
    private final boolean c = true;
    public boolean b = true;

    @Override // defpackage.hvh
    public final void dT() {
        if (this.b) {
            if (this.a) {
                imn.c("invalid sensitive content state");
            }
            isx.f(this).q();
            this.a = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvm)) {
            return false;
        }
        boolean z = ((hvm) obj).c;
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    @Override // defpackage.hvh
    public final void t() {
        if (this.a) {
            Object f = isx.f(this);
            if (Build.VERSION.SDK_INT >= 35) {
                if (((AndroidComposeView) f).O == 1) {
                    jaq.a.a((View) f, false);
                }
                r1.O--;
            }
            this.a = false;
        }
    }

    public final String toString() {
        return "SensitiveContentNode(_isContentSensitive=true)";
    }
}
