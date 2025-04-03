package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdmq {
    public final cdjy a;
    public final errl b;
    public final ffbr c;
    public final ffbr d;
    public final cgtc e;
    public final ffbr f;
    public final ffbr g;
    public final dtuu h;
    public final Context i;
    public final cdlk j;
    public final atky k;
    private final cbgf l;

    public cdmq(cdjy cdjyVar, cgtc cgtcVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, dtuu dtuuVar, cbgf cbgfVar, Context context, errl errlVar, cdlk cdlkVar, atky atkyVar) {
        this.a = cdjyVar;
        this.e = cgtcVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = dtuuVar;
        this.l = cbgfVar;
        this.b = errlVar;
        this.i = context;
        this.j = cdlkVar;
        this.k = atkyVar;
    }

    @Deprecated
    public final void a(boolean z, ConversationIdType conversationIdType, MessageIdType messageIdType, String str) {
        String[] strArr = PartsTable.a;
        bwdi bwdiVar = new bwdi();
        bwdiVar.ap("updateAndNotifyCmsAttachmentProcessingStatus");
        bwdiVar.f(z ? byyu.CMS_MEDIA_DOWNLOADED : byyu.CMS_MEDIA_DOWNLOAD_NOT_STARTED);
        bwdiVar.c(str);
        this.l.l(conversationIdType, messageIdType, "parts");
    }
}
