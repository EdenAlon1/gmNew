package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.ArrayList;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brww extends dtup {
    public static final String[] a = {"conversation_participants._id", "conversation_participants.conversation_id", "conversation_participants.participant_id", "conversation_participants.is_normalized", "conversation_participants.rcs_group_join_status", "conversation_participants.last_modified_by_key"};
    public static final enhk b;
    public static final brvy c;
    public static final int[] d;
    public static final int[] e;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("conversation_participants.is_normalized", 58090);
        enhdVar.k("conversation_participants.rcs_group_join_status", 58570);
        enhdVar.k("conversation_participants.last_modified_by_key", 59440);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("conversation_id", "index_conversation_participants_conversation_id");
        enhdVar2.k("participant_id", "index_conversation_participants_participant_id");
        enhdVar2.c();
        c = new brvy();
        d = new int[]{58090, 58460, 58570, 59440};
        e = new int[]{58600};
    }

    public static final brwp a() {
        String[] strArr;
        Integer d2 = d();
        if (d2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("conversation_participants._id");
            engrVar.h("conversation_participants.conversation_id");
            engrVar.h("conversation_participants.participant_id");
            if (d2.intValue() >= 58090) {
                engrVar.h("conversation_participants.is_normalized");
            }
            if (d2.intValue() >= 58570) {
                engrVar.h("conversation_participants.rcs_group_join_status");
            }
            if (d2.intValue() >= 59440) {
                engrVar.h("conversation_participants.last_modified_by_key");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new brwp(strArr);
    }

    public static brwt b() {
        brwt brwtVar = new brwt();
        if (d().intValue() >= 59440) {
            bdpy b2 = bdqb.b();
            int intValue = d().intValue();
            int intValue2 = d().intValue();
            if (intValue2 < 59440) {
                dtub.w("last_modified_by_key", intValue2);
            }
            if (intValue >= 59440) {
                brwtVar.a.put("last_modified_by_key", bdqb.c(b2));
            }
            brwtVar.e.b().c("last_modified_by_key");
        }
        return brwtVar;
    }

    public static dtve c() {
        return dtub.e("$primary");
    }

    public static Integer d() {
        return Integer.valueOf(g().a());
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
        sb.append("conversation_id INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_normalized INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_join_status INT DEFAULT(0)");
        if (i >= 59440) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("last_modified_by_key TEXT");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(", UNIQUE(conversation_id,participant_id,is_normalized) ON CONFLICT FAIL FOREIGN KEY (conversation_id) REFERENCES conversations (_id) ON DELETE CASCADE FOREIGN KEY (participant_id) REFERENCES participants (_id));");
        return sb.toString();
    }

    public static void f(int i, brvg... brvgVarArr) {
        dtub.A(c(), i, false, new BiConsumer() { // from class: brva
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                brvg brvgVar = (brvg) obj;
                final Long l = (Long) obj2;
                String[] strArr = brww.a;
                if (l.longValue() >= 0) {
                    brvgVar.a = (String) new dtuj() { // from class: brvb
                        @Override // defpackage.dtuj
                        public final Object a() {
                            String[] strArr2 = brww.a;
                            return String.valueOf(l);
                        }
                    }.a();
                    brvgVar.fY(0);
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, brvgVarArr);
    }

    public static dtzf g() {
        return c().P();
    }

    static String[] h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_conversation_participants_conversation_id");
        arrayList.add("CREATE INDEX index_conversation_participants_conversation_id ON conversation_participants(conversation_id);");
        arrayList.add("DROP INDEX IF EXISTS index_conversation_participants_participant_id");
        arrayList.add("CREATE INDEX index_conversation_participants_participant_id ON conversation_participants(participant_id);");
        return (String[]) arrayList.toArray(new String[0]);
    }
}
