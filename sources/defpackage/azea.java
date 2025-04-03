package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azea implements azci {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/core/destination/DestinationsTableOperations");
    private final ffhd b;
    private final cbwj c;

    public azea(cbwj cbwjVar, ffhd ffhdVar) {
        cbwjVar.getClass();
        ffhdVar.getClass();
        this.c = cbwjVar;
        this.b = ffhdVar;
    }

    @Override // defpackage.azci
    public final Object a(Set set, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.b), new azdx(null, set), ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.azci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(final java.lang.String r5, final defpackage.azcg r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.azdz
            if (r0 == 0) goto L13
            r0 = r7
            azdz r0 = (defpackage.azdz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            azdz r0 = new azdz
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
            cbwj r7 = r4.c
            azdu r2 = new azdu
            r2.<init>()
            java.lang.String r5 = "DestinationsTableOperations#matchExactOrCreate"
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azea.b(java.lang.String, azcg, ffgu):java.lang.Object");
    }
}
