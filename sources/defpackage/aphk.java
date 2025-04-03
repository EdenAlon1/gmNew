package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aphk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aphl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aphk(aphl aphlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aphlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aphk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        aphl aphlVar = this.b;
        this.a = 1;
        Object a = aphlVar.a(this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aphk(this.b, ffguVar);
    }
}
