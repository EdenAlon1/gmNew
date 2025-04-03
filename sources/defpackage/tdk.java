package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tdk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ tdl b;
    final /* synthetic */ eskr c;
    final /* synthetic */ long d;
    final /* synthetic */ eyee e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdk(tdl tdlVar, eskr eskrVar, long j, eyee eyeeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = tdlVar;
        this.c = eskrVar;
        this.d = j;
        this.e = eyeeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tdk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            tdl tdlVar = this.b;
            eskr eskrVar = this.c;
            tee teeVar = (tee) tdlVar.b.get(eskt.a((eskrVar.b == 11 ? (esku) eskrVar.c : esku.a).b));
            if (teeVar == null) {
                ensk j = tdl.a.j();
                j.Y(ente.a, "BugleAlphaverse");
                enrr enrrVar = (enrr) j.h("com/google/android/apps/messaging/cloudstore/cmsrpc/DeviceOnboardingDelegate$handleCmsRpcPayload$1", "invokeSuspend", 43, "DeviceOnboardingDelegate.kt");
                eskr eskrVar2 = this.c;
                enrrVar.t("No DeviceOnboardingPayloadDelegate registered for payloadCase: %s", eskt.a((eskrVar2.b == 11 ? (esku) eskrVar2.c : esku.a).b));
                return Optional.empty();
            }
            eskr eskrVar3 = this.c;
            String str = eskrVar3.d;
            str.getClass();
            long j2 = this.d;
            eyee eyeeVar = this.e;
            esku eskuVar = eskrVar3.b == 11 ? (esku) eskrVar3.c : esku.a;
            eskuVar.getClass();
            elfl a = teeVar.a(str, j2, eyeeVar, eskuVar);
            this.a = 1;
            obj = fgfz.c(a, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            return Optional.empty();
        }
        eskr eskrVar4 = this.c;
        eskp eskpVar = (eskp) eskr.a.createBuilder();
        eskpVar.getClass();
        String str2 = eskrVar4.d;
        str2.getClass();
        eskpVar.copyOnWrite();
        ((eskr) eskpVar.instance).d = str2;
        esku eskuVar2 = (esku) optional.get();
        eskpVar.copyOnWrite();
        eskr eskrVar5 = (eskr) eskpVar.instance;
        eskrVar5.c = eskuVar2;
        eskrVar5.b = 11;
        eyfy build = eskpVar.build();
        build.getClass();
        return Optional.of((eskr) build);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new tdk(this.b, this.c, this.d, this.e, ffguVar);
    }
}
