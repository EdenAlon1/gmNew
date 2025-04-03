package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ForwardIncomingTypingIndicatorToTachyonAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baep implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((ForwardIncomingTypingIndicatorToTachyonAction.a) ctba.a(ForwardIncomingTypingIndicatorToTachyonAction.a.class)).hM().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ForwardIncomingTypingIndicatorToTachyonAction[i];
    }
}
