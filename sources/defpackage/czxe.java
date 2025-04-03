package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czxe implements ffjm {
    final /* synthetic */ czxf a;
    final /* synthetic */ ffix b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ ParticipantsTable.BindData d;

    public czxe(czxf czxfVar, ffix ffixVar, ConversationIdType conversationIdType, ParticipantsTable.BindData bindData) {
        this.a = czxfVar;
        this.b = ffixVar;
        this.c = conversationIdType;
        this.d = bindData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            cwoi.a(null, null, false, null, false, hpx.d(-16136852, new czxd(this.a, this.b, this.c, this.d), hfdVar), hfdVar, 196608, 31);
        }
        return ffcu.a;
    }
}
