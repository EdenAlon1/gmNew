package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drng implements drnn, drlh {
    public static final Parcelable.Creator<drng> CREATOR = new drnf();
    public final drjx a;
    public final String b;
    public final String c;
    public final doxr d;
    public final Duration e;
    public final dteh f;
    private final Map g;
    private final long h;
    private final Instant i;

    public drng(drjx drjxVar, String str, Map map, String str2, long j, Instant instant, doxr doxrVar, Duration duration, dteh dtehVar) {
        drjxVar.getClass();
        str.getClass();
        instant.getClass();
        doxrVar.getClass();
        duration.getClass();
        dtehVar.getClass();
        this.a = drjxVar;
        this.b = str;
        this.g = map;
        this.c = str2;
        this.h = j;
        this.i = instant;
        this.d = doxrVar;
        this.e = duration;
        this.f = dtehVar;
    }

    public static /* synthetic */ drng h(drng drngVar, dteh dtehVar) {
        return new drng(drngVar.a, drngVar.b, drngVar.g, drngVar.c, drngVar.h, drngVar.i, drngVar.d, drngVar.e, dtehVar);
    }

    @Override // defpackage.drlh, defpackage.doyc
    public final long a() {
        return this.h;
    }

    @Override // defpackage.drnn, defpackage.drlh, defpackage.doyc
    public final /* synthetic */ drlx b() {
        return drne.a(this);
    }

    @Override // defpackage.doyc
    public final Instant c() {
        return this.i;
    }

    @Override // defpackage.doyc
    public final String d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.doyc
    public final /* synthetic */ String e() {
        return doxy.b(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drng)) {
            return false;
        }
        drng drngVar = (drng) obj;
        return ffkj.e(this.a, drngVar.a) && ffkj.e(this.b, drngVar.b) && ffkj.e(this.g, drngVar.g) && ffkj.e(this.c, drngVar.c) && this.h == drngVar.h && ffkj.e(this.i, drngVar.i) && ffkj.e(this.d, drngVar.d) && ffkj.e(this.e, drngVar.e) && ffkj.e(this.f, drngVar.f);
    }

    @Override // defpackage.drlh, defpackage.doyc
    public final String f() {
        return this.b;
    }

    @Override // defpackage.doxs
    public final doxr fm() {
        return this.d;
    }

    @Override // defpackage.doxx
    public final /* bridge */ /* synthetic */ Object fn() {
        Object e;
        e = e();
        return e;
    }

    @Override // defpackage.doxs
    public final /* synthetic */ String fo() {
        return toString();
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Map map = this.g;
        int hashCode2 = ((hashCode * 31) + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = str != null ? str.hashCode() : 0;
        long j = this.h;
        return ((((((((((hashCode2 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.i.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    @Override // defpackage.drlh
    public final /* synthetic */ drka l() {
        return this.a;
    }

    @Override // defpackage.drlh, defpackage.drlj
    public final /* synthetic */ drlw m() {
        return drle.a(this);
    }

    @Override // defpackage.drlh
    public final /* synthetic */ drme n() {
        return drme.d;
    }

    @Override // defpackage.drlh
    public final Map o() {
        return this.g;
    }

    public final String toString() {
        return "Audio(format=" + this.a + ", url=" + this.b + ", headers=" + this.g + ", displayName=" + this.c + ", sizeBytes=" + this.h + ", dateModified=" + this.i + ", source=" + this.d + ", duration=" + this.e + ", voiceMetadata=" + this.f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        Map map = this.g;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeString(this.c);
        parcel.writeLong(this.h);
        parcel.writeSerializable(this.i);
        parcel.writeParcelable(this.d, i);
        parcel.writeSerializable(this.e);
        ProtoParsers.i(parcel, this.f);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ drng(defpackage.drjx r14, java.lang.String r15, java.util.Map r16, java.lang.String r17, long r18, j$.time.Instant r20, defpackage.doxr r21, j$.time.Duration r22, defpackage.dteh r23, int r24) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto La
            dteh r1 = defpackage.dteh.a
            r12 = r1
            goto Lc
        La:
            r12 = r23
        Lc:
            r1 = r0 & 8
            r0 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L15
            r6 = r2
            goto L17
        L15:
            r6 = r17
        L17:
            if (r0 == 0) goto L26
            r5 = r2
            r3 = r14
            r4 = r15
            r7 = r18
            r9 = r20
            r10 = r21
            r11 = r22
            r2 = r13
            goto L33
        L26:
            r5 = r16
            r2 = r13
            r3 = r14
            r4 = r15
            r7 = r18
            r9 = r20
            r10 = r21
            r11 = r22
        L33:
            r2.<init>(r3, r4, r5, r6, r7, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drng.<init>(drjx, java.lang.String, java.util.Map, java.lang.String, long, j$.time.Instant, doxr, j$.time.Duration, dteh, int):void");
    }
}
