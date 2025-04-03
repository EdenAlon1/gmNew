package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwqw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cwrd b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwqw(ffgu ffguVar, cwrd cwrdVar) {
        super(2, ffguVar);
        this.b = cwrdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwqw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            cwrd cwrdVar = this.b;
            this.a = 1;
            obj = cwrdVar.b.c(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ejui ejuiVar = cwrd.a;
        return Boolean.valueOf(cwqv.a((cwrg) obj));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cwqw cwqwVar = new cwqw(ffguVar, this.b);
        cwqwVar.c = obj;
        return cwqwVar;
    }
}
