package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apqx {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;

    public apqx(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
    }

    public final apqw a(MessageIdType messageIdType) {
        cqtw cqtwVar = (cqtw) this.a.b();
        cqtwVar.getClass();
        ctbk ctbkVar = (ctbk) this.b.b();
        ctbkVar.getClass();
        ExecutorService executorService = (ExecutorService) this.c.b();
        executorService.getClass();
        messageIdType.getClass();
        return new apqw(cqtwVar, ctbkVar, executorService, messageIdType);
    }
}
