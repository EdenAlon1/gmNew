package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmsb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmsc b;
    final /* synthetic */ MessageIdType c;
    final /* synthetic */ cmrl d;
    final /* synthetic */ cmrm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmsb(cmsc cmscVar, MessageIdType messageIdType, cmrl cmrlVar, cmrm cmrmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cmscVar;
        this.c = messageIdType;
        this.d = cmrlVar;
        this.e = cmrmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmsb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cmsc cmscVar = this.b;
        MessageIdType messageIdType = this.c;
        cmrl cmrlVar = this.d;
        cmrm cmrmVar = this.e;
        this.a = 1;
        Object a = cmscVar.a.a(messageIdType, cmrlVar, cmrmVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmsb(this.b, this.c, this.d, this.e, ffguVar);
    }
}
