package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cibq implements cifg {
    private final aolr a;
    private final ckza b;
    private final errl c;
    private final ffbr d;
    private final ffbr e;

    public cibq(aolr aolrVar, ckza ckzaVar, errl errlVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = aolrVar;
        this.b = ckzaVar;
        this.c = errlVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
    }

    @Override // defpackage.cifg
    public final /* synthetic */ elfl a(ciff ciffVar) {
        return cife.a(this, ciffVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cifg
    public final /* bridge */ /* synthetic */ elfl b(ciff ciffVar, eyhs eyhsVar) {
        aoku n;
        Optional empty;
        ertp ertpVar = (ertp) eyhsVar;
        if ((ertpVar.b & 1) != 0) {
            aolr aolrVar = this.a;
            erul erulVar = ertpVar.e;
            if (erulVar == null) {
                erulVar = erul.a;
            }
            n = aolrVar.n(erulVar.c);
        } else {
            n = ertpVar.d.size() > 0 ? this.a.n(((erul) ertpVar.d.get(0)).c) : null;
        }
        if (n == null) {
            ertr ertrVar = (ertr) erts.a.createBuilder();
            ertrVar.copyOnWrite();
            ((erts) ertrVar.instance).b = ertq.a(4);
            return elfo.e((erts) ertrVar.build());
        }
        ckyy ckyyVar = (ckyy) ckyz.a.createBuilder();
        String str = ertpVar.c;
        ckyyVar.copyOnWrite();
        ckyz ckyzVar = (ckyz) ckyyVar.instance;
        str.getClass();
        ckyzVar.c = str;
        aora e = aolm.e(n);
        ckyyVar.copyOnWrite();
        ckyz ckyzVar2 = (ckyz) ckyyVar.instance;
        e.getClass();
        ckyzVar2.a();
        ckyzVar2.d.add(e);
        Optional.empty();
        csta cstaVar = (csta) this.e.b();
        escu escuVar = ertpVar.f;
        if (escuVar == null) {
            escuVar = escu.a;
        }
        Optional a = cstaVar.a(escuVar);
        if (a.isPresent()) {
            try {
                empty = Optional.of(((ckac) this.d.b()).b(((Integer) a.get()).intValue()));
            } catch (cjzk unused) {
                empty = Optional.empty();
            }
            if (empty.isEmpty()) {
                ertr ertrVar2 = (ertr) erts.a.createBuilder();
                ertrVar2.copyOnWrite();
                ((erts) ertrVar2.instance).b = ertq.a(4);
                return elfo.e((erts) ertrVar2.build());
            }
            Object obj = empty.get();
            ckyyVar.copyOnWrite();
            ckyz ckyzVar3 = (ckyz) ckyyVar.instance;
            ckyzVar3.e = (awui) obj;
            ckyzVar3.b |= 1;
        }
        return ((cevh) this.b.a.b()).b(ceyr.g("add_members_to_rcs_conversation", (ckyz) ckyyVar.build())).i(new eroh() { // from class: cibo
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                return ((cevg) obj2).a();
            }
        }, this.c).h(new emwl() { // from class: cibp
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                ertr ertrVar3 = (ertr) erts.a.createBuilder();
                int i = true != ((ceyt) obj2).e() ? 4 : 3;
                ertrVar3.copyOnWrite();
                ((erts) ertrVar3.instance).b = ertq.a(i);
                return (erts) ertrVar3.build();
            }
        }, this.c);
    }

    @Override // defpackage.cifg
    public final /* bridge */ /* synthetic */ eyhs c(eyee eyeeVar) {
        return (ertp) eyfy.parseFrom(ertp.a, eyeeVar, eyfc.a());
    }
}
