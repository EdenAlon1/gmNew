package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzya implements covl {
    public static final entd a = entd.c("BugleConversation");
    public final cozn b;
    public final caga c;
    public final bzyx d;
    public final errl e;
    public final djav f;
    public final ffbr g;
    public final ffbr h;
    private final avtw i;
    private final aolr j;
    private final errl k;

    public bzya(cozn coznVar, caga cagaVar, bzyx bzyxVar, avtw avtwVar, aolr aolrVar, djav djavVar, ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, errl errlVar2) {
        this.b = coznVar;
        this.c = cagaVar;
        this.d = bzyxVar;
        this.i = avtwVar;
        this.j = aolrVar;
        this.f = djavVar;
        this.g = ffbrVar;
        this.h = ffbrVar2;
        this.e = errlVar;
        this.k = errlVar2;
    }

    @Override // defpackage.covl
    public final elfl a(final MessageCoreData messageCoreData, avkl avklVar) {
        emxf.b(messageCoreData.cB(), "Location information message should not be encrypted");
        final LocationInformation c = cozn.c(messageCoreData);
        if (c == null) {
            throw new IllegalArgumentException("The messages has no location information attachment");
        }
        final engw z = this.j.z(avklVar);
        return elfo.h(new erog() { // from class: bzxx
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final bzya bzyaVar = bzya.this;
                LocationInformation locationInformation = c;
                MessageCoreData messageCoreData2 = messageCoreData;
                final bdhg E = messageCoreData2.E();
                final fayv aa = messageCoreData2.aa();
                String str = "";
                if (!messageCoreData2.cB()) {
                    cozn coznVar = bzyaVar.b;
                    bdhg E2 = messageCoreData2.E();
                    Optional k = ((djry) coznVar.f.b()).k(((djrk) coznVar.g.b()).a(messageCoreData2.w().d));
                    if (k.isEmpty()) {
                        ((ensz) ((ensz) cozn.a.i()).h("com/google/android/apps/messaging/shared/sms/UnencryptedLocationConverter", "getLocalPublicUserEntity", 165, "UnencryptedLocationConverter.java")).q("Rcs Configuration is null, setting localUserEntity in UnencryptedLocationConverter to empty.");
                    } else {
                        str = ((djtp) k.get()).m().w();
                    }
                    return elfo.e(new ChatMessage(ChatMessage.Type.LOCATION, coznVar.e.a(str, locationInformation), bdhg.e(E2)));
                }
                final awui w = messageCoreData2.w();
                Optional k2 = ((djry) bzyaVar.g.b()).k(((djrk) bzyaVar.h.b()).a(w.d));
                if (k2.isEmpty()) {
                    ((ensz) ((ensz) bzya.a.i()).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedLocationConverter", "getLocalPublicUserEntity", 162, "EncryptedLocationConverter.java")).q("Rcs Configuration is null, setting localUserEntity in EncryptedLocationConverter to empty.");
                } else {
                    str = ((djtp) k2.get()).m().w();
                }
                final engw engwVar = z;
                final byte[] a2 = bzyaVar.f.a(str, locationInformation);
                elfl e = elfo.e(w.d);
                final caga cagaVar = bzyaVar.c;
                cagaVar.getClass();
                return e.i(new eroh() { // from class: bzxv
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return caga.this.a((String) obj);
                    }
                }, bzyaVar.e).i(new eroh() { // from class: bzxw
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return bzya.this.d.b(a2, (String) obj, w, E, engwVar, "application/vnd.gsma.rcspushlocation+xml", false, eote.LOCATION, false, aa);
                    }
                }, bzyaVar.e);
            }
        }, this.e).h(new emwl() { // from class: bzxy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return avtw.a((ChatMessage) obj);
            }
        }, this.k).e(IllegalStateException.class, new emwl() { // from class: bzxz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = bzya.a;
                throw new cowg((IllegalStateException) obj);
            }
        }, this.k);
    }

    @Override // defpackage.covl
    public final boolean b(MessageCoreData messageCoreData) {
        return this.b.b(messageCoreData);
    }
}
