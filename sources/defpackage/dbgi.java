package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbgi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dbgh b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbgi(ffgu ffguVar, dbgh dbghVar) {
        super(2, ffguVar);
        this.b = dbghVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbgi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        elfl a = this.b.b.a();
        this.a = 1;
        Object c = fgfz.c(a, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dbgi dbgiVar = new dbgi(ffguVar, this.b);
        dbgiVar.c = obj;
        return dbgiVar;
    }
}
