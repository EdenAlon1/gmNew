package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uug implements erqj {
    final /* synthetic */ MessageIdType a;
    final /* synthetic */ boolean b;
    final /* synthetic */ uuy c;

    public uug(uuy uuyVar, MessageIdType messageIdType, boolean z) {
        this.a = messageIdType;
        this.b = z;
        this.c = uuyVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.c.aO = false;
        this.c.L(this.a, null);
        this.c.n.c(new ecda("Conversation search results displayed"));
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        if (!(th instanceof CancellationException)) {
            throw new IllegalArgumentException("ensure loaded failed.", th);
        }
    }
}
