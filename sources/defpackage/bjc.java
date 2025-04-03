package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bjc extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return bjm.a();
        }
        if (Looper.myLooper() == null) {
            return null;
        }
        return new bjh(new Handler(Looper.myLooper()));
    }
}
