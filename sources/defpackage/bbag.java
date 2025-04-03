package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateConversationOptionsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbag extends bbes {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;

    public bbag(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
    }

    @Override // defpackage.bbes
    public final /* bridge */ /* synthetic */ Action a(ConversationIdType conversationIdType, Boolean bool, String str, Boolean bool2, Integer num) {
        cbvt cbvtVar = (cbvt) this.b.b();
        cbvtVar.getClass();
        cbgf cbgfVar = (cbgf) this.c.b();
        cbgfVar.getClass();
        conversationIdType.getClass();
        return new UpdateConversationOptionsAction(this.a, cbvtVar, cbgfVar, conversationIdType, bool, str, bool2, num);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        cbvt cbvtVar = (cbvt) this.b.b();
        cbvtVar.getClass();
        cbgf cbgfVar = (cbgf) this.c.b();
        cbgfVar.getClass();
        parcel.getClass();
        return new UpdateConversationOptionsAction(this.a, cbvtVar, cbgfVar, parcel);
    }
}
