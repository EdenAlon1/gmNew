package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.RedownloadMessageAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class batp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((RedownloadMessageAction.a) ctba.a(RedownloadMessageAction.a.class)).aZ().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RedownloadMessageAction[i];
    }
}
