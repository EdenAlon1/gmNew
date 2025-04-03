package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class byse extends dtrr {
    public String a;
    public MessageIdType b;
    public long c;
    public long d;

    public byse() {
        super(bytk.c());
        this.b = bdhb.a;
    }

    public final bysc a() {
        bysd bysdVar = new bysd();
        bysdVar.aC(aB());
        bysdVar.a = this.a;
        bysdVar.b = this.b;
        bysdVar.c = this.c;
        bysdVar.d = this.d;
        bysdVar.cK = aC();
        return bysdVar;
    }

    public final void b(String str) {
        aE(0);
        this.a = str;
    }

    public final void c(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void d(long j) {
        aE(2);
        this.c = j;
    }

    public final void e(long j) {
        aE(3);
        this.d = j;
    }
}
