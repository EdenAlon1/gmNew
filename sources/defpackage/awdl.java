package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awdl extends ffhv implements ffjm {
    final /* synthetic */ awap a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awdl(ffgu ffguVar, awap awapVar) {
        super(2, ffguVar);
        this.a = awapVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awdl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object apply;
        ffci.b(obj);
        String[] strArr = awfq.a;
        awfh awfhVar = new awfh();
        apply = new awdn(this.a).apply(new awfp());
        awfhVar.b = new awfo((awfp) apply);
        final awfo awfoVar = (awfo) awfhVar.b().b;
        return (engw) awfq.b().r("file_processing-deleteAndReturnDeletedRows-txn", new emyl() { // from class: awdv
            @Override // defpackage.emyl
            public final Object get() {
                awfl a = awfq.a();
                awfo awfoVar2 = awfo.this;
                a.k(awfoVar2);
                a.z("file_processing-deleteAndReturnDeletedRows-query");
                engw y = a.b().y();
                awfh awfhVar2 = new awfh();
                awfhVar2.b = awfoVar2;
                awfhVar2.f("file_processing-deleteAndReturnDeletedRows-delete");
                awfhVar2.b().b();
                return y;
            }
        });
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        awdl awdlVar = new awdl(ffguVar, this.a);
        awdlVar.b = obj;
        return awdlVar;
    }
}
