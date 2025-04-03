package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.messaging.data.FileInformation;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diqt extends diqx {
    private final ditk c;
    private final FileInformation d;
    private final PendingIntent e;
    private final String f;

    public diqt(Context context, diqp diqpVar, ditk ditkVar, FileInformation fileInformation, PendingIntent pendingIntent, String str) {
        super(context, diqpVar);
        this.c = ditkVar;
        this.d = fileInformation;
        this.e = pendingIntent;
        this.f = str;
    }

    @Override // defpackage.diqx
    protected final String a() {
        return this.f;
    }

    @Override // defpackage.diuc
    public final void b(byte[] bArr, Uri uri) {
        dkty.c("HTTP file transfer download successful for download ID %s", this.f);
        final ditb ditbVar = new ditb();
        ditbVar.f(this.d.a());
        ditbVar.h(this.d.i());
        ditbVar.c(this.d.b().toString());
        ditbVar.i("temporary id until the TODO is done");
        this.d.h().ifPresent(new Consumer() { // from class: diqs
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                diti.this.e((String) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        if (!Uri.EMPTY.equals(uri)) {
            ditbVar.d(uri);
        } else if (bArr.length > 0) {
            ditbVar.l(bArr);
            ditbVar.k(this.d.b().toString());
        }
        Bundle a = this.c.a(ditbVar.a());
        Optional g = this.d.g();
        Intent putExtras = new Intent((g.isEmpty() || eifj.FILE.equals(g.get())) ? RcsIntents.ACTION_INCOMING_FILE_TRANSFER_COMPLETED : RcsIntents.ACTION_INCOMING_FILE_TRANSFER_PREVIEW_UPDATE).putExtras(a);
        try {
            dkqd.c(this.a, putExtras);
            this.e.send(this.a, 0, putExtras);
        } catch (Exception e) {
            dkty.i(e, "Callback intent canceled for downloadFile. download ID: %s", this.f);
        }
        this.b.o(this.f);
    }
}
