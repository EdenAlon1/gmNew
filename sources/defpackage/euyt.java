package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euyt {
    public static eupm a(String str, String str2) {
        return eupm.d(new euym(str, str2), euyq.class);
    }

    public static eupm b(final String str, final euys euysVar) {
        eupl c = eupm.c(euyq.class);
        c.b(new euqd(Context.class, 1, 0));
        c.c = new eupr() { // from class: euyr
            @Override // defpackage.eupr
            public final Object a(eupo eupoVar) {
                return new euym(str, euysVar.a((Context) eupoVar.e(Context.class)));
            }
        };
        return c.a();
    }
}
