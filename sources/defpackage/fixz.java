package defpackage;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xbill.DNS2.ResolverConfig;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fixz {
    static Class a;
    private static fizj e;
    private static fiyt[] f;
    private static Map g;
    private static int h;
    public fizj b;
    public fiwq c;
    public int d;
    private fiyt[] i;
    private int j;
    private fiyt k;
    private int l;
    private boolean m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private List r;
    private fizg[] s;
    private int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    static {
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public fixz(java.lang.String r3, int r4) {
        /*
            r2 = this;
            r0 = 0
            fiyt r3 = defpackage.fiyt.e(r3, r0)
            r2.<init>()
            defpackage.fjaf.b(r4)
            r0 = 1
            defpackage.fiwx.b(r0)
            r1 = 41
            if (r4 == r1) goto L17
            switch(r4) {
                case 249: goto L17;
                case 250: goto L17;
                case 251: goto L17;
                case 252: goto L17;
                case 253: goto L17;
                case 254: goto L17;
                case 255: goto L17;
                default: goto L16;
            }
        L16:
            goto L1b
        L17:
            r1 = 255(0xff, float:3.57E-43)
            if (r4 != r1) goto L5f
        L1b:
            r2.k = r3
            r2.l = r4
            r2.d = r0
            java.lang.Class r3 = defpackage.fixz.a
            if (r3 != 0) goto L39
            java.lang.String r3 = "fixz"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L2e
            defpackage.fixz.a = r3
            goto L39
        L2e:
            r3 = move-exception
            java.lang.NoClassDefFoundError r4 = new java.lang.NoClassDefFoundError
            r4.<init>()
            java.lang.Throwable r3 = r4.initCause(r3)
            throw r3
        L39:
            monitor-enter(r3)
            fizj r4 = b()     // Catch: java.lang.Throwable -> L5c
            r2.b = r4     // Catch: java.lang.Throwable -> L5c
            fiyt[] r4 = d()     // Catch: java.lang.Throwable -> L5c
            r2.i = r4     // Catch: java.lang.Throwable -> L5c
            fiwq r4 = f()     // Catch: java.lang.Throwable -> L5c
            r2.c = r4     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5c
            r3 = 3
            r2.j = r3
            java.lang.String r3 = "verbose"
            boolean r3 = defpackage.fiyy.a(r3)
            r2.m = r3
            r3 = -1
            r2.t = r3
            return
        L5c:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5c
            throw r4
        L5f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Cannot query for meta-types other than ANY"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fixz.<init>(java.lang.String, int):void");
    }

    public static synchronized fizj b() {
        fizj fizjVar;
        synchronized (fixz.class) {
            fizjVar = e;
        }
        return fizjVar;
    }

    public static synchronized void c() {
        synchronized (fixz.class) {
            try {
                e = new fixj();
                f = ResolverConfig.b().c;
                g = new HashMap();
                int i = ResolverConfig.b().d;
                if (i < 0) {
                    i = 1;
                }
                h = i;
            } catch (UnknownHostException unused) {
                throw new RuntimeException("Failed to initialize resolver");
            }
        }
    }

    public static synchronized fiyt[] d() {
        fiyt[] fiytVarArr;
        synchronized (fixz.class) {
            fiytVarArr = f;
        }
        return fiytVarArr;
    }

    public static synchronized fiwq f() {
        synchronized (fixz.class) {
            fiwx.b(1);
            fiwq fiwqVar = (fiwq) g.get(fiyi.b(1));
            if (fiwqVar != null) {
                return fiwqVar;
            }
            fiwq fiwqVar2 = new fiwq(null);
            g.put(fiyi.b(1), fiwqVar2);
            return fiwqVar2;
        }
    }

    private final void g(fiyt fiytVar, fiyt fiytVar2) {
        this.o = true;
        this.v = false;
        this.w = false;
        this.x = false;
        this.u = false;
        this.z = false;
        int i = this.n + 1;
        this.n = i;
        if (i >= 6 || fiytVar.equals(fiytVar2)) {
            this.t = 1;
            this.p = true;
        } else {
            if (this.r == null) {
                this.r = new ArrayList();
            }
            this.r.add(fiytVar2);
            h(fiytVar);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private final void h(defpackage.fiyt r23) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fixz.h(fiyt):void");
    }

    private final void i(fiyt fiytVar, fizs fizsVar) {
        int i = fizsVar.d;
        if (i == 6) {
            List list = (List) fizsVar.e;
            fizd[] fizdVarArr = (fizd[]) list.toArray(new fizd[list.size()]);
            ArrayList arrayList = new ArrayList();
            for (fizd fizdVar : fizdVarArr) {
                Iterator f2 = fizdVar.f();
                while (f2.hasNext()) {
                    arrayList.add(f2.next());
                }
            }
            this.t = 0;
            this.s = (fizg[]) arrayList.toArray(new fizg[arrayList.size()]);
            this.p = true;
            return;
        }
        if (i == 1) {
            this.u = true;
            this.q = true;
            if (this.n > 0) {
                this.t = 3;
                this.p = true;
                return;
            }
            return;
        }
        if (i == 2) {
            this.t = 4;
            this.s = null;
            this.p = true;
        } else {
            if (i == 4) {
                g(((fiwl) ((fizd) fizsVar.e).h()).a, fiytVar);
                return;
            }
            if (i != 5) {
                if (i == 3) {
                    this.z = true;
                }
            } else {
                try {
                    g(fiytVar.d((fixa) ((fizd) fizsVar.e).h()), fiytVar);
                } catch (fiyu unused) {
                    this.t = 1;
                    this.p = true;
                }
            }
        }
    }

    private final void j(fiyt fiytVar, fiyt fiytVar2) {
        this.q = false;
        if (fiytVar2 != null) {
            try {
                fiytVar = fiyt.c(fiytVar, fiytVar2);
            } catch (fiyu unused) {
                this.y = true;
                return;
            }
        }
        h(fiytVar);
    }

    public final int a() {
        int i;
        if (this.p && (i = this.t) != -1) {
            return i;
        }
        StringBuffer stringBuffer = new StringBuffer("Lookup of ");
        stringBuffer.append(this.k);
        stringBuffer.append(" ");
        StringBuffer stringBuffer2 = new StringBuffer(stringBuffer.toString());
        if (this.d != 1) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(fiwx.a(this.d));
            stringBuffer3.append(" ");
            stringBuffer2.append(stringBuffer3.toString());
        }
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append(fjaf.a(this.l));
        stringBuffer4.append(" isn't done");
        stringBuffer2.append(stringBuffer4.toString());
        throw new IllegalStateException(stringBuffer2.toString());
    }

    public final fizg[] e() {
        int i = 0;
        if (this.p) {
            this.n = 0;
            this.o = false;
            this.p = false;
            this.q = false;
            this.r = null;
            this.s = null;
            this.t = -1;
            this.u = false;
            this.v = false;
            this.w = false;
            this.x = false;
            this.y = false;
            this.z = false;
        }
        if (this.k.j()) {
            j(this.k, null);
        } else {
            if (this.i != null) {
                if (this.k.a() > h) {
                    j(this.k, fiyt.a);
                }
                if (!this.p) {
                    while (true) {
                        fiyt[] fiytVarArr = this.i;
                        if (i >= fiytVarArr.length) {
                            break;
                        }
                        j(this.k, fiytVarArr[i]);
                        if (!this.p) {
                            if (this.o) {
                                break;
                            }
                            i++;
                        } else {
                            break;
                        }
                    }
                }
                return this.s;
            }
            j(this.k, fiyt.a);
        }
        if (!this.p) {
            if (this.v || this.x || this.w) {
                this.t = 2;
            } else if (this.u) {
                this.t = 3;
            } else if (this.z || this.y) {
                this.t = 1;
            }
            this.p = true;
        }
        return this.s;
    }
}
