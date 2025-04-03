package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqjr extends ffhv implements ffjn {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ dqjz d;
    final /* synthetic */ dqjz e;
    final /* synthetic */ ffxe f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqjr(ffxe ffxeVar, dqjz dqjzVar, ffgu ffguVar, dqjz dqjzVar2) {
        super(3, ffguVar);
        this.d = dqjzVar;
        this.e = dqjzVar2;
        this.f = ffxeVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dqjz dqjzVar = this.e;
        dqjr dqjrVar = new dqjr(this.f, this.d, (ffgu) obj3, dqjzVar);
        dqjrVar.c = (Cursor) obj2;
        return dqjrVar.b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (((defpackage.ffwn) r4).a(r10, r9) != r0) goto L16;
     */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0057 -> B:7:0x0026). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.b
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L12
            java.lang.Object r1 = r9.c
            defpackage.ffci.b(r10)     // Catch: java.lang.Exception -> L10
            goto L26
        L10:
            r10 = move-exception
            goto L5a
        L12:
            java.lang.Object r1 = r9.a
            java.lang.Object r4 = r9.c
            defpackage.ffci.b(r10)     // Catch: java.lang.Exception -> L1d
            r8 = r4
            r4 = r1
            r1 = r8
            goto L4a
        L1d:
            r10 = move-exception
            r1 = r4
            goto L5a
        L20:
            defpackage.ffci.b(r10)
            java.lang.Object r10 = r9.c
            r1 = r10
        L26:
            if (r1 == 0) goto L7e
            boolean r10 = r1.moveToNext()
            if (r10 != r3) goto L7e
            ffxe r10 = r9.f     // Catch: java.lang.Exception -> L10
            dqjz r4 = r9.e     // Catch: java.lang.Exception -> L10
            r9.c = r1     // Catch: java.lang.Exception -> L10
            r9.a = r10     // Catch: java.lang.Exception -> L10
            r9.b = r3     // Catch: java.lang.Exception -> L10
            dqkk r5 = r4.d     // Catch: java.lang.Exception -> L10
            java.lang.String r6 = "SQLiteUsageService#entityFromCursor"
            dqjq r7 = new dqjq     // Catch: java.lang.Exception -> L10
            r7.<init>(r1, r4, r2)     // Catch: java.lang.Exception -> L10
            java.lang.Object r4 = r5.d(r6, r7, r9)     // Catch: java.lang.Exception -> L10
            if (r4 == r0) goto L59
            r8 = r4
            r4 = r10
            r10 = r8
        L4a:
            r9.c = r1     // Catch: java.lang.Exception -> L10
            r9.a = r2     // Catch: java.lang.Exception -> L10
            r5 = 2
            r9.b = r5     // Catch: java.lang.Exception -> L10
            ffwn r4 = (defpackage.ffwn) r4     // Catch: java.lang.Exception -> L10
            java.lang.Object r10 = r4.a(r10, r9)     // Catch: java.lang.Exception -> L10
            if (r10 != r0) goto L26
        L59:
            return r0
        L5a:
            enru r4 = defpackage.dqjz.a
            ensk r4 = r4.i()
            enrr r4 = (defpackage.enrr) r4
            ensk r10 = r4.g(r10)
            java.lang.String r4 = "invokeSuspend$$forInline"
            r5 = 140(0x8c, float:1.96E-43)
            java.lang.String r6 = "com/google/android/libraries/compose/core/data/usage/SQLiteUsageService$queryAndMapLazily$2$1$1"
            java.lang.String r7 = "SQLiteUsageService.kt"
            ensk r10 = r10.h(r6, r4, r5, r7)
            enrr r10 = (defpackage.enrr) r10
            dqjz r4 = r9.d
            java.lang.String r5 = "Unable to map '%s' entity usage, skipping"
            java.lang.String r4 = r4.f
            r10.t(r5, r4)
            goto L26
        L7e:
            ffcu r10 = defpackage.ffcu.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqjr.b(java.lang.Object):java.lang.Object");
    }
}
