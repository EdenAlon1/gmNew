package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessPendingMessagesAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bant extends bbfo {
    private final ffbr a;

    public bant(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    @Override // defpackage.bbfo
    public final /* synthetic */ Action a() {
        return new ProcessPendingMessagesAction();
    }

    @Override // defpackage.bbfo
    public final /* bridge */ /* synthetic */ Action b(int i) {
        ((cqoh) this.a.b()).getClass();
        return new ProcessPendingMessagesAction(i);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        parcel.getClass();
        return new ProcessPendingMessagesAction(parcel);
    }
}
