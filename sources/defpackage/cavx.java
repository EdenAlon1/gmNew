package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cavx implements cavm, cfzm {
    public static final cfva a = cfvl.e(cfvl.b, "d26r_max_history_length", 1);
    public final Set b;
    private final errl e;
    public final Object d = new Object();
    public enev c = new enev(((Integer) a.e()).intValue());

    public cavx(errl errlVar, Set set) {
        this.e = errlVar;
        this.b = set;
    }

    public static String f(AtomicLong atomicLong) {
        long j = atomicLong.get();
        return j == -1 ? "null" : String.valueOf(j);
    }

    public static void g(StringBuilder sb, String str, String str2) {
        sb.append("  ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        sb.append("\n");
    }

    @Override // defpackage.cfzm
    public final elfl b() {
        return elfo.g(new Callable() { // from class: cavv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list;
                String concat;
                final cavx cavxVar = cavx.this;
                synchronized (cavxVar.d) {
                    list = (List) Collection.EL.stream(cavxVar.c).collect(Collectors.toCollection(new Supplier() { // from class: cavu
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new ArrayList();
                        }
                    }));
                }
                Collections.reverse(list);
                String str = String.format(Locale.US, "D26r history of %d items", Integer.valueOf(list.size())) + "tag=logging tag; op=operation category; tid=thread id; inflt=is inflight; et=elapsed time millis; tt=thread time millis; rows=row count returned; plan=query plan\n" + ((String) Collection.EL.stream(list).map(new Function() { // from class: cavt
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        dtzh o;
                        String a2;
                        String str2;
                        dtwd dtwdVar = (dtwd) obj;
                        StringBuilder sb = new StringBuilder();
                        sb.append("D26rHistoryItem:\n");
                        cavx.g(sb, "tag", dtwdVar.b().toString());
                        cavx.g(sb, "op", dtwdVar.d().toString());
                        cavx.g(sb, "tid", String.valueOf(Thread.currentThread().getId()));
                        cavx.g(sb, "inflt", dtwdVar.i().toString());
                        cavx.g(sb, "et", cavx.f(dtwdVar.k()));
                        cavx.g(sb, "tt", cavx.f(dtwdVar.l()));
                        cavx.g(sb, "rows", String.valueOf(dtwdVar.j().get()));
                        if ((dtwdVar.l().get() > 100 || dtwdVar.k().get() > 100) && (a2 = (o = dtwdVar.o()).a()) != null) {
                            str2 = dtub.d(((cauy) dtwdVar.c()).k(), a2, (String[]) o.b().toArray(new String[0]), cavx.this.b).a;
                        } else {
                            str2 = "not computed";
                        }
                        cavx.g(sb, "plan", str2);
                        return sb.toString();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.joining("\n")));
                try {
                    String[] strArr = bxyw.a;
                    bxyt bxytVar = new bxyt(bxyw.a);
                    bxytVar.z("getStat1Table");
                    bxytVar.r();
                    concat = (String) Collection.EL.stream(bxytVar.b().y()).map(new Function() { // from class: cavw
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bxxz bxxzVar = (bxxz) obj;
                            return String.format(Locale.US, "SqliteStat1 [tbl: %s, idx: %s, stat: %s]", String.valueOf(bxxzVar.a), String.valueOf(bxxzVar.b), String.valueOf(bxxzVar.c));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.joining("\n"));
                } catch (Throwable th) {
                    concat = "unable to read sqlite_stat1 table: ".concat(String.valueOf(th.getClass().getSimpleName()));
                }
                return a.w(concat, str, "\n");
            }
        }, this.e);
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl c() {
        return cfzj.c();
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl d() {
        return cfzj.d();
    }

    @Override // defpackage.cavm
    public final /* synthetic */ int e(Exception exc, int i, dtwd dtwdVar) {
        return 1;
    }

    @Override // defpackage.cavm
    public final Closeable l(dtwd dtwdVar) {
        if (((dtrg) dtwdVar).b.ordinal() == 1) {
            return null;
        }
        synchronized (this.d) {
            this.c.add(dtwdVar);
        }
        return null;
    }

    @Override // defpackage.cavm
    public final void m(SQLiteDatabase sQLiteDatabase) {
        this.c = new enev(((Integer) a.e()).intValue());
    }

    @Override // defpackage.cavm
    public final boolean n() {
        return true;
    }

    @Override // defpackage.cavm
    public final /* synthetic */ Cursor a(Cursor cursor, dtwd dtwdVar) {
        return cursor;
    }
}
