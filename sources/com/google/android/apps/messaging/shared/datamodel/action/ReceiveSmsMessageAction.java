package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveSmsMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.alsh;
import defpackage.babz;
import defpackage.basb;
import defpackage.basc;
import defpackage.batc;
import defpackage.cskc;
import defpackage.ecda;
import defpackage.ecri;
import defpackage.ecrj;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.emwl;
import defpackage.emxe;
import defpackage.eogt;
import defpackage.erpp;
import defpackage.errl;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ReceiveSmsMessageAction extends Action<Void> implements Parcelable {
    public final batc b;
    private final errl c;
    private final ecrj d;
    private final alsh e;
    public static final cskc a = cskc.g("BugleDataModel", "ReceiveSmsMessageAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new basb();

    /* compiled from: PG */
    public interface a {
        basc ij();
    }

    public ReceiveSmsMessageAction(ContentValues contentValues, batc batcVar, errl errlVar, ecrj ecrjVar, alsh alshVar) {
        super(eogt.RECEIVE_SMS_MESSAGE_ACTION);
        this.t.t("message_values", contentValues);
        this.b = batcVar;
        this.c = errlVar;
        this.d = ecrjVar;
        this.e = alshVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ReceiveSmsMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReceiveSmsMessage.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl e() {
        ContentValues contentValues = (ContentValues) this.t.h("message_values");
        long e = this.t.e("message_logging_id", 0L);
        Integer asInteger = contentValues.getAsInteger("sub_id");
        if (asInteger == null) {
            asInteger = -1;
        }
        ecri d = this.d.d();
        String asString = contentValues.getAsString("address");
        elfl e2 = this.b.e(asInteger.intValue(), contentValues, e, new babz(emxe.b(asString), emxe.b(asString), false));
        final batc batcVar = this.b;
        return this.e.a(d, e2.h(new emwl() { // from class: barx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return batc.this.a((basx) obj);
            }
        }, this.c).h(new emwl() { // from class: bary
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                basy basyVar = (basy) obj;
                if (basyVar != null) {
                    ReceiveSmsMessageAction receiveSmsMessageAction = ReceiveSmsMessageAction.this;
                    receiveSmsMessageAction.b.h(receiveSmsMessageAction.b.b(basyVar, null));
                }
                return null;
            }
        }, this.c).e(Exception.class, new emwl() { // from class: barz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ReceiveSmsMessageAction.a.o("Fail to insert to telephony", (Exception) obj);
                return null;
            }
        }, erpp.a).h(new emwl() { // from class: basa
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ReceiveSmsMessageAction.a.l("SMS receiving END");
                return null;
            }
        }, erpp.a), new ecda("ReceiveSmsMessageAction#executeActionAsync"));
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final boolean fV() {
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public ReceiveSmsMessageAction(Parcel parcel, batc batcVar, errl errlVar, ecrj ecrjVar, alsh alshVar) {
        super(parcel, eogt.RECEIVE_SMS_MESSAGE_ACTION);
        this.b = batcVar;
        this.c = errlVar;
        this.d = ecrjVar;
        this.e = alshVar;
    }
}
