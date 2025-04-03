package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jaq {
    public static final jaq a = new jaq();

    private jaq() {
    }

    public final void a(View view, boolean z) {
        if (z) {
            view.setContentSensitivity(1);
        } else {
            view.setContentSensitivity(0);
        }
    }
}
