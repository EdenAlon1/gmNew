package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awdu implements awcz {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsWithCache");
    private final awdt b;
    private final awfu c;
    private final ConcurrentHashMap d;
    private final ConcurrentHashMap e;
    private final ConcurrentHashMap f;

    public awdu(awdt awdtVar, ffsk ffskVar, awfu awfuVar) {
        ffskVar.getClass();
        this.b = awdtVar;
        this.c = awfuVar;
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    @Override // defpackage.awcz
    public final awcx a(awbs awbsVar) {
        awbsVar.getClass();
        return this.b.a(awbsVar);
    }

    @Override // defpackage.awcz
    public final awvd b(awap awapVar) {
        awvd awvdVar = (awvd) this.d.get(awapVar);
        if (awvdVar == null) {
            ensk j = a.j();
            j.Y(ente.a, "BugleFileTransfer");
            enrr enrrVar = (enrr) j;
            enrrVar.Y(cqpo.j, awapVar);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsWithCache", "getHttpRequestResult", 78, "FileProcessingDatabaseOperationsWithCache.kt")).q("No cached file upload response.");
            return this.b.b(awapVar);
        }
        if (this.c.a(awvdVar)) {
            return awvdVar;
        }
        ensk j2 = a.j();
        j2.Y(ente.a, "BugleFileTransfer");
        enrr enrrVar2 = (enrr) j2;
        enrrVar2.Y(cqpo.j, awapVar);
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsWithCache", "getHttpRequestResult", 87, "FileProcessingDatabaseOperationsWithCache.kt")).q("Cached file upload response is invalid.");
        return null;
    }

    @Override // defpackage.awcz
    public final awvd c(MessageIdType messageIdType) {
        messageIdType.getClass();
        return this.b.c(messageIdType);
    }

    @Override // defpackage.awcz
    public final fayi d(awap awapVar) {
        fayi fayiVar = (fayi) this.e.get(awapVar);
        return fayiVar == null ? this.b.d(awapVar) : fayiVar;
    }

    @Override // defpackage.awcz
    public final fayi e(awap awapVar) {
        fayi fayiVar = (fayi) this.f.get(awapVar);
        return fayiVar == null ? this.b.e(awapVar) : fayiVar;
    }

    @Override // defpackage.awcz
    public final Object f(awap awapVar, boolean z, ffgu ffguVar) {
        Object f = this.b.f(awapVar, z, ffguVar);
        return f == ffhh.a ? f : ffcu.a;
    }

    @Override // defpackage.awcz
    public final Object g(awap awapVar, ffgu ffguVar) {
        this.d.remove(awapVar);
        this.e.remove(awapVar);
        this.f.remove(awapVar);
        Object g = this.b.g(awapVar, ffguVar);
        return g == ffhh.a ? g : ffcu.a;
    }

    @Override // defpackage.awcz
    public final Object h(awap awapVar, ffgu ffguVar) {
        return this.b.h(awapVar, ffguVar);
    }

    @Override // defpackage.awcz
    public final Object i(awap awapVar, fayi fayiVar, ffgu ffguVar) {
        this.e.put(awapVar, fayiVar);
        Object i = this.b.i(awapVar, fayiVar, ffguVar);
        return i == ffhh.a ? i : ffcu.a;
    }

    @Override // defpackage.awcz
    public final Object j(awap awapVar, awvd awvdVar, ffgu ffguVar) {
        this.d.put(awapVar, awvdVar);
        Object j = this.b.j(awapVar, awvdVar, ffguVar);
        return j == ffhh.a ? j : ffcu.a;
    }

    @Override // defpackage.awcz
    public final Object k(awap awapVar, Uri uri, awup awupVar, ffgu ffguVar) {
        Object k = this.b.k(awapVar, uri, awupVar, ffguVar);
        return k == ffhh.a ? k : ffcu.a;
    }

    @Override // defpackage.awcz
    public final Object l(awap awapVar, fayi fayiVar, ffgu ffguVar) {
        this.f.put(awapVar, fayiVar);
        Object l = this.b.l(awapVar, fayiVar, ffguVar);
        return l == ffhh.a ? l : ffcu.a;
    }

    @Override // defpackage.awcz
    public final boolean m(MessageIdType messageIdType) {
        messageIdType.getClass();
        return this.b.m(messageIdType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.awcz
    public final boolean n(awap awapVar) {
        awvd awvdVar = (awvd) this.d.get(awapVar);
        return true == (awvdVar != null ? awvdVar.b & 1 : this.b.n(awapVar));
    }

    @Override // defpackage.awcz
    public final boolean o(awbs awbsVar, awvb awvbVar) {
        awbsVar.getClass();
        awvbVar.getClass();
        return this.b.o(awbsVar, awvbVar);
    }

    @Override // defpackage.awcz
    public final boolean p(awbs awbsVar, awbt awbtVar) {
        return this.b.p(awbsVar, awbtVar);
    }
}
