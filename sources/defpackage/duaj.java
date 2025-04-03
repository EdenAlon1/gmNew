package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class duaj {
    public final ContentValues a;
    protected final Map b;
    protected final String c;
    public final duan d;
    public engw e;
    protected final Map f;

    /* compiled from: PG */
    public interface a {
        Map fK();
    }

    protected duaj(String str, ContentValues contentValues, Map map, engw engwVar, duan duanVar) {
        this.c = str;
        this.a = new ContentValues(contentValues);
        this.b = map == null ? null : new HashMap(map);
        this.e = engwVar;
        this.d = duanVar;
        this.f = ((a) ekhw.a(dtub.b, a.class)).fK();
    }

    private final dtve a() {
        return dtub.e(((dtrm) this.d).e);
    }

    private final boolean b() {
        Map map = this.b;
        return (map == null || map.isEmpty()) ? false : true;
    }

    public static final void q(StringBuilder sb, duan duanVar) {
        sb.append("(");
        sb.append((String) Collection.EL.stream(((dtrn) ((dtrm) duanVar).h).b).map(new Function() { // from class: duai
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((dtry) obj).d();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(",")));
        sb.append(") = ");
    }

    public static final void r(StringBuilder sb, duam duamVar) {
        sb.append("(SELECT ");
        dtrn dtrnVar = (dtrn) duamVar;
        Cursor cursor = dtrnVar.a;
        sb.append((String) DesugarArrays.stream(cursor.getColumnNames()).skip(1L).collect(Collectors.joining(",")));
        sb.append(" FROM (");
        for (int i = 0; i < cursor.getCount(); i++) {
            cursor.moveToPosition(i);
            sb.append("SELECT ");
            for (int i2 = 0; i2 < cursor.getColumnCount(); i2++) {
                if (cursor.getType(i2) == 3) {
                    String string = cursor.getString(i2);
                    sb.append(string != null ? DatabaseUtils.sqlEscapeString(string) : "NULL");
                } else if (cursor.getType(i2) == 1) {
                    sb.append(cursor.getInt(i2));
                } else if (cursor.getType(i2) == 4) {
                    sb.append(dtub.i(cursor.getBlob(i2)));
                } else {
                    String string2 = cursor.getString(i2);
                    sb.append(string2 != null ? DatabaseUtils.sqlEscapeString(string2) : "NULL");
                }
                sb.append(" AS ");
                sb.append(cursor.getColumnName(i2));
                if (i2 < cursor.getColumnCount() - 1) {
                    sb.append(", ");
                }
            }
            if (i < cursor.getCount() - 1) {
                sb.append(" UNION ");
            }
        }
        sb.append(") AS _I WHERE ");
        sb.append(dtrnVar.c.ag(new dtzu(null, dtza.B().a(), true, null)));
        sb.append(")");
    }

    protected static final String s(List list, String str, Object obj, String str2) {
        if (obj == null) {
            return defpackage.a.a(str, "(", " IS NULL)");
        }
        if (obj instanceof Boolean) {
            list.add(true != ((Boolean) obj).booleanValue() ? "0" : "1");
        } else {
            if (obj instanceof dtzj) {
                return "(" + str + " IS " + ((dtzj) obj).ag(dtzu.b()) + ")";
            }
            list.add(obj.toString());
        }
        return defpackage.a.d(str2, str, "(", " IS ", ")");
    }

    public final int e() {
        return f(a(), 0);
    }

    protected final int f(dtve dtveVar, int i) {
        return g(dtveVar, i, dtzu.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final int g(defpackage.dtve r12, int r13, defpackage.dtzu r14) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duaj.g(dtve, int, dtzu):int");
    }

    public final dtzj h() {
        ArrayList arrayList = new ArrayList();
        return new dtzq(k(arrayList, "$V"), arrayList.toArray(new Object[0]));
    }

    public final elfl i() {
        Object obj;
        final dtve a2 = a();
        elfl o = a2.o();
        emwl emwlVar = new emwl() { // from class: duac
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                return Integer.valueOf(duaj.this.f(a2, 0));
            }
        };
        obj = ((dtqv) dtub.c).i.get();
        return o.h(emwlVar, (Executor) obj);
    }

    protected final String j(final dtzu dtzuVar, final List list) {
        if (!((dtrm) this.d).a && this.f.containsKey(this.c)) {
            engr engrVar = new engr();
            engrVar.j(this.e);
            engrVar.h(cgja.a());
            this.e = engrVar.g();
        }
        return this.e.isEmpty() ? "1" : new emww(" AND ").b(enkr.g(this.e, new emwl() { // from class: duab
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((duap) obj).b(dtzu.this, list);
            }
        }));
    }

    protected final String k(final List list, final String str) {
        StringBuilder sb = new StringBuilder();
        Stream sorted = Collection.EL.stream(this.a.keySet()).sorted();
        final enip enipVar = ((dtrm) this.d).f;
        Stream map = sorted.filter(new Predicate() { // from class: duae
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return !enip.this.contains((String) obj);
            }
        }).map(new Function() { // from class: duaf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                return duaj.s(list, str2, duaj.this.a.get(str2), str);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        Map map2 = this.b;
        if (map2 != null) {
            map = Stream.CC.concat(map, Collection.EL.stream(map2.entrySet()).sorted(new Comparator() { // from class: duag
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
                }
            }).map(new Function() { // from class: duah
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Map.Entry entry = (Map.Entry) obj;
                    return duaj.s(list, (String) entry.getKey(), entry.getValue(), str);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }));
        }
        sb.append((String) map.collect(Collectors.joining(" AND ")));
        return defpackage.a.a(sb.toString(), "(NOT (", "))");
    }

    public final String l(dtzu dtzuVar) {
        return dtub.k(this.a, this.b, dtzuVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(duao duaoVar) {
        engw engwVar = this.e;
        int i = ((enou) engwVar).c;
        int i2 = 0;
        while (i2 < i) {
            boolean f = ((duap) engwVar.get(i2)).f(duaoVar);
            i2++;
            if (f) {
                return;
            }
        }
    }

    public final boolean n(String str) {
        return this.a.containsKey(str);
    }

    public final boolean o() {
        return this.a.size() == 0;
    }

    @Deprecated
    public final String[] p() {
        return (String[]) this.a.keySet().toArray(new String[0]);
    }

    public final void t(int i) {
        f(a(), i);
    }
}
