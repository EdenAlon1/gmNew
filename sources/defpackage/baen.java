package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.FixupMessageStatusOnStartupAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baen implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((FixupMessageStatusOnStartupAction.a) ctba.a(FixupMessageStatusOnStartupAction.a.class)).hL().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FixupMessageStatusOnStartupAction[i];
    }
}
