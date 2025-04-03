package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efuk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ewkb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efuk(ewkb ewkbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ewkbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((efuk) c((ewjl) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ewjl ewjlVar = (ewjl) this.c;
        ewkb ewkbVar = this.b;
        this.a = 1;
        Object b = ewjlVar.b(ewkbVar, new febo(), this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        efuk efukVar = new efuk(this.b, ffguVar);
        efukVar.c = obj;
        return efukVar;
    }
}
