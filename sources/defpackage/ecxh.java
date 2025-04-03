package defpackage;

import com.google.android.gms.common.Feature;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.internal.IPhenotypeService;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecxh implements ecxc {
    private final dhlf a;

    public ecxh(dhlf dhlfVar) {
        dhlfVar.getClass();
        this.a = dhlfVar;
    }

    private static ListenableFuture k(dhre dhreVar) {
        return ernq.g(duin.a(dhreVar), dfqu.class, new eroh() { // from class: ecxg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dfqu dfquVar = (dfqu) obj;
                throw new ecxd(dfquVar.a(), dfquVar.getMessage(), dfquVar);
            }
        }, erpp.a);
    }

    @Override // defpackage.ecxc
    public final ListenableFuture a(String str) {
        str.getClass();
        return k(this.a.b(str));
    }

    @Override // defpackage.ecxc
    public final ListenableFuture b(final ecwu ecwuVar) {
        ecwuVar.getClass();
        dfun dfunVar = new dfun();
        dfunVar.a = new dfuf() { // from class: dhkx
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                int i = dhlf.a;
                ((IPhenotypeService) ((dhlo) obj).w()).commitToConfigurationV2(new dhle((dhri) obj2), ecwu.this.toByteArray());
            }
        };
        dfunVar.b = new Feature[]{dhke.a};
        dfunVar.b();
        dfuo a = dfunVar.a();
        final dhlf dhlfVar = this.a;
        return k(dhlfVar.i(a).e(erpp.a, new dhqh() { // from class: dhkw
            @Override // defpackage.dhqh
            public final Object a(dhre dhreVar) {
                boolean z = dhreVar.h() instanceof dfrq;
                dhlf dhlfVar2 = dhlf.this;
                ecwu ecwuVar2 = ecwuVar;
                if (z) {
                    return dhlfVar2.b(ecwuVar2.c);
                }
                if (!(dhreVar.h() instanceof dfqu)) {
                    return dhreVar;
                }
                dfqu dfquVar = (dfqu) dhreVar.h();
                dfquVar.getClass();
                return dfquVar.a() == 29514 ? dhlfVar2.b(ecwuVar2.c) : dhreVar;
            }
        }));
    }

    @Override // defpackage.ecxc
    public final ListenableFuture c(String str, String str2) {
        str2.getClass();
        return k(this.a.o(str, str2).c(erpp.a, new dhqh() { // from class: ecxe
            @Override // defpackage.dhqh
            public final Object a(dhre dhreVar) {
                int i;
                ecxb ecxbVar;
                int i2;
                Configurations configurations = (Configurations) dhreVar.i();
                ecwv ecwvVar = (ecwv) ecww.a.createBuilder();
                String str3 = configurations.a;
                ecwvVar.copyOnWrite();
                ecww ecwwVar = (ecww) ecwvVar.instance;
                str3.getClass();
                int i3 = 1;
                ecwwVar.b |= 1;
                ecwwVar.c = str3;
                String str4 = configurations.c;
                ecwvVar.copyOnWrite();
                ecww ecwwVar2 = (ecww) ecwvVar.instance;
                str4.getClass();
                ecwwVar2.b |= 4;
                ecwwVar2.e = str4;
                boolean z = configurations.f;
                ecwvVar.copyOnWrite();
                ecww ecwwVar3 = (ecww) ecwvVar.instance;
                ecwwVar3.b |= 8;
                ecwwVar3.h = z;
                long j = configurations.g;
                ecwvVar.copyOnWrite();
                ecww ecwwVar4 = (ecww) ecwvVar.instance;
                ecwwVar4.b |= 16;
                ecwwVar4.i = j;
                byte[] bArr = configurations.b;
                if (bArr != null) {
                    eyee x = eyee.x(bArr);
                    ecwvVar.copyOnWrite();
                    ecww ecwwVar5 = (ecww) ecwvVar.instance;
                    ecwwVar5.b |= 2;
                    ecwwVar5.d = x;
                }
                Configuration[] configurationArr = configurations.d;
                int length = configurationArr.length;
                int i4 = 0;
                while (i4 < length) {
                    Configuration configuration = configurationArr[i4];
                    Flag[] flagArr = configuration.b;
                    int length2 = flagArr.length;
                    int i5 = 0;
                    while (i5 < length2) {
                        Flag flag = flagArr[i5];
                        int i6 = flag.g;
                        if (i6 != i3) {
                            if (i6 == 2) {
                                i2 = i3;
                                ecwz ecwzVar = (ecwz) ecxb.a.createBuilder();
                                String str5 = flag.a;
                                ecwzVar.copyOnWrite();
                                ecxb ecxbVar2 = (ecxb) ecwzVar.instance;
                                str5.getClass();
                                ecxbVar2.b |= 1;
                                ecxbVar2.e = str5;
                                boolean e = flag.e();
                                ecwzVar.copyOnWrite();
                                ecxb ecxbVar3 = (ecxb) ecwzVar.instance;
                                ecxbVar3.c = 2;
                                ecxbVar3.d = Boolean.valueOf(e);
                                ecxbVar = (ecxb) ecwzVar.build();
                            } else if (i6 == 3) {
                                i2 = i3;
                                ecwz ecwzVar2 = (ecwz) ecxb.a.createBuilder();
                                String str6 = flag.a;
                                ecwzVar2.copyOnWrite();
                                ecxb ecxbVar4 = (ecxb) ecwzVar2.instance;
                                str6.getClass();
                                ecxbVar4.b |= 1;
                                ecxbVar4.e = str6;
                                double a = flag.a();
                                ecwzVar2.copyOnWrite();
                                ecxb ecxbVar5 = (ecxb) ecwzVar2.instance;
                                ecxbVar5.c = 3;
                                ecxbVar5.d = Double.valueOf(a);
                                ecxbVar = (ecxb) ecwzVar2.build();
                            } else if (i6 == 4) {
                                i2 = i3;
                                ecwz ecwzVar3 = (ecwz) ecxb.a.createBuilder();
                                String str7 = flag.a;
                                ecwzVar3.copyOnWrite();
                                ecxb ecxbVar6 = (ecxb) ecwzVar3.instance;
                                str7.getClass();
                                ecxbVar6.b |= 1;
                                ecxbVar6.e = str7;
                                String c = flag.c();
                                ecwzVar3.copyOnWrite();
                                ecxb ecxbVar7 = (ecxb) ecwzVar3.instance;
                                ecxbVar7.c = 4;
                                ecxbVar7.d = c;
                                ecxbVar = (ecxb) ecwzVar3.build();
                            } else {
                                if (i6 != 5) {
                                    throw new IllegalArgumentException(a.h(i6, "Unrecognized flag type: "));
                                }
                                ecwz ecwzVar4 = (ecwz) ecxb.a.createBuilder();
                                String str8 = flag.a;
                                ecwzVar4.copyOnWrite();
                                ecxb ecxbVar8 = (ecxb) ecwzVar4.instance;
                                str8.getClass();
                                i2 = i3;
                                ecxbVar8.b |= 1;
                                ecxbVar8.e = str8;
                                eyee x2 = eyee.x(flag.f());
                                ecwzVar4.copyOnWrite();
                                ecxb ecxbVar9 = (ecxb) ecwzVar4.instance;
                                ecxbVar9.c = 5;
                                ecxbVar9.d = x2;
                                ecxbVar = (ecxb) ecwzVar4.build();
                            }
                            i = i2;
                        } else {
                            int i7 = i3;
                            ecwz ecwzVar5 = (ecwz) ecxb.a.createBuilder();
                            String str9 = flag.a;
                            ecwzVar5.copyOnWrite();
                            ecxb ecxbVar10 = (ecxb) ecwzVar5.instance;
                            str9.getClass();
                            ecxbVar10.b |= 1;
                            ecxbVar10.e = str9;
                            long b = flag.b();
                            ecwzVar5.copyOnWrite();
                            ecxb ecxbVar11 = (ecxb) ecwzVar5.instance;
                            i = i7;
                            ecxbVar11.c = i;
                            ecxbVar11.d = Long.valueOf(b);
                            ecxbVar = (ecxb) ecwzVar5.build();
                        }
                        ecwvVar.copyOnWrite();
                        ecww ecwwVar6 = (ecww) ecwvVar.instance;
                        ecxbVar.getClass();
                        eygr eygrVar = ecwwVar6.f;
                        if (!eygrVar.c()) {
                            ecwwVar6.f = eyfy.mutableCopy(eygrVar);
                        }
                        ecwwVar6.f.add(ecxbVar);
                        i5++;
                        i3 = i;
                    }
                    int i8 = i3;
                    String[] strArr = configuration.c;
                    if (strArr != null) {
                        for (String str10 : strArr) {
                            ecwvVar.copyOnWrite();
                            ecww ecwwVar7 = (ecww) ecwvVar.instance;
                            str10.getClass();
                            eygr eygrVar2 = ecwwVar7.g;
                            if (!eygrVar2.c()) {
                                ecwwVar7.g = eyfy.mutableCopy(eygrVar2);
                            }
                            ecwwVar7.g.add(str10);
                        }
                    }
                    i4++;
                    i3 = i8;
                }
                return (ecww) ecwvVar.build();
            }
        }));
    }

    @Override // defpackage.ecxc
    public final ListenableFuture d(final String str) {
        str.getClass();
        dfun dfunVar = new dfun();
        dfunVar.a = new dfuf() { // from class: dhkn
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                int i = dhlf.a;
                ((IPhenotypeService) ((dhlo) obj).w()).getExperimentsForLogging(new dhle((dhri) obj2), str, null);
            }
        };
        return k(this.a.i(dfunVar.a()).c(erpp.a, new dhqh() { // from class: ecxf
            @Override // defpackage.dhqh
            public final Object a(dhre dhreVar) {
                ExperimentTokens experimentTokens = (ExperimentTokens) dhreVar.i();
                ecwx ecwxVar = (ecwx) ecwy.a.createBuilder();
                String str2 = experimentTokens.b;
                ecwxVar.copyOnWrite();
                ecwy ecwyVar = (ecwy) ecwxVar.instance;
                str2.getClass();
                ecwyVar.b |= 1;
                ecwyVar.c = str2;
                byte[] bArr = experimentTokens.c;
                if (bArr != null) {
                    ecwxVar.a(eyee.x(bArr));
                }
                byte[][] bArr2 = experimentTokens.i;
                if (bArr2 != null) {
                    for (byte[] bArr3 : bArr2) {
                        if (bArr3 != null) {
                            ecwxVar.a(eyee.x(bArr3));
                        }
                    }
                }
                byte[][] bArr4 = experimentTokens.d;
                if (bArr4 != null) {
                    for (byte[] bArr5 : bArr4) {
                        eyee x = eyee.x(bArr5);
                        ecwxVar.copyOnWrite();
                        ecwy ecwyVar2 = (ecwy) ecwxVar.instance;
                        eygr eygrVar = ecwyVar2.e;
                        if (!eygrVar.c()) {
                            ecwyVar2.e = eyfy.mutableCopy(eygrVar);
                        }
                        ecwyVar2.e.add(x);
                    }
                }
                byte[][] bArr6 = experimentTokens.e;
                if (bArr6 != null) {
                    for (byte[] bArr7 : bArr6) {
                        eyee x2 = eyee.x(bArr7);
                        ecwxVar.copyOnWrite();
                        ecwy ecwyVar3 = (ecwy) ecwxVar.instance;
                        eygr eygrVar2 = ecwyVar3.f;
                        if (!eygrVar2.c()) {
                            ecwyVar3.f = eyfy.mutableCopy(eygrVar2);
                        }
                        ecwyVar3.f.add(x2);
                    }
                }
                byte[][] bArr8 = experimentTokens.f;
                if (bArr8 != null) {
                    for (byte[] bArr9 : bArr8) {
                        eyee x3 = eyee.x(bArr9);
                        ecwxVar.copyOnWrite();
                        ecwy ecwyVar4 = (ecwy) ecwxVar.instance;
                        eygr eygrVar3 = ecwyVar4.g;
                        if (!eygrVar3.c()) {
                            ecwyVar4.g = eyfy.mutableCopy(eygrVar3);
                        }
                        ecwyVar4.g.add(x3);
                    }
                }
                byte[][] bArr10 = experimentTokens.g;
                if (bArr10 != null) {
                    for (byte[] bArr11 : bArr10) {
                        eyee x4 = eyee.x(bArr11);
                        ecwxVar.copyOnWrite();
                        ecwy ecwyVar5 = (ecwy) ecwxVar.instance;
                        eygr eygrVar4 = ecwyVar5.h;
                        if (!eygrVar4.c()) {
                            ecwyVar5.h = eyfy.mutableCopy(eygrVar4);
                        }
                        ecwyVar5.h.add(x4);
                    }
                }
                int[] iArr = experimentTokens.h;
                if (iArr != null) {
                    for (int i : iArr) {
                        ecwxVar.copyOnWrite();
                        ecwy ecwyVar6 = (ecwy) ecwxVar.instance;
                        eygi eygiVar = ecwyVar6.i;
                        if (!eygiVar.c()) {
                            ecwyVar6.i = eyfy.mutableCopy(eygiVar);
                        }
                        ecwyVar6.i.h(i);
                    }
                }
                return (ecwy) ecwxVar.build();
            }
        }));
    }

    @Override // defpackage.ecxc
    public final ListenableFuture e() {
        dfun dfunVar = new dfun();
        dfunVar.a = new dfuf() { // from class: dhkl
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                int i = dhlf.a;
                ((IPhenotypeService) ((dhlo) obj).w()).getStorageInfo(new dhlb((dhri) obj2));
            }
        };
        dfunVar.b = new Feature[]{dhke.i};
        dfunVar.b();
        return k(this.a.i(dfunVar.a()));
    }

    @Override // defpackage.ecxc
    public final ListenableFuture f(String str, int i, String[] strArr, byte[] bArr) {
        str.getClass();
        strArr.getClass();
        return k(this.a.c(str, i, strArr, bArr));
    }

    @Override // defpackage.ecxc
    public final ListenableFuture g(String str, euln eulnVar) {
        return k(this.a.d(str, eulnVar));
    }

    @Override // defpackage.ecxc
    public final ListenableFuture h(final String str, euln eulnVar, final byte[] bArr) {
        final dhlf dhlfVar = this.a;
        return k(dhlfVar.d(str, eulnVar).e(erpp.a, new dhqh() { // from class: dhkp
            @Override // defpackage.dhqh
            public final Object a(dhre dhreVar) {
                if (dhreVar.m()) {
                    return dhreVar;
                }
                dhlf dhlfVar2 = dhlf.this;
                if (!dhlfVar2.e(11925000)) {
                    return dhlf.a();
                }
                final byte[] bArr2 = bArr;
                final String str2 = str;
                dfun dfunVar = new dfun();
                dfunVar.a = new dfuf() { // from class: dhko
                    @Override // defpackage.dfuf
                    public final void a(Object obj, Object obj2) {
                        int i = dhlf.a;
                        ((IPhenotypeService) ((dhlo) obj).w()).setAppSpecificProperties(new dhle((dhri) obj2), str2, bArr2);
                    }
                };
                return dhlfVar2.i(dfunVar.a());
            }
        }));
    }

    @Override // defpackage.ecxc
    public final boolean i() {
        return this.a.e(12200000);
    }

    @Override // defpackage.ecxc
    public final ListenableFuture j(edah edahVar) {
        final String str;
        String simpleName = dhlo.class.getSimpleName();
        dhlf dhlfVar = this.a;
        final dftp f = dhlfVar.f(edahVar, simpleName);
        String a = dfyx.a();
        if (a == null) {
            str = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            str = a + "|" + System.identityHashCode(dhlo.class);
        }
        dfuf dfufVar = new dfuf() { // from class: dhkq
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                int i = dhlf.a;
                ((IPhenotypeService) ((dhlo) obj).w()).registerFlagUpdateListener(str, new dhld(f));
            }
        };
        dfuf dfufVar2 = new dfuf() { // from class: dhkr
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                int i = dhlf.a;
            }
        };
        dfud dfudVar = new dfud();
        dfudVar.c = f;
        dfudVar.a = dfufVar;
        dfudVar.b = dfufVar2;
        dfudVar.d = new Feature[]{dhke.d};
        dfudVar.b();
        return k(dhlfVar.j(dfudVar.a()));
    }
}
