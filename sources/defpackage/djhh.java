package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.Conversation;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djhh implements erqj {
    public final entd a = entd.c(dktl.a);
    private final AddUserToGroupRequest b;
    private final Context c;
    private final ffbr d;
    private final errl e;
    private final eima f;
    private final eing g;

    public djhh(AddUserToGroupRequest addUserToGroupRequest, Context context, eima eimaVar, eing eingVar, ffbr ffbrVar, errl errlVar) {
        this.b = addUserToGroupRequest;
        this.c = context;
        this.f = eimaVar;
        this.g = eingVar;
        this.d = ffbrVar;
        this.e = errlVar;
    }

    private final void c(GroupOperationResult groupOperationResult) {
        if (!this.b.d().isPresent()) {
            d(groupOperationResult);
            return;
        }
        Conversation b = groupOperationResult.b();
        MessagingResult a = groupOperationResult.a();
        clnd clndVar = (clnd) clne.a.createBuilder();
        clns clnsVar = (clns) this.f.m().fP(b);
        clndVar.copyOnWrite();
        clne clneVar = (clne) clndVar.instance;
        clnsVar.getClass();
        clneVar.e = clnsVar;
        clneVar.b |= 8;
        clqc f = this.g.f(a);
        clndVar.copyOnWrite();
        clne clneVar2 = (clne) clndVar.instance;
        f.getClass();
        clneVar2.d = f;
        clneVar2.b |= 4;
        eydp eydpVar = (eydp) eydq.a.createBuilder();
        Object obj = this.b.d().get();
        eydpVar.copyOnWrite();
        ((eydq) eydpVar.instance).c = (eyee) obj;
        clndVar.copyOnWrite();
        clne clneVar3 = (clne) clndVar.instance;
        eydq eydqVar = (eydq) eydpVar.build();
        eydqVar.getClass();
        clneVar3.c = eydqVar;
        clneVar3.b |= 1;
        clne clneVar4 = (clne) clndVar.build();
        clns clnsVar2 = clneVar4.e;
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
        erqt.r(ffat.a(clpnVar.a.a(clpq.a(), clpnVar.b), clneVar4), new djhg(this, str), this.e);
    }

    private final void d(GroupOperationResult groupOperationResult) {
        Conversation b = groupOperationResult.b();
        Intent intent = new Intent();
        try {
            GroupOperationResult.d(intent, groupOperationResult);
            dkqd.c(this.c, intent);
            this.b.a().send(this.c, groupOperationResult.a().b(), intent);
        } catch (PendingIntent.CanceledException e) {
            ((ensz) ((ensz) ((ensz) this.a.j()).g(e)).h("com/google/android/ims/messaging/v2/AddUserToGroupOperationResultProcessor", "sendIntent", 135, "AddUserToGroupOperationResultProcessor.java")).t("[%s] Callback intent canceled", b);
        }
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        GroupOperationResult groupOperationResult = (GroupOperationResult) obj;
        groupOperationResult.getClass();
        ((ensz) ((ensz) this.a.h()).h("com/google/android/ims/messaging/v2/AddUserToGroupOperationResultProcessor", "onSuccess", 64, "AddUserToGroupOperationResultProcessor.java")).B("[%s] Group operation completed, result: %s", groupOperationResult.b(), groupOperationResult.a().b());
        c(groupOperationResult);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ((ensz) ((ensz) ((ensz) this.a.j()).g(th)).h("com/google/android/ims/messaging/v2/AddUserToGroupOperationResultProcessor", "onFailure", 74, "AddUserToGroupOperationResultProcessor.java")).D("[%s] Group operation failed: %s", this.b.b().b(), th.getMessage());
        eibw d = MessagingResult.d();
        d.c(16);
        d.b(7);
        MessagingResult e = d.e();
        ehyt ehytVar = new ehyt();
        ehytVar.c(e);
        ehytVar.b(this.b.b());
        c(ehytVar.a());
    }
}
