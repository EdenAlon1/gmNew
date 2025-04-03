package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awbb extends ffhv implements ffjm {
    final /* synthetic */ awbc a;
    final /* synthetic */ MessageCoreData b;
    final /* synthetic */ String c;
    final /* synthetic */ ffla d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awbb(awbc awbcVar, MessageCoreData messageCoreData, String str, ffla fflaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = awbcVar;
        this.b = messageCoreData;
        this.c = str;
        this.d = fflaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awbb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.c.a(this.b.E(), this.c, this.d.a);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new awbb(this.a, this.b, this.c, this.d, ffguVar);
    }
}
