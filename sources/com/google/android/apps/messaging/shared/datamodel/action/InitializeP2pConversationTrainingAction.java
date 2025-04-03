package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.bafs;
import defpackage.baft;
import defpackage.cskc;
import defpackage.ctiu;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;
import defpackage.fazb;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class InitializeP2pConversationTrainingAction extends Action<Void> {
    private final Optional b;
    private static final cskc a = cskc.g("Bugle", "InitializeP2pConversationTrainingAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bafs();

    /* compiled from: PG */
    public interface a {
        baft hP();
    }

    public InitializeP2pConversationTrainingAction(Optional<fazb<ctiu>> optional) {
        super(eogt.INITIALIZE_P2P_CONVERSATION_TRAINING_ACTION);
        this.b = optional;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("InitializeP2pConversationTrainingAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        w();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.InitializeP2pConversationTraining.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fR() {
        if (this.b.isEmpty()) {
            a.m("P2pConversationTrainingUtils not available, cannot initialize training");
            return null;
        }
        a.m("Initializing p2p conversation training.");
        ((ctiu) ((fazb) this.b.get()).b()).d();
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public InitializeP2pConversationTrainingAction(Optional<fazb<ctiu>> optional, Parcel parcel) {
        super(parcel, eogt.INITIALIZE_P2P_CONVERSATION_TRAINING_ACTION);
        this.b = optional;
    }
}
