package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azsp extends ffhv implements ffjm {
    final /* synthetic */ azst a;
    final /* synthetic */ cosz b;
    final /* synthetic */ djrj c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azsp(ffgu ffguVar, azst azstVar, cosz coszVar, djrj djrjVar) {
        super(2, ffguVar);
        this.a = azstVar;
        this.b = coszVar;
        this.c = djrjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azsp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.b.c("MyIdentityTablesOperations#updateVerifiedAddress", new azss(this.b, this.c));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        azsp azspVar = new azsp(ffguVar, this.a, this.b, this.c);
        azspVar.d = obj;
        return azspVar;
    }
}
