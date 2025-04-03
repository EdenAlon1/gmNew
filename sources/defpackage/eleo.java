package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eleo implements Runnable {
    public final elco a;
    public final UUID b;
    public final boolean c;
    public final eldq d;
    public final AtomicReference e;
    public ListenableFuture f;
    private final dlpw h;
    private final long i;
    private final Set j = new HashSet();
    int g = 0;
    private final boolean k = false;

    public eleo(elco elcoVar, UUID uuid, eldq eldqVar, elem elemVar, long j, boolean z, boolean z2, dlpw dlpwVar) {
        this.a = elcoVar;
        this.b = uuid;
        this.d = eldqVar;
        this.i = j;
        this.c = z;
        this.h = dlpwVar;
        this.e = new AtomicReference(elemVar);
    }

    public final long a() {
        return this.h.b() - this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0153 A[Catch: all -> 0x01cc, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0013, B:8:0x0017, B:10:0x001c, B:12:0x0030, B:14:0x0040, B:18:0x004c, B:22:0x005e, B:24:0x0067, B:26:0x006c, B:29:0x007b, B:30:0x0081, B:31:0x0087, B:33:0x008d, B:36:0x009a, B:38:0x00a3, B:40:0x00ad, B:42:0x00b6, B:44:0x00ba, B:46:0x00c0, B:50:0x00cc, B:54:0x00da, B:59:0x00f2, B:61:0x0107, B:63:0x0109, B:70:0x011c, B:72:0x0120, B:73:0x0140, B:75:0x0149, B:77:0x014b, B:82:0x012d, B:83:0x0136, B:85:0x014e, B:87:0x0153, B:88:0x01a4, B:91:0x01b5, B:92:0x01ba, B:95:0x01bc, B:96:0x01c3, B:97:0x01c4, B:98:0x01cb), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c4 A[Catch: all -> 0x01cc, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0013, B:8:0x0017, B:10:0x001c, B:12:0x0030, B:14:0x0040, B:18:0x004c, B:22:0x005e, B:24:0x0067, B:26:0x006c, B:29:0x007b, B:30:0x0081, B:31:0x0087, B:33:0x008d, B:36:0x009a, B:38:0x00a3, B:40:0x00ad, B:42:0x00b6, B:44:0x00ba, B:46:0x00c0, B:50:0x00cc, B:54:0x00da, B:59:0x00f2, B:61:0x0107, B:63:0x0109, B:70:0x011c, B:72:0x0120, B:73:0x0140, B:75:0x0149, B:77:0x014b, B:82:0x012d, B:83:0x0136, B:85:0x014e, B:87:0x0153, B:88:0x01a4, B:91:0x01b5, B:92:0x01ba, B:95:0x01bc, B:96:0x01c3, B:97:0x01c4, B:98:0x01cb), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final defpackage.eldu b() {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eleo.b():eldu");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        eldu elduVar;
        eleo eleoVar = this;
        ListenableFuture listenableFuture = eleoVar.f;
        eldu b = eleoVar.b();
        boolean isCancelled = listenableFuture.isCancelled();
        elco elcoVar = eleoVar.a;
        try {
            if (isCancelled) {
                try {
                    ekxg ekxgVar = ((ekwu) b).c.i;
                    if (ekxgVar == null) {
                        ekxgVar = ekxg.a;
                    }
                    long a = elcoVar.b.a();
                    eldq eldqVar = ((ekwu) b).c;
                    long j = a - eldqVar.g;
                    eldn eldnVar = (eldn) eldqVar.toBuilder();
                    ekxb ekxbVar = (ekxb) ekxgVar.toBuilder();
                    ekxc ekxcVar = (ekxc) ekxd.a.createBuilder();
                    int i = ((ekwu) b).e;
                    ekxcVar.copyOnWrite();
                    ekxd ekxdVar = (ekxd) ekxcVar.instance;
                    ekxdVar.b |= 2;
                    ekxdVar.d = i;
                    ekxcVar.copyOnWrite();
                    ekxd ekxdVar2 = (ekxd) ekxcVar.instance;
                    ekxdVar2.b |= 1;
                    ekxdVar2.c = j;
                    ekxd ekxdVar3 = (ekxd) ekxcVar.build();
                    ekxbVar.copyOnWrite();
                    ekxg ekxgVar2 = (ekxg) ekxbVar.instance;
                    ekxdVar3.getClass();
                    ekxgVar2.d = ekxdVar3;
                    ekxgVar2.b |= 2;
                    ekxg ekxgVar3 = (ekxg) ekxbVar.build();
                    eldnVar.copyOnWrite();
                    eldq eldqVar2 = (eldq) eldnVar.instance;
                    ekxgVar3.getClass();
                    eldqVar2.i = ekxgVar3;
                    eldqVar2.b |= 32;
                    eldq eldqVar3 = (eldq) eldnVar.build();
                    int size = eldqVar3.e.size() - 1;
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = -1; size != i2; i2 = -1) {
                        ekzx ekzxVar = (ekzx) eldqVar3.e.get(size);
                        elduVar = b;
                        try {
                            arrayList.add(new StackTraceElement("tk_trace", String.valueOf(ekzxVar.c).concat((ekzxVar.b & 32) == 0 ? " (Timed Out)" : ""), "Started After", (int) (ekzxVar.f / 1000)));
                            size = ((ekzx) eldqVar3.e.get(size)).e;
                            b = elduVar;
                        } catch (Throwable th) {
                            th = th;
                            eleoVar = null;
                            emxf.l(((eleo) elcoVar.d.remove(((ekwu) elduVar).b)) != null ? 1 : eleoVar);
                            throw th;
                        }
                    }
                    elduVar = b;
                    eleoVar = null;
                    eldx eldxVar = new eldx(null, (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                    eldx.j(eldqVar3, Collections.singletonMap(0, eldxVar), 0, new HashMap());
                    ((enrr) ((enrr) ((enrr) elco.a.i()).g(eldxVar)).h("com/google/apps/tiktok/tracing/TraceManagerImpl", "handleTraceTimeout", 342, "TraceManagerImpl.java")).J("Trace %s timed out after %d ms. Complete trace: %s", ((ekwu) elduVar).a, Long.valueOf(j), eldqVar3);
                    elcoVar.e(eldqVar3, ((ekwu) elduVar).d, ((ekwu) elduVar).a);
                } catch (Throwable th2) {
                    th = th2;
                    elduVar = b;
                }
            } else {
                elduVar = b;
                eleoVar = null;
                try {
                    erqt.q(listenableFuture);
                    long j2 = ((ekwu) elduVar).c.g;
                    while (true) {
                        long j3 = elcoVar.e.get();
                        if (j2 <= j3) {
                            break;
                        }
                        if (elcoVar.e.compareAndSet(j3, 300000 + j2)) {
                            long j4 = j2 - elcoVar.g;
                            for (final eleo eleoVar2 : elcoVar.d.values()) {
                                if (eleoVar2.d.g < j4) {
                                    errk schedule = ((errm) elcoVar.c.b()).schedule(new Runnable() { // from class: elcl
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                        }
                                    }, 10L, TimeUnit.SECONDS);
                                    eleoVar2.getClass();
                                    schedule.b(new Runnable() { // from class: elcm
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            eleo.this.f.cancel(false);
                                        }
                                    }, erpp.a);
                                }
                            }
                        }
                    }
                    elcoVar.e(((ekwu) elduVar).c, ((ekwu) elduVar).d, ((ekwu) elduVar).a);
                } catch (ExecutionException e) {
                    ((enrr) ((enrr) ((enrr) elco.a.i()).g(e.getCause())).h("com/google/apps/tiktok/tracing/TraceManagerImpl", "handleTraceComplete", 293, "TraceManagerImpl.java")).t("Trace %s failed collection", ((ekwu) elduVar).a);
                }
            }
            emxf.l(((eleo) elcoVar.d.remove(((ekwu) elduVar).b)) != null ? 1 : eleoVar);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final String toString() {
        return "UnfinishedTrace@" + Integer.toHexString(System.identityHashCode(this)) + "[" + ((ekwu) b()).a + "]";
    }
}
