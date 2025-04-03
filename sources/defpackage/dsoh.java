package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsoh extends ffhv implements ffji {
    int a;
    final /* synthetic */ dsol b;
    final /* synthetic */ boolean c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsoh(dsol dsolVar, boolean z, int i, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = dsolVar;
        this.c = z;
        this.d = i;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final dsol dsolVar = this.b;
            final boolean z = this.c;
            final int i2 = this.d;
            final ffji ffjiVar = new ffji() { // from class: dsof
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    dsom dsomVar;
                    dson dsonVar = (dson) obj2;
                    if (dsonVar == null || (dsomVar = (dsom) dson.a.createBuilder(dsonVar)) == null) {
                        dsomVar = (dsom) dson.a.createBuilder();
                        dsomVar.getClass();
                    }
                    int i3 = i2;
                    boolean z2 = z;
                    dsol dsolVar2 = dsol.this;
                    eyja d = eykm.d(dsolVar2.a.f().toEpochMilli());
                    dsomVar.copyOnWrite();
                    dson dsonVar2 = (dson) dsomVar.instance;
                    d.getClass();
                    dsonVar2.e = d;
                    dsonVar2.b |= 4;
                    if (z2) {
                        dsomVar.copyOnWrite();
                        dson dsonVar3 = (dson) dsomVar.instance;
                        dsonVar3.b |= 1;
                        dsonVar3.c = i3;
                    } else {
                        dsomVar.copyOnWrite();
                        dson dsonVar4 = (dson) dsomVar.instance;
                        dsonVar4.b |= 2;
                        dsonVar4.d = i3;
                    }
                    dson dsonVar5 = (dson) dsomVar.build();
                    dsolVar2.e = dsonVar5;
                    return dsonVar5;
                }
            };
            ListenableFuture b = dsolVar.b.b(new emwl() { // from class: dsog
                @Override // defpackage.emwl
                public final Object apply(Object obj2) {
                    return ffji.this.invoke(obj2);
                }
            }, erpp.a);
            this.a = 1;
            if (fgfz.c(b, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dsoh(this.b, this.c, this.d, (ffgu) obj).b(ffcu.a);
    }
}
