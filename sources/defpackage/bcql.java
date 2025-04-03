package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcql extends bcxc {
    public final MessageIdType a;
    public final String b;
    public final String c;
    public final Uri d;
    public final Uri e;
    public final int f;
    public final int g;
    public final long h;
    public final long i;
    public final eohh j;
    public final String k;
    public final String l;
    public final long m;
    public final LocationInformation n;
    public final String o;
    public final String p;
    public final String q;
    public final dteh r;
    public final long s;
    public final byza t;
    public final int u;
    public final boolean v;
    public final boolean w;
    public final awap x;
    public final byyz y;
    public final byzh z;

    public bcql(MessageIdType messageIdType, String str, String str2, Uri uri, Uri uri2, int i, int i2, long j, long j2, eohh eohhVar, String str3, String str4, long j3, LocationInformation locationInformation, String str5, String str6, String str7, dteh dtehVar, long j4, byza byzaVar, int i3, boolean z, boolean z2, awap awapVar, byyz byyzVar, byzh byzhVar) {
        this.a = messageIdType;
        this.b = str;
        this.c = str2;
        this.d = uri;
        this.e = uri2;
        this.f = i;
        this.g = i2;
        this.h = j;
        this.i = j2;
        this.j = eohhVar;
        this.k = str3;
        this.l = str4;
        this.m = j3;
        this.n = locationInformation;
        this.o = str5;
        this.p = str6;
        this.q = str7;
        this.r = dtehVar;
        this.s = j4;
        this.t = byzaVar;
        this.u = i3;
        this.v = z;
        this.w = z2;
        this.x = awapVar;
        this.y = byyzVar;
        this.z = byzhVar;
    }

    @Override // defpackage.bcxc
    public final int a() {
        return this.u;
    }

    @Override // defpackage.bcxc
    public final int b() {
        return this.g;
    }

    @Override // defpackage.bcxc
    public final int c() {
        return this.f;
    }

    @Override // defpackage.bcxc
    public final long d() {
        return this.h;
    }

    @Override // defpackage.bcxc
    public final long e() {
        return this.s;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        Uri uri;
        Uri uri2;
        String str3;
        String str4;
        LocationInformation locationInformation;
        String str5;
        String str6;
        String str7;
        dteh dtehVar;
        awap awapVar;
        byyz byyzVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcxc) {
            bcxc bcxcVar = (bcxc) obj;
            if (this.a.equals(bcxcVar.k()) && ((str = this.b) != null ? str.equals(bcxcVar.u()) : bcxcVar.u() == null) && ((str2 = this.c) != null ? str2.equals(bcxcVar.r()) : bcxcVar.r() == null) && ((uri = this.d) != null ? uri.equals(bcxcVar.h()) : bcxcVar.h() == null) && ((uri2 = this.e) != null ? uri2.equals(bcxcVar.i()) : bcxcVar.i() == null)) {
                bcxcVar.A();
                if (this.f == bcxcVar.c() && this.g == bcxcVar.b() && this.h == bcxcVar.d()) {
                    bcxcVar.B();
                    if (this.i == bcxcVar.g() && this.j.equals(bcxcVar.q()) && ((str3 = this.k) != null ? str3.equals(bcxcVar.x()) : bcxcVar.x() == null) && ((str4 = this.l) != null ? str4.equals(bcxcVar.w()) : bcxcVar.w() == null) && this.m == bcxcVar.f() && ((locationInformation = this.n) != null ? locationInformation.equals(bcxcVar.o()) : bcxcVar.o() == null) && ((str5 = this.o) != null ? str5.equals(bcxcVar.s()) : bcxcVar.s() == null) && ((str6 = this.p) != null ? str6.equals(bcxcVar.t()) : bcxcVar.t() == null) && ((str7 = this.q) != null ? str7.equals(bcxcVar.v()) : bcxcVar.v() == null) && ((dtehVar = this.r) != null ? dtehVar.equals(bcxcVar.p()) : bcxcVar.p() == null) && this.s == bcxcVar.e() && this.t.equals(bcxcVar.m()) && this.u == bcxcVar.a() && this.v == bcxcVar.y() && this.w == bcxcVar.z() && ((awapVar = this.x) != null ? awapVar.equals(bcxcVar.j()) : bcxcVar.j() == null) && ((byyzVar = this.y) != null ? byyzVar.equals(bcxcVar.l()) : bcxcVar.l() == null) && this.z.equals(bcxcVar.n())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.bcxc
    public final long f() {
        return this.m;
    }

    @Override // defpackage.bcxc
    public final long g() {
        return this.i;
    }

    @Override // defpackage.bcxc
    public final Uri h() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int hashCode2 = ((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Uri uri = this.d;
        int hashCode4 = (hashCode3 ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        Uri uri2 = this.e;
        int hashCode5 = (((((hashCode4 ^ (uri2 == null ? 0 : uri2.hashCode())) * (-721379959)) ^ this.f) * 1000003) ^ this.g) * 1000003;
        long j = this.h;
        long j2 = this.i;
        int hashCode6 = (((((hashCode5 ^ ((int) (j ^ (j >>> 32)))) * (-721379959)) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.j.hashCode()) * 1000003;
        String str3 = this.k;
        int hashCode7 = (hashCode6 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.l;
        int hashCode8 = str4 == null ? 0 : str4.hashCode();
        long j3 = this.m;
        int i = (((hashCode7 ^ hashCode8) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        LocationInformation locationInformation = this.n;
        int hashCode9 = (i ^ (locationInformation == null ? 0 : locationInformation.hashCode())) * 1000003;
        String str5 = this.o;
        int hashCode10 = (hashCode9 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.p;
        int hashCode11 = (hashCode10 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.q;
        int hashCode12 = (hashCode11 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        dteh dtehVar = this.r;
        int hashCode13 = dtehVar == null ? 0 : dtehVar.hashCode();
        long j4 = this.s;
        int hashCode14 = (((((((((((hashCode12 ^ hashCode13) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ this.t.hashCode()) * 1000003) ^ this.u) * 1000003) ^ (true != this.v ? 1237 : 1231)) * 1000003) ^ (true == this.w ? 1231 : 1237)) * 1000003;
        awap awapVar = this.x;
        int hashCode15 = (hashCode14 ^ (awapVar == null ? 0 : awapVar.hashCode())) * 1000003;
        byyz byyzVar = this.y;
        return ((hashCode15 ^ (byyzVar != null ? byyzVar.hashCode() : 0)) * 1000003) ^ this.z.hashCode();
    }

    @Override // defpackage.bcxc
    public final Uri i() {
        return this.e;
    }

    @Override // defpackage.bcxc
    public final awap j() {
        return this.x;
    }

    @Override // defpackage.bcxc
    public final MessageIdType k() {
        return this.a;
    }

    @Override // defpackage.bcxc
    public final byyz l() {
        return this.y;
    }

    @Override // defpackage.bcxc
    public final byza m() {
        return this.t;
    }

    @Override // defpackage.bcxc
    public final byzh n() {
        return this.z;
    }

    @Override // defpackage.bcxc
    public final LocationInformation o() {
        return this.n;
    }

    @Override // defpackage.bcxc
    public final dteh p() {
        return this.r;
    }

    @Override // defpackage.bcxc
    public final eohh q() {
        return this.j;
    }

    @Override // defpackage.bcxc
    public final String r() {
        return this.c;
    }

    @Override // defpackage.bcxc
    public final String s() {
        return this.o;
    }

    @Override // defpackage.bcxc
    public final String t() {
        return this.p;
    }

    public final String toString() {
        byzh byzhVar = this.z;
        byyz byyzVar = this.y;
        awap awapVar = this.x;
        byza byzaVar = this.t;
        dteh dtehVar = this.r;
        LocationInformation locationInformation = this.n;
        eohh eohhVar = this.j;
        Uri uri = this.e;
        Uri uri2 = this.d;
        String obj = this.a.toString();
        String valueOf = String.valueOf(uri2);
        String valueOf2 = String.valueOf(uri);
        String obj2 = eohhVar.toString();
        String valueOf3 = String.valueOf(locationInformation);
        String valueOf4 = String.valueOf(dtehVar);
        String obj3 = byzaVar.toString();
        String valueOf5 = String.valueOf(awapVar);
        String valueOf6 = String.valueOf(byyzVar);
        String obj4 = byzhVar.toString();
        StringBuilder sb = new StringBuilder("MessagePartDataValues{messageId=");
        sb.append(obj);
        sb.append(", messageText=");
        sb.append(this.b);
        sb.append(", contentType=");
        sb.append(this.c);
        sb.append(", contentUri=");
        sb.append(valueOf);
        sb.append(", originalUri=");
        sb.append(valueOf2);
        sb.append(", fallbackUri=null, width=");
        sb.append(this.f);
        sb.append(", height=");
        sb.append(this.g);
        sb.append(", duration=");
        sb.append(this.h);
        sb.append(", outputUri=null, targetFileSize=");
        sb.append(this.i);
        sb.append(", source=");
        sb.append(obj2);
        sb.append(", stickerSetId=");
        sb.append(this.k);
        sb.append(", stickerId=");
        sb.append(this.l);
        sb.append(", mediaModifiedTimestamp=");
        sb.append(this.m);
        sb.append(", locationInfo=");
        sb.append(valueOf3);
        sb.append(", expressiveStickerName=");
        sb.append(this.o);
        sb.append(", fileName=");
        sb.append(this.p);
        sb.append(", previewContentType=");
        sb.append(this.q);
        sb.append(", voiceMetadata=");
        sb.append(valueOf4);
        sb.append(", fileSizeBytes=");
        sb.append(this.s);
        sb.append(", mediaSendType=");
        sb.append(obj3);
        sb.append(", bundleIndex=");
        sb.append(this.u);
        boolean z = this.w;
        boolean z2 = this.v;
        sb.append(", preserveSize=");
        sb.append(z2);
        sb.append(", saveToExternalStorage=");
        sb.append(z);
        sb.append(", processingId=");
        sb.append(valueOf5);
        sb.append(", imageDisplayState=");
        sb.append(valueOf6);
        sb.append(", richCardMediaDownloadFailureReason=");
        sb.append(obj4);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.bcxc
    public final String u() {
        return this.b;
    }

    @Override // defpackage.bcxc
    public final String v() {
        return this.q;
    }

    @Override // defpackage.bcxc
    public final String w() {
        return this.l;
    }

    @Override // defpackage.bcxc
    public final String x() {
        return this.k;
    }

    @Override // defpackage.bcxc
    public final boolean y() {
        return this.v;
    }

    @Override // defpackage.bcxc
    public final boolean z() {
        return this.w;
    }

    @Override // defpackage.bcxc
    public final void A() {
    }

    @Override // defpackage.bcxc
    public final void B() {
    }
}
