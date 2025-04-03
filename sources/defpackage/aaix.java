package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaix extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aaja b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaix(aaja aajaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aajaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aaix) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            comc a = this.b.a();
            ffji ffjiVar = new ffji() { // from class: aaiw
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    aajb aajbVar = (aajb) ((aajc) obj2).toBuilder();
                    aajbVar.copyOnWrite();
                    aajc aajcVar = (aajc) aajbVar.instance;
                    aajcVar.b |= 4;
                    aajcVar.d = false;
                    aajbVar.copyOnWrite();
                    aajc aajcVar2 = (aajc) aajbVar.instance;
                    aajcVar2.b |= 2;
                    aajcVar2.c = 0;
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
        return new aaix(this.b, ffguVar);
    }
}
