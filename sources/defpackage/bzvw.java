package defpackage;

import com.google.communication.synapse.security.scytale.DbWrapperFactory;
import com.google.communication.synapse.security.scytale.DbWrapperInterface;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzvw extends DbWrapperFactory {
    final /* synthetic */ cagg a;

    public bzvw(cagg caggVar) {
        this.a = caggVar;
    }

    @Override // com.google.communication.synapse.security.scytale.DbWrapperFactory
    public final DbWrapperInterface createDbWrapper() {
        return this.a;
    }
}
