package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cryr extends ffhv implements ffjm {
    final /* synthetic */ cryz a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cryr(ffgu ffguVar, cryz cryzVar) {
        super(2, ffguVar);
        this.a = cryzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cryr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cryz cryzVar = this.a;
        cryzVar.b.d("CmsDeltaSyncManager#clearBugleDbFields#backupReferences", new cryt(cryzVar));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cryr cryrVar = new cryr(ffguVar, this.a);
        cryrVar.b = obj;
        return cryrVar;
    }
}
