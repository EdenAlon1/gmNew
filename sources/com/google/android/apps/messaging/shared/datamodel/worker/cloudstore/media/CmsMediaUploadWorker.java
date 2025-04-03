package com.google.android.apps.messaging.shared.datamodel.worker.cloudstore.media;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.datamodel.worker.cloudstore.media.CmsMediaUploadWorker;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.baan;
import defpackage.babm;
import defpackage.cdoy;
import defpackage.ekhw;
import defpackage.emwl;
import defpackage.eroh;
import defpackage.erpp;
import defpackage.errl;
import defpackage.pon;
import defpackage.pot;
import defpackage.ppr;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class CmsMediaUploadWorker extends ppr {
    public final Context e;
    public final errl f;
    private final babm g;
    private final errl h;

    /* compiled from: PG */
    public interface a {
        cdoy cc();
    }

    /* compiled from: PG */
    public interface b {
        Context P();

        babm aJ();

        errl p();

        errl q();
    }

    public CmsMediaUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        b bVar = (b) ekhw.a(context, b.class);
        this.g = bVar.aJ();
        this.e = bVar.P();
        this.h = bVar.p();
        this.f = bVar.q();
    }

    @Override // defpackage.ppr
    public final ListenableFuture b() {
        pot f = f();
        pon ponVar = new pon();
        ponVar.b(f);
        ponVar.g("attempt_count_key", e());
        final pot a2 = ponVar.a();
        return this.g.b(f.a("account_id_key", -1)).i(new eroh() { // from class: cdob
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                CmsMediaUploadWorker cmsMediaUploadWorker = CmsMediaUploadWorker.this;
                return ((CmsMediaUploadWorker.a) ekhv.a(cmsMediaUploadWorker.e, CmsMediaUploadWorker.a.class, (eisx) obj)).cc().a(a2).h(new emwl() { // from class: cdod
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return ((cdnc) obj2).a;
                    }
                }, cmsMediaUploadWorker.f);
            }
        }, this.h).e(baan.class, new emwl() { // from class: cdoc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return new ppn();
            }
        }, erpp.a);
    }
}
