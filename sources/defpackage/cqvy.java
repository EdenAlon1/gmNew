package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.function.Consumer$CC;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqvy {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/transfer/downloads/analytics/FileDownloadEventLogger");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    private final ffbr g;

    public cqvy(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.g = ffbrVar3;
        this.d = ffbrVar4;
        this.e = ffbrVar5;
        this.f = ffbrVar6;
    }

    public static String a(String str) {
        try {
            return new URL(str).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    public final void b(MessageCoreData messageCoreData, String str) {
        emxf.b(messageCoreData.cY(), "Message logged is not rcs file transfer.");
        MessagePartCoreData G = messageCoreData.G();
        G.getClass();
        ((akzt) this.g.b()).e(str, eohg.a(csuc.a(G.p())));
    }

    public final eolu c(MessageCoreData messageCoreData, int i, Consumer consumer) {
        int d = altl.d(messageCoreData.d());
        emxf.b(d == 4, "Logging file download events supported only for RCS messages.");
        eoop eoopVar = (eoop) eopq.a.createBuilder();
        long b = ((akvz) this.c.b()).b(messageCoreData.z());
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopqVar.b |= 1073741824;
        eopqVar.G = b;
        long t = messageCoreData.t();
        eoopVar.copyOnWrite();
        eopq eopqVar2 = (eopq) eoopVar.instance;
        eopqVar2.b |= 128;
        eopqVar2.n = t;
        eoopVar.copyOnWrite();
        eopq eopqVar3 = (eopq) eoopVar.instance;
        eopqVar3.g = d - 1;
        eopqVar3.b |= 1;
        String f = messageCoreData.E().f();
        eoopVar.copyOnWrite();
        eopq eopqVar4 = (eopq) eoopVar.instance;
        eopqVar4.b |= Integer.MIN_VALUE;
        eopqVar4.H = f;
        eoopVar.copyOnWrite();
        eopq eopqVar5 = (eopq) eoopVar.instance;
        eopqVar5.h = i - 1;
        eopqVar5.b |= 2;
        eqyl a2 = ((avkk) this.d.b()).a();
        eoopVar.copyOnWrite();
        eopq eopqVar6 = (eopq) eoopVar.instance;
        eopqVar6.aa = a2.h;
        eopqVar6.c |= 2097152;
        int i2 = true != messageCoreData.cB() ? 3 : 2;
        eoopVar.copyOnWrite();
        eopq eopqVar7 = (eopq) eoopVar.instance;
        eopqVar7.S = i2 - 1;
        eopqVar7.c |= 16384;
        List<MessagePartCoreData> ab = messageCoreData.ab();
        eopu eopuVar = (eopu) eopv.a.createBuilder();
        for (MessagePartCoreData messagePartCoreData : ab) {
            String V = messagePartCoreData.V();
            eohj a3 = V != null ? csud.a(V) : eohj.UNKNOWN_BUGLE_CONTENT_TYPE;
            eohk eohkVar = (eohk) eohl.a.createBuilder();
            eohkVar.copyOnWrite();
            eohl eohlVar = (eohl) eohkVar.instance;
            eohlVar.c = a3.a();
            eohlVar.b |= 1;
            eohh N = messagePartCoreData.N();
            eohkVar.copyOnWrite();
            eohl eohlVar2 = (eohl) eohkVar.instance;
            eohlVar2.d = N.a();
            eohlVar2.b |= 4;
            eohkVar.copyOnWrite();
            eohl.a((eohl) eohkVar.instance);
            int a4 = csuc.a(messagePartCoreData.p());
            eohkVar.copyOnWrite();
            eohl eohlVar3 = (eohl) eohkVar.instance;
            eohlVar3.f = eohg.a(a4);
            eohlVar3.b |= 16;
            eopuVar.a(eohkVar);
        }
        eopv eopvVar = (eopv) eopuVar.build();
        eoopVar.copyOnWrite();
        eopq eopqVar8 = (eopq) eoopVar.instance;
        eopvVar.getClass();
        eopqVar8.j = eopvVar;
        eopqVar8.b |= 8;
        consumer.accept(eoopVar);
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_MESSAGE;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eopq eopqVar9 = (eopq) eoopVar.build();
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eopqVar9.getClass();
        eolvVar2.l = eopqVar9;
        eolvVar2.b |= 4;
        return eoluVar;
    }

    public final void d(MessageCoreData messageCoreData, int i, String str) {
        ((akzt) this.g.b()).c("Bugle.DataModel.Action.Download.Start.Count.Rcs");
        int a2 = epxs.a(((Long) this.e.b()).intValue());
        epxt epxtVar = (epxt) epxv.a.createBuilder();
        epxtVar.copyOnWrite();
        epxv epxvVar = (epxv) epxtVar.instance;
        epxvVar.c = i - 1;
        epxvVar.b |= 1;
        if (a2 == 0) {
            a2 = 1;
        }
        epxtVar.copyOnWrite();
        epxv epxvVar2 = (epxv) epxtVar.instance;
        epxvVar2.e = a2 - 1;
        epxvVar2.b |= 4;
        String a3 = a(str);
        epxtVar.copyOnWrite();
        epxv epxvVar3 = (epxv) epxtVar.instance;
        a3.getClass();
        epxvVar3.b |= 2;
        epxvVar3.d = a3;
        final epxv epxvVar4 = (epxv) epxtVar.build();
        e(messageCoreData, 15, new Consumer() { // from class: cqvt
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                eoop eoopVar = (eoop) obj;
                eoopVar.copyOnWrite();
                eopq eopqVar = (eopq) eoopVar.instance;
                eopq eopqVar2 = eopq.a;
                epxv epxvVar5 = epxv.this;
                epxvVar5.getClass();
                eopqVar.at = epxvVar5;
                eopqVar.d |= 256;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void e(MessageCoreData messageCoreData, int i, Consumer consumer) {
        ((akyb) this.b.b()).a().j(c(messageCoreData, i, consumer), alal.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
    }
}
