package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class bakx {
    public static bakx l(Uri uri, Context context, MessageIdType messageIdType, String str, boolean z, bdfy bdfyVar, MessageCoreData messageCoreData, int i, long j, ParticipantsTable.BindData bindData, boolean z2) {
        return new baby(uri, context, messageIdType, bdgq.b(str), z, bdfyVar, messageCoreData, i, j, bindData, z2);
    }

    public abstract int a();

    public abstract long b();

    public abstract Context c();

    public abstract Uri d();

    public abstract MessageCoreData e();

    public abstract bdfy f();

    public abstract ConversationIdType g();

    public abstract MessageIdType h();

    public abstract ParticipantsTable.BindData i();

    public abstract boolean j();

    public abstract boolean k();

    final ConversationIdType m() {
        bdfy f = f();
        return f == null ? bdgq.a : f.a();
    }
}
