package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ofi extends ffhv implements ffjm {
    final /* synthetic */ okj a;
    final /* synthetic */ ofk b;
    final /* synthetic */ ofz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofi(okj okjVar, ofk ofkVar, ofz ofzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = okjVar;
        this.b = ofkVar;
        this.c = ofzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ofi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        okj okjVar = this.a;
        if (okjVar instanceof oki) {
            this.b.b(this.c, (oki) okjVar);
        } else if (okjVar instanceof okf) {
            ofk ofkVar = this.b;
            ofz ofzVar = this.c;
            Throwable th = ((okf) okjVar).a;
            if (!ofkVar.e()) {
                ofkVar.d.b(ofzVar, new ofu(th));
            }
        } else if (okjVar instanceof okg) {
            ofk ofkVar2 = this.b;
            ofkVar2.a.e();
            ofkVar2.a();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ofi(this.a, this.b, this.c, ffguVar);
    }
}
