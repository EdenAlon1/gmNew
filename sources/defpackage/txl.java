package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txl implements twr {
    public static final cskc a = cskc.g("BugleDataModel", "ConversationDataService");
    public static final enru b = enru.c("com/google/android/apps/messaging/conversation/dataservice/ConversationDataServiceImpl");
    public final bzac c;
    public final errl d;
    public final twq e;
    public final bcsf f;
    public final errl g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    public final ffbr p;
    public final ffbr q;
    public final ffbr r;
    public final emyl s;
    public final atky t;
    public final ahrl u;
    private final ffbr v;

    public txl(bzac bzacVar, errl errlVar, ahrl ahrlVar, twq twqVar, bcsf bcsfVar, errl errlVar2, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, final ffbr ffbrVar13, atky atkyVar) {
        this.u = ahrlVar;
        this.c = bzacVar;
        this.d = errlVar;
        this.e = twqVar;
        this.f = bcsfVar;
        this.g = errlVar2;
        this.h = ffbrVar;
        this.i = ffbrVar2;
        this.j = ffbrVar3;
        this.k = ffbrVar4;
        this.l = ffbrVar5;
        this.v = ffbrVar6;
        this.m = ffbrVar7;
        this.n = ffbrVar8;
        this.o = ffbrVar9;
        this.p = ffbrVar10;
        this.q = ffbrVar11;
        this.r = ffbrVar12;
        this.s = emys.a(new emyl() { // from class: txg
            @Override // defpackage.emyl
            public final Object get() {
                return (clvl) ffbr.this.b();
            }
        });
        this.t = atkyVar;
    }

    @Override // defpackage.twr
    public final void a(ConversationIdType conversationIdType, aoku aokuVar, boolean z, boolean z2, int i) {
        ((cbut) this.v.b()).c(conversationIdType, aokuVar, z, z2, i).k(axnw.b(), erpp.a);
    }

    @Override // defpackage.twr
    public final void b(ConversationIdType conversationIdType, boolean z, int i) {
        ((cbut) this.v.b()).d(conversationIdType, z, i).k(axnw.b(), erpp.a);
    }

    public final elfl c(final ConversationIdType conversationIdType, final byyt byytVar, final eoko eokoVar) {
        return elfo.g(new Callable() { // from class: txd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(((croc) txl.this.h.b()).a(conversationIdType, byytVar, eokoVar));
            }
        }, this.d);
    }
}
