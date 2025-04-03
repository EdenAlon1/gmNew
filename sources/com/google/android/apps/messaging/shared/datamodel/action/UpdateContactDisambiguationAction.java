package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.bazq;
import defpackage.bsvm;
import defpackage.bswf;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class UpdateContactDisambiguationAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bazq();

    /* compiled from: PG */
    public interface a {
        void jg();
    }

    public UpdateContactDisambiguationAction(Parcel parcel) {
        super(parcel, eogt.UPDATE_CONTACT_DISAMBIGUATION_ACTION);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("UpdateContactDisambiguationAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        String[] strArr = bswf.a;
        bsvm bsvmVar = new bsvm();
        bsvmVar.b(this.t.l("contact_key"));
        bsvmVar.c(this.t.l("new_msisdn"));
        bsvmVar.a().k();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateContactDisambiguation.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }
}
