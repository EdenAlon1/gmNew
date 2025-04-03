package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dclc {
    static final cfva a = cfvl.q(188246326);
    static final epqu b;
    public static final /* synthetic */ int c = 0;

    static {
        epqt epqtVar = (epqt) epqu.a.createBuilder();
        epso epsoVar = (epso) epsw.a.createBuilder();
        epsoVar.copyOnWrite();
        epsw epswVar = (epsw) epsoVar.instance;
        epswVar.i = 3;
        epswVar.b |= 64;
        epsw epswVar2 = (epsw) epsoVar.build();
        epqtVar.copyOnWrite();
        epqu epquVar = (epqu) epqtVar.instance;
        epswVar2.getClass();
        epquVar.c = epswVar2;
        epquVar.b |= 1;
        b = (epqu) epqtVar.build();
    }

    public static long a(long j, int i) {
        return i * Math.round(j / i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
    
        if (r6.equals("sticker") != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.net.Uri r6, defpackage.epqs r7) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dclc.b(android.net.Uri, epqs):void");
    }

    public static void c(eppq eppqVar, long j) {
        epps eppsVar = (epps) eppt.a.createBuilder();
        eppsVar.copyOnWrite();
        eppt epptVar = (eppt) eppsVar.instance;
        epptVar.b |= 1;
        epptVar.c = (int) (j / 1000);
        eppqVar.copyOnWrite();
        eppr epprVar = (eppr) eppqVar.instance;
        eppt epptVar2 = (eppt) eppsVar.build();
        eppr epprVar2 = eppr.a;
        epptVar2.getClass();
        epprVar.f = epptVar2;
        epprVar.e = 207;
    }

    static void d(eppq eppqVar, epqs epqsVar, long j, epsw epswVar) {
        if (j > 0) {
            epqsVar.copyOnWrite();
            eprl eprlVar = (eprl) epqsVar.instance;
            eprl eprlVar2 = eprl.a;
            eprlVar.b |= 16;
            eprlVar.h = (int) (j / 1000);
        }
        if (epswVar != null) {
            epqt epqtVar = (epqt) epqu.a.createBuilder();
            epqtVar.copyOnWrite();
            epqu epquVar = (epqu) epqtVar.instance;
            epquVar.c = epswVar;
            epquVar.b |= 1;
            epqsVar.copyOnWrite();
            eprl eprlVar3 = (eprl) epqsVar.instance;
            epqu epquVar2 = (epqu) epqtVar.build();
            eprl eprlVar4 = eprl.a;
            epquVar2.getClass();
            eprlVar3.d = epquVar2;
            eprlVar3.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        } else {
            epqu epquVar3 = epqu.a;
            epqsVar.copyOnWrite();
            eprl eprlVar5 = (eprl) epqsVar.instance;
            eprl eprlVar6 = eprl.a;
            epquVar3.getClass();
            eprlVar5.d = epquVar3;
            eprlVar5.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        }
        eppqVar.copyOnWrite();
        eppr epprVar = (eppr) eppqVar.instance;
        eprl eprlVar7 = (eprl) epqsVar.build();
        eppr epprVar2 = eppr.a;
        eprlVar7.getClass();
        epprVar.f = eprlVar7;
        epprVar.e = BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
    }

    public static void e(eppq eppqVar, long j, String str) {
        epqh epqhVar = (epqh) epqi.a.createBuilder();
        if (j > 0) {
            if (!((Boolean) a.e()).booleanValue() && j > 2147483647L) {
                throw new IllegalArgumentException(a.y(j, "Invalid attachment size. Size (", ") is greater than Integer.MAX_VALUE"));
            }
            long a2 = j < 7500 ? 5000L : j < 2000000 ? a(j, 10000) : j < 10000000 ? a(j, 100000) : a(j, 1000000);
            epqhVar.copyOnWrite();
            epqi epqiVar = (epqi) epqhVar.instance;
            epqiVar.b |= 1;
            epqiVar.c = a2;
        }
        if (str != null) {
            epqhVar.copyOnWrite();
            epqi epqiVar2 = (epqi) epqhVar.instance;
            epqiVar2.b |= 2;
            epqiVar2.d = str;
        }
        eppqVar.copyOnWrite();
        eppr epprVar = (eppr) eppqVar.instance;
        epqi epqiVar3 = (epqi) epqhVar.build();
        eppr epprVar2 = eppr.a;
        epqiVar3.getClass();
        epprVar.f = epqiVar3;
        epprVar.e = 208;
    }

    static void f(eppq eppqVar, epqs epqsVar, String str) {
        eprc eprcVar;
        if (str != null) {
            eprb eprbVar = (eprb) eprc.a.createBuilder();
            eprbVar.copyOnWrite();
            eprc eprcVar2 = (eprc) eprbVar.instance;
            eprcVar2.b |= 1;
            eprcVar2.c = str;
            eprcVar = (eprc) eprbVar.build();
        } else {
            eprcVar = eprc.a;
        }
        epqsVar.copyOnWrite();
        eprl eprlVar = (eprl) epqsVar.instance;
        eprl eprlVar2 = eprl.a;
        eprcVar.getClass();
        eprlVar.d = eprcVar;
        eprlVar.c = 104;
        eppqVar.copyOnWrite();
        eppr epprVar = (eppr) eppqVar.instance;
        eprl eprlVar3 = (eprl) epqsVar.build();
        eppr epprVar2 = eppr.a;
        eprlVar3.getClass();
        epprVar.f = eprlVar3;
        epprVar.e = BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
    }

    static void g(eppq eppqVar, boolean z) {
        epqn epqnVar;
        if (z) {
            epql epqlVar = (epql) epqn.a.createBuilder();
            epqlVar.copyOnWrite();
            epqn epqnVar2 = (epqn) epqlVar.instance;
            epqnVar2.c = 1;
            epqnVar2.b = 1 | epqnVar2.b;
            epqnVar = (epqn) epqlVar.build();
        } else {
            epqnVar = epqn.a;
        }
        eppqVar.copyOnWrite();
        eppr epprVar = (eppr) eppqVar.instance;
        eppr epprVar2 = eppr.a;
        epqnVar.getClass();
        epprVar.d = epqnVar;
        epprVar.c = 102;
    }

    public static void h(eppq eppqVar, epqs epqsVar, long j, eohh eohhVar) {
        if (j > 0) {
            epqsVar.copyOnWrite();
            eprl eprlVar = (eprl) epqsVar.instance;
            eprl eprlVar2 = eprl.a;
            eprlVar.b |= 16;
            eprlVar.h = (int) (j / 1000);
        }
        int ordinal = eohhVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 12) {
                if (ordinal != 14 && ordinal != 35) {
                    if (ordinal != 46 && ordinal != 3) {
                        if (ordinal == 4) {
                            epra epraVar = epra.a;
                            epqsVar.copyOnWrite();
                            eprl eprlVar3 = (eprl) epqsVar.instance;
                            eprl eprlVar4 = eprl.a;
                            epraVar.getClass();
                            eprlVar3.d = epraVar;
                            eprlVar3.c = 102;
                        } else if (ordinal != 5) {
                            switch (ordinal) {
                                case 37:
                                    epre epreVar = epre.a;
                                    epqsVar.copyOnWrite();
                                    eprl eprlVar5 = (eprl) epqsVar.instance;
                                    eprl eprlVar6 = eprl.a;
                                    epreVar.getClass();
                                    eprlVar5.d = epreVar;
                                    eprlVar5.c = 107;
                                    break;
                                case 38:
                                    eprk eprkVar = eprk.a;
                                    epqsVar.copyOnWrite();
                                    eprl eprlVar7 = (eprl) epqsVar.instance;
                                    eprl eprlVar8 = eprl.a;
                                    eprkVar.getClass();
                                    eprlVar7.d = eprkVar;
                                    eprlVar7.c = 108;
                                    break;
                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                    epqu epquVar = b;
                                    epqsVar.copyOnWrite();
                                    eprl eprlVar9 = (eprl) epqsVar.instance;
                                    eprl eprlVar10 = eprl.a;
                                    epquVar.getClass();
                                    eprlVar9.d = epquVar;
                                    eprlVar9.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                                    break;
                                case 40:
                                case 41:
                                    break;
                                case 42:
                                case 43:
                                    break;
                                default:
                                    k(eohhVar);
                                    break;
                            }
                        }
                    }
                    epqu epquVar2 = epqu.a;
                    epqsVar.copyOnWrite();
                    eprl eprlVar11 = (eprl) epqsVar.instance;
                    eprl eprlVar12 = eprl.a;
                    epquVar2.getClass();
                    eprlVar11.d = epquVar2;
                    eprlVar11.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                }
                epqy epqyVar = epqy.a;
                epqsVar.copyOnWrite();
                eprl eprlVar13 = (eprl) epqsVar.instance;
                eprl eprlVar14 = eprl.a;
                epqyVar.getClass();
                eprlVar13.d = epqyVar;
                eprlVar13.c = 103;
            } else {
                eprg eprgVar = eprg.a;
                epqsVar.copyOnWrite();
                eprl eprlVar15 = (eprl) epqsVar.instance;
                eprl eprlVar16 = eprl.a;
                eprgVar.getClass();
                eprlVar15.d = eprgVar;
                eprlVar15.c = 109;
            }
        }
        eppqVar.copyOnWrite();
        eppr epprVar = (eppr) eppqVar.instance;
        eprl eprlVar17 = (eprl) epqsVar.build();
        eppr epprVar2 = eppr.a;
        eprlVar17.getClass();
        epprVar.f = eprlVar17;
        epprVar.e = BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
    }

    public static void i(eppq eppqVar) {
        epqp epqpVar = epqp.a;
        eppqVar.copyOnWrite();
        eppr epprVar = (eppr) eppqVar.instance;
        eppr epprVar2 = eppr.a;
        epqpVar.getClass();
        epprVar.f = epqpVar;
        epprVar.e = 204;
    }

    static void j(eppq eppqVar, epqs epqsVar, String str) {
        eprh eprhVar = (eprh) epri.a.createBuilder();
        eprhVar.copyOnWrite();
        epri epriVar = (epri) eprhVar.instance;
        str.getClass();
        epriVar.b |= 1;
        epriVar.c = str;
        epqsVar.copyOnWrite();
        eprl eprlVar = (eprl) epqsVar.instance;
        epri epriVar2 = (epri) eprhVar.build();
        eprl eprlVar2 = eprl.a;
        epriVar2.getClass();
        eprlVar.d = epriVar2;
        eprlVar.c = 105;
        eppqVar.copyOnWrite();
        eppr epprVar = (eppr) eppqVar.instance;
        eprl eprlVar3 = (eprl) epqsVar.build();
        eppr epprVar2 = eppr.a;
        eprlVar3.getClass();
        epprVar.f = eprlVar3;
        epprVar.e = BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
    }

    public static void k(eohh eohhVar) {
        throw new IllegalArgumentException("Invalid source, number representation: " + eohhVar.a());
    }

    static void l(eppq eppqVar, int i) {
        eppu eppuVar = (eppu) eppw.a.createBuilder();
        eppuVar.copyOnWrite();
        eppw eppwVar = (eppw) eppuVar.instance;
        eppwVar.e = i - 1;
        eppwVar.b |= 4;
        eppw eppwVar2 = (eppw) eppuVar.build();
        eppqVar.copyOnWrite();
        eppr epprVar = (eppr) eppqVar.instance;
        eppr epprVar2 = eppr.a;
        eppwVar2.getClass();
        epprVar.f = eppwVar2;
        epprVar.e = 206;
    }
}
