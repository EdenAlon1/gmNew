package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvns implements dvmt {
    public final ffbr a;
    final String b;
    final String c;
    private final dvna d;

    public dvns(dvna dvnaVar, ffbr ffbrVar) {
        this.d = dvnaVar;
        this.b = "capped_promos";
        this.a = ffbrVar;
        this.c = "noaccount";
    }

    public static efkn f(String str) {
        efko efkoVar = new efko();
        efkoVar.b("CREATE TABLE ");
        efkoVar.b(str);
        efkoVar.b(" (");
        efkoVar.b("account TEXT NOT NULL,");
        efkoVar.b("key TEXT NOT NULL,");
        efkoVar.b("value BLOB NOT NULL,");
        efkoVar.b(" PRIMARY KEY (account, key))");
        return efkoVar.a();
    }

    @Override // defpackage.dvmt
    public final ListenableFuture a() {
        return this.d.d.d(new efkq() { // from class: dvnn
            @Override // defpackage.efkq
            public final Object a(efks efksVar) {
                dvns dvnsVar = dvns.this;
                return Integer.valueOf(efksVar.b(dvnsVar.b, "account = ?", dvnsVar.c));
            }
        });
    }

    @Override // defpackage.dvmt
    public final ListenableFuture b(final Map map) {
        return this.d.d.d(new efkq() { // from class: dvno
            @Override // defpackage.efkq
            public final Object a(efks efksVar) {
                dvns dvnsVar = dvns.this;
                Integer valueOf = Integer.valueOf(efksVar.b(dvnsVar.b, "account = ?", dvnsVar.c));
                for (Map.Entry entry : map.entrySet()) {
                    ContentValues contentValues = new ContentValues(3);
                    contentValues.put("account", dvnsVar.c);
                    contentValues.put("key", (String) entry.getKey());
                    contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, ((eyhs) entry.getValue()).toByteArray());
                    if (efksVar.c(dvnsVar.b, contentValues, 5) == -1) {
                        throw new SQLException("Failed to clearAndPutAll() to DB.");
                    }
                }
                return valueOf;
            }
        });
    }

    @Override // defpackage.dvmt
    public final ListenableFuture c() {
        efko efkoVar = new efko();
        efkoVar.b("SELECT key, value");
        efkoVar.b(" FROM ");
        efkoVar.b(this.b);
        efkoVar.b(" WHERE account = ?");
        efkoVar.d(this.c);
        return this.d.d.a(efkoVar.a()).e(eldl.g(new erow() { // from class: dvnr
            @Override // defpackage.erow
            public final Object a(erpc erpcVar, Object obj) {
                Cursor cursor = (Cursor) obj;
                HashMap h = ennc.h(cursor.getCount());
                while (cursor.moveToNext()) {
                    h.put(cursor.getString(cursor.getColumnIndexOrThrow("key")), ProtoParsers.g(cursor.getBlob(cursor.getColumnIndexOrThrow(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE)), (eyhs) dvns.this.a.b()));
                }
                return h;
            }
        }), erpp.a).g();
    }

    @Override // defpackage.dvmt
    public final ListenableFuture d(final String str, final eyhs eyhsVar) {
        return this.d.d.e(new efkr() { // from class: dvnq
            @Override // defpackage.efkr
            public final void a(efks efksVar) {
                ContentValues contentValues = new ContentValues(3);
                dvns dvnsVar = dvns.this;
                contentValues.put("account", dvnsVar.c);
                contentValues.put("key", str);
                contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, eyhsVar.toByteArray());
                if (efksVar.c(dvnsVar.b, contentValues, 5) == -1) {
                    throw new SQLException("Failed to put() to DB.");
                }
            }
        });
    }

    @Override // defpackage.dvmt
    public final ListenableFuture e(final String str) {
        return this.d.d.e(new efkr() { // from class: dvnp
            @Override // defpackage.efkr
            public final void a(efks efksVar) {
                dvns dvnsVar = dvns.this;
                efksVar.b(dvnsVar.b, "(account = ? AND key = ?)", dvnsVar.c, str);
            }
        });
    }

    public dvns(dvna dvnaVar, String str, easy easyVar, ffbr ffbrVar) {
        this.d = dvnaVar;
        this.b = str;
        this.a = ffbrVar;
        this.c = !easyVar.b() ? easyVar.a() : "signedout";
    }
}
