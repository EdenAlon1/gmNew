package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.Locale;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rwh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<rwh> CREATOR = new rwi();
    public final byte[] A;
    public final int B;
    public final int C;
    public final long D;
    public final long E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final long N;
    public final int[] O;
    public final int a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final boolean t;
    public final int u;
    public final long v;
    public final double w;
    public final double x;
    public final int y;
    public final float z;

    public rwh(int i, int i2, int i3, int i4, long j, int i5, int i6, int i7, long j2, long j3, long j4, long j5, long j6, long j7, int i8, int i9, int i10, int i11, boolean z, int i12, long j8, double d, double d2, int i13, float f, byte[] bArr, int i14, int i15, long j9, long j10, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, long j11, long j12, int[] iArr) {
        this.a = i;
        this.b = j12;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = j;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = j2;
        this.k = j3;
        this.l = j4;
        this.m = j5;
        this.n = j6;
        this.o = j7;
        this.p = i8;
        this.q = i9;
        this.r = i10;
        this.s = i11;
        this.t = z;
        this.u = i12;
        this.v = j8;
        this.w = d;
        this.x = d2;
        this.y = i13;
        this.z = f;
        this.A = bArr;
        this.B = i14;
        this.C = i15;
        this.D = j9;
        this.E = j10;
        this.F = i16;
        this.G = i17;
        this.H = i18;
        this.I = i19;
        this.J = i20;
        this.K = i21;
        this.L = i22;
        this.M = i23;
        this.N = j11;
        this.O = iArr;
    }

    public final String toString() {
        sds sdsVar;
        enhd enhdVar = new enhd();
        enhdVar.k("customerId", Integer.valueOf(this.a));
        enhdVar.k("callingUserId", Long.valueOf(this.b));
        enhdVar.k("featureType", Integer.valueOf(this.c));
        enhdVar.k("featureVariant", Integer.valueOf(this.d));
        enhdVar.k("status", Integer.valueOf(this.e));
        enhdVar.k("inferenceLatencyTotalMillis", Long.valueOf(this.f));
        enhdVar.k("numInputTokens", Integer.valueOf(this.g));
        enhdVar.k("numOutputTokens", Integer.valueOf(this.h));
        enhdVar.k("numDecodeSteps", Integer.valueOf(this.i));
        enhdVar.k("inferenceServiceStartLatencyMillis", Long.valueOf(this.j));
        enhdVar.k("inferenceApiCallHandlingLatencyMillis", Long.valueOf(this.k));
        enhdVar.k("inferenceInputSafetyCheckLatencyMillis", Long.valueOf(this.l));
        enhdVar.k("inferenceInputEncodingLatencyMillis", Long.valueOf(this.m));
        enhdVar.k("inferenceOverallOutputLatencyMillis", Long.valueOf(this.n));
        enhdVar.k("inferenceOutputSafetyCheckLatencyMillis", Long.valueOf(this.o));
        enhdVar.k("inputSafetyCheckPolicyViolationType", Integer.valueOf(this.p));
        enhdVar.k("inputSafetyCheckSuggestedActionType", Integer.valueOf(this.q));
        enhdVar.k("outputSafetyCheckPolicyViolationType", Integer.valueOf(this.r));
        enhdVar.k("outputSafetyCheckSuggestedActionType", Integer.valueOf(this.s));
        enhdVar.k("isModelLoaded", Boolean.valueOf(this.t));
        enhdVar.k("featureId", Integer.valueOf(this.u));
        enhdVar.k("featureVersion", Integer.valueOf(this.M));
        enhdVar.k("modelInferenceLatencyMillis", Long.valueOf(this.v));
        enhdVar.k("outputTokensPerSecond", Double.valueOf(this.w));
        enhdVar.k("inputTokensPerSecond", Double.valueOf(this.x));
        enhdVar.k("numSamples", Integer.valueOf(this.y));
        enhdVar.k("cannedResponsesRatio", Float.valueOf(this.z));
        try {
            sdsVar = (sds) eyfy.parseFrom(sds.a, this.A, eyfc.a());
        } catch (eygu e) {
            Log.e("InferenceEventTraceResult", "Failed to parse SpeculativeDecodeStatistics proto", e);
            sdsVar = sds.a;
        }
        StringBuilder sb = new StringBuilder("{drafter_id: ");
        sb.append(sdsVar.b);
        sb.append(", drafter_time: ");
        eyev eyevVar = sdsVar.d;
        if (eyevVar == null) {
            eyevVar = eyev.a;
        }
        sb.append(eyevVar.b);
        sb.append(", acceptance_rate: ");
        sb.append(sdsVar.e);
        sb.append(", drafter_guesses_per_position: ");
        sb.append((String) Collection.EL.stream(sdsVar.c).map(new Function() { // from class: rwg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                sdq sdqVar = (sdq) obj;
                return String.format(Locale.getDefault(), "(%d, %d)", Integer.valueOf(sdqVar.b), Integer.valueOf(sdqVar.c));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
        sb.append("}");
        enhdVar.k("speculativeDecodeStatistics", sb.toString());
        enhdVar.k("numSuffixScoreFiltered", Integer.valueOf(this.B));
        enhdVar.k("numPostDeduped", Integer.valueOf(this.C));
        enhdVar.k("inferenceStatefulSuspensionLatencyMillis", Long.valueOf(this.D));
        enhdVar.k("inferenceStatelessSuspensionLatencyMillis", Long.valueOf(this.E));
        enhdVar.k("topCannedResponseIndex", Integer.valueOf(this.F));
        enhdVar.k("inferenceStatefulSuspensionCount", Integer.valueOf(this.G));
        enhdVar.k("inferenceStatefulResumptionCount", Integer.valueOf(this.H));
        enhdVar.k("inferenceStatelessSuspensionCount", Integer.valueOf(this.I));
        enhdVar.k("inferenceStatelessResumptionCount", Integer.valueOf(this.J));
        enhdVar.k("requestKind", Integer.valueOf(this.K));
        enhdVar.k("initialQueuePosition", Integer.valueOf(this.L));
        enhdVar.k("inferenceStartTimestampMillis", Long.valueOf(this.N));
        enhdVar.k("auxiliaryFileTypes", this.O);
        return "InferenceEventTraceResult\n".concat(ennc.g(enhdVar.c()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, i2);
        dfxk.i(parcel, 2, this.c);
        dfxk.i(parcel, 3, this.d);
        dfxk.i(parcel, 4, this.e);
        dfxk.j(parcel, 5, this.f);
        dfxk.i(parcel, 6, this.g);
        dfxk.i(parcel, 7, this.h);
        dfxk.i(parcel, 8, this.i);
        dfxk.j(parcel, 9, this.j);
        dfxk.j(parcel, 10, this.k);
        dfxk.j(parcel, 11, this.l);
        dfxk.j(parcel, 12, this.m);
        dfxk.j(parcel, 13, this.n);
        dfxk.j(parcel, 14, this.o);
        dfxk.i(parcel, 15, this.p);
        dfxk.i(parcel, 16, this.q);
        dfxk.i(parcel, 17, this.r);
        dfxk.i(parcel, 18, this.s);
        dfxk.d(parcel, 19, this.t);
        dfxk.i(parcel, 20, this.u);
        dfxk.j(parcel, 21, this.v);
        dfxk.g(parcel, 22, this.w);
        dfxk.g(parcel, 23, this.x);
        dfxk.i(parcel, 24, this.y);
        dfxk.h(parcel, 25, this.z);
        dfxk.f(parcel, 26, this.A, false);
        dfxk.i(parcel, 27, this.B);
        dfxk.i(parcel, 28, this.C);
        dfxk.j(parcel, 29, this.D);
        dfxk.j(parcel, 30, this.E);
        dfxk.i(parcel, 31, this.F);
        dfxk.i(parcel, 32, this.G);
        dfxk.i(parcel, 33, this.H);
        dfxk.i(parcel, 34, this.I);
        dfxk.i(parcel, 35, this.J);
        dfxk.i(parcel, 36, this.K);
        dfxk.i(parcel, 37, this.L);
        dfxk.i(parcel, 38, this.M);
        dfxk.j(parcel, 39, this.N);
        dfxk.j(parcel, 40, this.b);
        dfxk.v(parcel, 41, this.O);
        dfxk.c(parcel, a);
    }
}
