package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fizs {
    public static final fizs a = new fizs(0);
    public static final fizs b = new fizs(1);
    public static final fizs c = new fizs(2);
    public int d;
    public Object e;

    private fizs() {
    }

    final void a(fizd fizdVar) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        ((List) this.e).add(fizdVar);
    }

    public final String toString() {
        int i = this.d;
        if (i == 0) {
            return "unknown";
        }
        if (i == 1) {
            return "NXDOMAIN";
        }
        if (i == 2) {
            return "NXRRSET";
        }
        if (i == 3) {
            StringBuffer stringBuffer = new StringBuffer("delegation: ");
            stringBuffer.append(this.e);
            return stringBuffer.toString();
        }
        if (i == 4) {
            StringBuffer stringBuffer2 = new StringBuffer("CNAME: ");
            stringBuffer2.append(this.e);
            return stringBuffer2.toString();
        }
        if (i != 5) {
            return "successful";
        }
        StringBuffer stringBuffer3 = new StringBuffer("DNAME: ");
        stringBuffer3.append(this.e);
        return stringBuffer3.toString();
    }

    public fizs(int i) {
        this.d = i;
        this.e = null;
    }

    public fizs(int i, fizd fizdVar) {
        this.d = i;
        this.e = fizdVar;
    }
}
