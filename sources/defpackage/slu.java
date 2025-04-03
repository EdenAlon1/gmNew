package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class slu {
    public final slo a;
    public final sia b;
    private final ffhd c;
    private final cbgf d;

    public slu(ffhd ffhdVar, slo sloVar, cbgf cbgfVar, sia siaVar) {
        ffhdVar.getClass();
        cbgfVar.getClass();
        this.c = ffhdVar;
        this.a = sloVar;
        this.d = cbgfVar;
        this.b = siaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.slz r6, defpackage.ceuw r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.slt
            if (r0 == 0) goto L13
            r0 = r8
            slt r0 = (defpackage.slt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            slt r0 = new slt
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r8)
            ffhd r8 = r5.c
            ffhd r8 = defpackage.ekxi.a(r8)
            sls r2 = new sls
            r4 = 0
            r2.<init>(r4, r6, r5, r7)
            r0.c = r3
            java.lang.Object r8 = defpackage.ffra.a(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.slu.a(slz, ceuw, ffgu):java.lang.Object");
    }

    public final void b(slz slzVar, ardn ardnVar, String str) {
        String[] strArr = VmtTable.a;
        byyi byyiVar = new byyi();
        byyiVar.ap("SodaFileTranscriptionHandler#updateStatus");
        byyiVar.d(ardnVar);
        if (str != null) {
            byyiVar.c(str);
        }
        String str2 = slzVar.b;
        byyk byykVar = new byyk();
        byykVar.b(str2);
        byyiVar.aj(new byyj(byykVar), "vmt-buildAndUpdateForPartId");
        this.d.l(bdgq.b(slzVar.e), bdhb.b(slzVar.f), new String[0]);
    }
}
