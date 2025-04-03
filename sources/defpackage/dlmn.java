package defpackage;

import android.app.ActivityManager;
import android.os.Process;
import android.util.Log;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlmn extends dllp {
    public dlmn() {
        super(dexf.PROCESS_RESTART, 60L);
    }

    @Override // defpackage.dllp
    public final dllv a(dllv dllvVar, emxc emxcVar) {
        emxc emxcVar2;
        if (!emxcVar.g() || ((deyi) emxcVar.c()).b != 5) {
            throw new IllegalArgumentException("Required ProcessRestartFixConfig missing.");
        }
        deyi deyiVar = (deyi) emxcVar.c();
        dexz dexzVar = deyiVar.b == 5 ? (dexz) deyiVar.c : dexz.a;
        if (dexzVar.b == 1 && ((Boolean) dexzVar.c).booleanValue()) {
            dllu dlluVar = new dllu(dllvVar);
            dlluVar.c();
            return dlluVar.a();
        }
        deyi deyiVar2 = (deyi) emxcVar.c();
        dexz dexzVar2 = deyiVar2.b == 5 ? (dexz) deyiVar2.c : dexz.a;
        String str = dexzVar2.b == 2 ? (String) dexzVar2.c : "";
        ActivityManager activityManager = (ActivityManager) dllvVar.b.getSystemService("activity");
        if (activityManager == null) {
            throw new IllegalStateException("ActivityManager is null!");
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = activityManager.getRunningAppProcesses().iterator();
        while (true) {
            if (!it.hasNext()) {
                emxcVar2 = emux.a;
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (next.processName.equals(str)) {
                emxcVar2 = emxc.j(Integer.valueOf(next.pid));
                break;
            }
        }
        if (!emxcVar2.g()) {
            Log.d("ProcessRestartFix", String.format("Process '%s' is not currently running.", str));
            return dllvVar;
        }
        Integer num = (Integer) emxcVar2.c();
        int intValue = num.intValue();
        Log.i("ProcessRestartFix", String.format("Killing '%s' pid=%d", str, num));
        if (intValue == Process.myPid()) {
            dllu dlluVar2 = new dllu(dllvVar);
            dlluVar2.h = true;
            return dlluVar2.a();
        }
        Process.killProcess(intValue);
        dllu dlluVar3 = new dllu(dllvVar);
        dlluVar3.h = false;
        return dlluVar3.a();
    }

    @Override // defpackage.dllp
    public final String b() {
        return "ProcessRestartFix";
    }
}
