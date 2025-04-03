package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.CompleteSignInResult;
import com.google.android.gms.auth.api.identity.SignInCredential;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfcq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        SignInCredential signInCredential = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (dfxj.d(readInt) != 1) {
                dfxj.C(parcel, readInt);
            } else {
                signInCredential = (SignInCredential) dfxj.n(parcel, readInt, SignInCredential.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new CompleteSignInResult(signInCredential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CompleteSignInResult[i];
    }
}
