package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apbl implements aotm {
    private final ffsk a;
    private final ffbr b;
    private final ffbr c;
    private final aoye d;
    private final ffbr e;

    public apbl(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, aoye aoyeVar, ffbr ffbrVar3) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        aoyeVar.getClass();
        ffbrVar3.getClass();
        this.a = ffskVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = aoyeVar;
        this.e = ffbrVar3;
    }

    @Override // defpackage.aotm
    public final aotl a(BugleConversationId bugleConversationId, aqge aqgeVar, aqge aqgeVar2, aqge aqgeVar3, aorw aorwVar, boolean z, boolean z2) {
        aqgeVar.getClass();
        aqgeVar2.getClass();
        aqgeVar3.getClass();
        return new apbk(this.a, this.e, this.b, this.c, this.d.a(bugleConversationId, aqgeVar, aqgeVar2, aqgeVar3, aorwVar, z, z2));
    }
}
