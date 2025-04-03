package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fewi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fdxj b;
    final /* synthetic */ fdxk c;
    final /* synthetic */ febs d;
    final /* synthetic */ febo e;
    final /* synthetic */ fewc f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fewi(fdxj fdxjVar, fdxk fdxkVar, febs febsVar, febo feboVar, fewc fewcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fdxjVar;
        this.c = fdxkVar;
        this.d = febsVar;
        this.e = feboVar;
        this.f = fewcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fewi) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            fewh fewhVar = new fewh(this.b, this.c, this.d, this.e, (ffxy) this.g, this.f, null);
            this.a = 1;
            if (ffsl.a(fewhVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        fewi fewiVar = new fewi(this.b, this.c, this.d, this.e, this.f, ffguVar);
        fewiVar.g = obj;
        return fewiVar;
    }
}
