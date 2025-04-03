package defpackage;

import com.google.android.apps.tachyon.clientapi.IGetRegisteredIdTypeCallback;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgen extends IGetRegisteredIdTypeCallback.Stub {
    final /* synthetic */ dhri a;

    public dgen(dhri dhriVar) {
        this.a = dhriVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0016, code lost:
    
        if (r0 != 2) goto L7;
     */
    @Override // com.google.android.apps.tachyon.clientapi.IGetRegisteredIdTypeCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResult(byte[] r3) {
        /*
            r2 = this;
            eyfc r0 = defpackage.eyfc.a()     // Catch: java.lang.NullPointerException -> L37 defpackage.eygu -> L39
            esei r1 = defpackage.esei.a     // Catch: java.lang.NullPointerException -> L37 defpackage.eygu -> L39
            eyfy r3 = defpackage.eyfy.parseFrom(r1, r3, r0)     // Catch: java.lang.NullPointerException -> L37 defpackage.eygu -> L39
            esei r3 = (defpackage.esei) r3     // Catch: java.lang.NullPointerException -> L37 defpackage.eygu -> L39
            int r3 = r3.b     // Catch: java.lang.NullPointerException -> L37 defpackage.eygu -> L39
            int r0 = defpackage.fgtl.a(r3)     // Catch: java.lang.NullPointerException -> L37 defpackage.eygu -> L39
            if (r0 != 0) goto L15
            goto L18
        L15:
            r1 = 2
            if (r0 == r1) goto L2c
        L18:
            int r3 = defpackage.fgtl.a(r3)     // Catch: java.lang.NullPointerException -> L37 defpackage.eygu -> L39
            if (r3 != 0) goto L1f
            goto L2c
        L1f:
            r0 = 1
            if (r3 == r0) goto L2c
            dhri r3 = r2.a     // Catch: java.lang.NullPointerException -> L37 defpackage.eygu -> L39
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.NullPointerException -> L37 defpackage.eygu -> L39
            r3.b(r0)     // Catch: java.lang.NullPointerException -> L37 defpackage.eygu -> L39
            return
        L2c:
            dhri r3 = r2.a     // Catch: java.lang.NullPointerException -> L37 defpackage.eygu -> L39
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.NullPointerException -> L37 defpackage.eygu -> L39
            r3.b(r0)     // Catch: java.lang.NullPointerException -> L37 defpackage.eygu -> L39
            return
        L37:
            r3 = move-exception
            goto L3a
        L39:
            r3 = move-exception
        L3a:
            dhri r0 = r2.a
            boolean r0 = r0.c(r3)
            if (r0 != 0) goto L49
            java.lang.String r0 = "DuoStateFetcher"
            java.lang.String r1 = "Error setting exception--task is already complete."
            android.util.Log.e(r0, r1, r3)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgen.onResult(byte[]):void");
    }
}
