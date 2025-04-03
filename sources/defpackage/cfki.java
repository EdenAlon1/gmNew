package defpackage;

import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfki {
    public static final cskc a = cskc.g("BugleWorkQueue", "WorkQueueWorkerV2");
    public final cqoh b;
    public final cevh c;
    public final cfdp d;
    public final cfyt e;
    public final ffbr f;
    public final cbwj g;
    private final ceww h;
    private final cfbt i;
    private final ffsk j;

    public cfki(cbwj cbwjVar, cqoh cqohVar, cevh cevhVar, ceww cewwVar, cfdp cfdpVar, cfyt cfytVar, cfbt cfbtVar, ffbr ffbrVar, ffsk ffskVar) {
        cbwjVar.getClass();
        cqohVar.getClass();
        cevhVar.getClass();
        cewwVar.getClass();
        cfdpVar.getClass();
        cfytVar.getClass();
        cfbtVar.getClass();
        ffbrVar.getClass();
        ffskVar.getClass();
        this.g = cbwjVar;
        this.b = cqohVar;
        this.c = cevhVar;
        this.h = cewwVar;
        this.d = cfdpVar;
        this.e = cfytVar;
        this.i = cfbtVar;
        this.f = ffbrVar;
        this.j = ffskVar;
    }

    public static final void c(csls cslsVar, cfjt cfjtVar) {
        cslsVar.A("queue", cfjtVar.b);
        cslsVar.y("items", cfjtVar.c.size());
    }

    public static final void d(final List list) {
        String[] strArr = cfbf.a;
        cfau cfauVar = new cfau();
        cfauVar.f("WorkQueueTikTokWorker#deleteItems");
        cfauVar.c(new Function() { // from class: cfjj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List list2 = list;
                cfbe cfbeVar = (cfbe) obj;
                ArrayList arrayList = new ArrayList(ffdx.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((ceze) it.next()).l()));
                }
                cfbeVar.d(arrayList);
                return cfbeVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        cfauVar.d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:
    
        if (r5 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00fe, code lost:
    
        if (r15.a(r0) != r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0102, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00fe -> B:11:0x004d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r13, defpackage.cfir r14, defpackage.ffgu r15) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfki.a(java.lang.String, cfir, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(final java.lang.String r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfki.b(java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(final java.lang.String r5, final java.lang.Runnable r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cfkb
            if (r0 == 0) goto L13
            r0 = r7
            cfkb r0 = (defpackage.cfkb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfkb r0 = new cfkb
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L4b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r7)
            cbwj r7 = r4.g
            cfjg r2 = new cfjg
            r2.<init>()
            java.lang.String r5 = "WorkQueueTikTokWorker::maybeScheduleNextWorkForQueue"
            elfl r5 = r7.a(r5, r2)
            r5.getClass()
            r0.c = r3
            java.lang.Object r7 = defpackage.fgfz.c(r5, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfki.e(java.lang.String, java.lang.Runnable, ffgu):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(4:(1:(1:(3:12|13|14)(2:16|17))(6:18|19|20|21|22|(2:24|(1:26)(1:27))(4:28|(1:30)|31|32)))(4:50|51|52|53)|36|37|(2:39|40)(4:41|(1:43)|44|(2:46|47)(2:48|49)))(5:59|60|61|(1:63)|26)|54|(2:56|26)|22|(0)(0)))|68|6|7|(0)(0)|54|(0)|22|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0034, code lost:
    
        r13 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8 A[Catch: all -> 0x0034, TryCatch #2 {all -> 0x0034, blocks: (B:13:0x0030, B:22:0x00a2, B:24:0x00a8, B:28:0x00c7, B:31:0x00e8, B:54:0x0091), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7 A[Catch: all -> 0x0034, TryCatch #2 {all -> 0x0034, blocks: (B:13:0x0030, B:22:0x00a2, B:24:0x00a8, B:28:0x00c7, B:31:0x00e8, B:54:0x0091), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r11, defpackage.cfir r12, java.lang.Runnable r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfki.f(java.lang.String, cfir, java.lang.Runnable, ffgu):java.lang.Object");
    }
}
