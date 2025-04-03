package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class chep implements cheq {
    public final ciji a;
    public final cgwk b;
    public final chrv c;
    public final chbx d;
    public final Object e = new Object();
    public final Map f = new HashMap();
    public final akzt g;
    public final fazb h;
    public final chga i;
    private final errl j;
    private final Optional k;
    private final Optional l;
    private final albq m;
    private final chih n;

    public chep(errl errlVar, Optional optional, chrv chrvVar, ciji cijiVar, cgwk cgwkVar, chbx chbxVar, akzt akztVar, Optional optional2, fazb fazbVar, chga chgaVar, albq albqVar, chih chihVar) {
        this.j = errlVar;
        this.c = chrvVar;
        this.k = optional;
        this.a = cijiVar;
        this.m = albqVar;
        this.n = chihVar;
        this.b = cgwkVar;
        this.d = chbxVar;
        this.g = akztVar;
        this.l = optional2;
        this.h = fazbVar;
        this.i = chgaVar;
    }

    @Override // defpackage.cheq
    public final elfl a(ciin ciinVar) {
        return b(ciinVar, chis.d());
    }

    public final elfl b(final ciin ciinVar, chis chisVar) {
        elfl s;
        chgt chgtVar = (chgt) chisVar;
        String str = ((chgs) chgtVar.b).a;
        akzw b = str == null ? alaq.a : this.m.b(str);
        chih chihVar = this.n;
        chig chigVar = chgtVar.a;
        ciil b2 = ciinVar.b();
        int ordinal = b2.a().ordinal();
        if (ordinal == 0) {
            throw new UnsupportedOperationException("UNREGISTERED support not implemented");
        }
        if (ordinal == 1) {
            s = this.b.s();
        } else {
            if (ordinal != 2) {
                throw new UnsupportedOperationException("unknown registration type ".concat(b2.toString()));
            }
            s = this.d.a((ciii) b2).i(new eroh() { // from class: cheh
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return ((chbu) obj).s();
                }
            }, erpp.a);
        }
        elfl i = chihVar.a(chigVar, d(ciinVar, s)).f(Throwable.class, new eroh() { // from class: chel
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                elfl l;
                Throwable th = (Throwable) obj;
                if (chfh.a(th) != Status.Code.UNAUTHENTICATED) {
                    return elfo.d(th);
                }
                ciin ciinVar2 = ciinVar;
                chep chepVar = chep.this;
                csjy.c("BugleNetwork", "Handle UNAUTHENTICATED error by immediately refresh registration.");
                ciil b3 = ciinVar2.b();
                int ordinal2 = b3.a().ordinal();
                if (ordinal2 == 0) {
                    throw new UnsupportedOperationException("UNREGISTERED support not implemented");
                }
                if (ordinal2 == 1) {
                    l = chepVar.b.l(cgwm.FORCE_REFRESH);
                } else {
                    if (ordinal2 != 2) {
                        throw new UnsupportedOperationException("unknown registration type ".concat(b3.toString()));
                    }
                    l = chepVar.d.a((ciii) b3).i(new eroh() { // from class: chen
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            return ((chbu) obj2).l(cgwm.FORCE_REFRESH);
                        }
                    }, erpp.a);
                }
                return chepVar.d(ciinVar2, l);
            }
        }, this.j).i(new eroh() { // from class: chem
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ciin ciinVar2 = ciin.this;
                ListenableFuture e = ciinVar2.e((eyhs) obj);
                ciinVar2.j();
                return e;
            }
        }, erpp.a);
        elfr.l(i, new cheo(this, b, chisVar, ciinVar), this.j);
        return i;
    }

    @Override // defpackage.cijh
    public final elfl c() {
        if (this.l.isPresent()) {
            csjy.l("BugleNetwork", "Retrying RPC and showing notification");
            return (this.k.isPresent() ? ((cilk) this.k.get()).d() : elfo.e(null)).i(new eroh() { // from class: chei
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return ((bzef) chep.this.h.b()).c();
                }
            }, erpp.a);
        }
        csjy.n("BugleNetwork", "DittoForegroundService is not supported in this device");
        return elfo.d(new UnsupportedOperationException("DittoForegroundService is not available in this device"));
    }

    public final elfl d(final ciin ciinVar, elfl elflVar) {
        final String str = ciinVar.b().a() == ciik.PHONE_NUMBER ? "RCS" : "Bugle";
        return elflVar.i(new eroh() { // from class: chej
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                fcfn a = chep.this.i.a(str);
                eyee eyeeVar = ((fcdu) obj).b;
                a.copyOnWrite();
                fcfo fcfoVar = (fcfo) a.instance;
                fcfo fcfoVar2 = fcfo.a;
                eyeeVar.getClass();
                fcfoVar.f = eyeeVar;
                return ciinVar.c((fcfo) a.build());
            }
        }, this.j).i(new eroh() { // from class: chek
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                chep chepVar = chep.this;
                ciin ciinVar2 = ciinVar;
                eyhs eyhsVar = (eyhs) obj;
                if (eyhsVar != null) {
                    chepVar.g.g("Bugle.Network.Rpc.Request.Size.Bytes", eyhsVar.getSerializedSize());
                    ciinVar2.i();
                }
                return ciinVar2.d(chepVar.c, eyhsVar);
            }
        }, this.j);
    }
}
