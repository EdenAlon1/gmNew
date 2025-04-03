package defpackage;

import android.content.ContentValues;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class duaw {
    protected static final String g(int i) {
        switch (i - 1) {
            case 0:
                return "=";
            case 1:
                return "<>";
            case 2:
                return "IN";
            case 3:
                return "NOT IN";
            case 4:
                return "ISNULL";
            case 5:
                return "NOTNULL";
            case 6:
                return ">";
            case 7:
                return "<";
            case 8:
                return ">=";
            case 9:
                return "<=";
            default:
                return "LIKE";
        }
    }

    public abstract void a(dtzu dtzuVar, StringBuilder sb, List list);

    public abstract void b(dtzu dtzuVar, StringBuilder sb);

    protected boolean c(dtyl dtylVar, duaw duawVar) {
        return false;
    }

    protected boolean d(String str, ContentValues contentValues) {
        return false;
    }

    public abstract void e(dtse dtseVar);
}
