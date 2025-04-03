package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.IQuestionToAnswerStreamingCallback;
import com.google.android.apps.aicore.aidl.ITaskStateChangeCallback;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rxt extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<rxt> CREATOR = new rxu();
    public final String a;
    public final int b;
    public final String c;
    public final engw d;
    public final String e;
    private final ITaskStateChangeCallback f;
    private final IQuestionToAnswerStreamingCallback g;

    public rxt(String str, String str2, int i, IBinder iBinder, IBinder iBinder2, List list, String str3) {
        this.a = str;
        this.c = str2;
        this.b = i;
        this.f = iBinder == null ? null : ITaskStateChangeCallback.Stub.asInterface(iBinder);
        this.g = iBinder2 == null ? null : IQuestionToAnswerStreamingCallback.Stub.asInterface(iBinder2);
        this.d = list != null ? engw.n(list) : null;
        this.e = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.i(parcel, 2, this.b);
        dfxk.m(parcel, 3, this.c, false);
        ITaskStateChangeCallback iTaskStateChangeCallback = this.f;
        dfxk.u(parcel, 4, iTaskStateChangeCallback == null ? null : iTaskStateChangeCallback.asBinder());
        dfxk.D(parcel, 5, this.d);
        dfxk.m(parcel, 6, this.e, false);
        IQuestionToAnswerStreamingCallback iQuestionToAnswerStreamingCallback = this.g;
        dfxk.u(parcel, 7, iQuestionToAnswerStreamingCallback != null ? iQuestionToAnswerStreamingCallback.asBinder() : null);
        dfxk.c(parcel, a);
    }
}
