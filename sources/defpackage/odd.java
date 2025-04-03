package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class odd extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;

    public odd(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        odd oddVar = new odd((ffgu) obj3);
        oddVar.b = (ogd) obj;
        oddVar.c = (ogd) obj2;
        return oddVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            Object obj2 = this.b;
            ffci.b(obj);
            return obj2;
        }
        ffci.b(obj);
        Object obj3 = this.b;
        Object obj4 = this.c;
        this.b = obj4;
        this.a = 1;
        ((ogd) obj3).b.d.t(null);
        return ffcu.a != ffhhVar ? obj4 : ffhhVar;
    }
}
