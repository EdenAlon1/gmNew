package defpackage;

import android.os.Build;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kul {
    private final kuk a;

    public kul(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new kui(view);
        } else {
            this.a = new kuj();
        }
    }

    public final void a(int i, int i2, int i3, boolean z) {
        this.a.a(i, i2, i3, z);
    }

    public final void b(int i, int i2, int i3, int i4) {
        this.a.b(i, i2, i3, i4);
    }
}
