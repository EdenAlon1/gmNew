package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amra implements Parcelable.Creator {
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
        eyhs a = ((eyjv) parcelable).a(amwn.a, eyfc.a());
        a.getClass();
        amwn amwnVar = (amwn) a;
        Object a2 = ctba.a(amrb.class);
        a2.getClass();
        amrb amrbVar = (amrb) a2;
        return amrbVar.ak().a(amrbVar.ai().H(new BugleConversationId(bdgq.b(amwnVar.b)), amwnVar.c));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new EmergencyConversation[i];
    }
}
