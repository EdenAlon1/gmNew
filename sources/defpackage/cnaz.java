package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnaz {
    public static final String[] a = {"message_reactions.message_id", "message_reactions.reacted_message_id", "message_reactions.reaction", "message_reactions.applied_reaction", "messages._id", "messages.message_status"};
    public static final cnaq b;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("message_reactions.reacted_message_id", 46020);
        enhdVar.k("message_reactions.reaction", 48000);
        enhdVar.k("message_reactions.applied_reaction", 59060);
        enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("reacted_message_id", "index_null_reacted_message_id");
        enhdVar2.c();
        b = new cnaq();
    }

    public static final cnaw a() {
        String[] strArr;
        Integer c = c();
        if (c.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("message_reactions.message_id");
            if (c.intValue() >= 46020) {
                engrVar.h("message_reactions.reacted_message_id");
            }
            if (c.intValue() >= 48000) {
                engrVar.h("message_reactions.reaction");
            }
            if (c.intValue() >= 59060) {
                engrVar.h("message_reactions.applied_reaction");
            }
            engrVar.h("messages._id");
            engrVar.h("messages.message_status");
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new cnaw(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(b().P().a());
    }
}
