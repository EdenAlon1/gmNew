package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akwj extends dtrs {
    final /* synthetic */ akwk a;

    public akwj(akwk akwkVar) {
        this.a = akwkVar;
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void b(dtyq dtyqVar, dtuk dtukVar) {
        bseh bsehVar = (bseh) dtukVar.b();
        if (bsehVar != null) {
            akwk akwkVar = this.a;
            ConversationIdType C = bsehVar.C();
            if (C.b()) {
                return;
            }
            akwkVar.f(aliq.CONVERSATION_CREATED_EVENT, Optional.of(C.toString()));
            return;
        }
        final bsod bsodVar = (bsod) dtukVar.d();
        if (bsodVar != null) {
            final akwk akwkVar2 = this.a;
            bsodVar.m(new duao() { // from class: akwe
                @Override // defpackage.duao
                public final boolean a(duaw duawVar) {
                    if (duawVar instanceof dtrt) {
                        dtrt dtrtVar = (dtrt) duawVar;
                        if (dktk.a(dtrtVar.d, bsom.c.a.toString()) && dtrtVar.b == 1) {
                            bsod bsodVar2 = bsodVar;
                            if (bsodVar2.n("archive_status")) {
                                akwk.this.f(byyt.a(bsodVar2.a.getAsInteger("archive_status").intValue()).d() ? aliq.CONVERSATION_ARCHIVED_EVENT : aliq.CONVERSATION_UNARCHIVED_EVENT, Optional.of(dtrtVar.a));
                            }
                            return true;
                        }
                    }
                    return false;
                }
            });
        }
        bsof bsofVar = (bsof) dtukVar.e();
        if (bsofVar != null) {
            final akwk akwkVar3 = this.a;
            bsofVar.f(new duao() { // from class: akwa
                @Override // defpackage.duao
                public final boolean a(duaw duawVar) {
                    if (!(duawVar instanceof dtrt)) {
                        return false;
                    }
                    dtrt dtrtVar = (dtrt) duawVar;
                    if (!dktk.a(dtrtVar.d, bsom.c.a.toString()) || dtrtVar.b != 1) {
                        return false;
                    }
                    akwk.this.f(aliq.CONVERSATION_DELETED_EVENT, Optional.of(dtrtVar.a));
                    return true;
                }
            });
        }
    }
}
