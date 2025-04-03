package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajsu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ajtb b;
    final /* synthetic */ MessageIdType c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajsu(ffgu ffguVar, ajtb ajtbVar, MessageIdType messageIdType) {
        super(2, ffguVar);
        this.b = ajtbVar;
        this.c = messageIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajsu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ajtb ajtbVar;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ajtbVar = (ajtb) this.d;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            ajtb ajtbVar2 = this.b;
            MessageIdType messageIdType = this.c;
            this.d = ajtbVar2;
            this.a = 1;
            Object a = ffra.a(ekxi.a(ajtbVar2.a), new ajsz(null, messageIdType), this);
            if (a == ffhhVar) {
                return ffhhVar;
            }
            ajtbVar = ajtbVar2;
            obj = a;
        }
        int i = ajtb.b;
        return ajsr.a(ajtbVar.e((ajra) obj));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajsu ajsuVar = new ajsu(ffguVar, this.b, this.c);
        ajsuVar.d = obj;
        return ajsuVar;
    }
}
