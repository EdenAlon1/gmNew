package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edau extends BroadcastReceiver {
    public static volatile eczm a;
    static volatile eczn b;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        if (stringExtra.contains("../") || stringExtra.contains("/..")) {
            Log.w("PhUpdateBroadcastRecv", a.a(stringExtra, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
            return;
        }
        eczm eczmVar = a;
        if (eczmVar == null) {
            Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
            return;
        }
        eczp[] a2 = eczmVar.a.a(stringExtra);
        if (a2 != null) {
            for (eczp eczpVar : a2) {
                eczo eczoVar = eczp.a;
                eczpVar.b();
            }
        }
    }
}
