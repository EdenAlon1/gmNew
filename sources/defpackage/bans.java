package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessPendingMessagesAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bans implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((ProcessPendingMessagesAction.a) ctba.a(ProcessPendingMessagesAction.a.class)).bh().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProcessPendingMessagesAction[i];
    }
}
