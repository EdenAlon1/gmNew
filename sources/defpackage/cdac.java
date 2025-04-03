package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdac extends ffhv implements ffjm {
    final /* synthetic */ cdaf a;
    final /* synthetic */ String b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdac(ffgu ffguVar, cdaf cdafVar, String str) {
        super(2, ffguVar);
        this.a = cdafVar;
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdac) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object c;
        ffci.b(obj);
        c = this.a.f.c(this.b, ccup.a);
        return c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cdac cdacVar = new cdac(ffguVar, this.a, this.b);
        cdacVar.c = obj;
        return cdacVar;
    }
}
