package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.MarkAsReadAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baig implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((MarkAsReadAction.a) ctba.a(MarkAsReadAction.a.class)).aX().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MarkAsReadAction[i];
    }
}
