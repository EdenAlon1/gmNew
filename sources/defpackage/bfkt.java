package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bfkt {
    public static bgmk a() {
        bgmk a = bgmn.a();
        a.z("+ConversationListQueries#makeBuilder");
        a.v(bgmn.b.a);
        a.n(bsom.c.g, "SNIPPET_TO_USE");
        a.n(bflb.f, "conversation_contains_vsms_participant");
        a.n(bflb.g, "earliest_reminder_trigger_time");
        a.o(bflb.e, bflb.d);
        a.o(bflb.c, ((Boolean) ((cfup) stl.l.get()).e()).booleanValue() ? bflb.a : "0");
        a.r();
        a.n(cbem.a, "unread_message_count");
        if (cgma.a()) {
            a.n(cgly.a, "conversation_contains_matrix_participant");
        }
        return a;
    }
}
