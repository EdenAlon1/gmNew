package defpackage;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eexd extends eewk {
    private static final Handler a = new Handler(Looper.getMainLooper());
    public String c;
    public RuntimeException d;

    public eexd() {
        super("ui");
    }

    protected abstract String a(Context context, String[] strArr);

    @Override // defpackage.eewl
    public final String c(Context context, String[] strArr) {
        ConditionVariable conditionVariable = new ConditionVariable();
        a.post(new eexc(this, context, strArr, conditionVariable));
        conditionVariable.block();
        RuntimeException runtimeException = this.d;
        if (runtimeException == null) {
            return this.c;
        }
        throw runtimeException;
    }
}
