package defpackage;

import android.content.ContentValues;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cacb {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor");
    public final errl b;
    public final errl c;
    public final caen d;
    public final errl e;
    public final avkh f;
    public final avty g = new avty();
    public final ffbr h;
    public final ffbr i;
    public final aolr j;
    public final ffbr k;
    public final awor l;
    public final ffbr m;
    private final ffbr n;
    private final ffbr o;

    public cacb(errl errlVar, errl errlVar2, caen caenVar, ffbr ffbrVar, errl errlVar3, avkh avkhVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, aolr aolrVar, ffbr ffbrVar5, awor aworVar, ffbr ffbrVar6) {
        this.c = errlVar2;
        this.b = errlVar;
        this.d = caenVar;
        this.n = ffbrVar;
        this.e = errlVar3;
        this.f = avkhVar;
        this.h = ffbrVar2;
        this.i = ffbrVar3;
        this.o = ffbrVar4;
        this.l = aworVar;
        this.j = aolrVar;
        this.k = ffbrVar5;
        this.m = ffbrVar6;
    }

    public static String a(awui awuiVar, String str) {
        return awuiVar != null ? awuiVar.d : str;
    }

    public static boolean e(final ckep ckepVar, boolean z) {
        bwgr a2 = bwgw.a();
        a2.z("storeMessageInPendingIncomingMessages");
        a2.d(new Function() { // from class: cabz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwgv bwgvVar = (bwgv) obj;
                bwgvVar.d(((ckaz) ckep.this).a);
                return bwgvVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (a2.b().T()) {
            return false;
        }
        bwea bweaVar = new bwea();
        ckepVar.D(bweaVar);
        if (z) {
            bweaVar.k(byze.WAITING_IDENTITY_VERIFICATION);
        } else {
            bweaVar.k(byze.WAITING_PRIOR_MESSAGE);
        }
        bwdu a3 = bweaVar.a(new Supplier() { // from class: bwdw
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bwdv();
            }
        });
        final dtve b = bwgw.b();
        dtub.b(bwgw.b(), "pending_incoming_message_rcs_table", a3, new Function() { // from class: bwdp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.R("pending_incoming_message_rcs_table", (ContentValues) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bwdq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return true;
    }

    public final void b(ckep ckepVar, String str) {
        enru enruVar = a;
        ensk f = enruVar.f();
        f.Y(ente.a, "BugleEtouffee");
        enrr enrrVar = (enrr) f;
        enrrVar.Y(csux.E, str);
        ckaz ckazVar = (ckaz) ckepVar;
        enrrVar.Y(csux.f, ckazVar.a);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "performIdentityCheckInTheBackground", 155, "IdentityVerificationPendingMessageProcessor.java")).q("Performing identity check for pending messages.");
        if (!e(ckepVar, true)) {
            ensk h = enruVar.h();
            h.Y(ente.a, "BugleEtouffee");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "performIdentityCheckInTheBackground", 161, "IdentityVerificationPendingMessageProcessor.java")).q("Skip queuing. The message is already in the queue.");
        } else if (((Boolean) ((cfup) bzwd.y.get()).e()).booleanValue()) {
            d(this.j.b(ckazVar.b), str);
        } else {
            c(str);
        }
    }

    @Deprecated
    public final void c(String str) {
        ((cakz) this.o.b()).b(1);
        cevh cevhVar = (cevh) this.n.b();
        ezgr ezgrVar = (ezgr) ezgs.a.createBuilder();
        ezgrVar.copyOnWrite();
        ezgs ezgsVar = (ezgs) ezgrVar.instance;
        str.getClass();
        ezgsVar.b = 1 | ezgsVar.b;
        ezgsVar.c = str;
        eyfy build = ezgrVar.build();
        cetp cetpVar = new cetp();
        cetpVar.a = str;
        cevhVar.a(ceyr.h("IdentityVerificationPendingMessageHandler", build, cetpVar.a()));
    }

    public final void d(aoku aokuVar, String str) {
        ((cakz) this.o.b()).b(2);
        cevh cevhVar = (cevh) this.n.b();
        ezgr ezgrVar = (ezgr) ezgs.a.createBuilder();
        ezgrVar.copyOnWrite();
        ezgs ezgsVar = (ezgs) ezgrVar.instance;
        str.getClass();
        ezgsVar.b |= 1;
        ezgsVar.c = str;
        aora e = aolm.e(aokuVar);
        ezgrVar.copyOnWrite();
        ezgs ezgsVar2 = (ezgs) ezgrVar.instance;
        e.getClass();
        ezgsVar2.d = e;
        ezgsVar2.b |= 2;
        eyfy build = ezgrVar.build();
        cetp cetpVar = new cetp();
        cetpVar.a = aokuVar.o();
        cevhVar.a(ceyr.h("IdentityVerificationPendingMessageHandler", build, cetpVar.a()));
    }
}
