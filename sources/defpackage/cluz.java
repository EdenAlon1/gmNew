package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cluz extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ clva c;
    final /* synthetic */ ConversationIdType d;
    final /* synthetic */ Recipient e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cluz(clva clvaVar, ConversationIdType conversationIdType, Recipient recipient, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = clvaVar;
        this.d = conversationIdType;
        this.e = recipient;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cluz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b2, code lost:
    
        if (r11 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        if (r11 != r0) goto L20;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cluz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cluz(this.c, this.d, this.e, ffguVar);
    }
}
