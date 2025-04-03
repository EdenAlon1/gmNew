package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amvp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        readBundle.getClass();
        eyjv eyjvVar = (eyjv) readBundle.getParcelable("proto");
        eyjvVar.getClass();
        amwn amwnVar = (amwn) eyjvVar.a(amwn.a, eyfc.a());
        PenpalBotConversation.a aVar = (PenpalBotConversation.a) ctba.a(PenpalBotConversation.a.class);
        return aVar.am().a(aVar.ai().H(new BugleConversationId(bdgq.b(amwnVar.b)), amwnVar.c), aVar.ai());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PenpalBotConversation[i];
    }
}
