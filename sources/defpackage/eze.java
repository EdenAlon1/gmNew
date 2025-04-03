package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eze extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffji b;
    final /* synthetic */ ezf c;
    final /* synthetic */ fai d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eze(ffji ffjiVar, ezf ezfVar, fai faiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffjiVar;
        this.c = ezfVar;
        this.d = faiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eze) c((jbu) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ezd ezdVar = new ezd((jbu) this.e, this.b, this.c, this.d, null);
            this.a = 1;
            if (ffsl.a(ezdVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        throw new ffbx();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        eze ezeVar = new eze(this.b, this.c, this.d, ffguVar);
        ezeVar.e = obj;
        return ezeVar;
    }
}
