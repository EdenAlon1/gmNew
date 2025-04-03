package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caxr implements cavm {
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/datamodel/layer/SqliteExceptionPlugin");
    static final emyl a = cfvl.v(110154778);

    @Override // defpackage.cavm
    public final int e(Exception exc, int i, dtwd dtwdVar) {
        String message;
        if (((Boolean) ((cfup) a.get()).e()).booleanValue() && (exc instanceof SQLiteException) && !(exc instanceof SQLiteConstraintException) && (message = exc.getMessage()) != null && !message.equals("Test Exception")) {
            if (exc instanceof SQLiteBlobTooBigException) {
                dtrg dtrgVar = (dtrg) dtwdVar;
                dtve dtveVar = dtrgVar.c;
                dtyq dtyqVar = dtrgVar.i;
                Context context = dtub.b;
                if (dtyqVar == null) {
                    Log.e("d26r", "in computeAndPrintIndividualProjectionsLengths sourceQuery is null");
                } else {
                    ArrayList arrayList = new ArrayList();
                    final ArrayList arrayList2 = new ArrayList();
                    dtri dtriVar = new dtri(dtyqVar.e);
                    dtriVar.h(true);
                    dtza a2 = dtriVar.a();
                    String G = dtyqVar.G(new dtzu(dtyqVar.m, a2, false), false, arrayList);
                    DesugarArrays.stream(dtyqVar.W(new dtzu(dtyqVar.m, a2))).forEachOrdered(new Consumer() { // from class: dttn
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            Context context2 = dtub.b;
                            arrayList2.add((String) obj);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    String format = String.format(Locale.US, "/*EXEMPT-FROM-QUERY-PLAN-CHECK*/ SELECT %s FROM (%s)", (String) Collection.EL.stream(arrayList2).map(new Function() { // from class: dtto
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            int lastIndexOf;
                            String str = (String) obj;
                            Context context2 = dtub.b;
                            int indexOf = str.indexOf(" AS ");
                            return indexOf >= 0 ? str.substring(indexOf + 4) : (str.contains("group_concat") || (lastIndexOf = str.lastIndexOf(".")) == -1) ? str : str.substring(lastIndexOf + 1);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).map(new Function() { // from class: dttp
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            Context context2 = dtub.b;
                            return String.format(Locale.US, "length(CAST(%s AS BLOB))", (String) obj);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.joining(",")), G);
                    if (format == null) {
                        Log.e("d26r", "in computeAndPrintIndividualProjectionsLengths sql is null");
                    } else {
                        StringBuilder sb = new StringBuilder();
                        String[] strArr = (String[]) arrayList.toArray(new String[0]);
                        dtyz B = dtza.B();
                        ((dtri) B).t = new dtui("setQueryForColumnSizes");
                        B.h(true);
                        Cursor h = dtveVar.h(format, strArr, B.a());
                        while (h.moveToNext()) {
                            try {
                                int i2 = 0;
                                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                                    int i4 = h.isNull(i3) ? 1 : h.getInt(i3);
                                    i2 += i4;
                                    sb.append((String) arrayList2.get(i3));
                                    sb.append(" = ");
                                    sb.append(i4);
                                    sb.append("\n");
                                }
                                Log.e("d26r", "row " + h.getPosition() + "; size (approx) = " + i2 + "; column sizes { " + sb.toString() + "}");
                            } catch (Throwable th) {
                                if (h != null) {
                                    try {
                                        h.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        }
                        if (h != null) {
                            h.close();
                        }
                    }
                }
            } else {
                dtwdVar.o();
                String a3 = dtwdVar.o().a();
                if (!message.contains("no such column: participants.comparable_destination")) {
                    ensk i5 = b.i();
                    i5.Y(ente.a, "BugleDatabase");
                    ((enrr) ((enrr) i5).h("com/google/android/apps/messaging/shared/datamodel/layer/SqliteExceptionPlugin", "handleException", 100, "SqliteExceptionPlugin.java")).J("got SQLiteException (%s) for sql: %s; exception message is %s", exc.getClass().getName(), a3, message);
                }
            }
        }
        return 1;
    }

    @Override // defpackage.cavm
    public final Closeable l(dtwd dtwdVar) {
        return null;
    }

    @Override // defpackage.cavm
    public final boolean n() {
        return ((Boolean) ((cfup) a.get()).e()).booleanValue();
    }

    @Override // defpackage.cavm
    public final /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.cavm
    public final /* synthetic */ Cursor a(Cursor cursor, dtwd dtwdVar) {
        return cursor;
    }
}
