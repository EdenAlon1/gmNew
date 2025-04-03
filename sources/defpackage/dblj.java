package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dblj {
    public final List a = new ArrayList();
    private final String b;

    public dblj(String str) {
        this.b = str;
    }

    public final void a(String str, String str2) {
        String[] strArr = bxyw.a;
        bxyc bxycVar = new bxyc();
        bxycVar.d(this.b);
        bxycVar.b(str);
        bxycVar.c(str2);
        this.a.add(bxycVar.a());
    }

    public final void b(String str) {
        a("", str);
    }
}
