package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcuy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new dcuz((Uri) parcel.readParcelable(MediaViewerItem.class.getClassLoader()), (Uri) parcel.readParcelable(MediaViewerItem.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (ConversationIdType) parcel.readParcelable(MediaViewerItem.class.getClassLoader()), (ConversationId) parcel.readParcelable(MediaViewerItem.class.getClassLoader()), (MessageIdType) parcel.readParcelable(MediaViewerItem.class.getClassLoader()), (MessageId) parcel.readParcelable(MediaViewerItem.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new dcuz[i];
    }
}
