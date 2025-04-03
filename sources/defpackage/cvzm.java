package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvzm implements cvyr {
    public static final enru a = enru.c("com/google/android/apps/messaging/startchat/groupname/GroupNameUiAdapterImpl");
    public final Context b;
    public final cvyp c;
    public final ConversationId d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final cwis h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    public final auvq n;
    public final fgcm o;
    public final fgcm p;
    public final fgcm q;
    public final AtomicBoolean r;
    private final ffsk s;
    private final ffhd t;
    private final cwav u;
    private final auvw v;
    private final fgdj w;
    private final fgdj x;
    private final fgdj y;
    private final fgdj z;

    public cvzm(ffsk ffskVar, Context context, ffhd ffhdVar, cvyp cvypVar, ConversationId conversationId, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, cwis cwisVar, ffbr ffbrVar4, ffbr ffbrVar5, cwav cwavVar, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, auvq auvqVar, auvw auvwVar) {
        ffskVar.getClass();
        context.getClass();
        ffhdVar.getClass();
        cvypVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        cwisVar.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        cwavVar.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        this.s = ffskVar;
        this.b = context;
        this.t = ffhdVar;
        this.c = cvypVar;
        this.d = conversationId;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = cwisVar;
        this.i = ffbrVar4;
        this.j = ffbrVar5;
        this.u = cwavVar;
        this.k = ffbrVar6;
        this.l = ffbrVar7;
        this.m = ffbrVar8;
        this.n = auvqVar;
        this.v = auvwVar;
        if (cvypVar.b && conversationId == null) {
            throw new IllegalStateException("Check failed.");
        }
        cvzd cvzdVar = new cvzd(cwisVar.a(), this);
        int i = fgcz.a;
        fgdj b = fgbn.b(cvzdVar, ffskVar, fgcy.a(0L, 3), null);
        this.w = b;
        fgcm a2 = fgdm.a(cvypVar.a);
        this.o = a2;
        fgdj b2 = fgbn.b(new cvzg(cwisVar.a(), this), ffskVar, fgcy.a(0L, 3), context.getString(R.string.group_name_description_rcs_pending));
        this.x = b2;
        fgcm a3 = fgdm.a(Boolean.valueOf(cvypVar.b));
        this.p = a3;
        fgdj b3 = fgbn.b(ffyy.a(new cvzj(a2)), ffskVar, fgcy.a(0L, 3), false);
        this.y = b3;
        fgcm a4 = fgdm.a(null);
        this.q = a4;
        this.z = fgbn.b(new cvza(new ffxx[]{b, a2, b2, a3, b3, a4}, this), ffskVar, fgcy.a(0L, 3), new cvzr(null));
        this.r = new AtomicBoolean();
    }

    @Override // defpackage.cvyr
    public final String a() {
        return (String) this.o.c();
    }

    @Override // defpackage.cvyr
    public final fgdj b() {
        return this.z;
    }

    @Override // defpackage.cvyr
    public final void c() {
        this.p.f(true);
        cwav cwavVar = this.u;
        cwavVar.b.d(8, cwavVar.f);
    }

    @Override // defpackage.cvyr
    public final boolean d() {
        return this.c.b || ((Boolean) cvqt.c.e()).booleanValue();
    }

    @Override // defpackage.cvyr
    public final boolean e() {
        return (d() && ((Boolean) this.y.c()).booleanValue()) ? false : true;
    }

    @Override // defpackage.cvyr
    public final boolean f() {
        return d() && !((Boolean) this.p.c()).booleanValue();
    }

    public final void g() {
        if (this.r.getAndSet(true)) {
            return;
        }
        axol.k(this.s, null, new cvyx(this, (String) this.o.c(), null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.cwir r28, java.lang.String r29, defpackage.ffgu r30) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvzm.h(cwir, java.lang.String, ffgu):java.lang.Object");
    }

    public final Object i(cwir cwirVar, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.t), new cvyv(null, this, cwirVar), ffguVar);
    }
}
