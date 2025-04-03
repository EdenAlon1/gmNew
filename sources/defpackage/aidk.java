package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aidk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ aidp c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aidk(ffgu ffguVar, String str, aidp aidpVar) {
        super(2, ffguVar);
        this.b = str;
        this.c = aidpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aidk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0132, code lost:
    
        if (r2 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
    
        if (r2 != r1) goto L16;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aidk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aidk aidkVar = new aidk(ffguVar, this.b, this.c);
        aidkVar.d = obj;
        return aidkVar;
    }
}
