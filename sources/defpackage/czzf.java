package defpackage;

import com.google.android.apps.messaging.ui.attachment.VCardAttachmentView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czzf extends wr implements crjb {
    public final bcrs s;
    public final bcyw t;
    final /* synthetic */ czzg u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czzf(czzg czzgVar, VCardAttachmentView vCardAttachmentView) {
        super(vCardAttachmentView);
        this.u = czzgVar;
        this.s = (bcrs) czzgVar.f.b();
        this.t = new czze(this);
    }

    @Override // defpackage.crjb
    public final void c(bcyw bcywVar) {
        ((czzo) this.u.g).l.b(this.s);
    }

    @Override // defpackage.crjb
    public final void d() {
    }
}
