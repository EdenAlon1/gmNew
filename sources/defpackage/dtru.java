package defpackage;

import android.content.ContentValues;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtru extends dtsf {
    private final dtzj a;
    private final int b;

    public dtru(String str, int i, dtzj dtzjVar) {
        super(str);
        this.b = i;
        this.a = dtzjVar;
        if (dtzjVar instanceof dtyq) {
            dtyq dtyqVar = (dtyq) dtzjVar;
            dtzu.b();
            engw Y = dtyqVar.Y();
            int size = Y != null ? Y.size() : 0;
            engw engwVar = ((dtrj) dtyqVar.e).f;
            if (size + (engwVar != null ? ((enou) engwVar).c : 0) != 1) {
                throw new IllegalArgumentException("projection must have exactly one column");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean h(dtzu dtzuVar, StringBuilder sb, List list) {
        String str;
        dtzj dtzjVar = this.a;
        if (dtzjVar instanceof dtyq) {
            dtyq dtyqVar = (dtyq) dtzjVar;
            int length = dtyqVar.W(dtzu.b()).length;
            dtzu.b();
            engw Y = dtyqVar.Y();
            engw engwVar = ((dtrj) dtyqVar.e).f;
            if (length > Y.size() + ((enou) engwVar).c) {
                if (Y.size() == 1) {
                    String str2 = (String) Y.get(0);
                    str = str2.substring(str2.indexOf(".") + 1);
                } else {
                    dtzj dtzjVar2 = (dtzj) engwVar.get(0);
                    if (!(dtzjVar2 instanceof dtqr)) {
                        throw new IllegalStateException("subquery with expression must use AsExpression");
                    }
                    str = ((dtqr) dtzjVar2).a;
                }
                sb.append(String.format(Locale.US, "(%s %s %s)", f(dtzuVar.a()), g(this.b), String.format(Locale.US, "(SELECT %s FROM %s)", str, list == null ? this.a.ag(dtzuVar) : this.a.ah(dtzuVar, list))));
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.duaw
    public final void a(dtzu dtzuVar, StringBuilder sb, List list) {
        if (this.a == null) {
            sb.append(String.format(Locale.US, "(%s %s)", f(dtzuVar.a()), g(this.b)));
        } else {
            if (h(dtzuVar, sb, list)) {
                return;
            }
            sb.append(String.format(Locale.US, "(%s %s %s)", f(dtzuVar.a()), g(this.b), this.a.ah(dtzuVar, list)));
        }
    }

    @Override // defpackage.duaw
    public final void b(dtzu dtzuVar, StringBuilder sb) {
        if (this.a == null) {
            sb.append(String.format(Locale.US, "(%s %s)", f(dtzuVar.a()), g(this.b)));
        } else {
            if (h(dtzuVar, sb, null)) {
                return;
            }
            sb.append(String.format(Locale.US, "(%s %s %s)", f(dtzuVar.a()), g(this.b), this.a.ag(dtzuVar)));
        }
    }

    @Override // defpackage.duaw
    protected final boolean d(String str, ContentValues contentValues) {
        dtzj dtzjVar = this.a;
        if (!(dtzjVar instanceof dtyq)) {
            return false;
        }
        dtyq dtyqVar = (dtyq) dtzjVar;
        if (this.b - 1 != 2) {
            return false;
        }
        return dtwg.a().f(str, contentValues, dtyqVar);
    }

    @Override // defpackage.dtsf, defpackage.duaw
    public final void e(dtse dtseVar) {
        super.e(dtseVar);
        this.a.ai(dtseVar);
    }
}
