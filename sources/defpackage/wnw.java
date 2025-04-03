package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wnw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ woi b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnw(ffgu ffguVar, woi woiVar) {
        super(2, ffguVar);
        this.b = woiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wnw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            woi woiVar = this.b;
            wnx wnxVar = wnx.a;
            this.a = 1;
            obj = woiVar.c.d(wnxVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return new Integer(((czuk) obj).d);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        wnw wnwVar = new wnw(ffguVar, this.b);
        wnwVar.c = obj;
        return wnwVar;
    }
}
