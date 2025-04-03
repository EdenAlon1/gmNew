package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.NoConfirmationMessageSendAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bais implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((NoConfirmationMessageSendAction.a) ctba.a(NoConfirmationMessageSendAction.a.class)).bb().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new NoConfirmationMessageSendAction[i];
    }
}
