package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cujq extends ffhv implements ffji {
    int a;
    final /* synthetic */ cuke b;
    final /* synthetic */ MessageCoreData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cujq(cuke cukeVar, MessageCoreData messageCoreData, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = cukeVar;
        this.c = messageCoreData;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cuke cukeVar = this.b;
        ConversationIdType z = this.c.z();
        z.getClass();
        this.a = 1;
        Object b = cukeVar.f.b();
        b.getClass();
        Object a = ffra.a(ekxi.a((ffhd) b), new cuka(null, cukeVar, z), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cujq(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
