package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yjm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yjn b;
    Object c;
    final /* synthetic */ yjd d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjm(ffgu ffguVar, yjd yjdVar, yjn yjnVar) {
        super(2, ffguVar);
        this.d = yjdVar;
        this.b = yjnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yjm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        if (defpackage.fgfz.c(r9, r8) != r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00ba A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:8:0x00ad, B:10:0x00ba, B:14:0x00c6, B:16:0x001e, B:17:0x0090, B:22:0x0027, B:24:0x0039, B:26:0x0061, B:29:0x0079), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c6 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:8:0x00ad, B:10:0x00ba, B:14:0x00c6, B:16:0x001e, B:17:0x0090, B:22:0x0027, B:24:0x0039, B:26:0x0061, B:29:0x0079), top: B:2:0x0006 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, java.io.Closeable] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yjm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        yjm yjmVar = new yjm(ffguVar, this.d, this.b);
        yjmVar.e = obj;
        return yjmVar;
    }
}
