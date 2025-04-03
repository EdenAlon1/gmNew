package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlmd implements dllm {
    @Override // defpackage.dllm
    public final void a(dexe dexeVar) {
        int b = dexd.b(dexeVar.f);
        if ((b != 0 && b == 6 && Log.isLoggable("AppDoctorLogger", 6)) || Log.isLoggable("AppDoctorLogger", 4)) {
            StringBuilder sb = new StringBuilder("AppDoctorEvent<");
            if ((dexeVar.b & 1) != 0) {
                sb.append("package_name='");
                sb.append(dexeVar.c);
                sb.append("' ");
            }
            if ((dexeVar.b & 2) != 0) {
                sb.append("process_name='");
                sb.append(dexeVar.d);
                sb.append("' ");
            }
            sb.append("fix='");
            dexf b2 = dexf.b(dexeVar.e);
            if (b2 == null) {
                b2 = dexf.UNRECOGNIZED;
            }
            sb.append(b2.a());
            sb.append("' status='");
            int b3 = dexd.b(dexeVar.f);
            if (b3 == 0) {
                b3 = 1;
            }
            int i = b3 - 2;
            sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Integer.toString(dexd.a(b3)) : "IN_PROGRESS" : "FAILED" : "SKIPPED" : "COMPLETED" : "PROPOSED" : "UNSPECIFIED");
            sb.append("' entryPoint='");
            int i2 = dexeVar.g;
            dexc dexcVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : dexc.TELEDOCTOR : dexc.STARTUP : dexc.UNKNOWN;
            if (dexcVar == null) {
                dexcVar = dexc.UNRECOGNIZED;
            }
            sb.append(dexcVar.a());
            sb.append("'>");
            int b4 = dexd.b(dexeVar.f);
            if (b4 != 0 && b4 == 6) {
                Log.e("AppDoctorLogger", sb.toString());
            } else {
                Log.i("AppDoctorLogger", sb.toString());
            }
        }
    }
}
