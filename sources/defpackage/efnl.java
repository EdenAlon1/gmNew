package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efnl implements Parcelable {
    public static final Parcelable.Creator<efnl> CREATOR = new efnk();
    public final String a;
    public final faje b;
    public final fakk c;
    public final String d;
    public final long e;
    public final engw f;
    private final String g;

    public efnl(String str, String str2, long j, fakk fakkVar, faje fajeVar, String str3, engw engwVar) {
        this.a = str;
        this.g = str2;
        this.e = j;
        this.d = str3;
        this.f = engwVar;
        this.b = fajeVar;
        this.c = fakkVar;
    }

    public final efmm a() {
        return new efmm(this.a, this.g, b(), true != efow.k(this.b) ? 2 : 3);
    }

    public final String b() {
        fakk fakkVar = this.c;
        if (fakkVar != null) {
            return fakkVar.b;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.g);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
        parcel.writeStringList(this.f);
        ProtoParsers.i(parcel, this.b);
        ProtoParsers.i(parcel, this.c);
    }

    public efnl(Parcel parcel) {
        this.a = parcel.readString();
        this.g = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readLong();
        int i = engw.d;
        engw engwVar = enou.a;
        this.f = engwVar;
        parcel.readStringList(engwVar);
        faje fajeVar = faje.a;
        eyfc eyfcVar = eyfc.a;
        eyib eyibVar = eyib.a;
        this.b = (faje) ProtoParsers.a(parcel, fajeVar, eyfc.a);
        this.c = (fakk) ProtoParsers.a(parcel, fakk.a, eyfc.a);
    }
}
