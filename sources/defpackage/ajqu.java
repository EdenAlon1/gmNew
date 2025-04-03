package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajqu {
    public static final entd a = entd.c("BugleReplies");

    public static final ajqt a(bmwr bmwrVar) {
        bmwrVar.getClass();
        if (bmwrVar.f().c()) {
            throw new IllegalArgumentException("toRepliesQueryResult invoked on MessageRepliesView with empty messageId");
        }
        if (bmwrVar.d.D().c()) {
            return ajqr.a;
        }
        MessageIdType D = bmwrVar.d.D();
        D.getClass();
        MessagesTable.BindData bindData = bmwrVar.d;
        bindData.getClass();
        ParticipantsTable.BindData bindData2 = bmwrVar.k;
        bindData2.getClass();
        PartsTable.BindData[] bindDataArr = bmwrVar.s;
        bindDataArr.getClass();
        return new ajra(D, bindData, bindData2, ffdo.L(bindDataArr), bmwrVar.y.s() != null ? bmwrVar.y : null);
    }
}
