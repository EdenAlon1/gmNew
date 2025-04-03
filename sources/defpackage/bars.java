package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveRbmSuggestionsAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bars implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((ReceiveRbmSuggestionsAction.a) ctba.a(ReceiveRbmSuggestionsAction.a.class)).ii().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ReceiveRbmSuggestionsAction[i];
    }
}
