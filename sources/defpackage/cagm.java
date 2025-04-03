package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cagm implements bzpz {
    public static final cskc a = cskc.g("BugleEtouffee", "EncryptedMessageDeletionHandlerImpl");
    public final ffbr b;
    public final ffsk c;
    private final ffbr d;

    public cagm(ffbr ffbrVar, ffbr ffbrVar2, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffskVar.getClass();
        this.b = ffbrVar;
        this.d = ffbrVar2;
        this.c = ffskVar;
    }

    public final List a(buxm buxmVar) {
        engw<MessageCoreData> J = ((bdmq) this.d.b()).J(buxmVar);
        J.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(J, 10));
        for (MessageCoreData messageCoreData : J) {
            cago cagoVar = (cago) cagp.a.createBuilder();
            cagoVar.getClass();
            awui awuiVar = (awui) messageCoreData.af().orElse(null);
            awuiVar.getClass();
            cagoVar.copyOnWrite();
            cagp cagpVar = (cagp) cagoVar.instance;
            cagpVar.c = awuiVar;
            cagpVar.b |= 1;
            String f = messageCoreData.E().f();
            cagoVar.copyOnWrite();
            cagp cagpVar2 = (cagp) cagoVar.instance;
            cagpVar2.b |= 2;
            cagpVar2.d = f;
            eyfy build = cagoVar.build();
            build.getClass();
            arrayList.add((cagp) build);
        }
        return ffdx.ak(arrayList);
    }
}
