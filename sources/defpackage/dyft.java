package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.SyncOptions;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyft implements dyfn {
    public final dhej a;
    public final CallerInfo b;

    public dyft(Context context, dhej dhejVar, String str, Account account, emyl emylVar, emyl emylVar2) {
        this.a = dhejVar;
        this.b = new CallerInfo("profile-".concat(str), 1L);
        dyfr dyfrVar = new dyfr(emylVar2, account);
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(dyfrVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_PHOTO_UPDATED"), 2);
        } else {
            context.registerReceiver(dyfrVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_PHOTO_UPDATED"));
        }
        dyfs dyfsVar = new dyfs(emylVar, account);
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(dyfsVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_INFO_UPDATED"), 2);
        } else {
            context.registerReceiver(dyfsVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_INFO_UPDATED"));
        }
    }

    @Override // defpackage.dyfn
    public final ListenableFuture a() {
        SyncOptions syncOptions = new SyncOptions();
        return elfr.k(duin.a(this.a.a(1, new byte[0], syncOptions, this.b)), new eroh() { // from class: dyfo
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                eyfc eyfcVar = eyfc.a;
                eyib eyibVar = eyib.a;
                eyfc eyfcVar2 = eyfc.a;
                return erqt.i((ewrq) eyfy.parseFrom(ewrq.a, (byte[]) obj, eyfcVar2));
            }
        }, erpp.a);
    }
}
