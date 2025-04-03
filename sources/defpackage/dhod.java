package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.search.ime.internal.IIMEUpdatesService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhod extends dhmy {
    public dhod(Context context, dfvs dfvsVar, dfsm dfsmVar, dftw dftwVar, dhmh dhmhVar) {
        super(context, context.getMainLooper(), 66, dfvsVar, dfsmVar, dftwVar, dhmhVar);
    }

    @Override // defpackage.dfwc, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dfqr
    public final int a() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IIMEUpdatesService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.search.ime.internal.IIMEUpdatesService";
    }
}
