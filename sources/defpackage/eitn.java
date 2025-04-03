package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eitn implements Parcelable {
    public static final Parcelable.Creator<eitn> CREATOR = new eitm();
    public final eisx a;
    public final eixz b;
    public final eixm c;
    public final Intent d;
    public final eitk e;

    public eitn(Parcel parcel) {
        this.a = (eisx) parcel.readParcelable(eisx.class.getClassLoader());
        try {
            this.b = (eixz) ProtoParsers.a(parcel, eixz.a, eyfc.a());
            this.c = (eixm) parcel.readParcelable(eixm.class.getClassLoader());
            this.d = (Intent) parcel.readParcelable(eixm.class.getClassLoader());
            this.e = (eitk) parcel.readParcelable(eixm.class.getClassLoader());
        } catch (eygu e) {
            throw new IllegalStateException("Failed to convert AccountInfo to Parcelable!", e);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        ProtoParsers.i(parcel, this.b);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.e, 0);
    }

    public eitn(eisx eisxVar, eixz eixzVar, eixm eixmVar, Intent intent, eitk eitkVar) {
        this.a = eisxVar;
        eixzVar.getClass();
        this.b = eixzVar;
        this.c = eixmVar;
        this.d = intent;
        this.e = eitkVar;
    }
}
