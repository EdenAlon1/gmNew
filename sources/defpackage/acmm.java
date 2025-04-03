package defpackage;

import com.google.android.gms.duokit.DuoId;
import com.google.android.gms.duokit.GetApiAvailabilityResponse;
import com.google.android.gms.duokit.SetupDuoRequest;
import com.google.android.gms.duokit.StartCallRequest;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acmm implements acus {
    public static final cskc a = cskc.g("Bugle", "StartDuoCallHandler");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final errl e;
    private final ffbr f;

    public acmm(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, errl errlVar, ffbr ffbrVar4) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = errlVar;
        this.f = ffbrVar4;
    }

    @Override // defpackage.acus
    public final elfl a(final esnk esnkVar, final esnl esnlVar) {
        a.p("Received Duo start call request");
        try {
            if (((esfl) this.f.b()).j(((esfl) this.f.b()).n((esnkVar.b == 111 ? (esnz) esnkVar.c : esnz.a).b, ""))) {
                return elfl.g(duin.a(((dgea) this.b.b()).f())).i(new eroh() { // from class: acmk
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        int i = ((GetApiAvailabilityResponse) obj).a;
                        final esnl esnlVar2 = esnlVar;
                        esnk esnkVar2 = esnkVar;
                        acmm acmmVar = acmm.this;
                        if (i == 1 || i == 2) {
                            ((akzt) acmmVar.d.b()).c("Bugle.Satellite.DuoKit.SetupDuo.Count");
                            return elfl.g(duin.a(((dgea) acmmVar.b.b()).c(new SetupDuoRequest()))).h(new emwl() { // from class: acmj
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    esnl esnlVar3 = esnl.this;
                                    fagh faghVar = fagh.OK;
                                    esnlVar3.copyOnWrite();
                                    esnn esnnVar = (esnn) esnlVar3.instance;
                                    esnn esnnVar2 = esnn.a;
                                    esnnVar.e = faghVar.a();
                                    eyex eyexVar = eyex.a;
                                    esnlVar3.copyOnWrite();
                                    esnn esnnVar3 = (esnn) esnlVar3.instance;
                                    eyexVar.getClass();
                                    esnnVar3.c = eyexVar;
                                    esnnVar3.b = 111;
                                    return esnlVar3.build();
                                }
                            }, acmmVar.e);
                        }
                        if (i == 3) {
                            ((akzt) acmmVar.d.b()).c("Bugle.Satellite.DuoKit.StartDuoCall.Count");
                            DuoId duoId = new DuoId();
                            duoId.b = (esnkVar2.b == 111 ? (esnz) esnkVar2.c : esnz.a).b;
                            dgdv.a(duoId);
                            StartCallRequest startCallRequest = new StartCallRequest();
                            startCallRequest.a = duoId;
                            startCallRequest.d = cvfb.a.d;
                            return elfl.g(duin.a(((dgea) acmmVar.b.b()).d(startCallRequest))).h(new emwl() { // from class: acmi
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    esnl esnlVar3 = esnl.this;
                                    fagh faghVar = fagh.OK;
                                    esnlVar3.copyOnWrite();
                                    esnn esnnVar = (esnn) esnlVar3.instance;
                                    esnn esnnVar2 = esnn.a;
                                    esnnVar.e = faghVar.a();
                                    eyex eyexVar = eyex.a;
                                    esnlVar3.copyOnWrite();
                                    esnn esnnVar3 = (esnn) esnlVar3.instance;
                                    eyexVar.getClass();
                                    esnnVar3.c = eyexVar;
                                    esnnVar3.b = 111;
                                    return esnlVar3.build();
                                }
                            }, acmmVar.e);
                        }
                        acmm.a.r("Get DuoKit API availability returned unknown");
                        ((acip) acmmVar.c.b()).n(esnkVar2.d, 8, esnj.b(esnj.c(esnkVar2.b)), fagh.UNKNOWN, 5);
                        fagh faghVar = fagh.UNKNOWN;
                        esnlVar2.copyOnWrite();
                        esnn esnnVar = (esnn) esnlVar2.instance;
                        esnn esnnVar2 = esnn.a;
                        esnnVar.e = faghVar.a();
                        esnlVar2.copyOnWrite();
                        ((esnn) esnlVar2.instance).f = "DuoKit api availability is unknown";
                        eyex eyexVar = eyex.a;
                        esnlVar2.copyOnWrite();
                        esnn esnnVar3 = (esnn) esnlVar2.instance;
                        eyexVar.getClass();
                        esnnVar3.c = eyexVar;
                        esnnVar3.b = 111;
                        return elfo.e(esnlVar2.build());
                    }
                }, this.e).f(Exception.class, new eroh() { // from class: acml
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        acmm.a.r("Duo start call failed");
                        acip acipVar = (acip) acmm.this.c.b();
                        esnk esnkVar2 = esnkVar;
                        acipVar.n(esnkVar2.d, 8, esnj.b(esnj.c(esnkVar2.b)), fagh.UNAVAILABLE, 6);
                        esnl esnlVar2 = esnlVar;
                        fagh faghVar = fagh.INTERNAL;
                        esnlVar2.copyOnWrite();
                        esnn esnnVar = (esnn) esnlVar2.instance;
                        esnn esnnVar2 = esnn.a;
                        esnnVar.e = faghVar.a();
                        String str = (String) Optional.ofNullable(((Exception) obj).getMessage()).orElse("Unknown Error");
                        esnlVar2.copyOnWrite();
                        esnn esnnVar3 = (esnn) esnlVar2.instance;
                        str.getClass();
                        esnnVar3.f = str;
                        eyex eyexVar = eyex.a;
                        esnlVar2.copyOnWrite();
                        esnn esnnVar4 = (esnn) esnlVar2.instance;
                        eyexVar.getClass();
                        esnnVar4.c = eyexVar;
                        esnnVar4.b = 111;
                        return elfo.e(esnlVar2.build());
                    }
                }, this.e);
            }
        } catch (esfg unused) {
        }
        ((acip) this.c.b()).n(esnkVar.d, 8, esnj.b(esnj.c(esnkVar.b)), fagh.INVALID_ARGUMENT, 7);
        fagh faghVar = fagh.INVALID_ARGUMENT;
        esnlVar.copyOnWrite();
        esnn esnnVar = (esnn) esnlVar.instance;
        esnn esnnVar2 = esnn.a;
        esnnVar.e = faghVar.a();
        esnlVar.copyOnWrite();
        ((esnn) esnlVar.instance).f = "StartDuoCall E164 number is invalid";
        eyex eyexVar = eyex.a;
        esnlVar.copyOnWrite();
        esnn esnnVar3 = (esnn) esnlVar.instance;
        eyexVar.getClass();
        esnnVar3.c = eyexVar;
        esnnVar3.b = 111;
        return elfo.e(esnlVar.build());
    }
}
