package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckjk implements ckju {
    public final ckjh a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final errl e;

    public ckjk(ckjh ckjhVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, errl errlVar) {
        this.a = ckjhVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = errlVar;
    }

    @Override // defpackage.ckju
    public final ConversationIdType a(ckjz ckjzVar) {
        crme c = c(ckjzVar);
        return c == null ? bdgq.a : c.a();
    }

    @Override // defpackage.ckju
    public final crme c(ckjz ckjzVar) {
        ckhr ckhrVar = (ckhr) ckjzVar;
        Optional a = clbh.a((fayv) ckhrVar.r.orElse(null), clbg.RCS_PENPAL_NAMESPACE, "BUGLE-CONVERSATION-ID");
        final Optional of = a.isPresent() ? Optional.of(bdgq.b((String) a.get())) : Optional.empty();
        if (of.isPresent()) {
            return new crlz((ConversationIdType) of.get(), new fazb() { // from class: ckji
                @Override // defpackage.fazb
                public final Object b() {
                    return ckjk.this.a.b((ConversationIdType) of.get());
                }
            });
        }
        Optional a2 = clbh.a((fayv) ckhrVar.r.orElse(null), clbg.RCS_PENPAL_NAMESPACE, "PENPAL-COUNTERPARTY-NUMBER");
        Optional of2 = a2.isPresent() ? Optional.of(((aqky) this.d.b()).a(((aolr) this.c.b()).b(((avkc) this.b.b()).a((String) a2.get(), false)))) : Optional.empty();
        if (!of2.isPresent()) {
            return this.a.c(ckjzVar);
        }
        ckjh ckjhVar = this.a;
        ckhq ckhqVar = new ckhq(ckjzVar);
        ckhqVar.r(engw.r(of2.get()));
        return ckjhVar.c(ckhqVar.D());
    }

    @Override // defpackage.ckju
    public final elfl d(final ckjz ckjzVar) {
        return elfo.g(new Callable() { // from class: ckjj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ckjk.this.a(ckjzVar);
            }
        }, this.e);
    }
}
