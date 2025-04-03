package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdfs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cdfy b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdfs(cdfy cdfyVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cdfyVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdfs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cdfy cdfyVar = this.b;
        String str = this.c;
        this.a = 1;
        Object a = cdfyVar.a.a(str, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cdfs(this.b, this.c, ffguVar);
    }
}
