package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dllo {
    public static void a(RuntimeException runtimeException, dllv dllvVar, String str) {
        dexc dexcVar = dllvVar.a;
        if (dexcVar != dexc.STARTUP && dexcVar != dexc.TELEDOCTOR) {
            throw runtimeException;
        }
        try {
            Log.e("ExceptionUtil", a.t(str, "RuntimeException while safely performing function: "), runtimeException);
        } catch (RuntimeException unused) {
        }
    }
}
