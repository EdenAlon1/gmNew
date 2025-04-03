package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.InitiateClientSideFallbackAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bafv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((InitiateClientSideFallbackAction.a) ctba.a(InitiateClientSideFallbackAction.a.class)).hQ().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new InitiateClientSideFallbackAction[i];
    }
}
