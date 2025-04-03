package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zgq implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ Map b;
    final /* synthetic */ ffsk c;
    final /* synthetic */ List d;
    final /* synthetic */ zgu e;

    public zgq(ffxy ffxyVar, Map map, ffsk ffskVar, List list, zgu zguVar) {
        this.a = ffxyVar;
        this.b = map;
        this.c = ffskVar;
        this.d = list;
        this.e = zguVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r14, defpackage.ffgu r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.zgp
            if (r0 == 0) goto L13
            r0 = r15
            zgp r0 = (defpackage.zgp) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            zgp r0 = new zgp
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r15)
            goto L6d
        L27:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L2f:
            defpackage.ffci.b(r15)
            ffxy r15 = r13.a
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r14)
            java.util.Map r4 = r13.b
            r5 = 0
            java.lang.Object r2 = j$.util.Map.EL.getOrDefault(r4, r2, r5)
            r9 = r2
            zfj r9 = (defpackage.zfj) r9
            if (r9 == 0) goto L64
            ffsk r7 = r13.c
            java.util.List r2 = r13.d
            zfw r6 = new zfw
            java.lang.Object r14 = r2.get(r14)
            r8 = r14
            alxr r8 = (defpackage.alxr) r8
            zgu r14 = r13.e
            ffbz r10 = r14.g
            xgl r11 = r14.c
            xgg r12 = r14.d
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r5 = r6
        L64:
            r0.b = r3
            java.lang.Object r14 = r15.fQ(r5, r0)
            if (r14 != r1) goto L6d
            return r1
        L6d:
            ffcu r14 = defpackage.ffcu.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgq.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
