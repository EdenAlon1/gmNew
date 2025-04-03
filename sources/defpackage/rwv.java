package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.IImageEmbeddingCallback;
import com.google.android.apps.aicore.aidl.ILLMStreamingCallback;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rwv extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<rwv> CREATOR = new rww();
    public final engw a;
    public final float b;
    public final int c;
    public final engw d;
    public final int e;
    public final int f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final Bundle l;
    public final boolean m;
    private final ILLMStreamingCallback n;
    private final IImageEmbeddingCallback o;

    public rwv(List list, float f, int i, List list2, int i2, int i3, IBinder iBinder, boolean z, int i4, IBinder iBinder2, int i5, int i6, String str, Bundle bundle, boolean z2) {
        this.a = engw.n(list);
        this.b = f;
        this.c = i;
        this.d = engw.n(list2);
        this.e = i2;
        this.f = i3;
        this.n = iBinder == null ? null : ILLMStreamingCallback.Stub.asInterface(iBinder);
        this.g = z;
        this.h = i4;
        this.o = iBinder2 != null ? IImageEmbeddingCallback.Stub.asInterface(iBinder2) : null;
        this.i = i5;
        this.j = i6;
        this.k = str;
        this.l = bundle;
        this.m = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        engw engwVar = this.a;
        int a = dfxk.a(parcel);
        dfxk.n(parcel, 1, engwVar, false);
        dfxk.h(parcel, 2, this.b);
        dfxk.i(parcel, 3, this.c);
        dfxk.D(parcel, 4, this.d);
        dfxk.i(parcel, 5, this.e);
        dfxk.i(parcel, 6, this.f);
        ILLMStreamingCallback iLLMStreamingCallback = this.n;
        dfxk.u(parcel, 7, iLLMStreamingCallback == null ? null : iLLMStreamingCallback.asBinder());
        dfxk.d(parcel, 8, this.g);
        dfxk.i(parcel, 9, this.h);
        IImageEmbeddingCallback iImageEmbeddingCallback = this.o;
        dfxk.u(parcel, 10, iImageEmbeddingCallback != null ? iImageEmbeddingCallback.asBinder() : null);
        dfxk.i(parcel, 11, this.i);
        dfxk.i(parcel, 12, this.j);
        dfxk.m(parcel, 13, this.k, false);
        dfxk.p(parcel, 14, this.l);
        dfxk.d(parcel, 15, this.m);
        dfxk.c(parcel, a);
    }
}
