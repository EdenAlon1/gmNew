package com.google.android.ims.jibe.service.transportcontrol;

import com.google.android.ims.rcsservice.transportcontrol.ITransportControl;
import com.google.android.ims.rcsservice.transportcontrol.TransportControlServiceResult;
import com.google.android.ims.rcsservice.transportcontrol.TransportOptions;
import defpackage.dket;
import defpackage.dkpp;
import defpackage.dkty;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class TransportControlEngine extends ITransportControl.Stub {
    private final dket a;
    private final dkpp b;

    public TransportControlEngine(dket dketVar, dkpp dkppVar) {
        this.a = dketVar;
        this.b = dkppVar;
    }

    @Override // com.google.android.ims.rcsservice.transportcontrol.ITransportControl
    public TransportControlServiceResult useTransport(TransportOptions transportOptions) {
        int i = transportOptions.a;
        if (i == 0) {
            dkty.k("Received start RCS stack request from Bugle", new Object[0]);
            this.a.startRcsStack(this.b.b());
        } else {
            if (i != 1) {
                dkty.q("Unknown transport type: %d", Integer.valueOf(i));
                return new TransportControlServiceResult(12);
            }
            dkty.k("Received stop RCS stack request from Bugle", new Object[0]);
            this.a.stopRcsStack(this.b.b());
        }
        return new TransportControlServiceResult(0);
    }
}
