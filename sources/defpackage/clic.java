package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.android.rcs.client.messaging.UpdateGroupResponse;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clic implements clgz {
    public final eibx a;
    private final avkh b;
    private final errl c;

    public clic(eibx eibxVar, avkh avkhVar, errl errlVar) {
        this.a = eibxVar;
        this.b = avkhVar;
        this.c = errlVar;
    }

    public static final axat n(awud awudVar, eyee eyeeVar) {
        axas axasVar = (axas) axat.a.createBuilder();
        axasVar.copyOnWrite();
        axat axatVar = (axat) axasVar.instance;
        awudVar.getClass();
        axatVar.c = awudVar;
        axatVar.b |= 1;
        axasVar.copyOnWrite();
        axat axatVar2 = (axat) axasVar.instance;
        eyeeVar.getClass();
        axatVar2.b |= 2;
        axatVar2.d = eyeeVar;
        return (axat) axasVar.build();
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ Intent a(Object obj) {
        return new Intent("com.google.android.apps.messaging.messaging_service_update_group_response").putExtra("messaging_service_update_group_extra", ((axaq) obj).e.I());
    }

    @Override // defpackage.clgz
    public final awud b(Intent intent) {
        return cljb.a(GroupOperationResult.c(intent).a());
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ elfl c(Object obj) {
        return this.b.j((axat) obj);
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ elfl d(Object obj) {
        final UpdateGroupRequest updateGroupRequest = (UpdateGroupRequest) obj;
        return elfo.g(new Callable() { // from class: clib
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return clic.this.a.updateGroup(updateGroupRequest);
            }
        }, this.c);
    }

    @Override // defpackage.clgz
    public final eyee e(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("messaging_service_update_group_extra");
        if (byteArrayExtra != null) {
            return eyee.x(byteArrayExtra);
        }
        throw new IllegalArgumentException("Opaque data is missing from intent");
    }

    @Override // defpackage.clgz
    public final /* synthetic */ eyee f(Object obj) {
        return ((axaq) obj).e;
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
        return n(cljb.a(((UpdateGroupResponse) obj).a()), eyeeVar);
    }

    @Override // defpackage.clgz
    public final /* synthetic */ Object j(awud awudVar, Intent intent, eyee eyeeVar) {
        return n(awudVar, eyeeVar);
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ Object k(Object obj, PendingIntent pendingIntent) {
        axaq axaqVar = (axaq) obj;
        ehzs ehzsVar = new ehzs();
        eiea eieaVar = new eiea();
        awwf awwfVar = axaqVar.c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        awui awuiVar = awwfVar.d;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        eieaVar.b(clik.b(awuiVar));
        awwf awwfVar2 = axaqVar.c;
        if (awwfVar2 == null) {
            awwfVar2 = awwf.a;
        }
        eieaVar.c(awwfVar2.c);
        eieaVar.d(2);
        ehzsVar.b(eieaVar.a());
        ehzsVar.c(pendingIntent);
        ehzsVar.e(axaqVar.d);
        if (((Boolean) clgs.b.e()).booleanValue()) {
            ehzsVar.d(axaqVar.e);
        }
        return ehzsVar.a();
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ String l(Object obj) {
        awwf awwfVar = ((axaq) obj).c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        return "RcsConversationId: ".concat(String.valueOf(awwfVar.c));
    }

    @Override // defpackage.clgz
    public final String m() {
        return "updateGroup";
    }
}
