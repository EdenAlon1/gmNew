package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.rcs.client.messaging.data.MessageReceipt;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cozu implements cown {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/sms/UnencryptedRcsMessageReceiptConverter");
    private final eikl b;
    private final avtx c;
    private final augx d;

    public cozu(eikl eiklVar, avtx avtxVar, augx augxVar) {
        this.b = eiklVar;
        this.c = avtxVar;
        this.d = augxVar;
    }

    @Override // defpackage.cown
    public final awul a(awzn awznVar, bdhg bdhgVar, Instant instant) {
        eigx eigxVar;
        MessageReceipt k;
        if (this.d.a()) {
            int ordinal = awznVar.ordinal();
            if (ordinal == 1) {
                eies eiesVar = new eies();
                eiesVar.j(eigx.DELIVERY);
                eiesVar.h(eigx.DELIVERY.f);
                eiesVar.g(bdhg.e(bdhgVar));
                eiesVar.i(instant);
                k = eiesVar.k();
            } else if (ordinal == 2) {
                eies eiesVar2 = new eies();
                eiesVar2.j(eigx.DISPLAY);
                eiesVar2.h(eigx.DISPLAY.f);
                eiesVar2.g(bdhg.e(bdhgVar));
                eiesVar2.i(instant);
                k = eiesVar2.k();
            } else {
                if (ordinal != 3) {
                    throw new IllegalArgumentException("Unsupported receipt type: %s".concat(String.valueOf(awznVar.name())));
                }
                eies eiesVar3 = new eies();
                eiesVar3.j(eigx.DELIVERY);
                eiesVar3.h("failed");
                eiesVar3.g(bdhg.e(bdhgVar));
                eiesVar3.i(instant);
                k = eiesVar3.k();
            }
        } else {
            int ordinal2 = awznVar.ordinal();
            if (ordinal2 == 1) {
                eigxVar = eigx.DELIVERY;
            } else if (ordinal2 == 2) {
                eigxVar = eigx.DISPLAY;
            } else {
                if (ordinal2 != 3) {
                    throw new IllegalArgumentException("Unsupported receipt type " + awznVar.e);
                }
                ensk j = a.j();
                j.Y(ente.a, "BugleRcs");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/sms/UnencryptedRcsMessageReceiptConverter", "getMessageReceiptType", 98, "UnencryptedRcsMessageReceiptConverter.java")).q("Unencrypted message receipts not supported negative delivery report as the flag is off");
                eigxVar = eigx.DELIVERY;
            }
            eies eiesVar4 = new eies();
            eiesVar4.j(eigxVar);
            eiesVar4.g(bdhg.e(bdhgVar));
            eiesVar4.i(instant);
            eiesVar4.h(eigxVar.f);
            k = eiesVar4.k();
        }
        try {
            return (awul) this.c.fP(this.b.b(MessageReceipt.class).b(k));
        } catch (eikm e) {
            throw new cowg(e);
        }
    }

    @Override // defpackage.cown
    public final elfl b(bdhg bdhgVar, fayv fayvVar, Instant instant, awui awuiVar, avkl avklVar) {
        return elfo.d(new UnsupportedOperationException("this converter only supports unencrypted receipts"));
    }

    @Override // defpackage.cown
    public final elfl c(awzn awznVar, MessageCoreData messageCoreData, avkl avklVar) {
        return elfo.e(a(awznVar, messageCoreData.E(), Instant.ofEpochMilli(messageCoreData.r())));
    }
}
