package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.util.LegacyGroupProtocolSwitchAction;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crmj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((LegacyGroupProtocolSwitchAction.a) ctba.a(LegacyGroupProtocolSwitchAction.a.class)).hS().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LegacyGroupProtocolSwitchAction[i];
    }
}
