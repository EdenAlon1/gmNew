package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateContactDisambiguationAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bazr implements bbck {
    public bazr(ffbr ffbrVar) {
        ffbrVar.getClass();
    }

    public static final UpdateContactDisambiguationAction a(Parcel parcel) {
        parcel.getClass();
        return new UpdateContactDisambiguationAction(parcel);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        return a(parcel);
    }
}
