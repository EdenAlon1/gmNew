package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ednz extends edlu {
    public static final Parcelable.Creator<ednz> CREATOR = new edny();

    public ednz(String str, String str2, String str3, String str4, edmk edmkVar, List list, edpx edpxVar, edpu edpuVar, edpi edpiVar, edpu edpuVar2, edpu edpuVar3, String str5, String str6, Integer num, String str7, String str8, String str9, LatLng latLng, LatLng latLng2, String str10, String str11, String str12, String str13, String str14, edpi edpiVar2, String str15, String str16, String str17, List list2, List list3, List list4, edqf edqfVar, Integer num2, String str18, String str19, String str20, Double d, edpu edpuVar4, List list5, List list6, edpu edpuVar5, edpu edpuVar6, edpu edpuVar7, edpu edpuVar8, edpu edpuVar9, edpu edpuVar10, edpu edpuVar11, edpu edpuVar12, List list7, Integer num3, Integer num4, Integer num5, LatLngBounds latLngBounds, Uri uri, Uri uri2, edpu edpuVar13, edmh edmhVar, edpm edpmVar, edpo edpoVar, edos edosVar, edpu edpuVar14, edpu edpuVar15, edpu edpuVar16, edpu edpuVar17, edpu edpuVar18, edpu edpuVar19, edpu edpuVar20, edpu edpuVar21, edpu edpuVar22, edpu edpuVar23, edpu edpuVar24, List list8, edow edowVar) {
        super(str, str2, str3, str4, edmkVar, list, edpxVar, edpuVar, edpiVar, edpuVar2, edpuVar3, str5, str6, num, str7, str8, str9, latLng, latLng2, str10, str11, str12, str13, str14, edpiVar2, str15, str16, str17, list2, list3, list4, edqfVar, num2, str18, str19, str20, d, edpuVar4, list5, list6, edpuVar5, edpuVar6, edpuVar7, edpuVar8, edpuVar9, edpuVar10, edpuVar11, edpuVar12, list7, num3, num4, num5, latLngBounds, uri, uri2, edpuVar13, edmhVar, edpmVar, edpoVar, edosVar, edpuVar14, edpuVar15, edpuVar16, edpuVar17, edpuVar18, edpuVar19, edpuVar20, edpuVar21, edpuVar22, edpuVar23, edpuVar24, list8, edowVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.a == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.a);
        }
        if (this.b == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.b);
        }
        if (this.c == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.c);
        }
        if (this.d == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.d);
        }
        parcel.writeParcelable(this.e, i);
        parcel.writeList(this.f);
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
        parcel.writeParcelable(this.i, i);
        parcel.writeParcelable(this.j, i);
        parcel.writeParcelable(this.k, i);
        if (this.l == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.l);
        }
        if (this.m == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.m);
        }
        if (this.n == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(this.n.intValue());
        }
        if (this.o == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.o);
        }
        if (this.p == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.p);
        }
        if (this.q == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.q);
        }
        parcel.writeParcelable(this.r, i);
        parcel.writeParcelable(this.s, i);
        if (this.t == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.t);
        }
        if (this.u == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.u);
        }
        if (this.v == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.v);
        }
        if (this.w == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.w);
        }
        if (this.x == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.x);
        }
        parcel.writeParcelable(this.y, i);
        if (this.z == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.z);
        }
        if (this.A == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.A);
        }
        if (this.B == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.B);
        }
        parcel.writeList(this.C);
        parcel.writeList(this.D);
        parcel.writeList(this.E);
        parcel.writeParcelable(this.F, i);
        if (this.G == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(this.G.intValue());
        }
        if (this.H == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.H);
        }
        if (this.I == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.I);
        }
        if (this.J == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.J);
        }
        if (this.K == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeDouble(this.K.doubleValue());
        }
        parcel.writeParcelable(this.L, i);
        parcel.writeList(this.M);
        parcel.writeList(this.N);
        parcel.writeParcelable(this.O, i);
        parcel.writeParcelable(this.P, i);
        parcel.writeParcelable(this.Q, i);
        parcel.writeParcelable(this.R, i);
        parcel.writeParcelable(this.S, i);
        parcel.writeParcelable(this.T, i);
        parcel.writeParcelable(this.U, i);
        parcel.writeParcelable(this.V, i);
        parcel.writeList(this.W);
        if (this.X == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(this.X.intValue());
        }
        if (this.Y == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(this.Y.intValue());
        }
        if (this.Z == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(this.Z.intValue());
        }
        parcel.writeParcelable(this.aa, i);
        parcel.writeParcelable(this.ab, i);
        parcel.writeParcelable(this.ac, i);
        parcel.writeParcelable(this.ad, i);
        parcel.writeParcelable(this.ae, i);
        parcel.writeParcelable(this.af, i);
        parcel.writeParcelable(this.ag, i);
        parcel.writeParcelable(this.ah, i);
        parcel.writeParcelable(this.ai, i);
        parcel.writeParcelable(this.aj, i);
        parcel.writeParcelable(this.ak, i);
        parcel.writeParcelable(this.al, i);
        parcel.writeParcelable(this.am, i);
        parcel.writeParcelable(this.an, i);
        parcel.writeParcelable(this.ao, i);
        parcel.writeParcelable(this.ap, i);
        parcel.writeParcelable(this.aq, i);
        parcel.writeParcelable(this.ar, i);
        parcel.writeParcelable(this.as, i);
        parcel.writeList(this.at);
        parcel.writeParcelable(this.au, i);
    }
}
