package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class bahm extends ffhr {
    Object a;
    Object b;
    int c;
    /* synthetic */ Object d;
    final /* synthetic */ bahp e;
    int f;
    bahp g;
    String h;
    String i;
    ConversationIdType j;
    SelfIdentityIdImpl k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bahm(bahp bahpVar, ffgu ffguVar) {
        super(ffguVar);
        this.e = bahpVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(0, null, null, null, null, null, false, false, null, null, null, this);
    }
}
