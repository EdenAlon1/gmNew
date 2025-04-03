package defpackage;

import android.content.Context;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdbf implements cdba {
    public static final cskc a = cskc.g("BugleCms", "CmsBatchBackupCompletionProcessorImpl");
    public final dtuu b;
    public final axkm c;
    public final cdyb d;
    public final cqoh e;
    public final cdeq f;
    public final cenz g;
    public final cdpx h;
    public final cdqh i;
    public final axdf j;
    public final ffbr k;
    public final ffbr l;
    public final axmm m;
    public final asif n;
    public final ejvp o;
    public final ffsk p;
    public final ffbr q;
    public final ffbr r;
    public final asja s;
    public final cdfj t;
    private final babm u;
    private final Context v;

    /* compiled from: PG */
    public interface a {
        cscn fc();
    }

    public cdbf(dtuu dtuuVar, axkm axkmVar, cdyb cdybVar, cqoh cqohVar, cdeq cdeqVar, cenz cenzVar, cdpx cdpxVar, cdqh cdqhVar, axdf axdfVar, babm babmVar, ffbr ffbrVar, @ashy ffbr ffbrVar2, axmm axmmVar, asif asifVar, ejvp ejvpVar, Context context, ffsk ffskVar, ffbr ffbrVar3, ffbr ffbrVar4, asja asjaVar, cdfj cdfjVar) {
        dtuuVar.getClass();
        axkmVar.getClass();
        cqohVar.getClass();
        axdfVar.getClass();
        babmVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        axmmVar.getClass();
        asifVar.getClass();
        ejvpVar.getClass();
        context.getClass();
        ffskVar.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.b = dtuuVar;
        this.c = axkmVar;
        this.d = cdybVar;
        this.e = cqohVar;
        this.f = cdeqVar;
        this.g = cenzVar;
        this.h = cdpxVar;
        this.i = cdqhVar;
        this.j = axdfVar;
        this.u = babmVar;
        this.k = ffbrVar;
        this.l = ffbrVar2;
        this.m = axmmVar;
        this.n = asifVar;
        this.o = ejvpVar;
        this.v = context;
        this.p = ffskVar;
        this.q = ffbrVar3;
        this.r = ffbrVar4;
        this.s = asjaVar;
        this.t = cdfjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cdba
    public final boolean a(engw engwVar, engw engwVar2) {
        engwVar.getClass();
        engwVar2.getClass();
        if (!engwVar.isEmpty()) {
            return false;
        }
        final ArrayList arrayList = new ArrayList(ffdx.n(engwVar2, 10));
        enqv it = engwVar2.iterator();
        while (it.hasNext()) {
            arrayList.add(cdcd.b((ccce) it.next()));
        }
        cfba a2 = cfbf.a();
        a2.z("isBatchBackupComplete");
        a2.e(new Function() { // from class: cdbb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cfbe cfbeVar = (cfbe) obj;
                cfbeVar.j("cms_batch_backup");
                cfbeVar.b(arrayList);
                return cfbeVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return a2.b().i() == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (defpackage.fgfz.c(r6, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cdbh
            if (r0 == 0) goto L13
            r0 = r7
            cdbh r0 = (defpackage.cdbh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdbh r0 = new cdbh
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            goto L6c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            cdbf r6 = r0.d
            defpackage.ffci.b(r7)
            goto L4c
        L38:
            defpackage.ffci.b(r7)
            babm r7 = r5.u
            elfl r6 = r7.b(r6)
            r0.d = r5
            r0.c = r4
            java.lang.Object r7 = defpackage.fgfz.c(r6, r0)
            if (r7 == r1) goto L6f
            r6 = r5
        L4c:
            eisx r7 = (defpackage.eisx) r7
            android.content.Context r6 = r6.v
            java.lang.Class<cdbf$a> r2 = cdbf.a.class
            java.lang.Object r6 = defpackage.ekhv.a(r6, r2, r7)
            cdbf$a r6 = (cdbf.a) r6
            cscn r6 = r6.fc()
            elfl r6 = r6.a(r4)
            r7 = 0
            r0.d = r7
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r6, r0)
            if (r6 != r1) goto L6c
            goto L6f
        L6c:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdbf.b(int, ffgu):java.lang.Object");
    }
}
