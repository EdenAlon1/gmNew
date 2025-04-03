package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cure extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ MessageIdType c;
    final /* synthetic */ curf d;
    final /* synthetic */ List e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cure(MessageIdType messageIdType, curf curfVar, List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = messageIdType;
        this.d = curfVar;
        this.e = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cure) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x014e, code lost:
    
        if (r0.b(r10, r18) == r9) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0178, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0089, code lost:
    
        if (r0 == r9) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0062, code lost:
    
        if (r0 != r9) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cure.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cure(this.c, this.d, this.e, ffguVar);
    }
}
