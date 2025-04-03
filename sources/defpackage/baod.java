package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessRevocationSentAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baod implements bbck {
    private final ffbr a;

    public baod(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    @Override // defpackage.bbck
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ProcessRevocationSentAction c(Parcel parcel) {
        parcel.getClass();
        return new ProcessRevocationSentAction(this.a, parcel);
    }

    public final ProcessRevocationSentAction b(bdhg bdhgVar) {
        return new ProcessRevocationSentAction(this.a, bdhgVar);
    }
}
