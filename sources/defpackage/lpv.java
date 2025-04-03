package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpv implements Parcelable {
    public static final Parcelable.Creator<lpv> CREATOR = new lpu();
    public final UUID a;
    public final String b;
    public final String c;
    public final byte[] d;
    private int e;

    public lpv(Parcel parcel) {
        this.a = new UUID(parcel.readLong(), parcel.readLong());
        this.b = parcel.readString();
        String readString = parcel.readString();
        int i = lvf.a;
        this.c = readString;
        this.d = parcel.createByteArray();
    }

    public final boolean a(UUID uuid) {
        return lpn.a.equals(this.a) || uuid.equals(this.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lpv)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        lpv lpvVar = (lpv) obj;
        String str = this.b;
        String str2 = lpvVar.b;
        int i = lvf.a;
        return Objects.equals(str, str2) && Objects.equals(this.c, lpvVar.c) && Objects.equals(this.a, lpvVar.a) && Arrays.equals(this.d, lpvVar.d);
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31) + Arrays.hashCode(this.d);
        this.e = hashCode2;
        return hashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a.getMostSignificantBits());
        parcel.writeLong(this.a.getLeastSignificantBits());
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeByteArray(this.d);
    }

    public lpv(UUID uuid, String str, String str2, byte[] bArr) {
        lti.f(uuid);
        this.a = uuid;
        this.b = str;
        lti.f(str2);
        this.c = lre.f(str2);
        this.d = bArr;
    }

    public lpv(UUID uuid, String str, byte[] bArr) {
        this(uuid, null, str, bArr);
    }
}
