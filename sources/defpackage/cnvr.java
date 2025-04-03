package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnvr {
    private final Context a;
    private final ccpr b;

    public cnvr(Context context, ccpr ccprVar) {
        context.getClass();
        this.a = context;
        this.b = ccprVar;
    }

    public final Object a(MessageCoreData messageCoreData) {
        engw r;
        MessageData messageData = (MessageData) messageCoreData;
        if (messageData.i.isEmpty()) {
            throw new IllegalArgumentException("MessageCoreData has no parts.");
        }
        ccpr ccprVar = this.b;
        MessagesTable.BindData J = messageCoreData.J();
        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) ffdx.K(messageData.i);
        if (messagePartCoreData.bi()) {
            String ae = messagePartCoreData.ae();
            if (ae == null) {
                throw new IllegalArgumentException("MessageCoreData as invalid EoE attachment");
            }
            cntb a = cnnw.a(ae);
            bvwp w = messagePartCoreData.E().w();
            w.t("text/plain");
            Context context = this.a;
            cnsz cnszVar = a.c;
            if (cnszVar == null) {
                cnszVar = cnsz.a;
            }
            cnsy b = cnsy.b(cnszVar.c);
            if (b == null) {
                b = cnsy.UNRECOGNIZED;
            }
            w.Y(context.getString(b == cnsy.HELP_NOT_LONGER_NEED ? R.string.end_of_emergency_help_not_needed : R.string.end_of_emergency_help_needed));
            r = engw.r(w.a());
            r.getClass();
        } else {
            r = engw.r(messagePartCoreData.E());
            r.getClass();
        }
        Uri a2 = ccprVar.a(J, r);
        return a2 != null ? a2 : ffci.a(new IllegalStateException("Failed to insert the message into database."));
    }
}
