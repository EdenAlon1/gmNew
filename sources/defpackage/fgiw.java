package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgiw implements ffrd, fgir, fgix, ffvq {
    public final ffhd a;
    public Object c;
    public final ffqn b = new ffqn(fgiz.b, ffqo.a);
    private List e = new ArrayList(2);
    private int f = -1;
    public Object d = fgiz.e;

    public fgiw(ffhd ffhdVar) {
        this.a = ffhdVar;
    }

    public static /* synthetic */ Object d(fgiw fgiwVar, ffgu ffguVar) {
        return fgiwVar.b.a instanceof fgit ? fgiwVar.l(ffguVar) : fgiwVar.e(ffguVar);
    }

    private final Object l(ffgu ffguVar) {
        boolean z = ffso.a;
        Object obj = this.b.a;
        obj.getClass();
        fgit fgitVar = (fgit) obj;
        Object obj2 = this.d;
        List<fgit> list = this.e;
        if (list != null) {
            for (fgit fgitVar2 : list) {
                if (fgitVar2 != fgitVar) {
                    fgitVar2.c();
                }
            }
            this.b.c(fgiz.c);
            this.d = fgiz.e;
            this.e = null;
        }
        return !ffso.b ? fgitVar.a(fgitVar.b(obj2), ffguVar) : f(fgitVar, obj2, ffguVar);
    }

    private final fgit m(Object obj) {
        List list = this.e;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((fgit) next).a == obj) {
                obj2 = next;
                break;
            }
        }
        fgit fgitVar = (fgit) obj2;
        if (fgitVar != null) {
            return fgitVar;
        }
        throw new IllegalStateException(a.i(obj, "Clause with object ", " is not found"));
    }

    @Override // defpackage.ffvq
    public final void C(fghl fghlVar, int i) {
        this.c = fghlVar;
        this.f = i;
    }

    @Override // defpackage.fgir
    public final void a(fgis fgisVar, ffjm ffjmVar) {
        h(new fgit(fgisVar.a, fgisVar.b, fgisVar.c, null, ffjmVar), false);
    }

    @Override // defpackage.ffrd
    public final void b(Throwable th) {
        ffqn ffqnVar;
        Object obj;
        do {
            ffqnVar = this.b;
            obj = ffqnVar.a;
            if (obj == fgiz.c) {
                return;
            }
        } while (!ffqnVar.d(obj, fgiz.d));
        List list = this.e;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((fgit) it.next()).c();
            }
            this.d = fgiz.e;
            this.e = null;
        }
    }

    public final int c(Object obj, Object obj2) {
        while (true) {
            Object obj3 = this.b.a;
            if (obj3 instanceof ffrf) {
                fgit m = m(obj);
                if (m != null && this.b.d(obj3, m)) {
                    ffrf ffrfVar = (ffrf) obj3;
                    this.d = obj2;
                    Object l = ffrfVar.l(ffcu.a, null);
                    if (l == null) {
                        this.d = fgiz.e;
                        return 2;
                    }
                    ffrfVar.a(l);
                    return 0;
                }
            } else {
                if (ffkj.e(obj3, fgiz.c) || (obj3 instanceof fgit)) {
                    return 3;
                }
                if (ffkj.e(obj3, fgiz.d)) {
                    return 2;
                }
                if (ffkj.e(obj3, fgiz.b)) {
                    if (this.b.d(obj3, ffdx.b(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        Objects.toString(obj3);
                        throw new IllegalStateException("Unexpected state: ".concat(String.valueOf(obj3)));
                    }
                    if (this.b.d(obj3, ffdx.ae((Collection) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.fgiu
            if (r0 == 0) goto L13
            r0 = r10
            fgiu r0 = (defpackage.fgiu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fgiu r0 = new fgiu
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r3) goto L2b
            defpackage.ffci.b(r10)
            return r10
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            fgiw r2 = r0.d
            defpackage.ffci.b(r10)
            goto La7
        L39:
            defpackage.ffci.b(r10)
            r0.d = r9
            r0.c = r5
            ffrh r10 = new ffrh
            ffgu r2 = defpackage.ffhi.c(r0)
            r10.<init>(r2, r5)
            r10.B()
            ffqn r2 = r9.b
        L4e:
            java.lang.Object r6 = r2.a
            fgho r7 = defpackage.fgiz.b
            if (r6 != r7) goto L60
            ffqn r7 = r9.b
            boolean r6 = r7.d(r6, r10)
            if (r6 == 0) goto L4e
            r10.D(r9)
            goto L9a
        L60:
            boolean r8 = r6 instanceof java.util.List
            if (r8 == 0) goto L8f
            ffqn r8 = r9.b
            boolean r7 = r8.d(r6, r7)
            if (r7 == 0) goto L4e
            r7 = r6
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L75:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L4e
            java.lang.Object r7 = r6.next()
            fgit r7 = r9.m(r7)
            r7.getClass()
            r7.d = r4
            r8 = -1
            r7.e = r8
            r9.h(r7, r5)
            goto L75
        L8f:
            boolean r2 = r6 instanceof defpackage.fgit
            if (r2 == 0) goto Lb4
            ffcu r2 = defpackage.ffcu.a
            fgit r6 = (defpackage.fgit) r6
            r10.f(r2, r4)
        L9a:
            java.lang.Object r10 = r10.m()
            ffhh r2 = defpackage.ffhh.a
            if (r10 == r2) goto La4
            ffcu r10 = defpackage.ffcu.a
        La4:
            if (r10 == r1) goto Lb3
            r2 = r9
        La7:
            r0.d = r4
            r0.c = r3
            java.lang.Object r10 = r2.l(r0)
            if (r10 != r1) goto Lb2
            goto Lb3
        Lb2:
            return r10
        Lb3:
            return r1
        Lb4:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.util.Objects.toString(r6)
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "unexpected state: "
            java.lang.String r0 = r1.concat(r0)
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgiw.e(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fgit r5, java.lang.Object r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.fgiv
            if (r0 == 0) goto L13
            r0 = r7
            fgiv r0 = (defpackage.fgiv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fgiv r0 = new fgiv
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L27
            return r7
        L27:
            r5 = move-exception
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r7)
            java.lang.Object r6 = r5.b(r6)     // Catch: java.lang.Throwable -> L27
            r0.c = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r5 = r5.a(r6, r0)     // Catch: java.lang.Throwable -> L27
            if (r5 != r1) goto L41
            return r1
        L41:
            return r5
        L42:
            boolean r6 = defpackage.ffso.b
            if (r6 != 0) goto L47
            throw r5
        L47:
            java.lang.Throwable r5 = defpackage.fghn.a(r5, r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgiw.f(fgit, java.lang.Object, ffgu):java.lang.Object");
    }

    @Override // defpackage.fgix
    public final void g(ffte ffteVar) {
        this.c = ffteVar;
    }

    public final void h(fgit fgitVar, boolean z) {
        boolean z2 = ffso.a;
        if (this.b.a instanceof fgit) {
            return;
        }
        if (!z) {
            Object obj = fgitVar.a;
            List list = this.e;
            list.getClass();
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((fgit) it.next()).a == obj) {
                        Objects.toString(obj);
                        throw new IllegalStateException("Cannot use select clauses on the same object: ".concat(obj.toString()));
                    }
                }
            }
        }
        fgitVar.b.a(fgitVar.a, this, fgitVar.c);
        if (this.d != fgiz.e) {
            this.b.c(fgitVar);
            return;
        }
        if (!z) {
            List list2 = this.e;
            list2.getClass();
            list2.add(fgitVar);
        }
        fgitVar.d = this.c;
        fgitVar.e = this.f;
        this.c = null;
        this.f = -1;
    }

    @Override // defpackage.fgix
    public final void i(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.fgix
    public final boolean j(Object obj, Object obj2) {
        return c(obj, obj2) == 0;
    }
}
