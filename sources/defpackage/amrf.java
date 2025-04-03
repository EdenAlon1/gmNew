package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amrf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        if (readBundle == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Parcelable parcelable = readBundle.getParcelable("proto");
        if (parcelable == null) {
            throw new IllegalStateException("Required value was null.");
        }
        eyhs a = ((eyjv) parcelable).a(amwl.a, eyfc.a());
        a.getClass();
        return new EmergencyConversationId(bdgq.b(((amwl) a).c));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new EmergencyConversationId[i];
    }
}
