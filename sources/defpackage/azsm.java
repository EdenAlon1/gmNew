package defpackage;

import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azsm extends ffhv implements ffjm {
    final /* synthetic */ azst a;
    final /* synthetic */ azsu b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azsm(ffgu ffguVar, azst azstVar, azsu azsuVar) {
        super(2, ffguVar);
        this.a = azstVar;
        this.b = azsuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azsm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        azrk a = azrn.a("MyIdentityTablesOperations#getMyIdentityForToken");
        final azsu azsuVar = this.b;
        a.c(new Function() { // from class: azrr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                azrm azrmVar = (azrm) obj2;
                entd entdVar = azst.a;
                azrmVar.aq(new dtrt("my_identities.token", 1, azsv.b(azsu.this)));
                return azrmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw y = a.b().y();
        int i = ((enou) y).c;
        if (i > 1) {
            throw new IllegalStateException("there are " + i + " identities for token " + azsuVar.b);
        }
        y.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(y, 10));
        enqv it = y.iterator();
        while (it.hasNext()) {
            azst azstVar = this.a;
            azqe azqeVar = (azqe) it.next();
            azqeVar.getClass();
            arrayList.add(azstVar.i(azqeVar));
        }
        azop azopVar = (azop) ffdx.U(arrayList);
        if (azopVar != null) {
            return azopVar;
        }
        azsu azsuVar2 = this.b;
        Objects.toString(azsuVar2);
        throw new IllegalArgumentException("No MyIdentity found for token ".concat(String.valueOf(azsuVar2)));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        azsm azsmVar = new azsm(ffguVar, this.a, this.b);
        azsmVar.c = obj;
        return azsmVar;
    }
}
