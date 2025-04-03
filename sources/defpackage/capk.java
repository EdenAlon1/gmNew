package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.datamodel.etouffee.info.DetailsPageE2eeInfoRequest;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class capk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new DetailsPageE2eeInfoRequest(parcel.readString(), (Conversation) parcel.readParcelable(DetailsPageE2eeInfoRequest.class.getClassLoader()), (eozn) Enum.valueOf(eozn.class, parcel.readString()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DetailsPageE2eeInfoRequest[i];
    }
}
