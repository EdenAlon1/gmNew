package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddjn {
    public static final String[] a = {"messages._id", "messages.conversation_id", "reminders._id", "reminders.message_id", "reminders.trigger_time", "reminders.status"};
    public static final ddje b;

    static {
        new enhd().c();
        enhd enhdVar = new enhd();
        enhdVar.k("_id", "index_unsent_rcs_report");
        enhdVar.c();
        b = new ddje();
    }

    public static dtve a() {
        return dtub.e("$primary");
    }
}
