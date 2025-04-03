package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateConversationOptionsAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbaf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((UpdateConversationOptionsAction.a) ctba.a(UpdateConversationOptionsAction.a.class)).aR().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UpdateConversationOptionsAction[i];
    }
}
