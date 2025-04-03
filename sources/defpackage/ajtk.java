package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajtk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ajtl b;
    final /* synthetic */ MessageIdType c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajtk(ajtl ajtlVar, MessageIdType messageIdType, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ajtlVar;
        this.c = messageIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajtk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ajtl ajtlVar = this.b;
            MessageIdType messageIdType = this.c;
            this.a = 1;
            ajql ajqlVar = ajtlVar.a;
            Object a = ffra.a(ekxi.a(ajqlVar.b), new ajqh(null, ajqlVar, messageIdType), this);
            if (a != ffhh.a) {
                a = ffcu.a;
            }
            if (a == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ajtk(this.b, this.c, ffguVar);
    }
}
