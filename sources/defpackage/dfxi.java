package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfxi extends RuntimeException {
    public dfxi(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
