package defpackage;

import android.net.TrafficStats;
import android.os.Process;
import java.io.IOException;
import javax.net.ServerSocketFactory;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eech {
    public static synchronized int a() {
        int i;
        synchronized (eech.class) {
            int i2 = 20000;
            i = -1;
            while (i == -1) {
                try {
                    TrafficStats.setThreadStatsTag(Process.myPid());
                    ServerSocketFactory.getDefault().createServerSocket(i2).close();
                    TrafficStats.clearThreadStatsTag();
                    i = i2;
                } catch (IOException unused) {
                    TrafficStats.clearThreadStatsTag();
                    i2++;
                } catch (Throwable th) {
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
        }
        return i;
    }
}
