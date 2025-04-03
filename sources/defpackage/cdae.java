package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdae extends ffhv implements ffjm {
    final /* synthetic */ cdaf a;
    final /* synthetic */ String b;
    final /* synthetic */ ffix c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdae(ffgu ffguVar, cdaf cdafVar, String str, ffix ffixVar) {
        super(2, ffguVar);
        this.a = cdafVar;
        this.b = str;
        this.c = ffixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdae) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        final ffix ffixVar = this.c;
        return this.a.a.c(this.b, new emyl() { // from class: cdah
            @Override // defpackage.emyl
            public final /* synthetic */ Object get() {
                return ffix.this.invoke();
            }
        });
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cdae cdaeVar = new cdae(ffguVar, this.a, this.b, this.c);
        cdaeVar.d = obj;
        return cdaeVar;
    }
}
