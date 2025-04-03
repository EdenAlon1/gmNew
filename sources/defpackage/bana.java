package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessExpressiveStickerFavoriteAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bana implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((ProcessExpressiveStickerFavoriteAction.a) ctba.a(ProcessExpressiveStickerFavoriteAction.a.class)).ia().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProcessExpressiveStickerFavoriteAction[i];
    }
}
