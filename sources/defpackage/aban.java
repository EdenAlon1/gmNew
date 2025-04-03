package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aban extends ffhv implements ffjm {
    int a;
    final /* synthetic */ abao b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aban(abao abaoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = abaoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aban) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        fglt fgltVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl f = ((axkm) this.b.a.b()).f();
            this.a = 1;
            obj = fgfz.c(f, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        axeu axeuVar = (axeu) obj;
        axeuVar.getClass();
        switch (axeuVar) {
            case UNSPECIFIED_STATUS:
            case ENABLE_FAILED:
            case DISABLED:
            case DISABLING:
            case DISABLE_FAILED:
                fgltVar = fglt.NOT_ENABLED;
                break;
            case ENABLED:
                fgltVar = fglt.ENABLED;
                break;
            case ENABLING:
                fgltVar = fglt.IN_INITIAL_SYNC;
                break;
            default:
                throw new ffcd();
        }
        this.b.c.set(fgltVar);
        fgmh b = ((alry) this.b.b.b()).b(fgltVar);
        b.getClass();
        this.b.j(b);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aban(this.b, ffguVar);
    }
}
