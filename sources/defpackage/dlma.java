package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlma {
    public boolean a = false;
    public boolean b = false;

    public final void a(Context context) {
        if (this.b) {
            dlmh.a(context);
            dlmh.b();
        } else if (this.a) {
            dlmh.b();
        }
    }

    public final boolean b() {
        return this.a || this.b;
    }
}
