package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdfd {
    public static final List a;
    private static final cfva d = cfvl.k(cfvl.b, "cms_batch_backup_post_process_dropper_page_size_per_type", 40);
    public final ccun b;
    public final ccun c;
    private final ccbt e;
    private final csaj f;
    private final crxx g;
    private final dtuu h;

    static {
        ffdx.g(csgg.FAILED_VIA_BATCH_BACKUP, csgg.SKIPPED_VIA_BATCH_BACKUP);
        a = ffdx.g(csgg.EXCLUDED, csgg.FAILED_VIA_BATCH_BACKUP, csgg.SKIPPED_VIA_BATCH_BACKUP);
    }

    public cdfd(ccbt ccbtVar, csaj csajVar, crxx crxxVar, ccun ccunVar, ccun ccunVar2, ccdw ccdwVar, dtuu dtuuVar) {
        ccbtVar.getClass();
        ccdwVar.getClass();
        dtuuVar.getClass();
        this.e = ccbtVar;
        this.f = csajVar;
        this.g = crxxVar;
        this.b = ccunVar;
        this.c = ccunVar2;
        this.h = dtuuVar;
    }

    private final ccce d(int i, String str, int i2) {
        cccd cccdVar = (cccd) ccce.a.createBuilder();
        cccdVar.getClass();
        ccbw.b(i, cccdVar);
        ccbw.f(i2, cccdVar);
        ccbw.e(str, cccdVar);
        ccbw.c(ccue.a(17), cccdVar);
        ccbw.d(true, cccdVar);
        return ccbw.a(cccdVar);
    }

    private final Object e(ccce ccceVar, engw engwVar, ffgu ffguVar) {
        engw a2 = ccdw.a(ccceVar, engwVar);
        new csgv("Dependency missing for batch backup", engwVar);
        Object c = fgfz.c(this.e.d(ccceVar, a2, true, 0), ffguVar);
        return c == ffhh.a ? c : ffcu.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c9, code lost:
    
        r5 = r14;
        r14 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r13, defpackage.cdez r14, defpackage.ffgu r15) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdfd.a(int, cdez, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r9, final defpackage.axeo r10, defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdfd.b(int, axeo, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0066 -> B:11:0x00a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x009e -> B:10:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r10, defpackage.cdez r11, defpackage.ffgu r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.cdfc
            if (r0 == 0) goto L13
            r0 = r12
            cdfc r0 = (defpackage.cdfc) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            cdfc r0 = new cdfc
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r10 = r0.b
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r11 = r0.h
            engs r2 = r0.i
            java.lang.Object r4 = r0.a
            cdez r5 = r0.g
            cdfd r6 = r0.f
            defpackage.ffci.b(r12)
            goto La0
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            defpackage.ffci.b(r12)
            java.util.List r12 = r11.a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            engw r12 = (defpackage.engw) r12
            enqv r12 = r12.iterator()
            r6 = r9
            r4 = r2
            r2 = r12
        L4e:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto Lab
            java.lang.Object r12 = r2.next()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r12 = (com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType) r12
            csaj r5 = r6.f
            j$.util.Optional r5 = r5.f(r12)
            boolean r7 = r5.isEmpty()
            if (r7 == 0) goto L68
            r12 = 0
            goto La5
        L68:
            csaj r7 = r6.f
            java.lang.Object r5 = r5.get()
            crzp r5 = (defpackage.crzp) r5
            engw r5 = defpackage.csaj.g(r5)
            java.lang.String r7 = r12.b()
            r7.getClass()
            ccce r7 = r6.d(r10, r7, r3)
            r5.getClass()
            engw r5 = defpackage.engq.a(r5)
            r0.f = r6
            r0.g = r11
            r0.a = r4
            r8 = r2
            engs r8 = (defpackage.engs) r8
            r0.i = r8
            r0.h = r12
            r0.b = r10
            r0.e = r3
            java.lang.Object r5 = r6.e(r7, r5, r0)
            if (r5 != r1) goto L9e
            return r1
        L9e:
            r5 = r11
            r11 = r12
        La0:
            java.lang.String r12 = r11.b()
            r11 = r5
        La5:
            if (r12 == 0) goto L4e
            r4.add(r12)
            goto L4e
        Lab:
            java.util.List r10 = r11.a
            enou r10 = (defpackage.enou) r10
            int r10 = r10.c
            ffcf r11 = new ffcf
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r10)
            r11.<init>(r12, r4)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdfd.c(int, cdez, ffgu):java.lang.Object");
    }
}
