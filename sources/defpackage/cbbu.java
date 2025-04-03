package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbbu {
    private static final cskc b = cskc.g("Bugle", "MediaResourceManager");
    public final Executor a;
    private final Executor c;

    /* compiled from: PG */
    public interface a {
        void iZ();
    }

    public cbbu(Context context) {
        ((a) ekhw.a(context, a.class)).iZ();
        this.c = csln.a("MediaLoading", 10, 10);
        this.a = Executors.newSingleThreadExecutor(new cskh("MediaBackgroundThread", 1));
    }

    public static void c(cbbs cbbsVar, boolean z, cbbn cbbnVar, cbat cbatVar) {
        if (cbbsVar != null) {
            csix.k(!z);
            csix.k(cbbsVar.a.n() > 0);
            if (cbatVar != null) {
                try {
                    cbatVar.fX(cbatVar, cbbsVar.a, cbbsVar.b);
                } finally {
                    cbbsVar.a.q();
                    cbbsVar.a();
                }
            }
            return;
        }
        if (!z) {
            csix.k(cbatVar == null || !cbatVar.i());
            csjb d = b.d();
            d.I("media request not processed, no longer bound.");
            d.D("key", cbbnVar.f());
            d.r();
            return;
        }
        csjb e = b.e();
        e.I("Asynchronous media loading failed.");
        e.A("key", cbbnVar.f());
        e.r();
        if (cbatVar != null) {
            cbatVar.fW(cbatVar);
        }
    }

    private final cbbs f(cbbn cbbnVar) {
        cbcc h;
        ArrayList arrayList = new ArrayList();
        cbcc g = cbbnVar.a() == 0 ? g(cbbnVar) : null;
        if (g == null) {
            h = h(cbbnVar, arrayList);
        } else if (g.k()) {
            cbbn l = g.l();
            csix.l(l);
            g.q();
            h = h(l, arrayList);
        } else {
            h = g;
        }
        return new cbbs(this, h, g != null, arrayList);
    }

    private static cbcc g(cbbn cbbnVar) {
        cbbl c;
        cbcc b2;
        if (cbbnVar.b() != 3 || (c = cbbnVar.c()) == null || (b2 = c.b(cbbnVar.f())) == null) {
            return null;
        }
        return b2;
    }

    private static final cbcc h(cbbn cbbnVar, List list) {
        cbcc e = cbbnVar.e(list);
        csix.l(e);
        e.p();
        if (e.h() && cbbnVar.a() == 0) {
            csix.k(true);
            cbbl c = cbbnVar.c();
            if (c != null) {
                c.a(cbbnVar.f(), e);
                csjb d = b.d();
                d.I("added media resource to");
                d.I(c.a);
                d.D("key", cbbnVar.f());
                d.r();
            }
        }
        return e;
    }

    public final /* synthetic */ cbbr a(cbat cbatVar, cbbn cbbnVar) {
        if (cbatVar != null && !cbatVar.i()) {
            return new cbbr(false, null);
        }
        try {
            return new cbbr(false, f(cbbnVar));
        } catch (Exception | OutOfMemoryError e) {
            b.s("Media Request Failed.", e);
            return new cbbr(true, null);
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x001d: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:30), block:B:22:0x001d */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cbcc b(defpackage.cbbn r6) {
        /*
            r5 = this;
            defpackage.csix.h()
            r0 = 0
            cbbs r1 = r5.f(r6)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L25 java.lang.Exception -> L27
            cbcc r2 = r1.a     // Catch: java.lang.Throwable -> L1c java.lang.OutOfMemoryError -> L1f java.lang.Exception -> L21
            int r2 = r2.n()     // Catch: java.lang.Throwable -> L1c java.lang.OutOfMemoryError -> L1f java.lang.Exception -> L21
            if (r2 <= 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            defpackage.csix.k(r2)     // Catch: java.lang.Throwable -> L1c java.lang.OutOfMemoryError -> L1f java.lang.Exception -> L21
            cbcc r6 = r1.a     // Catch: java.lang.Throwable -> L1c java.lang.OutOfMemoryError -> L1f java.lang.Exception -> L21
            r1.a()
            return r6
        L1c:
            r6 = move-exception
            r0 = r1
            goto L47
        L1f:
            r2 = move-exception
            goto L2a
        L21:
            r2 = move-exception
            goto L2a
        L23:
            r6 = move-exception
            goto L47
        L25:
            r1 = move-exception
            goto L28
        L27:
            r1 = move-exception
        L28:
            r2 = r1
            r1 = r0
        L2a:
            cskc r3 = defpackage.cbbu.b     // Catch: java.lang.Throwable -> L1c
            csjb r3 = r3.e()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "Synchronous media loading failed."
            r3.I(r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "key"
            java.lang.String r6 = r6.f()     // Catch: java.lang.Throwable -> L1c
            r3.A(r4, r6)     // Catch: java.lang.Throwable -> L1c
            r3.s(r2)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L46
            r1.a()
        L46:
            return r0
        L47:
            if (r0 == 0) goto L4c
            r0.a()
        L4c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbbu.b(cbbn):cbcc");
    }

    public final void d(cbbn cbbnVar) {
        e(cbbnVar, this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(final defpackage.cbbn r7, java.util.concurrent.Executor r8) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.cbat
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r7
            cbat r0 = (defpackage.cbat) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto L14
            boolean r2 = r0.i()
            if (r2 == 0) goto L13
            goto L14
        L13:
            return
        L14:
            int r2 = r7.a()
            r3 = 1
            if (r2 == 0) goto L1d
        L1b:
            r4 = r1
            goto L3f
        L1d:
            java.lang.String r2 = r7.f()
            if (r2 != 0) goto L29
            java.lang.String r2 = "mediaRequest with cache policy has no key!"
            defpackage.csix.c(r2)
            goto L1b
        L29:
            cbcc r2 = g(r7)
            if (r2 == 0) goto L1b
            boolean r4 = r2.k()
            if (r4 != 0) goto L1b
            cbbs r4 = new cbbs
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.<init>(r6, r2, r3, r5)
        L3f:
            r2 = 0
            if (r4 == 0) goto L58
            cbbs r8 = r6.f(r7)     // Catch: java.lang.OutOfMemoryError -> L4a java.lang.Exception -> L4c
            c(r8, r2, r7, r0)     // Catch: java.lang.OutOfMemoryError -> L4a java.lang.Exception -> L4c
            return
        L4a:
            r8 = move-exception
            goto L4d
        L4c:
            r8 = move-exception
        L4d:
            cskc r2 = defpackage.cbbu.b
            java.lang.String r4 = "Media Request Failed."
            r2.s(r4, r8)
            c(r1, r3, r7, r0)
            return
        L58:
            cbbp r1 = new cbbp
            r1.<init>()
            cbbq r3 = new cbbq
            r3.<init>()
            cbbv r7 = new cbbv
            r7.<init>(r1, r3)
            java.lang.Void[] r0 = new java.lang.Void[r2]
            r7.executeOnExecutor(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbbu.e(cbbn, java.util.concurrent.Executor):void");
    }
}
