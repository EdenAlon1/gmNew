package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctjk extends ffhv implements ffjm {
    final /* synthetic */ ctiz a;
    final /* synthetic */ ctko b;
    final /* synthetic */ MessageIdType c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctjk(ffgu ffguVar, ctiz ctizVar, ctko ctkoVar, MessageIdType messageIdType) {
        super(2, ffguVar);
        this.a = ctizVar;
        this.b = ctkoVar;
        this.c = messageIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctjk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.a(((bdmq) this.b.a.b()).t(this.c));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctjk ctjkVar = new ctjk(ffguVar, this.a, this.b, this.c);
        ctjkVar.d = obj;
        return ctjkVar;
    }
}
