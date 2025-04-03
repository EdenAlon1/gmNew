package defpackage;

import android.content.ContentValues;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edua {
    public static ContentValues a(edvr edvrVar, int i, long j, edvk edvkVar, Optional optional) {
        ContentValues contentValues = new ContentValues();
        eduh eduhVar = (eduh) edvrVar;
        contentValues.put("customer_id", Long.valueOf(eduhVar.a));
        contentValues.put("project_id", Long.valueOf(eduhVar.b));
        contentValues.put("metric_id", Long.valueOf(eduhVar.c));
        contentValues.put("report_id", Long.valueOf(eduhVar.d));
        contentValues.put("day_index", Integer.valueOf(i));
        contentValues.put("system_profile_hash", Long.valueOf(j));
        contentValues.put("event_vector", edvkVar.c());
        if (optional.isEmpty()) {
            contentValues.putNull("aggregate_value");
            return contentValues;
        }
        contentValues.put("aggregate_value", ((eydl) optional.get()).toByteArray());
        return contentValues;
    }

    static efkn b(edvr edvrVar, int i, edvk edvkVar, long j, long j2) {
        efko efkoVar = new efko();
        efkoVar.b("UPDATE AggregateStore SET system_profile_hash = ? ");
        efkoVar.c(Long.valueOf(j2));
        efkoVar.b(" WHERE customer_id = ?");
        eduh eduhVar = (eduh) edvrVar;
        efkoVar.c(Long.valueOf(eduhVar.a));
        efkoVar.b(" AND project_id = ?");
        efkoVar.c(Long.valueOf(eduhVar.b));
        efkoVar.b(" AND metric_id = ?");
        efkoVar.c(Long.valueOf(eduhVar.c));
        efkoVar.b(" AND report_id = ?");
        efkoVar.c(Long.valueOf(eduhVar.d));
        efkoVar.b(" AND day_index = ?");
        efkoVar.c(Long.valueOf(i));
        efkoVar.b(" AND event_vector = ?");
        efkoVar.d(edvkVar.c());
        efkoVar.b(" AND system_profile_hash = ?");
        efkoVar.c(Long.valueOf(j));
        return efkoVar.a();
    }
}
