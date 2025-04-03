package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drni implements drnm, drlg {
    public static final Parcelable.Creator<drni> CREATOR = new drnh();
    public final drld a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final Instant f;
    public final doxr g;
    private final Map h;
    private final long i;

    public drni(drld drldVar, String str, Map map, String str2, int i, int i2, long j, Instant instant, doxr doxrVar) {
        drldVar.getClass();
        str.getClass();
        instant.getClass();
        doxrVar.getClass();
        this.a = drldVar;
        this.b = str;
        this.h = map;
        this.c = str2;
        this.d = i;
        this.e = i2;
        this.i = j;
        this.f = instant;
        this.g = doxrVar;
    }

    @Override // defpackage.drlh, defpackage.doyc
    public final long a() {
        return this.i;
    }

    @Override // defpackage.drnn, defpackage.drlh, defpackage.doyc
    public final /* synthetic */ drlx b() {
        return drne.a(this);
    }

    @Override // defpackage.doyc
    public final Instant c() {
        return this.f;
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
        if (!(obj instanceof drni)) {
            return false;
        }
        drni drniVar = (drni) obj;
        return ffkj.e(this.a, drniVar.a) && ffkj.e(this.b, drniVar.b) && ffkj.e(this.h, drniVar.h) && ffkj.e(this.c, drniVar.c) && this.d == drniVar.d && this.e == drniVar.e && this.i == drniVar.i && ffkj.e(this.f, drniVar.f) && ffkj.e(this.g, drniVar.g);
    }

    @Override // defpackage.drlh, defpackage.doyc
    public final String f() {
        return this.b;
    }

    @Override // defpackage.doxs
    public final doxr fm() {
        return this.g;
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

    @Override // defpackage.drlg
    public final int h() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Map map = this.h;
        int hashCode2 = ((hashCode * 31) + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.d) * 31) + this.e) * 31;
        long j = this.i;
        return ((((hashCode3 + ((int) (j ^ (j >>> 32)))) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    @Override // defpackage.drlg
    public final int i() {
        return this.d;
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
        return this.h;
    }

    public final String toString() {
        return "Image(format=" + this.a + ", url=" + this.b + ", headers=" + this.h + ", displayName=" + this.c + ", widthPx=" + this.d + ", heightPx=" + this.e + ", sizeBytes=" + this.i + ", dateModified=" + this.f + ", source=" + this.g + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        Map map = this.h;
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
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeLong(this.i);
        parcel.writeSerializable(this.f);
        parcel.writeParcelable(this.g, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ drni(defpackage.drld r3, java.lang.String r4, java.util.Map r5, java.lang.String r6, int r7, int r8, long r9, j$.time.Instant r11, defpackage.doxr r12, int r13) {
        /*
            r2 = this;
            r0 = r13 & 4
            r1 = 0
            if (r0 == 0) goto L6
            r5 = r1
        L6:
            r13 = r13 & 8
            if (r13 == 0) goto L11
            r13 = r12
            r12 = r11
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r1
            goto L17
        L11:
            r13 = r12
            r12 = r11
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
        L17:
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drni.<init>(drld, java.lang.String, java.util.Map, java.lang.String, int, int, long, j$.time.Instant, doxr, int):void");
    }
}
