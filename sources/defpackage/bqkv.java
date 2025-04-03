package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.ArrayList;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqkv extends dtup {
    public static final String[] a = {"cms_dead_letter_queue._id", "cms_dead_letter_queue.cms_id", "cms_dead_letter_queue.cms_data_type", "cms_dead_letter_queue.abandoned_action", "cms_dead_letter_queue.failure_reason", "cms_dead_letter_queue.bugle_table_type", "cms_dead_letter_queue.bugle_id", "cms_dead_letter_queue.cms_backup_parameters", "cms_dead_letter_queue.backup_flags", "cms_dead_letter_queue.backup_dependency_table_type", "cms_dead_letter_queue.backup_dependency_bugle_id"};
    public static final enhk b;
    public static final bqjt c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("cms_dead_letter_queue.bugle_table_type", 57090);
        enhdVar.k("cms_dead_letter_queue.bugle_id", 57090);
        enhdVar.k("cms_dead_letter_queue.cms_backup_parameters", 57090);
        enhdVar.k("cms_dead_letter_queue.backup_flags", 57090);
        enhdVar.k("cms_dead_letter_queue.backup_dependency_table_type", 57090);
        enhdVar.k("cms_dead_letter_queue.backup_dependency_bugle_id", 57090);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("cms_id", "index_cms_dead_letter_queue_cms_id");
        enhdVar2.k("abandoned_action", "index_cms_dead_letter_queue_abandoned_action");
        enhdVar2.k("bugle_id", "index_cms_dead_letter_queue_bugle_id");
        enhdVar2.c();
        c = new bqjt();
        d = new int[]{51040, 57090, 58050, 58300};
    }

    public static final bqkn a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("cms_dead_letter_queue._id");
            engrVar.h("cms_dead_letter_queue.cms_id");
            engrVar.h("cms_dead_letter_queue.cms_data_type");
            engrVar.h("cms_dead_letter_queue.abandoned_action");
            engrVar.h("cms_dead_letter_queue.failure_reason");
            if (c2.intValue() >= 57090) {
                engrVar.h("cms_dead_letter_queue.bugle_table_type");
            }
            if (c2.intValue() >= 57090) {
                engrVar.h("cms_dead_letter_queue.bugle_id");
            }
            if (c2.intValue() >= 57090) {
                engrVar.h("cms_dead_letter_queue.cms_backup_parameters");
            }
            if (c2.intValue() >= 57090) {
                engrVar.h("cms_dead_letter_queue.backup_flags");
            }
            if (c2.intValue() >= 57090) {
                engrVar.h("cms_dead_letter_queue.backup_dependency_table_type");
            }
            if (c2.intValue() >= 57090) {
                engrVar.h("cms_dead_letter_queue.backup_dependency_bugle_id");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bqkn(strArr);
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
        sb.append("cms_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_data_type INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("abandoned_action INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("failure_reason INT");
        if (i >= 57090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("bugle_table_type INTEGER DEFAULT(-1)");
        }
        if (i >= 57090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("bugle_id INTEGER DEFAULT('-1')");
        }
        if (i >= 57090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("cms_backup_parameters BLOB");
        }
        if (i >= 57090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("backup_flags INTEGER");
        }
        if (i >= 57090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("backup_dependency_table_type INTEGER DEFAULT(-1)");
        }
        if (i >= 57090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("backup_dependency_bugle_id INTEGER DEFAULT('-1')");
        }
        sb.insert(0, "CREATE TABLE cms_dead_letter_queue (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 58050) {
            arrayList.add("DROP INDEX IF EXISTS index_cms_dead_letter_queue_cms_id");
            arrayList.add("CREATE INDEX index_cms_dead_letter_queue_cms_id ON cms_dead_letter_queue(cms_id);");
        }
        if (i >= 58050) {
            arrayList.add("DROP INDEX IF EXISTS index_cms_dead_letter_queue_bugle_id");
            arrayList.add("CREATE INDEX index_cms_dead_letter_queue_bugle_id ON cms_dead_letter_queue(bugle_id);");
        }
        if (i >= 58300) {
            arrayList.add("DROP INDEX IF EXISTS index_cms_dead_letter_queue_abandoned_action");
            arrayList.add("CREATE INDEX index_cms_dead_letter_queue_abandoned_action ON cms_dead_letter_queue(abandoned_action);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf e() {
        return b().P();
    }

    public static void f(bqir... bqirVarArr) {
        dtub.A(b(), 0, false, new BiConsumer() { // from class: bqil
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                bqir bqirVar = (bqir) obj;
                final Long l = (Long) obj2;
                String[] strArr = bqkv.a;
                if (l.longValue() >= 0) {
                    bqirVar.a = (String) new dtuj() { // from class: bqim
                        @Override // defpackage.dtuj
                        public final Object a() {
                            String[] strArr2 = bqkv.a;
                            return String.valueOf(l);
                        }
                    }.a();
                    bqirVar.fY(0);
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, bqirVarArr);
    }
}
