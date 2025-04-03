package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djyo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ Duration b;
    final /* synthetic */ djyt c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djyo(Duration duration, djyt djytVar, Object obj, Object obj2, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = duration;
        this.c = djytVar;
        this.d = obj;
        this.e = obj2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djyo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        if (defpackage.fgjv.a(r5, r4) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (r5.f(r1, r2, r4) == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        return defpackage.ffcu.a;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.a
            r2 = 1
            defpackage.ffci.b(r5)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L17
            goto L27
        Ld:
            j$.time.Duration r5 = r4.b
            r4.a = r2
            java.lang.Object r5 = defpackage.fgjv.a(r5, r4)
            if (r5 == r0) goto L2a
        L17:
            djyt r5 = r4.c
            java.lang.Object r1 = r4.d
            java.lang.Object r2 = r4.e
            r3 = 2
            r4.a = r3
            java.lang.Object r5 = r5.f(r1, r2, r4)
            if (r5 != r0) goto L27
            goto L2a
        L27:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L2a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djyo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new djyo(this.b, this.c, this.d, this.e, ffguVar);
    }
}
