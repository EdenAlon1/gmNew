package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.GetFrecentConversationsAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bafj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((GetFrecentConversationsAction.a) ctba.a(GetFrecentConversationsAction.a.class)).aV().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetFrecentConversationsAction[i];
    }
}
