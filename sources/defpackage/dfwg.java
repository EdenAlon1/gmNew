package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfwg implements Handler.Callback {
    final /* synthetic */ dfwh a;

    public dfwg(dfwh dfwhVar) {
        this.a = dfwhVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.a.d) {
                dfwd dfwdVar = (dfwd) message.obj;
                dfwf dfwfVar = (dfwf) this.a.d.get(dfwdVar);
                if (dfwfVar != null && dfwfVar.b()) {
                    if (dfwfVar.c) {
                        dfwfVar.g.f.removeMessages(1, dfwfVar.e);
                        dfwh dfwhVar = dfwfVar.g;
                        dfwhVar.g.b(dfwhVar.e, dfwfVar);
                        dfwfVar.c = false;
                        dfwfVar.b = 2;
                    }
                    this.a.d.remove(dfwdVar);
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        synchronized (this.a.d) {
            dfwd dfwdVar2 = (dfwd) message.obj;
            dfwf dfwfVar2 = (dfwf) this.a.d.get(dfwdVar2);
            if (dfwfVar2 != null && dfwfVar2.b == 3) {
                Log.e("GmsClientSupervisor", a.C(dfwdVar2, "Timeout waiting for ServiceConnection callback "), new Exception());
                ComponentName componentName = dfwfVar2.f;
                if (componentName == null) {
                    componentName = dfwdVar2.c;
                }
                if (componentName == null) {
                    String str = dfwdVar2.b;
                    dfwv.n(str);
                    componentName = new ComponentName(str, "unknown");
                }
                dfwfVar2.onServiceDisconnected(componentName);
            }
        }
        return true;
    }
}
