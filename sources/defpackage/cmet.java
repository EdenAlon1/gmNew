package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmet extends ffhv implements ffjm {
    int a;
    final /* synthetic */ epgr b;
    final /* synthetic */ cmfb c;
    final /* synthetic */ Optional d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmet(epgr epgrVar, cmfb cmfbVar, Optional optional, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = epgrVar;
        this.c = cmfbVar;
        this.d = optional;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmet) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            if (!ffdx.g(epgr.RCS_PROVISIONING_GOOGLE_TOS_BANNER_PRESENTED, epgr.RCS_PROVISIONING_GOOGLE_TOS_BANNER_ACCEPTED, epgr.RCS_PROVISIONING_GOOGLE_TOS_BANNER_DISMISSED).contains(this.b)) {
                throw new IllegalStateException("Check failed.");
            }
            cmfb cmfbVar = this.c;
            epgr epgrVar = this.b;
            Optional optional = this.d;
            epgt epgtVar = epgt.PROVISIONING_UI_TYPE_GOOGLE_TOS_BANNER;
            epbq epbqVar = (epbq) fflm.b(optional);
            this.a = 1;
            if (cmfbVar.a(epgtVar, epgrVar, null, epbqVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmet(this.b, this.c, this.d, ffguVar);
    }
}
