package com.google.android.apps.messaging.shared.util.block;

import android.content.Context;
import android.net.Uri;
import android.provider.BlockedNumberContract;
import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.util.block.BlockedNumbersJob;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ekhw;
import defpackage.elfo;
import defpackage.errl;
import defpackage.ffbr;
import defpackage.poh;
import defpackage.ppa;
import defpackage.ppr;
import defpackage.ppv;
import defpackage.ppw;
import defpackage.pqr;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class BlockedNumbersJob extends ppr {
    public final ffbr e;
    private final errl f;

    /* compiled from: PG */
    public interface a {
        errl eO();

        ffbr ge();
    }

    public BlockedNumbersJob(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) ekhw.a(context, a.class);
        this.f = aVar.eO();
        this.e = aVar.ge();
    }

    public static void c(Context context) {
        Uri uri;
        ppv ppvVar = new ppv(BlockedNumbersJob.class);
        poh pohVar = new poh();
        uri = BlockedNumberContract.BlockedNumbers.CONTENT_URI;
        pohVar.b(uri, true);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        pohVar.e = timeUnit.toMillis(0L);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        timeUnit2.getClass();
        pohVar.f = timeUnit2.toMillis(3L);
        ppvVar.g(pohVar.a());
        pqr.a(context).j("BlockedNumbersListenableWorker", ppa.REPLACE, (ppw) ppvVar.b()).a();
    }

    @Override // defpackage.ppr
    public final ListenableFuture b() {
        return elfo.g(new Callable() { // from class: crqm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Uri uri;
                BlockedNumbersJob blockedNumbersJob = BlockedNumbersJob.this;
                try {
                    Iterator it = blockedNumbersJob.b.d.a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String uri2 = ((Uri) it.next()).toString();
                        uri = BlockedNumberContract.BlockedNumbers.CONTENT_URI;
                        if (uri2.startsWith(uri.toString())) {
                            ((crqf) blockedNumbersJob.e.b()).d();
                            break;
                        }
                    }
                    return new ppp();
                } finally {
                    BlockedNumbersJob.c(blockedNumbersJob.a);
                }
            }
        }, this.f);
    }
}
