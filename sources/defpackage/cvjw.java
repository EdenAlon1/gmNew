package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvjw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvki b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvjw(ffgu ffguVar, cvki cvkiVar) {
        super(2, ffguVar);
        this.b = cvkiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvjw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            cvki cvkiVar = this.b;
            this.a = 1;
            obj = cvkiVar.a.c(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        cvjn cvjnVar = (cvjn) obj;
        if ((cvjnVar.b & 32) == 0) {
            return null;
        }
        eyja eyjaVar = cvjnVar.h;
        if (eyjaVar == null) {
            eyjaVar = eyja.a;
        }
        eyjaVar.getClass();
        return eykn.d(eyjaVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cvjw cvjwVar = new cvjw(ffguVar, this.b);
        cvjwVar.c = obj;
        return cvjwVar;
    }
}
