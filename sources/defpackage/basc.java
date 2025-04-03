package defpackage;

import android.content.ContentValues;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveSmsMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class basc implements bbck {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;

    public basc(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        ffbrVar4.getClass();
        this.d = ffbrVar4;
    }

    public final /* bridge */ /* synthetic */ Action a(ContentValues contentValues) {
        contentValues.getClass();
        batc batcVar = (batc) this.a.b();
        batcVar.getClass();
        errl errlVar = (errl) this.b.b();
        errlVar.getClass();
        ecrj ecrjVar = (ecrj) this.c.b();
        ecrjVar.getClass();
        alsh alshVar = (alsh) this.d.b();
        alshVar.getClass();
        return new ReceiveSmsMessageAction(contentValues, batcVar, errlVar, ecrjVar, alshVar);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        parcel.getClass();
        batc batcVar = (batc) this.a.b();
        batcVar.getClass();
        errl errlVar = (errl) this.b.b();
        errlVar.getClass();
        ecrj ecrjVar = (ecrj) this.c.b();
        ecrjVar.getClass();
        alsh alshVar = (alsh) this.d.b();
        alshVar.getClass();
        return new ReceiveSmsMessageAction(parcel, batcVar, errlVar, ecrjVar, alshVar);
    }
}
