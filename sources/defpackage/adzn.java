package defpackage;

import android.view.ActionMode;
import android.view.View;
import com.google.android.apps.messaging.home.ArchivedActivity;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adzn extends adzo implements aeac, eivv {
    public final ArchivedActivity a;
    public final ffbr b;
    public final ffbr c;
    public final ddwp d;
    private final ffbr f;
    private final ffbr g;

    public adzn(ArchivedActivity archivedActivity, ddwp ddwpVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.a = archivedActivity;
        this.d = ddwpVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.b = ffbrVar4;
        this.c = ffbrVar5;
        eito eitoVar = (eito) ffbrVar.b();
        eitoVar.g(eiwz.g(archivedActivity));
        eitoVar.e(this);
    }

    @Override // defpackage.aeac
    public final Optional a() {
        return this.a.W();
    }

    @Override // defpackage.eivv
    public final void aa(eivt eivtVar) {
        adzp.a(this.a, eivtVar, "archived_fragment_tag", cgix.ARCHIVED);
    }

    @Override // defpackage.eivv
    public final void ac(eiup eiupVar) {
        ((adio) this.f.b()).a(eiupVar);
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
        ((aley) this.g.b()).b(this.a, 195359);
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
