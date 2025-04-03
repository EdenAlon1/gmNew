package com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreCallbacks;
import com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreService;
import com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.IStatusCallback;
import defpackage.dfqp;
import defpackage.dfqz;
import defpackage.dfra;
import defpackage.dfuf;
import defpackage.dfun;
import defpackage.dfup;
import defpackage.dhre;
import defpackage.dlkh;
import defpackage.dlkj;
import defpackage.dlkp;
import defpackage.ffcu;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class InternalSafetyCoreClient extends dfra implements dlkj {
    public InternalSafetyCoreClient(Context context) {
        super(context, dlkp.a, dfqp.q, dfqz.a);
    }

    @Override // defpackage.dlkj
    public final dhre a(final int i, final ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.getClass();
        dfun dfunVar = new dfun();
        dfunVar.a = new dfuf() { // from class: dlkn
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                final dhri dhriVar = (dhri) obj2;
                ((ISafetyCoreService) ((dlkq) obj).w()).classifyImageFileDescriptor(i, parcelFileDescriptor, new ISafetyCoreCallbacks.Stub() { // from class: com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.InternalSafetyCoreClient$classifyImageFileDescriptor$1$callback$1
                    @Override // com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreCallbacks
                    public void onClassificationResult(Status status, dlkh dlkhVar) {
                        status.getClass();
                        dfup.b(status, dlkhVar, dhriVar);
                    }
                });
            }
        };
        return i(dfunVar.a());
    }

    @Override // defpackage.dlkj
    public final dhre b(final int[] iArr) {
        dfun dfunVar = new dfun();
        dfunVar.a = new dfuf() { // from class: dlkm
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                final dhri dhriVar = (dhri) obj2;
                ((ISafetyCoreService) ((dlkq) obj).w()).prewarm(iArr, new IStatusCallback.Stub() { // from class: com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.InternalSafetyCoreClient$prewarm$1$callback$1
                    @Override // com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.IStatusCallback
                    public void onResult(Status status) {
                        status.getClass();
                        dfup.b(status, ffcu.a, dhriVar);
                    }
                });
            }
        };
        return i(dfunVar.a());
    }
}
