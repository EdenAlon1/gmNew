package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aayn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ abac b;
    final /* synthetic */ aoax c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aayn(abac abacVar, aoax aoaxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = abacVar;
        this.c = aoaxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aayn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffji aazfVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            abac abacVar = this.b;
            aoax aoaxVar = this.c;
            if (aoaxVar instanceof bdtz) {
                aazfVar = new aazn(aoaxVar, abacVar, null);
            } else if (aoaxVar instanceof bdua) {
                aazfVar = new aazo(abacVar, null);
            } else if (aoaxVar instanceof bdtt) {
                aazfVar = new aazp(abacVar, aoaxVar, null);
            } else if (aoaxVar instanceof aoat) {
                aazfVar = new aazr(abacVar, aoaxVar, null);
            } else if (aoaxVar instanceof aoas) {
                aazfVar = new aazs(abacVar, aoaxVar, null);
            } else if (aoaxVar instanceof bdtu) {
                aazfVar = new aazt(abacVar, aoaxVar, null);
            } else if (aoaxVar instanceof bdub) {
                aazfVar = new aazu(abacVar, aoaxVar, null);
            } else if (aoaxVar instanceof bdtj) {
                aazfVar = new aazv(aoaxVar, abacVar, null);
            } else if (aoaxVar instanceof bdtm) {
                aazfVar = new aazw(abacVar, aoaxVar, null);
            } else if (aoaxVar instanceof aoaw) {
                aazfVar = new aazd(aoaxVar, abacVar, null);
            } else if (aoaxVar instanceof bdtg) {
                aazfVar = new aaze(aoaxVar, abacVar, null);
            } else {
                int ordinal = aoaxVar.a().ordinal();
                if (ordinal == 0) {
                    aazfVar = new aazf(null);
                } else if (ordinal == 2) {
                    aazfVar = new aazg(abacVar, null);
                } else if (ordinal != 9) {
                    switch (ordinal) {
                        case 13:
                            aazfVar = new aazl(abacVar, null);
                            break;
                        case 14:
                            aazfVar = new aazk(abacVar, null);
                            break;
                        case 15:
                            aazfVar = new aazj(abacVar, null);
                            break;
                        case 16:
                            aazfVar = new aazi(abacVar, null);
                            break;
                        default:
                            aazfVar = new aazm(null);
                            break;
                    }
                } else {
                    aazfVar = new aazh(abacVar, null);
                }
            }
            aaza aazaVar = new aaza(aazfVar, aoaxVar, abacVar, null);
            this.a = 1;
            if (aazaVar.invoke(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aayn(this.b, this.c, ffguVar);
    }
}
