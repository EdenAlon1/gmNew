package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aifv extends alhh {
    public final ffbr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aifv(ffbr ffbrVar, aifp aifpVar, Executor executor, ffbr ffbrVar2) {
        super(ffbrVar, aifpVar, executor);
        ffbrVar.getClass();
        executor.getClass();
        this.a = ffbrVar2;
    }

    public static /* synthetic */ void d(aifv aifvVar, int i, int i2, int i3, int i4) {
        equl equlVar = (equl) equm.a.createBuilder();
        equlVar.copyOnWrite();
        equm equmVar = (equm) equlVar.instance;
        equmVar.c = i - 1;
        int i5 = 1;
        equmVar.b |= 1;
        if ((i4 & 2) != 0) {
            i2 = -1;
        }
        if (i2 == 0) {
            i5 = 15;
        } else if (i2 == 1) {
            i5 = 2;
        } else {
            int i6 = 3;
            if (i2 != 2) {
                if (i2 == 3) {
                    i5 = 4;
                } else {
                    i6 = 5;
                    if (i2 != 4) {
                        int i7 = 6;
                        if (i2 != 5) {
                            i6 = 7;
                            if (i2 != 6) {
                                i7 = 8;
                                if (i2 != 7) {
                                    i6 = 9;
                                    if (i2 != 8) {
                                        i7 = 10;
                                        if (i2 != 9) {
                                            if (i2 >= 10 && i2 < 20) {
                                                i5 = 11;
                                            } else if (i2 >= 20 && i2 < 50) {
                                                i5 = 12;
                                            } else if (i2 >= 50 && i2 < 100) {
                                                i5 = 13;
                                            } else if (i2 >= 100) {
                                                i5 = 14;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i5 = i7;
                    }
                }
            }
            i5 = i6;
        }
        if ((i4 & 4) != 0) {
            i3 = -1;
        }
        equlVar.copyOnWrite();
        equm equmVar2 = (equm) equlVar.instance;
        equmVar2.d = i5 - 1;
        equmVar2.b |= 2;
        equlVar.copyOnWrite();
        equm equmVar3 = (equm) equlVar.instance;
        equmVar3.b = 4 | equmVar3.b;
        equmVar3.e = i3;
        eyfy build = equlVar.build();
        build.getClass();
        final equm equmVar4 = (equm) build;
        aifvVar.e(new ffji() { // from class: aifr
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                equu equuVar = (equu) obj;
                equuVar.getClass();
                equk equkVar = equuVar.a;
                equkVar.copyOnWrite();
                equt equtVar = (equt) equkVar.instance;
                equt equtVar2 = equt.a;
                equtVar.c = equm.this;
                equtVar.b = 1;
                return ffcu.a;
            }
        });
    }

    private final void e(final ffji ffjiVar) {
        o(new Supplier() { // from class: aifq
            @Override // java.util.function.Supplier
            public final Object get() {
                equk equkVar = (equk) equt.a.createBuilder();
                equkVar.getClass();
                equu equuVar = new equu(equkVar);
                ffji.this.invoke(equuVar);
                eyfy build = equuVar.a.build();
                build.getClass();
                return (equt) build;
            }
        });
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new aifu(aift.a);
    }

    public final void b(int i) {
        d(this, 8, 0, i, 2);
    }

    public final void c(int i, equr equrVar) {
        equn equnVar = (equn) equo.a.createBuilder();
        equnVar.copyOnWrite();
        equo equoVar = (equo) equnVar.instance;
        equoVar.d = i - 1;
        equoVar.b |= 2;
        equnVar.copyOnWrite();
        equo equoVar2 = (equo) equnVar.instance;
        equoVar2.c = equrVar.e;
        equoVar2.b |= 1;
        eyfy build = equnVar.build();
        build.getClass();
        final equo equoVar3 = (equo) build;
        e(new ffji() { // from class: aifs
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                equu equuVar = (equu) obj;
                equuVar.getClass();
                equk equkVar = equuVar.a;
                equkVar.copyOnWrite();
                equt equtVar = (equt) equkVar.instance;
                equt equtVar2 = equt.a;
                equtVar.c = equo.this;
                equtVar.b = 2;
                return ffcu.a;
            }
        });
    }
}
