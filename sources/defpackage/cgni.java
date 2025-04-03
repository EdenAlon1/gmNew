package defpackage;

import android.text.TextUtils;
import java.util.Set;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgni implements fbba {
    public static engw a(Set set, final dwqt dwqtVar, String str, dwqt dwqtVar2) {
        int i = engw.d;
        engr engrVar = new engr();
        if (!TextUtils.isEmpty(str)) {
            engrVar.h(new cgmc(new Supplier() { // from class: cgng
                @Override // java.util.function.Supplier
                public final Object get() {
                    return dwqt.this;
                }
            }, new Supplier() { // from class: cgnh
                @Override // java.util.function.Supplier
                public final Object get() {
                    return ctjd.R;
                }
            }));
        }
        engrVar.h(dwqtVar2);
        engrVar.j(set);
        engw g = engrVar.g();
        g.getClass();
        return g;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
