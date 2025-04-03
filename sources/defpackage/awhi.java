package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Consumer;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class awhi {
    public static final cskc a = cskc.g("BugleGroupManagement", "UpdateGroupChatOperations");
    public final ConcurrentMap b = new ConcurrentHashMap();
    public final avkj c;
    public final cknc d;
    public final errl e;

    public awhi(avkj avkjVar, cknc ckncVar, errl errlVar) {
        this.c = avkjVar;
        this.d = ckncVar;
        this.e = errlVar;
    }

    public final awud a(String str, awud awudVar) {
        Consumer m104m = afg$$ExternalSyntheticApiModelOutline0.m104m(this.b.remove(str));
        if (m104m != null) {
            m104m.o(awudVar);
            awty awtyVar = (awty) awud.a.createBuilder();
            awuc awucVar = awuc.OK;
            awtyVar.copyOnWrite();
            awud awudVar2 = (awud) awtyVar.instance;
            awudVar2.c = awucVar.f;
            awudVar2.b |= 1;
            return (awud) awtyVar.build();
        }
        csjb e = a.e();
        e.I("Received result for unknown update group operation");
        e.A("operationId", str);
        e.r();
        awty awtyVar2 = (awty) awud.a.createBuilder();
        awuc awucVar2 = awuc.FAILED_PERMANENTLY;
        awtyVar2.copyOnWrite();
        awud awudVar3 = (awud) awtyVar2.instance;
        awudVar3.c = awucVar2.f;
        awudVar3.b |= 1;
        return (awud) awtyVar2.build();
    }
}
