package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.droidguard.internal.IDroidGuardService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgbe extends dfwc {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dgbe(android.content.Context r10, android.os.Looper r11, defpackage.dfsm r12, defpackage.dftw r13) {
        /*
            r9 = this;
            dfrb r0 = new dfrb
            r0.<init>(r10)
            dhpf r1 = defpackage.dhpf.a
            java.util.Map r2 = r0.e
            dfqt r3 = defpackage.dhpd.e
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L1b
            java.util.Map r1 = r0.e
            dfqt r2 = defpackage.dhpd.e
            java.lang.Object r1 = r1.get(r2)
            dhpf r1 = (defpackage.dhpf) r1
        L1b:
            r8 = r1
            dfvs r2 = new dfvs
            java.util.Set r4 = r0.a
            java.util.Map r5 = r0.d
            java.lang.String r6 = r0.b
            java.lang.String r7 = r0.c
            r3 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r4 = 25
            r1 = r9
            r3 = r11
            r6 = r12
            r7 = r13
            r5 = r2
            r2 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgbe.<init>(android.content.Context, android.os.Looper, dfsm, dftw):void");
    }

    @Override // defpackage.dfwc, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dfqr
    public final int a() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IDroidGuardService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.droidguard.internal.IDroidGuardService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.droidguard.service.START";
    }
}
