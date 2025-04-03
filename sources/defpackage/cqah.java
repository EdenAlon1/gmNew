package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.Telephony;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqah implements cqad {
    public Cursor a;
    public Cursor b;
    public couz c;
    public couz d;
    private final int e;
    private final cove f;

    public cqah(Context context, albq albqVar, cove coveVar, coxk coxkVar, String str, String str2, int i) {
        this.e = i;
        this.a = null;
        this.b = null;
        this.f = coveVar;
        try {
            csjb d = cqai.a.d();
            d.I("Querying for remote SMS.");
            d.A("smsSelection", str);
            d.r();
            akzw b = albqVar.b("Bugle.Telephony.Query.Sms.Sync.Latency");
            Cursor query = context.getContentResolver().query(Telephony.Sms.CONTENT_URI, covb.h(coxkVar), str, null, "date DESC");
            this.a = query;
            azyd.l(query);
            b.c();
            if (this.a == null) {
                cqai.a.r("Remote SMS query returned null cursor; need to cancel sync");
                throw new RuntimeException("Null cursor from remote SMS query");
            }
            csjb d2 = cqai.a.d();
            d2.I("Querying for remote MMS.");
            d2.A("mmsSelection", str2);
            d2.r();
            akzw b2 = albqVar.b("Bugle.Telephony.Query.Mms.Sync.Latency");
            Cursor query2 = context.getContentResolver().query(Telephony.Mms.CONTENT_URI, coux.n(), str2, null, "date DESC");
            this.b = query2;
            azyd.l(query2);
            b2.c();
            if (this.b == null) {
                cqai.a.r("Remote MMS query returned null cursor; need to cancel sync");
                throw new RuntimeException("Null cursor from remote MMS query");
            }
            this.c = b();
            this.d = a();
        } catch (SQLiteException e) {
            csjb b3 = cqai.a.b();
            b3.I("failed to query remote messages");
            b3.s(e);
            throw e;
        }
    }

    public final couz a() {
        Cursor cursor = this.b;
        if (cursor == null || !cursor.moveToNext()) {
            return null;
        }
        return coux.g(this.b, this.e);
    }

    public final couz b() {
        Cursor cursor = this.a;
        if (cursor == null || !cursor.moveToNext()) {
            return null;
        }
        covb a = this.f.a();
        a.g(this.a, this.e);
        return a;
    }
}
