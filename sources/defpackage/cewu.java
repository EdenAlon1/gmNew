package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cewu extends BroadcastReceiver {
    final /* synthetic */ cewv a;

    public cewu(cewv cewvVar) {
        this.a = cewvVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, final Intent intent) {
        ekzm b = this.a.e.b("dump_pwq_state");
        try {
            elfo.f(new Runnable() { // from class: cewt
                /* JADX WARN: Removed duplicated region for block: B:120:0x0096  */
                /* JADX WARN: Removed duplicated region for block: B:126:0x009d A[Catch: all -> 0x02c8, TryCatch #1 {all -> 0x02c8, blocks: (B:3:0x0013, B:5:0x002c, B:6:0x00cf, B:8:0x00d7, B:9:0x0113, B:14:0x0147, B:38:0x01cd, B:39:0x01d2, B:42:0x01dd, B:43:0x01e5, B:45:0x01eb, B:67:0x0255, B:73:0x0269, B:75:0x027c, B:77:0x028f, B:79:0x02a3, B:98:0x02be, B:36:0x02c7, B:35:0x02c4, B:104:0x013d, B:106:0x0033, B:121:0x0098, B:122:0x00a6, B:124:0x00b0, B:125:0x00c6, B:126:0x009d, B:30:0x02bf, B:100:0x01d5, B:41:0x01dc, B:102:0x0153, B:18:0x0163, B:20:0x0178, B:21:0x018b, B:24:0x01a4, B:13:0x0138), top: B:2:0x0013, inners: #0, #2, #3, #4 }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 746
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.cewt.run():void");
                }
            }, this.a.c);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
