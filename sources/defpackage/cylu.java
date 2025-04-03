package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cylu implements cylq {
    public final ejvp a;
    public final bctx b;
    public final errl c;
    public bvvl d;
    private final ejvb e;
    private dtrs f;

    public cylu(ejvb ejvbVar, ejvp ejvpVar, bctx bctxVar, errl errlVar) {
        this.e = ejvbVar;
        this.a = ejvpVar;
        this.b = bctxVar;
        this.c = errlVar;
    }

    @Override // defpackage.cylq
    public final ejuh a(lkk lkkVar, ConversationIdType conversationIdType) {
        bvvl bvvlVar = this.d;
        if (bvvlVar != null) {
            bvvlVar.P(this.f);
        }
        this.d = bcui.c(conversationIdType);
        cylt cyltVar = new cylt(this, conversationIdType);
        this.f = cyltVar;
        this.d.M(lkkVar, cyltVar);
        return new ejuy(this.e, new eros() { // from class: cyls
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                final cylu cyluVar = cylu.this;
                return new erph(elfo.g(new Callable() { // from class: cylr
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        cylu cyluVar2 = cylu.this;
                        ParticipantsTable.BindData a = cyluVar2.b.a(cyluVar2.d.y()).a();
                        return a != null ? a.D() : byzi.VERIFICATION_NA;
                    }
                }, cyluVar.c));
            }
        }, "UNVERIFIED_SMS_BANNER_STATE_KEY".concat(conversationIdType.toString()));
    }
}
