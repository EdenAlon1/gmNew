package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anze extends ffhv implements ffjm {
    int a;
    final /* synthetic */ anzd b;
    final /* synthetic */ anzf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anze(anzd anzdVar, anzf anzfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = anzdVar;
        this.c = anzfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anze) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        anww anwwVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            if (((Boolean) ((cfup) ctjd.bK.get()).e()).booleanValue()) {
                anzd anzdVar = this.b;
                if ((anzdVar.b & 4) != 0) {
                    anwwVar = anzdVar.e;
                    if (anwwVar == null) {
                        anwwVar = anww.a;
                    }
                } else {
                    anwwVar = null;
                }
                if (anwwVar != null) {
                    ((cgoo) this.c.b.b()).b(bdhb.b(anwwVar.b));
                    return ceyt.i();
                }
            }
            ctjh ctjhVar = (ctjh) this.c.a.b();
            anzd anzdVar2 = this.b;
            this.a = 1;
            if (ctjhVar.k(anzdVar2, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ceyt.i();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new anze(this.b, this.c, ffguVar);
    }
}
