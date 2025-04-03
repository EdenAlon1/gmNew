package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.ConversationCode;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import com.google.communication.synapse.security.scytale.Scope;
import com.google.communication.synapse.security.scytale.UserDevice;
import com.google.media.webrtc.common.StatusOr;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cais implements ejxi {
    final /* synthetic */ awui a;
    final /* synthetic */ String b;
    final /* synthetic */ cait c;

    public cais(cait caitVar, awui awuiVar, String str) {
        this.a = awuiVar;
        this.b = str;
        this.c = caitVar;
    }

    @Override // defpackage.ejxi
    public final /* bridge */ /* synthetic */ ejuj a() {
        return new ejtz("identity_details_data_service_" + this.a.d + "_" + this.b);
    }

    @Override // defpackage.ejxi
    public final ListenableFuture b() {
        final cait caitVar = this.c;
        if (!caitVar.f.p()) {
            return elfo.e(Optional.empty());
        }
        final String str = this.b;
        awui awuiVar = this.a;
        final elfl i = elfo.g(new Callable() { // from class: caiq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cait caitVar2 = cait.this;
                ParticipantsTable.BindData b = ((bdrr) caitVar2.i.b()).b(str);
                if (b == null) {
                    return Optional.empty();
                }
                String U = b.U();
                return U == null ? Optional.empty() : Optional.ofNullable(((avkc) caitVar2.k.b()).a(U, false));
            }
        }, caitVar.d).i(new eroh() { // from class: caip
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Optional optional = (Optional) obj;
                if (!optional.isPresent()) {
                    return elfo.e(Optional.empty());
                }
                cait caitVar2 = cait.this;
                return caitVar2.j.b(((awui) optional.get()).d).h(new emwl() { // from class: caio
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        Optional optional2 = (Optional) obj2;
                        return optional2.isPresent() ? Optional.of(new UserDevice(((awui) Optional.this.get()).d, (String) optional2.get())) : Optional.empty();
                    }
                }, caitVar2.e);
            }
        }, caitVar.e);
        final elfl b = ((bzvx) caitVar.g.b()).b(awuiVar.d);
        final elfl e = elfo.e(awuiVar.d);
        return elfo.k(e, b, i).a(new Callable() { // from class: cair
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str2 = (String) erqt.q(e);
                NativeMessageEncryptorV2 nativeMessageEncryptorV2 = (NativeMessageEncryptorV2) erqt.q(b);
                Optional optional = (Optional) erqt.q(i);
                if (optional.isPresent()) {
                    cait caitVar2 = cait.this;
                    StatusOr<ConversationCode> conversationCode = nativeMessageEncryptorV2.getConversationCode(Scope.create(caitVar2.h.b()), str2, (UserDevice) optional.get());
                    if (conversationCode.hasValue) {
                        if (caitVar2.b.a()) {
                            String userId = ((UserDevice) optional.get()).getUserId();
                            bzrn bzrnVar = caitVar2.c;
                            bzsf bzsfVar = (bzsf) bzsg.a.createBuilder();
                            bzsfVar.copyOnWrite();
                            bzsg bzsgVar = (bzsg) bzsfVar.instance;
                            userId.getClass();
                            bzsgVar.c = userId;
                            bzrnVar.a((bzsg) bzsfVar.build());
                        }
                        return Optional.of(conversationCode.value.getPrintableCode());
                    }
                    csjb e2 = cait.a.e();
                    e2.I("scytale getConversationCode status not ok");
                    e2.A("Status", conversationCode.status);
                    e2.r();
                }
                return Optional.empty();
            }
        }, caitVar.d);
    }
}
