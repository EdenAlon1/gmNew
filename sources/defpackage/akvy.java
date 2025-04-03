package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akvy {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/analytics/AnalyticsDatabaseOperations");
    private final cqoh b;
    private final ffbr c;
    private final akvz d;
    private final aljt e;
    private final ffbr f;
    private final ffbr g;

    public akvy(cqoh cqohVar, ffbr ffbrVar, akvz akvzVar, aljt aljtVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.b = cqohVar;
        this.c = ffbrVar;
        this.d = akvzVar;
        this.e = aljtVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
    }

    public final int a(long j) {
        long epochMilli = this.b.f().toEpochMilli() - j;
        String[] strArr = bsom.a;
        return (int) ((dtve) this.c.b()).f(String.format("%s LEFT JOIN %s ON %s=%s", "conversations", "messages", bsom.c.f, MessagesTable.c.a), String.format("%s = ? AND %s > ?", bsom.c.O, MessagesTable.c.i), new String[]{Integer.toString(2), Long.toString(epochMilli)});
    }

    public final int b(long j) {
        Cursor cursor;
        csix.h();
        long epochMilli = this.b.f().toEpochMilli() - j;
        String[] strArr = bsom.a;
        String format = String.format("%s LEFT JOIN %s ON %s=%s", "conversations", "messages", bsom.c.f, MessagesTable.c.a);
        bskp bskpVar = bsom.c;
        bskq bskqVar = bskpVar.O;
        buun buunVar = MessagesTable.c.i;
        bskq bskqVar2 = bskpVar.y;
        try {
            cursor = ((dtve) this.c.b()).j().query(format, new String[]{bsom.c.y.toString()}, String.format("%s = ? AND %s > ? and %s IS NOT NULL and %s != ''", bskqVar, buunVar, bskqVar2, bskqVar2), new String[]{Integer.toString(0), Long.toString(epochMilli)}, null, null, null);
            int i = 0;
            while (cursor.moveToNext()) {
                try {
                    if (aoqw.j(cursor.getString(0))) {
                        i++;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return i;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    public final int c(long j) {
        long epochMilli = this.b.f().toEpochMilli() - j;
        int[] dm = MessageData.dm();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.toString(3));
        arrayList.add(Long.toString(-1L));
        arrayList.add(Long.toString(epochMilli));
        for (int i = 0; i < 5; i++) {
            arrayList.add(Integer.toString(dm[i]));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(MessagesTable.c.j);
        sb.append(" = ? AND ");
        sb.append(MessagesTable.c.I);
        sb.append(" != ? AND ");
        sb.append(MessagesTable.c.g);
        sb.append(" > ? AND (");
        for (int i2 = 0; i2 < 5; i2++) {
            if (i2 > 0) {
                sb.append(" OR ");
            }
            sb.append(MessagesTable.c.k);
            sb.append(" = ?");
        }
        sb.append(")");
        return (int) ((dtve) this.c.b()).f("messages", sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final enhk d(long j) {
        Cursor cursor;
        HashMap hashMap = new HashMap();
        long epochMilli = this.b.f().toEpochMilli() - j;
        String[] strArr = bsom.a;
        String format = String.format("%s LEFT JOIN %s ON %s=%s", "conversations", "participants", bsom.c.y, ParticipantsTable.c.f);
        bskp bskpVar = bsom.c;
        try {
            cursor = ((dtve) this.c.b()).j().query(format, new String[]{bsom.c.y.toString(), ParticipantsTable.c.v.toString()}, String.format("%s = 1 AND %s > ?", bskpVar.R, bskpVar.S), new String[]{Long.toString(epochMilli)}, null, null, null);
            while (cursor.moveToNext()) {
                try {
                    String string = cursor.getString(0);
                    if (string == null) {
                        ((enrr) ((enrr) a.j()).h("com/google/android/apps/messaging/shared/analytics/AnalyticsDatabaseOperations", "getRbmBotsFromInteractiveRbmConversations", 157, "AnalyticsDatabaseOperations.java")).q("null in PARTICIPANT_NORMALIZED_DESTINATION for RBM bot");
                    } else {
                        if (hashMap.put(string, Boolean.valueOf(cursor.getInt(1) == 1)) != null) {
                            ((enrr) ((enrr) a.j()).h("com/google/android/apps/messaging/shared/analytics/AnalyticsDatabaseOperations", "getRbmBotsFromInteractiveRbmConversations", 163, "AnalyticsDatabaseOperations.java")).t("Duplicated conversation found with %s", cskt.b(string));
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return enhk.j(hashMap);
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0412 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0417  */
    /* JADX WARN: Type inference failed for: r1v0, types: [akvy] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eokw e(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r30) {
        /*
            Method dump skipped, instructions count: 1051
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akvy.e(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType):eokw");
    }
}
