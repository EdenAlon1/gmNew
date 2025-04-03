package defpackage;

import android.view.ActionMode;
import android.view.View;
import com.google.android.apps.messaging.home.SpamFolderActivity;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aedu extends aedv implements aeac, eivv {
    public final SpamFolderActivity a;
    public final cins b;
    public final cubr c;
    public final ffbr d;
    public final ffbr e;
    public final ddwp f;
    private final ffbr h;
    private final ffbr i;

    public aedu(SpamFolderActivity spamFolderActivity, ddwp ddwpVar, cins cinsVar, cubr cubrVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, Optional optional, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        this.a = spamFolderActivity;
        this.f = ddwpVar;
        this.b = cinsVar;
        this.c = cubrVar;
        this.h = ffbrVar3;
        this.i = ffbrVar4;
        this.d = ffbrVar5;
        this.e = ffbrVar6;
        if (!adhu.a()) {
            eito eitoVar = (eito) ffbrVar.b();
            eiwy e = eiwz.e(spamFolderActivity);
            e.d(seu.class);
            eitoVar.e(this);
            eitoVar.g(e.a());
            optional.ifPresent(new Consumer() { // from class: aedt
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((ses) ((ffbr) obj).b()).a();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        eito eitoVar2 = (eito) ffbrVar.b();
        eiwy e2 = eiwz.e(spamFolderActivity);
        e2.d(ejgc.class);
        eitoVar2.e(new ejgb((ejgc) ffbrVar2.b()));
        e2.d(ejed.class);
        eitoVar2.e(this);
        eitoVar2.g(e2.a());
    }

    @Override // defpackage.aeac
    public final Optional a() {
        return this.a.W();
    }

    @Override // defpackage.eivv
    public final void aa(eivt eivtVar) {
        adzp.a(this.a, eivtVar, "spam_folder_fragment_tag", cgix.SPAM_FOLDER);
    }

    @Override // defpackage.eivv
    public final void ac(eiup eiupVar) {
        ((adio) this.h.b()).a(eiupVar);
    }

    @Override // defpackage.aeac
    public final void b() {
        this.a.X();
    }

    @Override // defpackage.aeac
    public final void c() {
        this.a.Z();
    }

    @Override // defpackage.eivv
    public final void d() {
        ((aley) this.i.b()).b(this.a, 195361);
    }

    @Override // defpackage.aeac
    public final /* synthetic */ void e(ConversationId conversationId, bcyl bcylVar, boolean z) {
        aeab.a(this, conversationId, bcylVar, z);
    }

    @Override // defpackage.aeac
    public final void h(ActionMode.Callback callback, View view, String str) {
        this.a.ab(callback, view, null);
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.aeac
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.aeac
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.aeac
    public final /* synthetic */ void f(ConversationId conversationId, MessageIdType messageIdType, bcyl bcylVar, boolean z) {
    }
}
