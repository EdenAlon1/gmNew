package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drem implements drlg {
    public static final Parcelable.Creator<drem> CREATOR = new drel();
    public final drld a;
    public final String b;
    public final int c;
    public final int d;
    public final drek e;
    private final drme f;
    private final long g;
    private final drlu h;

    public drem(drme drmeVar, drld drldVar, String str, int i, int i2, long j, drek drekVar) {
        drmeVar.getClass();
        drldVar.getClass();
        str.getClass();
        drekVar.getClass();
        this.f = drmeVar;
        this.a = drldVar;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.g = j;
        this.e = drekVar;
        this.h = drld.d;
    }

    @Override // defpackage.drlh, defpackage.doyc
    public final long a() {
        return this.g;
    }

    @Override // defpackage.drlh, defpackage.doyc
    public final /* synthetic */ drlx b() {
        return drle.b(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drem)) {
            return false;
        }
        drem dremVar = (drem) obj;
        return this.f == dremVar.f && ffkj.e(this.a, dremVar.a) && ffkj.e(this.b, dremVar.b) && this.c == dremVar.c && this.d == dremVar.d && this.g == dremVar.g && ffkj.e(this.e, dremVar.e);
    }

    @Override // defpackage.drlh, defpackage.doyc
    public final String f() {
        return this.b;
    }

    @Override // defpackage.doxs
    public final /* synthetic */ doxr fm() {
        return this.e;
    }

    @Override // defpackage.doxs
    public final String fo() {
        Uri parse = Uri.parse(this.b);
        parse.getClass();
        return "Variation(quality=" + this.f + ", format=" + this.a + ", url='" + dqlb.a(parse) + "', widthPx=" + this.c + ", heightPx=" + this.d + ", sizeBytes=" + this.g + ", source=" + this.e + ")";
    }

    @Override // defpackage.drlg
    public final int h() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = (((this.f.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
        long j = this.g;
        return (((((((hashCode * 31) + this.c) * 31) + this.d) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.e.hashCode();
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
        return this.h;
    }

    @Override // defpackage.drlh
    public final drme n() {
        return this.f;
    }

    @Override // defpackage.drlh
    public final Map o() {
        return null;
    }

    public final String toString() {
        return "Variation(quality=" + this.f + ", format=" + this.a + ", url=" + this.b + ", widthPx=" + this.c + ", heightPx=" + this.d + ", sizeBytes=" + this.g + ", source=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f.name());
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.g);
        parcel.writeParcelable(this.e, i);
    }

    @Override // defpackage.doxx
    public final /* synthetic */ Object fn() {
        return this;
    }
}
