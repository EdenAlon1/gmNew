package defpackage;

import com.google.android.rcs.client.messaging.MessagingResult;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clhm {
    public static final awyp a(MessagingResult messagingResult) {
        boolean z = messagingResult.b() == 14 || messagingResult.b() == 16;
        awyo awyoVar = (awyo) awyp.a.createBuilder();
        awyoVar.copyOnWrite();
        awyp awypVar = (awyp) awyoVar.instance;
        awypVar.b = 1 | awypVar.b;
        awypVar.c = z;
        eyev a = eykj.a(messagingResult.c());
        awyoVar.copyOnWrite();
        awyp awypVar2 = (awyp) awyoVar.instance;
        a.getClass();
        awypVar2.d = a;
        awypVar2.b |= 2;
        return (awyp) awyoVar.build();
    }
}
