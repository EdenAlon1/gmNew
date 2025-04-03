package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cozn implements covl {
    public static final entd a = entd.c("BugleConversation");
    public final eikl b;
    public final avtx c;
    public final cqoh d;
    public final djav e;
    public final ffbr f;
    public final ffbr g;
    private final errl h;

    public cozn(eikl eiklVar, avtx avtxVar, cqoh cqohVar, djav djavVar, ffbr ffbrVar, ffbr ffbrVar2, errl errlVar) {
        this.b = eiklVar;
        this.c = avtxVar;
        this.d = cqohVar;
        this.e = djavVar;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.h = errlVar;
    }

    public static LocationInformation c(MessageCoreData messageCoreData) {
        MessagePartCoreData G = messageCoreData.G();
        if (G == null) {
            return null;
        }
        return G.K();
    }

    @Override // defpackage.covl
    public final elfl a(final MessageCoreData messageCoreData, avkl avklVar) {
        final LocationInformation c = c(messageCoreData);
        if (c != null) {
            return elfo.e(messageCoreData.w().d).i(new eroh() { // from class: cozm
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    String e = bdhg.e(messageCoreData.E());
                    eien eienVar = new eien();
                    eienVar.b("tel:".concat(String.valueOf((String) obj)));
                    LocationInformation locationInformation = c;
                    eienVar.f(locationInformation.d);
                    eienVar.g(locationInformation.c);
                    eienVar.h(locationInformation.e);
                    eienVar.c(Instant.ofEpochMilli(locationInformation.f));
                    eienVar.e(locationInformation.a);
                    eienVar.d(e);
                    cozn coznVar = cozn.this;
                    eienVar.i(coznVar.d.f());
                    try {
                        return elfo.e((awul) coznVar.c.fP(coznVar.b.b(com.google.android.rcs.client.messaging.data.LocationInformation.class).b(eienVar.j())));
                    } catch (eikm e2) {
                        throw new cowg(e2);
                    }
                }
            }, this.h);
        }
        throw new IllegalArgumentException("The messages has no location information attachment");
    }

    @Override // defpackage.covl
    public final boolean b(MessageCoreData messageCoreData) {
        return c(messageCoreData) != null;
    }
}
