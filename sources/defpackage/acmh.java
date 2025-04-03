package defpackage;

import com.google.android.gms.duokit.GetApiAvailabilityResponse;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acmh implements acus {
    public static final cskc a = cskc.g("Bugle", "GetDuoKitApiAvailabilityHandler");
    public final ffbr b;
    public final ffbr c;
    private final ffbr d;
    private final errl e;

    public acmh(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, errl errlVar) {
        this.d = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.e = errlVar;
    }

    @Override // defpackage.acus
    public final elfl a(final esnk esnkVar, final esnl esnlVar) {
        a.p("Received Get DuoKit API availability request");
        return elfl.g(duin.a(((dgea) this.d.b()).f())).h(new emwl() { // from class: acmf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                GetApiAvailabilityResponse getApiAvailabilityResponse = (GetApiAvailabilityResponse) obj;
                int i = getApiAvailabilityResponse.a;
                acmh.a.p(a.h(i, "DuoKit API availability response: "));
                int i2 = i != 1 ? i != 2 ? i != 3 ? 1 : 4 : 3 : 2;
                esnl esnlVar2 = esnlVar;
                acmh acmhVar = acmh.this;
                ((akzt) acmhVar.c.b()).e("Bugle.Satellite.DuoKit.ApiAvailability.State", i2);
                int i3 = getApiAvailabilityResponse.a;
                if (i3 == 1 || i3 == 2 || i3 == 3) {
                    fagh faghVar = fagh.OK;
                    esnlVar2.copyOnWrite();
                    esnn esnnVar = (esnn) esnlVar2.instance;
                    esnn esnnVar2 = esnn.a;
                    esnnVar.e = faghVar.a();
                    esmo esmoVar = (esmo) esmq.a.createBuilder();
                    esmoVar.copyOnWrite();
                    ((esmq) esmoVar.instance).b = esmp.a(4);
                    esmq esmqVar = (esmq) esmoVar.build();
                    esnlVar2.copyOnWrite();
                    esnn esnnVar3 = (esnn) esnlVar2.instance;
                    esmqVar.getClass();
                    esnnVar3.c = esmqVar;
                    esnnVar3.b = 110;
                    return esnlVar2.build();
                }
                esnk esnkVar2 = esnkVar;
                ((acip) acmhVar.b.b()).n(esnkVar2.d, 8, esnj.b(esnj.c(esnkVar2.b)), fagh.UNAVAILABLE, 3);
                fagh faghVar2 = fagh.UNAVAILABLE;
                esnlVar2.copyOnWrite();
                esnn esnnVar4 = (esnn) esnlVar2.instance;
                esnn esnnVar5 = esnn.a;
                esnnVar4.e = faghVar2.a();
                esmo esmoVar2 = (esmo) esmq.a.createBuilder();
                esmoVar2.copyOnWrite();
                ((esmq) esmoVar2.instance).b = esmp.a(3);
                esmq esmqVar2 = (esmq) esmoVar2.build();
                esnlVar2.copyOnWrite();
                esnn esnnVar6 = (esnn) esnlVar2.instance;
                esmqVar2.getClass();
                esnnVar6.c = esmqVar2;
                esnnVar6.b = 110;
                return esnlVar2.build();
            }
        }, this.e).f(Exception.class, new eroh() { // from class: acmg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                acmh.a.n("Get DuoKit API availability failed");
                acip acipVar = (acip) acmh.this.b.b();
                esnk esnkVar2 = esnkVar;
                acipVar.n(esnkVar2.d, 8, esnj.b(esnj.c(esnkVar2.b)), fagh.INTERNAL, 4);
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
                esmo esmoVar = (esmo) esmq.a.createBuilder();
                esmoVar.copyOnWrite();
                ((esmq) esmoVar.instance).b = esmp.a(3);
                esmq esmqVar = (esmq) esmoVar.build();
                esnlVar2.copyOnWrite();
                esnn esnnVar4 = (esnn) esnlVar2.instance;
                esmqVar.getClass();
                esnnVar4.c = esmqVar;
                esnnVar4.b = 110;
                return elfo.e(esnlVar2.build());
            }
        }, this.e);
    }
}
