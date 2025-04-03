package defpackage;

import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.clearcut.internal.LogErrorParcelable;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfne {
    private static dfne a;
    private int c = 0;
    private final Map b = new cmh();

    private dfne() {
    }

    static synchronized dfne b() {
        dfne dfneVar;
        synchronized (dfne.class) {
            if (a == null) {
                a = new dfne();
            }
            dfneVar = a;
        }
        return dfneVar;
    }

    final synchronized BatchedLogErrorParcelable a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.b.values());
        int i = this.c;
        if (i > 0) {
            arrayList.add(new LogErrorParcelable("UNKNOWN", 1002, i));
            this.c = 0;
        }
        this.b.clear();
        return new BatchedLogErrorParcelable(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final synchronized void c(LogErrorParcelable logErrorParcelable) {
        ksr ksrVar = new ksr(logErrorParcelable.a, Integer.valueOf(logErrorParcelable.b));
        LogErrorParcelable logErrorParcelable2 = (LogErrorParcelable) this.b.get(ksrVar);
        if (logErrorParcelable2 != null) {
            logErrorParcelable2.c = erla.c(logErrorParcelable2.c, logErrorParcelable.c);
            return;
        }
        Map map = this.b;
        if (((cpn) map).d >= 100) {
            this.c = erla.c(this.c, logErrorParcelable.c);
        } else {
            map.put(ksrVar, logErrorParcelable);
        }
    }
}
