package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.RequestSmartSuggestionsAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baui implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((RequestSmartSuggestionsAction.a) ctba.a(RequestSmartSuggestionsAction.a.class)).il().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RequestSmartSuggestionsAction[i];
    }
}
