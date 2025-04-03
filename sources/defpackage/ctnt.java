package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctnt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ctof b;
    final /* synthetic */ emkq c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctnt(ffgu ffguVar, ctof ctofVar, emkq emkqVar) {
        super(2, ffguVar);
        this.b = ctofVar;
        this.c = emkqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctnt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            aiqu aiquVar = (aiqu) this.b.l.b();
            this.a = 1;
            obj = aiquVar.a(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        aiqp aiqpVar = (aiqp) obj;
        csjb d = this.b.n.d();
        d.I("createSmartReplyLibFromConfigAsync");
        d.r();
        engr engrVar = new engr();
        if (aiqpVar != null) {
            engrVar.h(aiqpVar);
        }
        return this.b.c(this.c, engrVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctnt ctntVar = new ctnt(ffguVar, this.b, this.c);
        ctntVar.d = obj;
        return ctntVar;
    }
}
