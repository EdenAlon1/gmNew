package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aazx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ RbmSuggestionData b;
    final /* synthetic */ abac c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aazx(RbmSuggestionData rbmSuggestionData, abac abacVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = rbmSuggestionData;
        this.c = abacVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aazx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x011b, code lost:
    
        if (r12 == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e7, code lost:
    
        if (r12 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (r12 != r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b7, code lost:
    
        if (r12 != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00df, code lost:
    
        if (r12 != r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fb  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aazx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aazx(this.b, this.c, ffguVar);
    }
}
