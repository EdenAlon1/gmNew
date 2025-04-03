package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.RevokeMessageRequest;
import com.google.android.rcs.client.messaging.RevokeMessageResponse;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clho implements clgz {
    public final eibx a;
    private final avkh b;
    private final errl c;

    public clho(eibx eibxVar, avkh avkhVar, errl errlVar) {
        this.a = eibxVar;
        this.b = avkhVar;
        this.c = errlVar;
    }

    public static final awyt n(awud awudVar, eyee eyeeVar) {
        awys awysVar = (awys) awyt.a.createBuilder();
        awysVar.copyOnWrite();
        awyt awytVar = (awyt) awysVar.instance;
        awudVar.getClass();
        awytVar.c = awudVar;
        awytVar.b |= 1;
        awysVar.copyOnWrite();
        awyt awytVar2 = (awyt) awysVar.instance;
        eyeeVar.getClass();
        awytVar2.b |= 2;
        awytVar2.d = eyeeVar;
        return (awyt) awysVar.build();
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ Intent a(Object obj) {
        return new Intent("com.google.android.apps.messaging.messaging_service_revoke_message_response").putExtra("messaging_service_revoke_message_response_extra", ((awyr) obj).f.I());
    }

    @Override // defpackage.clgz
    public final awud b(Intent intent) {
        return cljb.a(MessagingOperationResult.f(intent).a());
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ elfl c(Object obj) {
        return this.b.g((awyt) obj);
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ elfl d(Object obj) {
        final RevokeMessageRequest revokeMessageRequest = (RevokeMessageRequest) obj;
        return elfo.g(new Callable() { // from class: clhn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return clho.this.a.revokeMessage(revokeMessageRequest);
            }
        }, this.c);
    }

    @Override // defpackage.clgz
    public final eyee e(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("messaging_service_revoke_message_response_extra");
        if (byteArrayExtra != null) {
            return eyee.x(byteArrayExtra);
        }
        throw new IllegalArgumentException("Opaque data is missing from intent");
    }

    @Override // defpackage.clgz
    public final /* synthetic */ eyee f(Object obj) {
        return ((awyr) obj).f;
    }

    @Override // defpackage.clgz
    public final Optional g(Intent intent) {
        Conversation b = MessagingOperationResult.f(intent).b();
        return b.c() == 2 ? Optional.of(b.b()) : Optional.empty();
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ Object h(awud awudVar, eyee eyeeVar) {
        return n(awudVar, eyeeVar);
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ Object i(Object obj, eyee eyeeVar) {
        return n(cljb.a(((RevokeMessageResponse) obj).a()), eyeeVar);
    }

    @Override // defpackage.clgz
    public final /* synthetic */ Object j(awud awudVar, Intent intent, eyee eyeeVar) {
        return n(awudVar, eyeeVar);
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ Object k(Object obj, PendingIntent pendingIntent) {
        awyr awyrVar = (awyr) obj;
        ehzj ehzjVar = new ehzj();
        eiea eieaVar = new eiea();
        awui awuiVar = awyrVar.c;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        eieaVar.b(clik.b(awuiVar));
        eieaVar.c(awyrVar.e);
        awuh awuhVar = awuh.GROUP;
        awui awuiVar2 = awyrVar.c;
        if (awuiVar2 == null) {
            awuiVar2 = awui.a;
        }
        awuh b = awuh.b(awuiVar2.c);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        eieaVar.d(true == awuhVar.equals(b) ? 2 : 1);
        ehzjVar.b(eieaVar.a());
        ehzjVar.d(awyrVar.d);
        ehzjVar.c(pendingIntent);
        if (((Boolean) clgs.b.e()).booleanValue()) {
            ehzjVar.e(awyrVar.f);
        }
        return ehzjVar.a();
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ String l(Object obj) {
        return "RcsMessageId: ".concat(String.valueOf(((awyr) obj).d));
    }

    @Override // defpackage.clgz
    public final String m() {
        return "revokeMessage";
    }
}
