package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqzc implements drnm, drlg {
    public static final Parcelable.Creator<dqzc> CREATOR = new dqzb();
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final drld e;
    public final String f;
    public final int g;
    public final int h;
    private final Map i;
    private final long j;
    private final Instant k;
    private final doxr l;

    public /* synthetic */ dqzc(String str, String str2, String str3, boolean z, drld drldVar, Map map, String str4, int i, int i2, long j, Instant instant, doxr doxrVar, int i3) {
        doxr doxrVar2;
        drld drldVar2 = (i3 & 16) != 0 ? drku.a : drldVar;
        Map map2 = (i3 & 32) != 0 ? null : map;
        String str5 = (i3 & 64) != 0 ? null : str4;
        int i4 = (i3 & 128) != 0 ? 512 : i;
        int i5 = (i3 & 256) == 0 ? i2 : 512;
        long j2 = (i3 & 512) != 0 ? 0L : j;
        Instant instant2 = (i3 & 1024) != 0 ? Instant.EPOCH : instant;
        boolean z2 = ((i3 & 8) == 0) & z;
        if ((i3 & 2048) != 0) {
            drnx drnxVar = (drnx) droa.a.createBuilder();
            drnxVar.getClass();
            if (z2) {
                drny drnyVar = (drny) drnz.a.createBuilder();
                drnyVar.getClass();
                droq.c(dror.a(drnyVar), drnxVar);
            } else {
                drnv drnvVar = (drnv) drnw.a.createBuilder();
                drnvVar.getClass();
                droq.b(drop.a(drnvVar), drnxVar);
            }
            doxrVar2 = new dqzn(droq.a(drnxVar));
        } else {
            doxrVar2 = doxrVar;
        }
        String str6 = (i3 & 4) == 0 ? str3 : null;
        str.getClass();
        str2.getClass();
        drldVar2.getClass();
        instant2.getClass();
        doxrVar2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str6;
        this.d = z2;
        this.e = drldVar2;
        this.i = map2;
        this.f = str5;
        this.g = i4;
        this.h = i5;
        this.j = j2;
        this.k = instant2;
        this.l = doxrVar2;
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
        return this.k;
    }

    @Override // defpackage.doyc
    public final String d() {
        return this.f;
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
        if (!(obj instanceof dqzc)) {
            return false;
        }
        dqzc dqzcVar = (dqzc) obj;
        return ffkj.e(this.a, dqzcVar.a) && ffkj.e(this.b, dqzcVar.b) && ffkj.e(this.c, dqzcVar.c) && this.d == dqzcVar.d && ffkj.e(this.e, dqzcVar.e) && ffkj.e(this.i, dqzcVar.i) && ffkj.e(this.f, dqzcVar.f) && this.g == dqzcVar.g && this.h == dqzcVar.h && this.j == dqzcVar.j && ffkj.e(this.k, dqzcVar.k) && ffkj.e(this.l, dqzcVar.l);
    }

    @Override // defpackage.drlh, defpackage.doyc
    public final String f() {
        return this.b;
    }

    @Override // defpackage.doxs
    public final doxr fm() {
        return this.l;
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
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        int hashCode2 = ((((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + (true != this.d ? 1237 : 1231)) * 31) + this.e.hashCode()) * 31;
        Map map = this.i;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.f;
        int hashCode4 = (((((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.g) * 31) + this.h) * 31;
        long j = this.j;
        return ((((hashCode4 + ((int) (j ^ (j >>> 32)))) * 31) + this.k.hashCode()) * 31) + this.l.hashCode();
    }

    @Override // defpackage.drlg
    public final int i() {
        return this.g;
    }

    @Override // defpackage.drlh
    public final /* synthetic */ drka l() {
        return this.e;
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
        return this.i;
    }

    public final String toString() {
        return "CustomSticker(id=" + this.a + ", url=" + this.b + ", originId=" + this.c + ", selfOwned=" + this.d + ", format=" + this.e + ", headers=" + this.i + ", displayName=" + this.f + ", widthPx=" + this.g + ", heightPx=" + this.h + ", sizeBytes=" + this.j + ", dateModified=" + this.k + ", source=" + this.l + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeParcelable(this.e, i);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
    }
}
