package defpackage;

import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtzc extends dtsf {
    private final String a;
    private final String b;

    public dtzc(String str, String str2, String str3) {
        super(str);
        this.a = str2;
        this.b = str3;
    }

    @Override // defpackage.duaw
    public final void a(dtzu dtzuVar, StringBuilder sb, List list) {
        sb.append(String.format(Locale.US, "%s >= ? AND %s <= ?", f(dtzuVar.a()), f(dtzuVar.a())));
        list.add(this.a);
        list.add(this.b);
    }

    @Override // defpackage.duaw
    public final void b(dtzu dtzuVar, StringBuilder sb) {
        dtyo a = dtzuVar.a();
        sb.append(String.format(Locale.US, "%s >= %s AND %s <= %s", f(a), this.a, f(a), this.b));
    }
}
