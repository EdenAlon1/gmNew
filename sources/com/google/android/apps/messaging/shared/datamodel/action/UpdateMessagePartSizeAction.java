package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import defpackage.bbai;
import defpackage.bbaj;
import defpackage.bbcg;
import defpackage.bdpt;
import defpackage.bwdi;
import defpackage.csix;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class UpdateMessagePartSizeAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bbai();
    private final ffbr a;

    /* compiled from: PG */
    public interface a {
        bbaj iu();
    }

    public UpdateMessagePartSizeAction(ffbr ffbrVar, Parcel parcel) {
        super(parcel, eogt.UPDATE_MESSAGE_PART_SIZE_ACTION);
        this.a = ffbrVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("UpdateMessagePartSizeAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        bbcg bbcgVar = this.t;
        String l = bbcgVar.l("part_id");
        int a2 = bbcgVar.a("width");
        int a3 = bbcgVar.a("height");
        MessagePartCoreData a4 = ((bdpt) this.a.b()).a(l);
        if (a4 == null) {
            return null;
        }
        bdpt bdptVar = (bdpt) this.a.b();
        ConversationIdType A = a4.A();
        MessageIdType B = a4.B();
        ekzz f = eleg.f("MessagePartDatabaseOperations#updateMessagePartSize");
        try {
            csix.h();
            String[] strArr = PartsTable.a;
            bwdi bwdiVar = new bwdi();
            bwdiVar.ap("updateMessagePartSize");
            bwdiVar.B(a2);
            bwdiVar.p(a3);
            bdptVar.f(A, B, l, bwdiVar);
            f.close();
            return null;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateMessagePartSize.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public UpdateMessagePartSizeAction(ffbr ffbrVar, String str, int i, int i2) {
        super(eogt.UPDATE_MESSAGE_PART_SIZE_ACTION);
        this.t.v("part_id", str);
        this.t.r("width", i);
        this.t.r("height", i2);
        this.a = ffbrVar;
    }
}
