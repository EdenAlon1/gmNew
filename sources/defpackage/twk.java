package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class twk extends alhh {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public twk(ffbr ffbrVar, twc twcVar, Executor executor) {
        super(ffbrVar, twcVar, executor);
        ffbrVar.getClass();
        executor.getClass();
    }

    public static /* synthetic */ void e(twk twkVar, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i2 = -1;
        }
        twkVar.c(i, i2, i3, 1);
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new twj(twi.a);
    }

    public final void b(final ffji ffjiVar) {
        o(new Supplier() { // from class: twf
            @Override // java.util.function.Supplier
            public final Object get() {
                epub epubVar = (epub) epuc.a.createBuilder();
                epubVar.getClass();
                eqnk eqnkVar = new eqnk(epubVar);
                ffji.this.invoke(eqnkVar);
                eyfy build = eqnkVar.a.build();
                build.getClass();
                return (epuc) build;
            }
        });
    }

    public final void c(int i, int i2, int i3, int i4) {
        eptw eptwVar = (eptw) epua.a.createBuilder();
        eptwVar.copyOnWrite();
        epua epuaVar = (epua) eptwVar.instance;
        epuaVar.c = i - 1;
        int i5 = 1;
        epuaVar.b |= 1;
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
                                if (i2 == 7) {
                                    i5 = 8;
                                } else {
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
        eptwVar.copyOnWrite();
        epua epuaVar2 = (epua) eptwVar.instance;
        epuaVar2.d = i5 - 1;
        epuaVar2.b |= 2;
        eptwVar.copyOnWrite();
        epua epuaVar3 = (epua) eptwVar.instance;
        epuaVar3.e = i3 - 1;
        epuaVar3.b |= 4;
        eptwVar.copyOnWrite();
        epua epuaVar4 = (epua) eptwVar.instance;
        epuaVar4.f = i4 - 1;
        epuaVar4.b = 8 | epuaVar4.b;
        eyfy build = eptwVar.build();
        build.getClass();
        final epua epuaVar5 = (epua) build;
        b(new ffji() { // from class: twe
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                eqnk eqnkVar = (eqnk) obj;
                eqnkVar.getClass();
                epub epubVar = eqnkVar.a;
                epubVar.copyOnWrite();
                epuc epucVar = (epuc) epubVar.instance;
                epuc epucVar2 = epuc.a;
                epucVar.c = epua.this;
                epucVar.b = 3;
                return ffcu.a;
            }
        });
    }

    public final void d(final int i, final int i2) {
        b(new ffji() { // from class: twd
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                eqnk eqnkVar = (eqnk) obj;
                eqnkVar.getClass();
                epud epudVar = (epud) epuf.a.createBuilder();
                epudVar.copyOnWrite();
                epuf epufVar = (epuf) epudVar.instance;
                epufVar.c = i - 1;
                epufVar.b |= 1;
                epudVar.copyOnWrite();
                epuf epufVar2 = (epuf) epudVar.instance;
                epufVar2.d = i2 - 1;
                epufVar2.b |= 2;
                epuf epufVar3 = (epuf) epudVar.build();
                epufVar3.getClass();
                epub epubVar = eqnkVar.a;
                epubVar.copyOnWrite();
                epuc epucVar = (epuc) epubVar.instance;
                epuc epucVar2 = epuc.a;
                epucVar.c = epufVar3;
                epucVar.b = 4;
                return ffcu.a;
            }
        });
    }
}
