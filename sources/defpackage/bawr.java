package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.SendMessageAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bawr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((SendMessageAction.a) ctba.a(SendMessageAction.a.class)).bs().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SendMessageAction[i];
    }
}
