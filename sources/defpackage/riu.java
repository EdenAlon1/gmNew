package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class riu extends rim {
    private static final Handler b = new Handler(Looper.getMainLooper(), new rit());
    public final qqs a;

    public riu(qqs qqsVar) {
        super(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.a = qqsVar;
    }

    @Override // defpackage.rix
    public final void c(Object obj, rjh rjhVar) {
        rib ribVar = this.c;
        if (ribVar == null || !ribVar.l()) {
            return;
        }
        b.obtainMessage(1, this).sendToTarget();
    }

    @Override // defpackage.rix
    public final void f(Drawable drawable) {
    }
}
