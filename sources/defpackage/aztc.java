package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aztc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aztd b;
    final /* synthetic */ Optional c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aztc(aztd aztdVar, Optional optional, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aztdVar;
        this.c = optional;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aztc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aztd aztdVar = this.b;
            this.a = 1;
            Object a = ffra.a(ekxi.a(aztdVar.c), new azsy(null, aztdVar), this);
            if (a != ffhh.a) {
                a = ffcu.a;
            }
            if (a == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aztc(this.b, this.c, ffguVar);
    }
}
