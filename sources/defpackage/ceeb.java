package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceeb implements cdwq {
    public static final cskc a = cskc.g("BugleCms", "BlockOnTelephonySyncWorkItemProcessor");
    public final ffbr b;
    public final axdf c;
    public final ceww d;
    private final errl e;

    public ceeb(errl errlVar, ffbr ffbrVar, axdf axdfVar, ceww cewwVar) {
        this.e = errlVar;
        this.b = ffbrVar;
        this.c = axdfVar;
        this.d = cewwVar;
    }

    @Override // defpackage.cdws
    public final /* synthetic */ int a(Object obj) {
        return ((cdwa) obj).c;
    }

    @Override // defpackage.cdwq
    public final /* bridge */ /* synthetic */ elfl c(ceuw ceuwVar, Object obj, Object obj2) {
        final cdwa cdwaVar = (cdwa) obj2;
        return elfo.h(new erog() { // from class: cedz
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return ((coxg) ceeb.this.b.b()).e();
            }
        }, this.e).h(new emwl() { // from class: ceea
            @Override // defpackage.emwl
            public final Object apply(Object obj3) {
                Boolean bool = (Boolean) obj3;
                boolean booleanValue = bool.booleanValue();
                boolean booleanValue2 = bool.booleanValue();
                epfy epfyVar = (epfy) epfz.a.createBuilder();
                epfyVar.copyOnWrite();
                epfz epfzVar = (epfz) epfyVar.instance;
                epfzVar.b |= 1;
                epfzVar.c = booleanValue2;
                epfyVar.copyOnWrite();
                epfz epfzVar2 = (epfz) epfyVar.instance;
                epfzVar2.b |= 2;
                epfzVar2.d = false;
                epfyVar.copyOnWrite();
                epfz epfzVar3 = (epfz) epfyVar.instance;
                epfzVar3.b |= 4;
                epfzVar3.e = booleanValue;
                epfz epfzVar4 = (epfz) epfyVar.build();
                epdx epdxVar = (epdx) epgf.a.createBuilder();
                epdxVar.copyOnWrite();
                epgf epgfVar = (epgf) epdxVar.instance;
                epfzVar4.getClass();
                epgfVar.h = epfzVar4;
                epgfVar.b |= 32;
                epgf epgfVar2 = (epgf) epdxVar.build();
                ceeb ceebVar = ceeb.this;
                ceebVar.c.r(epgfVar2);
                boolean booleanValue3 = bool.booleanValue();
                cdwa cdwaVar2 = cdwaVar;
                if (booleanValue3) {
                    ceeb.a.p("Waiting for telephony full sync to complete.");
                    return ceyt.m();
                }
                ceeb.a.p("Not blocked by telephony full sync.");
                try {
                    ceun ceunVar = cdwaVar2.e;
                    if (ceunVar == null) {
                        ceunVar = ceun.a;
                    }
                    ceyr e = ceyr.e(ceunVar, ceebVar.d);
                    ceys h = ceyt.h();
                    h.b(true);
                    h.c(false);
                    ((cetn) h).a = engw.r(e);
                    return h.a();
                } catch (Exception e2) {
                    throw new IllegalStateException(e2);
                }
            }
        }, this.e);
    }
}
