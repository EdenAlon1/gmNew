package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.firebase.appindexing.internal.IAppIndexingService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euoi extends dfwc {
    static final dfqt a;
    private static final dfqs v;
    private static final dfqj w;

    static {
        dfqs dfqsVar = new dfqs();
        v = dfqsVar;
        euoh euohVar = new euoh();
        w = euohVar;
        a = new dfqt("AppIndexing.API", euohVar, dfqsVar);
    }

    public euoi(Context context, Looper looper, dfvs dfvsVar, dfrc dfrcVar, dfrd dfrdVar) {
        super(context, looper, 113, dfvsVar, dfrcVar, dfrdVar);
    }

    @Override // defpackage.dfwc, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dfqr
    public final int a() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IAppIndexingService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.firebase.appindexing.internal.IAppIndexingService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.icing.APP_INDEXING_SERVICE";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gK() {
        return true;
    }
}
