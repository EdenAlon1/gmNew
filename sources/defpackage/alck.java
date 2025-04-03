package defpackage;

import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class alck extends alhh {
    public alck(ffbr ffbrVar, alcs alcsVar, Executor executor) {
        super(ffbrVar, alcsVar, executor);
    }

    static epso d(int i, int i2, int i3, boolean z, Integer num, int i4) {
        epso epsoVar = (epso) epsw.a.createBuilder();
        epsoVar.copyOnWrite();
        epsw epswVar = (epsw) epsoVar.instance;
        epswVar.c = i - 1;
        epswVar.b |= 1;
        epsoVar.copyOnWrite();
        epsw epswVar2 = (epsw) epsoVar.instance;
        epswVar2.d = i2 - 1;
        epswVar2.b |= 2;
        epsoVar.copyOnWrite();
        epsw epswVar3 = (epsw) epsoVar.instance;
        epswVar3.e = i3 - 1;
        epswVar3.b |= 4;
        epsoVar.copyOnWrite();
        epsw epswVar4 = (epsw) epsoVar.instance;
        epswVar4.b |= 8;
        epswVar4.f = z;
        epsoVar.copyOnWrite();
        epsw epswVar5 = (epsw) epsoVar.instance;
        epswVar5.i = i4 - 1;
        epswVar5.b |= 64;
        if (num != null) {
            int intValue = num.intValue();
            epsoVar.copyOnWrite();
            epsw epswVar6 = (epsw) epsoVar.instance;
            epswVar6.b |= 16;
            epswVar6.g = intValue;
        }
        return epsoVar;
    }

    protected abstract eyhs b(epsw epswVar);

    protected final epsw c(epso epsoVar) {
        final epsw epswVar = (epsw) epsoVar.build();
        o(new Supplier() { // from class: alcj
            @Override // java.util.function.Supplier
            public final Object get() {
                return alck.this.b(epswVar);
            }
        });
        return epswVar;
    }

    @Deprecated
    public final epsw e(String str, int i, boolean z, boolean z2, Long l, int i2) {
        boolean n = le.n(str);
        int i3 = true != z ? 3 : 2;
        if (n) {
            return c(d(2, i3, i, z2, null, i2));
        }
        csix.k(le.A(str));
        csix.l(l);
        csix.k(l.longValue() > 0);
        return c(d(3, i3, i, z2, Integer.valueOf((int) (l.longValue() / 1000)), i2));
    }
}
