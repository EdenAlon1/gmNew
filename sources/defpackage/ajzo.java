package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajzo extends ffhv implements ffji {
    int a;
    final /* synthetic */ akag b;
    final /* synthetic */ UUID c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajzo(akag akagVar, UUID uuid, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = akagVar;
        this.c = uuid;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00e1, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00bc, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a0, code lost:
    
        if (r7.a(r1, ((defpackage.akbp) r3.k).a, r6) != r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if (r7 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
    
        if (r7.s(r1, r5, r6) != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0034, code lost:
    
        if (r7 != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r1 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a2, code lost:
    
        r7 = (defpackage.ajyr) r6.b.b.b();
        r1 = r6.c;
        r2 = defpackage.akci.DATABASE_RESTORE_COMPLETE;
        r6.a = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00b7, code lost:
    
        if (r7.s(r1, r2, r6) != r0) goto L31;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajzo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ajzo(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
