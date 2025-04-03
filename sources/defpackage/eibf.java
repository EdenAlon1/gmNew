package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.AutoValue_JoinGroupRequest;
import com.google.android.rcs.client.messaging.JoinGroupRequest;
import com.google.android.rcs.client.messaging.data.Conversation;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eibf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        PendingIntent pendingIntent = null;
        Conversation conversation = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                pendingIntent = dfxj.j(parcel, readInt);
                if (pendingIntent == null) {
                    throw new NullPointerException("Null intent");
                }
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                conversation = (Conversation) dfxj.n(parcel, readInt, Conversation.CREATOR);
                if (conversation == null) {
                    throw new NullPointerException("Null conversation");
                }
            }
        }
        if (pendingIntent != null && conversation != null) {
            return new AutoValue_JoinGroupRequest(pendingIntent, conversation);
        }
        StringBuilder sb = new StringBuilder();
        if (pendingIntent == null) {
            sb.append(" intent");
        }
        if (conversation == null) {
            sb.append(" conversation");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new JoinGroupRequest[i];
    }
}
