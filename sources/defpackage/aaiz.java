package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaiz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aaja b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaiz(aaja aajaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aajaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aaiz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final aaja aajaVar = this.b;
            comc a = aajaVar.a();
            ffji ffjiVar = new ffji() { // from class: aaiy
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    aajc aajcVar = (aajc) obj2;
                    ((aaip) aaja.this.c.b()).a(3, aajcVar.c, aajcVar.d);
                    aajb aajbVar = (aajb) aajcVar.toBuilder();
                    aajbVar.copyOnWrite();
                    aajc aajcVar2 = (aajc) aajbVar.instance;
                    aajcVar2.b |= 4;
                    aajcVar2.d = true;
                    eyfy build = aajbVar.build();
                    build.getClass();
                    return (aajc) build;
                }
            };
            this.a = 1;
            if (a.d(ffjiVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aaiz(this.b, ffguVar);
    }
}
