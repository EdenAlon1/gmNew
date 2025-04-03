package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessRevocationSentAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baoc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((ProcessRevocationSentAction.a) ctba.a(ProcessRevocationSentAction.a.class)).id().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProcessRevocationSentAction[i];
    }
}
