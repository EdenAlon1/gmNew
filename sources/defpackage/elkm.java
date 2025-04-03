package defpackage;

import android.util.SparseArray;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elkm implements elcg {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public elkm(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.e = ffbrVar5;
    }

    @Override // defpackage.elcg
    public final void b(eldq eldqVar, SparseArray sparseArray) {
        ecrz ecrzVar;
        ecrz ecrzVar2;
        if (((emxc) this.a.b()).g()) {
            ecrz ecrzVar3 = (ecrz) ((emxc) this.a.b()).c();
            if (ecrzVar3.c()) {
                float f = ecrzVar3.f().a;
                emxc j = eldt.a(eldqVar.d, f) ? emxc.j(Float.valueOf(f)) : emux.a;
                if (j.g()) {
                    new SparseArray();
                    elkv a = elku.a(eldqVar, sparseArray, ((Float) j.c()).floatValue());
                    if (((Boolean) this.d.b()).booleanValue()) {
                        elkh elkhVar = (elkh) a;
                        if (elkhVar.e) {
                            return;
                        } else {
                            ((ecsg) this.b.b()).e(elkhVar.f, elkhVar.g, elkhVar.b);
                        }
                    }
                    if (((Boolean) this.e.b()).booleanValue()) {
                        eyev eyevVar = eyki.a;
                        if (eyevVar == null) {
                            throw new NullPointerException("Null timeSinceBoot");
                        }
                        new SparseArray();
                        if (eldqVar == null) {
                            throw new NullPointerException("Null traceRecord");
                        }
                        elkg elkgVar = new elkg(eldqVar, sparseArray, eyevVar);
                        eldq eldqVar2 = elkgVar.a;
                        Duration ofNanos = Duration.ofNanos(Long.MIN_VALUE);
                        int i = engw.d;
                        engr engrVar = new engr();
                        String str = null;
                        for (ekzx ekzxVar : eldqVar2.e) {
                            SparseArray sparseArray2 = elkgVar.b;
                            fgrl fgrlVar = (fgrl) fgrn.a.createBuilder();
                            String str2 = ekzxVar.c;
                            fgrlVar.copyOnWrite();
                            fgrn fgrnVar = (fgrn) fgrlVar.instance;
                            str2.getClass();
                            fgrnVar.b |= 1;
                            fgrnVar.c = str2;
                            int i2 = ekzxVar.d;
                            fgrlVar.copyOnWrite();
                            fgrn fgrnVar2 = (fgrn) fgrlVar.instance;
                            fgrnVar2.b |= 2;
                            fgrnVar2.d = i2;
                            int i3 = ekzxVar.e;
                            fgrlVar.copyOnWrite();
                            fgrn fgrnVar3 = (fgrn) fgrlVar.instance;
                            fgrnVar3.b |= 4;
                            fgrnVar3.e = i3;
                            eyev a2 = eykj.a(Duration.ofMillis(ekzxVar.f).plusNanos(ekzxVar.g));
                            fgrlVar.copyOnWrite();
                            fgrn fgrnVar4 = (fgrn) fgrlVar.instance;
                            a2.getClass();
                            fgrnVar4.f = a2;
                            fgrnVar4.b |= 8;
                            eyev a3 = eykj.a(Duration.ofMillis(ekzxVar.h).plusNanos(ekzxVar.i));
                            fgrlVar.copyOnWrite();
                            fgrn fgrnVar5 = (fgrn) fgrlVar.instance;
                            a3.getClass();
                            fgrnVar5.g = a3;
                            fgrnVar5.b |= 16;
                            eyev d = eyki.d(ekzxVar.j);
                            fgrlVar.copyOnWrite();
                            fgrn fgrnVar6 = (fgrn) fgrlVar.instance;
                            d.getClass();
                            fgrnVar6.h = d;
                            fgrnVar6.b |= 32;
                            boolean z = ekzxVar.k;
                            fgrlVar.copyOnWrite();
                            fgrn fgrnVar7 = (fgrn) fgrlVar.instance;
                            fgrnVar7.b |= 64;
                            fgrnVar7.i = z;
                            int a4 = ekzw.a(ekzxVar.l);
                            if (a4 == 0) {
                                a4 = 1;
                            }
                            int i4 = a4 - 1;
                            int i5 = i4 != 0 ? i4 != 1 ? i4 != 2 ? 4 : 3 : 2 : 1;
                            fgrlVar.copyOnWrite();
                            fgrn fgrnVar8 = (fgrn) fgrlVar.instance;
                            fgrnVar8.j = i5 - 1;
                            fgrnVar8.b |= 128;
                            boolean z2 = ekzxVar.m;
                            fgrlVar.copyOnWrite();
                            fgrn fgrnVar9 = (fgrn) fgrlVar.instance;
                            fgrnVar9.b |= 256;
                            fgrnVar9.k = z2;
                            if (ekzxVar.e == -1) {
                                str = ekzxVar.c;
                            }
                            elaa a5 = elkt.a(ekzxVar.d, elkl.a, sparseArray2);
                            if (a5.b()) {
                                if (((elkk) a5.a()).a().g()) {
                                    fgmh fgmhVar = (fgmh) ((elkk) a5.a()).a().c();
                                    fgrlVar.copyOnWrite();
                                    fgrn fgrnVar10 = (fgrn) fgrlVar.instance;
                                    fgrnVar10.m = fgmhVar;
                                    fgrnVar10.b |= 1024;
                                }
                                if (((elkk) a5.a()).b()) {
                                    fgrlVar.copyOnWrite();
                                    fgrn fgrnVar11 = (fgrn) fgrlVar.instance;
                                    fgrnVar11.b |= 512;
                                    fgrnVar11.l = true;
                                }
                            }
                            elaa a6 = elkt.a(ekzxVar.d, ecbz.a, sparseArray2);
                            if (a6.b()) {
                                long longValue = ((Long) a6.a()).longValue();
                                fgrlVar.copyOnWrite();
                                fgrn fgrnVar12 = (fgrn) fgrlVar.instance;
                                ecrzVar2 = ecrzVar3;
                                fgrnVar12.b |= 2048;
                                fgrnVar12.n = longValue;
                            } else {
                                ecrzVar2 = ecrzVar3;
                            }
                            elaa a7 = elkt.a(ekzxVar.d, ecbz.b, sparseArray2);
                            if (a7.b()) {
                                long longValue2 = ((Long) a7.a()).longValue();
                                fgrlVar.copyOnWrite();
                                fgrn fgrnVar13 = (fgrn) fgrlVar.instance;
                                fgrnVar13.b |= 4096;
                                fgrnVar13.o = longValue2;
                            }
                            Duration ofMillis = Duration.ofMillis(ekzxVar.f + ekzxVar.h);
                            if (ofNanos.compareTo(ofMillis) < 0) {
                                ofNanos = ofMillis;
                            }
                            engrVar.h((fgrn) fgrlVar.build());
                            ecrzVar3 = ecrzVar2;
                        }
                        ecrzVar = ecrzVar3;
                        fgro fgroVar = (fgro) fgrq.a.createBuilder();
                        long a8 = elkw.a(eldqVar2);
                        fgroVar.copyOnWrite();
                        fgrq fgrqVar = (fgrq) fgroVar.instance;
                        fgrqVar.b |= 1;
                        fgrqVar.c = a8;
                        eyja d2 = eykm.d(eldqVar2.f);
                        fgroVar.copyOnWrite();
                        fgrq fgrqVar2 = (fgrq) fgroVar.instance;
                        d2.getClass();
                        fgrqVar2.e = d2;
                        fgrqVar2.b |= 2;
                        eyev a9 = eykj.a(Duration.ofMillis(eldqVar2.g).plusNanos(eldqVar2.h));
                        fgroVar.copyOnWrite();
                        fgrq fgrqVar3 = (fgrq) fgroVar.instance;
                        a9.getClass();
                        fgrqVar3.f = a9;
                        fgrqVar3.b |= 4;
                        int a10 = eldp.a(eldqVar2.j);
                        if (a10 == 0) {
                            a10 = 1;
                        }
                        int i6 = a10 - 1;
                        int i7 = i6 != 0 ? i6 != 1 ? 3 : 2 : 1;
                        fgroVar.copyOnWrite();
                        fgrq fgrqVar4 = (fgrq) fgroVar.instance;
                        fgrqVar4.g = i7 - 1;
                        fgrqVar4.b |= 16;
                        fgroVar.copyOnWrite();
                        fgrq fgrqVar5 = (fgrq) fgroVar.instance;
                        fgrqVar5.b |= 32;
                        fgrqVar5.h = false;
                        eyev eyevVar2 = elkgVar.c;
                        fgroVar.copyOnWrite();
                        fgrq fgrqVar6 = (fgrq) fgroVar.instance;
                        fgrqVar6.i = eyevVar2;
                        fgrqVar6.b |= 64;
                        engw g = engrVar.g();
                        fgroVar.copyOnWrite();
                        fgrq fgrqVar7 = (fgrq) fgroVar.instance;
                        eygr eygrVar = fgrqVar7.d;
                        if (!eygrVar.c()) {
                            fgrqVar7.d = eyfy.mutableCopy(eygrVar);
                        }
                        eydl.addAll(g, fgrqVar7.d);
                        fgrq fgrqVar8 = (fgrq) fgroVar.build();
                        if (fgrqVar8 == null) {
                            throw new NullPointerException("Null traceRecord");
                        }
                        elkf elkfVar = new elkf(fgrqVar8, new ecda(str), eldqVar2.e.size() == 1 && Duration.ofMillis(eldqVar2.g).plusNanos((long) eldqVar2.h).equals(ofNanos) && (eldqVar2.b & 32) == 0);
                        if (elkfVar.b) {
                            return;
                        }
                        elkh elkhVar2 = (elkh) a;
                        ((ecsg) this.b.b()).f(elkfVar.a, elkhVar2.a.a, elkhVar2.b);
                    } else {
                        ecrzVar = ecrzVar3;
                    }
                    if (ecrzVar.d()) {
                        elkh elkhVar3 = (elkh) a;
                        ((ecre) this.c.b()).a(elkhVar3.a, elkhVar3.c, elkhVar3.d, elkhVar3.b);
                    }
                }
            }
        }
    }
}
