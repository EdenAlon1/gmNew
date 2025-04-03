package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xch extends ffhv implements ffjm {
    final /* synthetic */ xck a;
    final /* synthetic */ aqks b;
    final /* synthetic */ xbz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xch(xck xckVar, aqks aqksVar, xbz xbzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = xckVar;
        this.b = aqksVar;
        this.c = xbzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xch) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        aigz aigzVar = (aigz) this.a.i.b();
        aqks aqksVar = this.b;
        long j = aqksVar.c;
        String str = aqksVar.d;
        str.getClass();
        aigzVar.h(new aijz(j, str, this.c.d));
        final erca ercaVar = this.c.c;
        this.a.g.a(new Supplier() { // from class: cvgh
            @Override // java.util.function.Supplier
            public final Object get() {
                erby erbyVar = (erby) ercb.a.createBuilder();
                erbyVar.copyOnWrite();
                ercb ercbVar = (ercb) erbyVar.instance;
                ercbVar.d = erbz.a(4);
                ercbVar.b |= 2;
                erbyVar.a(erca.this);
                return (ercb) erbyVar.build();
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xch(this.a, this.b, this.c, ffguVar);
    }
}
