package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvgi extends ffhv implements ffjm {
    final /* synthetic */ Supplier a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvgi(Supplier supplier, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = supplier;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvgi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffci.b(obj);
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.VIDEO_CALLING_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        obj2 = this.a.get();
        ercb ercbVar = (ercb) obj2;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        ercbVar.getClass();
        eolvVar2.cr = ercbVar;
        eolvVar2.h |= 1048576;
        return eoluVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvgi(this.a, ffguVar);
    }
}
