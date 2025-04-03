package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amxt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        readBundle.getClass();
        eyjv eyjvVar = (eyjv) readBundle.getParcelable("proto");
        eyjvVar.getClass();
        return new RbmConversationId(bdgq.b(((amwl) eyjvVar.a(amwl.a, eyfc.a())).c));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RbmConversationId[i];
    }
}
