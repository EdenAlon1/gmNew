package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.RcsMessagingService;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.SendMessageResponse;
import com.google.android.rcs.client.messaging.data.AutoOneOf_Message_MessageContent;
import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.android.rcs.client.messaging.data.TraceId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clhw implements clgz {
    public final RcsMessagingService a;
    public final cqoh b;
    public final clie c;
    public final clhd d;
    private final avtv e;
    private final avkh f;
    private final clit g;
    private final clhi h;
    private final ctzw i;
    private final BiFunction j;
    private final errl k;
    private final cljd l;
    private final errl m;

    public clhw(avtv avtvVar, RcsMessagingService rcsMessagingService, avkh avkhVar, cqoh cqohVar, clit clitVar, clhi clhiVar, ctzw ctzwVar, BiFunction biFunction, errl errlVar, clie clieVar, clhd clhdVar, cljd cljdVar, errl errlVar2) {
        this.e = avtvVar;
        this.a = rcsMessagingService;
        this.f = avkhVar;
        this.b = cqohVar;
        this.g = clitVar;
        this.h = clhiVar;
        this.i = ctzwVar;
        this.j = biFunction;
        this.k = errlVar;
        this.c = clieVar;
        this.d = clhdVar;
        this.m = errlVar2;
        this.l = cljdVar;
    }

    private final awzc n(awud awudVar, eyee eyeeVar) {
        awzc awzcVar = (awzc) awzd.a.createBuilder();
        awzcVar.copyOnWrite();
        awzd awzdVar = (awzd) awzcVar.instance;
        awudVar.getClass();
        awzdVar.c = awudVar;
        awzdVar.b |= 1;
        awzcVar.copyOnWrite();
        awzd awzdVar2 = (awzd) awzcVar.instance;
        eyeeVar.getClass();
        awzdVar2.b |= 2;
        awzdVar2.d = eyeeVar;
        eyja b = eykj.b(this.b.f());
        awzcVar.copyOnWrite();
        awzd awzdVar3 = (awzd) awzcVar.instance;
        b.getClass();
        awzdVar3.e = b;
        awzdVar3.b |= 4;
        eopq a = this.h.a();
        awzcVar.copyOnWrite();
        awzd awzdVar4 = (awzd) awzcVar.instance;
        a.getClass();
        awzdVar4.h = a;
        awzdVar4.b |= 32;
        return awzcVar;
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ Intent a(Object obj) {
        awyz awyzVar = (awyz) obj;
        Intent putExtra = new Intent("com.google.android.apps.messaging.messaging_service_send_message_response").putExtra("messaging_service_send_message_response_extra", awyzVar.l.I());
        axad axadVar = awyzVar.n;
        if (axadVar == null) {
            axadVar = axad.a;
        }
        return putExtra.putExtra(RcsIntents.EXTRA_TRACE_ID, axadVar.c);
    }

    @Override // defpackage.clgz
    public final awud b(Intent intent) {
        return cljb.a(MessagingOperationResult.f(intent).a());
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ elfl c(Object obj) {
        return this.f.h((awzd) obj);
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ elfl d(Object obj) {
        elfl g;
        final SendMessageRequest sendMessageRequest = (SendMessageRequest) obj;
        final bdhg a = bdhg.a(sendMessageRequest.c().h());
        final axad axadVar = (axad) this.l.m().fP(sendMessageRequest.h());
        if (((Boolean) ((cfup) clie.a.get()).e()).booleanValue()) {
            this.c.c(axadVar, a, 4, 15);
        }
        if (this.a.isConnected()) {
            this.d.c(1);
            g = elfo.g(new Callable() { // from class: clhv
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return clhw.this.a.sendMessage(sendMessageRequest);
                }
            }, this.k);
        } else {
            this.d.c(2);
            final Instant ofEpochMilli = Instant.ofEpochMilli(this.b.a());
            g = this.i.a(this.j, RcsMessagingService.class).f(TimeoutException.class, new eroh() { // from class: clht
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj2) {
                    clhw.this.d.b.c("Bugle.MessagingService.SendMessageRequest.Binder.OnDemand.Connect.Timeout.Count");
                    return elfo.d((TimeoutException) obj2);
                }
            }, this.m).h(new emwl() { // from class: clhu
                @Override // defpackage.emwl
                public final Object apply(Object obj2) {
                    clhw clhwVar = clhw.this;
                    clhwVar.d.b.g("Bugle.MessagingService.SendMessageRequest.Binder.OnDemand.Connect.Latency", Duration.between(ofEpochMilli, Instant.ofEpochMilli(clhwVar.b.a())).toMillis());
                    return ((RcsMessagingService) obj2).sendMessage(sendMessageRequest);
                }
            }, this.k);
        }
        return g.h(new emwl() { // from class: clhs
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                SendMessageResponse sendMessageResponse = (SendMessageResponse) obj2;
                if (((Boolean) ((cfup) clie.a.get()).e()).booleanValue()) {
                    bdhg bdhgVar = a;
                    clhw.this.c.c(axadVar, bdhgVar, 9, 15);
                }
                return sendMessageResponse;
            }
        }, this.m);
    }

    @Override // defpackage.clgz
    public final eyee e(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("messaging_service_send_message_response_extra");
        if (byteArrayExtra != null) {
            return eyee.x(byteArrayExtra);
        }
        throw new IllegalArgumentException("Opaque data is missing from intent");
    }

    @Override // defpackage.clgz
    public final /* synthetic */ eyee f(Object obj) {
        return ((awyz) obj).l;
    }

    @Override // defpackage.clgz
    public final Optional g(Intent intent) {
        Conversation b = MessagingOperationResult.f(intent).b();
        return b.c() == 2 ? Optional.of(b.b()) : Optional.empty();
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ Object h(awud awudVar, eyee eyeeVar) {
        return (awzd) n(awudVar, eyeeVar).build();
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ Object i(Object obj, eyee eyeeVar) {
        SendMessageResponse sendMessageResponse = (SendMessageResponse) obj;
        awzc n = n(cljb.a(sendMessageResponse.a()), eyeeVar);
        awyp a = clhm.a(sendMessageResponse.a());
        n.copyOnWrite();
        awzd awzdVar = (awzd) n.instance;
        awzd awzdVar2 = awzd.a;
        a.getClass();
        awzdVar.g = a;
        awzdVar.b |= 16;
        return (awzd) n.build();
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ Object j(awud awudVar, Intent intent, eyee eyeeVar) {
        MessagingOperationResult f = MessagingOperationResult.f(intent);
        awzc n = n(awudVar, eyeeVar);
        boolean d = f.d();
        n.copyOnWrite();
        awzd awzdVar = (awzd) n.instance;
        awzd awzdVar2 = awzd.a;
        awzdVar.b |= 8;
        awzdVar.f = d;
        awyp a = clhm.a(f.a());
        n.copyOnWrite();
        awzd awzdVar3 = (awzd) n.instance;
        a.getClass();
        awzdVar3.g = a;
        awzdVar3.b |= 16;
        return (awzd) n.build();
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ Object k(Object obj, PendingIntent pendingIntent) {
        awyz awyzVar = (awyz) obj;
        awuh awuhVar = awuh.GROUP;
        awui awuiVar = awyzVar.d;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        awuh b = awuh.b(awuiVar.c);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        int i = true == awuhVar.equals(b) ? 2 : 1;
        eiea eieaVar = new eiea();
        awui awuiVar2 = awyzVar.d;
        if (awuiVar2 == null) {
            awuiVar2 = awui.a;
        }
        eieaVar.b(clik.b(awuiVar2));
        eieaVar.c(awyzVar.i);
        eieaVar.d(i);
        Conversation a = eieaVar.a();
        eigi i2 = Message.i();
        i2.f(awyzVar.h);
        awui awuiVar3 = awyzVar.c;
        if (awuiVar3 == null) {
            awuiVar3 = awui.a;
        }
        i2.i(clik.b(awuiVar3));
        avtv avtvVar = this.e;
        awul awulVar = awyzVar.k;
        if (awulVar == null) {
            awulVar = awul.a;
        }
        i2.k(AutoOneOf_Message_MessageContent.a((ChatMessage) avtvVar.fP(awulVar)));
        fayv fayvVar = awyzVar.j;
        if (fayvVar == null) {
            fayvVar = fayv.a;
        }
        int i3 = engw.d;
        engr engrVar = new engr();
        for (Map.Entry entry : DesugarCollections.unmodifiableMap(fayvVar.b).entrySet()) {
            for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(((fayz) entry.getValue()).b).entrySet()) {
                eieq eieqVar = new eieq();
                eieqVar.c((String) entry.getKey());
                eieqVar.b((String) entry2.getKey());
                eieqVar.d((String) entry2.getValue());
                engrVar.h(eieqVar.a());
            }
        }
        i2.e(engrVar.g());
        awuh awuhVar2 = awuh.UNKNOWN_TYPE;
        awui awuiVar4 = awyzVar.e;
        if (awuiVar4 == null) {
            awuiVar4 = awui.a;
        }
        awuh b2 = awuh.b(awuiVar4.c);
        if (b2 == null) {
            b2 = awuhVar2;
        }
        if (!awuhVar2.equals(b2)) {
            awui awuiVar5 = awyzVar.e;
            if (awuiVar5 == null) {
                awuiVar5 = awui.a;
            }
            i2.h(clik.b(awuiVar5));
        }
        eico j = SendMessageRequest.j();
        j.b(a);
        j.d(i2.a());
        clit clitVar = this.g;
        awya awyaVar = awyzVar.m;
        if (awyaVar == null) {
            awyaVar = awya.a;
        }
        j.e((MessageClass) clitVar.fP(awyaVar));
        cljd cljdVar = this.l;
        axad axadVar = awyzVar.n;
        if (axadVar == null) {
            axadVar = axad.a;
        }
        j.h((TraceId) cljdVar.fP(axadVar));
        j.c(pendingIntent);
        if (((Boolean) clgs.b.e()).booleanValue()) {
            j.g(awyzVar.l);
        }
        return j.a();
    }

    @Override // defpackage.clgz
    public final /* bridge */ /* synthetic */ String l(Object obj) {
        return "RcsMessageId: ".concat(String.valueOf(((awyz) obj).h));
    }

    @Override // defpackage.clgz
    public final String m() {
        return "sendMessage";
    }
}
