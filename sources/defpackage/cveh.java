package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.gms.duokit.DuoId;
import com.google.android.gms.duokit.GetApiAvailabilityResponse;
import com.google.android.gms.duokit.SetupDuoRequest;
import com.google.android.gms.duokit.StartCallRequest;
import com.google.android.gms.duokit.StartGroupCreationFlowRequest;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cveh {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/video/DuoKitVideoCalling");
    private final errl b;
    private final dgea c;

    public cveh(errl errlVar, dgea dgeaVar) {
        this.b = errlVar;
        this.c = dgeaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(engw engwVar, int i) {
        final HashSet hashSet = new HashSet();
        int size = engwVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            hashSet.add(((ParticipantsTable.BindData) engwVar.get(i2)).S());
        }
        if (hashSet.isEmpty()) {
            return;
        }
        bvvr f = ParticipantsTable.f();
        f.ap("updateAvailabilityInDb");
        f.T(i);
        f.V(new Function() { // from class: cveg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                bvvwVar.m(hashSet);
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        f.b().e();
    }

    private static DuoId[] g(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aoku aokuVar = (aoku) it.next();
            cfva cfvaVar = aoqm.a;
            String p = aokuVar.p(((Boolean) new aopb().get()).booleanValue());
            if (emxe.c(p)) {
                ensk j = a.j();
                j.Y(ente.a, "Bugle");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/video/DuoKitVideoCalling", "duoIdsFromMessagingIdentities", 126, "DuoKitVideoCalling.java")).q("Fail to get destination from messagingIdentities.");
                return null;
            }
            DuoId duoId = new DuoId();
            duoId.b = p;
            dgdv.a(duoId);
            arrayList.add(duoId);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (DuoId[]) arrayList.toArray(new DuoId[0]);
    }

    final elfl a(aoku aokuVar) {
        cfva cfvaVar = aoqm.a;
        String p = aokuVar.p(((Boolean) new aopb().get()).booleanValue());
        if (p == null) {
            ensk j = a.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/video/DuoKitVideoCalling", "launchCall", 85, "DuoKitVideoCalling.java")).q("Fail to get destination from messageIdentity.");
            return elfo.e(false);
        }
        DuoId duoId = new DuoId();
        duoId.b = p;
        dgdv.a(duoId);
        StartCallRequest startCallRequest = new StartCallRequest();
        startCallRequest.a = duoId;
        startCallRequest.c = true;
        startCallRequest.d = cvfb.a.d;
        return elfl.g(duin.a(this.c.d(startCallRequest))).h(new emwl() { // from class: cvec
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return true;
            }
        }, erpp.a);
    }

    public final elfl b(List list) {
        DuoId[] g = g(list);
        if (g == null) {
            return elfo.e(false);
        }
        StartGroupCreationFlowRequest startGroupCreationFlowRequest = new StartGroupCreationFlowRequest();
        startGroupCreationFlowRequest.a = g;
        startGroupCreationFlowRequest.c = true;
        startGroupCreationFlowRequest.b = cvfb.a.d;
        return elfl.g(duin.a(this.c.e(startGroupCreationFlowRequest))).h(new emwl() { // from class: cvee
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return true;
            }
        }, erpp.a);
    }

    final elfl c() {
        int i = engw.d;
        return d(enou.a);
    }

    final elfl d(List list) {
        SetupDuoRequest setupDuoRequest = new SetupDuoRequest();
        DuoId[] g = g(list);
        if (g != null) {
            setupDuoRequest.a = g;
        }
        return elfl.g(duin.a(this.c.c(setupDuoRequest))).h(new emwl() { // from class: cved
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return true;
            }
        }, erpp.a);
    }

    final elfl e(final engw engwVar) {
        return engwVar.isEmpty() ? elfo.e(engwVar) : elfl.g(duin.a(this.c.f())).i(new eroh() { // from class: cvef
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                int i = ((GetApiAvailabilityResponse) obj).a;
                engw engwVar2 = engw.this;
                if (i == 0) {
                    return elfo.e(engwVar2);
                }
                if (i == 1 || i == 2) {
                    cveh.f(engwVar2, 8);
                    return elfo.e(new ArrayList());
                }
                cveh.f(engwVar2, 7);
                return elfo.e(new ArrayList());
            }
        }, this.b);
    }
}
