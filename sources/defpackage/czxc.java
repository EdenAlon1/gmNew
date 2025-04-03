package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czxc implements ffjn {
    final /* synthetic */ czxf a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ ParticipantsTable.BindData c;
    final /* synthetic */ ffix d;
    final /* synthetic */ czxn e;

    public czxc(czxf czxfVar, ConversationIdType conversationIdType, ParticipantsTable.BindData bindData, ffix ffixVar, czxn czxnVar) {
        this.a = czxfVar;
        this.b = conversationIdType;
        this.c = bindData;
        this.d = ffixVar;
        this.e = czxnVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        ((crw) obj).getClass();
        hfdVar.v(-1647494779);
        boolean F = hfdVar.F(this.a) | hfdVar.F(this.b) | hfdVar.F(this.c) | hfdVar.D(this.d);
        Object f = hfdVar.f();
        if (F || f == hfc.a) {
            final ffix ffixVar = this.d;
            final ParticipantsTable.BindData bindData = this.c;
            final ConversationIdType conversationIdType = this.b;
            final czxf czxfVar = this.a;
            ffix ffixVar2 = new ffix() { // from class: czxb
                @Override // defpackage.ffix
                public final Object invoke() {
                    czxf czxfVar2 = czxf.this;
                    taa taaVar = (taa) czxfVar2.c.b();
                    taf k = tak.k();
                    k.c(conversationIdType);
                    k.d(taj.RBM_BLOCK);
                    syk sykVar = (syk) k;
                    sykVar.e = 1;
                    ParticipantsTable.BindData bindData2 = bindData;
                    sykVar.d = syf.a(bindData2);
                    sykVar.b = bindData2;
                    sykVar.c = new syb(2);
                    final ffix ffixVar3 = ffixVar;
                    sykVar.a = new Runnable() { // from class: czxa
                        @Override // java.lang.Runnable
                        public final void run() {
                            ffix.this.invoke();
                        }
                    };
                    k.e();
                    sykVar.f = 9;
                    taaVar.d(k.f());
                    avjf avjfVar = (avjf) czxfVar2.d.b();
                    eqex eqexVar = (eqex) eqey.a.createBuilder();
                    eqexVar.copyOnWrite();
                    eqey eqeyVar = (eqey) eqexVar.instance;
                    eqeyVar.c = 2;
                    eqeyVar.b |= 1;
                    avjfVar.i((eqey) eqexVar.build());
                    return ffcu.a;
                }
            };
            hfdVar.y(ffixVar2);
            f = ffixVar2;
        }
        hfdVar.o();
        czyb.c(this.e, this.d, (ffix) f, null, hfdVar, 0);
        return ffcu.a;
    }
}
