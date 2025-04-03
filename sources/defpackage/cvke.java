package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvke extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvki b;
    final /* synthetic */ Instant c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvke(ffgu ffguVar, cvki cvkiVar, Instant instant) {
        super(2, ffguVar);
        this.b = cvkiVar;
        this.c = instant;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvke) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cvki cvkiVar = this.b;
        cvkf cvkfVar = new cvkf(this.c);
        this.a = 1;
        Object d = cvkiVar.a.d(cvkfVar, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cvke cvkeVar = new cvke(ffguVar, this.b, this.c);
        cvkeVar.d = obj;
        return cvkeVar;
    }
}
