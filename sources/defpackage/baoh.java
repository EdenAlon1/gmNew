package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessSentMessageAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baoh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((ProcessSentMessageAction.a) ctba.a(ProcessSentMessageAction.a.class)).bi().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProcessSentMessageAction[i];
    }
}
