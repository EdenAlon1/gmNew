package defpackage;

import android.content.Intent;
import android.os.Process;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eagy {
    public static final void a(eaha eahaVar, Intent intent, eafp eafpVar, long j) {
        int threadPriority = Process.getThreadPriority(0);
        try {
            Process.setThreadPriority(10);
            eahaVar.a(intent, eafpVar, j);
        } finally {
            Process.setThreadPriority(threadPriority);
        }
    }
}
