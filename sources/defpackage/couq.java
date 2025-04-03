package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class couq implements cown {
    private final cous a;
    private final avty b = new avty();

    public couq(String str, byte[] bArr) {
        this.a = new cotl(str, bArr);
    }

    @Override // defpackage.cown
    public final awul a(awzn awznVar, bdhg bdhgVar, Instant instant) {
        awuk awukVar = (awuk) awul.a.createBuilder();
        awup awupVar = (awup) this.b.m().fP(ContentType.e(((cotl) this.a).a));
        awukVar.copyOnWrite();
        awul awulVar = (awul) awukVar.instance;
        awupVar.getClass();
        awulVar.c = awupVar;
        awulVar.b |= 1;
        eyee x = eyee.x(((cotl) this.a).b);
        awukVar.copyOnWrite();
        awul awulVar2 = (awul) awukVar.instance;
        awulVar2.b |= 2;
        awulVar2.d = x;
        return (awul) awukVar.build();
    }

    @Override // defpackage.cown
    public final elfl b(bdhg bdhgVar, fayv fayvVar, Instant instant, awui awuiVar, avkl avklVar) {
        return elfo.d(new UnsupportedOperationException("this converter only supports returning delivery receipts to blocked senders"));
    }

    @Override // defpackage.cown
    public final elfl c(awzn awznVar, MessageCoreData messageCoreData, avkl avklVar) {
        return elfo.d(new UnsupportedOperationException("this converter only supports returning receipts to blocked senders"));
    }
}
