package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ReplaceSmsMessageAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baue implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((ReplaceSmsMessageAction.a) ctba.a(ReplaceSmsMessageAction.a.class)).bp().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ReplaceSmsMessageAction[i];
    }
}
