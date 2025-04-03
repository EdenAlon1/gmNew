package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dfwc<T extends IInterface> extends BaseGmsClient<T> implements dfqr {
    private static volatile Executor a;
    public final dfvs u;
    private final Set v;
    private final Account w;

    protected dfwc(Context context, Looper looper, int i, dfvs dfvsVar, dfsm dfsmVar, dftw dftwVar) {
        super(context, looper, dfwe.a(context), dfpi.a, i, new dfwa(dfsmVar), new dfwb(dftwVar), dfvsVar.f);
        this.u = dfvsVar;
        this.w = dfvsVar.a;
        Set set = dfvsVar.c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.v = set;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] I() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.dfqr
    public int a() {
        throw null;
    }

    @Override // defpackage.dfqr
    public final Set k() {
        return h() ? this.v : Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Account v() {
        return this.w;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Set z() {
        return this.v;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final void K() {
    }
}
