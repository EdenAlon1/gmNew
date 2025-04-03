package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchResult;
import j$.util.Collection;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbqu {
    public final aolr a;

    public cbqu(aolr aolrVar) {
        this.a = aolrVar;
    }

    public static Map a(List list, Function function, Predicate predicate) {
        Stream filter = Collection.EL.stream(list).filter(predicate);
        Supplier supplier = new Supplier() { // from class: cbqt
            @Override // java.util.function.Supplier
            public final Object get() {
                return new HashMap();
            }
        };
        int i = engw.d;
        return (Map) filter.collect(Collectors.groupingBy(function, supplier, endq.a));
    }

    public static boolean b(UrlSearchResult urlSearchResult) {
        if (urlSearchResult.l() != null) {
            fbuk l = urlSearchResult.l();
            if (cuxu.b((l.c == 8 ? (fbue) l.d : fbue.a).c)) {
                return true;
            }
        }
        return cuxu.b(urlSearchResult.s()) || cuxu.b(urlSearchResult.o());
    }
}
