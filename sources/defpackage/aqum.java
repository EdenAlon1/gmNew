package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqum implements aqvh {
    public final azpx a;
    public final aqua b;
    public final Optional c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final aqge g;
    public final aqvu h;
    private final aquu i;
    private final errl j;
    private final ffsk k;
    private final aqvt l;

    public aqum(azpx azpxVar, aquu aquuVar, aqvu aqvuVar, aqua aquaVar, Optional optional, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, errl errlVar, ffsk ffskVar, aqvt aqvtVar) {
        azpxVar.getClass();
        aquaVar.getClass();
        optional.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        errlVar.getClass();
        ffskVar.getClass();
        aqvtVar.getClass();
        this.a = azpxVar;
        this.i = aquuVar;
        this.h = aqvuVar;
        this.b = aquaVar;
        this.c = optional;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.j = errlVar;
        this.k = ffskVar;
        this.l = aqvtVar;
        this.g = new aqgg(aquuVar, new emwl() { // from class: aquh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                engw engwVar = (engw) obj;
                engwVar.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : engwVar) {
                    if (((aqux) obj2).t()) {
                        arrayList.add(obj2);
                    }
                }
                return engq.a(arrayList);
            }
        }, errlVar);
    }

    @Override // defpackage.aqvh
    public final aqge a() {
        return this.g;
    }

    @Override // defpackage.aqvh
    public final aqge b() {
        return this.l.a();
    }

    @Override // defpackage.aqvh
    public final aqge c() {
        return this.i;
    }

    @Override // defpackage.aqvh
    public final elfl d(SelfIdentityId selfIdentityId) {
        elfl c;
        selfIdentityId.getClass();
        c = axol.c(this.k, ffhe.a, ffsm.a, new aquj(selfIdentityId, this, null));
        return c;
    }

    @Override // defpackage.aqvh
    public final elfl e() {
        elfl c;
        ekzz f = eleg.f("SelfIdentityRepository#getSelfIdentityForCreatingNewConversationsOrPreservingLegacyBugsNoOtherReason");
        try {
            c = axol.c(this.k, ffhe.a, ffsm.a, new aquk(this, null));
            ffig.a(f, null);
            return c;
        } finally {
        }
    }

    @Override // defpackage.aqvh
    public final elfl f(SelfIdentityId selfIdentityId, aoku aokuVar) {
        elfl c;
        selfIdentityId.getClass();
        aokuVar.getClass();
        c = axol.c(this.k, ffhe.a, ffsm.a, new aqul(this, selfIdentityId, aokuVar, null));
        return c;
    }

    @Override // defpackage.aqvh
    public final elfl g(final Optional optional) {
        final ffji ffjiVar = new ffji() { // from class: aquf
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return ((aqwr) obj).b(aqum.this, optional);
            }
        };
        Object orElse = this.c.map(new Function() { // from class: aqug
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(elfo.e(false));
        orElse.getClass();
        return (elfl) orElse;
    }
}
