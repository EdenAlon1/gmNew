package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvkb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvki b;
    final /* synthetic */ String c;
    final /* synthetic */ cvjj d;
    final /* synthetic */ cvjl e;
    final /* synthetic */ eisx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvkb(cvki cvkiVar, String str, cvjj cvjjVar, cvjl cvjlVar, eisx eisxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cvkiVar;
        this.c = str;
        this.d = cvjjVar;
        this.e = cvjlVar;
        this.f = eisxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvkb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final cvki cvkiVar = this.b;
            final String str = this.c;
            final cvjj cvjjVar = this.d;
            final cvjl cvjlVar = this.e;
            final eisx eisxVar = this.f;
            ffji ffjiVar = new ffji() { // from class: cvka
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    cvjm cvjmVar = (cvjm) ((cvjn) obj2).toBuilder();
                    int a = eisxVar.a();
                    cvjmVar.copyOnWrite();
                    cvjn cvjnVar = (cvjn) cvjmVar.instance;
                    cvjnVar.b |= 1;
                    cvjnVar.c = a;
                    cvjmVar.copyOnWrite();
                    cvjn cvjnVar2 = (cvjn) cvjmVar.instance;
                    cvjnVar2.b |= 8;
                    cvjnVar2.f = str;
                    eyja a2 = cuxw.a(((cqoh) cvkiVar.b.b()).f().toEpochMilli());
                    cvjmVar.copyOnWrite();
                    cvjn cvjnVar3 = (cvjn) cvjmVar.instance;
                    a2.getClass();
                    cvjnVar3.d = a2;
                    cvjnVar3.b |= 2;
                    cvjmVar.copyOnWrite();
                    cvjn cvjnVar4 = (cvjn) cvjmVar.instance;
                    cvjnVar4.e = cvjjVar.d;
                    cvjnVar4.b |= 4;
                    cvjmVar.copyOnWrite();
                    cvjn cvjnVar5 = (cvjn) cvjmVar.instance;
                    cvjnVar5.g = cvjlVar.g;
                    cvjnVar5.b |= 16;
                    eyfy build = cvjmVar.build();
                    build.getClass();
                    return (cvjn) build;
                }
            };
            this.a = 1;
            if (cvkiVar.a.d(ffjiVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvkb(this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}
