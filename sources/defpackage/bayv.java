package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.SetupExpressiveStickersAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bayv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((SetupExpressiveStickersAction.a) ctba.a(SetupExpressiveStickersAction.a.class)).io().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SetupExpressiveStickersAction[i];
    }
}
