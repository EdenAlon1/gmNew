package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationResponse;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clhz implements clgz {
    public final eibx a;
    private final avkh b;
    private final errl c;

    public clhz(eibx eibxVar, avkh avkhVar, errl errlVar) {
        this.a = eibxVar;
        this.b = avkhVar;
        this.c = errlVar;
    }

    public static final axal n(awud awudVar, eyee eyeeVar) {
        axak axakVar = (axak) axal.a.createBuilder();
        axakVar.copyOnWrite();
        axal axalVar = (axal) axakVar.instance;
        awudVar.getClass();
        axalVar.c = awudVar;
        axalVar.b |= 1;
        axakVar.copyOnWrite();
        axal axalVar2 = (axal) axakVar.instance;
        eyeeVar.getClass();
        axalVar2.b |= 2;
        axalVar2.d = eyeeVar;
        return (axal) axakVar.build();
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ Intent a(Object obj) {
        return new Intent("com.google.android.apps.messaging.messaging_service_trigger_group_notification_response").putExtra("messaging_service_trigger_group_notification_extra", ((axaj) obj).d.I());
    }

    @Override // defpackage.clgz
    public final awud b(Intent intent) {
        return cljb.a(GroupOperationResult.c(intent).a());
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ elfl c(Object obj) {
        return this.b.i((axal) obj);
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ elfl d(Object obj) {
        final TriggerGroupNotificationRequest triggerGroupNotificationRequest = (TriggerGroupNotificationRequest) obj;
        return elfo.g(new Callable() { // from class: clhy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return clhz.this.a.triggerGroupNotification(triggerGroupNotificationRequest);
            }
        }, this.c);
    }

    @Override // defpackage.clgz
    public final eyee e(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("messaging_service_trigger_group_notification_extra");
        if (byteArrayExtra != null) {
            return eyee.x(byteArrayExtra);
        }
        throw new IllegalArgumentException("Opaque data is missing from intent");
    }

    @Override // defpackage.clgz
    public final /* synthetic */ eyee f(Object obj) {
        return ((axaj) obj).d;
    }

    @Override // defpackage.clgz
    public final Optional g(Intent intent) {
        Conversation b = GroupOperationResult.c(intent).b();
        return b.c() == 2 ? Optional.of(b.b()) : Optional.empty();
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ Object h(awud awudVar, eyee eyeeVar) {
        return n(awudVar, eyeeVar);
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ Object i(Object obj, eyee eyeeVar) {
        return n(cljb.a(((TriggerGroupNotificationResponse) obj).a()), eyeeVar);
    }

    @Override // defpackage.clgz
    public final /* synthetic */ Object j(awud awudVar, Intent intent, eyee eyeeVar) {
        return n(awudVar, eyeeVar);
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ Object k(Object obj, PendingIntent pendingIntent) {
        axaj axajVar = (axaj) obj;
        ehzq ehzqVar = new ehzq();
        eiea eieaVar = new eiea();
        awwf awwfVar = axajVar.c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        awui awuiVar = awwfVar.d;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        eieaVar.b(clik.b(awuiVar));
        awwf awwfVar2 = axajVar.c;
        if (awwfVar2 == null) {
            awwfVar2 = awwf.a;
        }
        eieaVar.c(awwfVar2.c);
        eieaVar.d(2);
        ehzqVar.b(eieaVar.a());
        ehzqVar.c(pendingIntent);
        if (((Boolean) clgs.b.e()).booleanValue()) {
            ehzqVar.d(axajVar.d);
        }
        return ehzqVar.a();
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ String l(Object obj) {
        awwf awwfVar = ((axaj) obj).c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        return "RcsConversationId: ".concat(String.valueOf(awwfVar.c));
    }

    @Override // defpackage.clgz
    public final String m() {
        return "triggerGroupNotification";
    }
}
