package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvju extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvki b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvju(ffgu ffguVar, cvki cvkiVar) {
        super(2, ffguVar);
        this.b = cvkiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvju) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cvki cvkiVar = this.b;
            this.a = 1;
            obj = cvkiVar.a.c(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        cvjn cvjnVar = (cvjn) obj;
        if ((cvjnVar.b & 8) != 0) {
            return cvjnVar.f;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cvju cvjuVar = new cvju(ffguVar, this.b);
        cvjuVar.c = obj;
        return cvjuVar;
    }
}
