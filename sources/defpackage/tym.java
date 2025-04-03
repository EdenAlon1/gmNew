package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tym implements tyk {
    public final aqgi a;
    private final tyj b;
    private final errl c;

    public tym(aqgi aqgiVar, errl errlVar, tyj tyjVar) {
        this.a = aqgiVar;
        this.c = errlVar;
        this.b = tyjVar;
    }

    @Override // defpackage.tyk
    public final ejuh a(ejuh ejuhVar) {
        return new ejuu(ejuhVar, new emwl() { // from class: tyl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Boolean bool;
                Optional optional = (Optional) obj;
                if (optional.isPresent()) {
                    tym tymVar = tym.this;
                    bool = Boolean.valueOf(tymVar.a.e((ephg) optional.get()));
                } else {
                    bool = null;
                }
                return Optional.ofNullable(bool);
            }
        }, this.c);
    }

    @Override // defpackage.tyk
    public final ejuh b(lkk lkkVar, ConversationIdType conversationIdType, int i) {
        tyj tyjVar = this.b;
        errl errlVar = (errl) tyjVar.c.b();
        errlVar.getClass();
        errl errlVar2 = (errl) tyjVar.d.b();
        errlVar2.getClass();
        azei azeiVar = (azei) tyjVar.e.b();
        azeiVar.getClass();
        azei azeiVar2 = (azei) tyjVar.f.b();
        azeiVar2.getClass();
        ejvb ejvbVar = (ejvb) tyjVar.h.b();
        ejvbVar.getClass();
        cqoh cqohVar = (cqoh) tyjVar.i.b();
        cqohVar.getClass();
        ejvp ejvpVar = (ejvp) tyjVar.j.b();
        ejvpVar.getClass();
        azaw azawVar = (azaw) tyjVar.o.b();
        azawVar.getClass();
        lkkVar.getClass();
        ffbr ffbrVar = tyjVar.p;
        ffbr ffbrVar2 = tyjVar.q;
        ffbr ffbrVar3 = tyjVar.k;
        ffbr ffbrVar4 = tyjVar.l;
        ffbr ffbrVar5 = tyjVar.m;
        ffbr ffbrVar6 = tyjVar.n;
        return new tyi(tyjVar.a, tyjVar.b, errlVar, errlVar2, azeiVar, azeiVar2, tyjVar.g, ejvbVar, cqohVar, ejvpVar, ffbrVar3, ffbrVar4, ffbrVar5, ffbrVar6, azawVar, ffbrVar, ffbrVar2, lkkVar, conversationIdType, i);
    }
}
