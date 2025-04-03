package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtrt extends dtsf {
    public final String a;
    public final int b;

    public dtrt(String str, int i, Object obj) {
        super(str);
        this.b = i;
        this.a = obj == null ? null : obj.toString();
    }

    private final boolean h(StringBuilder sb, dtyo dtyoVar) {
        int i = this.b - 1;
        if (i == 0) {
            sb.append('(');
            sb.append(f(dtyoVar));
            sb.append(" IS NULL)");
            return true;
        }
        if (i != 1) {
            return false;
        }
        sb.append('(');
        sb.append(f(dtyoVar));
        sb.append(" IS NOT NULL)");
        return true;
    }

    @Override // defpackage.duaw
    public final void a(dtzu dtzuVar, StringBuilder sb, List list) {
        if (this.a == null && h(sb, dtzuVar.a())) {
            return;
        }
        sb.append('(');
        sb.append(f(dtzuVar.a()));
        sb.append(' ');
        sb.append(g(this.b));
        sb.append(" ?)");
        list.add(this.a);
    }

    @Override // defpackage.duaw
    public final void b(dtzu dtzuVar, StringBuilder sb) {
        String str = this.a;
        dtyo a = dtzuVar.a();
        if (str == null && h(sb, a)) {
            return;
        }
        sb.append('(');
        sb.append(f(a));
        sb.append(' ');
        sb.append(g(this.b));
        sb.append(' ');
        sb.append(DatabaseUtils.sqlEscapeString(this.a));
        sb.append(')');
    }

    @Override // defpackage.duaw
    protected final boolean c(dtyl dtylVar, duaw duawVar) {
        if (!(duawVar instanceof dtrt) || this.a == null) {
            return false;
        }
        dtrt dtrtVar = (dtrt) duawVar;
        if (!dtylVar.a(this.d).equals(dtrtVar.d)) {
            return false;
        }
        boolean equals = TextUtils.equals(this.a, dtrtVar.a);
        int i = this.b - 1;
        if (i == 0) {
            int i2 = dtrtVar.b;
            if (i2 == 1) {
                if (!equals) {
                    return true;
                }
                equals = true;
            }
            return i2 == 2 && equals;
        }
        if (i != 1) {
            return false;
        }
        int i3 = dtrtVar.b;
        if (i3 == 1) {
            if (equals) {
                return true;
            }
            equals = false;
        }
        return i3 == 2 && !equals;
    }

    @Override // defpackage.duaw
    protected final boolean d(String str, ContentValues contentValues) {
        String str2;
        String str3 = this.e;
        String asString = contentValues.getAsString(this.f);
        if (!TextUtils.equals(str, str3)) {
            return false;
        }
        int i = this.b;
        int i2 = i - 1;
        if (i2 == 0) {
            return asString == null || !TextUtils.equals(asString, this.a);
        }
        if (i2 == 1) {
            if (asString == null) {
                return true;
            }
            return TextUtils.equals(asString, this.a);
        }
        switch (i) {
            case 1:
                str2 = "EQUALS";
                break;
            case 2:
                str2 = "NOT_EQUALS";
                break;
            case 3:
                str2 = "IN";
                break;
            case 4:
                str2 = "NOT_IN";
                break;
            case 5:
                str2 = "IS_NULL";
                break;
            case 6:
                str2 = "IS_NOT_NULL";
                break;
            case 7:
                str2 = "IS_GREATER_THAN";
                break;
            case 8:
                str2 = "IS_LESS_THAN";
                break;
            case 9:
                str2 = "IS_GREATER_THAN_OR_EQUAL_TO";
                break;
            case 10:
                str2 = "IS_LESS_THAN_OR_EQUAL_TO";
                break;
            default:
                str2 = "LIKE";
                break;
        }
        throw new IllegalStateException("doesn't handle ".concat(str2));
    }
}
