package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class cdbn {
    public static cdaz a(int i, String str, int i2, int i3) {
        cccd cccdVar = (cccd) ccce.a.createBuilder();
        cccdVar.copyOnWrite();
        ccce ccceVar = (ccce) cccdVar.instance;
        ccceVar.b |= 1;
        ccceVar.c = i3;
        cccdVar.copyOnWrite();
        ccce ccceVar2 = (ccce) cccdVar.instance;
        ccceVar2.b |= 16;
        ccceVar2.g = true;
        cccdVar.copyOnWrite();
        ccce ccceVar3 = (ccce) cccdVar.instance;
        ccceVar3.b |= 2;
        ccceVar3.d = i;
        cccdVar.copyOnWrite();
        ccce ccceVar4 = (ccce) cccdVar.instance;
        str.getClass();
        ccceVar4.b |= 4;
        ccceVar4.e = str;
        cccdVar.copyOnWrite();
        ccce ccceVar5 = (ccce) cccdVar.instance;
        ccceVar5.b |= 8;
        ccceVar5.f = i2;
        ccce ccceVar6 = (ccce) cccdVar.build();
        cdau cdauVar = new cdau();
        cdauVar.b(ccceVar6);
        cdauVar.a = cdcd.a(ccceVar6, Duration.ZERO);
        return cdauVar.a();
    }
}
