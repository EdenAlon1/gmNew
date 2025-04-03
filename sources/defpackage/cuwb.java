package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuwb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ cuwf c;
    final /* synthetic */ culh d;
    Object e;
    final /* synthetic */ int f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuwb(ffgu ffguVar, String str, cuwf cuwfVar, int i, culh culhVar) {
        super(2, ffguVar);
        this.b = str;
        this.c = cuwfVar;
        this.f = i;
        this.d = culhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuwb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0040, code lost:
    
        if (r11 != r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016d  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuwb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cuwb cuwbVar = new cuwb(ffguVar, this.b, this.c, this.f, this.d);
        cuwbVar.g = obj;
        return cuwbVar;
    }
}
