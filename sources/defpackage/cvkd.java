package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvkd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvki b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvkd(cvki cvkiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cvkiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvkd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cvki cvkiVar = this.b;
            ffji ffjiVar = new ffji() { // from class: cvkc
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    cvjm cvjmVar = (cvjm) ((cvjn) obj2).toBuilder();
                    cvjmVar.clear();
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
        return new cvkd(this.b, ffguVar);
    }
}
