package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azlf implements copj {
    private final ffbr a;
    private final azvu b;

    public azlf(ffbr ffbrVar, azvu azvuVar) {
        ffbrVar.getClass();
        azvuVar.getClass();
        this.a = ffbrVar;
        this.b = azvuVar;
    }

    @Override // defpackage.copj
    public final void a(Set set) {
        set.getClass();
        azlv azlvVar = (azlv) this.a.b();
        azmn azmnVar = (azmn) azlvVar.a.b();
        ArrayList arrayList = new ArrayList(ffdx.n(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            cosz coszVar = (cosz) it.next();
            aolr aolrVar = azlvVar.c;
            coszVar.getClass();
            int i = coszVar.d;
            String str = coszVar.n;
            str.getClass();
            aoku u = aolrVar.u(coszVar.g, i);
            String str2 = coszVar.u;
            str2.getClass();
            String str3 = coszVar.c;
            str3.getClass();
            arrayList.add(new azvv(i, str, u, str2, str3));
        }
        axol.k(azlvVar.d, null, new azlp(azlvVar, azmnVar.a(arrayList).a, null), 3);
        final azvu azvuVar = this.b;
        Stream map = Collection.EL.stream(set).map(new Function() { // from class: azvl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cosz coszVar2 = (cosz) obj;
                azvu azvuVar2 = azvu.this;
                return new azti(((ctwb) azvuVar2.c.b()).h(coszVar2.d), coszVar2, ((akjd) azvuVar2.g.b()).a.a.a.Z);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = engw.d;
        azvuVar.m((engw) map.collect(endq.a));
    }

    @Override // defpackage.copj
    public final /* synthetic */ void b(Set set) {
    }
}
