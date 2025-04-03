package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.IImageEmbeddingCallback;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ryn extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<ryn> CREATOR = new ryo();
    public final List a;
    public final int b;
    public final int c;
    private final IImageEmbeddingCallback d;

    public ryn(List list, IBinder iBinder, int i, int i2) {
        this.a = list;
        this.d = iBinder == null ? null : IImageEmbeddingCallback.Stub.asInterface(iBinder);
        this.b = i;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = dfxk.a(parcel);
        dfxk.n(parcel, 1, list, false);
        IImageEmbeddingCallback iImageEmbeddingCallback = this.d;
        dfxk.u(parcel, 2, iImageEmbeddingCallback == null ? null : iImageEmbeddingCallback.asBinder());
        dfxk.i(parcel, 3, this.b);
        dfxk.i(parcel, 4, this.c);
        dfxk.c(parcel, a);
    }
}
