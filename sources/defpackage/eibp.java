package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.AutoValue_MessageNotification;
import com.google.android.rcs.client.messaging.Conversation;
import com.google.android.rcs.client.messaging.MessageNotification;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eibp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Conversation conversation = (Conversation) eijb.f(parcel, 1, Conversation.CREATOR).get();
        eibm eibmVar = (eibm) eijb.f(parcel, 2, eiis.a).get();
        emxf.a(eijb.j(parcel).isPresent());
        return new AutoValue_MessageNotification(conversation, eibmVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MessageNotification[i];
    }
}
