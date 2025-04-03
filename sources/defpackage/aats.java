package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aats extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ aatu b;
    final /* synthetic */ alxy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aats(aatu aatuVar, alxy alxyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aatuVar;
        this.c = alxyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aats) c((alxw) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        alxw alxwVar = (alxw) this.a;
        apvw apvwVar = this.b.i;
        int a = apvwVar.a();
        int c = apvwVar.c();
        int c2 = apvwVar.c();
        ojd ojdVar = new ojd(c, 0, false, a, this.b.i.b(), c2 + c2, 6);
        final aatu aatuVar = this.b;
        final alxy alxyVar = this.c;
        return odg.a(new ffzb(new fgbt(new ojc(ojdVar, alxwVar, new ffix() { // from class: aatp
            @Override // defpackage.ffix
            public final Object invoke() {
                aatu aatuVar2 = aatu.this;
                aasu aasuVar = aatuVar2.e;
                if (aasuVar != null) {
                    aasuVar.close();
                }
                alxy alxyVar2 = alxyVar;
                aaub aaubVar = aatuVar2.h;
                ecrj ecrjVar = (ecrj) aaubVar.a.b();
                ecrjVar.getClass();
                aaul aaulVar = (aaul) aaubVar.b.b();
                aaulVar.getClass();
                aauf aaufVar = (aauf) aaubVar.c.b();
                aaufVar.getClass();
                aauo aauoVar = (aauo) aaubVar.d.b();
                aauoVar.getClass();
                aaup aaupVar = (aaup) aaubVar.e.b();
                aaupVar.getClass();
                aatz aatzVar = new aatz(ecrjVar, alxyVar2, aaulVar, aaufVar, aauoVar, aaupVar);
                aatuVar2.e = aatzVar;
                aatuVar2.d.set(true);
                return aatzVar;
            }
        }).a, new aatq(null)), new aatr(this.b, null)), this.b.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aats aatsVar = new aats(this.b, this.c, ffguVar);
        aatsVar.a = obj;
        return aatsVar;
    }
}
