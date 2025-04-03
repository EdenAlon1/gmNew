package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eevp {
    static final eexh a = new eexh("debug.binder.verification");
    private static final Object e;
    private static final eevt f;
    public final CopyOnWriteArrayList b;
    public volatile boolean c;
    public volatile eevr d;
    private Context g;
    private eevp h;
    private final Map i;
    private final Map j;
    private final Map k;
    private final Set l;
    private final ThreadLocal m;

    static {
        eexk.a(new eexh("debug.binder.strict_mode"));
        e = new Object();
        f = new eevt(new eevy());
    }

    public eevp() {
        this.i = DesugarCollections.synchronizedMap(new HashMap());
        this.j = DesugarCollections.synchronizedMap(new HashMap());
        this.k = DesugarCollections.synchronizedMap(new HashMap());
        this.l = DesugarCollections.synchronizedSet(new HashSet());
        this.b = new CopyOnWriteArrayList();
        this.m = new ThreadLocal();
        this.d = new eewb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x016b, code lost:
    
        throw new java.lang.IllegalStateException("Binder not initialized yet.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        r9 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        if (r4.g == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        r0 = r4.c(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        r3 = (java.util.List) r4.j.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        if (r3 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
    
        if (defpackage.eexk.a(defpackage.eevp.a) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        r3 = r4.i.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
    
        if (r3 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
    
        if (r3 != defpackage.eevp.e) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
    
        throw new java.lang.IllegalStateException(defpackage.a.G(r10, "getAll() called for single-bound object: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:
    
        r3 = new java.util.ArrayList();
        r4.j.put(r10, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cc, code lost:
    
        if (r4.l.add(r10) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
    
        r5 = (java.lang.Boolean) r4.m.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d6, code lost:
    
        if (r5 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dc, code lost:
    
        if (r5.booleanValue() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00de, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e1, code lost:
    
        if (r5 != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e3, code lost:
    
        r4.m.set(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ec, code lost:
    
        r6 = r4.b.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f2, code lost:
    
        if (r1 >= r6) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f4, code lost:
    
        r7 = (defpackage.eevv) r4.b.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fc, code lost:
    
        r8 = r4.g;
        r7.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0101, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0106, code lost:
    
        if (r5 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0108, code lost:
    
        r4.m.set(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010e, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010f, code lost:
    
        if (r5 == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0111, code lost:
    
        r4.m.set(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0116, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e0, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011b, code lost:
    
        if (r3.isEmpty() != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x011d, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014b, code lost:
    
        r9.addAll(r3);
        r10 = r4.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0154, code lost:
    
        if (r9.isEmpty() != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015f, code lost:
    
        return new java.util.ArrayList(defpackage.enip.o(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0160, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x011f, code lost:
    
        r3 = new java.util.ArrayList();
        r10 = (java.util.Map) r4.k.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012c, code lost:
    
        if (r10 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012e, code lost:
    
        r10 = r10.values().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x013a, code lost:
    
        if (r10.hasNext() == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013c, code lost:
    
        r1 = r10.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0140, code lost:
    
        if (r1 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0144, code lost:
    
        if (r1 == defpackage.eevp.e) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0146, code lost:
    
        r3.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x014a, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List a(android.content.Context r9, java.lang.Class r10) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eevp.a(android.content.Context, java.lang.Class):java.util.List");
    }

    private final Object c(Object obj) {
        return this.d.a(obj);
    }

    public final void b(Object obj, Object obj2) {
        synchronized (c(obj)) {
            if (eexk.a(a)) {
                List list = (List) this.j.get(obj);
                if (list != null && !list.isEmpty()) {
                    throw new IllegalStateException(a.G(obj, "Attempt to single-bind multibound object: "));
                }
                Map map = (Map) this.k.get(obj);
                if (map != null) {
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        if (it.next() != e) {
                            throw new IllegalStateException(a.G(obj, "Attempt to single-bind an object that is already multibound with keys: "));
                        }
                    }
                }
            }
            Object obj3 = this.i.get(obj);
            if (obj3 != null) {
                if (obj3 != e) {
                    throw new eevn(a.c(obj3, obj, "Duplicate binding: ", ", "));
                }
                throw new eevo(a.G(obj, "Bind call too late - someone already tried to get: "));
            }
            this.i.put(obj, obj2);
        }
    }

    public eevp(Context context) {
        this.i = DesugarCollections.synchronizedMap(new HashMap());
        this.j = DesugarCollections.synchronizedMap(new HashMap());
        this.k = DesugarCollections.synchronizedMap(new HashMap());
        this.l = DesugarCollections.synchronizedSet(new HashSet());
        this.b = new CopyOnWriteArrayList();
        this.m = new ThreadLocal();
        this.d = new eewb();
        this.g = context;
        this.h = null;
        context.getClass().getName();
        b(Context.class, context);
    }
}
