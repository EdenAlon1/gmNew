package defpackage;

import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aybv extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ aybw c;
    final /* synthetic */ WorkerParameters d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aybv(aybw aybwVar, WorkerParameters workerParameters, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = aybwVar;
        this.d = workerParameters;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aybv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        if (r1 != r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        r0 = r7;
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c8, code lost:
    
        if (r1 != r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ca, code lost:
    
        r0 = r7;
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0156, code lost:
    
        if (r1 != r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0171, code lost:
    
        if (r1 != r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x019c, code lost:
    
        if (r1 != r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01ba, code lost:
    
        if (r1 != r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aybv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aybv(this.c, this.d, ffguVar);
    }
}
