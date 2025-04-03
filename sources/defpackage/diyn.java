package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diyn extends Handler {
    public static final Object a = new Object();
    public diym[] b;
    public int c;
    public diym[] d;
    public int e;
    public final diyj f;
    public final diyk g;
    public diyb h;
    public final List i;
    public final HashMap j;
    public dixy k;
    public final ArrayList l;
    private boolean m;
    private Message n;
    private final dixz o;
    private boolean p;
    private final CountDownLatch q;
    private int r;
    private dixy s;
    private boolean t;

    public diyn(Looper looper, diyb diybVar) {
        super(looper);
        this.m = false;
        this.o = new dixz();
        this.c = -1;
        diyj diyjVar = new diyj();
        this.f = diyjVar;
        diyk diykVar = new diyk();
        this.g = diykVar;
        this.q = new CountDownLatch(1);
        this.i = new CopyOnWriteArrayList();
        this.j = new HashMap();
        this.t = false;
        this.l = new ArrayList();
        this.h = diybVar;
        c(diyjVar, null);
        c(diykVar, null);
    }

    static String d(dixy dixyVar) {
        return dixyVar != null ? dixyVar.a() : "null";
    }

    private final void g(diyl diylVar) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            diylVar.a((dixx) it.next());
        }
    }

    private final void h(int i) {
        int i2 = i;
        while (true) {
            int i3 = this.c;
            if (i2 > i3) {
                this.t = false;
                return;
            }
            if (i == i3) {
                this.t = false;
            }
            final dixy dixyVar = this.b[i2].a;
            dixyVar.b();
            g(new diyl() { // from class: diyi
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.diyl
                public final void a(Object obj) {
                    obj.b(dixy.this);
                }
            });
            this.b[i2].c = true;
            i2++;
        }
    }

    private final void i() {
        g(new diyl() { // from class: diye
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.diyl
            public final void a(Object obj) {
                obj.d();
            }
        });
    }

    public final int a() {
        int i = this.c + 1;
        int i2 = this.e - 1;
        int i3 = i;
        while (i2 >= 0) {
            this.b[i3] = this.d[i2];
            i2--;
            i3++;
        }
        this.c = i3 - 1;
        return i;
    }

    final dixy b() {
        int i;
        diym[] diymVarArr = this.b;
        if (diymVarArr == null || (i = this.c) < 0) {
            return null;
        }
        return diymVarArr[i].a;
    }

    final diym c(dixy dixyVar, dixy dixyVar2) {
        diym diymVar = null;
        if (dixyVar2 != null) {
            diym diymVar2 = (diym) this.j.get(dixyVar2);
            diymVar = diymVar2 == null ? c(dixyVar2, null) : diymVar2;
        }
        diym diymVar3 = (diym) this.j.get(dixyVar);
        if (diymVar3 == null) {
            diymVar3 = new diym();
            this.j.put(dixyVar, diymVar3);
        }
        diym diymVar4 = diymVar3.b;
        if (diymVar4 != null && diymVar4 != diymVar) {
            throw new RuntimeException("state already added");
        }
        diymVar3.a = dixyVar;
        diymVar3.b = diymVar;
        diymVar3.c = false;
        return diymVar3;
    }

    final void e(dixy dixyVar) {
        diyb diybVar;
        if (this.t && (diybVar = this.h) != null) {
            diybVar.h("transitionTo called while transition already in progress to " + String.valueOf(this.s) + ", new target state=" + String.valueOf(dixyVar));
        }
        this.s = dixyVar;
        diyb diybVar2 = this.h;
        if (diybVar2 != null) {
            diybVar2.i("transitionTo: destState=".concat(String.valueOf(dixyVar.a())));
        }
        g(new diyl() { // from class: diyg
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.diyl
            public final void a(Object obj) {
                obj.g();
            }
        });
    }

    public final void f() {
        this.r++;
        sendMessageAtFrontOfQueue(obtainMessage(-2, a));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0142 A[Catch: all -> 0x015f, LOOP:3: B:70:0x0140->B:71:0x0142, LOOP_END, TryCatch #0 {all -> 0x015f, blocks: (B:45:0x00d2, B:46:0x00d5, B:49:0x00e5, B:50:0x00ed, B:62:0x010c, B:63:0x010e, B:65:0x0112, B:67:0x0118, B:69:0x0132, B:71:0x0142, B:73:0x0150, B:77:0x015c, B:53:0x00fe, B:57:0x0106, B:86:0x00db), top: B:44:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0159 A[LOOP:0: B:46:0x00d5->B:75:0x0159, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015c A[EDGE_INSN: B:76:0x015c->B:77:0x015c BREAK  A[LOOP:0: B:46:0x00d5->B:75:0x0159], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fb A[SYNTHETIC] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(final android.os.Message r13) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.diyn.handleMessage(android.os.Message):void");
    }
}
