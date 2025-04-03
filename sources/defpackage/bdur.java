package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdur implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new RbmSuggestionData(parcel, (ffkd) null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RbmSuggestionData[i];
    }
}
