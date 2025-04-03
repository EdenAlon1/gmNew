package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjdz extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ cjea b;
    int c;
    azsu d;
    ConversationIdType e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjdz(cjea cjeaVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = cjeaVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object b = this.b.b(null, null, this);
        return b == ffhh.a ? b : new ffch(b);
    }
}
