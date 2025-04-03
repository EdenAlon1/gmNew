package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cukj {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffsk j;

    public cukj(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffbrVar9.getClass();
        ffskVar.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.e = ffbrVar5;
        this.f = ffbrVar6;
        this.g = ffbrVar7;
        this.h = ffbrVar8;
        this.i = ffbrVar9;
        this.j = ffskVar;
    }

    public final void a(MessageCoreData messageCoreData, Integer num, fayv fayvVar) {
        messageCoreData.getClass();
        ekzz f = eleg.f("IncomingMessageSpamProtectionEntrypoint.checkIfIncomingMessageIsSpam");
        try {
            axol.k(this.j, null, new cuki(this, messageCoreData, num, fayvVar, null), 3);
            ffig.a(f, null);
        } finally {
        }
    }

    public final void b(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        a(messageCoreData, null, null);
    }
}
