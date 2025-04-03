package defpackage;

import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.logging.LogRecord;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class envg extends LogRecord {
    private static final Object[] b;
    public final enuj a;
    private final entl c;

    static {
        new envf();
        b = new Object[0];
    }

    protected envg(entl entlVar, ents entsVar) {
        super(entlVar.m(), null);
        this.c = entlVar;
        this.a = enuj.g(entsVar, entlVar.i());
        ense e = entlVar.e();
        setSourceClassName(e.b());
        setSourceMethodName(e.d());
        setLoggerName(entlVar.l());
        setMillis(TimeUnit.NANOSECONDS.toMillis(entlVar.d()));
        super.setParameters(b);
    }

    public static void a(entl entlVar, StringBuilder sb) {
        sb.append("  original message: ");
        if (entlVar.j() == null) {
            sb.append(entq.b(entlVar.k()));
        } else {
            sb.append(entlVar.j().b);
            sb.append("\n  original arguments:");
            for (Object obj : entlVar.T()) {
                sb.append("\n    ");
                sb.append(entq.b(obj));
            }
        }
        ents i = entlVar.i();
        if (i.b() > 0) {
            sb.append("\n  metadata:");
            for (int i2 = 0; i2 < i.b(); i2++) {
                sb.append("\n    ");
                sb.append(i.c(i2).a);
                sb.append(": ");
                sb.append(entq.b(i.e(i2)));
            }
        }
        sb.append("\n  level: ");
        sb.append(entq.b(entlVar.m()));
        sb.append("\n  timestamp (nanos): ");
        sb.append(entlVar.d());
        sb.append("\n  class: ");
        sb.append(entlVar.e().b());
        sb.append("\n  method: ");
        sb.append(entlVar.e().d());
        sb.append("\n  line number: ");
        sb.append(entlVar.e().a());
    }

    @Override // java.util.logging.LogRecord
    public final String getMessage() {
        String message = super.getMessage();
        if (message != null) {
            return message;
        }
        String a = enuo.b.a(this.c, this.a);
        super.setMessage(a);
        return a;
    }

    @Override // java.util.logging.LogRecord
    public final void setMessage(String str) {
        if (str == null) {
            str = "";
        }
        super.setMessage(str);
    }

    @Override // java.util.logging.LogRecord
    public final void setParameters(Object[] objArr) {
        getMessage();
        if (objArr == null) {
            objArr = b;
        }
        super.setParameters(objArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" {\n  message: ");
        sb.append(getMessage());
        sb.append("\n  arguments: ");
        sb.append(getParameters() != null ? Arrays.asList(getParameters()) : "<none>");
        sb.append('\n');
        a(this.c, sb);
        sb.append("\n}");
        return sb.toString();
    }

    @Override // java.util.logging.LogRecord
    public final void setResourceBundle(ResourceBundle resourceBundle) {
    }

    @Override // java.util.logging.LogRecord
    public final void setResourceBundleName(String str) {
    }
}
