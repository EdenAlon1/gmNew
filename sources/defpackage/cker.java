package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cker {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/rcs/TransactionIdFactory");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v29, types: [aoku, java.lang.Object] */
    public static String a(MessageCoreData messageCoreData, String str, bseh bsehVar) {
        if (bsehVar.k() == 2 && str != null) {
            if (!ersy.a("bugle.enable_mms_group_upgrade_passive_upgrader", "bugle") || !messageCoreData.cP()) {
                bdhg E = messageCoreData.E();
                String b = emxe.b(bsehVar.ad());
                String X = bsehVar.X();
                String d = d(messageCoreData);
                Optional ad = messageCoreData.ad();
                ckbq b2 = ckey.b(b, X, str);
                ckbs ckbsVar = (ckbs) ckbt.a.createBuilder();
                ckbsVar.copyOnWrite();
                ckbt ckbtVar = (ckbt) ckbsVar.instance;
                ckbr ckbrVar = (ckbr) b2.build();
                ckbrVar.getClass();
                ckbtVar.d = ckbrVar;
                ckbtVar.c = 2;
                if (E.k()) {
                    String str2 = E.b;
                    emyw.e(str2);
                    ckbsVar.copyOnWrite();
                    ((ckbt) ckbsVar.instance).e = str2;
                }
                if (d != null) {
                    ckbsVar.copyOnWrite();
                    ckbt ckbtVar2 = (ckbt) ckbsVar.instance;
                    ckbtVar2.b |= 2;
                    ckbtVar2.g = d;
                }
                return ckey.g((ckbl) ckey.a(ad, ckbsVar).build());
            }
            String b3 = emxe.b(messageCoreData.av());
            emyl emylVar = ckey.a;
            if (!ckbe.a(b3)) {
                ensk e = a.e();
                e.Y(ente.a, "BugleRcs");
                enrr enrrVar = (enrr) e;
                enrrVar.Y(csux.p, bsehVar.C());
                enrrVar.Y(csux.b, messageCoreData.B());
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/TransactionIdFactory", "createTransactionIdStringForMmsMessageInUpgradedGroup", 145, "TransactionIdFactory.java")).q("Trying to add RcsGroup info to non-serialized transactionId");
                b3 = ckey.e(b3, bsehVar.X() != null ? bsehVar.X() : "", messageCoreData.ad());
            }
            ckex c = ckey.c(b3);
            if (c != null) {
                ckbd ckbdVar = (ckbd) c;
                if (!ckbdVar.e.isEmpty()) {
                    Object obj = ckbdVar.e.get();
                    bsehVar.ae();
                    String b4 = emxe.b(bsehVar.ad());
                    String X2 = bsehVar.X();
                    Optional ad2 = messageCoreData.ad();
                    ckbq b5 = ckey.b(b4, X2, str);
                    ckbm ckbmVar = (ckbm) ((eyfy) obj).toBuilder();
                    ckbmVar.copyOnWrite();
                    ckbn ckbnVar = (ckbn) ckbmVar.instance;
                    ckbr ckbrVar2 = (ckbr) b5.build();
                    ckbrVar2.getClass();
                    ckbnVar.e = ckbrVar2;
                    ckbnVar.b |= 1;
                    ckbk ckbkVar = (ckbk) ckbl.a.createBuilder();
                    ckbkVar.copyOnWrite();
                    ckbl ckblVar = (ckbl) ckbkVar.instance;
                    ckbn ckbnVar2 = (ckbn) ckbmVar.build();
                    ckbnVar2.getClass();
                    ckblVar.d = ckbnVar2;
                    ckblVar.c = 3;
                    if (ad2.isPresent()) {
                        eyee a2 = cpzf.a((UUID) ad2.get());
                        ckbkVar.copyOnWrite();
                        ckbl ckblVar2 = (ckbl) ckbkVar.instance;
                        ckblVar2.b |= 1;
                        ckblVar2.e = a2;
                    }
                    return ckey.g((ckbl) ckbkVar.build());
                }
            }
            ensk j = a.j();
            j.Y(ente.a, "BugleRcs");
            enrr enrrVar2 = (enrr) j;
            enrrVar2.Y(csux.p, bsehVar.C());
            enrrVar2.Y(csux.b, messageCoreData.B());
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/rcs/TransactionIdFactory", "createTransactionIdStringForMmsMessageInUpgradedGroup", 157, "TransactionIdFactory.java")).q("Cannot add RcsGroup info to non-serialized transactionId");
            return messageCoreData.av();
        }
        if (bsehVar.am()) {
            engw y = bcui.d(bsehVar.C()).y();
            emyw.a(!y.isEmpty());
            emyw.a(((enou) y).c < 2);
            emyw.a(((ParticipantsTable.BindData) y.get(0)).o() == 1);
            cpay a3 = cowe.a((ParticipantsTable.BindData) y.get(0));
            bdhg E2 = messageCoreData.E();
            String d2 = d(messageCoreData);
            Optional ad3 = messageCoreData.ad();
            String str3 = a3.a;
            String str4 = a3.b;
            String str5 = a3.c;
            emyl emylVar2 = ckey.a;
            ckbo ckboVar = (ckbo) ckbp.a.createBuilder();
            ckboVar.copyOnWrite();
            ckbp ckbpVar = (ckbp) ckboVar.instance;
            str5.getClass();
            ckbpVar.d = str5;
            if (str3 != null) {
                ckboVar.copyOnWrite();
                ((ckbp) ckboVar.instance).b = str3;
            }
            if (str4 != null) {
                ckboVar.copyOnWrite();
                ((ckbp) ckboVar.instance).c = str4;
            }
            ckbp ckbpVar2 = (ckbp) ckboVar.build();
            ckbs ckbsVar2 = (ckbs) ckbt.a.createBuilder();
            ckbsVar2.copyOnWrite();
            ckbt ckbtVar3 = (ckbt) ckbsVar2.instance;
            ckbpVar2.getClass();
            ckbtVar3.d = ckbpVar2;
            ckbtVar3.c = 3;
            if (E2.k()) {
                String str6 = E2.b;
                emyw.e(str6);
                ckbsVar2.copyOnWrite();
                ((ckbt) ckbsVar2.instance).e = str6;
            }
            if (d2 != null && !asnf.a()) {
                ckbsVar2.copyOnWrite();
                ckbt ckbtVar4 = (ckbt) ckbsVar2.instance;
                ckbtVar4.b |= 2;
                ckbtVar4.g = d2;
            }
            return ckey.g((ckbl) ckey.a(ad3, ckbsVar2).build());
        }
        if (bsehVar.k() == 1) {
            return ckey.e(messageCoreData.av(), emxe.b(bsehVar.X()), messageCoreData.ad());
        }
        if (bsehVar.k() == 0 && messageCoreData.cP()) {
            return ckey.e(messageCoreData.av(), "", messageCoreData.ad());
        }
        cjeb cjebVar = null;
        awui awuiVar = messageCoreData.ag().isPresent() ? (awui) messageCoreData.ag().get().e().orElse(null) : null;
        bdhg E3 = messageCoreData.E();
        fayv aa = messageCoreData.aa();
        String d3 = d(messageCoreData);
        Optional ad4 = messageCoreData.ad();
        emyl emylVar3 = ckey.a;
        if (E3.i()) {
            return "";
        }
        String str7 = E3.b;
        emyw.e(str7);
        ckbs ckbsVar3 = (ckbs) ckbt.a.createBuilder();
        ckbsVar3.copyOnWrite();
        ((ckbt) ckbsVar3.instance).e = str7;
        if (d3 != null && !asnf.a()) {
            ckbsVar3.copyOnWrite();
            ckbt ckbtVar5 = (ckbt) ckbsVar3.instance;
            ckbtVar5.b = 2 | ckbtVar5.b;
            ckbtVar5.g = d3;
        }
        if (((Boolean) ((cfup) ctjd.ax.get()).e()).booleanValue() && awuiVar != null && aa != null && ffkj.e(awuiVar.d, "+18339913448")) {
            Optional a4 = clbh.a(aa, clbg.RCS_PENPAL_NAMESPACE, "jakgvfknopmmo");
            final ffji ffjiVar = new ffji() { // from class: cjdp
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(ffkj.e((String) obj2, "true"));
                }
            };
            if (ffkj.e((Boolean) a4.map(new Function() { // from class: cjdq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return ffji.this.invoke(obj2);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(false), true)) {
                String str8 = (String) fflm.b(clbh.a(aa, clbg.RCS_PENPAL_NAMESPACE, "zxmckmnbniuoip"));
                if (str8 != null && str8.length() != 0) {
                    cjebVar = new cjeb(str8);
                }
                if (cjebVar != null) {
                    Optional a5 = clbh.a(aa, clbg.RCS_PENPAL_NAMESPACE, "PENPAL-COUNTERPARTY-NUMBER");
                    if (a5.isPresent()) {
                        ckbf ckbfVar = (ckbf) ckbg.a.createBuilder();
                        Object obj2 = a5.get();
                        ckbfVar.copyOnWrite();
                        ((ckbg) ckbfVar.instance).b = (String) obj2;
                        ckbg ckbgVar = (ckbg) ckbfVar.build();
                        ckbsVar3.copyOnWrite();
                        ckbt ckbtVar6 = (ckbt) ckbsVar3.instance;
                        ckbgVar.getClass();
                        ckbtVar6.f = ckbgVar;
                        ckbtVar6.b |= 1;
                    }
                }
            }
        }
        return ckey.g((ckbl) ckey.a(ad4, ckbsVar3).build());
    }

    public static String b(MessageCoreData messageCoreData, bseh bsehVar) {
        String av = messageCoreData.av();
        ckex c = ckey.c(av);
        return (c != null && ((ckbd) c).f.isPresent()) ? av : a(messageCoreData, bsehVar.ac(), bsehVar);
    }

    public static byte[] c(MessageCoreData messageCoreData, String str, bseh bsehVar) {
        return a(messageCoreData, str, bsehVar).getBytes(StandardCharsets.US_ASCII);
    }

    private static String d(MessageCoreData messageCoreData) {
        return cgrt.a(messageCoreData.aa());
    }
}
