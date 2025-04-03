package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czcu extends ffhv implements ffjo {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;

    public czcu(ffgu ffguVar) {
        super(4, ffguVar);
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        czcu czcuVar = new czcu((ffgu) obj4);
        czcuVar.a = (aotn) obj;
        czcuVar.b = (aotn) obj2;
        czcuVar.c = (aotn) obj3;
        return czcuVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return new Integer(((aotn) this.a).a + ((aotn) this.b).a + ((aotn) this.c).a);
    }
}
