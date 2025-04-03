package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjzr extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ ckac b;
    int c;
    ckac d;
    ConversationIdType e;
    int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjzr(ckac ckacVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = ckacVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object i = this.b.i(null, 0, this);
        return i == ffhh.a ? i : new ffch(i);
    }
}
