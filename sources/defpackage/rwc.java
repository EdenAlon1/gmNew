package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.IImageDescriptionStreamingCallback;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rwc extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<rwc> CREATOR = new rwd();
    public final List a;
    public final String b;
    private final IImageDescriptionStreamingCallback c;

    public rwc(List list, IBinder iBinder, String str) {
        this.a = list;
        this.c = iBinder == null ? null : IImageDescriptionStreamingCallback.Stub.asInterface(iBinder);
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = dfxk.a(parcel);
        dfxk.n(parcel, 1, list, false);
        IImageDescriptionStreamingCallback iImageDescriptionStreamingCallback = this.c;
        dfxk.u(parcel, 2, iImageDescriptionStreamingCallback == null ? null : iImageDescriptionStreamingCallback.asBinder());
        dfxk.m(parcel, 3, this.b, false);
        dfxk.c(parcel, a);
    }
}
