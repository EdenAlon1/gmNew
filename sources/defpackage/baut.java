package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baut implements erqj {
    final /* synthetic */ MessageIdType a;
    final /* synthetic */ bauu b;

    public baut(bauu bauuVar, MessageIdType messageIdType) {
        this.a = messageIdType;
        this.b = bauuVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.d((ctje) obj, this.a);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        csjb e = bauu.a.e();
        e.I("Error in p2p suggestions request");
        e.I(this.a);
        e.s(th);
    }
}
