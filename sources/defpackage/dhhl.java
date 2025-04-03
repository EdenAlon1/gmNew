package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.people.contactssync.DeviceContactsSyncClient;
import com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService;
import com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhhl extends dfra implements DeviceContactsSyncClient {
    public static final /* synthetic */ int a = 0;
    private static final dfqs b;
    private static final dfqj m;
    private static final dfqt n;

    static {
        dfqs dfqsVar = new dfqs();
        b = dfqsVar;
        dhhf dhhfVar = new dhhf();
        m = dhhfVar;
        n = new dfqt("People.API", dhhfVar, dfqsVar);
    }

    public dhhl(Activity activity) {
        super(activity, activity, n, dfqp.q, dfqz.a);
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final dhre<DeviceContactsSyncSetting> getDeviceContactsSyncSetting() {
        dfun dfunVar = new dfun();
        dfunVar.b = new Feature[]{dhgc.v};
        dfunVar.a = new dfuf() { // from class: dhhe
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                dhha dhhaVar = (dhha) obj;
                int i = dhhl.a;
                try {
                    Context context = dhhaVar.c;
                    ((IContactsSyncThirdPartyService) dhhaVar.w()).getBackupAndSyncOptInState(new dhhg((dhri) obj2), new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
                } catch (RemoteException e) {
                    ((dhri) obj2).c(e);
                }
            }
        };
        dfunVar.c = 2731;
        return i(dfunVar.a());
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final dhre<Void> launchDeviceContactsSyncSettingActivity(final Context context) {
        dfwv.o(context, "Please provide a non-null context");
        dfun dfunVar = new dfun();
        dfunVar.b = new Feature[]{dhgc.v};
        dfunVar.a = new dfuf() { // from class: dhhb
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                dhha dhhaVar = (dhha) obj;
                int i = dhhl.a;
                Context context2 = context;
                try {
                    Context context3 = dhhaVar.c;
                    ((IContactsSyncThirdPartyService) dhhaVar.w()).getDeviceContactsSyncSettingAction(new dhhk(context2, (dhri) obj2), new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
                } catch (RemoteException e) {
                    ((dhri) obj2).c(e);
                }
            }
        };
        dfunVar.c = 2733;
        return i(dfunVar.a());
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final dhre<Void> registerSyncSettingUpdatedListener(DeviceContactsSyncClient.SyncSettingUpdatedListener syncSettingUpdatedListener) {
        final dftp f = f(syncSettingUpdatedListener, "dataChangedListenerKey");
        dfuf dfufVar = new dfuf() { // from class: dhhc
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                dhha dhhaVar = (dhha) obj;
                int i = dhhl.a;
                IContactsSyncThirdPartyService iContactsSyncThirdPartyService = (IContactsSyncThirdPartyService) dhhaVar.w();
                dhhi dhhiVar = new dhhi(dftp.this);
                Context context = dhhaVar.c;
                iContactsSyncThirdPartyService.addDeviceContactsSyncSettingChangedListener(dhhiVar, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
            }
        };
        dfuf dfufVar2 = new dfuf() { // from class: dhhd
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                dhha dhhaVar = (dhha) obj;
                int i = dhhl.a;
                IContactsSyncThirdPartyService iContactsSyncThirdPartyService = (IContactsSyncThirdPartyService) dhhaVar.w();
                dhhj dhhjVar = new dhhj((dhri) obj2);
                Context context = dhhaVar.c;
                iContactsSyncThirdPartyService.removeDeviceContactsSyncSettingChangedListener(dhhjVar, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
            }
        };
        dfud dfudVar = new dfud();
        dfudVar.c = f;
        dfudVar.a = dfufVar;
        dfudVar.b = dfufVar2;
        dfudVar.d = new Feature[]{dhgc.u};
        dfudVar.e = 2729;
        return j(dfudVar.a());
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final dhre<Boolean> unregisterSyncSettingUpdatedListener(DeviceContactsSyncClient.SyncSettingUpdatedListener syncSettingUpdatedListener) {
        return k(dftq.a(syncSettingUpdatedListener, "dataChangedListenerKey"), 2730);
    }

    public dhhl(Context context) {
        super(context, n, dfqp.q, dfqz.a);
    }
}
