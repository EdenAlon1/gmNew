package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqqr extends cqrm {
    private Optional a = Optional.empty();
    private Optional b = Optional.empty();

    @Override // defpackage.cqrm
    public final cqrn a() {
        return new cqqs(this.a, this.b);
    }

    @Override // defpackage.cqrm
    public final void b(cqrs cqrsVar) {
        this.b = Optional.of(cqrsVar);
    }

    @Override // defpackage.cqrm
    public final void c(MessageCoreData messageCoreData) {
        this.a = Optional.of(messageCoreData);
    }
}
