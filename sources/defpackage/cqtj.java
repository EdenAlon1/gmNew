package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqtj extends dtup {
    public static final String[] a = {"file_transfer.message_id", "file_transfer.transfer_id", "file_transfer.transfer_type", "file_transfer.attachment_upload_response", "file_transfer.file_information", "file_transfer.thumbnail_information", "file_transfer.transfer_handle", "file_transfer.opaque_data"};
    public static final enhk b;
    public static final cqsn c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("file_transfer.file_information", 55030);
        enhdVar.k("file_transfer.thumbnail_information", 59910);
        enhdVar.k("file_transfer.transfer_handle", 55030);
        enhdVar.k("file_transfer.opaque_data", 56040);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("transfer_id", "index_file_transfer_transfer_id");
        enhdVar2.c();
        c = new cqsn();
        d = new int[]{52060, 55030, 56040, 58450, 59910};
    }

    public static cqrs a(MessageIdType messageIdType) {
        cqte b2 = b();
        b2.z("file_transfer.queryOnMessageId");
        b2.q();
        cqti cqtiVar = new cqti();
        cqtiVar.b(messageIdType);
        b2.d(cqtiVar);
        return (cqrs) dtub.c(b2.b());
    }

    public static final cqte b() {
        String[] strArr;
        Integer d2 = d();
        if (d2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("file_transfer.message_id");
            engrVar.h("file_transfer.transfer_id");
            engrVar.h("file_transfer.transfer_type");
            engrVar.h("file_transfer.attachment_upload_response");
            if (d2.intValue() >= 55030) {
                engrVar.h("file_transfer.file_information");
            }
            if (d2.intValue() >= 59910) {
                engrVar.h("file_transfer.thumbnail_information");
            }
            if (d2.intValue() >= 55030) {
                engrVar.h("file_transfer.transfer_handle");
            }
            if (d2.intValue() >= 56040) {
                engrVar.h("file_transfer.opaque_data");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new cqte(strArr);
    }

    public static dtve c() {
        return dtub.e("$primary");
    }

    public static Integer d() {
        return Integer.valueOf(g().a());
    }

    public static Object e(MessageIdType messageIdType, Function function, Supplier supplier) {
        Object obj;
        Object apply;
        cqrs a2 = a(messageIdType);
        if (a2 != null) {
            apply = function.apply(a2);
            return apply;
        }
        obj = supplier.get();
        return obj;
    }

    public static void f(dtve dtveVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INT PRIMARY KEY REFERENCES messages(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("transfer_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("transfer_type INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("attachment_upload_response BLOB");
        if (i >= 55030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("file_information BLOB");
        }
        if (i >= 59910) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("thumbnail_information BLOB");
        }
        if (i >= 55030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("transfer_handle TEXT");
        }
        if (i >= 56040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("opaque_data BLOB");
        }
        sb.insert(0, "CREATE TABLE file_transfer (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 58450) {
            arrayList.add("DROP INDEX IF EXISTS index_file_transfer_transfer_id");
            arrayList.add("CREATE INDEX index_file_transfer_transfer_id ON file_transfer(transfer_id);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf g() {
        return c().P();
    }
}
