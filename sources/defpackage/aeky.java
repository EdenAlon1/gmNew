package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeky extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aela b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeky(ffgu ffguVar, aela aelaVar) {
        super(2, ffguVar);
        this.b = aelaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aeky) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            aela aelaVar = this.b;
            this.a = 1;
            obj = aelaVar.a.a(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return new aekw(new Integer(((Number) obj).intValue()));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aeky aekyVar = new aeky(ffguVar, this.b);
        aekyVar.c = obj;
        return aekyVar;
    }
}
