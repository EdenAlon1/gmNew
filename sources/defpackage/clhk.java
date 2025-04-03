package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupResponse;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clhk implements clgz {
    public final eibx a;
    private final avkh b;
    private final errl c;

    public clhk(eibx eibxVar, avkh avkhVar, errl errlVar) {
        this.a = eibxVar;
        this.b = avkhVar;
        this.c = errlVar;
    }

    public static final awyn n(awud awudVar, eyee eyeeVar) {
        awym awymVar = (awym) awyn.a.createBuilder();
        awymVar.copyOnWrite();
        awyn awynVar = (awyn) awymVar.instance;
        awudVar.getClass();
        awynVar.c = awudVar;
        awynVar.b |= 1;
        awymVar.copyOnWrite();
        awyn awynVar2 = (awyn) awymVar.instance;
        eyeeVar.getClass();
        awynVar2.b |= 2;
        awynVar2.d = eyeeVar;
        return (awyn) awymVar.build();
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ Intent a(Object obj) {
        return new Intent("com.google.android.apps.messaging.messaging_service_remove_user_from_group_response").putExtra("messaging_service_remove_user_from_group_extra", ((awyl) obj).e.I());
    }

    @Override // defpackage.clgz
    public final awud b(Intent intent) {
        return cljb.a(GroupOperationResult.c(intent).a());
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ elfl c(Object obj) {
        return this.b.f((awyn) obj);
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ elfl d(Object obj) {
        final RemoveUserFromGroupRequest removeUserFromGroupRequest = (RemoveUserFromGroupRequest) obj;
        return elfo.g(new Callable() { // from class: clhj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return clhk.this.a.removeUserFromGroup(removeUserFromGroupRequest);
            }
        }, this.c);
    }

    @Override // defpackage.clgz
    public final eyee e(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("messaging_service_remove_user_from_group_extra");
        if (byteArrayExtra != null) {
            return eyee.x(byteArrayExtra);
        }
        throw new IllegalArgumentException("Opaque data is missing from intent");
    }

    @Override // defpackage.clgz
    public final /* synthetic */ eyee f(Object obj) {
        return ((awyl) obj).e;
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
        return n(cljb.a(((RemoveUserFromGroupResponse) obj).a()), eyeeVar);
    }

    @Override // defpackage.clgz
    public final /* synthetic */ Object j(awud awudVar, Intent intent, eyee eyeeVar) {
        return n(awudVar, eyeeVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ Object k(Object obj, PendingIntent pendingIntent) {
        awyl awylVar = (awyl) obj;
        emxf.b(awylVar.d.size() == 1, "RemoveUserFromGroupRequest must add exactly 1 user");
        awuh b = awuh.b(((awui) awylVar.d.get(0)).c);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        emxf.b(b == awuh.PHONE, "RemoveUserFromGroupRequest must add a ChatEndpoint of type PHONE");
        ehzh ehzhVar = new ehzh();
        eiea eieaVar = new eiea();
        awwf awwfVar = awylVar.c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        awui awuiVar = awwfVar.d;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        eieaVar.b(clik.b(awuiVar));
        awwf awwfVar2 = awylVar.c;
        if (awwfVar2 == null) {
            awwfVar2 = awwf.a;
        }
        eieaVar.c(awwfVar2.c);
        eieaVar.d(2);
        ehzhVar.b(eieaVar.a());
        ehzhVar.e(clik.b((awui) awylVar.d.get(0)));
        ehzhVar.c(pendingIntent);
        if (((Boolean) clgs.b.e()).booleanValue()) {
            ehzhVar.d(awylVar.e);
        }
        return ehzhVar.a();
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ String l(Object obj) {
        awwf awwfVar = ((awyl) obj).c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        return "RcsConversationId: ".concat(String.valueOf(awwfVar.c));
    }

    @Override // defpackage.clgz
    public final String m() {
        return "removeUserFromGroup";
    }
}
