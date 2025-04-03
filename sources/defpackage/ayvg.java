package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayvg {
    public static final String[] a = {"conversations._id", "conversations.conv_type", "conversations.has_ea2p_bot_recipient", "group_concat(quote(conversation_to_participants.participant_id), '|')", "group_concat(quote(conversation_to_participants.rowid), '|') AS conversation_to_participants__ROWID", "participants._id", "group_concat(quote(participants.normalized_destination), '|')", "group_concat(quote(participants.send_destination), '|')", "group_concat(quote(participants.rowid), '|') AS participants__ROWID"};
    public static final ayuw b;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("conversations.conv_type", 10007);
        enhdVar.k("conversations.has_ea2p_bot_recipient", 12001);
        enhdVar.c();
        new enhd().c();
        b = new ayuw();
    }

    public static final ayvd a() {
        String[] strArr;
        Integer c = c();
        if (c.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("conversations._id");
            if (c.intValue() >= 10007) {
                engrVar.h("conversations.conv_type");
            }
            if (c.intValue() >= 12001) {
                engrVar.h("conversations.has_ea2p_bot_recipient");
            }
            engrVar.h("group_concat(quote(conversation_to_participants.participant_id), '|')");
            engrVar.h("participants._id");
            engrVar.h("group_concat(quote(participants.normalized_destination), '|')");
            engrVar.h("group_concat(quote(participants.send_destination), '|')");
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new ayvd(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(b().P().a());
    }
}
