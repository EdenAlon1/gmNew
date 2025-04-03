package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpxc {
    static final emyl a = cfvl.w("log_rcs_message_id_with_duplicate_rcs_message_id_event");
    public final ffbr b;

    public cpxc(ffbr ffbrVar) {
        this.b = ffbrVar;
    }

    public static eqow a(MessageCoreData messageCoreData, MessageCoreData messageCoreData2) {
        Duration ofMillis = Duration.ofMillis(messageCoreData2.o() - messageCoreData.o());
        eqow eqowVar = (eqow) eqpa.a.createBuilder();
        eyev a2 = eykj.a(ofMillis);
        eqowVar.copyOnWrite();
        eqpa eqpaVar = (eqpa) eqowVar.instance;
        a2.getClass();
        eqpaVar.c = a2;
        eqpaVar.b |= 1;
        eqox eqoxVar = (eqox) eqoy.a.createBuilder();
        int k = messageCoreData.k();
        eqoxVar.copyOnWrite();
        eqoy eqoyVar = (eqoy) eqoxVar.instance;
        eqoyVar.b |= 1;
        eqoyVar.c = k;
        int a3 = teo.a(messageCoreData.V());
        eqoxVar.copyOnWrite();
        eqoy eqoyVar2 = (eqoy) eqoxVar.instance;
        eqoyVar2.d = a3 - 1;
        eqoyVar2.b |= 2;
        eqowVar.copyOnWrite();
        eqpa eqpaVar2 = (eqpa) eqowVar.instance;
        eqoy eqoyVar3 = (eqoy) eqoxVar.build();
        eqoyVar3.getClass();
        eqpaVar2.d = eqoyVar3;
        eqpaVar2.b |= 2;
        eqox eqoxVar2 = (eqox) eqoy.a.createBuilder();
        int k2 = messageCoreData2.k();
        eqoxVar2.copyOnWrite();
        eqoy eqoyVar4 = (eqoy) eqoxVar2.instance;
        eqoyVar4.b |= 1;
        eqoyVar4.c = k2;
        int a4 = teo.a(messageCoreData2.V());
        eqoxVar2.copyOnWrite();
        eqoy eqoyVar5 = (eqoy) eqoxVar2.instance;
        eqoyVar5.d = a4 - 1;
        eqoyVar5.b |= 2;
        eqowVar.copyOnWrite();
        eqpa eqpaVar3 = (eqpa) eqowVar.instance;
        eqoy eqoyVar6 = (eqoy) eqoxVar2.build();
        eqoyVar6.getClass();
        eqpaVar3.e = eqoyVar6;
        eqpaVar3.b |= 4;
        if (((Boolean) ((cfup) a.get()).e()).booleanValue()) {
            eyee A = eyee.A(messageCoreData.E().f());
            eqowVar.copyOnWrite();
            eqpa eqpaVar4 = (eqpa) eqowVar.instance;
            eqpaVar4.b |= 8;
            eqpaVar4.f = A;
        }
        return eqowVar;
    }
}
