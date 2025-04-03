package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jtc {
    public final jth a;

    public jtc() {
        this.a = Build.VERSION.SDK_INT >= 28 ? new jti() : new jtj();
    }
}
