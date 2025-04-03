package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.conversation.draft.EditingData;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import j$.time.Instant;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aygx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z;
        parcel.getClass();
        aygq aygqVar = (aygq) Enum.valueOf(aygq.class, parcel.readString());
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i != readInt; i++) {
            arrayList.add(IncomingDraft.Attachment.CREATOR.createFromParcel(parcel));
        }
        String readString2 = parcel.readString();
        boolean z2 = true;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = true;
            z2 = false;
        }
        return new IncomingDraft(aygqVar, readString, arrayList, readString2, z2, (Instant) parcel.readSerializable(), (EditingData) parcel.readParcelable(IncomingDraft.class.getClassLoader()), parcel.readInt() != 0 ? z : false);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new IncomingDraft[i];
    }
}
