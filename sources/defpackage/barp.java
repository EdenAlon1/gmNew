package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveP2pSuggestionsAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class barp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((ReceiveP2pSuggestionsAction.a) ctba.a(ReceiveP2pSuggestionsAction.a.class)).ih().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ReceiveP2pSuggestionsAction[i];
    }
}
