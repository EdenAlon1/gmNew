package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class curj extends ffhv implements ffjm {
    Object a;
    Object b;
    boolean c;
    int d;
    final /* synthetic */ MessageIdType e;
    final /* synthetic */ List f;
    final /* synthetic */ curl g;
    final /* synthetic */ ConversationIdType h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public curj(MessageIdType messageIdType, List list, curl curlVar, ConversationIdType conversationIdType, ffgu ffguVar) {
        super(2, ffguVar);
        this.e = messageIdType;
        this.f = list;
        this.g = curlVar;
        this.h = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((curj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0253, code lost:
    
        if (r1 != r9) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0369, code lost:
    
        if (r1.b(r18, r26) == r9) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02a9, code lost:
    
        if (r2.a(r3, r5, r1, r26) == r9) goto L146;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02bb  */
    /* JADX WARN: Type inference failed for: r0v14, types: [fbwv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.lang.Object] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.curj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new curj(this.e, this.f, this.g, this.h, ffguVar);
    }
}
