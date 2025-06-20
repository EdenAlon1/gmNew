package defpackage;

import android.database.MatrixCursor;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.internal.MatrixCursorParcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhir implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        int readInt2 = parcel.readInt();
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        if (readInt == 0 && readInt2 == 0) {
            matrixCursor = null;
        } else {
            for (int i = 0; i < readInt2; i++) {
                matrixCursor.addRow(parcel.readArray(Object.class.getClassLoader()));
            }
        }
        return new MatrixCursorParcelable(matrixCursor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MatrixCursorParcelable[i];
    }
}
