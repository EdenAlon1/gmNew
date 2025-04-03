package defpackage;

import java.io.Serializable;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fguz implements Serializable {
    private static final long serialVersionUID = -7303846680559287286L;
    public final Date a;
    public final Date b;

    public fguz(Date date, Date date2) {
        if (date2.before(date)) {
            throw new IllegalArgumentException("Range start must be before range end");
        }
        this.a = date;
        this.b = date2;
    }
}
