package defpackage;

import android.os.Binder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ecuv {
    public static Object a(ecuw ecuwVar) {
        try {
            return ecuwVar.a();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return ecuwVar.a();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
