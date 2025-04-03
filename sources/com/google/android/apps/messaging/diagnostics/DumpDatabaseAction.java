package com.google.android.apps.messaging.diagnostics;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.Toast;
import com.google.android.apps.messaging.diagnostics.DumpDatabaseAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.aceo;
import defpackage.aceq;
import defpackage.acer;
import defpackage.aslx;
import defpackage.cflz;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.csrl;
import defpackage.csrv;
import defpackage.dtqy;
import defpackage.dtry;
import defpackage.dtve;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.enru;
import defpackage.eogt;
import defpackage.ffbr;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DumpDatabaseAction extends Action<Uri> implements Parcelable {
    public final aceq a;
    private final Context c;
    private final ffbr d;
    private final Map e;
    private final boolean f;
    private static final cskc b = cskc.g("BugleDataModel", "DumpDatabaseAction");
    public static final Parcelable.Creator<Action<Uri>> CREATOR = new aceo();

    /* compiled from: PG */
    public interface a {
        acer E();
    }

    public DumpDatabaseAction(Context context, ffbr ffbrVar, Map map, Parcel parcel) {
        super(parcel, eogt.DUMP_DATABASE_ACTION);
        boolean readBoolean;
        this.c = context;
        this.d = ffbrVar;
        this.e = map;
        if (!aslx.a()) {
            readBoolean = parcel.readBoolean();
            this.f = readBoolean;
            this.a = aceq.REDACTED;
        } else {
            String readString = parcel.readString();
            readString.getClass();
            aceq aceqVar = aceq.REDACTED;
            aceq aceqVar2 = (aceq) Enum.valueOf(aceq.class, readString);
            this.a = aceqVar2;
            this.f = aceqVar2 != aceq.NOT_REDACTED;
        }
    }

    private final File h(Context context, String str) {
        int i;
        BufferedOutputStream bufferedOutputStream;
        File databasePath = context.getDatabasePath("bugle_db".concat(str));
        long j = 0;
        if (databasePath.exists() && databasePath.isFile()) {
            j = databasePath.length();
        }
        boolean z = this.f;
        StringBuilder sb = new StringBuilder("db_copy");
        sb.append(true != z ? "" : "_redacted");
        sb.append(str);
        File e = cflz.e(context, sb.toString());
        int i2 = 0;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(e));
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(databasePath));
                    try {
                        byte[] bArr = new byte[16384];
                        i = 0;
                        while (true) {
                            try {
                                int read = bufferedInputStream.read(bArr);
                                if (read <= 0) {
                                    try {
                                        break;
                                    } catch (Throwable th) {
                                        th = th;
                                        i2 = i;
                                        try {
                                            bufferedOutputStream.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                }
                                bufferedOutputStream.write(bArr, 0, read);
                                i += read;
                            } catch (Throwable th3) {
                                th = th3;
                                i2 = i;
                                try {
                                    bufferedInputStream.close();
                                } catch (Throwable th4) {
                                    th.addSuppressed(th4);
                                }
                                throw th;
                            }
                        }
                        bufferedInputStream.close();
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            bufferedOutputStream.close();
        } catch (IOException e3) {
            e = e3;
            i2 = i;
            csjb e4 = b.e();
            e4.I("Exception copying database file:");
            e4.I("bugle_db");
            e4.v(str);
            e4.v("; destination may not be complete.");
            e4.s(e);
            i = i2;
            enru enruVar = csrv.a;
            csrl.a(e);
            csjb c = b.c();
            c.I("Dump complete.");
            c.z("originalSize", j);
            c.y("copy size", i);
            c.r();
            return e;
        } catch (Throwable th8) {
            th = th8;
            i2 = i;
            enru enruVar2 = csrv.a;
            csrl.a(e);
            csjb c2 = b.c();
            c2.I("Dump complete.");
            c2.z("originalSize", j);
            c2.y("copy size", i2);
            c2.r();
            throw th;
        }
        enru enruVar3 = csrv.a;
        csrl.a(e);
        csjb c3 = b.c();
        c3.I("Dump complete.");
        c3.z("originalSize", j);
        c3.y("copy size", i);
        c3.r();
        return e;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("DumpDatabaseAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        Cursor g = ((dtve) this.d.b()).g("pragma wal_checkpoint(TRUNCATE)", null);
        try {
            g.moveToFirst();
            csjb c = b.c();
            c.B("checkpointed", g.getLong(0) == 0);
            c.z("pages written", g.getLong(2));
            c.r();
            if (g != null) {
                g.close();
            }
            File h = h(this.c, "");
            h(this.c, "-wal");
            if (this.f) {
                SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(h.getAbsolutePath(), null, 0);
                try {
                    Cursor rawQuery = openDatabase.rawQuery("PRAGMA secure_delete=1", null);
                    try {
                        if (!rawQuery.moveToFirst()) {
                            Toast.makeText(this.c, "unable to set secure_delete -- failing", 1).show();
                        }
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                        String str = ((dtqy) ((dtve) this.d.b()).l()).b;
                        for (Map.Entry entry : this.e.entrySet()) {
                            String str2 = (String) entry.getKey();
                            if (str2.startsWith(defpackage.a.v(str, "+"))) {
                                String substring = str2.substring(str2.indexOf("+") + 1);
                                if (substring.equals("sqlite_master")) {
                                    continue;
                                } else {
                                    String str3 = (String) DesugarArrays.stream((dtry[]) entry.getValue()).filter(new Predicate() { // from class: acek
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
                                            dtry dtryVar = (dtry) obj;
                                            Parcelable.Creator<Action<Uri>> creator = DumpDatabaseAction.CREATOR;
                                            return (((dtqt) dtryVar.a).e || dtryVar.g()) ? false : true;
                                        }
                                    }).filter(new Predicate() { // from class: acel
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
                                            Boolean bool;
                                            dtry dtryVar = (dtry) obj;
                                            int i = ((dtqt) dtryVar.a).j - 1;
                                            if (i == 0 || i == 1 || i == 2 || i == 5) {
                                                return false;
                                            }
                                            if (!aslx.a()) {
                                                return true;
                                            }
                                            aceq aceqVar = DumpDatabaseAction.this.a;
                                            int ordinal = aceqVar.ordinal();
                                            if (ordinal == 0) {
                                                bool = true;
                                            } else if (ordinal != 1) {
                                                engw engwVar = (engw) aceqVar.d.get(dtryVar.e());
                                                bool = Boolean.valueOf(engwVar == null || !engwVar.contains(dtryVar.d()));
                                            } else {
                                                bool = false;
                                            }
                                            return bool.booleanValue();
                                        }
                                    }).filter(new Predicate() { // from class: acem
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
                                            Parcelable.Creator<Action<Uri>> creator = DumpDatabaseAction.CREATOR;
                                            return ((dtry) obj).d() != null;
                                        }
                                    }).map(new Function() { // from class: acen
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            dtry dtryVar = (dtry) obj;
                                            Parcelable.Creator<Action<Uri>> creator = DumpDatabaseAction.CREATOR;
                                            String d = dtryVar.d();
                                            String substring2 = d == null ? null : d.substring(d.indexOf(".") + 1);
                                            return String.valueOf(substring2).concat(String.valueOf(String.format(Locale.ROOT, " = CASE (%s) WHEN (%s ISNULL) THEN NULL ELSE %s END", substring2, substring2, (dtryVar.h() || ((dtqt) dtryVar.a).d) ? String.format(Locale.ROOT, "('RED: ' || random() || ':' || length(%s))", substring2) : String.format(Locale.ROOT, "('RED: ' || length(%s))", substring2))));
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }).collect(Collectors.joining(","));
                                    if (str3.isEmpty()) {
                                        continue;
                                    } else {
                                        try {
                                            openDatabase.execSQL(String.format(Locale.ROOT, "UPDATE %s SET %s", substring, str3));
                                        } finally {
                                        }
                                    }
                                }
                            }
                        }
                        if (openDatabase != null) {
                            openDatabase.close();
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    if (openDatabase != null) {
                        try {
                            openDatabase.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            return cflz.d(this.c, h.getName());
        } catch (Throwable th3) {
            if (g != null) {
                try {
                    g.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.DumpDatabase.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
        if (aslx.a()) {
            parcel.writeString(this.a.name());
        } else {
            parcel.writeBoolean(this.f);
        }
    }

    public DumpDatabaseAction(Context context, ffbr ffbrVar, Map map, aceq aceqVar) {
        super(eogt.DUMP_DATABASE_ACTION);
        this.c = context;
        this.d = ffbrVar;
        this.e = map;
        this.a = aceqVar;
        this.f = aceqVar != aceq.NOT_REDACTED;
    }

    public DumpDatabaseAction(Context context, ffbr ffbrVar, Map map, boolean z) {
        super(eogt.DUMP_DATABASE_ACTION);
        this.c = context;
        this.d = ffbrVar;
        this.e = map;
        this.f = z;
        this.a = aceq.REDACTED;
    }
}
