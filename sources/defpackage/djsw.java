package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djsw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ djsz b;
    final /* synthetic */ djrj c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djsw(ffgu ffguVar, djsz djszVar, djrj djrjVar) {
        super(2, ffguVar);
        this.b = djszVar;
        this.c = djrjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djsw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            djsz djszVar = this.b;
            this.a = 1;
            if (djszVar.s(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return fflm.b(this.b.i(this.c));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        djsw djswVar = new djsw(ffguVar, this.b, this.c);
        djswVar.d = obj;
        return djswVar;
    }
}
