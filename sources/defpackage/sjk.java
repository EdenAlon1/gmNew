package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sjk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ MessageId b;
    final /* synthetic */ sjn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjk(MessageId messageId, sjn sjnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = messageId;
        this.c = sjnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sjk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x011e, code lost:
    
        r9 = (defpackage.ardz) r9;
        ((defpackage.ensz) defpackage.sjn.a.h()).D("Retry for %s failed with reason %s", r8.b.a(), r9.a);
        r1 = r8.c;
        r9 = r1.b(r9.a);
        r8.a = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0144, code lost:
    
        if (r1.h(r9, r8) != r0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0116, code lost:
    
        if (r9 != r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c0, code lost:
    
        if (r9 != r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e9, code lost:
    
        if (r9 != r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0046, code lost:
    
        if (r9 != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r1 != 4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0118, code lost:
    
        r9 = (defpackage.arec) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x011c, code lost:
    
        if ((r9 instanceof defpackage.ardz) == false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f3  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new sjk(this.b, this.c, ffguVar);
    }
}
