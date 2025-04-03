package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efmm implements Parcelable {
    public static final Parcelable.Creator<efmm> CREATOR = new efml();
    public final String a;
    public final String b;
    private final String c;
    private final int d;

    public efmm(String str, String str2, String str3, int i) {
        this.a = str;
        this.c = str2;
        this.b = str3;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof efmm)) {
            return false;
        }
        efmm efmmVar = (efmm) obj;
        return Objects.equals(this.a, efmmVar.a) && Objects.equals(this.c, efmmVar.c) && Objects.equals(this.b, efmmVar.b) && this.d == efmmVar.d;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.c, this.b, Integer.valueOf(this.d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.c);
        parcel.writeString(this.b);
        int i2 = this.d;
        parcel.writeString(i2 != 1 ? i2 != 2 ? i2 != 3 ? "CONFIDENTIAL" : "STANDARD" : "DISABLED" : "NOT_SET");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public efmm(Parcel parcel) {
        char c;
        this.a = parcel.readString();
        this.c = parcel.readString();
        this.b = parcel.readString();
        String readString = parcel.readString();
        int i = 3;
        switch (readString.hashCode()) {
            case -1446966090:
                if (readString.equals("NOT_SET")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 364290440:
                if (readString.equals("CONFIDENTIAL")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1053567612:
                if (readString.equals("DISABLED")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2095255229:
                if (readString.equals("STANDARD")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            i = 1;
        } else if (c == 1) {
            i = 2;
        } else if (c != 2) {
            if (c != 3) {
                throw new IllegalArgumentException();
            }
            i = 4;
        }
        this.d = i;
    }
}
