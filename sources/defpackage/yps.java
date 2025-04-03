package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yps extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yqb b;
    final /* synthetic */ dmne c;
    final /* synthetic */ dmnc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yps(yqb yqbVar, dmne dmneVar, dmnc dmncVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = yqbVar;
        this.c = dmneVar;
        this.d = dmncVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yps) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object h;
        eptm eptmVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            h = obj;
        } else {
            yqb yqbVar = this.b;
            dmne dmneVar = this.c;
            this.a = 1;
            h = yqbVar.h(dmneVar, this);
            if (h == ffhhVar) {
                return ffhhVar;
            }
        }
        dtbv dtbvVar = (dtbv) h;
        this.b.q.f(dtbvVar);
        yqb yqbVar2 = this.b;
        dmnc dmncVar = this.d;
        dtbvVar.getClass();
        ensk g = xgw.a.g();
        g.Y(ente.a, "BugleComposeRow2");
        epts eptsVar = null;
        ((enrr) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/navigation/ComposeRowNavigationListener", "onInputShown", 33, "ComposeRowNavigationListener.kt")).J("ComposeRowNavigationListener.onInputShown %s, %s, %s", dmncVar, dtbvVar, null);
        if (!ffkj.e(dtbvVar, dtbi.a) && !(dtbvVar instanceof dtbp)) {
            if (!(dtbvVar instanceof dtbn) && !(dtbvVar instanceof dtbr) && !(dtbvVar instanceof dtbt)) {
                throw new ffcd();
            }
            int ordinal = dmncVar.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                eptsVar = epts.UNKNOWN_COMPOSE_SCREEN_CATEGORY;
            } else if (ordinal == 2) {
                eptsVar = epts.CAMERA_GALLERY;
            } else if (ordinal == 3) {
                eptsVar = epts.EMOTIVE;
            } else if (ordinal == 4) {
                eptsVar = epts.ALL;
            } else {
                if (ordinal != 5) {
                    throw new ffcd();
                }
                eptsVar = epts.VOICE;
            }
        }
        epts eptsVar2 = eptsVar;
        if (eptsVar2 != null) {
            xgw xgwVar = yqbVar2.f;
            eptu eptuVar = eptu.EXPANDED;
            dszr dszrVar = dszr.a;
            int ordinal2 = dmncVar.ordinal();
            if (ordinal2 != 0 && ordinal2 != 1) {
                if (ordinal2 == 2) {
                    eptmVar = eptm.CAMERA_GALLERY_BUTTON;
                } else if (ordinal2 == 3) {
                    eptmVar = eptm.DRAFT_END_EMOJI_BUTTON;
                } else if (ordinal2 == 4) {
                    eptmVar = eptm.PLUS_BUTTON;
                } else if (ordinal2 != 5) {
                    throw new ffcd();
                }
                xgwVar.b.d(eptsVar2, eptuVar, eptmVar, epto.UNKNOWN_OPENING_STATE, null, null, null);
            }
            eptmVar = eptm.UNKNOWN_OPENING_SOURCE;
            xgwVar.b.d(eptsVar2, eptuVar, eptmVar, epto.UNKNOWN_OPENING_STATE, null, null, null);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new yps(this.b, this.c, this.d, ffguVar);
    }
}
