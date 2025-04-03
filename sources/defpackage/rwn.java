package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.IInfoExtractionStreamingCallback;
import com.google.android.apps.aicore.aidl.ITaskStateChangeCallback;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rwn extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<rwn> CREATOR = new rwo();
    public final engw a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final Float f;
    public final Integer g;
    private final IInfoExtractionStreamingCallback h;
    private final ITaskStateChangeCallback i;

    public rwn(List list, int i, IBinder iBinder, int i2, int i3, IBinder iBinder2, String str, Float f, Integer num) {
        this.a = list == null ? null : engw.n(list);
        this.b = i;
        this.h = iBinder == null ? null : IInfoExtractionStreamingCallback.Stub.asInterface(iBinder);
        this.i = iBinder2 != null ? ITaskStateChangeCallback.Stub.asInterface(iBinder2) : null;
        this.c = i2;
        this.d = i3;
        this.e = str;
        this.f = f;
        this.g = num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        engw engwVar = this.a;
        int a = dfxk.a(parcel);
        dfxk.n(parcel, 1, engwVar, false);
        dfxk.i(parcel, 2, this.b);
        IInfoExtractionStreamingCallback iInfoExtractionStreamingCallback = this.h;
        dfxk.u(parcel, 3, iInfoExtractionStreamingCallback == null ? null : iInfoExtractionStreamingCallback.asBinder());
        dfxk.i(parcel, 4, this.c);
        dfxk.i(parcel, 5, this.d);
        ITaskStateChangeCallback iTaskStateChangeCallback = this.i;
        dfxk.u(parcel, 6, iTaskStateChangeCallback != null ? iTaskStateChangeCallback.asBinder() : null);
        dfxk.m(parcel, 7, this.e, false);
        dfxk.t(parcel, 8, this.f);
        dfxk.x(parcel, 9, this.g);
        dfxk.c(parcel, a);
    }
}
