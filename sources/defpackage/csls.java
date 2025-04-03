package defpackage;

import android.util.Log;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class csls {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/common/TrackingLog");
    public final StringBuilder b;
    public String c;
    public boolean d;
    private int e;
    private final csjx f;
    private final int g;

    /* compiled from: PG */
    public interface a {
        cskj cG();
    }

    public csls() {
        this.b = new StringBuilder();
        this.g = 1;
        this.f = null;
    }

    public final void A(String str, Object obj) {
        if (this.d) {
            q(str);
            this.b.append(obj);
        }
    }

    public final void B(String str, boolean z) {
        if (this.d) {
            q(str);
            this.b.append(z);
        }
    }

    public final void C(String str, Object[] objArr) {
        if (this.d) {
            q(str);
            if (objArr == null) {
                this.b.append("null");
                return;
            }
            this.b.append('{');
            int length = objArr.length;
            if (length > 0) {
                this.b.append(objArr[0]);
                for (int i = 1; i < length; i++) {
                    StringBuilder sb = this.b;
                    sb.append(", ");
                    sb.append(objArr[i]);
                }
            }
            this.b.append('}');
        }
    }

    public final void D(String str, CharSequence charSequence) {
        if (this.d) {
            StringBuilder sb = this.b;
            sb.append(' ');
            sb.append(str);
            sb.append('{');
            sb.append(cskt.b(charSequence));
            sb.append('}');
        }
    }

    public final void E(String str, String str2, int i) {
        if (this.d) {
            StringBuilder sb = this.b;
            sb.append(' ');
            sb.append(str);
            sb.append('{');
            sb.append(str2);
            sb.append(':');
            sb.append(i);
            sb.append('}');
        }
    }

    public final void F(String str, String str2, Object obj) {
        if (this.d) {
            StringBuilder sb = this.b;
            sb.append(' ');
            sb.append(str);
            sb.append('{');
            sb.append(str2);
            sb.append(':');
            sb.append(obj);
            sb.append('}');
        }
    }

    public final void G(int i) {
        if (this.d) {
            StringBuilder sb = this.b;
            sb.append(' ');
            sb.append(i);
        }
    }

    public final void H(long j) {
        if (this.d) {
            StringBuilder sb = this.b;
            sb.append(' ');
            sb.append(j);
        }
    }

    public final void I(Object obj) {
        if (this.d) {
            StringBuilder sb = this.b;
            sb.append(' ');
            sb.append(obj);
        }
    }

    public final void J(boolean z) {
        if (this.d) {
            StringBuilder sb = this.b;
            sb.append(' ');
            sb.append(z);
        }
    }

    @Deprecated
    public final void K(csjp csjpVar, Object obj) {
        if (!this.d || csjpVar.a(this, obj)) {
            return;
        }
        this.d = false;
        this.b.setLength(0);
    }

    public final void L(String str, Collection collection) {
        if (collection == null) {
            F(str, "size", "null");
        } else {
            E(str, "size", collection.size());
        }
    }

    public final void M(String str, CharSequence charSequence) {
        x(str, charSequence, 1);
    }

    public final void N(String str, Object obj) {
        if (this.d) {
            q(str);
            this.b.append(((a) ctba.a(a.class)).cG().a(obj == null ? "" : obj.toString(), 1));
        }
    }

    public final void O(String str, Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        L(str, collection);
    }

    public final void q(String str) {
        char charAt;
        int length = this.b.length();
        if (length > 0 && (charAt = this.b.charAt(length - 1)) != '.' && charAt != ',' && charAt != ';' && charAt != ':') {
            this.b.append(',');
        }
        StringBuilder sb = this.b;
        sb.append(' ');
        sb.append(str);
        sb.append(": ");
    }

    public final void r() {
        csjx csjxVar;
        if (!this.d || this.b.length() <= 0) {
            return;
        }
        if (this.g == 1 || (csjxVar = this.f) == null) {
            int i = this.e;
            String str = this.c;
            String sb = this.b.toString();
            if (csjy.q(str, i)) {
                emxf.b(str.length() <= 23, "Tag must be <=23 chars");
                enrr a2 = csjy.a.a(csjy.b(i));
                a2.Y(ente.a, str);
                a2.Z(ense.a);
                ((enrr) a2.h("com/google/android/apps/messaging/shared/util/common/LogUtil", "println", 539, "LogUtil.java")).t("%s", sb);
            }
        } else {
            csjxVar.b(this.e, this.c, this.b.toString());
        }
        this.b.setLength(0);
    }

    public final void s(Throwable th) {
        if (this.d) {
            if (this.g != 1) {
                if (this.b.length() > 0) {
                    this.b.append('\n');
                }
                this.b.append(Log.getStackTraceString(th));
                r();
                return;
            }
            enrr a2 = a.a(csjy.b(this.e));
            a2.Y(ente.a, this.c);
            a2.Z(ense.a);
            ((enrr) ((enrr) a2.g(th)).h("com/google/android/apps/messaging/shared/util/common/TrackingLog", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME, 80, "TrackingLog.java")).t("%s", this.b);
            this.b.setLength(0);
        }
    }

    public final void t(int i, String str, csjq csjqVar) {
        boolean z = true;
        if (this.g != 2 && !csjy.q(str, i)) {
            z = false;
        }
        this.d = z;
        if (z) {
            this.e = i;
            this.c = str;
            csjqVar.a(this.b);
            this.b.append(':');
        }
    }

    public final void u(char c) {
        if (this.d) {
            this.b.append(c);
        }
    }

    public final void v(Object obj) {
        if (this.d) {
            this.b.append(obj);
        }
    }

    public final void w(long j) {
        if (this.d) {
            StringBuilder sb = this.b;
            sb.append(" {x-message-id:");
            sb.append(j);
            sb.append('}');
        }
    }

    public final void x(String str, CharSequence charSequence, int i) {
        if (this.d) {
            q(str);
            this.b.append(((a) ctba.a(a.class)).cG().a(charSequence == null ? "" : charSequence.toString(), i));
        }
    }

    public final void y(String str, int i) {
        if (this.d) {
            q(str);
            this.b.append(i);
        }
    }

    public final void z(String str, long j) {
        if (this.d) {
            q(str);
            this.b.append(j);
        }
    }

    protected csls(csjx csjxVar) {
        this.b = new StringBuilder();
        this.g = 2;
        this.f = csjxVar;
    }
}
