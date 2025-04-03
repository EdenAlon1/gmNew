package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.SetDittoSessionInactiveAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bayb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((SetDittoSessionInactiveAction.a) ctba.a(SetDittoSessionInactiveAction.a.class)).in().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SetDittoSessionInactiveAction[i];
    }
}
