package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.data.Conversation;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djin implements erqj {
    public final entd a = entd.c(dktl.a);
    private final TriggerGroupNotificationRequest b;
    private final Context c;
    private final ffbr d;
    private final errl e;
    private final eima f;
    private final eing g;

    public djin(TriggerGroupNotificationRequest triggerGroupNotificationRequest, Context context, eima eimaVar, eing eingVar, ffbr ffbrVar, errl errlVar) {
        this.b = triggerGroupNotificationRequest;
        this.c = context;
        this.f = eimaVar;
        this.g = eingVar;
        this.d = ffbrVar;
        this.e = errlVar;
    }

    private final void c(GroupOperationResult groupOperationResult) {
        if (!this.b.c().isPresent()) {
            d(groupOperationResult);
            return;
        }
        Conversation b = groupOperationResult.b();
        MessagingResult a = groupOperationResult.a();
        clso clsoVar = (clso) clsp.a.createBuilder();
        clns clnsVar = (clns) this.f.m().fP(b);
        clsoVar.copyOnWrite();
        clsp clspVar = (clsp) clsoVar.instance;
        clnsVar.getClass();
        clspVar.e = clnsVar;
        clspVar.b |= 8;
        clqc f = this.g.f(a);
        clsoVar.copyOnWrite();
        clsp clspVar2 = (clsp) clsoVar.instance;
        f.getClass();
        clspVar2.d = f;
        clspVar2.b |= 4;
        eydp eydpVar = (eydp) eydq.a.createBuilder();
        Object obj = this.b.c().get();
        eydpVar.copyOnWrite();
        ((eydq) eydpVar.instance).c = (eyee) obj;
        clsoVar.copyOnWrite();
        clsp clspVar3 = (clsp) clsoVar.instance;
        eydq eydqVar = (eydq) eydpVar.build();
        eydqVar.getClass();
        clspVar3.c = eydqVar;
        clspVar3.b |= 1;
        clsp clspVar4 = (clsp) clsoVar.build();
        clns clnsVar2 = clspVar4.e;
        if (clnsVar2 == null) {
            clnsVar2 = clns.a;
        }
        clqs clqsVar = clnsVar2.e;
        if (clqsVar == null) {
            clqsVar = clqs.a;
        }
        ffbr ffbrVar = this.d;
        String str = clqsVar.c;
        clpn clpnVar = (clpn) ffbrVar.b();
        erqt.r(ffat.a(clpnVar.a.a(clpq.i(), clpnVar.b), clspVar4), new djim(this, str), this.e);
    }

    private final void d(GroupOperationResult groupOperationResult) {
        Conversation b = groupOperationResult.b();
        Intent intent = new Intent();
        try {
            GroupOperationResult.d(intent, groupOperationResult);
            dkqd.c(this.c, intent);
            this.b.a().send(this.c, groupOperationResult.a().b(), intent);
        } catch (PendingIntent.CanceledException e) {
            ((ensz) ((ensz) ((ensz) this.a.j()).g(e)).h("com/google/android/ims/messaging/v2/TriggerGroupNotificationOperationResultProcessor", "sendIntent", 123, "TriggerGroupNotificationOperationResultProcessor.java")).t("[%s] Callback intent canceled", b);
        }
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        GroupOperationResult groupOperationResult = (GroupOperationResult) obj;
        groupOperationResult.getClass();
        ((ensz) ((ensz) this.a.h()).h("com/google/android/ims/messaging/v2/TriggerGroupNotificationOperationResultProcessor", "onSuccess", 64, "TriggerGroupNotificationOperationResultProcessor.java")).B("[%s] Group operation completed, result: %d", groupOperationResult.b(), groupOperationResult.a().b());
        c(groupOperationResult);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        Conversation b = this.b.b();
        ((ensz) ((ensz) ((ensz) this.a.j()).g(th)).h("com/google/android/ims/messaging/v2/TriggerGroupNotificationOperationResultProcessor", "onFailure", 74, "TriggerGroupNotificationOperationResultProcessor.java")).D("[%s] Group operation failed: %s", b.b(), th.getMessage());
        eibw d = MessagingResult.d();
        d.c(16);
        d.b(7);
        MessagingResult e = d.e();
        ehyt ehytVar = new ehyt();
        ehytVar.c(e);
        ehytVar.b(b);
        c(ehytVar.a());
    }
}
