package defpackage;

import android.content.Context;
import android.os.ConditionVariable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eexc implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ String[] b;
    final /* synthetic */ ConditionVariable c;
    final /* synthetic */ eexd d;

    public eexc(eexd eexdVar, Context context, String[] strArr, ConditionVariable conditionVariable) {
        this.a = context;
        this.b = strArr;
        this.c = conditionVariable;
        this.d = eexdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                eexd eexdVar = this.d;
                eexdVar.c = eexdVar.a(this.a, this.b);
            } catch (RuntimeException e) {
                this.d.d = e;
            }
        } finally {
            this.c.open();
        }
    }
}
