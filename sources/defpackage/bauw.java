package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ResendMessageAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bauw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((ResendMessageAction.a) ctba.a(ResendMessageAction.a.class)).ba().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ResendMessageAction[i];
    }
}
