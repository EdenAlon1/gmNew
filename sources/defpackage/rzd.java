package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.ISummarizationStreamingCallback;
import com.google.android.apps.aicore.aidl.ITaskStateChangeCallback;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rzd extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<rzd> CREATOR = new rze();
    public final engw a;
    public final float b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final ryz i;
    private final ISummarizationStreamingCallback j;
    private final ITaskStateChangeCallback k;

    public rzd(List list, float f, int i, int i2, int i3, IBinder iBinder, int i4, int i5, IBinder iBinder2, int i6, ryz ryzVar) {
        this.a = engw.n(list);
        this.b = f;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.j = iBinder == null ? null : ISummarizationStreamingCallback.Stub.asInterface(iBinder);
        this.f = i4;
        this.g = i5;
        this.k = iBinder2 != null ? ITaskStateChangeCallback.Stub.asInterface(iBinder2) : null;
        this.h = i6;
        this.i = ryzVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        engw engwVar = this.a;
        int a = dfxk.a(parcel);
        dfxk.n(parcel, 1, engwVar, false);
        dfxk.h(parcel, 2, this.b);
        dfxk.i(parcel, 3, this.c);
        dfxk.i(parcel, 4, this.d);
        dfxk.i(parcel, 5, this.e);
        ISummarizationStreamingCallback iSummarizationStreamingCallback = this.j;
        dfxk.u(parcel, 6, iSummarizationStreamingCallback == null ? null : iSummarizationStreamingCallback.asBinder());
        dfxk.i(parcel, 7, this.f);
        dfxk.i(parcel, 8, this.g);
        ITaskStateChangeCallback iTaskStateChangeCallback = this.k;
        dfxk.u(parcel, 9, iTaskStateChangeCallback != null ? iTaskStateChangeCallback.asBinder() : null);
        dfxk.i(parcel, 10, this.h);
        dfxk.k(parcel, 11, this.i, i, false);
        dfxk.c(parcel, a);
    }
}
