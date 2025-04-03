package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateContactDisambiguationAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bazq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ((UpdateContactDisambiguationAction.a) ctba.a(UpdateContactDisambiguationAction.a.class)).jg();
        return bazr.a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UpdateContactDisambiguationAction[i];
    }
}
