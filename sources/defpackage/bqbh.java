package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqbh extends dtup {
    public static final String[] a = {"a2p_conversation_subscriptions.participant_id", "a2p_conversation_subscriptions.conversation_toolstone_state", "a2p_conversation_subscriptions.conversation_subscription_state", "a2p_conversation_subscriptions.last_action_timestamp"};
    public static final bqar b;
    public static final int[] c;

    static {
        new enhd().c();
        enhd enhdVar = new enhd();
        enhdVar.k("participant_id", "index_a2p_conversation_subscriptions_participant_id");
        enhdVar.c();
        b = new bqar();
        c = new int[]{60410};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static void b(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INTEGER NOT NULL REFERENCES participants(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_toolstone_state INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_subscription_state INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_action_timestamp INTEGER");
        sb.insert(0, "CREATE TABLE a2p_conversation_subscriptions (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_a2p_conversation_subscriptions_participant_id");
        arrayList.add("CREATE UNIQUE INDEX index_a2p_conversation_subscriptions_participant_id ON a2p_conversation_subscriptions(participant_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
