package defpackage;

import android.content.Context;
import com.google.android.rcs.client.contacts.ContactsService;
import com.google.android.rcs.client.events.EventService;
import com.google.android.rcs.client.filetransfer.FileTransferService;
import com.google.android.rcs.client.ims.ImsConnectionTrackerService;
import com.google.android.rcs.client.lifecycle.RcsEngineLifecycleService;
import com.google.android.rcs.client.lifecycle.RcsEngineLifecycleServiceV2;
import com.google.android.rcs.client.locationsharing.LocationSharingService;
import com.google.android.rcs.client.messaging.RcsMessagingService;
import com.google.android.rcs.client.profile.RcsProfileService;
import com.google.android.rcs.client.provisioning.singleregistration.SingleRegistrationVendorImsService;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coku implements colj {
    private static final entd a = entd.c("BugleRcs");
    private final EventService b;
    private final ContactsService c;
    private final FileTransferService d;
    private final LocationSharingService e;
    private final ImsConnectionTrackerService f;
    private final RcsProfileService g;
    private final RcsMessagingService h;
    private final cokv i;
    private final csjk j;
    private final SingleRegistrationVendorImsService k;
    private final ctud l;

    public coku(Context context, ehxp ehxpVar, cokv cokvVar, csjk csjkVar, ffbr ffbrVar, ctud ctudVar, ffbr ffbrVar2) {
        elbx elbxVar = (elbx) ehxpVar.a.b();
        elbxVar.getClass();
        cfuu cfuuVar = (cfuu) ehxpVar.b.b();
        cfuuVar.getClass();
        ehxd ehxdVar = (ehxd) ehxpVar.c.b();
        ehxdVar.getClass();
        context.getClass();
        cokvVar.getClass();
        EventService eventService = new EventService(elbxVar, cfuuVar, ehxdVar, context, cokvVar);
        ContactsService contactsService = new ContactsService(context, cokvVar, Optional.of((ehxd) ffbrVar.b()));
        FileTransferService fileTransferService = new FileTransferService(context, cokvVar, Optional.of((ehxd) ffbrVar.b()));
        LocationSharingService locationSharingService = new LocationSharingService(context, cokvVar);
        ImsConnectionTrackerService imsConnectionTrackerService = new ImsConnectionTrackerService(context, cokvVar, Optional.of((ehxd) ffbrVar.b()));
        RcsProfileService rcsProfileService = new RcsProfileService(context, cokvVar, (cuaf) ffbrVar2.b());
        RcsMessagingService rcsMessagingService = new RcsMessagingService(context, cokvVar);
        new RcsEngineLifecycleService(context, cokvVar);
        SingleRegistrationVendorImsService singleRegistrationVendorImsService = new SingleRegistrationVendorImsService(context, cokvVar);
        new RcsEngineLifecycleServiceV2(context, cokvVar);
        Optional.of((ehxd) ffbrVar.b());
        this.i = cokvVar;
        this.j = csjkVar;
        this.l = ctudVar;
        this.b = eventService;
        this.c = contactsService;
        this.d = fileTransferService;
        this.e = locationSharingService;
        this.f = imsConnectionTrackerService;
        this.g = rcsProfileService;
        this.h = rcsMessagingService;
        this.k = singleRegistrationVendorImsService;
    }

    private final void p(ehxc ehxcVar) {
        if (ehxcVar.isConnected() || ((ckge) this.j.a()).d() != eqwf.BUGLE_LOADING_AVAILABILITY_IN_PROGRESS) {
            return;
        }
        ((ckge) this.j.a()).o(ckgb.NO_HINT);
    }

    @Override // defpackage.colj
    public final ContactsService a() {
        p(this.c);
        return this.c;
    }

    @Override // defpackage.colj
    public final EventService b() {
        p(this.b);
        return this.b;
    }

    @Override // defpackage.colj
    public final FileTransferService c() {
        p(this.d);
        return this.d;
    }

    @Override // defpackage.colj
    public final ImsConnectionTrackerService d() {
        p(this.f);
        return this.f;
    }

    @Override // defpackage.colj
    public final LocationSharingService e() {
        p(this.e);
        return this.e;
    }

    @Override // defpackage.colj
    public final eibx f() {
        p(this.h);
        return this.h;
    }

    @Override // defpackage.colj
    public final RcsMessagingService g() {
        p(this.h);
        return this.h;
    }

    @Override // defpackage.colj
    public final RcsProfileService h() {
        p(this.g);
        return this.g;
    }

    @Override // defpackage.colj
    public final BiFunction i() {
        return new BiFunction() { // from class: coks
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return new RcsEngineLifecycleService((Context) obj, (ehxi) obj2);
            }
        };
    }

    @Override // defpackage.colj
    public final BiFunction j() {
        return new BiFunction() { // from class: cokt
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return new RcsEngineLifecycleServiceV2((Context) obj, (ehxi) obj2);
            }
        };
    }

    @Override // defpackage.colj
    public final BiFunction k() {
        return new BiFunction() { // from class: cokq
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return new RcsMessagingService((Context) obj, (ehxi) obj2);
            }
        };
    }

    @Override // defpackage.colj
    public final BiFunction l() {
        return new BiFunction() { // from class: cokr
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return new SingleRegistrationVendorImsService((Context) obj, (ehxi) obj2);
            }
        };
    }

    @Override // defpackage.colj
    public final void m() {
        int i;
        if (!this.l.l()) {
            ensz enszVar = (ensz) a.j();
            enszVar.aa(ensy.FULL);
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/service/BugleRcsServiceFactory", "connect", 218, "BugleRcsServiceFactory.java")).q("Bugle is trying to connect to RCS without READ_PHONE_STATE permission.");
        }
        if (this.b.isConnected()) {
            i = 0;
        } else {
            this.b.connect();
            i = 1;
        }
        if (!this.c.isConnected()) {
            this.c.connect();
            i++;
        }
        if (!this.d.isConnected()) {
            this.d.connect();
            i++;
        }
        if (!this.e.isConnected()) {
            this.e.connect();
            i++;
        }
        if (!this.f.isConnected()) {
            this.f.connect();
            i++;
        }
        if (!this.g.isConnected()) {
            this.g.connect();
            i++;
        }
        if (!this.h.isConnected()) {
            this.h.connect();
            i++;
        }
        if (dizg.G() && !this.k.isConnected()) {
            this.k.connect();
            i++;
        }
        if (i > 0) {
            csjy.j("BugleRcs", "connecting to %d Rcs Services", Integer.valueOf(i));
        } else {
            csjy.l("BugleRcs", "RCS services already connected");
        }
    }

    @Override // defpackage.colj
    public final void n() {
        this.b.disconnect();
        this.c.disconnect();
        this.d.disconnect();
        this.e.disconnect();
        this.f.disconnect();
        this.g.disconnect();
        this.h.disconnect();
        if (dizg.G()) {
            this.k.disconnect();
        }
        csjy.n("BugleRcs", "disconnecting from all Rcs Services");
    }

    @Override // defpackage.colj
    public final void o(ehxi ehxiVar) {
        this.i.a(ehxiVar);
    }
}
