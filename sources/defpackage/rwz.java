package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.IMagicRewriteStreamingCallback;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rwz extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<rwz> CREATOR = new rxa();
    public final String a;
    public final int b;
    public final int c;
    private final IMagicRewriteStreamingCallback d;

    public rwz(String str, int i) {
        this.a = str;
        this.b = 1;
        this.c = i;
        this.d = null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.i(parcel, 2, this.b);
        dfxk.i(parcel, 3, this.c);
        IMagicRewriteStreamingCallback iMagicRewriteStreamingCallback = this.d;
        dfxk.u(parcel, 4, iMagicRewriteStreamingCallback == null ? null : iMagicRewriteStreamingCallback.asBinder());
        dfxk.c(parcel, a);
    }

    public rwz(String str, int i, int i2, IBinder iBinder) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = iBinder == null ? null : IMagicRewriteStreamingCallback.Stub.asInterface(iBinder);
    }
}
