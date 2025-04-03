package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ucr {
    public final MessagesTable.BindData a;
    public final ajqt b;
    public final MessageIdType c;

    public ucr(MessagesTable.BindData bindData, ajqt ajqtVar) {
        this.a = bindData;
        this.b = ajqtVar;
        this.c = ajqtVar instanceof ajra ? ((ajra) ajqtVar).a : bdhb.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucr)) {
            return false;
        }
        ucr ucrVar = (ucr) obj;
        return ffkj.e(this.a, ucrVar.a) && ffkj.e(this.b, ucrVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ajqt ajqtVar = this.b;
        return hashCode + (ajqtVar == null ? 0 : ajqtVar.hashCode());
    }

    public final String toString() {
        return "DraftQueryResult(messagesTableData=" + this.a + ", messageRepliesQueryResult=" + this.b + ")";
    }
}
