package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bryh extends dtup {
    public static final String[] a = {"conversation_pin._id", "conversation_pin.conversation_id", "conversation_pin.pin_status"};
    public static final enhk b = new enhd().c();
    public static final brxr c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("conversation_id", "index_conversation_pin_conversation_id");
        enhdVar.c();
        c = new brxr();
        d = new int[]{58250};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static dtzf b() {
        return a().P();
    }

    public static void c(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("pin_status INTEGER");
        sb.insert(0, "CREATE TABLE conversation_pin (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_conversation_pin_conversation_id");
        arrayList.add("CREATE UNIQUE INDEX index_conversation_pin_conversation_id ON conversation_pin(conversation_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
