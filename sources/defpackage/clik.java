package defpackage;

import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clik {
    private final avkc a;

    public clik(avkc avkcVar) {
        this.a = avkcVar;
    }

    public static final RcsDestinationId b(awui awuiVar) {
        awuh awuhVar = awuh.PHONE;
        awuh b = awuh.b(awuiVar.c);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        if (awuhVar.equals(b)) {
            eieu eieuVar = new eieu();
            eieuVar.c(1);
            eieuVar.b(awuiVar.d);
            return eieuVar.a();
        }
        String format = awuiVar.d.startsWith("sip:") ? awuiVar.d : String.format("%s%s", "sip:", awuiVar.d);
        eieu eieuVar2 = new eieu();
        eieuVar2.c(2);
        eieuVar2.b(format);
        return eieuVar2.a();
    }

    public final awui a(RcsDestinationId rcsDestinationId, boolean z) {
        if (z || rcsDestinationId.b() == 1) {
            return this.a.a(rcsDestinationId.a(), z);
        }
        String substring = rcsDestinationId.a().startsWith("sip:") ? rcsDestinationId.a().substring(4) : rcsDestinationId.a();
        int indexOf = substring.indexOf(59);
        if (indexOf >= 0) {
            substring = substring.substring(0, indexOf);
        }
        return this.a.a(substring, false);
    }
}
