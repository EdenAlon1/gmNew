package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bttp extends dtrr {
    public MessageIdType a;
    public String b;

    public bttp() {
        super(btul.b());
        this.a = bdhb.a;
    }

    public final bttn a() {
        btto bttoVar = new btto();
        bttoVar.aC(aB());
        bttoVar.a = this.a;
        bttoVar.b = this.b;
        bttoVar.cK = aC();
        return bttoVar;
    }

    public final void b(String str) {
        aE(1);
        this.b = str;
    }

    public final void c(MessageIdType messageIdType) {
        aE(0);
        this.a = messageIdType;
    }
}
