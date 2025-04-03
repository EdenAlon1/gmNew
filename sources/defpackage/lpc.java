package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lpc extends Handler {
    final /* synthetic */ lpf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpc(lpf lpfVar, Looper looper) {
        super(looper);
        this.a = lpfVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        lpd[] lpdVarArr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        lpf lpfVar = this.a;
        while (true) {
            synchronized (lpfVar.b) {
                size = lpfVar.c.size();
                if (size <= 0) {
                    return;
                }
                lpdVarArr = new lpd[size];
                lpfVar.c.toArray(lpdVarArr);
                lpfVar.c.clear();
            }
            for (int i = 0; i < size; i++) {
                lpd lpdVar = lpdVarArr[i];
                int size2 = lpdVar.b.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    lpe lpeVar = (lpe) lpdVar.b.get(i2);
                    if (!lpeVar.d) {
                        lpeVar.b.onReceive(lpfVar.a, lpdVar.a);
                    }
                }
            }
        }
    }
}
