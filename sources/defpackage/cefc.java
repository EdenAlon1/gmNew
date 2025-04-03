package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cefc {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/CmsListItemsPrefetchCache");
    private final ffsk b;
    private final Map c;
    private final Map d;
    private final Map e;

    public cefc(ffsk ffskVar) {
        ffskVar.getClass();
        this.b = ffskVar;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
    }

    private final Map e(Class cls) {
        Map map;
        if (ffkj.e(cls, eszz.class)) {
            map = this.c;
        } else if (ffkj.e(cls, eswr.class)) {
            map = this.d;
        } else {
            if (!ffkj.e(cls, etah.class)) {
                throw new UnsupportedOperationException("Unrecognized entity type.");
            }
            map = this.e;
        }
        fflf.g(map);
        return map;
    }

    public final elfl a(elfl elflVar, ffji ffjiVar, Class cls) {
        elfl c;
        c = axol.c(this.b, ffhe.a, ffsm.a, new cefb(this, elflVar, ffjiVar, cls, null));
        return c;
    }

    public final elfl b(String str, Class cls) {
        elfl elflVar;
        str.getClass();
        Map e = e(cls);
        synchronized (e) {
            elflVar = (elfl) e.remove(str);
        }
        return elflVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.elfl r7, defpackage.ffji r8, java.lang.Class r9, defpackage.ffgu r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.cefa
            if (r0 == 0) goto L13
            r0 = r10
            cefa r0 = (defpackage.cefa) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cefa r0 = new cefa
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Class r9 = r0.f
            java.lang.Object r8 = r0.a
            cefc r7 = r0.e
            defpackage.ffci.b(r10)
            goto L47
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.ffci.b(r10)
            r0.e = r6
            r0.a = r8
            r0.f = r9
            r0.d = r3
            java.lang.Object r10 = defpackage.fgfz.c(r7, r0)
            if (r10 == r1) goto L92
            r7 = r6
        L47:
            csdq r10 = (defpackage.csdq) r10
            java.lang.String r0 = r10.b
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L8e
            enru r1 = defpackage.cefc.a
            ensk r1 = r1.h()
            ensn r2 = defpackage.ente.a
            java.lang.String r3 = "BugleCms"
            r1.Y(r2, r3)
            java.lang.String r2 = "CmsListItemsPrefetchCache.kt"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/CmsListItemsPrefetchCache"
            java.lang.String r4 = "prefetchNextPage"
            r5 = 85
            ensk r1 = r1.h(r3, r4, r5, r2)
            enrr r1 = (defpackage.enrr) r1
            java.lang.String r2 = "Prefetching page %s"
            r1.t(r2, r0)
            java.util.Map r7 = r7.e(r9)
            monitor-enter(r7)
            ceey r9 = new ceey     // Catch: java.lang.Throwable -> L8b
            r9.<init>()     // Catch: java.lang.Throwable -> L8b
            ceez r8 = new ceez     // Catch: java.lang.Throwable -> L8b
            r8.<init>()     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r8 = j$.util.Map.EL.computeIfAbsent(r7, r0, r8)     // Catch: java.lang.Throwable -> L8b
            elfl r8 = (defpackage.elfl) r8     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r7)
            r8.getClass()
            goto L8e
        L8b:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L8e:
            r10.getClass()
            return r10
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cefc.c(elfl, ffji, java.lang.Class, ffgu):java.lang.Object");
    }

    public final void d() {
        synchronized (this.c) {
            this.c.clear();
        }
        synchronized (this.d) {
            this.d.clear();
        }
        synchronized (this.e) {
            this.e.clear();
        }
    }
}
