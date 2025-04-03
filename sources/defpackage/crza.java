package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crza {
    public static void a(ParticipantsTable.BindData bindData, engr engrVar) {
        String L = bindData.L();
        String S = bindData.S();
        if (!TextUtils.isEmpty(L) || TextUtils.isEmpty(S)) {
            return;
        }
        engrVar.h(new csgn(S, 1));
    }
}
