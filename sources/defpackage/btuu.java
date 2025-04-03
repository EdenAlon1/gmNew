package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btuu extends dtrr {
    public long a;
    public MessageIdType b;
    public fbrc c;
    public fbwv d;

    public btuu() {
        super(btvy.e());
        this.b = bdhb.a;
        this.c = fbrc.UNKNOWN_CLASSIFICATION_TYPE;
    }

    public final btus a() {
        btut btutVar = new btut();
        btutVar.aC(aB());
        fbwv fbwvVar = this.d;
        if (fbwvVar == null) {
            throw new IllegalStateException("field classification_details cannot be null");
        }
        btutVar.a = this.a;
        btutVar.b = this.b;
        btutVar.c = this.c;
        btutVar.d = fbwvVar;
        btutVar.cK = aC();
        return btutVar;
    }

    public final void b(fbwv fbwvVar) {
        int i = this.aB;
        if (i < 58480) {
            dtub.w("classification_details", i);
        }
        aE(3);
        this.d = fbwvVar;
    }

    public final void c(fbrc fbrcVar) {
        aE(2);
        this.c = fbrcVar;
    }

    public final void d(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }
}
