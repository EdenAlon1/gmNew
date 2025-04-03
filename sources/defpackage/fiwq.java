package defpackage;

import androidx.car.app.model.Alert;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiwq {
    public fiwm a;
    public int b;
    public int c;

    public fiwq() {
        this(null);
    }

    public static int a(long j, long j2) {
        if (j2 >= 0 && j2 < j) {
            j = j2;
        }
        long currentTimeMillis = (System.currentTimeMillis() / 1000) + j;
        return (currentTimeMillis < 0 || currentTimeMillis > 2147483647L) ? Alert.DURATION_SHOW_INDEFINITELY : (int) currentTimeMillis;
    }

    public static void f(fizd fizdVar, Set set) {
        if (fizdVar.h().ie() == null) {
            return;
        }
        Iterator f = fizdVar.f();
        while (f.hasNext()) {
            fiyt ie = ((fizg) f.next()).ie();
            if (ie != null) {
                set.add(ie);
            }
        }
    }

    public static final int g(int i, boolean z) {
        if (i == 1 || i == 2) {
            return z ? 4 : 3;
        }
        return 1;
    }

    private final synchronized Object h(fiyt fiytVar) {
        return this.a.get(fiytVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x002a, code lost:
    
        if (r2.c() != r7) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized defpackage.fiwo i(defpackage.fiyt r5, java.lang.Object r6, int r7, int r8) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 255(0xff, float:3.57E-43)
            if (r7 == r0) goto L47
            boolean r0 = r6 instanceof java.util.List     // Catch: java.lang.Throwable -> L45
            r1 = 0
            if (r0 == 0) goto L23
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L45
            r0 = 0
        Ld:
            int r2 = r6.size()     // Catch: java.lang.Throwable -> L45
            if (r0 >= r2) goto L2c
            java.lang.Object r2 = r6.get(r0)     // Catch: java.lang.Throwable -> L45
            fiwo r2 = (defpackage.fiwo) r2     // Catch: java.lang.Throwable -> L45
            int r3 = r2.c()     // Catch: java.lang.Throwable -> L45
            if (r3 != r7) goto L20
            goto L2d
        L20:
            int r0 = r0 + 1
            goto Ld
        L23:
            r2 = r6
            fiwo r2 = (defpackage.fiwo) r2     // Catch: java.lang.Throwable -> L45
            int r6 = r2.c()     // Catch: java.lang.Throwable -> L45
            if (r6 == r7) goto L2d
        L2c:
            r2 = r1
        L2d:
            if (r2 != 0) goto L31
            monitor-exit(r4)
            return r1
        L31:
            boolean r6 = r2.b()     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L3c
            r4.k(r5, r7)     // Catch: java.lang.Throwable -> L45
            monitor-exit(r4)
            return r1
        L3c:
            int r5 = r2.a(r8)     // Catch: java.lang.Throwable -> L45
            monitor-exit(r4)
            if (r5 >= 0) goto L44
            return r1
        L44:
            return r2
        L45:
            r5 = move-exception
            goto L4f
        L47:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L45
            java.lang.String r6 = "oneElement(ANY)"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L45
            throw r5     // Catch: java.lang.Throwable -> L45
        L4f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L45
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fiwq.i(fiyt, java.lang.Object, int, int):fiwo");
    }

    private final synchronized void j(fiyt fiytVar, fiwo fiwoVar) {
        Object obj = this.a.get(fiytVar);
        if (obj == null) {
            this.a.put(fiytVar, fiwoVar);
            return;
        }
        int c = fiwoVar.c();
        if (obj instanceof List) {
            List list = (List) obj;
            for (int i = 0; i < list.size(); i++) {
                if (((fiwo) list.get(i)).c() == c) {
                    list.set(i, fiwoVar);
                    return;
                }
            }
            list.add(fiwoVar);
            return;
        }
        fiwo fiwoVar2 = (fiwo) obj;
        if (fiwoVar2.c() == c) {
            this.a.put(fiytVar, fiwoVar);
            return;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(fiwoVar2);
        linkedList.add(fiwoVar);
        this.a.put(fiytVar, linkedList);
    }

    private final synchronized void k(fiyt fiytVar, int i) {
        Object obj = this.a.get(fiytVar);
        if (obj != null) {
            if (obj instanceof List) {
                List list = (List) obj;
                int i2 = 0;
                while (true) {
                    if (i2 >= list.size()) {
                        break;
                    }
                    if (((fiwo) list.get(i2)).c() == i) {
                        list.remove(i2);
                        if (list.size() == 0) {
                            this.a.remove(fiytVar);
                            return;
                        }
                    } else {
                        i2++;
                    }
                }
            } else if (((fiwo) obj).c() == i) {
                this.a.remove(fiytVar);
            }
        }
    }

    private final synchronized fiwo[] l(Object obj) {
        if (!(obj instanceof List)) {
            return new fiwo[]{(fiwo) obj};
        }
        List list = (List) obj;
        return (fiwo[]) list.toArray(new fiwo[list.size()]);
    }

    private final synchronized fiwo m(fiyt fiytVar, int i) {
        Object h = h(fiytVar);
        if (h == null) {
            return null;
        }
        return i(fiytVar, h, i, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
    
        if (i(r5, r8, 0, r20) == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e1, code lost:
    
        return defpackage.fizs.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0096, code lost:
    
        return new defpackage.fizs(2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final synchronized defpackage.fizs b(defpackage.fiyt r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fiwq.b(fiyt, int, int):fizs");
    }

    public final synchronized void c(fiyt fiytVar, int i, fizn fiznVar, int i2) {
        long j;
        if (fiznVar != null) {
            try {
                j = fiznVar.i;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            j = 0;
        }
        fiwo m = m(fiytVar, i);
        if (j != 0) {
            if (m == null || m.a(i2) <= 0) {
                m = null;
            }
            if (m == null) {
                j(fiytVar, new fiwp(fiytVar, i, fiznVar, i2, this.b));
            }
        } else if (m != null && m.a(i2) <= 0) {
            k(fiytVar, i);
        }
    }

    public final synchronized void d(fizd fizdVar, int i) {
        long e = fizdVar.e();
        fiyt g = fizdVar.g();
        int c = fizdVar.c();
        fiwo m = m(g, c);
        if (e != 0) {
            if (m == null || m.a(i) <= 0) {
                m = null;
            }
            if (m == null) {
                j(g, fizdVar instanceof fiwn ? (fiwn) fizdVar : new fiwn(fizdVar, i, this.c));
            }
        } else if (m != null && m.a(i) <= 0) {
            k(g, c);
        }
    }

    public final synchronized void e() {
        this.a.clear();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        synchronized (this) {
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                for (fiwo fiwoVar : l(it.next())) {
                    stringBuffer.append(fiwoVar);
                    stringBuffer.append("\n");
                }
            }
        }
        return stringBuffer.toString();
    }

    public fiwq(byte[] bArr) {
        this.b = -1;
        this.c = -1;
        this.a = new fiwm();
    }
}
