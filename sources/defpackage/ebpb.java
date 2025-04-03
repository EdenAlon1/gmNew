package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebpb {
    public static void a(View view) {
        view.setSystemUiVisibility(view.getSystemUiVisibility() | 1280);
        view.setSystemUiVisibility(view.getSystemUiVisibility() | 512);
    }

    public static void b(View view, boolean z, boolean z2) {
        if (!z) {
            view.setSystemUiVisibility(view.getSystemUiVisibility() & (-8193));
            return;
        }
        view.setSystemUiVisibility(view.getSystemUiVisibility() & (-8193));
        if (z2) {
            view.setSystemUiVisibility(view.getSystemUiVisibility() | 8192);
        }
    }
}
