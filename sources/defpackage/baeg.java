package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.FillPartSizeAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baeg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((FillPartSizeAction.a) ctba.a(FillPartSizeAction.a.class)).hK().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FillPartSizeAction[i];
    }
}
