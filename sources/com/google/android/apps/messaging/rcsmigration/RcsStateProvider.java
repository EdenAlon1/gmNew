package com.google.android.apps.messaging.rcsmigration;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.messaging.rcsmigration.RcsStateProvider;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.rcsmigration.File;
import com.google.android.ims.rcsmigration.IRcsStateProvider;
import com.google.android.ims.rcsmigration.LegacyData;
import com.google.android.ims.rcsmigration.LegacyToken;
import com.google.android.ims.rcsmigration.RcsState;
import com.google.android.ims.rcsmigration.UndeliveredMessage;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.service.JibeService;
import defpackage.axnw;
import defpackage.cfuw;
import defpackage.cfvn;
import defpackage.ckav;
import defpackage.colj;
import defpackage.deuq;
import defpackage.deus;
import defpackage.deuu;
import defpackage.devd;
import defpackage.dipg;
import defpackage.djtw;
import defpackage.dkdw;
import defpackage.dkmi;
import defpackage.dkrq;
import defpackage.dkrx;
import defpackage.dkrz;
import defpackage.dkty;
import defpackage.dkuy;
import defpackage.dkvx;
import defpackage.dubm;
import defpackage.elfo;
import defpackage.enqu;
import defpackage.errl;
import defpackage.ffbr;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RcsStateProvider extends IRcsStateProvider.Stub {
    private final Context a;
    private final ffbr b;
    private final errl c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;

    /* renamed from: $r8$lambda$FWM-xeGripR0_dMeQQlFKKAds0A, reason: not valid java name */
    public static /* synthetic */ void m252$r8$lambda$FWMxeGripR0_dMeQQlFKKAds0A(RcsStateProvider rcsStateProvider) {
        Boolean bool = true;
        dkrz.g.e(bool);
        deus deusVar = (deus) dkrq.b;
        devd devdVar = deusVar.b;
        ContentResolver contentResolver = deuu.a;
        String str = deusVar.a;
        Bundle bundle = new Bundle();
        bool.getClass();
        bundle.putBoolean(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, true);
        bundle.putString("key", "migration_complete");
        bundle.putString(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, "boolean");
        enqu listIterator = devdVar.c.listIterator();
        while (listIterator.hasNext()) {
            ((dubm) listIterator.next()).a();
        }
        if (contentResolver.call(devdVar.a, "put", devdVar.b, bundle) == null) {
            Log.e("PreferenceFileAccessor", deuq.a("call() returned null result; replacing with EMPTY", new Object[0]));
        }
        if (dkuy.a(rcsStateProvider.a) == 2) {
            dkty.k("Rcs Engine should be running in cs.apk. Stopping JibeService.", new Object[0]);
            ((colj) rcsStateProvider.b.b()).n();
            dkty.k("JibeService stopped: %b", Boolean.valueOf(rcsStateProvider.a.stopService(new Intent(rcsStateProvider.a, (Class<?>) JibeService.class))));
            ((colj) rcsStateProvider.b.b()).m();
            dkmi.a().b(rcsStateProvider.a, (djtw) rcsStateProvider.d.b());
        }
    }

    public RcsStateProvider(Context context, ffbr<colj> ffbrVar, errl errlVar, ffbr<djtw> ffbrVar2, cfuw cfuwVar, ffbr<cfvn> ffbrVar3, ffbr<ckav> ffbrVar4, ffbr<dkdw> ffbrVar5) {
        cfuwVar.a();
        ffbrVar3.b();
        this.a = context;
        this.b = ffbrVar;
        this.c = errlVar;
        this.d = ffbrVar2;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        deuu deuuVar = dkrq.a;
        deuu.a(context);
    }

    public void allowOrThrow() {
        if (!((ckav) this.e.b()).a(Binder.getCallingUid())) {
            throw new RemoteException("Caller not google signed.");
        }
    }

    public RcsState buildRcsState() {
        LegacyData legacyData;
        dipg dipgVar;
        boolean z;
        File d;
        String str;
        int a = dkuy.a(this.a);
        if (a == 2) {
            Context context = this.a;
            ffbr ffbrVar = this.d;
            dkmi.a();
            djtw djtwVar = (djtw) ffbrVar.b();
            ffbr ffbrVar2 = this.f;
            dkvx.a();
            dkrx dkrxVar = new dkrx(context);
            Configuration.Token k = djtwVar.c().k();
            if (k == null || (str = k.mValue) == null || str.equals("")) {
                k = djtwVar.b();
            }
            LegacyToken legacyToken = new LegacyToken(k.mValue, k.mExpirationTime);
            int i = true != ((dkdw) ffbrVar2.b()).G() ? 0 : 2;
            int i2 = true != ((dkdw) ffbrVar2.b()).H() ? 0 : 2;
            ArrayList arrayList = new ArrayList();
            dipg dipgVar2 = new dipg(context);
            Cursor query = dipgVar2.getReadableDatabase().query("not_yet_delivered_messages", null, null, null, null, null, "timestamp");
            if (query != null) {
                while (query.moveToNext()) {
                    try {
                        dipg dipgVar3 = dipgVar2;
                        arrayList.add(new UndeliveredMessage(query.getLong(query.getColumnIndex("timestamp")), query.getString(query.getColumnIndex("user_id")), query.getString(query.getColumnIndex("message_id"))));
                        dipgVar2 = dipgVar3;
                    } finally {
                        query.close();
                    }
                }
                dipgVar = dipgVar2;
                z = false;
            } else {
                dipgVar = dipgVar2;
                z = false;
            }
            dipgVar.close();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            String c = dkmi.c(djtwVar);
            File d2 = c != null ? dkmi.d(context, c) : null;
            if (d2 != null) {
                arrayList3.add(d2);
            }
            java.io.File fileStreamPath = context.getFileStreamPath("httpft_pending");
            if (fileStreamPath != null && fileStreamPath.exists() && (d = dkmi.d(context, "httpft_pending")) != null) {
                arrayList3.add(d);
            }
            String h = dkrxVar.h();
            boolean z2 = z;
            String j = dkrxVar.j();
            long c2 = dkrxVar.c();
            Object[] objArr = new Object[1];
            objArr[z2 ? 1 : 0] = i != 0 ? i != 1 ? "GRANTED (2)" : "NOT_REQUIRED (1)" : "NOT_GRANTED (0)";
            dkty.c("Building legacy data, consent value is %s", objArr);
            legacyData = new LegacyData(legacyToken, i, i2, arrayList2, arrayList, arrayList3, h, j, c2);
        } else {
            legacyData = null;
        }
        return new RcsState(a, legacyData);
    }

    @Override // com.google.android.ims.rcsmigration.IRcsStateProvider
    public RcsState getRcsState() {
        allowOrThrow();
        return buildRcsState();
    }

    @Override // com.google.android.ims.rcsmigration.IRcsStateProvider
    public void onMigrationComplete() {
        allowOrThrow();
        dkty.k("Migration complete.", new Object[0]);
        axnw.h(elfo.f(new Runnable() { // from class: ajns
            @Override // java.lang.Runnable
            public final void run() {
                RcsStateProvider.m252$r8$lambda$FWMxeGripR0_dMeQQlFKKAds0A(RcsStateProvider.this);
            }
        }, this.c));
    }
}
