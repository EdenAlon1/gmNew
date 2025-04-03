package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ofj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ofk b;
    final /* synthetic */ oke c;
    final /* synthetic */ ofz d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofj(ofk ofkVar, oke okeVar, ofz ofzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ofkVar;
        this.c = okeVar;
        this.d = ofzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ofj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffsk ffskVar;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffskVar = (ffsk) this.e;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            ffsk ffskVar2 = (ffsk) this.e;
            ofk ofkVar = this.b;
            oke okeVar = this.c;
            this.e = ffskVar2;
            this.a = 1;
            Object c = ofkVar.a.c(okeVar, this);
            if (c == ffhhVar) {
                return ffhhVar;
            }
            ffskVar = ffskVar2;
            obj = c;
        }
        ofk ofkVar2 = this.b;
        okj okjVar = (okj) obj;
        if (ofkVar2.a.h()) {
            ofkVar2.a();
            return ffcu.a;
        }
        ffqy.d(ffskVar, ofkVar2.b, null, new ofi(okjVar, ofkVar2, this.d, null), 2);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ofj ofjVar = new ofj(this.b, this.c, this.d, ffguVar);
        ofjVar.e = obj;
        return ofjVar;
    }
}
