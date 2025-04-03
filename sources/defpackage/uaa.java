package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uaa extends ffhv implements ffjm {
    final /* synthetic */ uac a;
    final /* synthetic */ engw b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uaa(ffgu ffguVar, uac uacVar, engw engwVar) {
        super(2, ffguVar);
        this.a = uacVar;
        this.b = engwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((uaa) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.b.getClass();
        return new tzd();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        uaa uaaVar = new uaa(ffguVar, this.a, this.b);
        uaaVar.c = obj;
        return uaaVar;
    }
}
