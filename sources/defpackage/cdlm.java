package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdlm extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ cdln b;
    int c;
    cdln d;
    ConversationIdType e;
    MessageIdType f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdlm(cdln cdlnVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = cdlnVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, null, null, null, this);
    }
}
