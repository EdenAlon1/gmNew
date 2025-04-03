package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.AutoValue_GroupNotification;
import com.google.android.rcs.client.messaging.Conversation;
import com.google.android.rcs.client.messaging.GroupInformation;
import com.google.android.rcs.client.messaging.GroupNotification;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiaz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Conversation conversation = (Conversation) eijb.f(parcel, 1, Conversation.CREATOR).get();
        GroupInformation groupInformation = (GroupInformation) eijb.f(parcel, 2, GroupInformation.CREATOR).get();
        emxf.a(eijb.j(parcel).isPresent());
        return new AutoValue_GroupNotification(conversation, groupInformation);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GroupNotification[i];
    }
}
