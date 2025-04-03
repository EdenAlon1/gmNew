package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ankj {
    public static final String[] a = {"conversations._id", "conversations.name", "conversations.name_is_automatic", "conversations.sort_timestamp", "conversations.join_state", "conversations.conv_type", "group_concat(quote(conversation_to_participants.participant_id), '|')", "group_concat(quote(conversation_to_participants.rowid), '|') AS conversation_to_participants__ROWID", "participants._id", "group_concat(quote(participants.normalized_destination), '|')", "group_concat(quote(participants.send_destination), '|')", "group_concat(quote(participants.comparable_destination), '|')", "group_concat(quote(participants.rowid), '|') AS participants__ROWID"};
    public static final anjz b;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("conversations.name_is_automatic", 10012);
        enhdVar.k("conversations.join_state", 10006);
        enhdVar.k("conversations.conv_type", 10007);
        enhdVar.k("group_concat(quote(participants.comparable_destination), '|')", 54040);
        enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("sort_timestamp", "index_null_sort_timestamp");
        enhdVar2.c();
        b = new anjz();
    }

    public static final ankg a() {
        String[] strArr;
        Integer c = c();
        if (c.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("conversations._id");
            engrVar.h("conversations.name");
            if (c.intValue() >= 10012) {
                engrVar.h("conversations.name_is_automatic");
            }
            engrVar.h("conversations.sort_timestamp");
            if (c.intValue() >= 10006) {
                engrVar.h("conversations.join_state");
            }
            if (c.intValue() >= 10007) {
                engrVar.h("conversations.conv_type");
            }
            engrVar.h("group_concat(quote(conversation_to_participants.participant_id), '|')");
            engrVar.h("participants._id");
            engrVar.h("group_concat(quote(participants.normalized_destination), '|')");
            engrVar.h("group_concat(quote(participants.send_destination), '|')");
            if (c.intValue() >= 54040) {
                engrVar.h("group_concat(quote(participants.comparable_destination), '|')");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new ankg(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(b().P().a());
    }
}
