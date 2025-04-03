package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.SendMessageRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djik implements erqj {
    public final entd a = entd.c(dktl.a);
    private final SendMessageRequest b;
    private final Context c;
    private final ffbr d;
    private final errl e;
    private final dikx f;
    private final eima g;
    private final eing h;
    private final djfx i;
    private final eine j;

    public djik(SendMessageRequest sendMessageRequest, Context context, eima eimaVar, eing eingVar, ffbr ffbrVar, errl errlVar, dikx dikxVar, djfx djfxVar, eine eineVar) {
        this.b = sendMessageRequest;
        this.c = context;
        this.g = eimaVar;
        this.h = eingVar;
        this.d = ffbrVar;
        this.e = errlVar;
        this.f = dikxVar;
        this.i = djfxVar;
        this.j = eineVar;
    }

    private final void c(MessagingOperationResult messagingOperationResult) {
        if (!this.b.i().isPresent()) {
            d(messagingOperationResult);
            return;
        }
        clsc clscVar = (clsc) clsd.a.createBuilder();
        clns clnsVar = (clns) this.g.m().fP(this.b.b());
        clscVar.copyOnWrite();
        clsd clsdVar = (clsd) clscVar.instance;
        clnsVar.getClass();
        clsdVar.g = clnsVar;
        clsdVar.b |= 16;
        clqc a = this.b.g().equals(eigz.MESSAGING_METHOD_SLM) ? this.h.apply(messagingOperationResult.a()) : this.h.f(messagingOperationResult.a());
        clscVar.copyOnWrite();
        clsd clsdVar2 = (clsd) clscVar.instance;
        a.getClass();
        clsdVar2.e = a;
        clsdVar2.b |= 4;
        clqw clqwVar = (clqw) clqx.a.createBuilder();
        String h = this.b.c().h();
        clqwVar.copyOnWrite();
        clqx clqxVar = (clqx) clqwVar.instance;
        clqxVar.b |= 1;
        clqxVar.c = h;
        clscVar.copyOnWrite();
        clsd clsdVar3 = (clsd) clscVar.instance;
        clqx clqxVar2 = (clqx) clqwVar.build();
        clqxVar2.getClass();
        clsdVar3.f = clqxVar2;
        clsdVar3.b |= 8;
        boolean d = messagingOperationResult.d();
        clscVar.copyOnWrite();
        clsd clsdVar4 = (clsd) clscVar.instance;
        clsdVar4.b |= 32;
        clsdVar4.h = d;
        clsm clsmVar = (clsm) clsn.a.createBuilder();
        String a2 = this.b.h().a();
        clsmVar.copyOnWrite();
        clsn clsnVar = (clsn) clsmVar.instance;
        clsnVar.b |= 1;
        clsnVar.c = a2;
        clscVar.copyOnWrite();
        clsd clsdVar5 = (clsd) clscVar.instance;
        clsn clsnVar2 = (clsn) clsmVar.build();
        clsnVar2.getClass();
        clsdVar5.d = clsnVar2;
        clsdVar5.b |= 2;
        eydp eydpVar = (eydp) eydq.a.createBuilder();
        Object obj = this.b.i().get();
        eydpVar.copyOnWrite();
        ((eydq) eydpVar.instance).c = (eyee) obj;
        clscVar.copyOnWrite();
        clsd clsdVar6 = (clsd) clscVar.instance;
        eydq eydqVar = (eydq) eydpVar.build();
        eydqVar.getClass();
        clsdVar6.c = eydqVar;
        clsdVar6.b |= 1;
        clpy clpyVar = (clpy) this.j.m().fP(this.b.g());
        clscVar.copyOnWrite();
        clsd clsdVar7 = (clsd) clscVar.instance;
        clsdVar7.i = clpyVar.d;
        clsdVar7.b |= 64;
        clsd clsdVar8 = (clsd) clscVar.build();
        clpn clpnVar = (clpn) this.d.b();
        erqt.r(ffat.a(clpnVar.a.a(clpq.h(), clpnVar.b), clsdVar8), new djij(this, clsdVar8), this.e);
    }

    private final void d(MessagingOperationResult messagingOperationResult) {
        Intent intent = new Intent();
        try {
            Bundle extras = intent.getExtras();
            if (extras != null && extras.containsKey("MESSAGING_OPERATION_RESULT")) {
                throw new IllegalArgumentException("Intent extra already contains MESSAGING_OPERATION_RESULT key");
            }
            Parcel obtain = Parcel.obtain();
            messagingOperationResult.writeToParcel(obtain, 0);
            intent.putExtra("MESSAGING_OPERATION_RESULT", obtain.marshall());
            obtain.recycle();
            dkqd.c(this.c, intent);
            this.b.a().send(this.c, messagingOperationResult.a().b(), intent);
        } catch (PendingIntent.CanceledException e) {
            ((ensz) ((ensz) ((ensz) this.a.j()).g(e)).h("com/google/android/ims/messaging/v2/SendMessageOperationResultProcessor", "sendIntent", 151, "SendMessageOperationResultProcessor.java")).t("[%s] Callback intent canceled", messagingOperationResult.c());
        }
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        MessagingOperationResult messagingOperationResult = (MessagingOperationResult) obj;
        messagingOperationResult.getClass();
        String c = messagingOperationResult.c();
        ((ensz) ((ensz) this.a.h()).h("com/google/android/ims/messaging/v2/SendMessageOperationResultProcessor", "onSuccess", 80, "SendMessageOperationResultProcessor.java")).D("[%s] Messaging operation completed, %s", c, messagingOperationResult.a().e());
        c(messagingOperationResult);
        if (((Boolean) dikx.b.a()).booleanValue()) {
            this.f.e((fjay) this.i.fP(this.b.h()), c);
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ((ensz) ((ensz) ((ensz) this.a.j()).g(th)).h("com/google/android/ims/messaging/v2/SendMessageOperationResultProcessor", "onFailure", 93, "SendMessageOperationResultProcessor.java")).D("[%s] Messaging operation failed: %s", this.b.c().h(), th.getMessage());
        eibw d = MessagingResult.d();
        d.c(16);
        d.b(7);
        MessagingResult e = d.e();
        eibu e2 = MessagingOperationResult.e();
        e2.b(this.b.b());
        e2.d(this.b.c().h());
        e2.e(e);
        e2.c(false);
        c(e2.a());
        if (((Boolean) dikx.b.a()).booleanValue()) {
            this.f.d((fjay) this.i.fP(this.b.h()), this.b.c().h());
        }
    }
}
