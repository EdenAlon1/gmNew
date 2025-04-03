package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajsq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        eyhs a = ProtoParsers.a(parcel, ajso.a, eyfc.a());
        a.getClass();
        return new RepliedToDataAdapter((ajso) a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RepliedToDataAdapter[i];
    }
}
