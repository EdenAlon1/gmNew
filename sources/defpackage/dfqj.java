package defpackage;

import android.content.Context;
import android.os.Looper;
import defpackage.dfqr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dfqj<T extends dfqr, O> extends dfqq<T, O> {
    public dfqr a(Context context, Looper looper, dfvs dfvsVar, Object obj, dfsm dfsmVar, dftw dftwVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    @Deprecated
    public dfqr b(Context context, Looper looper, dfvs dfvsVar, Object obj, dfrc dfrcVar, dfrd dfrdVar) {
        return a(context, looper, dfvsVar, obj, dfrcVar, dfrdVar);
    }
}
