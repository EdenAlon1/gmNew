package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.bafq;
import defpackage.bafr;
import defpackage.coxb;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class HandleLowStorageAction extends Action<Boolean> implements Parcelable {
    public static final Parcelable.Creator<Action<Boolean>> CREATOR = new bafq();
    private final coxb a;

    /* compiled from: PG */
    public interface a {
        bafr hO();
    }

    public HandleLowStorageAction(coxb coxbVar, Parcel parcel) {
        super(parcel, eogt.HANDLE_LOW_STORAGE_ACTION);
        this.a = coxbVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("HandleLowStorageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        boolean z;
        int i;
        String l = this.t.l("deletion_target");
        int hashCode = l.hashCode();
        if (hashCode != -1883682684) {
            if (hashCode == -661444761 && l.equals("MEDIA_MESSAGES")) {
                z = false;
            }
            z = -1;
        } else {
            if (l.equals("OLD_MESSAGES")) {
                z = true;
            }
            z = -1;
        }
        if (!z) {
            i = 1;
        } else {
            if (!z) {
                throw new IllegalArgumentException();
            }
            i = 2;
        }
        this.a.c(i - 1, this.t.d("cutoff_duration_millis"));
        return true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.HandleLowStorage.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public HandleLowStorageAction(coxb coxbVar, int i, long j) {
        super(eogt.HANDLE_LOW_STORAGE_ACTION);
        this.a = coxbVar;
        this.t.v("deletion_target", i != 1 ? "OLD_MESSAGES" : "MEDIA_MESSAGES");
        this.t.s("cutoff_duration_millis", j);
    }
}
