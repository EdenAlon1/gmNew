package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajqg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ajql b;
    final /* synthetic */ MessageIdType c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajqg(ffgu ffguVar, ajql ajqlVar, MessageIdType messageIdType) {
        super(2, ffguVar);
        this.b = ajqlVar;
        this.c = messageIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajqg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ajqe ajqeVar;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ajqeVar = (ajqe) this.d;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            ajqe ajqeVar2 = (ajqe) ajql.b(this.b.c.a(), this.c);
            ajql ajqlVar = this.b;
            MessageIdType messageIdType = this.c;
            this.d = ajqeVar2;
            this.a = 1;
            Object a = ajqlVar.a(messageIdType, this);
            if (a == ffhhVar) {
                return ffhhVar;
            }
            ajqeVar = ajqeVar2;
            obj = a;
        }
        ajql ajqlVar2 = this.b;
        Long l = (Long) obj;
        ajqlVar2.d.d(epts.REPLY_DRAFT, eptu.UNKNOWN_COMPOSE_SCREEN_MODE, ajql.c(ajqeVar != null ? ajqeVar.b : 0), epto.FAILED_TO_LOAD, new Integer(0), ajqeVar != null ? ajqeVar.a.d() : null, l);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajqg ajqgVar = new ajqg(ffguVar, this.b, this.c);
        ajqgVar.d = obj;
        return ajqgVar;
    }
}
