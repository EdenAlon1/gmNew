package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class bbhp extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ bbhs b;
    int c;
    bbhs d;
    UUID e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbhp(bbhs bbhsVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = bbhsVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, null, this);
    }
}
