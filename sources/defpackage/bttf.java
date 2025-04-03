package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bttf extends dtup {
    public static final String[] a = {"messages_annotations._id", "messages_annotations.conversation_id", "messages_annotations.message_id", "messages_annotations.annotation_type", "messages_annotations.annotation_details"};
    public static final enhk b;
    public static final btsl c;
    public static final int[] d;
    public static final int[] e;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("messages_annotations.message_id", 20040);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("conversation_id", "index_messages_annotations_conversation_id");
        enhdVar2.k("message_id", "index_messages_annotations_message_id");
        enhdVar2.k("annotation_type", "index_messages_annotations_annotation_type");
        enhdVar2.c();
        c = new btsl();
        d = new int[]{20030, 20040, 20070, 58530};
        e = new int[]{57020};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public static final btsn a(dtsu dtsuVar) {
        dtsr dtsrVar = (dtsr) dtsuVar;
        return new btst(dtsrVar.c, dtsuVar, dtsrVar.f, dtsrVar.g, new dtyo() { // from class: btrr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                String str = (String) obj;
                String[] strArr = bttf.a;
                return str;
            }
        }, new dtvs(), null);
    }

    public static final btta b() {
        String[] strArr;
        Integer d2 = d();
        if (d2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("messages_annotations._id");
            engrVar.h("messages_annotations.conversation_id");
            if (d2.intValue() >= 20040) {
                engrVar.h("messages_annotations.message_id");
            }
            engrVar.h("messages_annotations.annotation_type");
            engrVar.h("messages_annotations.annotation_details");
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new btta(strArr);
    }

    public static dtve c() {
        return dtub.e("$primary");
    }

    public static Integer d() {
        return Integer.valueOf(h().a());
    }

    public static String e(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id TEXT");
        if (i >= 20040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("annotation_type INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("annotation_details BLOB");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void f(dtve dtveVar, int i) {
        dtveVar.y(e(i, "messages_annotations"));
        for (String str : g(i)) {
            dtveVar.y(str);
        }
    }

    static String[] g(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 20040) {
            arrayList.add("DROP INDEX IF EXISTS index_messages_annotations_message_id");
            arrayList.add("CREATE INDEX index_messages_annotations_message_id ON messages_annotations(message_id);");
        }
        if (i >= 20070) {
            arrayList.add("DROP INDEX IF EXISTS index_messages_annotations_conversation_id");
            arrayList.add("CREATE INDEX index_messages_annotations_conversation_id ON messages_annotations(conversation_id);");
        }
        if (i >= 58530) {
            arrayList.add("DROP INDEX IF EXISTS index_messages_annotations_annotation_type");
            arrayList.add("CREATE INDEX index_messages_annotations_annotation_type ON messages_annotations(annotation_type);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static dtzf h() {
        return c().P();
    }
}
