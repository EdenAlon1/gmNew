package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.io.Closeable;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cawr implements cavm {
    private final Set e;
    private engr f;
    private static final enru d = enru.c("com/google/android/apps/messaging/shared/datamodel/layer/QueryPlanCheckerPlugin");
    public static final cfup a = cfvl.n(cfvl.b, "QueryPlanCheckerPlugin_enabled", true);
    static final engw b = engw.z("DELETE FROM conversations", "DELETE FROM events", "DELETE FROM generic_worker_queue", "DELETE FROM participants", "DELETE FROM p2p_conversation_suggestion_event", "DELETE FROM remote_user_id_to_registration_id WHERE 1", "DELETE FROM user_references WHERE ((SELECT EXISTS (SELECT messages._id FROM messages WHERE ((messages._id = user_references.message_id) AND ((messages.message_status = ", "UPDATE messages SET raw_status=10001,message_status=8 WHERE ((messages.message_status = ?) AND (messages._id IN (SELECT parts.message_id FROM parts WHERE (parts.processing_status NOT IN (0,3)))))", "UPDATE generic_worker_queue SET retry_count=4 WHERE ((generic_worker_queue.worker_type IN (32,64,128)) AND (generic_worker_queue");
    static final engw c = engw.w(Pattern.compile("INSERT INTO participants .*", 32), Pattern.compile(".*\\(participants\\.color_type \\<\\> 0\\).*"), Pattern.compile(".*\\(participants\\._id IN \\(SELECT.*"), Pattern.compile(".*\\(participants\\.sub_id = -2\\)"), Pattern.compile("UPDATE participants SET .* WHERE .*"), Pattern.compile(".*PHONE_NUMBERS_EQUAL.*"));

    public cawr(Set set) {
        int i = engw.d;
        this.f = new engr();
        this.e = set;
    }

    @Override // defpackage.cavm
    public final /* synthetic */ int e(Exception exc, int i, dtwd dtwdVar) {
        return 1;
    }

    public final void f(dtwd dtwdVar, Throwable th) {
        dtzh o = dtwdVar.o();
        final String a2 = o.a();
        String[] strArr = (String[]) Collection.EL.stream(o.b()).toArray(new IntFunction() { // from class: cawn
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                cfup cfupVar = cawr.a;
                return new String[i];
            }
        });
        if (a2 == null || a2.startsWith("EXPLAIN ")) {
            return;
        }
        if (strArr == null) {
            strArr = new String[0];
        }
        try {
            dtul d2 = dtub.d(((cauy) ((dtrg) dtwdVar).c).k(), a2, strArr, this.e);
            if (d2.b && !a2.startsWith("/*EXEMPT-FROM-QUERY-PLAN-CHECK*/") && Collection.EL.stream(c).noneMatch(new Predicate() { // from class: cawo
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
                    cfup cfupVar = cawr.a;
                    return ((Pattern) obj).matcher(a2).matches();
                }
            }) && Collection.EL.stream(b).noneMatch(new Predicate() { // from class: cawp
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
                    return a2.contains((String) obj);
                }
            })) {
                String str = "query plan with warnings for " + ((dtrg) dtwdVar).a.toString() + "\n" + a2 + "\nsdk " + Build.VERSION.SDK_INT + "\nsqlite version " + dtub.l(((cauy) ((dtrg) dtwdVar).c).k()) + "\n" + d2.a + "\n" + ((String) DesugarArrays.stream(th.getStackTrace()).map(new Function() { // from class: cawq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cfup cfupVar = cawr.a;
                        return ((StackTraceElement) obj).toString();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.joining("\n")));
                ensk j = d.j();
                j.Y(ente.a, "Bugle");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/layer/QueryPlanCheckerPlugin", "checkQueryPlan", 232, "QueryPlanCheckerPlugin.java")).t("%s", str);
                throw new IllegalStateException(str);
            }
        } catch (SQLiteException e) {
            ensk g = d.g();
            g.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) g).g(e)).h("com/google/android/apps/messaging/shared/datamodel/layer/QueryPlanCheckerPlugin", "checkQueryPlan", 244, "QueryPlanCheckerPlugin.java")).t("got SQLiteException evaluating query plan: %s", a2);
        }
    }

    @Override // defpackage.cavm
    public final Closeable l(final dtwd dtwdVar) {
        if (!((Boolean) a.e()).booleanValue()) {
            return null;
        }
        dtrg dtrgVar = (dtrg) dtwdVar;
        if (dtrgVar.d) {
            return null;
        }
        int ordinal = dtrgVar.b.ordinal();
        if (ordinal != 0) {
            if (ordinal == 8) {
                final engw g = this.f.g();
                int i = engw.d;
                this.f = new engr();
                return new Closeable() { // from class: cawk
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        cfup cfupVar = cawr.a;
                        int i2 = 0;
                        while (true) {
                            engw engwVar = engw.this;
                            if (i2 >= ((enou) engwVar).c) {
                                return;
                            }
                            ((Runnable) engwVar.get(i2)).run();
                            i2++;
                        }
                    }
                };
            }
            if (ordinal != 3 && ordinal != 4 && ordinal != 5) {
                return null;
            }
        }
        final IllegalStateException illegalStateException = new IllegalStateException();
        Runnable runnable = new Runnable() { // from class: cawl
            @Override // java.lang.Runnable
            public final void run() {
                cawr.this.f(dtwdVar, illegalStateException);
            }
        };
        if (((cauy) dtrgVar.c).k().inTransaction()) {
            this.f.h(new Runnable() { // from class: cawm
                @Override // java.lang.Runnable
                public final void run() {
                    cawr.this.f(dtwdVar, illegalStateException);
                }
            });
            return null;
        }
        runnable.run();
        return null;
    }

    @Override // defpackage.cavm
    public final void m(SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) a.e()).booleanValue()) {
            ekzz f = eleg.f("QueryPlanCheckerPlugin#initialize");
            try {
                sQLiteDatabase.execSQL("PRAGMA automatic_index = 0;");
                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT count(*) FROM sqlite_master WHERE name = 'sqlite_stat1'", null);
                try {
                    if (rawQuery.moveToFirst() && rawQuery.getInt(0) == 0) {
                        sQLiteDatabase.execSQL("ANALYZE");
                        sQLiteDatabase.execSQL("DELETE FROM sqlite_stat1");
                    }
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM sqlite_master", null);
                    while (rawQuery.moveToNext()) {
                        try {
                            String string = rawQuery.getString(0);
                            if (string.hashCode() == 100346066 && string.equals("index")) {
                                String string2 = rawQuery.getString(2);
                                if (!string2.startsWith("sqlite")) {
                                    String string3 = rawQuery.getString(1);
                                    Context context = dtub.b;
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("tbl", string2);
                                    contentValues.put("idx", string3);
                                    contentValues.put("stat", (Integer) 10000);
                                    sQLiteDatabase.insertOrThrow("sqlite_stat1", null, contentValues);
                                }
                            }
                        } finally {
                        }
                    }
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS foo_for_testing");
                    sQLiteDatabase.execSQL("CREATE TABLE foo_for_testing (foo, bar)");
                    sQLiteDatabase.execSQL("ANALYZE foo_for_testing");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS foo_for_testing");
                    f.close();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.cavm
    public final boolean n() {
        return cavl.a();
    }

    @Override // defpackage.cavm
    public final /* synthetic */ Cursor a(Cursor cursor, dtwd dtwdVar) {
        return cursor;
    }
}
