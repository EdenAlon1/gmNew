package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.rcsservice.chatsession.ChatSessionServiceResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkmo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ChatSessionServiceResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ChatSessionServiceResult[i];
    }
}
