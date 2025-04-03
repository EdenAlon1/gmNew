package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eboe {
    public static void a(llg llgVar, Object obj) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            llgVar.m(obj);
        } else {
            llgVar.j(obj);
        }
    }
}
