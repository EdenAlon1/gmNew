package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drnl implements drnm, drlg {
    public static final Parcelable.Creator<drnl> CREATOR = new drnk();
    public final drnd a;
    public final String b;
    public final int c;
    public final int d;
    public final Instant e;
    public final doxr f;
    public final Duration g;
    private final Map h;
    private final String i;
    private final long j;

    public drnl(drnd drndVar, String str, Map map, String str2, int i, int i2, long j, Instant instant, doxr doxrVar, Duration duration) {
        drndVar.getClass();
        str.getClass();
        instant.getClass();
        doxrVar.getClass();
        duration.getClass();
        this.a = drndVar;
        this.b = str;
        this.h = map;
        this.i = str2;
        this.c = i;
        this.d = i2;
        this.j = j;
        this.e = instant;
        this.f = doxrVar;
        this.g = duration;
    }

    @Override // defpackage.drlh, defpackage.doyc
    public final long a() {
        return this.j;
    }

    @Override // defpackage.drnn, defpackage.drlh, defpackage.doyc
    public final /* synthetic */ drlx b() {
        return drne.a(this);
    }

    @Override // defpackage.doyc
    public final Instant c() {
        return this.e;
    }

    @Override // defpackage.doyc
    public final String d() {
        return this.i;
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
        if (!(obj instanceof drnl)) {
            return false;
        }
        drnl drnlVar = (drnl) obj;
        return ffkj.e(this.a, drnlVar.a) && ffkj.e(this.b, drnlVar.b) && ffkj.e(this.h, drnlVar.h) && ffkj.e(this.i, drnlVar.i) && this.c == drnlVar.c && this.d == drnlVar.d && this.j == drnlVar.j && ffkj.e(this.e, drnlVar.e) && ffkj.e(this.f, drnlVar.f) && ffkj.e(this.g, drnlVar.g);
    }

    @Override // defpackage.drlh, defpackage.doyc
    public final String f() {
        return this.b;
    }

    @Override // defpackage.doxs
    public final doxr fm() {
        return this.f;
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
        return this.d;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Map map = this.h;
        int hashCode2 = ((hashCode * 31) + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.i;
        int hashCode3 = (((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.c) * 31) + this.d) * 31;
        long j = this.j;
        return ((((((hashCode3 + ((int) (j ^ (j >>> 32)))) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    @Override // defpackage.drlg
    public final int i() {
        return this.c;
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
        return "Video(format=" + this.a + ", url=" + this.b + ", headers=" + this.h + ", displayName=" + this.i + ", widthPx=" + this.c + ", heightPx=" + this.d + ", sizeBytes=" + this.j + ", dateModified=" + this.e + ", source=" + this.f + ", duration=" + this.g + ")";
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
        parcel.writeString(this.i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.j);
        parcel.writeSerializable(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeSerializable(this.g);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ drnl(defpackage.drnd r3, java.lang.String r4, java.util.Map r5, java.lang.String r6, int r7, int r8, long r9, j$.time.Instant r11, defpackage.doxr r12, j$.time.Duration r13, int r14) {
        /*
            r2 = this;
            r0 = r14 & 4
            r1 = 0
            if (r0 == 0) goto L6
            r5 = r1
        L6:
            r14 = r14 & 8
            if (r14 == 0) goto L12
            r14 = r13
            r13 = r12
            r12 = r11
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r1
            goto L19
        L12:
            r14 = r13
            r13 = r12
            r12 = r11
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
        L19:
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drnl.<init>(drnd, java.lang.String, java.util.Map, java.lang.String, int, int, long, j$.time.Instant, doxr, j$.time.Duration, int):void");
    }
}
