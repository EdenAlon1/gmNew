package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.SyncOptions;
import com.google.android.gms.mdisync.internal.IMdiSyncService;
import com.google.android.gms.mdisync.internal.SyncRequest;
import com.google.android.gms.mdisync.internal.TeleportingSyncRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhep extends dfra implements dhej {
    public static final /* synthetic */ int a = 0;
    private static final dfqs b;
    private static final dfqj m;
    private static final dfqt n;

    static {
        dfqs dfqsVar = new dfqs();
        b = dfqsVar;
        dhen dhenVar = new dhen();
        m = dhenVar;
        n = new dfqt("MdiSync.API", dhenVar, dfqsVar);
    }

    public dhep(Context context, dhek dhekVar) {
        super(context, n, dhekVar, dfqz.a);
    }

    @Override // defpackage.dhej
    public final dhre a(int i, byte[] bArr, SyncOptions syncOptions, CallerInfo callerInfo) {
        return b(i, bArr, syncOptions, callerInfo, false, 15902);
    }

    public final dhre b(int i, byte[] bArr, SyncOptions syncOptions, final CallerInfo callerInfo, final boolean z, int i2) {
        final SyncRequest syncRequest = new SyncRequest(i, bArr, syncOptions);
        dfun dfunVar = new dfun();
        dfunVar.a = new dfuf() { // from class: dhem
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                dheq dheqVar = (dheq) obj;
                int i3 = dhep.a;
                dheo dheoVar = new dheo((dhri) obj2);
                IMdiSyncService iMdiSyncService = (IMdiSyncService) dheqVar.w();
                Context context = dheqVar.c;
                ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
                boolean z2 = z;
                SyncRequest syncRequest2 = syncRequest;
                CallerInfo callerInfo2 = callerInfo;
                if (z2) {
                    iMdiSyncService.syncWithTeleportation(dheoVar, new TeleportingSyncRequest(syncRequest2), callerInfo2, new ApiMetadata(complianceOptions));
                } else {
                    iMdiSyncService.sync(dheoVar, syncRequest2, callerInfo2, new ApiMetadata(complianceOptions));
                }
            }
        };
        int i3 = syncRequest.c - 1;
        dfunVar.b = (i3 == 1 || i3 == 2 || i3 == 3) ? new Feature[]{dhei.b} : i3 != 4 ? new Feature[0] : new Feature[]{dhei.a};
        dfunVar.c = i2;
        return i(dfunVar.a());
    }
}
