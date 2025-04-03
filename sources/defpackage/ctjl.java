package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctjl extends ffhv implements ffjm {
    final /* synthetic */ ctko a;
    final /* synthetic */ MessageIdType b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctjl(ffgu ffguVar, ctko ctkoVar, MessageIdType messageIdType) {
        super(2, ffguVar);
        this.a = ctkoVar;
        this.b = messageIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctjl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ((ctqh) this.a.b.b()).j(this.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctjl ctjlVar = new ctjl(ffguVar, this.a, this.b);
        ctjlVar.c = obj;
        return ctjlVar;
    }
}
