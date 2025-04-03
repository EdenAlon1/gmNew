package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbip {
    public final List a;
    public final List b;

    public bbip(bbin bbinVar, bbin bbinVar2, bbin bbinVar3, bbin bbinVar4, bbin bbinVar5, bbin bbinVar6, bbin bbinVar7, bbin bbinVar8, bbin bbinVar9, bbin bbinVar10, bbin bbinVar11, bbin bbinVar12, bbin bbinVar13, aucl auclVar) {
        List g;
        auclVar.getClass();
        this.a = ffdx.g(new bbiq(bbinVar, "myIdentities"), new bbiq(bbinVar2, "participants"), new bbiq(bbinVar3, "conversations"), new bbiq(bbinVar4, "conversation-participants"), new bbiq(bbinVar5, "messages"), new bbiq(bbinVar6, "parts"));
        if (auclVar.a()) {
            fffs fffsVar = new fffs((byte[]) null);
            fffsVar.add(new bbiq(bbinVar7, "metadata"));
            fffsVar.add(new bbiq(bbinVar8, "conversation-pins"));
            fffsVar.add(new bbiq(bbinVar10, "message-reactions"));
            fffsVar.add(new bbiq(bbinVar9, "message-replies"));
            fffsVar.add(new bbiq(bbinVar11, "message-stars"));
            fffsVar.add(new bbiq(bbinVar12, "link-previews"));
            fffsVar.add(new bbiq(bbinVar13, "message-captions"));
            g = ffdx.a(fffsVar);
        } else {
            g = ffdx.g(new bbiq(bbinVar7, "metadata"), new bbiq(bbinVar8, "conversation-pins"), new bbiq(bbinVar10, "message-reactions"), new bbiq(bbinVar9, "message-replies"), new bbiq(bbinVar11, "message-stars"), new bbiq(bbinVar12, "link-previews"));
        }
        this.b = g;
    }
}
