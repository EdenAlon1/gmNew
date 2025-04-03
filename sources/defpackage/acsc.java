package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.dittosatellite.intent.DittoAttachment;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acsc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new acsd((Uri) parcel.readParcelable(DittoAttachment.class.getClassLoader()), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new acsd[i];
    }
}
