package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chez implements cheq {
    public final ciji a;
    public final chdj b;
    public final chrv c;
    public final chbx d;
    public final akzt e;
    public final fazb f;
    public final chga g;
    private final errl h;
    private final Optional i;
    private final Optional j;
    private final Optional k;
    private final albq l;
    private final chih m;

    public chez(errl errlVar, Optional optional, chrv chrvVar, ciji cijiVar, chdj chdjVar, Optional optional2, chbx chbxVar, akzt akztVar, Optional optional3, fazb fazbVar, chga chgaVar, albq albqVar, chih chihVar) {
        this.h = errlVar;
        this.c = chrvVar;
        this.i = optional;
        this.a = cijiVar;
        this.k = optional2;
        this.l = albqVar;
        this.m = chihVar;
        this.b = chdjVar;
        this.d = chbxVar;
        this.e = akztVar;
        this.j = optional3;
        this.f = fazbVar;
        this.g = chgaVar;
    }

    private static boolean d(ciil ciilVar) {
        return asly.a() && (ciilVar instanceof ciih) && Objects.equals(((ciih) ciilVar).a, "CMS");
    }

    @Override // defpackage.cheq
    public final elfl a(final ciin ciinVar) {
        elfl s;
        chis d = chis.d();
        chgt chgtVar = (chgt) d;
        String str = ((chgs) chgtVar.b).a;
        akzw b = str == null ? alaq.a : this.l.b(str);
        chih chihVar = this.m;
        chig chigVar = chgtVar.a;
        ciil b2 = ciinVar.b();
        int ordinal = b2.a().ordinal();
        if (ordinal == 0) {
            throw new UnsupportedOperationException("UNREGISTERED support not implemented");
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                s = this.d.a((ciii) b2).i(new eroh() { // from class: cheu
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return ((chbu) obj).s();
                    }
                }, erpp.a);
            } else {
                if (ordinal != 3 && ordinal != 4) {
                    throw new UnsupportedOperationException("unknown registration type ".concat(b2.toString()));
                }
                if (d(b2) && this.k.isPresent()) {
                    s = ((chdj) this.k.get()).k();
                }
            }
            elfl i = chihVar.a(chigVar, b(ciinVar, s)).f(Throwable.class, new eroh() { // from class: chev
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    elfl l;
                    Throwable th = (Throwable) obj;
                    if (chfh.a(th) != Status.Code.UNAUTHENTICATED) {
                        return elfo.d(th);
                    }
                    ciin ciinVar2 = ciinVar;
                    chez chezVar = chez.this;
                    csjy.c("BugleNetwork", "Handle UNAUTHENTICATED error by immediately refresh registration.");
                    ciil b3 = ciinVar2.b();
                    int ordinal2 = b3.a().ordinal();
                    if (ordinal2 == 0) {
                        throw new UnsupportedOperationException("UNREGISTERED support not implemented");
                    }
                    if (ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            l = chezVar.d.a((ciii) b3).i(new eroh() { // from class: chet
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    return ((chbu) obj2).l(cgwm.FORCE_REFRESH);
                                }
                            }, erpp.a);
                            return chezVar.b(ciinVar2, l);
                        }
                        if (ordinal2 != 3 && ordinal2 != 4) {
                            throw new UnsupportedOperationException("unknown registration type ".concat(b3.toString()));
                        }
                    }
                    l = chezVar.b.l(cgwm.FORCE_REFRESH);
                    return chezVar.b(ciinVar2, l);
                }
            }, this.h).i(new eroh() { // from class: chew
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    ciin ciinVar2 = ciin.this;
                    ListenableFuture e = ciinVar2.e((eyhs) obj);
                    ciinVar2.j();
                    return e;
                }
            }, erpp.a);
            elfr.l(i, new chey(this, b, d, ciinVar), this.h);
            return i;
        }
        s = this.b.s();
        elfl i2 = chihVar.a(chigVar, b(ciinVar, s)).f(Throwable.class, new eroh() { // from class: chev
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                elfl l;
                Throwable th = (Throwable) obj;
                if (chfh.a(th) != Status.Code.UNAUTHENTICATED) {
                    return elfo.d(th);
                }
                ciin ciinVar2 = ciinVar;
                chez chezVar = chez.this;
                csjy.c("BugleNetwork", "Handle UNAUTHENTICATED error by immediately refresh registration.");
                ciil b3 = ciinVar2.b();
                int ordinal2 = b3.a().ordinal();
                if (ordinal2 == 0) {
                    throw new UnsupportedOperationException("UNREGISTERED support not implemented");
                }
                if (ordinal2 != 1) {
                    if (ordinal2 == 2) {
                        l = chezVar.d.a((ciii) b3).i(new eroh() { // from class: chet
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                return ((chbu) obj2).l(cgwm.FORCE_REFRESH);
                            }
                        }, erpp.a);
                        return chezVar.b(ciinVar2, l);
                    }
                    if (ordinal2 != 3 && ordinal2 != 4) {
                        throw new UnsupportedOperationException("unknown registration type ".concat(b3.toString()));
                    }
                }
                l = chezVar.b.l(cgwm.FORCE_REFRESH);
                return chezVar.b(ciinVar2, l);
            }
        }, this.h).i(new eroh() { // from class: chew
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ciin ciinVar2 = ciin.this;
                ListenableFuture e = ciinVar2.e((eyhs) obj);
                ciinVar2.j();
                return e;
            }
        }, erpp.a);
        elfr.l(i2, new chey(this, b, d, ciinVar), this.h);
        return i2;
    }

    public final elfl b(final ciin ciinVar, elfl elflVar) {
        ciil b = ciinVar.b();
        int ordinal = b.a().ordinal();
        final String str = ordinal != 2 ? ordinal != 3 ? "Bugle" : d(b) ? "CMS" : "GDitto" : "RCS";
        return elflVar.i(new eroh() { // from class: cher
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                fcfn a = chez.this.g.a(str);
                eyee eyeeVar = ((fcdu) obj).b;
                a.copyOnWrite();
                fcfo fcfoVar = (fcfo) a.instance;
                fcfo fcfoVar2 = fcfo.a;
                eyeeVar.getClass();
                fcfoVar.f = eyeeVar;
                return ciinVar.c((fcfo) a.build());
            }
        }, this.h).i(new eroh() { // from class: ches
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                chez chezVar = chez.this;
                ciin ciinVar2 = ciinVar;
                eyhs eyhsVar = (eyhs) obj;
                if (eyhsVar != null) {
                    chezVar.e.g("Bugle.Network.Rpc.Request.Size.Bytes", eyhsVar.getSerializedSize());
                    ciinVar2.i();
                }
                return ciinVar2.d(chezVar.c, eyhsVar);
            }
        }, this.h);
    }

    @Override // defpackage.cijh
    public final elfl c() {
        if (this.j.isPresent()) {
            csjy.l("BugleNetwork", "Retrying RPC and showing notification");
            return (this.i.isPresent() ? ((cilk) this.i.get()).d() : elfo.e(null)).i(new eroh() { // from class: chex
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return ((bzef) chez.this.f.b()).c();
                }
            }, erpp.a);
        }
        csjy.n("BugleNetwork", "DittoForegroundService is not supported in this device");
        return elfo.d(new UnsupportedOperationException("DittoForegroundService is not available in this device"));
    }
}
