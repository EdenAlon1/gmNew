package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctkd extends ffhv implements ffjm {
    final /* synthetic */ ctko a;
    final /* synthetic */ MessageIdType b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctkd(ffgu ffguVar, ctko ctkoVar, MessageIdType messageIdType) {
        super(2, ffguVar);
        this.a = ctkoVar;
        this.b = messageIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctkd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ((bdmq) this.a.a.b()).t(this.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctkd ctkdVar = new ctkd(ffguVar, this.a, this.b);
        ctkdVar.c = obj;
        return ctkdVar;
    }
}
