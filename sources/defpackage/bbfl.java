package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class bbfl implements bbck {
    public abstract Action a(fcek fcekVar, String str, long j);

    public abstract Action b(fcek fcekVar, String str, ConversationIdType conversationIdType, boolean z);

    @Override // defpackage.bbck
    public abstract Action c(Parcel parcel);
}
