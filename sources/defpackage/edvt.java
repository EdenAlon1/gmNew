package defpackage;

import android.content.ContentValues;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edvt {
    static ContentValues a(edvr edvrVar, int i) {
        ContentValues contentValues = new ContentValues();
        eduh eduhVar = (eduh) edvrVar;
        contentValues.put("customer_id", Long.valueOf(eduhVar.a));
        contentValues.put("project_id", Long.valueOf(eduhVar.b));
        contentValues.put("metric_id", Long.valueOf(eduhVar.c));
        contentValues.put("report_id", Long.valueOf(eduhVar.d));
        contentValues.put("last_sent_day_index", Integer.valueOf(i));
        return contentValues;
    }

    static efkn b(edvr edvrVar, int i) {
        efko efkoVar = new efko();
        efkoVar.b("UPDATE Reports SET last_sent_day_index = ? ");
        efkoVar.c(Long.valueOf(i));
        efkoVar.b(" WHERE ");
        efkoVar.b("customer_id = ?");
        eduh eduhVar = (eduh) edvrVar;
        efkoVar.c(Long.valueOf(eduhVar.a));
        efkoVar.b(" AND project_id = ?");
        efkoVar.c(Long.valueOf(eduhVar.b));
        efkoVar.b(" AND metric_id = ?");
        efkoVar.c(Long.valueOf(eduhVar.c));
        efkoVar.b(" AND report_id = ?");
        efkoVar.c(Long.valueOf(eduhVar.d));
        return efkoVar.a();
    }
}
