package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.CreateGroupResponse;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cleu implements clgz {
    public final eibx a;
    private final clik b;
    private final avkh c;
    private final ckds d;
    private final errl e;

    public cleu(clik clikVar, eibx eibxVar, avkh avkhVar, ckds ckdsVar, errl errlVar) {
        this.b = clikVar;
        this.a = eibxVar;
        this.c = avkhVar;
        this.d = ckdsVar;
        this.e = errlVar;
    }

    public static final awuz n(awud awudVar, eyee eyeeVar) {
        return (awuz) o(awudVar, eyeeVar).build();
    }

    private static awuy o(awud awudVar, eyee eyeeVar) {
        awuy awuyVar = (awuy) awuz.a.createBuilder();
        awuyVar.copyOnWrite();
        awuz awuzVar = (awuz) awuyVar.instance;
        awudVar.getClass();
        awuzVar.c = awudVar;
        awuzVar.b |= 1;
        awuyVar.copyOnWrite();
        awuz awuzVar2 = (awuz) awuyVar.instance;
        eyeeVar.getClass();
        awuzVar2.b |= 4;
        awuzVar2.e = eyeeVar;
        eqyl eqylVar = eqyl.RCS_SMAPI;
        awuyVar.copyOnWrite();
        awuz awuzVar3 = (awuz) awuyVar.instance;
        awuzVar3.f = eqylVar.h;
        awuzVar3.b |= 8;
        return awuyVar;
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ Intent a(Object obj) {
        return new Intent("com.google.android.apps.messaging.messaging_service_create_group_response").putExtra("messaging_service_create_group_extra", ((awuw) obj).h.I());
    }

    @Override // defpackage.clgz
    public final awud b(Intent intent) {
        return cljb.a(GroupOperationResult.c(intent).a());
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ elfl c(Object obj) {
        return this.c.b((awuz) obj);
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ elfl d(Object obj) {
        final CreateGroupRequest createGroupRequest = (CreateGroupRequest) obj;
        return elfo.g(new Callable() { // from class: clet
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cleu.this.a.createGroup(createGroupRequest);
            }
        }, this.e);
    }

    @Override // defpackage.clgz
    public final eyee e(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("messaging_service_create_group_extra");
        if (byteArrayExtra != null) {
            return eyee.x(byteArrayExtra);
        }
        throw new IllegalArgumentException("Opaque data is missing from intent");
    }

    @Override // defpackage.clgz
    public final /* synthetic */ eyee f(Object obj) {
        return ((awuw) obj).h;
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
        return n(cljb.a(((CreateGroupResponse) obj).a()), eyeeVar);
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ Object j(awud awudVar, Intent intent, eyee eyeeVar) {
        awuy o = o(awudVar, eyeeVar);
        if (((Boolean) ((cfup) awgs.a.get()).e()).booleanValue()) {
            awui a = this.b.a(GroupOperationResult.c(intent).b().a(), true);
            o.copyOnWrite();
            awuz awuzVar = (awuz) o.instance;
            awuz awuzVar2 = awuz.a;
            a.getClass();
            awuzVar.d = a;
            awuzVar.b |= 2;
        }
        return (awuz) o.build();
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ Object k(Object obj, PendingIntent pendingIntent) {
        awuw awuwVar = (awuw) obj;
        int i = engw.d;
        engr engrVar = new engr();
        eygr<awui> eygrVar = awuwVar.g;
        emxf.b(eygrVar.size() >= 2, "CreateGroupChatRequest must include 2 or more remote participants");
        emxf.b((awuwVar.b & 8) != 0, "CreateGroupChatRequest must include sender");
        awui awuiVar = awuwVar.f;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        int f = this.d.f(Optional.of(awuiVar)) - 1;
        emxf.d(eygrVar.size() <= f, "CreateGroupChatRequest must include fewer than %s remote participants", f);
        for (awui awuiVar2 : eygrVar) {
            awuh b = awuh.b(awuiVar2.c);
            if (b == null) {
                b = awuh.UNKNOWN_TYPE;
            }
            emxf.b(b == awuh.PHONE, "CreateGroupChatRequest must only include remote participants of type PHONE");
            engrVar.h(clik.b(awuiVar2));
        }
        ehyj ehyjVar = new ehyj();
        ehyjVar.b(awuwVar.c);
        ehyjVar.f(awuwVar.d);
        ehyjVar.d(engrVar.g());
        ehyjVar.c(pendingIntent);
        if (((Boolean) clgs.b.e()).booleanValue()) {
            ehyjVar.e(awuwVar.h);
        }
        return ehyjVar.a();
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ String l(Object obj) {
        return "RcsConversationId: ".concat(String.valueOf(((awuw) obj).c));
    }

    @Override // defpackage.clgz
    public final String m() {
        return "createGroup";
    }
}
