package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cusl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cusm b;
    final /* synthetic */ MessageIdType c;
    final /* synthetic */ cukx d;
    final /* synthetic */ int e;
    Object f;
    Object g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cusl(ffgu ffguVar, cusm cusmVar, MessageIdType messageIdType, cukx cukxVar, int i) {
        super(2, ffguVar);
        this.b = cusmVar;
        this.c = messageIdType;
        this.d = cukxVar;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cusl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a4, code lost:
    
        if (r2 == r0) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0225  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cusl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cusl cuslVar = new cusl(ffguVar, this.b, this.c, this.d, this.e);
        cuslVar.h = obj;
        return cuslVar;
    }
}
