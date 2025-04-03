package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wvk extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ wvr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wvk(wvr wvrVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = wvrVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        wvk wvkVar = new wvk(this.c, (ffgu) obj3);
        wvkVar.b = (aaxe) obj;
        return wvkVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        Object obj2 = this.b;
        wvr wvrVar = this.c;
        this.a = 1;
        Object d = wvrVar.d((aaxe) obj2, this);
        return d == ffhhVar ? ffhhVar : d;
    }
}
