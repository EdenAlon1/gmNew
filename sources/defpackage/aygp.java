package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowStateWithSource;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aygp implements ComposeRowStateWithSource {
    public static final Parcelable.Creator<aygp> CREATOR = new aygo();
    private final ComposeRowState a;
    private final int b;
    private final int c;

    public aygp(ComposeRowState composeRowState, int i, int i2) {
        composeRowState.getClass();
        if (i == 0 || i2 == 0) {
            throw null;
        }
        this.a = composeRowState;
        this.b = i;
        this.c = i2;
    }

    public static /* synthetic */ aygp c(aygp aygpVar, int i, int i2, int i3) {
        ComposeRowState composeRowState = (i3 & 1) != 0 ? aygpVar.a : null;
        if ((i3 & 2) != 0) {
            i = aygpVar.b;
        }
        if ((i3 & 4) != 0) {
            i2 = aygpVar.c;
        }
        composeRowState.getClass();
        if (i == 0) {
            throw null;
        }
        if (i2 != 0) {
            return new aygp(composeRowState, i, i2);
        }
        throw null;
    }

    @Override // com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState
    public final IncomingDraft a() {
        return this.a.a();
    }

    @Override // com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState
    public final int b() {
        return this.a.b();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aygk) {
            return ffkj.e(this.a, obj);
        }
        if (obj instanceof aygp) {
            return ffkj.e(this.a, ((aygp) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComposeRowState(incomingDraft=" + a() + ", input=" + ((Object) aygz.a(b())) + ", readSource=" + ((Object) aygm.a(this.c)) + ", writeSource=" + ((Object) aygm.a(this.b)) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeString(aygm.a(this.b));
        parcel.writeString(aygm.a(this.c));
    }

    public /* synthetic */ aygp(ComposeRowState composeRowState, int i, int i2, int i3) {
        this(composeRowState, (i3 & 2) != 0 ? 1 : i, (i3 & 4) != 0 ? 1 : i2);
    }
}
