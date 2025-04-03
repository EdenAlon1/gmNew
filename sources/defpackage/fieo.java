package defpackage;

import android.util.Printer;
import internal.J.N;
import org.chromium.base.EarlyTraceEvent;
import org.chromium.base.TraceEvent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes6.dex */
public class fieo implements Printer {
    private String a;

    public void a(String str) {
        String d;
        EarlyTraceEvent.a();
        if (TraceEvent.a) {
            if (TraceEvent.c) {
                d = "Looper.dispatch: EVENT_NAME_FILTERED";
            } else {
                int indexOf = str.indexOf(40, 18);
                int indexOf2 = indexOf == -1 ? -1 : str.indexOf(41, indexOf);
                String substring = indexOf2 != -1 ? str.substring(indexOf + 1, indexOf2) : "";
                int indexOf3 = str.indexOf(125, 18);
                int indexOf4 = indexOf3 == -1 ? -1 : str.indexOf(58, indexOf3);
                if (indexOf4 == -1) {
                    indexOf4 = str.length();
                }
                d = a.d(indexOf3 != -1 ? str.substring(indexOf3 + 2, indexOf4) : "", substring, "Looper.dispatch: ", "(", ")");
            }
            this.a = d;
            if (TraceEvent.a) {
                N.M_y76mct(this.a);
            } else {
                EarlyTraceEvent.a();
            }
        }
    }

    public void b(String str) {
        EarlyTraceEvent.a();
        if (TraceEvent.a && this.a != null) {
            if (TraceEvent.a) {
                N.MLJecZJ9();
            } else {
                EarlyTraceEvent.a();
            }
        }
        this.a = null;
    }

    @Override // android.util.Printer
    public final void println(String str) {
        if (str.startsWith(">")) {
            a(str);
        } else {
            b(str);
        }
    }
}
