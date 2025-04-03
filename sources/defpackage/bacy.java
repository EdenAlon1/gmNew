package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.CountryCodeDetectorAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bacy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((CountryCodeDetectorAction.CountryCodeDetectorActionInjector) ctba.a(CountryCodeDetectorAction.CountryCodeDetectorActionInjector.class)).hG().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CountryCodeDetectorAction[i];
    }
}
