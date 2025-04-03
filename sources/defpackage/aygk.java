package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aygk implements ComposeRowState {
    public static final Parcelable.Creator<aygk> CREATOR = new aygj();
    private final IncomingDraft a;
    private final int b;

    public aygk() {
        this(null, 0);
    }

    @Override // com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState
    public final IncomingDraft a() {
        return this.a;
    }

    @Override // com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState
    public final int b() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aygk)) {
            return false;
        }
        aygk aygkVar = (aygk) obj;
        return ffkj.e(this.a, aygkVar.a) && this.b == aygkVar.b;
    }

    public final int hashCode() {
        IncomingDraft incomingDraft = this.a;
        int hashCode = incomingDraft == null ? 0 : incomingDraft.hashCode();
        int i = this.b;
        return (hashCode * 31) + (i != 0 ? i : 0);
    }

    public final String toString() {
        return "ComposeRowState(incomingDraft=" + this.a + ", input=" + ((Object) aygz.a(this.b)) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        int i2 = this.b;
        if (i2 == 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aygz.a(i2));
        }
    }

    public aygk(IncomingDraft incomingDraft, int i) {
        this.a = incomingDraft;
        this.b = i;
        if (incomingDraft == null && i == 0) {
            throw new aygs();
        }
    }
}
