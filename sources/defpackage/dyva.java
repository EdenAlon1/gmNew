package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyva {
    public static emxc a(HashMap hashMap) {
        try {
            final dzrc i = dzrd.i();
            if (hashMap.containsKey("A11Y_TEXT")) {
                i.b((String) hashMap.get("A11Y_TEXT"));
            }
            if (hashMap.containsKey("LIGHTER_ICON")) {
                dyht.b(dyuk.a((HashMap) hashMap.get("LIGHTER_ICON")), new ksp() { // from class: dyux
                    @Override // defpackage.ksp
                    public final void accept(Object obj) {
                        dzrc.this.f((dzqb) obj);
                    }
                });
            }
            i.g((String) hashMap.get("TEXT"));
            ((dznx) i).a = (dzjn) dyht.a(dyhu.b(hashMap.get("ACTION")), new emwl() { // from class: dyuy
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return dytw.a((HashMap) obj);
                }
            }).c();
            i.h(((Integer) hashMap.get("TEXT_COLOR")).intValue());
            i.c(((Integer) hashMap.get("BACKGROUND_COLOR")).intValue());
            i.d(((Integer) hashMap.get("BORDER_COLOR")).intValue());
            i.e(((Boolean) hashMap.get("ENABLED")).booleanValue());
            return emxc.j(i.a());
        } catch (IllegalStateException | NullPointerException e) {
            dyhr.d("RCButtonsConverters", "failed to convert Map to RichCardButton", e);
            return emux.a;
        }
    }

    public static HashMap b(final dzrd dzrdVar) {
        final HashMap hashMap = new HashMap();
        hashMap.put("TEXT", dzrdVar.g());
        dyht.b(dzrdVar.e(), new ksp() { // from class: dyuu
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                hashMap.put("A11Y_TEXT", dzrdVar.e().c());
            }
        });
        dyht.b(dzrdVar.f(), new ksp() { // from class: dyuv
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                hashMap.put("LIGHTER_ICON", dyuk.b((dzqb) obj));
            }
        });
        hashMap.put("ACTION", dytw.b(dzrdVar.d()));
        hashMap.put("TEXT_COLOR", Integer.valueOf(dzrdVar.c()));
        hashMap.put("BACKGROUND_COLOR", Integer.valueOf(dzrdVar.a()));
        hashMap.put("BORDER_COLOR", Integer.valueOf(dzrdVar.b()));
        hashMap.put("ENABLED", Boolean.valueOf(dzrdVar.h()));
        return hashMap;
    }
}
