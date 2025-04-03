package defpackage;

import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aclq implements aclb {
    public final ejvp a;
    public final errl b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    private final ejvb d;
    private final effy e;
    private final ffbr f;

    public aclq(ejvb ejvbVar, ejvp ejvpVar, errl errlVar, effy effyVar, ffbr ffbrVar) {
        this.d = ejvbVar;
        this.a = ejvpVar;
        this.b = errlVar;
        this.e = effyVar;
        this.f = ffbrVar;
    }

    public static Optional l(ackz ackzVar) {
        int i = ackzVar.c;
        int i2 = i != 0 ? i != 3 ? 0 : 1 : 2;
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 != 0) {
            return i3 != 1 ? Optional.empty() : Optional.empty();
        }
        return Optional.of(i == 3 ? (String) ackzVar.d : "");
    }

    @Override // defpackage.aclb
    public final ejuh a() {
        return new ejuy(this.d, new eros() { // from class: aclk
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                return new erph(aclq.this.e());
            }
        }, "PAIR_GAIA_ACCOUNT_STATE_KEY");
    }

    @Override // defpackage.aclb
    public final ejuh b() {
        return new ejuy(this.d, new eros() { // from class: aclg
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                elfl g;
                aclq aclqVar = aclq.this;
                if (aclqVar.m()) {
                    final AtomicBoolean atomicBoolean = aclqVar.c;
                    g = elfo.g(new Callable() { // from class: aclh
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(atomicBoolean.get());
                        }
                    }, aclqVar.b);
                } else {
                    g = elfo.e(false);
                }
                return new erph(g);
            }
        }, "SHOW_FAIL_TO_LOAD_DIALOG_KEY");
    }

    @Override // defpackage.aclb
    public final elfl c() {
        return !m() ? elfo.e(false) : elfl.g(this.e.a()).h(new emwl() { // from class: acld
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(((ackz) obj).f);
            }
        }, this.b);
    }

    @Override // defpackage.aclb
    public final elfl d() {
        return !m() ? elfo.e(Optional.empty()) : elfl.g(this.e.a()).h(new emwl() { // from class: aclo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return aclq.l((ackz) obj);
            }
        }, this.b);
    }

    @Override // defpackage.aclb
    public final elfl e() {
        return elfl.g(this.e.a()).h(new emwl() { // from class: acle
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                acky b = acky.b(((ackz) obj).g);
                return b == null ? acky.NOT_PAIRED : b;
            }
        }, this.b);
    }

    @Override // defpackage.aclb
    public final elfl f() {
        return !m() ? elfo.e("") : elfl.g(this.e.a()).h(new emwl() { // from class: aclc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((ackz) obj).e;
            }
        }, this.b);
    }

    @Override // defpackage.aclb
    public final elfl g(final Boolean bool) {
        return !m() ? elfo.e(null) : elfl.g(this.e.b(new emwl() { // from class: aclp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ackw ackwVar = (ackw) ((ackz) obj).toBuilder();
                boolean booleanValue = bool.booleanValue();
                ackwVar.copyOnWrite();
                ackz ackzVar = (ackz) ackwVar.instance;
                ackzVar.b |= 2;
                ackzVar.f = booleanValue;
                return (ackz) ackwVar.build();
            }
        }, this.b));
    }

    @Override // defpackage.aclb
    public final elfl h(final Optional optional) {
        if (!m()) {
            return elfo.e(false);
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        return elfl.g(this.e.b(new emwl() { // from class: aclm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ackz ackzVar = (ackz) obj;
                Optional l = aclq.l(ackzVar);
                Optional optional2 = optional;
                boolean z = !l.equals(optional2);
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                atomicBoolean2.set(z);
                if (!atomicBoolean2.get()) {
                    return ackzVar;
                }
                if (optional2.isPresent()) {
                    ackw ackwVar = (ackw) ackzVar.toBuilder();
                    String str = (String) optional2.get();
                    ackwVar.copyOnWrite();
                    ackz ackzVar2 = (ackz) ackwVar.instance;
                    ackzVar2.c = 3;
                    ackzVar2.d = str;
                    return (ackz) ackwVar.build();
                }
                ackw ackwVar2 = (ackw) ackzVar.toBuilder();
                ackwVar2.copyOnWrite();
                ackz ackzVar3 = (ackz) ackwVar2.instance;
                if (ackzVar3.c == 3) {
                    ackzVar3.c = 0;
                    ackzVar3.d = null;
                }
                return (ackz) ackwVar2.build();
            }
        }, this.b)).h(new emwl() { // from class: acln
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(atomicBoolean.get());
            }
        }, this.b);
    }

    @Override // defpackage.aclb
    public final elfl i(final acky ackyVar) {
        return elfl.g(this.e.b(new emwl() { // from class: acli
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ackw ackwVar = (ackw) ((ackz) obj).toBuilder();
                ackwVar.copyOnWrite();
                ackz ackzVar = (ackz) ackwVar.instance;
                ackzVar.g = acky.this.e;
                ackzVar.b |= 4;
                return (ackz) ackwVar.build();
            }
        }, this.b)).h(new emwl() { // from class: aclj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                aclq.this.a.a(elfo.e(null), "PAIR_GAIA_ACCOUNT_STATE_KEY");
                return null;
            }
        }, this.b);
    }

    @Override // defpackage.aclb
    public final elfl j(final boolean z) {
        return !m() ? elfo.e(null) : elfo.f(new Runnable() { // from class: acll
            @Override // java.lang.Runnable
            public final void run() {
                aclq aclqVar = aclq.this;
                aclqVar.c.set(z);
                aclqVar.a.a(elfo.e(null), "SHOW_FAIL_TO_LOAD_DIALOG_KEY");
            }
        }, this.b);
    }

    @Override // defpackage.aclb
    public final elfl k(final String str) {
        return !m() ? elfo.e(null) : elfl.g(this.e.b(new emwl() { // from class: aclf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ackw ackwVar = (ackw) ((ackz) obj).toBuilder();
                ackwVar.copyOnWrite();
                ackz ackzVar = (ackz) ackwVar.instance;
                String str2 = str;
                str2.getClass();
                ackzVar.b |= 1;
                ackzVar.e = str2;
                return (ackz) ackwVar.build();
            }
        }, this.b));
    }

    public final boolean m() {
        return ((acpf) this.f.b()).a();
    }
}
