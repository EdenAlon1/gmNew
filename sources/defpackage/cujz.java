package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cujz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cuke b;
    final /* synthetic */ MessageIdType c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cujz(ffgu ffguVar, cuke cukeVar, MessageIdType messageIdType) {
        super(2, ffguVar);
        this.b = cukeVar;
        this.c = messageIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cujz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object a;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        MessageCoreData v = ((bdmq) this.b.d.b()).v(this.c);
        if (v == null) {
            return null;
        }
        cuke cukeVar = this.b;
        this.a = 1;
        a = cukeVar.a(v, null, null, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cujz cujzVar = new cujz(ffguVar, this.b, this.c);
        cujzVar.d = obj;
        return cujzVar;
    }
}
