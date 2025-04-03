package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ClearCloudSyncMessagesAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import defpackage.bacw;
import defpackage.bacx;
import defpackage.bbfw;
import defpackage.bsom;
import defpackage.cbgf;
import defpackage.csix;
import defpackage.dtuu;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ClearCloudSyncMessagesAction extends Action<Void> implements Parcelable {
    public final bbfw b;
    public final cbgf c;
    private final dtuu d;
    public static final String a = "SELECT " + bsom.c.a.toString() + " FROM conversations LEFT OUTER JOIN messages ON (" + bsom.c.a.toString() + " = " + MessagesTable.c.b.toString() + ") WHERE " + MessagesTable.c.a.toString() + " IS NULL AND " + bsom.c.L.toString() + " = 1";
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bacw();

    /* compiled from: PG */
    public interface a {
        bacx hF();
    }

    public ClearCloudSyncMessagesAction(bbfw bbfwVar, cbgf cbgfVar, dtuu dtuuVar, Parcel parcel) {
        super(parcel, eogt.CLEAR_CLOUD_SYNC_MESSAGES_ACTION);
        this.b = bbfwVar;
        this.c = cbgfVar;
        this.d = dtuuVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ClearCloudSyncMessagesAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        w();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ClearCloudSyncMessages.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fR() {
        final long d = this.t.d("cutoff_timestamp");
        csix.k(d > 0);
        this.d.d("ClearCloudSyncMessagesAction#doBackgroundWork", new Runnable() { // from class: bact
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr = MessagesTable.a;
                buxh buxhVar = new buxh();
                buxhVar.f("ClearCloudSyncMessagesAction#doBackgroundWork#messages");
                final long j = d;
                buxhVar.c(new Function() { // from class: bacu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar = (buxz) obj;
                        String str = ClearCloudSyncMessagesAction.a;
                        buxzVar.U(j);
                        buxzVar.e();
                        return buxzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                buxhVar.d();
                String[] strArr2 = bsom.a;
                bsnt bsntVar = new bsnt();
                bsntVar.f("ClearCloudSyncMessagesAction#doBackgroundWork#conversations");
                bsntVar.a(new Function() { // from class: bacv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsol bsolVar = (bsol) obj;
                        bsolVar.s(new dtzr(ClearCloudSyncMessagesAction.a));
                        return bsolVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsntVar.d();
                ClearCloudSyncMessagesAction clearCloudSyncMessagesAction = ClearCloudSyncMessagesAction.this;
                clearCloudSyncMessagesAction.c.c();
                clearCloudSyncMessagesAction.b.e(true, bdgq.a);
            }
        });
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }
}
