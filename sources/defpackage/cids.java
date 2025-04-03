package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cids implements cifg {
    private final ckqj a;
    private final errl b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public cids(ckqj ckqjVar, errl errlVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.a = ckqjVar;
        this.b = errlVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
    }

    @Override // defpackage.cifg
    public final /* synthetic */ elfl a(ciff ciffVar) {
        return cife.a(this, ciffVar);
    }

    @Override // defpackage.cifg
    public final /* bridge */ /* synthetic */ elfl b(ciff ciffVar, eyhs eyhsVar) {
        erxs erxsVar = (erxs) eyhsVar;
        if (((atrz) this.d.b()).a()) {
            return ((cicu) this.e.b()).a(erxsVar);
        }
        ckqf ckqfVar = (ckqf) ckqh.a.createBuilder();
        String str = erxsVar.b;
        ckqfVar.copyOnWrite();
        ckqh ckqhVar = (ckqh) ckqfVar.instance;
        str.getClass();
        ckqhVar.c = str;
        csta cstaVar = (csta) this.c.b();
        escu escuVar = erxsVar.c;
        if (escuVar == null) {
            escuVar = escu.a;
        }
        if (cstaVar.b(escuVar)) {
            escu escuVar2 = erxsVar.c;
            if (escuVar2 == null) {
                escuVar2 = escu.a;
            }
            int i = escuVar2.c;
            ckqfVar.copyOnWrite();
            ckqh ckqhVar2 = (ckqh) ckqfVar.instance;
            ckqhVar2.b |= 4;
            ckqhVar2.g = i;
        }
        return this.a.a((ckqh) ckqfVar.build()).i(new eroh() { // from class: cidq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((cevg) obj).a();
            }
        }, this.b).h(new emwl() { // from class: cidr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                erxt erxtVar = (erxt) erxu.a.createBuilder();
                boolean e = ((ceyt) obj).e();
                erxtVar.copyOnWrite();
                ((erxu) erxtVar.instance).b = e;
                return (erxu) erxtVar.build();
            }
        }, this.b);
    }

    @Override // defpackage.cifg
    public final /* bridge */ /* synthetic */ eyhs c(eyee eyeeVar) {
        return (erxs) eyfy.parseFrom(erxs.a, eyeeVar, eyfc.a());
    }
}
