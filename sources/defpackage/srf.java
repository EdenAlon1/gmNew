package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class srf extends ffju implements ffjn {
    public srf(Object obj) {
        super(3, obj, srp.class, "hideBannersIfScamAlertCardEligible", "hideBannersIfScamAlertCardEligible(Ljava/util/List;Z)Ljava/util/List;", 4);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        if (!((Boolean) ((cfup) ctjd.bD.get()).e()).booleanValue() || !booleanValue) {
            return list;
        }
        ((enrr) srp.a.h().h("com/google/android/apps/messaging/banner/BannersUiAdapterImpl", "hideBannersIfScamAlertCardEligible", 134, "BannersUiAdapterImpl.kt")).q("Banners are disabled because alert card is eligible");
        return ffel.a;
    }
}
