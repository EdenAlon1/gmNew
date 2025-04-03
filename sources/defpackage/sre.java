package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class sre extends ffju implements ffjn {
    public sre(Object obj) {
        super(3, obj, srp.class, "ensureBannersEnabled", "ensureBannersEnabled(Ljava/util/List;Z)Ljava/util/List;", 4);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
            return list;
        }
        ((enrr) srp.a.h().h("com/google/android/apps/messaging/banner/BannersUiAdapterImpl", "ensureBannersEnabled", 124, "BannersUiAdapterImpl.kt")).q("Banners are disabled");
        return ffel.a;
    }
}
