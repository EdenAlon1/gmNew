package com.google.android.gms.people.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.internal.IPeopleService;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.dfrc;
import defpackage.dfrd;
import defpackage.dfse;
import defpackage.dftp;
import defpackage.dfvs;
import defpackage.dfwc;
import defpackage.dhgc;
import defpackage.dhgi;
import defpackage.dhiu;
import defpackage.dhiv;
import defpackage.dhja;
import defpackage.dhjg;
import defpackage.dhju;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PeopleClientImpl extends dfwc {
    private static volatile Bundle x;
    private static volatile Bundle y;
    public final String a;
    public final String v;
    public final Context w;
    private final HashMap z;

    /* compiled from: PG */
    public static final class OnDataChangedBinderCallback extends AbstractPeopleCallbacks {
        private final dftp a;

        public OnDataChangedBinderCallback(dftp<dhgi> dftpVar) {
            this.a = dftpVar;
        }

        @Override // com.google.android.gms.people.internal.AbstractPeopleCallbacks, com.google.android.gms.people.internal.IPeopleCallbacks
        public void onBundleLoaded(int i, Bundle bundle, Bundle bundle2) {
            if (i != 0) {
                if (Log.isLoggable("PeopleClient", 5)) {
                    Log.w("PeopleClient", "Non-success data changed callback received.");
                }
            } else {
                dftp dftpVar = this.a;
                bundle2.getString("account");
                bundle2.getString("pagegaiaid");
                bundle2.getInt("scope");
                dftpVar.b(new dhiu());
            }
        }

        public void release() {
            this.a.a();
        }
    }

    public PeopleClientImpl(Context context, Looper looper, dfrc dfrcVar, dfrd dfrdVar, String str, dfvs dfvsVar) {
        super(context.getApplicationContext(), looper, 5, dfvsVar, dfrcVar, dfrdVar);
        this.z = new HashMap();
        this.w = context;
        this.a = str;
        this.v = dfvsVar.e;
    }

    public static /* bridge */ /* synthetic */ Status O(int i, Bundle bundle) {
        return new Status(i, null, bundle == null ? null : (PendingIntent) bundle.getParcelable(RcsIntents.EXTRA_PENDING_INTENT));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final void C(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0) {
            i = 0;
            if (bundle != null) {
                N(bundle.getBundle("post_init_configuration"));
            }
        }
        super.C(i, iBinder, bundle == null ? null : bundle.getBundle("post_init_resolution"), i2);
    }

    public final IPeopleService M() {
        return (IPeopleService) super.w();
    }

    public final synchronized void N(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        dhja.a = bundle.getBoolean("use_contactables_api", true);
        dhju.a.b(bundle.getStringArray("config.url_uncompress.patterns"), bundle.getStringArray("config.url_uncompress.replacements"));
        x = bundle.getBundle("config.email_type_map");
        y = bundle.getBundle("config.phone_type_map");
    }

    public final void P(dfse dfseVar, int i) {
        super.B();
        dhiv dhivVar = new dhiv(dfseVar);
        try {
            M().loadOwners(dhivVar, false, false, null, null, i, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
        } catch (RemoteException unused) {
            dhivVar.onDataHolderLoaded(8, null, null);
        }
    }

    @Override // defpackage.dfwc, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dfqr
    public final int a() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IPeopleService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.people.internal.IPeopleService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.people.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putString("social_client_application_id", this.a);
        bundle.putString("real_client_package_name", this.v);
        bundle.putBoolean("support_new_image_callback", true);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gK() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] gL() {
        return dhgc.A;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.dfqr
    public final void m() {
        synchronized (this.z) {
            if (p()) {
                for (OnDataChangedBinderCallback onDataChangedBinderCallback : this.z.values()) {
                    onDataChangedBinderCallback.release();
                    try {
                        M().registerDataChangedListener(onDataChangedBinderCallback, false, null, null, 0, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
                    } catch (RemoteException e) {
                        dhjg.a("Failed to unregister listener", e);
                    } catch (IllegalStateException e2) {
                        dhjg.a("PeopleService is in unexpected state", e2);
                    }
                }
            }
            this.z.clear();
        }
        super.m();
    }
}
