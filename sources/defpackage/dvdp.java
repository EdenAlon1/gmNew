package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dvdp implements Parcelable {
    public static final entd b = entd.c("GnpSdk");
    public static final Parcelable.Creator<dvdp> CREATOR = new dvdn();

    public static dvdo g() {
        dvdi dvdiVar = new dvdi();
        dvdiVar.b(enoz.a);
        return dvdiVar;
    }

    public abstract long a();

    public abstract enhk b();

    public abstract evts c();

    public abstract exwa d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract String e();

    public abstract String f();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(e());
        ProtoParsers.i(parcel, c());
        parcel.writeLong(a());
        enhk b2 = b();
        parcel.writeInt(b2.size());
        Iterator it = b2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            parcel.writeInt(((evxg) entry.getKey()).f);
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
        parcel.writeString(f());
        exwa d = d();
        parcel.writeInt(d != null ? 1 : 0);
        if (d != null) {
            ProtoParsers.i(parcel, d());
        }
    }
}
