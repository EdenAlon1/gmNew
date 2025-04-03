package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.dtro;
import defpackage.dtry;
import defpackage.dtsu;
import defpackage.dtub;
import defpackage.dtyq;
import defpackage.dtyx;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dtyq<C extends dtsu<C, Q, B, D, RT>, Q extends dtyq<C, Q, B, D, RT>, B extends dtyx<C, Q, B, D, RT>, D extends dtro<C, Q, B, D, RT>, RT extends dtry<RT>> implements dtzj {
    public static final ThreadLocal a = new dtyi();
    protected static final Pattern b = Pattern.compile("%([a-zA-Z_][a-zA-Z_0-9]+)%");
    public static final enru c = enru.c("com/google/android/libraries/databaseannotations/support/QueryBase");
    public static final Level d = Level.FINEST;
    public final dtza e;
    protected final Map f;
    protected final Supplier g;
    protected final Supplier h;
    public final List i;
    public final String[] j;
    public final String k;
    public final String[] l;
    public final dtvs m;
    public final String n;
    public final String o;
    public dtse p;
    public final List q = new CopyOnWriteArrayList();
    public CancellationSignal r;
    private final String s;
    private final String t;
    private final String u;
    private dtse v;

    /* JADX WARN: Multi-variable type inference failed */
    protected dtyq(dtza dtzaVar) {
        this.e = dtzaVar;
        dtvs dtvsVar = new dtvs(dtzu.b(), dtzaVar, R());
        this.m = dtvsVar;
        this.f = ((dtub.a) ekhw.a(dtub.b, dtub.a.class)).fK();
        dtqv dtqvVar = (dtqv) dtub.c;
        this.g = dtqvVar.j;
        this.h = dtqvVar.h;
        ab(dtvsVar, new HashSet());
        this.l = W(dtzu.b());
        dtrj dtrjVar = (dtrj) dtzaVar;
        String g = g(dtrjVar.n);
        this.s = g;
        String g2 = g(dtrjVar.m);
        this.t = g2;
        this.u = g(dtrjVar.k);
        this.o = g(dtrjVar.a);
        if (!TextUtils.isEmpty(g) && !TextUtils.isEmpty(g2)) {
            this.n = g + ", " + g2;
        } else if (!TextUtils.isEmpty(g2)) {
            this.n = g2;
        } else {
            if (!TextUtils.isEmpty(g)) {
                throw new IllegalStateException("offset requires limit");
            }
            this.n = null;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        if (dtrjVar.p.isEmpty()) {
            sb.append(J(arrayList));
        } else {
            X(sb, J(arrayList));
        }
        if (!TextUtils.isEmpty(dtrjVar.j)) {
            sb.append(" ORDER BY ");
            sb.append(dtub.o(g(dtrjVar.j)));
        }
        dtui dtuiVar = dtrjVar.t;
        if (dtuiVar != null && !dtuiVar.c()) {
            String dtuiVar2 = dtuiVar.toString();
            dtuiVar2 = dtuiVar2.startsWith("+") ? dtuiVar2.substring(1) : dtuiVar2;
            sb.append("/* ");
            sb.append(dtuiVar2);
            sb.append(" */");
        }
        this.k = sb.toString();
        this.j = (String[]) arrayList.toArray(new String[0]);
        ArrayList arrayList2 = new ArrayList();
        this.i = arrayList2;
        engw engwVar = dtrjVar.f;
        engw engwVar2 = dtrjVar.r;
        if (engwVar != null) {
            arrayList2.addAll(engwVar);
        }
        int i = ((enou) engwVar2).c;
        for (int i2 = 0; i2 < i; i2++) {
            engw engwVar3 = ((dtrj) ((dtvn) engwVar2.get(i2)).a.e).f;
            if (engwVar3 != null) {
                arrayList2.addAll(engwVar3);
            }
        }
    }

    public static Object E(Supplier supplier) {
        Object obj;
        dtyp dtypVar = new dtyp();
        try {
            obj = supplier.get();
            dtypVar.close();
            return obj;
        } catch (Throwable th) {
            try {
                dtypVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    protected static final void X(StringBuilder sb, String str) {
        sb.append("SELECT * FROM (");
        sb.append(str);
        sb.append(")");
    }

    static String Z(String str) {
        return str.length() <= 25 ? str : str.substring(0, 25);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void aa(final dtvs dtvsVar, dtzu dtzuVar, List list) {
        engw c2 = this.m.c();
        int i = ((enou) c2).c;
        for (int i2 = 0; i2 < i; i2++) {
            dtvn dtvnVar = (dtvn) c2.get(i2);
            dtzuVar.c();
            if (!dtzuVar.e) {
                if (dtvsVar.b) {
                    Object apply = dtzuVar.a().apply(dtvnVar.a.o);
                    list.add("COUNT(" + ((String) apply) + ".rowid) AS " + dtvnVar.e + "_count");
                    Object apply2 = dtzuVar.a().apply(dtvnVar.a.o);
                    list.add("group_concat(quote(" + ((String) apply2) + ".rowid), '|') AS " + dtvnVar.e + "_rowid");
                } else {
                    list.add("1 AS " + dtvnVar.e + "_count");
                    Object apply3 = dtzuVar.a().apply(dtvnVar.a.o);
                    list.add(((String) apply3) + ".rowid AS " + dtvnVar.e + "_rowid");
                }
            }
            dtvnVar.h = list.size() - 2;
            list.addAll((Collection) Collection.EL.stream(dtvnVar.a.K(dtzuVar)).map(new Function() { // from class: dtxo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str = (String) obj;
                    ThreadLocal threadLocal = dtyq.a;
                    return dtvs.this.b ? a.a(str, "group_concat(quote(", "), '|')") : str;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).map(new Function() { // from class: dtxp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str = (String) obj;
                    return dtyq.this.U() ? dtub.n(str) : str;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new dtyd())));
            dtvnVar.a.aa(dtvsVar, dtzuVar, list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void ab(dtvs dtvsVar, Set set) {
        engw c2 = dtvsVar.c();
        int i = ((enou) c2).c;
        for (int i2 = 0; i2 < i; i2++) {
            dtvn dtvnVar = (dtvn) c2.get(i2);
            if (set.contains(dtvnVar.e)) {
                throw new IllegalArgumentException("duplicate tag: ".concat(String.valueOf(dtvnVar.e)));
            }
            set.add(dtvnVar.e);
            ab(dtvnVar.a.m, set);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ac(final dtzu dtzuVar, boolean z, final List list, StringBuilder sb) {
        String b2;
        if (z) {
            b2 = F(dtzuVar);
        } else {
            emww emwwVar = new emww(" AND ");
            dtza dtzaVar = this.e;
            b2 = emwwVar.b(enkr.g(((dtrj) dtzaVar).h, new emwl() { // from class: dtxm
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ThreadLocal threadLocal = dtyq.a;
                    return ((duap) obj).b(dtzu.this, list);
                }
            }));
        }
        dtzuVar.c();
        if (!b2.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(" AND ");
            }
            sb.append(b2);
        }
        engw c2 = this.m.c();
        int i = ((enou) c2).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((dtvn) c2.get(i2)).a.ac(dtzuVar, z, list, sb);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ad(dtzu dtzuVar, AtomicReference atomicReference) {
        if (!TextUtils.isEmpty(this.u) && !TextUtils.isEmpty(this.u) && atomicReference.getAndSet(dtvs.a(dtzuVar.b).apply(this.u)) != null) {
            throw new IllegalArgumentException("multiple group bys");
        }
        engw c2 = this.m.c();
        int i = ((enou) c2).c;
        for (int i2 = 0; i2 < i; i2++) {
            dtvn dtvnVar = (dtvn) c2.get(i2);
            dtzuVar.b++;
            dtvnVar.a.ad(dtzuVar, atomicReference);
        }
    }

    private final boolean ae(dtrs dtrsVar) {
        for (Pair pair : this.q) {
            if (pair.first == dtrsVar) {
                ((enrr) c.a(d).h("com/google/android/libraries/databaseannotations/support/QueryBase", "incrementExistingListener", 812, "QueryBase.java")).B("addChangeListener: %s %s (INCREMENT <<<<<<)", Z(((dtrj) this.e).a), dtrsVar.i);
                ((AtomicInteger) pair.second).incrementAndGet();
                return true;
            }
        }
        return false;
    }

    private static final Cursor af(dtve dtveVar, String str, String[] strArr, dtza dtzaVar) {
        return dtveVar.h(str, strArr, dtzaVar);
    }

    private final String g(String str) {
        enhk enhkVar;
        if (str == null || (enhkVar = ((dtrj) this.e).q) == null || enhkVar.isEmpty()) {
            return str;
        }
        Matcher matcher = b.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        do {
            String group = matcher.group(1);
            String str2 = (String) enhkVar.get(group);
            if (str2 == null && !enhkVar.containsKey(group)) {
                throw new IllegalStateException("no substitution for ".concat(String.valueOf(group)));
            }
            if (str2 == null) {
                str2 = "0";
            }
            matcher.appendReplacement(stringBuffer, str2);
        } while (matcher.find());
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List h(dtzu dtzuVar, List list, boolean z, List list2) {
        engw engwVar = ((dtrj) this.e).f;
        if (engwVar != null) {
            Context context = dtub.b;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            enqv it = engwVar.iterator();
            while (it.hasNext()) {
                arrayList.add(((dtzj) it.next()).ag(dtzuVar));
            }
            list = arrayList;
        }
        engw c2 = this.m.c();
        int i = ((enou) c2).c;
        for (int i2 = 0; i2 < i; i2++) {
            list = ((dtvn) c2.get(i2)).a.h(dtzuVar, list, z, list2);
        }
        return list;
    }

    public final ListenableFuture A(final Supplier supplier) {
        Object obj;
        elfl o = r().o();
        emwl emwlVar = new emwl() { // from class: dtye
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                Object obj3;
                ThreadLocal threadLocal = dtyq.a;
                obj3 = Supplier.this.get();
                return obj3;
            }
        };
        obj = this.h.get();
        return o.h(emwlVar, (Executor) obj);
    }

    public final ListenableFuture B() {
        return A(new Supplier() { // from class: dtyf
            @Override // java.util.function.Supplier
            public final Object get() {
                return Integer.valueOf(dtyq.this.i());
            }
        });
    }

    public final ListenableFuture C() {
        return A(new Supplier() { // from class: dtxn
            @Override // java.util.function.Supplier
            public final Object get() {
                return Boolean.valueOf(dtyq.this.T());
            }
        });
    }

    public final Stream D() {
        return q().cZ();
    }

    protected final String F(final dtzu dtzuVar) {
        return new emww(" AND ").b(enkr.g(((dtrj) this.e).h, new emwl() { // from class: dtya
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ThreadLocal threadLocal = dtyq.a;
                return ((duap) obj).a(dtzu.this);
            }
        }));
    }

    public final String G(dtzu dtzuVar, boolean z, List list) {
        return H(dtzuVar, z, list, engw.n(h(dtzuVar, Arrays.asList(W(dtzuVar)), z, list)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final String H(dtzu dtzuVar, boolean z, List list, engw engwVar) {
        StringBuilder sb = new StringBuilder();
        dtzuVar.b = 0;
        ac(dtzuVar, z, list, sb);
        int length = sb.length();
        if (!TextUtils.isEmpty(((dtrj) this.e).g)) {
            if (length != 0) {
                sb.append(" AND ");
            }
            sb.append("(");
            sb.append(((dtrj) this.e).g);
            sb.append(")");
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(e()));
        arrayList.add(this.o);
        int size = arrayList.size();
        dtzuVar.b = 0;
        arrayList.addAll(this.m.a);
        int size2 = arrayList.size();
        for (int i = 0; i < size2; i++) {
            String str = (String) arrayList.get(i);
            size--;
            if (size < 0) {
                dtzuVar.c();
            }
            if (!((dtrj) this.e).o.booleanValue() && this.f.containsKey(str)) {
                if (sb.length() != 0) {
                    sb.append(" AND ");
                }
                sb.append("(");
                sb.append(cgja.a().a(dtzuVar));
                sb.append(")");
            }
        }
        if (sb.length() == 0) {
            sb.append("1");
        }
        String g = g(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT ");
        if (((dtrj) this.e).b) {
            sb2.append("DISTINCT ");
        }
        new emww(",").i(sb2, engwVar);
        sb2.append(" FROM ");
        sb2.append(this.o);
        if (((dtrj) this.e).e != null) {
            sb2.append(" INDEXED BY ");
            sb2.append(((dtrj) this.e).e);
        }
        if (((dtrj) this.e).v != null) {
            sb2.append(" AS ");
            sb2.append(((dtrj) this.e).v);
        }
        sb2.append(" ");
        dtzuVar.b = 1;
        dtyo a2 = dtvs.a(0);
        dtvs dtvsVar = this.m;
        N(dtzuVar, sb2, a2, dtvsVar, dtvsVar.c());
        if (!TextUtils.isEmpty(g)) {
            sb2.append("WHERE ");
            sb2.append(g(g));
            sb2.append(" ");
        }
        dtzuVar.b = 0;
        AtomicReference atomicReference = new AtomicReference(null);
        ad(dtzuVar, atomicReference);
        String str2 = (String) atomicReference.get();
        sb2.append(str2 == null ? "" : a.a(str2, "GROUP BY ", " "));
        dtzj dtzjVar = ((dtrj) this.e).l;
        if (dtzjVar != null) {
            sb2.append("HAVING ");
            sb2.append(((dtzq) dtzjVar).ag(dtzuVar));
            sb2.append(" ");
        }
        dtzj dtzjVar2 = ((dtrj) this.e).i;
        String g2 = dtzjVar2 != null ? g(dtzjVar2.ag(dtzuVar)) : null;
        if (!TextUtils.isEmpty(g2)) {
            sb2.append("ORDER BY ");
            sb2.append(g2);
            sb2.append(" ");
        }
        if (!TextUtils.isEmpty(this.t)) {
            sb2.append("LIMIT ");
            sb2.append(this.t);
            sb2.append(" ");
        }
        String str3 = ((dtrj) this.e).n;
        if (!TextUtils.isEmpty(str3)) {
            sb2.append("OFFSET ");
            sb2.append(str3);
            sb2.append(" ");
        }
        engw engwVar2 = ((dtrj) this.e).p;
        if (!engwVar2.isEmpty()) {
            int length2 = this.l.length;
            String sb3 = sb2.toString();
            sb2.setLength(0);
            X(sb2, sb3);
            int i2 = ((enou) engwVar2).c;
            for (int i3 = 0; i3 < i2; i3++) {
                dtyq dtyqVar = (dtyq) engwVar2.get(i3);
                if (dtyqVar.W(dtzuVar).length != length2) {
                    throw new IllegalStateException("all queries in union must have the same size projection");
                }
                sb2.append(" UNION ");
                X(sb2, dtyqVar.G(dtzuVar, z, list));
            }
        }
        return sb2.toString().trim();
    }

    public final String I() {
        return G(new dtzu(this.m, this.e, false), true, null);
    }

    public final String J(List list) {
        return G(new dtzu(this.m, this.e, false), false, list);
    }

    final List K(dtzu dtzuVar) {
        dtza dtzaVar = this.e;
        final boolean U = U();
        dtrj dtrjVar = (dtrj) dtzaVar;
        if (dtrjVar.u) {
            return new ArrayList();
        }
        engw engwVar = dtrjVar.d;
        if (engwVar == null || engwVar.isEmpty()) {
            engwVar = ((dtrj) this.e).c;
        }
        Stream stream = Collection.EL.stream(engwVar);
        final int i = dtzuVar.b;
        return (List) stream.map(i == 0 ? new Function() { // from class: dtvo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (String) obj;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        } : new Function() { // from class: dtvp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return "JT_" + i + "_" + ((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: dtyc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str = (String) obj;
                ThreadLocal threadLocal = dtyq.a;
                return U ? dtub.n(str) : str;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new dtyd()));
    }

    public final void L(final dtrs dtrsVar) {
        Object obj;
        Object obj2;
        synchronized (dtub.a) {
            if (ae(dtrsVar)) {
                return;
            }
            ((enrr) c.a(d).h("com/google/android/libraries/databaseannotations/support/QueryBase", "addChangeListener", 771, "QueryBase.java")).B("addChangeListener: %s %s", Z(((dtrj) this.e).a), dtrsVar.i);
            this.q.add(Pair.create(dtrsVar, new AtomicInteger(1)));
            dtwg.b(this);
            if (dtrsVar.j != null) {
                Runnable runnable = new Runnable() { // from class: dtxu
                    @Override // java.lang.Runnable
                    public final void run() {
                        dtve r = dtyq.this.r();
                        dtui dtuiVar = new dtui("add-change-listener");
                        emyl emylVar = new emyl() { // from class: dtxz
                            @Override // defpackage.emyl
                            public final Object get() {
                                ThreadLocal threadLocal = dtyq.a;
                                return null;
                            }
                        };
                        dtvc c2 = dtvd.c();
                        c2.b(true);
                    }
                };
                obj = this.g.get();
                elfl g = elfl.g(erqt.l(runnable, (Executor) obj));
                emwl emwlVar = new emwl() { // from class: dtxv
                    @Override // defpackage.emwl
                    public final Object apply(Object obj3) {
                        dtrs dtrsVar2 = dtrsVar;
                        Consumer consumer = dtrsVar2.j;
                        if (consumer == null) {
                            return null;
                        }
                        consumer.o(Pair.create(dtyq.this, dtrsVar2));
                        return null;
                    }
                };
                obj2 = this.g.get();
                g.h(emwlVar, (Executor) obj2);
            }
        }
    }

    public final void M(lkk lkkVar, dtrs dtrsVar) {
        synchronized (dtub.a) {
            if (ae(dtrsVar)) {
                return;
            }
            ((enrr) c.a(d).h("com/google/android/libraries/databaseannotations/support/QueryBase", "addChangeListener", 842, "QueryBase.java")).B("addChangeListener: %s %s (LIFECYCLE)", Z(((dtrj) this.e).a), dtrsVar.i);
            this.q.add(Pair.create(dtrsVar, new AtomicInteger(0)));
            dtwg.a().i(this);
            if (lkkVar != null) {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new IllegalStateException("cannot add observable query with lifecycle from other than main thread");
                }
                lkkVar.c(new dtyj(this, dtrsVar));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void N(dtzu dtzuVar, StringBuilder sb, dtyo dtyoVar, dtvs dtvsVar, engw engwVar) {
        dtzu dtzuVar2 = dtzuVar;
        StringBuilder sb2 = sb;
        int i = 0;
        while (i < ((enou) engwVar).c) {
            dtvn dtvnVar = (dtvn) engwVar.get(i);
            String str = dtvnVar.a.o;
            dtyo a2 = dtvs.a(dtzuVar2.b);
            dtvsVar.e(dtvnVar.e);
            int i2 = dtvnVar.i;
            Context context = dtub.b;
            int i3 = i2 - 1;
            sb2.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? "JOIN" : "INNER JOIN" : "LEFT OUTER JOIN" : "LEFT JOIN");
            sb2.append(" ");
            sb2.append(str);
            sb2.append(" AS ");
            sb2.append((String) a2.apply(str));
            sb2.append(" ");
            dtry dtryVar = dtvnVar.b;
            Object obj = null;
            Object apply = dtryVar == null ? null : a2.apply(dtryVar.toString());
            dtry dtryVar2 = dtvnVar.c;
            if (dtryVar2 != null) {
                obj = dtyoVar.apply(dtryVar2.toString());
            }
            boolean z = (apply == null || obj == null) ? false : true;
            boolean z2 = dtvnVar.g != null;
            if (z || z2) {
                sb2.append("ON (");
            }
            if (z) {
                sb2.append("(");
                sb2.append((String) apply);
                sb2.append(" ");
                sb2.append(dtvnVar.d);
                sb2.append(" ");
                sb2.append((String) obj);
                sb2.append(")");
            }
            if (z2) {
                if (z) {
                    sb2.append(" AND ");
                }
                sb2.append("(");
                sb2.append(dtvnVar.g.a(dtzuVar2));
                sb2.append(") ");
            }
            if (z || z2) {
                sb2.append(") ");
            }
            dtzuVar2.c();
            N(dtzuVar2, sb2, a2, dtvsVar, dtvnVar.a.m.c());
            i++;
            dtzuVar2 = dtzuVar;
            sb2 = sb;
        }
    }

    public final void O() {
        if (this.l.length == 0 && this.i.isEmpty()) {
            throw new IllegalStateException("need at least one column in projection");
        }
    }

    public final void P(dtrs dtrsVar) {
        synchronized (dtub.a) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.q.size()) {
                    break;
                }
                Pair pair = (Pair) this.q.get(i);
                if (pair.first == dtrsVar && ((AtomicInteger) pair.second).decrementAndGet() == 0) {
                    this.q.remove(i);
                    z = true;
                    break;
                }
                i++;
            }
            ((enrr) c.a(d).h("com/google/android/libraries/databaseannotations/support/QueryBase", "removeChangeListener", 876, "QueryBase.java")).B("removeChangeListener: %s %s", Z(((dtrj) this.e).a), dtrsVar.i);
            if (z && this.q.isEmpty()) {
                dtwg.a().c(this);
            }
        }
    }

    protected final boolean Q(String str) {
        return m().c(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean R() {
        dtrj dtrjVar = (dtrj) this.e;
        if (dtrjVar.k != null) {
            return true;
        }
        engw engwVar = dtrjVar.r;
        if (engwVar != null) {
            int i = 0;
            while (i < ((enou) engwVar).c) {
                boolean R = ((dtvn) engwVar.get(i)).a.R();
                i++;
                if (R) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean S(List list) {
        int i;
        dtyl t = t();
        int i2 = 0;
        while (true) {
            engw engwVar = ((dtrj) this.e).h;
            if (i2 >= ((enou) engwVar).c) {
                return false;
            }
            duap duapVar = (duap) engwVar.get(i2);
            Iterator it = list.iterator();
            while (true) {
                i = i2 + 1;
                if (it.hasNext()) {
                    Iterator it2 = ((duap) it.next()).a.iterator();
                    while (it2.hasNext()) {
                        if (duapVar.d(t, (duaw) it2.next())) {
                            return true;
                        }
                    }
                }
            }
            i2 = i;
        }
    }

    public final boolean T() {
        ArrayList arrayList = new ArrayList();
        dtve r = r();
        String str = "SELECT EXISTS (" + J(arrayList) + ")";
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        dtri dtriVar = new dtri(this.e);
        dtriVar.v = new dtxh(this);
        Cursor af = af(r, str, strArr, dtriVar.a());
        try {
            if (!af.moveToFirst()) {
                throw new dtzd("got cursor with no rows");
            }
            boolean z = af.getInt(0) == 1;
            if (af != null) {
                af.close();
            }
            return z;
        } catch (Throwable th) {
            if (af != null) {
                try {
                    af.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final boolean U() {
        return ((dtrj) this.e).y;
    }

    public final boolean V() {
        ArrayList arrayList = new ArrayList();
        dtve r = r();
        String str = "SELECT EXISTS (" + J(arrayList) + ")";
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        dtri dtriVar = new dtri(this.e);
        dtriVar.v = new dtxh(this);
        Cursor af = af(r, str, strArr, dtriVar.a());
        try {
            if (!af.moveToFirst()) {
                throw new dtzd("got cursor with no rows which should be impossible");
            }
            boolean z = af.getInt(0) == 0;
            if (af != null) {
                af.close();
            }
            return z;
        } catch (Throwable th) {
            if (af != null) {
                try {
                    af.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final String[] W(dtzu dtzuVar) {
        dtzuVar.b = 0;
        List K = K(dtzuVar);
        dtzuVar.b = 0;
        aa(this.m, dtzuVar, K);
        String[] strArr = (String[]) K.toArray(new String[0]);
        if (!((dtrj) dtzuVar.c).y) {
            return strArr;
        }
        Context context = dtub.b;
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = dtub.n(strArr[i]);
        }
        return strArr2;
    }

    public final engw Y() {
        engw engwVar;
        dtrj dtrjVar = (dtrj) this.e;
        if (dtrjVar.u) {
            int i = engw.d;
            engwVar = enou.a;
        } else {
            engwVar = dtrjVar.d;
        }
        if (engwVar != null && !engwVar.isEmpty()) {
            return engwVar;
        }
        dtrj dtrjVar2 = (dtrj) this.e;
        return !dtrjVar2.u ? dtrjVar2.c : engwVar;
    }

    public abstract dtsu a(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar);

    @Override // defpackage.dtzj
    public final String ag(dtzu dtzuVar) {
        return "(" + I() + ")";
    }

    @Override // defpackage.dtzj
    public final String ah(dtzu dtzuVar, List list) {
        return "(" + J(list) + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dtzj
    public final void ai(dtse dtseVar) {
        dtza dtzaVar = this.e;
        dtyl t = t();
        dtrj dtrjVar = (dtrj) dtzaVar;
        engw engwVar = dtrjVar.d;
        if (engwVar == null) {
            engwVar = dtrjVar.u ? enou.a : dtrjVar.c;
        }
        int size = engwVar.size();
        for (int i = 0; i < size; i++) {
            dtseVar.b(t.a((String) engwVar.get(i)), this.o);
        }
        engw engwVar2 = ((dtrj) this.e).p;
        if (engwVar2 != null) {
            for (int i2 = 0; i2 < ((enou) engwVar2).c; i2++) {
                ((dtyq) engwVar2.get(i2)).ai(dtseVar);
            }
        }
        List list = this.i;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((dtzj) it.next()).ai(dtseVar);
            }
        }
        for (String str : d()) {
            String a2 = t.a(str);
            if (a2 != null) {
                str = a2;
            }
            dtseVar.b(str, this.o);
        }
        dtza dtzaVar2 = this.e;
        int i3 = 0;
        while (true) {
            engw engwVar3 = ((dtrj) dtzaVar2).h;
            if (i3 >= ((enou) engwVar3).c) {
                break;
            }
            ((duap) engwVar3.get(i3)).c(dtseVar);
            i3++;
        }
        engw c2 = this.m.c();
        int i4 = ((enou) c2).c;
        for (int i5 = 0; i5 < i4; i5++) {
            ((dtvn) c2.get(i5)).a.ai(dtseVar);
        }
    }

    protected abstract Map b();

    protected abstract boolean c();

    protected abstract String[] d();

    protected abstract String[] e();

    public final int i() {
        ArrayList arrayList = new ArrayList();
        dtve r = r();
        String str = "SELECT COUNT(*) FROM (" + J(arrayList) + ")";
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        dtri dtriVar = new dtri(this.e);
        dtriVar.v = new dtxh(this);
        Cursor af = af(r, str, strArr, dtriVar.a());
        try {
            if (!af.moveToFirst()) {
                throw new dtzd("got cursor with no rows");
            }
            int i = af.getInt(0);
            if (af != null) {
                af.close();
            }
            return i;
        } catch (Throwable th) {
            if (af != null) {
                try {
                    af.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final long j(dtry dtryVar, String str) {
        ArrayList arrayList = new ArrayList();
        String H = H(dtzu.b(), false, arrayList, engw.r(String.format(Locale.US, "%s(%s)", str, dtub.o(dtryVar.toString()))));
        dtve r = r();
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        dtri dtriVar = new dtri(this.e);
        dtriVar.v = new dtxh(this);
        Cursor af = af(r, H, strArr, dtriVar.a());
        try {
            if (!af.moveToFirst()) {
                throw new dtzd("got cursor with no rows");
            }
            long j = af.getLong(0);
            if (af != null) {
                af.close();
            }
            return j;
        } catch (Throwable th) {
            if (af != null) {
                try {
                    af.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final long k(dtry dtryVar) {
        return j(dtryVar, "MAX");
    }

    public final long l(dtry dtryVar) {
        return j(dtryVar, "MIN");
    }

    protected final dtse m() {
        if (this.p == null) {
            dtse dtseVar = new dtse();
            ai(dtseVar);
            this.p = dtseVar;
        }
        return this.p;
    }

    protected final dtse n() {
        if (this.v == null) {
            final dtse dtseVar = new dtse();
            Collection.EL.stream(((dtrj) this.e).h).forEach(new Consumer() { // from class: dtxl
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ThreadLocal threadLocal = dtyq.a;
                    ((duap) obj).c(dtse.this);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            this.v = dtseVar;
        }
        return this.v;
    }

    public final dtsu o() {
        dtsu q = q();
        this.r = null;
        return q;
    }

    public final dtsu p(dtry dtryVar) {
        O();
        String o = dtub.o(dtryVar.toString());
        if (!Arrays.asList(this.l).contains(dtryVar.toString())) {
            throw new IllegalArgumentException("cannot slice on column which is not part of the projection");
        }
        dtve r = r();
        String format = String.format(Locale.US, "SELECT %s FROM (%s)", o, this.k);
        String[] strArr = this.j;
        dtri dtriVar = new dtri(this.e);
        dtriVar.t = new dtui("queryForSingleColumn-", dtryVar.toString());
        dtriVar.v = new dtxh(this);
        return a(r, af(r, format, strArr, dtriVar.a()), new String[]{dtryVar.toString()}, (dtzj[]) this.i.toArray(new dtzj[0]), new dtyo() { // from class: dtxq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                String str = (String) obj;
                ThreadLocal threadLocal = dtyq.a;
                return str;
            }
        }, this.m);
    }

    public final dtsu q() {
        dtve r = r();
        O();
        dtri dtriVar = new dtri(this.e);
        dtriVar.v = new dtxh(this);
        dtsu a2 = a(r, af(r, this.k, this.j, dtriVar.a()), this.l, (dtzj[]) this.i.toArray(new dtzj[0]), new dtyo() { // from class: dtxy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                String str = (String) obj;
                ThreadLocal threadLocal = dtyq.a;
                return str;
            }
        }, this.m);
        dtvs dtvsVar = this.m;
        a2.dg(dtvsVar, dtvsVar.c(), R());
        return a2;
    }

    public final dtve r() {
        return dtub.e(((dtrj) this.e).x);
    }

    public final dtvy s(dtry dtryVar, dtry dtryVar2, duap duapVar) {
        dtvy i = dtvz.i(this, dtryVar, dtryVar2);
        ((dtrd) i).d = duapVar;
        return i;
    }

    protected final dtyl t() {
        return new dtyl(b());
    }

    public final dtzj u() {
        return new dtzq("SELECT COUNT(*) FROM ($R)", new Object[]{I()});
    }

    public final elfj v() {
        Object obj;
        erov erovVar = new erov() { // from class: dtxw
            @Override // defpackage.erov
            public final Object a(erpc erpcVar) {
                dtsu q = dtyq.this.q();
                erpcVar.a(q, erpp.a);
                return q;
            }
        };
        obj = this.h.get();
        return elfj.d(erovVar, (Executor) obj);
    }

    public final elfl w() {
        return elfl.g(A(new Supplier() { // from class: dtxj
            @Override // java.util.function.Supplier
            public final Object get() {
                return dtyq.this.y();
            }
        }));
    }

    public final engw x(emwl emwlVar) {
        dtsu o = o();
        try {
            engr d2 = engw.d(o.getCount());
            while (o.moveToNext()) {
                d2.h(emwlVar.apply(o));
            }
            engw g = d2.g();
            o.close();
            return g;
        } catch (Throwable th) {
            try {
                o.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final engw y() {
        return q().cW();
    }

    public final engw z(Supplier supplier) {
        return q().cY(supplier);
    }
}
