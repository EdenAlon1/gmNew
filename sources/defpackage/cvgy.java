package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvgy {
    public static final entd a = entd.c("BugleWearable");
    public final ffbr b;
    public final cvgz c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final atky g;
    private final bcsf h;
    private final cvhe i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;

    public cvgy(bcsf bcsfVar, ffbr ffbrVar, cvgz cvgzVar, cvhe cvheVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, atky atkyVar) {
        this.h = bcsfVar;
        this.b = ffbrVar;
        this.c = cvgzVar;
        this.i = cvheVar;
        this.d = ffbrVar2;
        this.j = ffbrVar3;
        this.k = ffbrVar4;
        this.e = ffbrVar5;
        this.f = ffbrVar6;
        this.l = ffbrVar7;
        this.g = atkyVar;
    }

    public final cvgt a(bcse bcseVar, List list, Context context) {
        String b;
        ekzz f = eleg.f("WearableConversationBuilder#getMessageDataFromConversationMessageData");
        try {
            cvgs cvgsVar = (cvgs) cvgt.a.createBuilder();
            String b2 = bcseVar.u().b();
            cvgsVar.copyOnWrite();
            cvgt cvgtVar = (cvgt) cvgsVar.instance;
            b2.getClass();
            cvgtVar.c = b2;
            String a2 = bcseVar.t().a();
            cvgsVar.copyOnWrite();
            cvgt cvgtVar2 = (cvgt) cvgsVar.instance;
            a2.getClass();
            cvgtVar2.d = a2;
            boolean bb = bcseVar.bb();
            cvgsVar.copyOnWrite();
            ((cvgt) cvgsVar.instance).g = bb;
            eyja d = eykm.d(bcseVar.i());
            cvgsVar.copyOnWrite();
            cvgt cvgtVar3 = (cvgt) cvgsVar.instance;
            d.getClass();
            cvgtVar3.m = d;
            cvgtVar3.b |= 2;
            int f2 = bcseVar.f();
            cvgsVar.copyOnWrite();
            ((cvgt) cvgsVar.instance).h = f2;
            int c = bcseVar.c();
            cvgsVar.copyOnWrite();
            ((cvgt) cvgsVar.instance).i = c;
            int e = bcseVar.e();
            cvgsVar.copyOnWrite();
            ((cvgt) cvgsVar.instance).j = e;
            String b3 = emxe.b(bcseVar.T());
            cvgsVar.copyOnWrite();
            ((cvgt) cvgsVar.instance).k = b3;
            int d2 = bcseVar.d();
            cvgsVar.copyOnWrite();
            ((cvgt) cvgsVar.instance).o = d2;
            String b4 = emxe.b(bcseVar.V(context));
            cvgsVar.copyOnWrite();
            ((cvgt) cvgsVar.instance).e = b4;
            String b5 = emxe.b(bcseVar.H());
            cvgsVar.copyOnWrite();
            ((cvgt) cvgsVar.instance).f = b5;
            cvhg cvhgVar = (cvhg) cvhh.a.createBuilder();
            if (bcseVar.az()) {
                ParticipantColor participantColor = bcseVar.k;
                bcys bcysVar = (bcys) bcyt.a.createBuilder();
                int i = participantColor.a;
                bcysVar.copyOnWrite();
                ((bcyt) bcysVar.instance).c = i;
                int i2 = participantColor.b;
                bcysVar.copyOnWrite();
                bcyt bcytVar = (bcyt) bcysVar.instance;
                bcytVar.b |= 1;
                bcytVar.d = i2;
                int i3 = participantColor.c;
                bcysVar.copyOnWrite();
                ((bcyt) bcysVar.instance).e = i3;
                bcyt bcytVar2 = (bcyt) bcysVar.build();
                cvhgVar.copyOnWrite();
                cvhh cvhhVar = (cvhh) cvhgVar.instance;
                bcytVar2.getClass();
                cvhhVar.e = bcytVar2;
                cvhhVar.b |= 2;
                cfva cfvaVar = aoqm.a;
                if (((Boolean) new aopw().get()).booleanValue()) {
                    b = bcseVar.r().l();
                    b.getClass();
                } else {
                    b = emxe.b(bcseVar.S());
                }
                cvhgVar.copyOnWrite();
                ((cvhh) cvhgVar.instance).c = b;
                String b6 = emxe.b(bcseVar.P(true));
                cvhgVar.copyOnWrite();
                ((cvhh) cvhgVar.instance).f = b6;
                String b7 = emxe.b(bcseVar.R());
                cvhgVar.copyOnWrite();
                cvhh cvhhVar2 = (cvhh) cvhgVar.instance;
                cvhhVar2.b |= 1;
                cvhhVar2.d = b7;
            } else {
                cvhgVar.copyOnWrite();
                ((cvhh) cvhgVar.instance).c = "profile";
            }
            cvhh cvhhVar3 = (cvhh) cvhgVar.build();
            cvgsVar.copyOnWrite();
            cvgt cvgtVar4 = (cvgt) cvgsVar.instance;
            cvhhVar3.getClass();
            cvgtVar4.l = cvhhVar3;
            cvgtVar4.b |= 1;
            ArrayList arrayList = new ArrayList();
            for (MessagePartCoreData messagePartCoreData : bcseVar.Y()) {
                if (list != null && messagePartCoreData.t() != null && (messagePartCoreData.bo() || messagePartCoreData.ba())) {
                    list.add(messagePartCoreData);
                }
                Uri t = messagePartCoreData.t();
                cvhc cvhcVar = (cvhc) cvhd.a.createBuilder();
                String aa = messagePartCoreData.aa();
                cvhcVar.copyOnWrite();
                cvhd cvhdVar = (cvhd) cvhcVar.instance;
                aa.getClass();
                cvhdVar.c = aa;
                String b8 = emxe.b(messagePartCoreData.V());
                cvhcVar.copyOnWrite();
                ((cvhd) cvhcVar.instance).d = b8;
                String uri = t == null ? "" : t.toString();
                cvhcVar.copyOnWrite();
                cvhd cvhdVar2 = (cvhd) cvhcVar.instance;
                uri.getClass();
                cvhdVar2.e = uri;
                int c2 = messagePartCoreData.c();
                cvhcVar.copyOnWrite();
                ((cvhd) cvhcVar.instance).g = c2;
                int b9 = messagePartCoreData.b();
                cvhcVar.copyOnWrite();
                ((cvhd) cvhcVar.instance).f = b9;
                eyev d3 = eyki.d(messagePartCoreData.k());
                cvhcVar.copyOnWrite();
                cvhd cvhdVar3 = (cvhd) cvhcVar.instance;
                d3.getClass();
                cvhdVar3.h = d3;
                cvhdVar3.b |= 1;
                arrayList.add((cvhd) cvhcVar.build());
            }
            cvgsVar.copyOnWrite();
            cvgt cvgtVar5 = (cvgt) cvgsVar.instance;
            eygr eygrVar = cvgtVar5.n;
            if (!eygrVar.c()) {
                cvgtVar5.n = eyfy.mutableCopy(eygrVar);
            }
            eydl.addAll(arrayList, cvgtVar5.n);
            cmrf cmrfVar = bcseVar.s;
            if (cmrfVar != null) {
                cvgsVar.copyOnWrite();
                cvgt cvgtVar6 = (cvgt) cvgsVar.instance;
                cvgtVar6.p = cmrfVar;
                cvgtVar6.b |= 4;
            }
            cvgt cvgtVar7 = (cvgt) cvgsVar.build();
            f.close();
            return cvgtVar7;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b(cvgx cvgxVar, cvgx cvgxVar2, List list, int i, Context context) {
        String S;
        List<bcse> d = this.g.a() ? d(cvgxVar.a(), i) : c(cvgxVar.a(), i);
        ArrayList arrayList = new ArrayList();
        for (bcse bcseVar : d) {
            ((bcwz) this.i.a.b()).getClass();
            cvhb cvhbVar = new cvhb();
            cvhbVar.a.n("4", bcseVar.u().b());
            if (bcseVar.ar()) {
                String V = bcseVar.V(context);
                if (V != null) {
                    cvhbVar.b(V);
                }
            } else {
                String str = bcseVar.w;
                if (str != null) {
                    cvhbVar.b(str);
                }
            }
            cvhbVar.a.n("44", bcseVar.H());
            cvhbVar.a.h("45", bcseVar.bb());
            cvhbVar.a.m("17", bcseVar.i());
            cvhbVar.a.m("16", bcseVar.k());
            cvhbVar.a.l("11", bcseVar.f());
            cvhbVar.a.l("36", bcseVar.c());
            cvhbVar.a.n("15", bcseVar.R());
            cvhbVar.a.n("14", bcseVar.P(true));
            cvhbVar.a.l("33", bcseVar.d());
            if (bcseVar.az()) {
                ParticipantColor participantColor = bcseVar.k;
                cvhbVar.a.n("25", participantColor.a + ":" + participantColor.b + ":" + participantColor.c);
                cfva cfvaVar = aoqm.a;
                if (((Boolean) new aopw().get()).booleanValue()) {
                    S = bcseVar.r().l();
                    S.getClass();
                } else {
                    S = bcseVar.S();
                }
                cvhbVar.a(S);
            } else {
                cvhbVar.a("profile");
            }
            cvhbVar.a.l("37", bcseVar.e());
            cvhbVar.a.n("38", bcseVar.T());
            List<MessagePartCoreData> Y = bcseVar.Y();
            if (!Y.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(Y.size());
                for (MessagePartCoreData messagePartCoreData : Y) {
                    dhzq dhzqVar = new dhzq();
                    dhzqVar.n("4", messagePartCoreData.aa());
                    Uri t = messagePartCoreData.t();
                    if (t != null) {
                        dhzqVar.n("30", t.toString());
                    }
                    String V2 = messagePartCoreData.V();
                    if (V2 != null) {
                        dhzqVar.n("26", V2);
                    }
                    dhzqVar.l("28", messagePartCoreData.b());
                    dhzqVar.l("29", messagePartCoreData.c());
                    dhzqVar.m("42", messagePartCoreData.k());
                    arrayList2.add(dhzqVar);
                }
                cvhbVar.a.k("27", arrayList2);
            }
            if (list != null) {
                for (MessagePartCoreData messagePartCoreData2 : bcseVar.Y()) {
                    if (messagePartCoreData2.bo() || messagePartCoreData2.ba()) {
                        if (cvgxVar2 != null) {
                            Asset b = cvgxVar2.a.b("27".concat(String.valueOf(messagePartCoreData2.aa())));
                            if (b != null) {
                                cvgxVar.c(messagePartCoreData2.aa(), b);
                            }
                        }
                        if (messagePartCoreData2.t() != null) {
                            list.add(messagePartCoreData2);
                        }
                    }
                }
            }
            cmrf cmrfVar = bcseVar.s;
            if (cmrfVar == null) {
                cvhbVar.a.a.remove("40");
            } else {
                cvhbVar.a.j("40", cmrfVar.toByteArray());
            }
            arrayList.add(cvhbVar.a);
        }
        return arrayList;
    }

    public final List c(ConversationIdType conversationIdType, int i) {
        ekzz f = eleg.f("WearableConversationBuilder#getMessageInfos");
        try {
            bjjd bjjdVar = ((avcg) this.l.b()).a() ? (bjjd) ((bcsq) this.j.b()).f(conversationIdType, 21, i).b().o() : (bjjd) ((bcsq) this.j.b()).d(conversationIdType, 21, i).b().o();
            try {
                ArrayList arrayList = new ArrayList();
                while (bjjdVar.moveToNext()) {
                    arrayList.add(this.h.e(bjjdVar));
                }
                bjjdVar.close();
                f.close();
                return arrayList;
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final List d(ConversationIdType conversationIdType, int i) {
        ekzz f = eleg.f("WearableConversationBuilder#getMessageInfosOptimized");
        try {
            bifu bifuVar = ((avcg) this.l.b()).a() ? (bifu) ((bcsy) this.k.b()).e(conversationIdType, 21, i).b().o() : (bifu) ((bcsy) this.k.b()).c(conversationIdType, 21, i).b().o();
            try {
                ArrayList arrayList = new ArrayList();
                while (bifuVar.moveToNext()) {
                    arrayList.add(this.h.c(bifuVar));
                }
                bifuVar.close();
                f.close();
                return arrayList;
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
