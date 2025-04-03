package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.AddUserToGroupResponse;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cler implements clgz {
    public final eibx a;
    private final avkh b;
    private final errl c;

    public cler(eibx eibxVar, avkh avkhVar, errl errlVar) {
        this.a = eibxVar;
        this.b = avkhVar;
        this.c = errlVar;
    }

    public static final awtx n(awud awudVar, eyee eyeeVar) {
        awtw awtwVar = (awtw) awtx.a.createBuilder();
        awtwVar.copyOnWrite();
        awtx awtxVar = (awtx) awtwVar.instance;
        awudVar.getClass();
        awtxVar.c = awudVar;
        awtxVar.b |= 1;
        awtwVar.copyOnWrite();
        awtx awtxVar2 = (awtx) awtwVar.instance;
        eyeeVar.getClass();
        awtxVar2.b |= 2;
        awtxVar2.d = eyeeVar;
        return (awtx) awtwVar.build();
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ Intent a(Object obj) {
        return new Intent("com.google.android.apps.messaging.messaging_service_add_user_to_group_response").putExtra("messaging_service_add_user_to_group_extra", ((awtv) obj).e.I());
    }

    @Override // defpackage.clgz
    public final awud b(Intent intent) {
        return cljb.a(GroupOperationResult.c(intent).a());
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ elfl c(Object obj) {
        return this.b.a((awtx) obj);
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ elfl d(Object obj) {
        final AddUserToGroupRequest addUserToGroupRequest = (AddUserToGroupRequest) obj;
        return elfo.g(new Callable() { // from class: cleq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cler.this.a.addUserToGroup(addUserToGroupRequest);
            }
        }, this.c);
    }

    @Override // defpackage.clgz
    public final eyee e(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("messaging_service_add_user_to_group_extra");
        if (byteArrayExtra != null) {
            return eyee.x(byteArrayExtra);
        }
        throw new IllegalArgumentException("Opaque data is missing from intent");
    }

    @Override // defpackage.clgz
    public final /* synthetic */ eyee f(Object obj) {
        return ((awtv) obj).e;
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
        return n(cljb.a(((AddUserToGroupResponse) obj).a()), eyeeVar);
    }

    @Override // defpackage.clgz
    public final /* synthetic */ Object j(awud awudVar, Intent intent, eyee eyeeVar) {
        return n(awudVar, eyeeVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ Object k(Object obj, PendingIntent pendingIntent) {
        awtv awtvVar = (awtv) obj;
        emxf.b(awtvVar.d.size() == 1, "AddUserToGroupRequest must add exactly 1 user");
        awuh b = awuh.b(((awui) awtvVar.d.get(0)).c);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        emxf.b(b == awuh.PHONE, "AddUserToGroupRequest must add a ChatEndpoint of type PHONE");
        ehyd ehydVar = new ehyd();
        eiea eieaVar = new eiea();
        awwf awwfVar = awtvVar.c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        awui awuiVar = awwfVar.d;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        eieaVar.b(clik.b(awuiVar));
        awwf awwfVar2 = awtvVar.c;
        if (awwfVar2 == null) {
            awwfVar2 = awwf.a;
        }
        eieaVar.c(awwfVar2.c);
        eieaVar.d(2);
        ehydVar.b(eieaVar.a());
        ehydVar.e(clik.b((awui) awtvVar.d.get(0)));
        ehydVar.c(pendingIntent);
        if (((Boolean) clgs.b.e()).booleanValue()) {
            ehydVar.d(awtvVar.e);
        }
        return ehydVar.a();
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ String l(Object obj) {
        awwf awwfVar = ((awtv) obj).c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        return "RcsConversationId: ".concat(String.valueOf(awwfVar.c));
    }

    @Override // defpackage.clgz
    public final String m() {
        return "addUserToGroup";
    }
}
