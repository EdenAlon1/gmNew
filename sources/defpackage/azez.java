package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azez extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    /* synthetic */ Object f;
    final /* synthetic */ List g;
    final /* synthetic */ azfe h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azez(List list, azfe azfeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.g = list;
        this.h = azfeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azez) c((Set) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0062  */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x007c -> B:4:0x007d). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.e
            if (r1 == 0) goto L16
            java.lang.Object r1 = r7.d
            java.lang.Object r2 = r7.c
            java.lang.Object r3 = r7.b
            java.lang.Object r4 = r7.a
            java.lang.Object r5 = r7.f
            azfe r5 = (defpackage.azfe) r5
            defpackage.ffci.b(r8)
            goto L7d
        L16:
            defpackage.ffci.b(r8)
            java.lang.Object r8 = r7.f
            java.util.Set r8 = (java.util.Set) r8
            enru r1 = defpackage.azfe.a
            ensk r1 = r1.e()
            ensn r2 = defpackage.ente.a
            java.lang.String r3 = "BugleCME"
            r1.Y(r2, r3)
            java.lang.String r2 = "invokeSuspend"
            r3 = 253(0xfd, float:3.55E-43)
            java.lang.String r4 = "com/google/android/apps/messaging/shared/core/group/CachingGroupManager$getGroupsFromLegacyGroupsCache$2"
            java.lang.String r5 = "CachingGroupManager.kt"
            ensk r1 = r1.h(r4, r2, r3, r5)
            enrr r1 = (defpackage.enrr) r1
            java.util.List r2 = r7.g
            java.lang.String r3 = "Cache miss looking up groups %s from legacyGroupsCache."
            r1.t(r3, r2)
            azfe r1 = r7.h
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r3 = 10
            int r3 = defpackage.ffdx.n(r8, r3)
            int r3 = defpackage.ffew.a(r3)
            r4 = 16
            int r3 = defpackage.ffmk.f(r3, r4)
            r2.<init>(r3)
            java.util.Iterator r8 = r8.iterator()
            r3 = r8
            r5 = r1
        L5c:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L8a
            java.lang.Object r1 = r3.next()
            r8 = r1
            azhq r8 = (defpackage.azhq) r8
            r7.f = r5
            r7.a = r2
            r7.b = r3
            r7.c = r2
            r7.d = r1
            r4 = 1
            r7.e = r4
            java.lang.Object r8 = r5.g(r8, r7)
            if (r8 == r0) goto L89
            r4 = r2
        L7d:
            azfh r8 = (defpackage.azfh) r8
            azfi r6 = new azfi
            r6.<init>(r8)
            r2.put(r1, r6)
            r2 = r4
            goto L5c
        L89:
            return r0
        L8a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azez.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        azez azezVar = new azez(this.g, this.h, ffguVar);
        azezVar.f = obj;
        return azezVar;
    }
}
