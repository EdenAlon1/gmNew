package defpackage;

import android.content.Context;
import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djcu {
    private final Context a;
    private final Executor b;
    private final dlpw c;
    private final errl d;
    private final eeft e;
    private final eehz f;
    private final dkib g;
    private final djgy h;
    private final dkgw i;
    private final djix j;
    private final ctvb k;
    private final djcs l;
    private final errm m;
    private final djcq n;
    private final djcn o;
    private final dkrp p;
    private final dkpp q;
    private final dkcp r;
    private final djhc s;
    private final djey t;

    public djcu(Context context, Executor executor, dlpw dlpwVar, errl errlVar, eeft eeftVar, eehz eehzVar, dkib dkibVar, djgy djgyVar, dkgw dkgwVar, djix djixVar, ctvb ctvbVar, djcs djcsVar, errm errmVar, djcq djcqVar, djcn djcnVar, dkrp dkrpVar, dkpp dkppVar, dkcp dkcpVar, djhc djhcVar, djey djeyVar) {
        this.a = context;
        this.b = executor;
        this.c = dlpwVar;
        this.d = errlVar;
        this.e = eeftVar;
        this.f = eehzVar;
        this.g = dkibVar;
        this.h = djgyVar;
        this.i = dkgwVar;
        this.j = djixVar;
        this.k = ctvbVar;
        this.l = djcsVar;
        this.m = errmVar;
        this.n = djcqVar;
        this.o = djcnVar;
        this.p = dkrpVar;
        this.q = dkppVar;
        this.r = dkcpVar;
        this.s = djhcVar;
        this.t = djeyVar;
    }

    public final djcv a() {
        djbs djbsVar = new djbs();
        djbsVar.a = this.a;
        djbsVar.b = this.b;
        djbsVar.c = this.c;
        djbsVar.d = this.d;
        djbsVar.e = this.e;
        eehz eehzVar = this.f;
        eehzVar.getClass();
        djbsVar.f = eehzVar;
        djbsVar.g = this.g;
        djbsVar.h = this.h;
        dkgw dkgwVar = this.i;
        dkgwVar.getClass();
        djbsVar.i = dkgwVar;
        djbsVar.j = this.j;
        djbsVar.k = this.k;
        djcs djcsVar = this.l;
        djcsVar.getClass();
        djbsVar.l = djcsVar;
        djbsVar.m = this.m;
        djbsVar.n = this.n;
        djbsVar.o = this.o;
        djbsVar.p = this.p;
        djbsVar.q = this.q;
        djbsVar.r = this.r;
        djbsVar.t = this.t;
        djhc djhcVar = this.s;
        djhcVar.getClass();
        djbsVar.s = djhcVar;
        return djbsVar;
    }

    public final ListenableFuture b(AddUserToGroupRequest addUserToGroupRequest) {
        djcv a = a();
        a.b(addUserToGroupRequest);
        return ((djbu) a.a()).U.d();
    }

    public final ListenableFuture c(CreateGroupRequest createGroupRequest) {
        djcv a = a();
        a.b(createGroupRequest);
        return ((djbu) a.a()).Y.d();
    }

    public final ListenableFuture d(RemoveUserFromGroupRequest removeUserFromGroupRequest) {
        djcv a = a();
        a.b(removeUserFromGroupRequest);
        return ((djbu) a.a()).af.d();
    }

    public final ListenableFuture e(SendMessageRequest sendMessageRequest) {
        djcv a = a();
        a.b(sendMessageRequest);
        return ((djbu) a.a()).d.d();
    }

    public final ListenableFuture f(TriggerGroupNotificationRequest triggerGroupNotificationRequest) {
        djcv a = a();
        a.b(triggerGroupNotificationRequest);
        return ((djbu) a.a()).am.d();
    }

    public final ListenableFuture g(UpdateGroupRequest updateGroupRequest) {
        djcv a = a();
        a.b(updateGroupRequest);
        return ((djbu) a.a()).aq.d();
    }
}
