package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.NativeBaseCrypto;
import com.google.communication.synapse.security.scytale.Scope;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzxl implements bzqc, cije {
    public static final cskc a = cskc.g("BugleEtouffee", "EtouffeeStateMachine");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/E2eeStateMachine");
    public final akzt c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final errl g;
    public final errl h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private final fazb q;
    private final Object s = new Object();
    private final Map r = ennc.h(2);

    public bzxl(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, akzt akztVar, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, errl errlVar, errl errlVar2, fazb fazbVar) {
        this.l = ffbrVar;
        this.j = ffbrVar3;
        this.m = ffbrVar2;
        this.n = ffbrVar4;
        this.c = akztVar;
        this.d = ffbrVar5;
        this.o = ffbrVar6;
        this.p = ffbrVar7;
        this.e = ffbrVar8;
        this.k = ffbrVar9;
        this.f = ffbrVar10;
        this.g = errlVar;
        this.h = errlVar2;
        this.q = fazbVar;
        this.i = ffbrVar11;
    }

    public static epaa j(cama camaVar) {
        int ordinal = camaVar.ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? epaa.UNKNOWN_PROVISIONING_STATE : epaa.NOT_PROVISIONED_BUT_INITIALIZED : epaa.NOT_PROVISIONED : epaa.PROVISIONED;
    }

    @Override // defpackage.bzqc
    public final elfl a(String str) {
        return i(str);
    }

    @Override // defpackage.bzqc
    public final elfl b(String str, final long j) {
        a.p("Deleting old data if any.");
        this.q.b();
        final Scope create = Scope.create(((cafi) this.p.b()).b());
        return ((bzvx) this.n.b()).a(str).h(new emwl() { // from class: bzxh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((NativeBaseCrypto) obj).deleteOldOneTimeKeys(Scope.this, j);
            }
        }, this.h).h(new emwl() { // from class: bzxi
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Status status = (Status) obj;
                if (status.f()) {
                    return 0;
                }
                bzxl.this.c.c("Bugle.Etouffee.OtkCleanUp.FailureCount");
                throw new fedn(status);
            }
        }, erpp.a);
    }

    @Override // defpackage.bzqc
    public final elfl c(final String str) {
        a.p("Ensuring state machine consistency");
        return ((chbx) this.m.b()).d(str, 7).h(new emwl() { // from class: bzxe
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((chbu) obj).m();
            }
        }, this.g).i(new eroh() { // from class: bzxf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((chpy) obj).d();
            }
        }, this.g).i(new eroh() { // from class: bzxg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                choc chocVar = (choc) obj;
                return bzxl.this.k(str, chocVar, chocVar, 7);
            }
        }, this.g);
    }

    @Override // defpackage.bzqc
    public final elfl d(String str) {
        return !bzwd.a() ? elfo.e(epaa.DISABLED) : h(str).a().h(new emwl() { // from class: bzxj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return bzxl.j((cama) obj);
            }
        }, erpp.a);
    }

    @Override // defpackage.bzqc
    public final elfl e(String str) {
        return (TextUtils.isEmpty(str) || !bzwd.a()) ? elfo.e(false) : h(str).a().h(new emwl() { // from class: bzxd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(((cama) obj) == cama.PROVISIONED);
            }
        }, erpp.a);
    }

    @Override // defpackage.bzqc
    public final void f(String str) {
        ((cadx) this.o.b()).a(str);
    }

    @Override // defpackage.bzqc
    public final boolean g() {
        return bzwd.a();
    }

    public final camh h(String str) {
        camh camhVar;
        synchronized (this.s) {
            camhVar = (camh) this.r.get(str);
            if (camhVar == null) {
                comy comyVar = (comy) ((cami) this.l.b()).a.b();
                comyVar.getClass();
                str.getClass();
                camh camhVar2 = new camh(comyVar, str);
                this.r.put(str, camhVar2);
                camhVar = camhVar2;
            }
        }
        return camhVar;
    }

    public final elfl i(String str) {
        return ((bzvx) this.n.b()).c(str);
    }

    public final elfl k(final String str, final choc chocVar, final choc chocVar2, final int i) {
        csjb c = a.c();
        c.I("onRegistrationUpdate from Tachyon");
        c.A("previousState", chocVar.name());
        c.A("newState", chocVar2.name());
        c.A("reason", i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? "STARTUP_ENSURE_CONSISTENCY" : "TACHYON_UPDATE_DEBUG" : "TACHYON_UPDATE_REFRESH" : "TACHYON_UPDATE_REGISTER_VERIFY" : "TACHYON_UPDATE_REGISTER" : "TACHYON_UPDATE_RESET");
        c.r();
        final cama camaVar = chocVar2 == choc.REGISTERED_WITH_PREKEYS ? bzwd.a() ? cama.PROVISIONED : cama.NOT_PROVISIONED_BUT_INITIALIZED : cama.NOT_PROVISIONED;
        return h(str).a().i(new eroh() { // from class: bzwz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final cama camaVar2 = (cama) obj;
                csjb c2 = bzxl.a.c();
                c2.I("E2EE provisioning state update");
                c2.A("Previous Etouffee status", camaVar2.name());
                final cama camaVar3 = camaVar;
                c2.A("New Etouffee status", camaVar3.name());
                c2.r();
                if (camaVar2 == camaVar3) {
                    return elfo.e(camaVar2);
                }
                bzxl bzxlVar = bzxl.this;
                if (camaVar3 == cama.PROVISIONED) {
                    bzxlVar.c.c("Bugle.etouffee.provision.success");
                }
                epaa j = bzxl.j(camaVar2);
                epaa j2 = bzxl.j(camaVar3);
                if (j != j2) {
                    int i2 = i;
                    choc chocVar3 = chocVar2;
                    choc chocVar4 = chocVar;
                    eolu eoluVar = (eolu) eolv.a.createBuilder();
                    eolt eoltVar = eolt.BUGLE_E2EE_STATE_TRANSITION;
                    eoluVar.copyOnWrite();
                    eolv eolvVar = (eolv) eoluVar.instance;
                    eolvVar.j = eoltVar.dk;
                    eolvVar.b |= 1;
                    eozv eozvVar = (eozv) eozx.a.createBuilder();
                    eozvVar.copyOnWrite();
                    eozx eozxVar = (eozx) eozvVar.instance;
                    eozxVar.c = j.f;
                    eozxVar.b |= 1;
                    eozvVar.copyOnWrite();
                    eozx eozxVar2 = (eozx) eozvVar.instance;
                    eozxVar2.d = j2.f;
                    eozxVar2.b |= 2;
                    epae l = chpy.l(chocVar4);
                    eozvVar.copyOnWrite();
                    eozx eozxVar3 = (eozx) eozvVar.instance;
                    eozxVar3.f = l.e;
                    eozxVar3.b |= 8;
                    epae l2 = chpy.l(chocVar3);
                    eozvVar.copyOnWrite();
                    eozx eozxVar4 = (eozx) eozvVar.instance;
                    eozxVar4.g = l2.e;
                    eozxVar4.b |= 16;
                    eozvVar.copyOnWrite();
                    eozx eozxVar5 = (eozx) eozvVar.instance;
                    eozxVar5.e = i2 - 1;
                    eozxVar5.b |= 4;
                    eozx eozxVar6 = (eozx) eozvVar.build();
                    eoluVar.copyOnWrite();
                    eolv eolvVar2 = (eolv) eoluVar.instance;
                    eozxVar6.getClass();
                    eolvVar2.V = eozxVar6;
                    eolvVar2.c |= 524288;
                    ((akxl) bzxlVar.d.b()).j(eoluVar);
                }
                camh h = bzxlVar.h(str);
                csjb c3 = camh.a.c();
                c3.I("Setting Etouffee provisioning status set");
                c3.A("state", camaVar3.name());
                c3.r();
                return h.b.j(new emwl() { // from class: camd
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        calz calzVar = (calz) ((camb) obj2).toBuilder();
                        calzVar.copyOnWrite();
                        ((camb) calzVar.instance).b = cama.this.a();
                        return (camb) calzVar.build();
                    }
                }).h(new emwl() { // from class: came
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return null;
                    }
                }, erpp.a).h(new emwl() { // from class: bzww
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return cama.this;
                    }
                }, erpp.a);
            }
        }, erpp.a).i(new eroh() { // from class: bzxa
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final bzxl bzxlVar = bzxl.this;
                final String str2 = str;
                final cama camaVar2 = camaVar;
                final cama camaVar3 = (cama) obj;
                return ((camaVar3 == null || !((camaVar3 == cama.PROVISIONED || camaVar3 == cama.NOT_PROVISIONED_BUT_INITIALIZED) && camaVar2 == cama.NOT_PROVISIONED)) ? (camaVar3 != null && camaVar3 == cama.NOT_PROVISIONED && camaVar2 == cama.PROVISIONED) ? elfo.f(new Runnable() { // from class: bzwx
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        bzxl bzxlVar2 = bzxl.this;
                        awui c2 = ((avkc) bzxlVar2.k.b()).c(str2);
                        engw c3 = ((bzqb) bzxlVar2.e.b()).c(((Integer) bzwd.C.e()).intValue());
                        csjb c4 = bzxl.a.c();
                        c4.I("E2EE provisioned. Restoring E2EE state in previously-E2EE conversations");
                        c4.A("conversations", c3);
                        c4.r();
                        int i2 = ((enou) c3).c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ConversationIdType conversationIdType = (ConversationIdType) c3.get(i3);
                            bzrb bzrbVar = (bzrb) bzrc.a.createBuilder();
                            String a2 = conversationIdType.a();
                            bzrbVar.copyOnWrite();
                            bzrc bzrcVar = (bzrc) bzrbVar.instance;
                            a2.getClass();
                            bzrcVar.b = a2;
                            bzrbVar.a(c2);
                            String str3 = conversationIdType.a() + "#" + c2.hashCode();
                            bzrd bzrdVar = (bzrd) bzxlVar2.f.b();
                            bzrc bzrcVar2 = (bzrc) bzrbVar.build();
                            cetp cetpVar = new cetp();
                            cetpVar.b = str3;
                            ((cevh) bzrdVar.a.b()).a(ceyr.h("update_conversation_encryption_status", bzrcVar2, cetpVar.a()));
                        }
                    }
                }, bzxlVar.h) : elfo.e(null) : bzxlVar.i(str2).i(new eroh() { // from class: bzxk
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        final bzxl bzxlVar2 = bzxl.this;
                        final String str3 = str2;
                        return elfo.g(new Callable() { // from class: bzxc
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                bzxl bzxlVar3 = bzxl.this;
                                aztg c2 = ((ckam) bzxlVar3.j.b()).c(((avkc) bzxlVar3.k.b()).c(str3));
                                if (c2 == null) {
                                    ensk j = bzxl.b.j();
                                    j.Y(ente.a, "BugleEtouffee");
                                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/E2eeStateMachine", "disableConversationE2eeIfNeeded", 282, "E2eeStateMachine.java")).q("Skip disabling E2EE in conversations, subscription is null.");
                                    return null;
                                }
                                ffbr ffbrVar = bzxlVar3.e;
                                ((bzqb) ffbrVar.b()).g(c2.g());
                                return null;
                            }
                        }, bzxlVar2.h);
                    }
                }, bzxlVar.h)).i(new eroh() { // from class: bzwy
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        cama camaVar4 = cama.PROVISIONED;
                        boolean z = camaVar4 == camaVar3;
                        boolean z2 = camaVar4 == camaVar2;
                        if (z == z2) {
                            return elfo.e(null);
                        }
                        bzxl bzxlVar2 = bzxl.this;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((Set) bzxlVar2.i.b()).iterator();
                        while (it.hasNext()) {
                            arrayList.add(((bzpy) it.next()).a(str2, z2));
                        }
                        return elfo.j(arrayList).a(new Callable() { // from class: bzxb
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return null;
                            }
                        }, erpp.a);
                    }
                }, bzxlVar.g);
            }
        }, this.g);
    }

    @Override // defpackage.cije
    public final elfl l(String str, choc chocVar, choc chocVar2, int i) {
        int i2 = i - 1;
        int i3 = 2;
        if (i2 != 1) {
            if (i2 != 2) {
                i3 = 4;
                if (i2 != 3) {
                    i3 = i2 != 4 ? 6 : 5;
                }
            } else {
                i3 = 3;
            }
        }
        return k(str, chocVar2, chocVar, i3);
    }
}
