package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjcp extends fhmz {
    final /* synthetic */ fjcq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjcp(fjcq fjcqVar, fhnv fhnvVar) {
        super(fhnvVar);
        this.a = fjcqVar;
    }

    @Override // defpackage.fhmz, defpackage.fhnv
    public final long b(fhmt fhmtVar, long j) {
        try {
            return this.b.b(fhmtVar, 8192L);
        } catch (IOException e) {
            this.a.a = e;
            throw e;
        }
    }
}
