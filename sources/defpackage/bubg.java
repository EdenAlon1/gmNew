package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bubg extends dtrr {
    public MessageIdType a;
    public cjia b;

    public bubg() {
        super(bucb.a().P());
        this.a = bdhb.a;
    }

    public final bube a() {
        bubf bubfVar = new bubf();
        bubfVar.aC(aB());
        bubfVar.a = this.a;
        bubfVar.b = this.b;
        bubfVar.cK = aC();
        return bubfVar;
    }

    public final void b(MessageIdType messageIdType) {
        aE(0);
        this.a = messageIdType;
    }

    public final void c(cjia cjiaVar) {
        aE(1);
        this.b = cjiaVar;
    }
}
