package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.SanitizeParticipantsAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bavw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((bavx) ((SanitizeParticipantsAction.a) ctba.a(SanitizeParticipantsAction.a.class)).br()).c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SanitizeParticipantsAction[i];
    }
}
