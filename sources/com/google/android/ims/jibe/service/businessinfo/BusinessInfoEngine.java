package com.google.android.ims.jibe.service.businessinfo;

import android.content.Context;
import android.os.Binder;
import com.google.android.ims.rcsservice.businessinfo.IBusinessInfo;
import defpackage.diib;
import defpackage.dkqd;
import defpackage.dkty;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BusinessInfoEngine extends IBusinessInfo.Stub {
    private final Context a;
    private final diib b;

    public BusinessInfoEngine(Context context, diib diibVar) {
        this.a = context;
        this.b = diibVar;
    }

    @Override // com.google.android.ims.rcsservice.businessinfo.IBusinessInfo
    public void retrieveBusinessInfo(String str) {
        dkqd.d(this.a, Binder.getCallingUid());
        dkty.c("Retrieving business information for: %s", dkty.a(str));
        this.b.g(str, null);
    }
}
