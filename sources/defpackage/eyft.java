package defpackage;

import defpackage.eyfs;
import defpackage.eyft;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eyft<MessageType extends eyft<MessageType, BuilderType>, BuilderType extends eyfs<MessageType, BuilderType>> extends eyfy<MessageType, BuilderType> implements eyfu<MessageType, BuilderType> {
    public eyfj r = eyfj.a;

    final eyfj a() {
        eyfj eyfjVar = this.r;
        if (eyfjVar.c) {
            this.r = eyfjVar.clone();
        }
        return this.r;
    }

    public final void b(eyfw eyfwVar) {
        if (eyfwVar.a != getDefaultInstanceForType()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    @Override // defpackage.eyfu
    public final boolean d(eyfa eyfaVar) {
        throw null;
    }
}
