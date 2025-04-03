package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahru extends ffhv implements ffjm {
    final /* synthetic */ ahrw a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ List c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahru(ffgu ffguVar, ahrw ahrwVar, ConversationIdType conversationIdType, List list) {
        super(2, ffguVar);
        this.a = ahrwVar;
        this.b = conversationIdType;
        this.c = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahru) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0182, code lost:
    
        r1 = (defpackage.enrr) defpackage.ahrw.a.g().h("com/google/android/apps/messaging/messageclassifications/ConversationClassificationPersisterImpl", "write", 142, "ConversationClassificationPersisterImpl.kt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0192, code lost:
    
        if (r6.b != 5) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0194, code lost:
    
        r2 = (defpackage.fbus) r6.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x019b, code lost:
    
        r2 = defpackage.fbur.b(r2.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a1, code lost:
    
        if (r2 != 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a3, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a4, code lost:
    
        r1.r("Skipping writing classification type %d because the conversation was started by the user.", defpackage.fbur.a(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0199, code lost:
    
        r2 = defpackage.fbus.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0155, code lost:
    
        r1 = (defpackage.enrr) defpackage.ahrw.a.g().h("com/google/android/apps/messaging/messageclassifications/ConversationClassificationPersisterImpl", "write", 156, "ConversationClassificationPersisterImpl.kt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0165, code lost:
    
        if (r6.b != 5) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0167, code lost:
    
        r2 = (defpackage.fbus) r6.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x016e, code lost:
    
        r2 = defpackage.fbur.b(r2.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0174, code lost:
    
        if (r2 != 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0176, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0177, code lost:
    
        r1.r("Skipping writing classification type %d because the type or score was not eligible.", defpackage.fbur.a(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x016c, code lost:
    
        r2 = defpackage.fbus.a;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahru.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ahru ahruVar = new ahru(ffguVar, this.a, this.b, this.c);
        ahruVar.d = obj;
        return ahruVar;
    }
}
