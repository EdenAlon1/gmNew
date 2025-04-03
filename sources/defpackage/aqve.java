package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqve implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        azsu azsuVar;
        parcel.getClass();
        eyjv eyjvVar = (eyjv) parcel.readParcelable(aqxw.class.getClassLoader());
        if (eyjvVar == null) {
            throw new IllegalStateException("Self identity id parcelable does not exist.");
        }
        aqxw aqxwVar = (aqxw) eyjvVar.a(aqxx.a((aqxt) aqxw.a.createBuilder()).a(), eyfc.a());
        String str = aqxwVar.c;
        str.getClass();
        if ((aqxwVar.b & 2) != 0) {
            aqxv aqxvVar = aqxwVar.d;
            if (aqxvVar == null) {
                aqxvVar = aqxv.a;
            }
            azsuVar = azsu.a(aqxvVar.b);
        } else {
            azsuVar = null;
        }
        return new SelfIdentityIdImpl(str, Optional.ofNullable(azsuVar));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SelfIdentityIdImpl[i];
    }
}
