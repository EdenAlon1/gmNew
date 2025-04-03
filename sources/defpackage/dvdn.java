package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvdn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        evts evtsVar;
        String readString = parcel.readString();
        exwa exwaVar = null;
        try {
            evtsVar = (evts) ProtoParsers.a(parcel, evts.a, eyfc.a());
        } catch (eygu e) {
            ((ensz) ((ensz) ((ensz) dvdp.b.i()).g(e)).h("com/google/android/libraries/internal/growth/growthkit/internal/common/PromoContext$1", "createFromParcel", (char) 129, "PromoContext.java")).q("Failed to read promotion from parcel");
            evtsVar = null;
        }
        long readLong = parcel.readLong();
        entd entdVar = dvdp.b;
        enhd enhdVar = new enhd();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            enhdVar.k(evxg.b(parcel.readInt()), (Intent) parcel.readParcelable(Intent.class.getClassLoader()));
        }
        enhk c = enhdVar.c();
        String readString2 = parcel.readString();
        if (parcel.readInt() > 0) {
            try {
                exwaVar = (exwa) ProtoParsers.a(parcel, exwa.a, eyfc.a());
            } catch (eygu e2) {
                ((ensz) ((ensz) ((ensz) dvdp.b.i()).g(e2)).h("com/google/android/libraries/internal/growth/growthkit/internal/common/PromoContext$1", "createFromParcel", (char) 145, "PromoContext.java")).q("Failed to read versioned identifier from parcel");
            }
        }
        dvdo g = dvdp.g();
        dvdi dvdiVar = (dvdi) g;
        dvdiVar.a = readString;
        g.c(evtsVar);
        g.d(readLong);
        g.b(c);
        dvdiVar.b = exwaVar;
        dvdiVar.c = readString2;
        return g.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new dvdp[i];
    }
}
