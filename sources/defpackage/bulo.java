package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bulo extends dtrr {
    public long a;
    public MessageIdType b;

    public bulo() {
        super(bumm.b());
        this.b = bdhb.a;
    }

    public final bulm a() {
        buln bulnVar = new buln();
        bulnVar.aC(aB());
        bulnVar.a = this.a;
        bulnVar.b = this.b;
        bulnVar.cK = aC();
        return bulnVar;
    }

    public final void b(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }
}
