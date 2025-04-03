package defpackage;

import java.io.File;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akaa extends ffhv implements ffjm {
    int a;
    final /* synthetic */ UUID b;
    final /* synthetic */ akag c;
    final /* synthetic */ File d;
    final /* synthetic */ sny e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akaa(ffgu ffguVar, UUID uuid, akag akagVar, File file, sny snyVar) {
        super(2, ffguVar);
        this.b = uuid;
        this.c = akagVar;
        this.d = file;
        this.e = snyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akaa) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ac, code lost:
    
        if (r8.g(r1, r2.k, r7) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b2, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0093, code lost:
    
        if (r1.d(r3, r8, r7) != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r8.z(r1) != r0) goto L11;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L16
            if (r1 == r2) goto L11
            defpackage.ffci.b(r8)
            goto Laf
        L11:
            defpackage.ffci.b(r8)
            goto L95
        L16:
            defpackage.ffci.b(r8)
            goto L60
        L1a:
            defpackage.ffci.b(r8)
            java.lang.Object r8 = r7.f
            ffsk r8 = (defpackage.ffsk) r8
            enru r8 = defpackage.akag.a
            ensk r8 = r8.h()
            ensn r1 = defpackage.ente.a
            java.lang.String r4 = "BugleBackup"
            r8.Y(r1, r4)
            enrr r8 = (defpackage.enrr) r8
            r1 = 10
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            r8.W(r1, r4)
            java.lang.String r1 = "invokeSuspend"
            r4 = 163(0xa3, float:2.28E-43)
            java.lang.String r5 = "com/google/android/apps/messaging/restore/impl/BasicRestoreWorkflowSteps$requestAttachmentRestore$lambda$6$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r6 = "BasicRestoreWorkflowSteps.kt"
            ensk r8 = r8.h(r5, r1, r4, r6)
            enrr r8 = (defpackage.enrr) r8
            java.util.UUID r1 = r7.b
            java.lang.String r4 = "Requested attachment restore [%s]"
            r8.t(r4, r1)
            akag r8 = r7.c
            ffbr r8 = r8.b
            java.lang.Object r8 = r8.b()
            ajyr r8 = (defpackage.ajyr) r8
            java.util.UUID r1 = r7.b
            r7.a = r3
            java.lang.Object r8 = r8.z(r1)
            if (r8 == r0) goto Lb2
        L60:
            akcg r8 = defpackage.akcg.a
            eyfq r8 = r8.createBuilder()
            akcf r8 = (defpackage.akcf) r8
            r8.getClass()
            java.io.File r1 = r7.d
            java.lang.String r1 = r1.getAbsolutePath()
            defpackage.akch.d(r1, r8)
            sny r1 = r7.e
            akcb r1 = r1.a()
            defpackage.akch.b(r1, r8)
            akag r1 = r7.c
            akcg r8 = defpackage.akch.a(r8)
            ffbr r1 = r1.b
            java.lang.Object r1 = r1.b()
            ajyr r1 = (defpackage.ajyr) r1
            java.util.UUID r3 = r7.b
            r7.a = r2
            java.lang.Object r8 = r1.d(r3, r8, r7)
            if (r8 == r0) goto Lb2
        L95:
            akag r8 = r7.c
            ffbr r8 = r8.d
            java.lang.Object r8 = r8.b()
            ajwb r8 = (defpackage.ajwb) r8
            java.util.UUID r1 = r7.b
            akag r2 = r7.c
            r3 = 3
            r7.a = r3
            ajwe r2 = r2.k
            java.lang.Object r8 = r8.g(r1, r2, r7)
            if (r8 != r0) goto Laf
            goto Lb2
        Laf:
            ffcu r8 = defpackage.ffcu.a
            return r8
        Lb2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akaa.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        akaa akaaVar = new akaa(ffguVar, this.b, this.c, this.d, this.e);
        akaaVar.f = obj;
        return akaaVar;
    }
}
