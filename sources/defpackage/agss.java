package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agss {
    public static final String[] a = {"message_labels._id", "message_labels.message_id", "message_labels.label", "message_labels.confidence", "message_labels.source", "message_labels.intent", "message_labels.model_id", "messages.conversation_id", "messages.received_timestamp"};
    public static final enhk b;
    public static final agsi c;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("message_labels.confidence", 53060);
        enhdVar.k("message_labels.intent", 58590);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("intent", "index_null_intent");
        enhdVar2.c();
        c = new agsi();
    }

    public static final agsp a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("message_labels._id");
            engrVar.h("message_labels.message_id");
            engrVar.h("message_labels.label");
            if (c2.intValue() >= 53060) {
                engrVar.h("message_labels.confidence");
            }
            engrVar.h("message_labels.source");
            if (c2.intValue() >= 58590) {
                engrVar.h("message_labels.intent");
            }
            engrVar.h("message_labels.model_id");
            engrVar.h("messages.conversation_id");
            engrVar.h("messages.received_timestamp");
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new agsp(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(b().P().a());
    }
}
