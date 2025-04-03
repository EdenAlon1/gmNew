package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Instant;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awnf implements awks {
    private final errl a;

    public awnf(errl errlVar) {
        this.a = errlVar;
    }

    @Override // defpackage.awks
    public final elfl a(final ConversationIdType conversationIdType, awxc awxcVar) {
        final awwh awwhVar = awxcVar.k;
        if (awwhVar == null) {
            awwhVar = awwh.a;
        }
        return awwh.a.equals(awwhVar) ? elfo.e(ceyt.i()) : elfo.g(new Callable() { // from class: awne
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eyja eyjaVar = awwhVar.c;
                if (eyjaVar == null) {
                    eyjaVar = eyja.a;
                }
                ConversationIdType conversationIdType2 = ConversationIdType.this;
                Instant d = eykj.d(eyjaVar);
                entd entdVar = cknn.a;
                efbd.b();
                String[] strArr = bsom.a;
                bsoe bsoeVar = new bsoe();
                bsoeVar.al();
                bsoeVar.ap("updateRcsGroupLastSyncTimestamp");
                bsoeVar.R(Optional.of(d));
                return bsoeVar.f(conversationIdType2) ? ceyt.i() : ceyt.k();
            }
        }, this.a);
    }
}
