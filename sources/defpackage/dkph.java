package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.ims.util.common.RcsIntents;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkph extends dkpc<Void> {
    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private final dikt b;

    public dkph(dikt diktVar) {
        this.b = diktVar;
    }

    private static final String g(eytd eytdVar) {
        int ordinal = eytdVar.ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "Unknown" : "Reset Provisioning Engine" : "Request re-configuration" : "Send keep-alive";
    }

    public final String a(eyte eyteVar) {
        eytd b = eytd.b(eyteVar.b);
        if (b == null) {
            b = eytd.UNRECOGNIZED;
        }
        return g(b);
    }

    public final void b(dkpg dkpgVar, eytd eytdVar) {
        int a2 = eytdVar.a();
        ConcurrentHashMap concurrentHashMap = a;
        Integer valueOf = Integer.valueOf(a2);
        if (concurrentHashMap.containsKey(valueOf)) {
            dkty.q("There is already an FCM tickle listener for message: %s!", g(eytdVar));
        }
        dkty.c("Adding FCM tickle listener for action %s", g(eytdVar));
        concurrentHashMap.put(valueOf, dkpgVar);
    }

    @Override // defpackage.dkpc
    public final /* synthetic */ void c(Context context, Intent intent) {
        char c;
        if (intent == null) {
            dkty.q("Empty message received", new Object[0]);
            return;
        }
        if (!dkqd.e(context, intent)) {
            dkty.q("Caller not trusted, dropping self-service message: %s", intent);
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        int hashCode = action.hashCode();
        if (hashCode != 757492430) {
            if (hashCode == 1940170602 && action.equals(RcsIntents.ACTION_TACHYON_ANONYMOUS_DEVICE_ID)) {
                c = 0;
            }
            c = 65535;
        } else {
            if (action.equals(RcsIntents.ACTION_RCS_SELF_SERVICE_MESSAGE)) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            String stringExtra = intent.getStringExtra(RcsIntents.EXTRA_TACHYON_ANONYMOUS_DEVICE_ID);
            if (TextUtils.isEmpty(stringExtra)) {
                dkty.q("No ID found for a self-service message: %s", intent);
                return;
            } else {
                dkty.c("Self-service message received: %s [%s]", intent.getAction(), stringExtra);
                dkrz.i.e(stringExtra);
                return;
            }
        }
        if (c != 1) {
            return;
        }
        String stringExtra2 = intent.getStringExtra(RcsIntents.EXTRA_RCS_SELF_SERVICE_MESSAGE_ID);
        byte[] byteArrayExtra = intent.getByteArrayExtra(RcsIntents.EXTRA_RCS_SELF_SERVICE_MESSAGE);
        if (byteArrayExtra == null) {
            dkty.q("No extra found for a self-service message: %s", intent);
            return;
        }
        try {
            eyte eyteVar = (eyte) eyfy.parseFrom(eyte.a, byteArrayExtra, eyfc.a());
            if (!TextUtils.isEmpty(stringExtra2)) {
                eytb eytbVar = (eytb) eyteVar.toBuilder();
                eytbVar.copyOnWrite();
                eyte eyteVar2 = (eyte) eytbVar.instance;
                stringExtra2.getClass();
                eyteVar2.c = stringExtra2;
                eyteVar = (eyte) eytbVar.build();
            }
            dkty.c("Self-service message (%s) received: %s [%s]", stringExtra2, intent.getAction(), a(eyteVar));
            eytd b = eytd.b(eyteVar.b);
            if (b == null) {
                b = eytd.UNRECOGNIZED;
            }
            if (!b.equals(eytd.SEND_KEEPALIVE)) {
                this.b.g(context, eyteVar, null);
            }
            int i = eyteVar.b;
            eytd b2 = eytd.b(i);
            if (b2 == null) {
                b2 = eytd.UNRECOGNIZED;
            }
            if (b2 == eytd.TYPE_UNSPECIFIED) {
                dkty.c("Unknown self-service message received", new Object[0]);
                return;
            }
            dkpg dkpgVar = (dkpg) a.get(Integer.valueOf(i));
            if (dkpgVar != null) {
                dkpgVar.onTickle(eyteVar);
            } else {
                dkty.q("Cannot find a listener for self-service message: %s!", eyteVar);
            }
        } catch (eygu e) {
            String format = String.format("Could not parse extra for a self-service message: %s", intent);
            dkty.q("%s", format);
            csix.p(format, e);
        }
    }

    public final void f(eytd eytdVar) {
        int a2 = eytdVar.a();
        ConcurrentHashMap concurrentHashMap = a;
        Integer valueOf = Integer.valueOf(a2);
        if (!concurrentHashMap.containsKey(valueOf)) {
            dkty.q("There is no FCM tickle listener for action %s!", g(eytdVar));
        } else {
            dkty.c("Removing FCM tickle listener for action %s", g(eytdVar));
            concurrentHashMap.remove(valueOf);
        }
    }
}
