package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqzn implements drnj {
    public static final Parcelable.Creator<dqzn> CREATOR = new dqzm();
    public static final dqzn a;
    public static final dqzn b;
    public final droa c;

    static {
        drnx drnxVar = (drnx) droa.a.createBuilder();
        drnxVar.getClass();
        drny drnyVar = (drny) drnz.a.createBuilder();
        drnyVar.getClass();
        droq.c(dror.a(drnyVar), drnxVar);
        a = new dqzn(droq.a(drnxVar));
        drnx drnxVar2 = (drnx) droa.a.createBuilder();
        drnxVar2.getClass();
        drnv drnvVar = (drnv) drnw.a.createBuilder();
        drnvVar.getClass();
        droq.b(drop.a(drnvVar), drnxVar2);
        b = new dqzn(droq.a(drnxVar2));
    }

    public dqzn(droa droaVar) {
        droaVar.getClass();
        this.c = droaVar;
    }

    public final boolean a() {
        return this.c.b == 100;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqzn) && ffkj.e(this.c, ((dqzn) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "EmotifySource(customStickerSource=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeByteArray(this.c.toByteArray());
    }
}
