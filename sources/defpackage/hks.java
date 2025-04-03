package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hks extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    int f;
    final /* synthetic */ ffix g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hks(ffix ffixVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.g = ffixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hks) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x00fd, code lost:
    
        if (r3 != 8) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a6, code lost:
    
        if (r11 != r0) goto L25;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0172 A[LOOP:0: B:12:0x00ab->B:17:0x0172, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0120 A[EDGE_INSN: B:18:0x0120->B:19:0x0120 BREAK  A[LOOP:0: B:12:0x00ab->B:17:0x0172], SYNTHETIC] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hks.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        hks hksVar = new hks(this.g, ffguVar);
        hksVar.h = obj;
        return hksVar;
    }
}
