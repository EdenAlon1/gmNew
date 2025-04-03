package defpackage;

import android.os.Process;
import android.os.StrictMode;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtpo implements dtpn {
    private final Map b = new ConcurrentHashMap();
    private final dtpg c;
    private final AtomicInteger d;
    private final AtomicInteger e;
    private volatile dtpd f;

    public dtpo(dtpg dtpgVar) {
        new ConcurrentHashMap();
        this.d = new AtomicInteger();
        this.e = new AtomicInteger();
        this.c = dtpgVar;
        this.f = dtpd.d;
    }

    @Override // defpackage.dtpn
    public final dtpl a() {
        ArrayList arrayList = new ArrayList(this.b.size());
        ArrayList arrayList2 = new ArrayList(this.b.size());
        for (Map.Entry entry : this.b.entrySet()) {
            arrayList.add((dtpf) entry.getValue());
            arrayList2.add(Integer.valueOf(((dtpf) entry.getValue()).a()));
        }
        List b = dtpc.b(arrayList2);
        HashMap h = ennc.h(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            h.put(Long.valueOf(((dtpf) arrayList.get(i)).b()), (dtpd) b.get(i));
        }
        dtoz dtozVar = (dtoz) this.f;
        if (dtozVar.a != 0 || dtozVar.b != 0 || dtozVar.c != 0) {
            h.put(0L, this.f);
        }
        return new dtpl(((dtpb) this.c).a, h, this.d.get(), this.e.get());
    }

    @Override // defpackage.dtpn
    public final void b() {
        this.e.getAndIncrement();
    }

    @Override // defpackage.dtpn
    public final void c() {
        this.d.getAndIncrement();
    }

    @Override // defpackage.dtpn
    public final void d(long j) {
        dtpf dtpfVar = (dtpf) this.b.remove(Long.valueOf(j));
        if (dtpfVar != null) {
            int a = dtpfVar.a();
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                dtpd a2 = dtpc.a(new File(String.format(Locale.US, "/proc/self/task/%d/schedstat", Integer.valueOf(a))));
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                if (a2 != dtpd.d) {
                    dtoz dtozVar = (dtoz) this.f;
                    dtoz dtozVar2 = (dtoz) a2;
                    this.f = new dtoz(dtozVar.a + dtozVar2.a, dtozVar.b + dtozVar2.b, dtozVar.c + dtozVar2.c);
                }
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th;
            }
        }
    }

    @Override // defpackage.dtpn
    public final void e(long j) {
        Map map = this.b;
        Long valueOf = Long.valueOf(j);
        if (map.containsKey(valueOf)) {
            return;
        }
        this.b.put(valueOf, new dtpa(Process.myTid(), j, Thread.currentThread().getName(), ((dtpb) this.c).a));
    }
}
