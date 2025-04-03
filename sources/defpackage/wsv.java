package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wsv implements wqq {
    public final ffsk a;
    public final fgcm b;
    private final ffsk c;
    private final ajjc d;
    private final List e;
    private final ffxx f;
    private final Set g;

    public wsv(ffsk ffskVar, Context context, ffsk ffskVar2, cssv cssvVar, ajjc ajjcVar, List list) {
        ffskVar.getClass();
        context.getClass();
        ffskVar2.getClass();
        cssvVar.getClass();
        ajjcVar.getClass();
        this.a = ffskVar;
        this.c = ffskVar2;
        this.d = ajjcVar;
        this.e = list;
        fgcm a = fgdm.a(false);
        this.b = a;
        axol.k(ffskVar2, null, new wso(this, cssvVar, null), 3);
        this.f = new wsu(a, context, this);
        this.g = fffi.b(aaxf.a);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.g;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0060 -> B:10:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.wsr
            if (r0 == 0) goto L13
            r0 = r7
            wsr r0 = (defpackage.wsr) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            wsr r0 = new wsr
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r0.b
            java.lang.Object r4 = r0.a
            wsv r5 = r0.f
            defpackage.ffci.b(r7)
            goto L62
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            defpackage.ffci.b(r7)
            java.util.List r7 = r6.e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r7.iterator()
            r5 = r6
            r4 = r2
            r2 = r7
        L46:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L6b
            java.lang.Object r7 = r2.next()
            zdv r7 = (defpackage.zdv) r7
            ffxx r7 = r7.c
            r0.f = r5
            r0.a = r4
            r0.b = r2
            r0.e = r3
            java.lang.Object r7 = defpackage.fgbj.c(r7, r0)
            if (r7 == r1) goto L6a
        L62:
            zdq r7 = (defpackage.zdq) r7
            if (r7 == 0) goto L46
            r4.add(r7)
            goto L46
        L6a:
            return r1
        L6b:
            ajjc r7 = r5.d
            wsm r0 = new wsm
            r0.<init>()
            r7.b(r0)
            ffcu r7 = defpackage.ffcu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsv.c(ffgu):java.lang.Object");
    }
}
