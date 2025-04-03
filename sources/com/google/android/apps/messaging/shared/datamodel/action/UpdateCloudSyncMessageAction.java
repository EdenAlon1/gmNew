package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateCloudSyncMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import defpackage.axmw;
import defpackage.bazo;
import defpackage.bazp;
import defpackage.cish;
import defpackage.cisl;
import defpackage.dtuu;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.emyl;
import defpackage.eogt;
import defpackage.ffbr;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class UpdateCloudSyncMessageAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bazo();
    public final ffbr a;
    public final ffbr b;
    private final Context c;
    private final cish d;
    private final cisl e;
    private final dtuu f;
    private final axmw g;

    /* compiled from: PG */
    public interface a {
        bazp ir();
    }

    public UpdateCloudSyncMessageAction(Context context, ffbr ffbrVar, ffbr ffbrVar2, cish cishVar, cisl cislVar, dtuu dtuuVar, axmw axmwVar, Parcel parcel) {
        super(parcel, eogt.UPDATE_CLOUD_SYNC_MESSAGE_ACTION);
        this.c = context;
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.d = cishVar;
        this.e = cislVar;
        this.f = dtuuVar;
        this.g = axmwVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("UpdateCloudSyncMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) this.f.c("UpdateCloudSyncMessageAction#executeAction", new emyl() { // from class: bazn
            @Override // defpackage.emyl
            public final Object get() {
                UpdateCloudSyncMessageAction updateCloudSyncMessageAction = UpdateCloudSyncMessageAction.this;
                boolean z = false;
                for (Parcelable parcelable : updateCloudSyncMessageAction.t.D()) {
                    Bundle bundle = (Bundle) parcelable;
                    String string = bundle.getString("com.google.android.apps.messaging.cloudsync.extra.ID");
                    MessageCoreData u = ((bdmq) updateCloudSyncMessageAction.b.b()).u(string);
                    if (u == null) {
                        arrayList.add(string);
                    } else {
                        z |= ((axmt) updateCloudSyncMessageAction.a.b()).e(string, bundle, u);
                    }
                }
                return Boolean.valueOf(z);
            }
        })).booleanValue()) {
            this.d.c();
            this.e.d();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        this.g.d(this.c, (String[]) arrayList.toArray(new String[0]));
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateCloudSyncMessage.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }
}
