package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.label.ui.recategorize.ChangeCategoryCallbackInput;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahjr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ahjs(parcel.readString(), (SuperSortLabel) parcel.readParcelable(ChangeCategoryCallbackInput.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ahjs[i];
    }
}
