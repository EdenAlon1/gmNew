package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dnb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dne b;
    final /* synthetic */ ffjm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnb(dne dneVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dneVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnb) c((drd) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                drd drdVar = (drd) this.d;
                this.b.d.b(true);
                ffjm ffjmVar = this.c;
                this.a = 1;
                if (ffjmVar.a(drdVar, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
            this.b.d.b(false);
            return ffcu.a;
        } catch (Throwable th) {
            this.b.d.b(false);
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dnb dnbVar = new dnb(this.b, this.c, ffguVar);
        dnbVar.d = obj;
        return dnbVar;
    }
}
