package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.SendReportAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baxl extends bbgg {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;

    public baxl(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
    }

    @Override // defpackage.bbgg
    public final /* bridge */ /* synthetic */ Action a(MessageIdType messageIdType, ConversationIdType conversationIdType, int i, eooi eooiVar) {
        bbgg bbggVar = (bbgg) this.a.b();
        bbggVar.getClass();
        clws clwsVar = (clws) this.b.b();
        clwsVar.getClass();
        cluu cluuVar = (cluu) this.c.b();
        cluuVar.getClass();
        messageIdType.getClass();
        conversationIdType.getClass();
        eooiVar.getClass();
        return new SendReportAction(bbggVar, clwsVar, cluuVar, messageIdType, conversationIdType, i, eooiVar);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        bbgg bbggVar = (bbgg) this.a.b();
        bbggVar.getClass();
        clws clwsVar = (clws) this.b.b();
        clwsVar.getClass();
        cluu cluuVar = (cluu) this.c.b();
        cluuVar.getClass();
        parcel.getClass();
        return new SendReportAction(bbggVar, clwsVar, cluuVar, parcel);
    }
}
