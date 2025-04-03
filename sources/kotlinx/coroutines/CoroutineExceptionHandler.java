package kotlinx.coroutines;

import defpackage.ffha;
import defpackage.ffhd;
import defpackage.ffse;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface CoroutineExceptionHandler extends ffha {
    public static final ffse c = ffse.a;

    void handleException(ffhd ffhdVar, Throwable th);
}
