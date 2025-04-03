package defpackage;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pty extends ffkk implements ffji {
    final /* synthetic */ ppr a;
    final /* synthetic */ boolean b;
    final /* synthetic */ String c;
    final /* synthetic */ pua d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pty(ppr pprVar, boolean z, String str, pua puaVar) {
        super(1);
        this.a = pprVar;
        this.b = z;
        this.c = str;
        this.d = puaVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        if (th instanceof pti) {
            this.a.i(((pti) th).a);
        }
        if (this.b && (str = this.c) != null) {
            int hashCode = this.d.a.hashCode();
            if (Build.VERSION.SDK_INT >= 29) {
                Trace.endAsyncSection(ozg.e(str), hashCode);
            } else {
                String e = ozg.e(str);
                try {
                    if (ozg.c == null) {
                        ozg.c = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                    }
                    Method method = ozg.c;
                    if (method == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    method.invoke(null, Long.valueOf(ozg.a), e, Integer.valueOf(hashCode));
                } catch (Exception e2) {
                    ozg.d("asyncTraceEnd", e2);
                }
            }
        }
        return ffcu.a;
    }
}
