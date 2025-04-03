package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.search.queries.internal.ISearchQueriesService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhoy extends dhmy<ISearchQueriesService> {
    public dhoy(Context context, Looper looper, dfvs dfvsVar, dfsm dfsmVar, dftw dftwVar, dhmh dhmhVar) {
        super(context, looper, 32, dfvsVar, dfsmVar, dftwVar, dhmhVar);
    }

    @Override // defpackage.dfwc, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dfqr
    public final int a() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return ISearchQueriesService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.search.queries.internal.ISearchQueriesService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gK() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] gL() {
        return dgox.i;
    }

    public dhoy(Context context, dfvs dfvsVar, dfsm dfsmVar, dftw dftwVar, dhmh dhmhVar) {
        super(context, context.getMainLooper(), 32, dfvsVar, dfsmVar, dftwVar, dhmhVar);
    }
}
