package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dllg {
    public final dllm a;
    public final enip b;
    private final emxc c = emxc.i(null);

    public dllg(dllf dllfVar) {
        this.a = dllfVar.a;
        this.b = dllfVar.b.g();
    }

    public static emxc a(Class cls) {
        try {
            return emxc.j((dllp) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ReflectiveOperationException unused) {
            return emux.a;
        }
    }

    static /* synthetic */ enhk c() {
        return enhk.r(dexf.DO_NOTHING, dlmj.class, dexf.FILE_DELETION, dlmm.class, dexf.EXEC_SQL_FIX, dlmk.class, dexf.SEND_BROADCAST, dlmo.class, dexf.PROCESS_RESTART, dlmn.class, dexf.SHARED_PREFERENCES_DELETION, dlmt.class, dexf.COMPONENT_ENABLED_SETTING_FIX, dlmi.class, dexf.START_SERVICE, dlmu.class);
    }

    public final enhk b() {
        if (!this.c.g()) {
            return c();
        }
        enhd enhdVar = new enhd();
        enhdVar.g(c());
        enhdVar.g((Map) ((emyl) this.c.c()).get());
        return enhdVar.c();
    }

    public final void d(Context context, dexf dexfVar, dexc dexcVar) {
        Log.e("AppDoctor", "Failed on fix: " + dexfVar.a());
        dexb dexbVar = (dexb) dexe.a.createBuilder();
        String packageName = context.getPackageName();
        dexbVar.copyOnWrite();
        dexe dexeVar = (dexe) dexbVar.instance;
        packageName.getClass();
        dexeVar.b |= 1;
        dexeVar.c = packageName;
        dexbVar.copyOnWrite();
        dexe dexeVar2 = (dexe) dexbVar.instance;
        dexeVar2.g = dexcVar.a();
        dexeVar2.b |= 16;
        dexbVar.copyOnWrite();
        dexe dexeVar3 = (dexe) dexbVar.instance;
        dexeVar3.f = dexd.a(6);
        dexeVar3.b |= 8;
        dexbVar.copyOnWrite();
        dexe dexeVar4 = (dexe) dexbVar.instance;
        dexeVar4.e = dexfVar.a();
        dexeVar4.b |= 4;
        this.a.a((dexe) dexbVar.build());
    }

    public final void e(Context context, deyk deykVar, dexc dexcVar) {
        dexf dexfVar;
        if (deykVar != null) {
            dexfVar = dexf.b(deykVar.b);
            if (dexfVar == null) {
                dexfVar = dexf.UNRECOGNIZED;
            }
        } else {
            dexfVar = dexf.UNSPECIFIED_FIX;
        }
        d(context, dexfVar, dexcVar);
    }

    public final void f(Context context, dexf dexfVar, dexc dexcVar) {
        dexb dexbVar = (dexb) dexe.a.createBuilder();
        String packageName = context.getPackageName();
        dexbVar.copyOnWrite();
        dexe dexeVar = (dexe) dexbVar.instance;
        packageName.getClass();
        dexeVar.b |= 1;
        dexeVar.c = packageName;
        dexbVar.copyOnWrite();
        dexe dexeVar2 = (dexe) dexbVar.instance;
        dexeVar2.g = dexcVar.a();
        dexeVar2.b |= 16;
        dexbVar.copyOnWrite();
        dexe dexeVar3 = (dexe) dexbVar.instance;
        dexeVar3.f = dexd.a(5);
        dexeVar3.b |= 8;
        dexbVar.copyOnWrite();
        dexe dexeVar4 = (dexe) dexbVar.instance;
        dexeVar4.e = dexfVar.a();
        dexeVar4.b |= 4;
        this.a.a((dexe) dexbVar.build());
    }

    final boolean g(Context context, dexc dexcVar) {
        List<deyk> list;
        dexf dexfVar;
        if (dlli.a(context)) {
            dllu dlluVar = new dllu();
            dlluVar.b = context;
            dlluVar.a = dexcVar;
            dlluVar.c = this.a;
            dllv a = dlluVar.a();
            try {
                dllj dlljVar = new dllj(context);
                try {
                    dlmc dlmcVar = new dlmc(new dlld(this, dlljVar, a));
                    enhk b = b();
                    Bundle call = dlljVar.b.call("get_fixes", null, dlljVar.a());
                    if (call == null) {
                        Log.e("AppDoctorProviderClient", "Failed to get config from AppDoctorProvider.");
                        int i = engw.d;
                        list = enou.a;
                    } else {
                        byte[] byteArray = call.getByteArray("com.google.android.gms.common.appdoctor.teledoctorconfig");
                        if (byteArray == null) {
                            Log.e("AppDoctorProviderClient", "TeleDoctor Config empty");
                            int i2 = engw.d;
                            list = enou.a;
                        } else {
                            try {
                                eyfc eyfcVar = eyfc.a;
                                eyib eyibVar = eyib.a;
                                list = ((deyl) eyfy.parseFrom(deyl.a, byteArray, eyfc.a)).b;
                            } catch (eygu e) {
                                Log.e("AppDoctorProviderClient", "Failed to parse TeleDoctorConfig.", e);
                                int i3 = engw.d;
                                list = enou.a;
                            }
                        }
                    }
                    for (deyk deykVar : list) {
                        dexf b2 = dexf.b(deykVar.b);
                        if (b2 == null) {
                            b2 = dexf.UNRECOGNIZED;
                        }
                        if (b.containsKey(b2)) {
                            dexf b3 = dexf.b(deykVar.b);
                            if (b3 == null) {
                                b3 = dexf.UNRECOGNIZED;
                            }
                            emxc a2 = a((Class) b.get(b3));
                            if (a2.g()) {
                                String str = deykVar.d;
                                dexf b4 = dexf.b(deykVar.b);
                                if (b4 == null) {
                                    b4 = dexf.UNRECOGNIZED;
                                }
                                deyi deyiVar = deykVar.c;
                                if (deyiVar == null) {
                                    deyiVar = deyi.a;
                                }
                                dllp dllpVar = (dllp) a2.c();
                                deyi deyiVar2 = deyiVar;
                                dlmcVar.c(new dllt(str, b4, deyiVar2, dllpVar, dllt.a));
                            } else {
                                e(a.b, deykVar, a.a);
                            }
                        } else {
                            Context context2 = a.b;
                            dexc dexcVar2 = a.a;
                            if (deykVar != null) {
                                dexfVar = dexf.b(deykVar.b);
                                if (dexfVar == null) {
                                    dexfVar = dexf.UNRECOGNIZED;
                                }
                            } else {
                                dexfVar = dexf.UNSPECIFIED_FIX;
                            }
                            f(context2, dexfVar, dexcVar2);
                        }
                    }
                    dlmb b5 = dlmcVar.b(a);
                    try {
                        b5.b.get();
                        boolean z = b5.a;
                        dlljVar.close();
                        return z;
                    } catch (InterruptedException | RuntimeException | ExecutionException unused) {
                        e(context, deyk.a, dexcVar);
                        dlljVar.close();
                    }
                } finally {
                }
            } catch (RemoteException | RuntimeException unused2) {
                e(context, deyk.a, dexcVar);
            }
        }
        return false;
    }
}
