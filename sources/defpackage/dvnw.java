package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvnw implements dvmw {
    final String a = "user_experiments_store";
    private final dvna b;
    private final eafz c;

    public dvnw(dvna dvnaVar, eafz eafzVar) {
        this.b = dvnaVar;
        this.c = eafzVar;
    }

    public static efkn d(String str) {
        efko efkoVar = new efko();
        efkoVar.b("CREATE TABLE ");
        efkoVar.b(str);
        efkoVar.b(" (");
        efkoVar.b("account TEXT NOT NULL, ");
        efkoVar.b("key TEXT NOT NULL, ");
        efkoVar.b("message BLOB NOT NULL, ");
        efkoVar.b("windowStartTimestamp INTEGER NOT NULL, ");
        efkoVar.b("windowEndTimestamp INTEGER NOT NULL, ");
        efkoVar.b("PRIMARY KEY (account, key))");
        return efkoVar.a();
    }

    @Override // defpackage.dvmw
    public final ListenableFuture a(long j) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        sb.append("windowEndTimestamp < ?");
        arrayList.add(String.valueOf(j));
        final efkl a = efkm.a(this.a, sb, arrayList);
        this.c.b();
        return this.b.d.d(new efkq() { // from class: dvnu
            @Override // defpackage.efkq
            public final Object a(efks efksVar) {
                return Integer.valueOf(efksVar.a(efkl.this));
            }
        });
    }

    @Override // defpackage.dvmw
    public final ListenableFuture b() {
        efko efkoVar = new efko();
        efkoVar.b("SELECT * FROM ");
        efkoVar.b(this.a);
        efkn a = efkoVar.a();
        this.c.b();
        return this.b.d.a(a).e(new erow() { // from class: dvnt
            @Override // defpackage.erow
            public final Object a(erpc erpcVar, Object obj) {
                Cursor cursor = (Cursor) obj;
                HashSet hashSet = new HashSet();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(cursor.getColumnIndexOrThrow("account"));
                    if (true == string.equals("signedout")) {
                        string = null;
                    }
                    hashSet.add(dvpk.c(string, cursor.getString(cursor.getColumnIndexOrThrow("key")), ProtoParsers.g(cursor.getBlob(cursor.getColumnIndexOrThrow("message")), evtu.a), cursor.getLong(cursor.getColumnIndexOrThrow("windowStartTimestamp")), cursor.getLong(cursor.getColumnIndexOrThrow("windowEndTimestamp"))));
                }
                return hashSet;
            }
        }, erpp.a).g();
    }

    @Override // defpackage.dvmw
    public final ListenableFuture c(final Collection collection) {
        return this.b.d.e(new efkr() { // from class: dvnv
            @Override // defpackage.efkr
            public final void a(efks efksVar) {
                for (dvpk dvpkVar : collection) {
                    if (dvpkVar.b > dvpkVar.c) {
                        throw new dvmr();
                    }
                    ContentValues contentValues = new ContentValues(4);
                    String a = dvpkVar.a();
                    if (a == null) {
                        a = "signedout";
                    }
                    dvnw dvnwVar = dvnw.this;
                    contentValues.put("account", a);
                    contentValues.put("key", dvpkVar.b());
                    contentValues.put("message", dvpkVar.a.toByteArray());
                    contentValues.put("windowStartTimestamp", Long.valueOf(dvpkVar.b));
                    contentValues.put("windowEndTimestamp", Long.valueOf(dvpkVar.c));
                    if (efksVar.c(dvnwVar.a, contentValues, 5) == -1) {
                        throw new SQLException("Failed to put() to DB.");
                    }
                }
            }
        });
    }
}
