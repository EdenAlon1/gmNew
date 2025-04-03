package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bueg extends dtup {
    public static final String[] a = {"message_reactions._id", "message_reactions.message_id", "message_reactions.reactions_data", "message_reactions.reacted_message_id", "message_reactions.reaction", "message_reactions.applied_reaction", "message_reactions.animation_effect"};
    public static final enhk b;
    public static final budk c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("message_reactions.reacted_message_id", 46020);
        enhdVar.k("message_reactions.reaction", 48000);
        enhdVar.k("message_reactions.applied_reaction", 59060);
        enhdVar.k("message_reactions.animation_effect", 59520);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("reacted_message_id", "index_message_reactions_reacted_message_id");
        enhdVar2.k("animation_effect", "index_message_reactions_animation_effect");
        enhdVar2.c();
        c = new budk();
        d = new int[]{42000, 46020, 48000, 59060, 59520};
    }

    public static final bueb a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("message_reactions._id");
            engrVar.h("message_reactions.message_id");
            engrVar.h("message_reactions.reactions_data");
            if (c2.intValue() >= 46020) {
                engrVar.h("message_reactions.reacted_message_id");
            }
            if (c2.intValue() >= 48000) {
                engrVar.h("message_reactions.reaction");
            }
            if (c2.intValue() >= 59060) {
                engrVar.h("message_reactions.applied_reaction");
            }
            if (c2.intValue() >= 59520) {
                engrVar.h("message_reactions.animation_effect");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bueb(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(h().a());
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER NOT NULL UNIQUE ON CONFLICT FAIL REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("reactions_data BLOB");
        if (i >= 46020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("reacted_message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ");
        }
        if (i >= 48000) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("reaction INTEGER");
        }
        if (i >= 59060) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("applied_reaction BLOB");
        }
        if (i >= 59520) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("animation_effect BLOB");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void e(dtve dtveVar, int i) {
        dtveVar.y(d(i, "message_reactions"));
        for (String str : g(i)) {
            dtveVar.y(str);
        }
    }

    public static void f(MessageIdType messageIdType, Consumer consumer, Runnable runnable) {
        bueb a2 = a();
        a2.z("message_reactions.queryOnMessageId");
        a2.q();
        buef buefVar = new buef();
        buefVar.b(messageIdType);
        a2.k(new buee(buefVar));
        buco bucoVar = (buco) dtub.c(a2.b());
        if (bucoVar != null) {
            consumer.accept(bucoVar);
        } else {
            runnable.run();
        }
    }

    public static String[] g(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 46020) {
            arrayList.add("DROP INDEX IF EXISTS index_message_reactions_reacted_message_id");
            arrayList.add("CREATE INDEX index_message_reactions_reacted_message_id ON message_reactions(reacted_message_id);");
        }
        if (i >= 59520) {
            arrayList.add("DROP INDEX IF EXISTS index_message_reactions_animation_effect");
            arrayList.add("CREATE INDEX index_message_reactions_animation_effect ON message_reactions(animation_effect) WHERE animation_effect NOT NULL;");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static dtzf h() {
        return b().P();
    }
}
