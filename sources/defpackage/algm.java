package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class algm {
    public static final /* synthetic */ int d = 0;
    private static final long e = TimeUnit.SECONDS.toMillis(60);
    public final effy a;
    public final errl b;
    public final errl c;
    private final AtomicLong f = new AtomicLong(0);

    public algm(effy effyVar, errl errlVar, errl errlVar2) {
        this.a = effyVar;
        this.b = errlVar;
        this.c = errlVar2;
    }

    public final elfl a() {
        return elfl.g(this.a.a()).h(new emwl() { // from class: alfm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = algm.d;
                eyja eyjaVar = ((alfi) obj).l;
                if (eyjaVar == null) {
                    eyjaVar = eyja.a;
                }
                return eykj.d(eyjaVar);
            }
        }, this.c);
    }

    public final elfl b() {
        return elfl.g(this.a.a()).h(new emwl() { // from class: alfu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Long.valueOf(((alfi) obj).j);
            }
        }, erpp.a);
    }

    public final elfl c() {
        return elfl.g(this.a.a()).h(new emwl() { // from class: alfw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Long.valueOf(((alfi) obj).d);
            }
        }, erpp.a);
    }

    public final ListenableFuture d() {
        return elfr.j(this.a.a(), new emwl() { // from class: alfz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Long.valueOf(((alfi) obj).f);
            }
        }, erpp.a);
    }

    public final ListenableFuture e(final Long l) {
        return this.a.b(eldl.a(new emwl() { // from class: alft
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = algm.d;
                alfh alfhVar = (alfh) ((alfi) obj).toBuilder();
                long longValue = l.longValue();
                alfhVar.copyOnWrite();
                alfi alfiVar = (alfi) alfhVar.instance;
                alfiVar.b |= 32;
                alfiVar.h = longValue;
                return (alfi) alfhVar.build();
            }
        }), erpp.a);
    }

    public final ListenableFuture f(final long j) {
        long j2 = this.f.get();
        long abs = Math.abs(j - j2);
        if (j2 != 0 && abs <= e) {
            return elfo.e(null);
        }
        this.f.set(j);
        return this.a.b(eldl.a(new emwl() { // from class: algf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = algm.d;
                alfh alfhVar = (alfh) ((alfi) obj).toBuilder();
                alfhVar.copyOnWrite();
                alfi alfiVar = (alfi) alfhVar.instance;
                alfiVar.b |= 1;
                alfiVar.c = j;
                return (alfi) alfhVar.build();
            }
        }), erpp.a);
    }

    public final ListenableFuture g(final long j) {
        return this.a.b(eldl.a(new emwl() { // from class: alfr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = algm.d;
                alfh alfhVar = (alfh) ((alfi) obj).toBuilder();
                alfhVar.copyOnWrite();
                alfi alfiVar = (alfi) alfhVar.instance;
                alfiVar.b |= 64;
                alfiVar.i = j;
                return (alfi) alfhVar.build();
            }
        }), erpp.a);
    }

    public final ListenableFuture h(final Long l) {
        return this.a.b(eldl.a(new emwl() { // from class: algc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = algm.d;
                alfh alfhVar = (alfh) ((alfi) obj).toBuilder();
                long longValue = l.longValue();
                alfhVar.copyOnWrite();
                alfi alfiVar = (alfi) alfhVar.instance;
                alfiVar.b |= 16;
                alfiVar.g = longValue;
                return (alfi) alfhVar.build();
            }
        }), erpp.a);
    }

    public final elfl i(final int i) {
        return elfl.g(this.a.a()).h(new emwl() { // from class: alfs
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                eyja eyjaVar;
                alfi alfiVar = (alfi) obj;
                int i2 = algm.d;
                if (i == 3) {
                    eyjaVar = alfiVar.m;
                    if (eyjaVar == null) {
                        eyjaVar = eyja.a;
                    }
                } else {
                    eyjaVar = alfiVar.l;
                    if (eyjaVar == null) {
                        eyjaVar = eyja.a;
                    }
                }
                return eykj.d(eyjaVar);
            }
        }, this.c);
    }

    public final elfl j(final int i, final Instant instant) {
        return i(i).i(new eroh() { // from class: algk
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Instant) obj).equals(Instant.EPOCH)) {
                    return elfo.e(false);
                }
                final Instant instant2 = instant;
                final int i2 = i;
                algm algmVar = algm.this;
                return elfl.g(algmVar.a.b(eldl.a(new emwl() { // from class: algi
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        alfi alfiVar = (alfi) obj2;
                        int i3 = algm.d;
                        int i4 = i2;
                        Instant instant3 = instant2;
                        if (i4 == 3) {
                            alfh alfhVar = (alfh) alfiVar.toBuilder();
                            eyja b = eykj.b(instant3);
                            alfhVar.copyOnWrite();
                            alfi alfiVar2 = (alfi) alfhVar.instance;
                            b.getClass();
                            alfiVar2.m = b;
                            alfiVar2.b |= 2048;
                            return (alfi) alfhVar.build();
                        }
                        alfh alfhVar2 = (alfh) alfiVar.toBuilder();
                        eyja b2 = eykj.b(instant3);
                        alfhVar2.copyOnWrite();
                        alfi alfiVar3 = (alfi) alfhVar2.instance;
                        b2.getClass();
                        alfiVar3.l = b2;
                        alfiVar3.b |= 1024;
                        return (alfi) alfhVar2.build();
                    }
                }), algmVar.c)).h(new emwl() { // from class: algj
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        int i3 = algm.d;
                        return true;
                    }
                }, algmVar.b);
            }
        }, this.c);
    }
}
