package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajsx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ajtb b;
    final /* synthetic */ ajqt c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajsx(ffgu ffguVar, ajtb ajtbVar, ajqt ajqtVar) {
        super(2, ffguVar);
        this.b = ajtbVar;
        this.c = ajqtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajsx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ajtb ajtbVar = this.b;
        ajqt ajqtVar = this.c;
        this.a = 1;
        Object f = ajtbVar.f(ajqtVar, this);
        return f == ffhhVar ? ffhhVar : f;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajsx ajsxVar = new ajsx(ffguVar, this.b, this.c);
        ajsxVar.d = obj;
        return ajsxVar;
    }
}
