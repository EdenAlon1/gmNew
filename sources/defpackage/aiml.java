package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiml extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aimm b;
    final /* synthetic */ aimk c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiml(ffgu ffguVar, aimm aimmVar, aimk aimkVar) {
        super(2, ffguVar);
        this.b = aimmVar;
        this.c = aimkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aiml) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e3  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiml.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aiml aimlVar = new aiml(ffguVar, this.b, this.c);
        aimlVar.d = obj;
        return aimlVar;
    }
}
