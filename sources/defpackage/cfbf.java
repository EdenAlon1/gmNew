package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfbf extends dtup {
    public static final String[] a = {"work_queue._id", "work_queue.type", "work_queue.rawdata", "work_queue.attempts", "work_queue.timestamp", "work_queue.queue", "work_queue.deduplication_tag", "work_queue.scheduled_in_workmanager", "work_queue.workmanager_id", "work_queue.minimum_start_time", "work_queue.cancellation_tag"};
    public static final enhk b;
    public static final cfae c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("work_queue.queue", 41030);
        enhdVar.k("work_queue.deduplication_tag", 42050);
        enhdVar.k("work_queue.scheduled_in_workmanager", 45030);
        enhdVar.k("work_queue.workmanager_id", 46060);
        enhdVar.k("work_queue.minimum_start_time", 46070);
        enhdVar.k("work_queue.cancellation_tag", 48020);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, "index_work_queue_type");
        enhdVar2.k("deduplication_tag", "index_work_queue_deduplication_tag");
        enhdVar2.k("scheduled_in_workmanager", "index_work_queue_scheduled_in_workmanager");
        enhdVar2.c();
        c = new cfae();
        d = new int[]{39060, 41030, 42050, 45030, 46060, 46070, 48020, 58270};
    }

    public static final cfba a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("work_queue._id");
            engrVar.h("work_queue.type");
            engrVar.h("work_queue.rawdata");
            engrVar.h("work_queue.attempts");
            engrVar.h("work_queue.timestamp");
            if (c2.intValue() >= 41030) {
                engrVar.h("work_queue.queue");
            }
            if (c2.intValue() >= 42050) {
                engrVar.h("work_queue.deduplication_tag");
            }
            if (c2.intValue() >= 45030) {
                engrVar.h("work_queue.scheduled_in_workmanager");
            }
            if (c2.intValue() >= 46060) {
                engrVar.h("work_queue.workmanager_id");
            }
            if (c2.intValue() >= 46070) {
                engrVar.h("work_queue.minimum_start_time");
            }
            if (c2.intValue() >= 48020) {
                engrVar.h("work_queue.cancellation_tag");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new cfba(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(e().a());
    }

    public static void d(dtve dtveVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("type TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("subtype TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rawdata BLOB NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("attempts INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("timestamp INTEGER");
        if (i >= 41030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("queue TEXT");
        }
        if (i >= 42050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("deduplication_tag TEXT");
        }
        if (i >= 45030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("scheduled_in_workmanager INT");
        }
        if (i >= 46060) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("workmanager_id TEXT");
        }
        if (i >= 46070) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("minimum_start_time INT");
        }
        if (i >= 48020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("cancellation_tag TEXT");
        }
        sb.insert(0, "CREATE TABLE work_queue (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 41030) {
            arrayList.add("DROP INDEX IF EXISTS index_work_queue_queue");
            arrayList.add("CREATE INDEX index_work_queue_queue ON work_queue(queue);");
        }
        if (i >= 42050) {
            arrayList.add("DROP INDEX IF EXISTS index_work_queue_deduplication_tag");
            arrayList.add("CREATE INDEX index_work_queue_deduplication_tag ON work_queue(deduplication_tag);");
        }
        if (i >= 58270) {
            arrayList.add("DROP INDEX IF EXISTS index_work_queue_type");
            arrayList.add("CREATE INDEX index_work_queue_type ON work_queue(type);");
        }
        if (i >= 58270) {
            arrayList.add("DROP INDEX IF EXISTS index_work_queue_scheduled_in_workmanager");
            arrayList.add("CREATE INDEX index_work_queue_scheduled_in_workmanager ON work_queue(scheduled_in_workmanager);");
        }
        if (i >= 58270) {
            arrayList.add("DROP INDEX IF EXISTS queue_time");
            arrayList.add("CREATE INDEX queue_time ON work_queue(queue, minimum_start_time);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf e() {
        return b().P();
    }
}
