package defpackage;

import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azsh {
    public static final List a(final int i, final String str) {
        azut a = azuy.a();
        a.z("MyIdentityTablesOperations#getExistingSubRecords");
        a.c(new Function() { // from class: azsg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                azux azuxVar = (azux) obj;
                azuxVar.d(i);
                azuxVar.c(str);
                return azuxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw y = a.b().y();
        y.getClass();
        return y;
    }

    public static final void b(azmx azmxVar, String str) {
        if (str.length() == 0) {
            return;
        }
        azmxVar.f(str);
    }

    public static final void c(azof azofVar, String str) {
        if (str.length() == 0) {
            return;
        }
        int intValue = azoi.c().intValue();
        int intValue2 = azoi.c().intValue();
        if (intValue2 < 59990) {
            dtub.w("provisioning_id", intValue2);
        }
        if (intValue >= 59990) {
            dtub.u(azofVar.a, "provisioning_id", str);
        }
    }

    public static final void d(aztt azttVar, azvv azvvVar) {
        if (azvvVar.a() != null) {
            azttVar.g(azvvVar.a());
        }
    }
}
