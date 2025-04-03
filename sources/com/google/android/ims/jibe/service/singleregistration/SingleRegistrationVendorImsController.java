package com.google.android.ims.jibe.service.singleregistration;

import android.telephony.ims.ImsException;
import com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController;
import com.google.android.ims.rcs.singleregistration.SingleRegistrationVendorImsServiceResult;
import defpackage.dium;
import defpackage.djqv;
import defpackage.djqw;
import defpackage.dkpm;
import defpackage.dkty;
import defpackage.eyul;
import defpackage.eywy;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class SingleRegistrationVendorImsController extends ISingleRegistrationVendorImsController.Stub {
    private final dkpm a;
    private final djqw b;
    private final Map c = new ConcurrentHashMap();

    public SingleRegistrationVendorImsController(dkpm dkpmVar, djqw djqwVar) {
        this.a = dkpmVar;
        this.b = djqwVar;
    }

    @Override // com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController
    public SingleRegistrationVendorImsServiceResult setupVendorIms(int i) {
        int code;
        Optional i2 = this.a.a.i(i);
        if (i2.isEmpty()) {
            dkty.q("[SR]: SimId was not found in SimInfoProvider for subId: %d", Integer.valueOf(i));
            return new SingleRegistrationVendorImsServiceResult(28);
        }
        Map map = this.c;
        Integer valueOf = Integer.valueOf(i);
        djqv djqvVar = (djqv) map.get(valueOf);
        Object obj = i2.get();
        if (djqvVar == null) {
            djqvVar = this.b.a((String) obj, i);
        }
        try {
            djqvVar.b(new dium(this.c, i, djqvVar));
            this.c.put(valueOf, djqvVar);
            dkty.k("[SR]: Vendor IMS was setup successfully for subId: %d", valueOf);
            return new SingleRegistrationVendorImsServiceResult(0);
        } catch (ImsException e) {
            dkty.i(e, "[SR]: Failed to setup Vendor IMS for subId: %d", Integer.valueOf(i));
            code = e.getCode();
            return new SingleRegistrationVendorImsServiceResult(30, eyul.b(code));
        } catch (SecurityException e2) {
            dkty.i(e2, "[SR]: Failed to setup Vendor IMS for subId: %d", Integer.valueOf(i));
            return new SingleRegistrationVendorImsServiceResult(30, eywy.FAILURE_REASON_SECURITY_EXCEPTION);
        }
    }

    @Override // com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController
    public SingleRegistrationVendorImsServiceResult terminateVendorIms(int i) {
        int code;
        Map map = this.c;
        Integer valueOf = Integer.valueOf(i);
        djqv djqvVar = (djqv) map.remove(valueOf);
        if (djqvVar != null) {
            try {
                djqvVar.a();
                dkty.k("[SR]: Vendor IMS was setup for subId: %d. Terminated the callback.", valueOf);
            } catch (ImsException e) {
                dkty.i(e, "[SR]: Failed to terminate Vendor IMS for subId: %d", Integer.valueOf(i));
                code = e.getCode();
                return new SingleRegistrationVendorImsServiceResult(30, eyul.b(code));
            } catch (SecurityException e2) {
                dkty.i(e2, "[SR]: Failed to terminate Vendor IMS for subId: %d", Integer.valueOf(i));
                return new SingleRegistrationVendorImsServiceResult(30, eywy.FAILURE_REASON_SECURITY_EXCEPTION);
            }
        } else {
            dkty.k("[SR]: Vendor IMS was not setup for subId: %d.", valueOf);
        }
        return new SingleRegistrationVendorImsServiceResult(0);
    }
}
