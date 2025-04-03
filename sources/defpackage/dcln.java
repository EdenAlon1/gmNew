package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcln {
    private static final cskc a = cskc.g("Bugle", "MessagePartAttachmentLoggingHelper");

    public static eppr a(MessagePartCoreData messagePartCoreData) {
        return b(messagePartCoreData, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static eppr b(MessagePartCoreData messagePartCoreData, dcle dcleVar) {
        eppr O = messagePartCoreData.O();
        String ae = messagePartCoreData.ae();
        if (O == null) {
            if (!messagePartCoreData.bA() || ae == null) {
                eppq eppqVar = (eppq) eppr.a.createBuilder();
                if (messagePartCoreData.N() != null) {
                    switch (messagePartCoreData.N().ordinal()) {
                        case 1:
                            a.r("Unknown source in part ".concat(String.valueOf(String.valueOf(messagePartCoreData))));
                            e(messagePartCoreData, eppqVar);
                            break;
                        case 2:
                        case 24:
                        case 30:
                        case 31:
                        case 32:
                        case 36:
                        case 44:
                        case 45:
                        default:
                            throw new IllegalArgumentException("Invalid message source, number representation: " + messagePartCoreData.N().a() + ", in " + String.valueOf(messagePartCoreData));
                        case 3:
                        case 42:
                        case 43:
                        case 46:
                            dclc.d(eppqVar, c(messagePartCoreData), messagePartCoreData.k(), null);
                            break;
                        case 4:
                        case 5:
                        case 37:
                        case 38:
                        case Maneuver.TYPE_DESTINATION /* 39 */:
                            dclc.h(eppqVar, c(messagePartCoreData), messagePartCoreData.k(), messagePartCoreData.N());
                            break;
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            dclc.i(eppqVar);
                            break;
                        case 10:
                            dclc.c(eppqVar, messagePartCoreData.k());
                            break;
                        case 11:
                        case 26:
                        case 27:
                        case 28:
                            dclc.j(eppqVar, c(messagePartCoreData), String.valueOf(messagePartCoreData.ad()));
                            break;
                        case 12:
                        case 13:
                        case 14:
                        case 23:
                        case 40:
                        case 41:
                            e(messagePartCoreData, eppqVar);
                            break;
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 21:
                        case 22:
                            a.r("Unhandled RBM-only source, number representation: " + messagePartCoreData.N().a() + " in part " + String.valueOf(messagePartCoreData));
                            O = eppr.a;
                            break;
                        case 19:
                        case 20:
                            eohh N = messagePartCoreData.N();
                            int i = dclc.c;
                            eprm eprmVar = (eprm) epro.a.createBuilder();
                            if (N == eohh.MONEY_REQUEST) {
                                eprmVar.copyOnWrite();
                                epro eproVar = (epro) eprmVar.instance;
                                eproVar.c = 1;
                                eproVar.b = 1 | eproVar.b;
                            } else if (N == eohh.MONEY_SEND) {
                                eprmVar.copyOnWrite();
                                epro eproVar2 = (epro) eprmVar.instance;
                                eproVar2.c = 2;
                                eproVar2.b = 1 | eproVar2.b;
                            } else {
                                dclc.k(N);
                            }
                            eppqVar.copyOnWrite();
                            eppr epprVar = (eppr) eppqVar.instance;
                            epro eproVar3 = (epro) eprmVar.build();
                            eproVar3.getClass();
                            epprVar.f = eproVar3;
                            epprVar.e = 205;
                            break;
                        case 25:
                            g(messagePartCoreData, eppqVar);
                            break;
                        case 29:
                            h(eppqVar);
                            break;
                        case 33:
                            f(messagePartCoreData, eppqVar);
                            dclc.g(eppqVar, true);
                            break;
                        case 34:
                            d(messagePartCoreData, eppqVar);
                            break;
                        case 35:
                            f(messagePartCoreData, eppqVar);
                            dclc.g(eppqVar, false);
                            break;
                    }
                } else {
                    a.r("Null part source in part ".concat(String.valueOf(String.valueOf(messagePartCoreData))));
                    e(messagePartCoreData, eppqVar);
                }
                O = (eppr) eppqVar.build();
            } else {
                int i2 = dclc.c;
                eppq eppqVar2 = (eppq) eppr.a.createBuilder();
                eprv eprvVar = (eprv) eprw.a.createBuilder();
                int a2 = (int) dclc.a(ae.length(), 5);
                eprvVar.copyOnWrite();
                eprw eprwVar = (eprw) eprvVar.instance;
                eprwVar.b = 1 | eprwVar.b;
                eprwVar.c = a2;
                eprw eprwVar2 = (eprw) eprvVar.build();
                eppqVar2.copyOnWrite();
                eppr epprVar2 = (eppr) eppqVar2.instance;
                eprwVar2.getClass();
                epprVar2.f = eprwVar2;
                epprVar2.e = BasePaymentResult.ERROR_REQUEST_TIMEOUT;
                O = (eppr) eppqVar2.build();
            }
        }
        if (dcleVar == null) {
            return O;
        }
        eppq eppqVar3 = (eppq) eppr.a.createBuilder(O);
        dcleVar.a(eppqVar3);
        return (eppr) eppqVar3.build();
    }

    private static epqs c(MessagePartCoreData messagePartCoreData) {
        epqs epqsVar = (epqs) eprl.a.createBuilder();
        int c = messagePartCoreData.c();
        epqsVar.copyOnWrite();
        eprl eprlVar = (eprl) epqsVar.instance;
        eprlVar.b |= 1;
        eprlVar.e = c;
        int b = messagePartCoreData.b();
        epqsVar.copyOnWrite();
        eprl eprlVar2 = (eprl) epqsVar.instance;
        eprlVar2.b |= 2;
        eprlVar2.f = b;
        String V = messagePartCoreData.V();
        if (V != null) {
            epqsVar.copyOnWrite();
            eprl eprlVar3 = (eprl) epqsVar.instance;
            eprlVar3.b |= 8;
            eprlVar3.g = V;
        }
        dclc.b(messagePartCoreData.t(), epqsVar);
        return epqsVar;
    }

    private static void d(MessagePartCoreData messagePartCoreData, eppq eppqVar) {
        dclc.e(eppqVar, messagePartCoreData.p(), messagePartCoreData.V());
    }

    private static void e(MessagePartCoreData messagePartCoreData, eppq eppqVar) {
        if (messagePartCoreData.bp() || messagePartCoreData.bt()) {
            dclc.i(eppqVar);
            return;
        }
        if (messagePartCoreData.bC()) {
            h(eppqVar);
            return;
        }
        if (messagePartCoreData.bo()) {
            if (messagePartCoreData.bl()) {
                g(messagePartCoreData, eppqVar);
                return;
            } else {
                f(messagePartCoreData, eppqVar);
                return;
            }
        }
        if (messagePartCoreData.bD()) {
            f(messagePartCoreData, eppqVar);
        } else if (messagePartCoreData.bk()) {
            d(messagePartCoreData, eppqVar);
        } else {
            a.n("Unable to convert part ".concat(String.valueOf(String.valueOf(messagePartCoreData))));
        }
    }

    private static void f(MessagePartCoreData messagePartCoreData, eppq eppqVar) {
        epqs c = c(messagePartCoreData);
        eppqVar.copyOnWrite();
        eppr epprVar = (eppr) eppqVar.instance;
        eprl eprlVar = (eprl) c.build();
        eppr epprVar2 = eppr.a;
        eprlVar.getClass();
        epprVar.f = eprlVar;
        epprVar.e = BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
    }

    private static void g(MessagePartCoreData messagePartCoreData, eppq eppqVar) {
        dclc.f(eppqVar, c(messagePartCoreData), null);
    }

    private static void h(eppq eppqVar) {
        dclc.l(eppqVar, 1);
    }
}
