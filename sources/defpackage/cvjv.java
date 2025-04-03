package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvjv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvki b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvjv(ffgu ffguVar, cvki cvkiVar) {
        super(2, ffguVar);
        this.b = cvkiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvjv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        eygr eygrVar = ((cvjn) obj).i;
        eygrVar.getClass();
        return engq.f(eygrVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cvjv cvjvVar = new cvjv(ffguVar, this.b);
        cvjvVar.c = obj;
        return cvjvVar;
    }
}
