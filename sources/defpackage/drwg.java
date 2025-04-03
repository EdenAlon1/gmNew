package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drwg implements Parcelable {
    public static final Parcelable.Creator<drwg> CREATOR;
    public static final drwg a;
    public static final drwg b;
    private static final /* synthetic */ drwg[] c;

    static {
        drwg drwgVar = new drwg("PHOTOS_LINK", 0);
        a = drwgVar;
        drwg drwgVar2 = new drwg("ATTACHMENT", 1);
        b = drwgVar2;
        drwg[] drwgVarArr = {drwgVar, drwgVar2};
        c = drwgVarArr;
        ffhw.a(drwgVarArr);
        CREATOR = new Parcelable.Creator() { // from class: drwf
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return (drwg) Enum.valueOf(drwg.class, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return new drwg[i];
            }
        };
    }

    private drwg(String str, int i) {
    }

    public static drwg[] values() {
        return (drwg[]) c.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
