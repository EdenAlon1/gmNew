package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvox extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvoz b;
    final /* synthetic */ cvpa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvox(cvoz cvozVar, cvpa cvpaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cvozVar;
        this.c = cvpaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvox) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final cvoz cvozVar = this.b;
            ffji ffjiVar = new ffji() { // from class: cvow
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    cvpc cvpcVar = (cvpc) obj2;
                    long epochMilli = ((cqoh) cvoz.this.h.b()).f().toEpochMilli();
                    cvpcVar.copyOnWrite();
                    cvpd cvpdVar = (cvpd) cvpcVar.instance;
                    cvpd cvpdVar2 = cvpd.a;
                    cvpdVar.b = epochMilli;
                    return ffcu.a;
                }
            };
            this.a = 1;
            if (ctzl.b(cvozVar.b, ffjiVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        cvpb cvpbVar = (cvpb) this.b.g.b();
        cvpa cvpaVar = this.c;
        cvpaVar.getClass();
        if (!fffi.d(cvpa.b, cvpa.c).contains(cvpaVar)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        cvpbVar.a(cvpaVar);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvox(this.b, this.c, ffguVar);
    }
}
